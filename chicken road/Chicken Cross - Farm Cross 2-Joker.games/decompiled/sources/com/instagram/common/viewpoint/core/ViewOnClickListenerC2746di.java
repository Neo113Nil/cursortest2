package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.di, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2746di implements View.OnClickListener {
    public static String[] A01 = {"oF0UQSO2UkB0Fs6pC959r9dzDMlb", "cSj6PPi", "9MOBOvfZoPMufYmvf8w", "3DUooxDMnkOJWQGgSnbPARGlSWVzZXnv", "xtRq8IID5uSiAOfe9JKkWOxw4I", "dgOA0KJAxphsFM42TDGlvfhDF1ut8VW0", "Hk9WFArlgjOkwb9sMy", "wD"};
    public final /* synthetic */ AnonymousClass55 A00;

    public ViewOnClickListenerC2746di(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC2182Mt abstractC2182Mt;
        boolean z;
        boolean z2;
        InterfaceC2750dm interfaceC2750dm;
        AbstractC2182Mt abstractC2182Mt2;
        Handler handler;
        Runnable runnable;
        if (WU.A02(this)) {
            return;
        }
        try {
            abstractC2182Mt = this.A00.A0S;
            if (abstractC2182Mt instanceof AnonymousClass85) {
                z = this.A00.A0D;
                if (!z) {
                    interfaceC2750dm = this.A00.A0Z;
                    interfaceC2750dm.ACQ();
                    this.A00.A0E = true;
                    AnonymousClass55 anonymousClass55 = this.A00;
                    abstractC2182Mt2 = this.A00.A0S;
                    anonymousClass55.A0p(((AnonymousClass85) abstractC2182Mt2).A0M().toString());
                    long A0q = ((AbstractC2069Ij) this.A00).A06.A0q();
                    if (A01[1].length() != 7) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A01;
                    strArr[5] = "6Dfgyk2EWniD4mtjwsck8hBHMm74mFyH";
                    strArr[3] = "XIgrh0tmG1tVXTW5TWFgdcEwNBgdKHOC";
                    if (A0q >= 0) {
                        handler = this.A00.A0P;
                        runnable = this.A00.A0l;
                        handler.postDelayed(runnable, ((AbstractC2069Ij) this.A00).A06.A0q());
                    }
                }
                AnonymousClass55 anonymousClass552 = this.A00;
                z2 = this.A00.A0D;
                anonymousClass552.A0u(z2 ? false : true);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
