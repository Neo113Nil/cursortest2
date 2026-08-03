package com.moloco.sdk.internal;

/* loaded from: classes5.dex */
public final class x implements com.moloco.sdk.internal.w {
    public static final int b = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i f7339a;

    public x(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        this.f7339a = persistentHttpRequest;
    }

    @Override // com.moloco.sdk.internal.w
    public boolean a(java.lang.String url, long j, com.moloco.sdk.internal.s sVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c f;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        if (sVar != null) {
            try {
                f = sVar.f();
            } catch (java.lang.Exception e) {
                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "SdkEventUrlTrackerImpl", e.toString(), null, false, 12, null);
                return false;
            }
        } else {
            f = null;
        }
        android.net.Uri build = android.net.Uri.parse(a(url, j, f)).buildUpon().build();
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar = this.f7339a;
        java.lang.String uri = build.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        iVar.a(uri);
        return true;
    }

    public final java.lang.String a(java.lang.String str, long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        java.lang.String a2;
        if (cVar != null && (a2 = com.moloco.sdk.internal.utils.b.a(str, cVar.a())) != null) {
            str = a2;
        }
        return com.moloco.sdk.internal.utils.b.a(str, j);
    }
}
