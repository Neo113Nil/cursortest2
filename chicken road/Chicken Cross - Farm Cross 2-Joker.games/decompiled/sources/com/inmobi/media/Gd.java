package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Gd implements Pi, Pm, Fq {

    /* renamed from: a, reason: collision with root package name */
    public final Z9 f6582a;
    public final Ad b;

    public Gd(Context context, C3600bi pubSettings, Hd nativeCallbacks) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pubSettings, "pubSettings");
        Intrinsics.checkNotNullParameter(nativeCallbacks, "nativeCallbacks");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("native", "logType");
        Intrinsics.checkNotNullParameter("native", "adType");
        Intrinsics.checkNotNullParameter(pubSettings, "pubSettings");
        Ac ac = AbstractC3771hj.f7147a;
        this.f6582a = AbstractC3771hj.a("native", pubSettings.h);
        this.b = new Ad(new C4008q1(context, this, new C4036r1(this, pubSettings)), nativeCallbacks);
    }

    @Override // com.inmobi.media.Fq
    public final String a(int i, double d) {
        return this.b.a(i, d);
    }

    @Override // com.inmobi.media.Pm
    public final void d() {
        this.b.d();
    }

    @Override // com.inmobi.media.Fq
    public final String a(double d) {
        return this.b.a(d);
    }

    @Override // com.inmobi.media.Pi
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        this.b.a(inMobiNativeViewData);
    }
}
