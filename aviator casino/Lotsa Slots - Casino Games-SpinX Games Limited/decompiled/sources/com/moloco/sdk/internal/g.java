package com.moloco.sdk.internal;

/* loaded from: classes5.dex */
public final class g implements com.moloco.sdk.internal.f {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i f6963a;

    public g(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        this.f6963a = persistentHttpRequest;
    }

    @Override // com.moloco.sdk.internal.f
    public void a(java.lang.String burl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(burl, "burl");
        try {
            android.net.Uri parse = android.net.Uri.parse(burl);
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar = this.f6963a;
            java.lang.String uri = parse.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            iVar.a(uri);
        } catch (java.lang.Exception e) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "BUrlTrackerImpl", e.toString(), null, false, 12, null);
        }
    }
}
