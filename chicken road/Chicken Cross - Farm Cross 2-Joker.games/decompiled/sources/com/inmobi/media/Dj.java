package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.unity3d.ads.BuildConfig;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Dj extends Iq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ej f6516a;

    public Dj(Ej ej) {
        this.f6516a = ej;
    }

    @Override // com.inmobi.media.Iq
    public final boolean a() {
        return !Intrinsics.areEqual("Hidden", this.f6516a.getViewState());
    }

    @Override // com.inmobi.media.Iq
    public final void a(Hg orientation, Kq finalInsets) {
        Ej renderView;
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(finalInsets, "finalInsets");
        this.f6516a.a(orientation, finalInsets);
        Ej ej = this.f6516a;
        ej.getClass();
        finalInsets.getClass();
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Jq jq = (Jq) finalInsets.f6682a.get(orientation);
        if (jq == null) {
            return;
        }
        if (jq.b == 0 && jq.c == 0) {
            return;
        }
        ej.setCloseAssetArea(jq);
        Lazy lazy = Vj.f6915a;
        Intrinsics.checkNotNullParameter(ej, "<this>");
        if (Intrinsics.areEqual(ej.getRoute().b, BuildConfig.FLAVOR)) {
            renderView = ej;
        } else {
            yq webViewFactory = ej.getWebViewFactory();
            webViewFactory.getClass();
            Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "id");
            renderView = (Ej) webViewFactory.b.get(BuildConfig.FLAVOR);
        }
        if (renderView != null) {
            Intrinsics.checkNotNullParameter(renderView, "renderView");
            Jq insets = ej.g1;
            Intrinsics.checkNotNullParameter(insets, "insets");
            View findViewById = renderView.getRootView().findViewById(65532);
            K5 k5 = findViewById instanceof K5 ? (K5) findViewById : null;
            if (k5 == null) {
                return;
            }
            View findViewById2 = renderView.getRootView().findViewById(65531);
            K5 k52 = findViewById2 instanceof K5 ? (K5) findViewById2 : null;
            if (k52 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = k5.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = k52.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 == null) {
                return;
            }
            layoutParams2.setMargins(0, insets.b, insets.c, 0);
            layoutParams4.setMargins(0, insets.b, insets.c, 0);
        }
    }
}
