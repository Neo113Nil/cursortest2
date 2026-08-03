package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Oc implements com.inmobi.media.Ah, com.inmobi.media.Tk, com.inmobi.media.Io {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2799u9 f4875a;
    public final com.inmobi.media.Ic b;

    public Oc(android.content.Context context, com.inmobi.media.Sg pubSettings, com.inmobi.media.Pc nativeCallbacks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pubSettings, "pubSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeCallbacks, "nativeCallbacks");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("native", "logType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("native", "adType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pubSettings, "pubSettings");
        com.inmobi.media.Ib ib = com.inmobi.media.Sh.f4959a;
        this.f4875a = com.inmobi.media.Sh.a("native", pubSettings.g);
        this.b = new com.inmobi.media.Ic(new com.inmobi.media.C2631o1(context, this, new com.inmobi.media.C2657p1(this, pubSettings)), nativeCallbacks);
    }

    @Override // com.inmobi.media.Io
    public final java.lang.String a(int i, double d) {
        return this.b.a(i, d);
    }

    @Override // com.inmobi.media.Tk
    public final void d() {
        this.b.d();
    }

    @Override // com.inmobi.media.Io
    public final java.lang.String a(double d) {
        return this.b.a(d);
    }

    @Override // com.inmobi.media.Ah
    public final void a(com.inmobi.media.ads.nativeAd.InMobiNativeViewData inMobiNativeViewData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        this.b.a(inMobiNativeViewData);
    }
}
