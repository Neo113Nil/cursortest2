package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ck, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2686ck implements View.OnClickListener {
    public static String[] A01 = {"UbVTWMkCbiTkCH46K3jgevn4ZrjXJwTz", "QhkEmn79eJKUC441fbjRvFrP8rMFuK10", "M1y17FrLcKCq9CffRIAOFt9KL", "7BuiCs8qfizRNQQacuqpq", "NMEBAQB23JfGHe29j4ICw6", "tA", "w4e9O4TDm2cMnnpInxw7", "enarAElxAt9QJNN7p9xKH4Zm0Hlbhkd5"};
    public final /* synthetic */ C2093Ji A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC2182Mt abstractC2182Mt;
        AbstractC2182Mt abstractC2182Mt2;
        boolean z;
        C2607bT c2607bT;
        boolean z2;
        C2607bT c2607bT2;
        C2647c7 c2647c7;
        AbstractC3095jd abstractC3095jd;
        Handler handler;
        Runnable runnable;
        AbstractC3095jd abstractC3095jd2;
        C2647c7 c2647c72;
        if (WU.A02(this)) {
            return;
        }
        try {
            abstractC2182Mt = this.A00.A0W;
            if (abstractC2182Mt == null) {
                return;
            }
            abstractC2182Mt2 = this.A00.A0W;
            Uri A0M = ((AnonymousClass85) abstractC2182Mt2).A0M();
            if (A0M == null) {
                return;
            }
            z = this.A00.A0D;
            if (!z) {
                this.A00.A0E = true;
                this.A00.A0m(A0M.toString());
                c2647c7 = this.A00.A0b;
                if (c2647c7.A0D() != null) {
                    c2647c72 = this.A00.A0b;
                    c2647c72.A0D().ACQ();
                }
                abstractC3095jd = this.A00.A0X;
                if (abstractC3095jd.A0q() >= 0) {
                    handler = this.A00.A0R;
                    runnable = this.A00.A0c;
                    abstractC3095jd2 = this.A00.A0X;
                    handler.postDelayed(runnable, abstractC3095jd2.A0q());
                }
            }
            c2607bT = this.A00.A09;
            if (c2607bT != null) {
                c2607bT2 = this.A00.A09;
                c2607bT2.A0B();
                this.A00.A09 = null;
            }
            C2093Ji c2093Ji = this.A00;
            z2 = this.A00.A0D;
            c2093Ji.A0q(z2 ? false : true);
        } catch (Throwable th) {
            String[] strArr = A01;
            if (strArr[6].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "NGdQEP5eIhe6T0Nr5s0Gdk";
            strArr2[5] = "GP";
            WU.A00(th, this);
        }
    }

    public ViewOnClickListenerC2686ck(C2093Ji c2093Ji) {
        this.A00 = c2093Ji;
    }
}
