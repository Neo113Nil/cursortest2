package Ve;

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
import spay.sdk.view.SPayTextView;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/H3;", "LVe/Bc;", "LVe/R4;", "LVe/t4;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class H3 extends Bc<R4, C4635t4> {

    /* renamed from: d, reason: collision with root package name */
    public String f29114d;

    /* renamed from: e, reason: collision with root package name */
    public W1 f29115e;

    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onPause() {
        super.onPause();
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new K0(this, null), 3);
    }

    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onResume() {
        super.onResume();
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4517p1(this, null), 3);
    }

    @Override // Ve.Bc
    public final X4.a t() {
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_phone_number_auth_via_web_view, (ViewGroup) null, false);
        int i11 = R.id.spay_slpnavpb_loading;
        ProgressBar progressBar = (ProgressBar) C2548q.d(i11, inflate);
        if (progressBar != null) {
            i11 = R.id.spay_slpnavwv_actv_mock_text;
            SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, inflate);
            if (sPayTextView != null) {
                i11 = R.id.spay_slpnavwv_mb_close_offer;
                SPayMaterialButton sPayMaterialButton = (SPayMaterialButton) C2548q.d(i11, inflate);
                if (sPayMaterialButton != null) {
                    i11 = R.id.spay_slpnavwv_wv;
                    WebView webView = (WebView) C2548q.d(i11, inflate);
                    if (webView != null) {
                        return new C4635t4((ConstraintLayout) inflate, progressBar, sPayTextView, sPayMaterialButton, webView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // Ve.Bc
    /* renamed from: v */
    public final Class getF29732e() {
        return R4.class;
    }

    @Override // Ve.Bc
    public final void x() {
    }

    @Override // Ve.Bc
    public final void y() {
        Ae.x0 x0Var = ((R4) u()).f29823f;
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4170d0(this, AbstractC5434v.b.STARTED, x0Var, null, this), 3);
    }

    @Override // Ve.Bc
    public final void z() {
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        WebView webView = ((C4635t4) aVar).f32088e;
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
        ((C4635t4) aVar2).f32087d.setOnClickListener(new AS.a(this, 8));
    }
}
