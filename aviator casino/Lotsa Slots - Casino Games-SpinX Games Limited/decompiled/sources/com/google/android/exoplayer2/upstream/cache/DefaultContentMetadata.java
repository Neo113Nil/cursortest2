package com.google.android.exoplayer2.upstream.cache;

/* loaded from: classes3.dex */
public final class DefaultContentMetadata implements com.google.android.exoplayer2.upstream.cache.ContentMetadata {
    public static final com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata EMPTY = new com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata(java.util.Collections.emptyMap());
    private int hashCode;
    private final java.util.Map<java.lang.String, byte[]> metadata;

    public DefaultContentMetadata() {
        this(java.util.Collections.emptyMap());
    }

    public DefaultContentMetadata(java.util.Map<java.lang.String, byte[]> map) {
        this.metadata = java.util.Collections.unmodifiableMap(map);
    }

    public com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata copyWithMutationsApplied(com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations contentMetadataMutations) {
        java.util.Map<java.lang.String, byte[]> applyMutations = applyMutations(this.metadata, contentMetadataMutations);
        return isMetadataEqual(this.metadata, applyMutations) ? this : new com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata(applyMutations);
    }

    public java.util.Set<java.util.Map.Entry<java.lang.String, byte[]>> entrySet() {
        return this.metadata.entrySet();
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    public final byte[] get(java.lang.String str, byte[] bArr) {
        byte[] bArr2 = this.metadata.get(str);
        return bArr2 != null ? java.util.Arrays.copyOf(bArr2, bArr2.length) : bArr;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    public final java.lang.String get(java.lang.String str, java.lang.String str2) {
        byte[] bArr = this.metadata.get(str);
        return bArr != null ? new java.lang.String(bArr, com.google.common.base.Charsets.UTF_8) : str2;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    public final long get(java.lang.String str, long j) {
        byte[] bArr = this.metadata.get(str);
        return bArr != null ? java.nio.ByteBuffer.wrap(bArr).getLong() : j;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    public final boolean contains(java.lang.String str) {
        return this.metadata.containsKey(str);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return isMetadataEqual(this.metadata, ((com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata) obj).metadata);
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            int i = 0;
            for (java.util.Map.Entry<java.lang.String, byte[]> entry : this.metadata.entrySet()) {
                i += java.util.Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.hashCode = i;
        }
        return this.hashCode;
    }

    private static boolean isMetadataEqual(java.util.Map<java.lang.String, byte[]> map, java.util.Map<java.lang.String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (java.util.Map.Entry<java.lang.String, byte[]> entry : map.entrySet()) {
            if (!java.util.Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    private static java.util.Map<java.lang.String, byte[]> applyMutations(java.util.Map<java.lang.String, byte[]> map, com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations contentMetadataMutations) {
        java.util.HashMap hashMap = new java.util.HashMap(map);
        removeValues(hashMap, contentMetadataMutations.getRemovedValues());
        addValues(hashMap, contentMetadataMutations.getEditedValues());
        return hashMap;
    }

    private static void removeValues(java.util.HashMap<java.lang.String, byte[]> hashMap, java.util.List<java.lang.String> list) {
        for (int i = 0; i < list.size(); i++) {
            hashMap.remove(list.get(i));
        }
    }

    private static void addValues(java.util.HashMap<java.lang.String, byte[]> hashMap, java.util.Map<java.lang.String, java.lang.Object> map) {
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), getBytes(entry.getValue()));
        }
    }

    private static byte[] getBytes(java.lang.Object obj) {
        if (obj instanceof java.lang.Long) {
            return java.nio.ByteBuffer.allocate(8).putLong(((java.lang.Long) obj).longValue()).array();
        }
        if (obj instanceof java.lang.String) {
            return ((java.lang.String) obj).getBytes(com.google.common.base.Charsets.UTF_8);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new java.lang.IllegalArgumentException();
    }
}
