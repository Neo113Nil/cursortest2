package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Jd extends Rk implements Pi, Pm, InterfaceC3694f {
    public volatile Ok c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Jd(Ed nativeAdUnitComponent) {
        super(adComponent.f7489a.e);
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        C4227y adComponent = nativeAdUnitComponent.f6535a;
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        this.c = new Ud(nativeAdUnitComponent, this);
    }

    @Override // com.inmobi.media.Rk
    public final Ok a() {
        return this.c;
    }

    @Override // com.inmobi.media.Pm
    public final void d() {
        Ok ok = this.c;
        Pm pm = ok instanceof Pm ? (Pm) ok : null;
        if (pm != null) {
            pm.d();
        }
    }

    @Override // com.inmobi.media.InterfaceC3694f
    public final Object a(Continuation continuation) {
        Ok ok = this.c;
        InterfaceC3694f interfaceC3694f = ok instanceof InterfaceC3694f ? (InterfaceC3694f) ok : null;
        if (interfaceC3694f == null) {
            return Unit.INSTANCE;
        }
        Object a2 = interfaceC3694f.a(continuation);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }

    @Override // com.inmobi.media.Pi
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        Ok ok = this.c;
        Pi pi = ok instanceof Pi ? (Pi) ok : null;
        if (pi != null) {
            pi.a(inMobiNativeViewData);
        }
    }

    @Override // com.inmobi.media.Rk
    public final void a(Ok ok) {
        Intrinsics.checkNotNullParameter(ok, "<set-?>");
        this.c = ok;
    }
}
