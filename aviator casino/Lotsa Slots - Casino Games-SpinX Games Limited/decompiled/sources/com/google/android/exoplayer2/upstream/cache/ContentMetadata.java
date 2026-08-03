package com.google.android.exoplayer2.upstream.cache;

/* loaded from: classes3.dex */
public interface ContentMetadata {
    public static final java.lang.String KEY_CONTENT_LENGTH = "exo_len";
    public static final java.lang.String KEY_CUSTOM_PREFIX = "custom_";
    public static final java.lang.String KEY_REDIRECTED_URI = "exo_redir";

    boolean contains(java.lang.String str);

    long get(java.lang.String str, long j);

    java.lang.String get(java.lang.String str, java.lang.String str2);

    byte[] get(java.lang.String str, byte[] bArr);

    /* renamed from: com.google.android.exoplayer2.upstream.cache.ContentMetadata$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static long getContentLength(com.google.android.exoplayer2.upstream.cache.ContentMetadata contentMetadata) {
            return contentMetadata.get("exo_len", -1L);
        }

        public static android.net.Uri getRedirectedUri(com.google.android.exoplayer2.upstream.cache.ContentMetadata contentMetadata) {
            java.lang.String str = contentMetadata.get("exo_redir", (java.lang.String) null);
            if (str == null) {
                return null;
            }
            return android.net.Uri.parse(str);
        }
    }
}
