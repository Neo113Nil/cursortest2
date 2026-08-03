package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

/* loaded from: classes5.dex */
public interface d {

    public static final class a {
        public static /* synthetic */ void a(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d dVar, java.lang.String str, byte[] bArr, io.ktor.http.ContentType contentType, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendPost");
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            dVar.a(str, bArr, contentType, str2);
        }
    }

    void a(java.lang.String str);

    void a(java.lang.String str, byte[] bArr, io.ktor.http.ContentType contentType, java.lang.String str2);
}
