package com.google.crypto.tink.keyderivation.internal;

/* loaded from: classes9.dex */
public final class KeysetDeriverWrapper implements com.google.crypto.tink.internal.PrimitiveWrapper<com.google.crypto.tink.keyderivation.internal.KeyDeriver, com.google.crypto.tink.keyderivation.KeysetDeriver> {
    private static final com.google.crypto.tink.keyderivation.internal.KeysetDeriverWrapper WRAPPER = new com.google.crypto.tink.keyderivation.internal.KeysetDeriverWrapper();

    static class DeriverWithId {
        final com.google.crypto.tink.keyderivation.internal.KeyDeriver deriver;
        final int id;
        final boolean isPrimary;

        DeriverWithId(com.google.crypto.tink.keyderivation.internal.KeyDeriver keyDeriver, int i, boolean z) {
            this.deriver = keyDeriver;
            this.id = i;
            this.isPrimary = z;
        }
    }

    private static void validate(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface) throws java.security.GeneralSecurityException {
        if (keysetHandleInterface.getPrimary() == null) {
            throw new java.security.GeneralSecurityException("Primitive set has no primary.");
        }
    }

    @com.google.errorprone.annotations.Immutable
    static class WrappedKeysetDeriver implements com.google.crypto.tink.keyderivation.KeysetDeriver {
        private final java.util.List<com.google.crypto.tink.keyderivation.internal.KeysetDeriverWrapper.DeriverWithId> derivers;

        private WrappedKeysetDeriver(java.util.List<com.google.crypto.tink.keyderivation.internal.KeysetDeriverWrapper.DeriverWithId> list) {
            this.derivers = list;
        }

        private static com.google.crypto.tink.KeysetHandle.Builder.Entry deriveAndGetEntry(byte[] bArr, com.google.crypto.tink.keyderivation.internal.KeysetDeriverWrapper.DeriverWithId deriverWithId) throws java.security.GeneralSecurityException {
            if (deriverWithId.deriver == null) {
                throw new java.security.GeneralSecurityException("Primitive set has non-full primitives -- this is probably a bug");
            }
            com.google.crypto.tink.KeysetHandle.Builder.Entry importKey = com.google.crypto.tink.KeysetHandle.importKey(deriverWithId.deriver.deriveKey(bArr));
            importKey.withFixedId(deriverWithId.id);
            if (deriverWithId.isPrimary) {
                importKey.makePrimary();
            }
            return importKey;
        }

        @Override // com.google.crypto.tink.keyderivation.KeysetDeriver
        public com.google.crypto.tink.KeysetHandle deriveKeyset(byte[] bArr) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.KeysetHandle.Builder newBuilder = com.google.crypto.tink.KeysetHandle.newBuilder();
            java.util.Iterator<com.google.crypto.tink.keyderivation.internal.KeysetDeriverWrapper.DeriverWithId> it = this.derivers.iterator();
            while (it.hasNext()) {
                newBuilder.addEntry(deriveAndGetEntry(bArr, it.next()));
            }
            return newBuilder.build();
        }
    }

    KeysetDeriverWrapper() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public final com.google.crypto.tink.keyderivation.KeysetDeriver wrap(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations, com.google.crypto.tink.internal.PrimitiveWrapper.PrimitiveFactory<com.google.crypto.tink.keyderivation.internal.KeyDeriver> primitiveFactory) throws java.security.GeneralSecurityException {
        validate(keysetHandleInterface);
        java.util.ArrayList arrayList = new java.util.ArrayList(keysetHandleInterface.size());
        for (int i = 0; i < keysetHandleInterface.size(); i++) {
            com.google.crypto.tink.internal.KeysetHandleInterface.Entry at = keysetHandleInterface.getAt(i);
            if (at.getStatus().equals(com.google.crypto.tink.KeyStatus.ENABLED)) {
                arrayList.add(new com.google.crypto.tink.keyderivation.internal.KeysetDeriverWrapper.DeriverWithId(primitiveFactory.create(at), at.getId(), at.isPrimary()));
            }
        }
        return new com.google.crypto.tink.keyderivation.internal.KeysetDeriverWrapper.WrappedKeysetDeriver(arrayList);
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public final java.lang.Class<com.google.crypto.tink.keyderivation.KeysetDeriver> getPrimitiveClass() {
        return com.google.crypto.tink.keyderivation.KeysetDeriver.class;
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public final java.lang.Class<com.google.crypto.tink.keyderivation.internal.KeyDeriver> getInputPrimitiveClass() {
        return com.google.crypto.tink.keyderivation.internal.KeyDeriver.class;
    }

    public static void register() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveWrapper(WRAPPER);
    }
}
