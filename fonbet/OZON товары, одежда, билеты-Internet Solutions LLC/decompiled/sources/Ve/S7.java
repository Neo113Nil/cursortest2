package Ve;

import Ae.C2406m0;
import B1.C2548q;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC5434v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.SPayTextView;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/S7;", "LVe/Bc;", "LVe/pg;", "LVe/Vk;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class S7 extends Bc<C4532pg, Vk> {

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC4693v4 f29948d;

    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        ((C4532pg) u()).e0(H.f29097b);
    }

    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        super.onStop();
        ((C4532pg) u()).e0(C4516p0.f31753b);
    }

    @Override // Ve.Bc
    public final X4.a t() {
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_bnpl_agreement, (ViewGroup) null, false);
        int i11 = R.id.spay_slba_apiv_share_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, inflate);
        if (appCompatImageView != null) {
            i11 = R.id.spay_slba_fl_header_container;
            if (((FrameLayout) C2548q.d(i11, inflate)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                i11 = R.id.spay_slba_tv_btn_return_label;
                if (((SPayTextView) C2548q.d(i11, inflate)) != null) {
                    i11 = R.id.spay_slba_tv_title;
                    SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, inflate);
                    if (sPayTextView != null) {
                        i11 = R.id.f150spay_slba_v_btn_return;
                        CardView cardView = (CardView) C2548q.d(i11, inflate);
                        if (cardView != null) {
                            i11 = R.id.spay_slba_wv_content;
                            WebView webView = (WebView) C2548q.d(i11, inflate);
                            if (webView != null) {
                                Vk vk2 = new Vk(constraintLayout, appCompatImageView, constraintLayout, sPayTextView, cardView, webView);
                                Intrinsics.checkNotNullExpressionValue(vk2, "inflate(layoutInflater)");
                                return vk2;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // Ve.Bc
    /* renamed from: v */
    public final Class getF29732e() {
        return C4532pg.class;
    }

    @Override // Ve.Bc
    public final void w() {
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        Vk vk2 = (Vk) aVar;
        vk2.f30208b.setOnClickListener(new CG.b(this, 11));
        vk2.f30211e.setOnClickListener(new CG.c(this, 8));
    }

    @Override // Ve.Bc
    public final void x() {
        C4792yj c4792yj = Ul.f30136b;
        if (c4792yj != null) {
            this.f28694c = (InterfaceC4436m7) c4792yj.f32584a.f30484l.get();
        }
    }

    @Override // Ve.Bc
    public final void y() {
        C2406m0 c2406m0 = new C2406m0(((C4532pg) u()).f31791e);
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4490o3(this, bVar, c2406m0, null, this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4175d5(this, bVar, new C2406m0(((C4532pg) u()).f31793g), null, this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new L6(this, bVar, new C2406m0(((C4532pg) u()).f31794h), null, this), 3);
    }

    @Override // Ve.Bc
    public final void z() {
        Object u11 = u();
        InterfaceC4693v4 interfaceC4693v4 = u11 instanceof InterfaceC4693v4 ? (InterfaceC4693v4) u11 : null;
        if (interfaceC4693v4 == null) {
            throw new IllegalStateException("AgreementFragmentViewModel must implement UrlProcessInterface!");
        }
        this.f29948d = interfaceC4693v4;
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        ((Vk) aVar).f30209c.getLayoutParams().height = requireContext().getResources().getDisplayMetrics().heightPixels - getResources().getDimensionPixelSize(R.dimen.spay_bnpl_return_btn_bottom_margin);
        w();
        X4.a aVar2 = this.f28693b;
        if (aVar2 == null) {
            throw M7.f29463a;
        }
        WebView webView = ((Vk) aVar2).f30212f;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(false);
        settings.setAllowFileAccess(false);
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new A1(this));
    }
}
