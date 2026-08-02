package com.google.crypto.tink.mac;

/* loaded from: classes4.dex */
public class ChunkedMacWrapper implements com.google.crypto.tink.internal.PrimitiveWrapper<com.google.crypto.tink.mac.ChunkedMac, com.google.crypto.tink.mac.ChunkedMac> {
    private static final com.google.crypto.tink.mac.ChunkedMacWrapper WRAPPER = new com.google.crypto.tink.mac.ChunkedMacWrapper();

    private static com.google.crypto.tink.util.Bytes getOutputPrefix(com.google.crypto.tink.Key key) throws java.security.GeneralSecurityException {
        if (key instanceof com.google.crypto.tink.mac.MacKey) {
            return ((com.google.crypto.tink.mac.MacKey) key).getOutputPrefix();
        }
        if (key instanceof com.google.crypto.tink.internal.LegacyProtoKey) {
            return ((com.google.crypto.tink.internal.LegacyProtoKey) key).getOutputPrefix();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot get output prefix for key of class ");
        sb.append(key.getClass().getName());
        sb.append(" with parameters ");
        sb.append(key.getParameters());
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    /* loaded from: classes9.dex */
    static class WrappedChunkedMacVerification implements com.google.crypto.tink.mac.ChunkedMacVerification {
        private final java.util.List<com.google.crypto.tink.mac.ChunkedMacVerification> verifications;

        private WrappedChunkedMacVerification(java.util.List<com.google.crypto.tink.mac.ChunkedMacVerification> list) {
            this.verifications = list;
        }

        @Override // com.google.crypto.tink.mac.ChunkedMacVerification
        public void update(java.nio.ByteBuffer byteBuffer) throws java.security.GeneralSecurityException {
            java.nio.ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.mark();
            for (com.google.crypto.tink.mac.ChunkedMacVerification chunkedMacVerification : this.verifications) {
                duplicate.reset();
                chunkedMacVerification.update(duplicate);
            }
            byteBuffer.position(byteBuffer.limit());
        }

        @Override // com.google.crypto.tink.mac.ChunkedMacVerification
        public void verifyMac() throws java.security.GeneralSecurityException {
            java.security.GeneralSecurityException generalSecurityException = new java.security.GeneralSecurityException("MAC verification failed for all suitable keys in keyset");
            java.util.Iterator<com.google.crypto.tink.mac.ChunkedMacVerification> it = this.verifications.iterator();
            while (it.hasNext()) {
                try {
                    it.next().verifyMac();
                    return;
                } catch (java.security.GeneralSecurityException e) {
                    generalSecurityException.addSuppressed(e);
                }
            }
            throw generalSecurityException;
        }
    }

    @com.google.errorprone.annotations.Immutable
    static class WrappedChunkedMac implements com.google.crypto.tink.mac.ChunkedMac {
        private final com.google.crypto.tink.internal.PrefixMap<com.google.crypto.tink.mac.ChunkedMac> allChunkedMacs;
        private final com.google.crypto.tink.mac.ChunkedMac primaryChunkedMac;

        private WrappedChunkedMac(com.google.crypto.tink.internal.PrefixMap<com.google.crypto.tink.mac.ChunkedMac> prefixMap, com.google.crypto.tink.mac.ChunkedMac chunkedMac) {
            this.allChunkedMacs = prefixMap;
            this.primaryChunkedMac = chunkedMac;
        }

        @Override // com.google.crypto.tink.mac.ChunkedMac
        public com.google.crypto.tink.mac.ChunkedMacComputation createComputation() throws java.security.GeneralSecurityException {
            return this.primaryChunkedMac.createComputation();
        }

        @Override // com.google.crypto.tink.mac.ChunkedMac
        public com.google.crypto.tink.mac.ChunkedMacVerification createVerification(byte[] bArr) throws java.security.GeneralSecurityException {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<com.google.crypto.tink.mac.ChunkedMac> it = this.allChunkedMacs.getAllWithMatchingPrefix(bArr).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().createVerification(bArr));
            }
            return new com.google.crypto.tink.mac.ChunkedMacWrapper.WrappedChunkedMacVerification(arrayList);
        }
    }

    private ChunkedMacWrapper() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public com.google.crypto.tink.mac.ChunkedMac wrap(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations, com.google.crypto.tink.internal.PrimitiveWrapper.PrimitiveFactory<com.google.crypto.tink.mac.ChunkedMac> primitiveFactory) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.KeysetHandleInterface.Entry primary = keysetHandleInterface.getPrimary();
        if (primary == null) {
            throw new java.security.GeneralSecurityException("no primary in primitive set");
        }
        com.google.crypto.tink.internal.PrefixMap.Builder builder = new com.google.crypto.tink.internal.PrefixMap.Builder();
        for (int i = 0; i < keysetHandleInterface.size(); i++) {
            com.google.crypto.tink.internal.KeysetHandleInterface.Entry at = keysetHandleInterface.getAt(i);
            if (at.getStatus().equals(com.google.crypto.tink.KeyStatus.ENABLED)) {
                builder.put(getOutputPrefix(at.getKey()), primitiveFactory.create(at));
            }
        }
        return new com.google.crypto.tink.mac.ChunkedMacWrapper.WrappedChunkedMac(builder.build(), primitiveFactory.create(primary));
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.mac.ChunkedMac> getPrimitiveClass() {
        return com.google.crypto.tink.mac.ChunkedMac.class;
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.mac.ChunkedMac> getInputPrimitiveClass() {
        return com.google.crypto.tink.mac.ChunkedMac.class;
    }

    static void register() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveWrapper(WRAPPER);
    }

    public static void registerToInternalPrimitiveRegistry(com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder) throws java.security.GeneralSecurityException {
        builder.registerPrimitiveWrapper(WRAPPER);
    }
}
