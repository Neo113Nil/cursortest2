package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.hS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2976hS implements InterfaceC2471Yh {
    public static String[] A01 = {"8tOzOPKLz5DDIwqC88XBXxH90bmVDotF", "YCktuRbEMhZaz9U821mncTHWO05lwCqY", "Eq7g3criU65KDBPK", "XEHycrxPk7FQv1FkL381pmPNBNbKujpl", "niYnM4G6gzmxtC7fq", "sRQOtQAi", "8G5qrnHnaOtx52JqPPi", "6arHmIfqlBfM2iqNpfy3RxuQJelIt1eI"};
    public final WeakReference<C2292Re> A00;

    public C2976hS(C2292Re c2292Re) {
        this.A00 = new WeakReference<>(c2292Re);
    }

    private void A00(C2292Re c2292Re) {
        C2778eF A07 = c2292Re.A07();
        if (A07 != null && c2292Re.A04() != null) {
            c2292Re.A04().bringChildToFront(A07);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2471Yh
    public void A44(View view, int i, RelativeLayout.LayoutParams layoutParams) {
        C2292Re c2292Re = this.A00.get();
        if (c2292Re != null && c2292Re.A04() != null) {
            c2292Re.A04().addView(view, i, layoutParams);
            A00(c2292Re);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2471Yh
    public void A45(View view, RelativeLayout.LayoutParams layoutParams) {
        C2292Re c2292Re = this.A00.get();
        if (c2292Re != null && c2292Re.A04() != null) {
            c2292Re.A04().addView(view, layoutParams);
            A00(c2292Re);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2471Yh
    public void A4j(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0C(str);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2471Yh
    public void A4k(String str, UL ul) {
        if (this.A00.get() != null) {
            this.A00.get().A0E(str, ul);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2471Yh
    public void AAo(String str, C2200Nm c2200Nm) {
        if (this.A00.get() != null) {
            WeakReference<C2292Re> weakReference = this.A00;
            if (A01[4].length() == 0) {
                throw new RuntimeException();
            }
            A01[2] = "IO1gKUYJJG6YtU6JnI8y";
            weakReference.get().A0D(str, c2200Nm);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2471Yh
    public void ADJ(int i) {
        C2292Re activityApi = this.A00.get();
        if (activityApi != null) {
            activityApi.finish(i);
        }
    }
}
