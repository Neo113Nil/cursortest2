package com.google.android.gms.internal.ads;

import Q2.C0379q;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.ak, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0765ak {

    /* renamed from: a, reason: collision with root package name */
    public final Wk f12699a;

    /* renamed from: b, reason: collision with root package name */
    public final Kk f12700b;

    /* renamed from: c, reason: collision with root package name */
    public Zj f12701c = null;

    public C0765ak(Wk wk, Kk kk) {
        this.f12699a = wk;
        this.f12700b = kk;
    }

    public static final int b(int i, Context context, String str) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        U2.e eVar = C0379q.f.f5048a;
        return U2.e.l(context, i);
    }

    public final View a(FrameLayout frameLayout, WindowManager windowManager) {
        InterfaceC0677Re a5 = this.f12699a.a(Q2.a1.b(), null, null);
        a5.K().setVisibility(4);
        a5.K().setContentDescription("policy_validator");
        a5.s0("/sendMessageToSdk", new C1417p9(8, this));
        a5.s0("/hideValidatorOverlay", new Xj(this, windowManager, frameLayout));
        a5.s0("/open", new E9(null, null, null, null, null));
        WeakReference weakReference = new WeakReference(a5);
        Xj xj = new Xj(this, frameLayout, windowManager);
        Kk kk = this.f12700b;
        kk.c("/loadNativeAdPolicyViolations", new Jk(kk, weakReference, "/loadNativeAdPolicyViolations", xj));
        kk.c("/showValidatorOverlay", new Jk(kk, new WeakReference(a5), "/showValidatorOverlay", new C1551s9(28)));
        return a5.K();
    }
}
