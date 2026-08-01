package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ad extends AbstractC3750h implements Pi, Pm, Fq, InterfaceC3719fo {
    public volatile Ok c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ad(C4008q1 adManagerComponent, Hd nativeCallbacks) {
        super(adManagerComponent.e);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(nativeCallbacks, "nativeCallbacks");
        this.c = new Td(adManagerComponent, nativeCallbacks, this);
    }

    @Override // com.inmobi.media.Rk
    public final Ok a() {
        return this.c;
    }

    @Override // com.inmobi.media.InterfaceC3719fo
    public final void b() {
        Ok ok = this.c;
        InterfaceC3719fo interfaceC3719fo = ok instanceof InterfaceC3719fo ? (InterfaceC3719fo) ok : null;
        if (interfaceC3719fo != null) {
            interfaceC3719fo.b();
        }
    }

    @Override // com.inmobi.media.Pm
    public final void d() {
        Ok ok = this.c;
        Pm pm = ok instanceof Pm ? (Pm) ok : null;
        if (pm != null) {
            pm.d();
        }
    }

    @Override // com.inmobi.media.InterfaceC3719fo
    public final void f() {
        Ok ok = this.c;
        InterfaceC3719fo interfaceC3719fo = ok instanceof InterfaceC3719fo ? (InterfaceC3719fo) ok : null;
        if (interfaceC3719fo != null) {
            interfaceC3719fo.f();
        }
    }

    @Override // com.inmobi.media.InterfaceC3719fo
    public final void h() {
        Ok ok = this.c;
        InterfaceC3719fo interfaceC3719fo = ok instanceof InterfaceC3719fo ? (InterfaceC3719fo) ok : null;
        if (interfaceC3719fo != null) {
            interfaceC3719fo.h();
        }
    }

    @Override // com.inmobi.media.InterfaceC3719fo
    public final void i() {
        Ok ok = this.c;
        InterfaceC3719fo interfaceC3719fo = ok instanceof InterfaceC3719fo ? (InterfaceC3719fo) ok : null;
        if (interfaceC3719fo != null) {
            interfaceC3719fo.i();
        }
    }

    @Override // com.inmobi.media.Fq
    public final String a(int i, double d) {
        String a2;
        Ok ok = this.c;
        Fd fd = ok instanceof Ce ? ((Ce) ok).j : ok instanceof C3993pe ? ((C3993pe) ok).h : ok instanceof C4106tf ? ((C4106tf) ok).f : ok instanceof C4243yf ? ((C4243yf) ok).f7502a : null;
        return (fd == null || (a2 = fd.a(i, d)) == null) ? "Ad not ready for Win/Loss notification. AdUnit must be inflated first." : a2;
    }

    @Override // com.inmobi.media.Fq
    public final String a(double d) {
        Fd fd;
        String a2;
        Ok ok = this.c;
        if (ok instanceof Ce) {
            fd = ((Ce) ok).j;
        } else if (ok instanceof C3993pe) {
            fd = ((C3993pe) ok).h;
        } else if (ok instanceof C4106tf) {
            fd = ((C4106tf) ok).f;
        } else {
            fd = ok instanceof C4243yf ? ((C4243yf) ok).f7502a : null;
        }
        return (fd == null || (a2 = fd.a(d)) == null) ? "Ad not ready for Win/Loss notification. AdUnit must be inflated first." : a2;
    }

    @Override // com.inmobi.media.InterfaceC3719fo
    public final void a(boolean z) {
        Ok ok = this.c;
        InterfaceC3719fo interfaceC3719fo = ok instanceof InterfaceC3719fo ? (InterfaceC3719fo) ok : null;
        if (interfaceC3719fo != null) {
            interfaceC3719fo.a(z);
        }
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
