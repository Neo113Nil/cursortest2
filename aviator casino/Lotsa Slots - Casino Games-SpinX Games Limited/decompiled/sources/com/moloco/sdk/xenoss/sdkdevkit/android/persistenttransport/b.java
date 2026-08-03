package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

/* loaded from: classes5.dex */
public final class b implements com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.a {
    public static final int c = 8;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d b;

    public b(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d delegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.b = delegate;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d
    public void a(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        this.b.a(url);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d
    public void a(java.lang.String url, byte[] body, io.ktor.http.ContentType contentType, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "contentType");
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d.a.a(this.b, url, body, contentType, null, 8, null);
    }
}
