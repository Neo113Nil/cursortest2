package Ve;

import Ae.C2406m0;
import B1.C2548q;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC5434v;
import kotlin.Metadata;
import spay.sdk.R;
import spay.sdk.view.SPayMaterialButton;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/rj;", "LVe/Bc;", "LVe/dp;", "LVe/P7;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: Ve.rj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4592rj extends Bc<C4194dp, P7> {

    /* renamed from: d, reason: collision with root package name */
    public C4417lh f31980d;

    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onPause() {
        super.onPause();
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new R1(this, (kotlin.coroutines.d) null), 3);
    }

    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onResume() {
        super.onResume();
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4310hp(this, null), 3);
    }

    @Override // Ve.Bc
    public final X4.a t() {
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_tds_binding_web_view, (ViewGroup) null, false);
        int i11 = R.id.spay_tds_binding_loading;
        ProgressBar progressBar = (ProgressBar) C2548q.d(i11, inflate);
        if (progressBar != null) {
            i11 = R.id.spay_tds_binding_wv;
            WebView webView = (WebView) C2548q.d(i11, inflate);
            if (webView != null) {
                i11 = R.id.spay_tds_mb_close;
                SPayMaterialButton sPayMaterialButton = (SPayMaterialButton) C2548q.d(i11, inflate);
                if (sPayMaterialButton != null) {
                    return new P7((ConstraintLayout) inflate, progressBar, webView, sPayMaterialButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // Ve.Bc
    /* renamed from: v */
    public final Class getF29732e() {
        return C4194dp.class;
    }

    @Override // Ve.Bc
    public final void x() {
    }

    @Override // Ve.Bc
    public final void y() {
        C2406m0 c2406m0 = new C2406m0(((C4194dp) u()).f30895d);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new If(this, AbstractC5434v.b.CREATED, c2406m0, null, this), 3);
    }

    @Override // Ve.Bc
    public final void z() {
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        WebView webView = ((P7) aVar).f29680c;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setDomStorageEnabled(true);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setVerticalScrollBarEnabled(false);
        X4.a aVar2 = this.f28693b;
        if (aVar2 == null) {
            throw M7.f29463a;
        }
        ((P7) aVar2).f29681d.setOnClickListener(new FX.a(this, 4));
    }
}
