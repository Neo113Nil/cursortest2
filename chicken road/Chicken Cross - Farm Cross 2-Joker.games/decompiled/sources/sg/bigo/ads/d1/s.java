package sg.bigo.ads.d1;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ironsource.C4761z5;
import java.io.File;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.s0.z;

/* loaded from: classes3.dex */
public final class s extends AbstractC5068d implements sg.bigo.ads.N.g {
    public sg.bigo.ads.r1.q b;
    public AdImageView c;
    public Boolean d;
    public Boolean e;
    public q f;
    public boolean g;
    public boolean h;
    public sg.bigo.ads.E1.k i;
    public u j;

    public s(sg.bigo.ads.N.a aVar) {
        super(aVar);
        this.b = null;
        this.c = null;
        Boolean bool = Boolean.TRUE;
        this.d = bool;
        this.e = bool;
        this.g = true;
        this.h = true;
    }

    public final void a(View view) {
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        }
        X.a(view, this.f12728a, null, -1);
    }

    @Override // sg.bigo.ads.d1.AbstractC5068d
    public final boolean a(int i, int i2) {
        View view = this.c;
        boolean a2 = (view == null && (view = this.b) == null && (view = this.i) == null) ? false : X.a(i, i2, view);
        View view2 = this.c;
        if ((X.b(i, i2, this.f12728a) & (!((view2 == null && (view2 = this.b) == null && (view2 = this.i) == null) ? false : X.a(i, i2, view2)))) && this.d.booleanValue()) {
            this.f12728a.setTag(9);
            return true;
        }
        if (!a2 || !this.e.booleanValue()) {
            return false;
        }
        this.f12728a.setTag(5);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC5087a interfaceC5087a, z zVar) {
        AdImageView adImageView;
        ImageView.ScaleType scaleType;
        AdImageView adImageView2;
        FrameLayout.LayoutParams layoutParams;
        sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) interfaceC5087a;
        String e = kVar.e();
        if (sg.bigo.ads.O.g.f12472a.B.a(9) && URLUtil.isHttpUrl(e) && zVar != null) {
            zVar.a(1305, "Invalid http url", null);
            return;
        }
        sg.bigo.ads.R.b a2 = sg.bigo.ads.R.b.a(kVar.l);
        if (this.c == null) {
            this.c = new AdImageView(this.f12728a.getContext());
        }
        int i = a2.f12516a;
        if (i != 1) {
            if (i == 2) {
                adImageView = this.c;
                scaleType = ImageView.ScaleType.CENTER_CROP;
                adImageView.setScaleType(scaleType);
                a(this.c);
                this.c.c.a(zVar);
                this.c.a(e, kVar.T);
                String f = kVar.f();
                if (!sg.bigo.ads.O.g.f12472a.B.a(28)) {
                }
                this.c.setBlurBorder(this.h);
            }
            if (i != 3) {
                if (i == 4) {
                    adImageView2 = this.c;
                    layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
                }
                a(this.c);
                this.c.c.a(zVar);
                this.c.a(e, kVar.T);
                String f2 = kVar.f();
                if (!sg.bigo.ads.O.g.f12472a.B.a(28) && ("image/gif".equalsIgnoreCase(f2) || "image/webp".equalsIgnoreCase(f2))) {
                    AdImageView adImageView3 = this.c;
                    Context context = this.f12728a.getContext();
                    adImageView3.getClass();
                    Pair c = sg.bigo.ads.s0.k.c(e, context);
                    if (this.i == null) {
                        sg.bigo.ads.E1.k a3 = sg.bigo.ads.E1.k.a(this.f12728a.getContext());
                        this.i = a3;
                        if (a3 != null) {
                            a3.setOnTouchListener(new r(this));
                            this.i.setVerticalScrollBarEnabled(false);
                            this.i.setHorizontalScrollBarEnabled(false);
                            this.i.getSettings().setAllowFileAccess(true);
                            this.i.setWebViewClient(new o(this));
                            this.i.setWebChromeClient(new p());
                        }
                    }
                    if (this.i == null) {
                        return;
                    }
                    if (((Boolean) c.first).booleanValue() && !TextUtils.isEmpty((CharSequence) c.second)) {
                        e = new File((String) c.second).toURI().toString();
                    }
                    this.i.loadDataWithBaseURL(null, "<!DOCTYPE html><html><head><meta name='viewport' content='width=device-width, height=device-height, initial-scale=1.0'/><style>html, body {  margin:0;  padding:0;  width:100%;  height:100%;  background:transparent;}body {  display:flex;  justify-content:center;  align-items:center;}img {  max-width:100%;  max-height:100%;  width:auto;  height:auto;  object-fit:contain;}</style></head><body><img src='" + e + "' /></body></html>", "text/html", C4761z5.O, null);
                    return;
                }
                this.c.setBlurBorder(this.h);
            }
            adImageView2 = this.c;
            layoutParams = new FrameLayout.LayoutParams(-1, -2, 17);
            adImageView2.setLayoutParams(layoutParams);
        }
        adImageView = this.c;
        scaleType = ImageView.ScaleType.FIT_CENTER;
        adImageView.setScaleType(scaleType);
        a(this.c);
        this.c.c.a(zVar);
        this.c.a(e, kVar.T);
        String f22 = kVar.f();
        if (!sg.bigo.ads.O.g.f12472a.B.a(28)) {
        }
        this.c.setBlurBorder(this.h);
    }

    public final void a(boolean z) {
        sg.bigo.ads.r1.q qVar = this.b;
        if (qVar != null) {
            qVar.setClickable(z);
        } else {
            this.g = z;
        }
    }
}
