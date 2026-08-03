package com.facebook.internal;

/* compiled from: UrlRedirectCache.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007J\b\u0010\r\u001a\u00020\tH\u0007J\b\u0010\u000e\u001a\u00020\u0007H\u0007J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/internal/UrlRedirectCache;", "", "()V", "redirectContentTag", "", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, "urlRedirectFileLruCache", "Lcom/facebook/internal/FileLruCache;", "cacheUriRedirect", "", "fromUri", "Landroid/net/Uri;", "toUri", "clearCache", "getCache", "getRedirectedUri", com.facebook.share.internal.ShareConstants.MEDIA_URI, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class UrlRedirectCache {
    public static final com.facebook.internal.UrlRedirectCache INSTANCE = new com.facebook.internal.UrlRedirectCache();
    private static final java.lang.String redirectContentTag;
    private static final java.lang.String tag;
    private static com.facebook.internal.FileLruCache urlRedirectFileLruCache;

    private UrlRedirectCache() {
    }

    static {
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.facebook.internal.UrlRedirectCache.class).getSimpleName();
        if (simpleName == null) {
            simpleName = "UrlRedirectCache";
        }
        tag = simpleName;
        redirectContentTag = kotlin.jvm.internal.Intrinsics.stringPlus(simpleName, "_Redirect");
    }

    @kotlin.jvm.JvmStatic
    public static final synchronized com.facebook.internal.FileLruCache getCache() throws java.io.IOException {
        com.facebook.internal.FileLruCache fileLruCache;
        synchronized (com.facebook.internal.UrlRedirectCache.class) {
            fileLruCache = urlRedirectFileLruCache;
            if (fileLruCache == null) {
                fileLruCache = new com.facebook.internal.FileLruCache(tag, new com.facebook.internal.FileLruCache.Limits());
            }
            urlRedirectFileLruCache = fileLruCache;
        }
        return fileLruCache;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, r10) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        r5 = r6;
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
    
        com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.CACHE, 6, com.facebook.internal.UrlRedirectCache.tag, "A loop detected in UrlRedirectCache");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
    
        r10 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.closeQuietly(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        return null;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00bf: MOVE (r0 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:48:0x00bf */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final android.net.Uri getRedirectedUri(android.net.Uri uri) {
        java.io.InputStreamReader inputStreamReader;
        java.io.InputStreamReader inputStreamReader2;
        java.io.InputStreamReader inputStreamReader3;
        java.io.InputStreamReader inputStreamReader4 = null;
        if (uri == null) {
            return null;
        }
        java.lang.String uri2 = uri.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(uri2);
        try {
            try {
                com.facebook.internal.FileLruCache cache = getCache();
                java.io.InputStream inputStream = cache.get(uri2, redirectContentTag);
                inputStreamReader = null;
                boolean z = false;
                while (true) {
                    if (inputStream == null) {
                        break;
                    }
                    try {
                        inputStreamReader3 = new java.io.InputStreamReader(inputStream);
                    } catch (java.io.IOException e) {
                        e = e;
                    }
                    try {
                        char[] cArr = new char[128];
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        for (int read = inputStreamReader3.read(cArr, 0, 128); read > 0; read = inputStreamReader3.read(cArr, 0, 128)) {
                            sb.append(cArr, 0, read);
                        }
                        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                        com.facebook.internal.Utility.closeQuietly(inputStreamReader3);
                        java.lang.String sb2 = sb.toString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "urlBuilder.toString()");
                        if (hashSet.contains(sb2)) {
                            break;
                        }
                        hashSet.add(sb2);
                        inputStreamReader = inputStreamReader3;
                        z = true;
                        inputStream = cache.get(sb2, redirectContentTag);
                        uri2 = sb2;
                    } catch (java.io.IOException e2) {
                        e = e2;
                        inputStreamReader = inputStreamReader3;
                        com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.CACHE, 4, tag, kotlin.jvm.internal.Intrinsics.stringPlus("IOException when accessing cache: ", e.getMessage()));
                        com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                        com.facebook.internal.Utility.closeQuietly(inputStreamReader);
                        return null;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        inputStreamReader4 = inputStreamReader3;
                        com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
                        com.facebook.internal.Utility.closeQuietly(inputStreamReader4);
                        throw th;
                    }
                }
                if (z) {
                    android.net.Uri parse = android.net.Uri.parse(uri2);
                    com.facebook.internal.Utility utility4 = com.facebook.internal.Utility.INSTANCE;
                    com.facebook.internal.Utility.closeQuietly(inputStreamReader);
                    return parse;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                inputStreamReader4 = inputStreamReader2;
            }
        } catch (java.io.IOException e3) {
            e = e3;
            inputStreamReader = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
        com.facebook.internal.Utility utility22 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.closeQuietly(inputStreamReader);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v7 */
    @kotlin.jvm.JvmStatic
    public static final void cacheUriRedirect(android.net.Uri fromUri, android.net.Uri toUri) {
        java.lang.Object obj;
        if (fromUri == null || toUri == null) {
            return;
        }
        ?? r0 = 0;
        r0 = 0;
        try {
            try {
                com.facebook.internal.FileLruCache cache = getCache();
                java.lang.String uri = fromUri.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "fromUri.toString()");
                r0 = cache.openPutStream(uri, redirectContentTag);
                java.lang.String uri2 = toUri.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri2, "toUri.toString()");
                byte[] bytes = uri2.getBytes(kotlin.text.Charsets.UTF_8);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                r0.write(bytes);
                obj = r0;
            } catch (java.io.IOException e) {
                com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.CACHE, 4, tag, kotlin.jvm.internal.Intrinsics.stringPlus("IOException when accessing cache: ", e.getMessage()));
                obj = r0;
            }
        } finally {
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.Utility.closeQuietly((java.io.Closeable) r0);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void clearCache() {
        try {
            getCache().clearCache();
        } catch (java.io.IOException e) {
            com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.CACHE, 5, tag, kotlin.jvm.internal.Intrinsics.stringPlus("clearCache failed ", e.getMessage()));
        }
    }
}
