package com.google.crypto.tink.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public final class PrefixMap<P> {
    private static final com.google.crypto.tink.util.Bytes EMPTY_BYTES = com.google.crypto.tink.util.Bytes.copyFrom(new byte[0]);
    private final java.util.Map<com.google.crypto.tink.util.Bytes, java.util.List<P>> entries;

    public static class Builder<P> {
        private final java.util.Map<com.google.crypto.tink.util.Bytes, java.util.List<P>> entries = new java.util.HashMap();

        public com.google.crypto.tink.internal.PrefixMap.Builder<P> put(com.google.crypto.tink.util.Bytes bytes, P p) throws java.security.GeneralSecurityException {
            java.util.List<P> list;
            if (bytes.size() != 0 && bytes.size() != 5) {
                throw new java.security.GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
            }
            if (this.entries.containsKey(bytes)) {
                list = this.entries.get(bytes);
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                this.entries.put(bytes, arrayList);
                list = arrayList;
            }
            list.add(p);
            return this;
        }

        public com.google.crypto.tink.internal.PrefixMap<P> build() {
            return new com.google.crypto.tink.internal.PrefixMap<>(this.entries);
        }
    }

    static class ConcatenatedIterator<P> implements java.util.Iterator<P> {
        private final java.util.Iterator<P> it0;
        private final java.util.Iterator<P> it1;

        private ConcatenatedIterator(java.util.Iterator<P> it, java.util.Iterator<P> it2) {
            this.it0 = it;
            this.it1 = it2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.it0.hasNext() || this.it1.hasNext();
        }

        @Override // java.util.Iterator
        public P next() {
            if (this.it0.hasNext()) {
                return this.it0.next();
            }
            return this.it1.next();
        }
    }

    public final java.lang.Iterable<P> getAllWithMatchingPrefix(byte[] bArr) {
        final java.util.List<P> list = this.entries.get(EMPTY_BYTES);
        final java.util.List<P> list2 = bArr.length >= 5 ? this.entries.get(com.google.crypto.tink.util.Bytes.copyFrom(bArr, 0, 5)) : null;
        if (list == null && list2 == null) {
            return new java.util.ArrayList();
        }
        return list == null ? list2 : list2 == null ? list : new java.lang.Iterable<P>() { // from class: com.google.crypto.tink.internal.PrefixMap.1
            @Override // java.lang.Iterable
            public java.util.Iterator<P> iterator() {
                return new com.google.crypto.tink.internal.PrefixMap.ConcatenatedIterator(list2.iterator(), list.iterator());
            }
        };
    }

    private PrefixMap(java.util.Map<com.google.crypto.tink.util.Bytes, java.util.List<P>> map) {
        this.entries = map;
    }
}
