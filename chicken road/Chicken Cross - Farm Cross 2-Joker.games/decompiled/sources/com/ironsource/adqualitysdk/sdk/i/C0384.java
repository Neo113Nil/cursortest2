package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ț, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0384 implements X {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1312 f495;

    public C0384(C1312 c1312) {
        this.f495 = c1312;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.X
    /* renamed from: ﾇ */
    public final void mo5332(View view) {
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.X
    /* renamed from: ﾒ */
    public final void mo5333(View view) {
        boolean z;
        C0932 m5751 = C0932.m5751();
        synchronized (m5751) {
            z = m5751.f2619;
        }
        if (z) {
            this.f495.m5947();
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getContext() instanceof Activity) {
                ViewGroup viewGroup2 = (ViewGroup) ((Activity) viewGroup.getContext()).findViewById(R.id.content);
                this.f495.getClass();
                if (viewGroup2 != null) {
                    ViewGroup viewGroup3 = viewGroup2;
                    while (true) {
                        if (viewGroup2 != null) {
                            ViewParent parent = viewGroup2.getParent();
                            if (parent != viewGroup) {
                                if (!(parent instanceof ViewGroup)) {
                                    break;
                                }
                                viewGroup3 = viewGroup2;
                                viewGroup2 = (ViewGroup) parent;
                            } else if (viewGroup3 != viewGroup2) {
                                viewGroup = viewGroup3;
                            }
                        } else {
                            break;
                        }
                    }
                    viewGroup = viewGroup2;
                }
            }
            C1312 c1312 = this.f495;
            c1312.getClass();
            C1312.m5946(c1312, viewGroup, new ViewOnLayoutChangeListenerC0381(c1312, viewGroup));
        }
    }
}
