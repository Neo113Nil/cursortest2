package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public abstract class i {
    public static java.io.FilterInputStream a(java.io.InputStream inputStream, boolean z) {
        java.io.FilterInputStream bufferedInputStream;
        try {
            if (z) {
                com.fyber.inneractive.sdk.util.IAlog.a("HttpExecutorBase: getInputStream found gzip encoding", new java.lang.Object[0]);
                bufferedInputStream = new java.util.zip.GZIPInputStream(inputStream);
            } else {
                com.fyber.inneractive.sdk.util.IAlog.a("HttpExecutorBase: getInputStream no gzip encoding", new java.lang.Object[0]);
                bufferedInputStream = new java.io.BufferedInputStream(inputStream);
            }
            return bufferedInputStream;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static com.fyber.inneractive.sdk.network.l a(java.io.FilterInputStream filterInputStream, int i, java.lang.String str, java.util.Map map, java.lang.String str2) {
        try {
            com.fyber.inneractive.sdk.network.l lVar = new com.fyber.inneractive.sdk.network.l(filterInputStream, i, str, map, str2);
            if (lVar.f3845a / 100 != 5) {
                return lVar;
            }
            throw new com.fyber.inneractive.sdk.network.b(java.lang.String.format("server returned error %d", java.lang.Integer.valueOf(lVar.f3845a)));
        } catch (com.fyber.inneractive.sdk.network.b e) {
            com.fyber.inneractive.sdk.util.IAlog.a("failed executing network request msg: %s", e.getMessage());
            throw new com.fyber.inneractive.sdk.network.b(e);
        } catch (java.lang.Exception e2) {
            com.fyber.inneractive.sdk.util.IAlog.a("failed reading network response msg: %s", e2.getMessage());
            throw new com.fyber.inneractive.sdk.network.q1(e2);
        }
    }
}
