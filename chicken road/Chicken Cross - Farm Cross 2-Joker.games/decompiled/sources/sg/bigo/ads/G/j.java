package sg.bigo.ads.G;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vungle.ads.internal.protos.Sdk;
import sg.bigo.ads.C.l;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MaxWidthMediaView;

/* loaded from: classes3.dex */
public final class j extends h {
    public j(l lVar, Context context) {
        super(lVar, context);
        sg.bigo.ads.R.b.f = 20;
    }

    @Override // sg.bigo.ads.G.h
    public final void b() {
        this.b = new FrameLayout(this.c);
        int a2 = AbstractC4963u.a(this.c, 38);
        int a3 = AbstractC4963u.a(this.c, 60);
        MaxWidthMediaView maxWidthMediaView = new MaxWidthMediaView(this.c);
        this.d = maxWidthMediaView;
        maxWidthMediaView.setLayoutParams(new ViewGroup.LayoutParams(-2, a2));
        this.d.setMinimumWidth(a2);
        ((MaxWidthMediaView) this.d).setMaxWidth(a3);
        this.d.setImageBlurBorder(true);
        this.d.setVisibility(8);
    }

    @Override // sg.bigo.ads.G.h
    public final int[] c() {
        return new int[]{AbstractC4963u.a(this.c, -24), AbstractC4963u.a(this.c, 236)};
    }

    @Override // sg.bigo.ads.G.h
    public final int d() {
        return AbstractC4963u.a(this.c, 6);
    }

    @Override // sg.bigo.ads.G.h
    public final int e() {
        return R.layout.bigo_ad_native_banner_small;
    }

    @Override // sg.bigo.ads.G.h
    public final int f() {
        return 50;
    }

    @Override // sg.bigo.ads.G.h
    public final int g() {
        return Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
    }
}
