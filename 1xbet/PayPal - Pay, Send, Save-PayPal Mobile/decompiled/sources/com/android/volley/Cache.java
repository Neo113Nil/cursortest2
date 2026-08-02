package com.android.volley;

/* loaded from: classes3.dex */
public interface Cache {
    void clear();

    com.android.volley.Cache.Entry get(java.lang.String str);

    void initialize();

    void invalidate(java.lang.String str, boolean z);

    void put(java.lang.String str, com.android.volley.Cache.Entry entry);

    void remove(java.lang.String str);

    public static class Entry {
        public java.util.List<com.android.volley.Header> allResponseHeaders;
        public byte[] data;
        public java.lang.String etag;
        public long lastModified;
        public java.util.Map<java.lang.String, java.lang.String> responseHeaders = java.util.Collections.emptyMap();
        public long serverDate;
        public long softTtl;
        public long ttl;

        public boolean isExpired() {
            return this.ttl < java.lang.System.currentTimeMillis();
        }

        public boolean refreshNeeded() {
            return this.softTtl < java.lang.System.currentTimeMillis();
        }
    }
}
