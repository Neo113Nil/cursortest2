package sg.bigo.ads.k1;

import android.content.Context;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: sg.bigo.ads.k1.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5270k extends sg.bigo.ads.E1.f {
    public InterfaceC5269j h;
    public d0 i;
    public boolean j;
    public final sg.bigo.ads.U.j k;

    public C5270k(Context context) {
        super(context);
        this.k = new sg.bigo.ads.U.j();
        d0 d0Var = new d0(this);
        this.i = d0Var;
        d0Var.d = new C5268i(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMraidViewable(boolean z) {
        InterfaceC5267h interfaceC5267h;
        if (this.j == z) {
            return;
        }
        this.j = z;
        InterfaceC5269j interfaceC5269j = this.h;
        if (interfaceC5269j == null || (interfaceC5267h = ((C5264e) interfaceC5269j).f13034a.c) == null) {
            return;
        }
        interfaceC5267h.a(z);
    }

    @Override // sg.bigo.ads.E1.k, android.webkit.WebView
    public final void destroy() {
        super.destroy();
        setWebChromeClient(null);
        setWebViewClient(null);
        this.i = null;
        this.h = null;
    }

    public sg.bigo.ads.U.j getClickPoints() {
        return this.k;
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            this.k.b = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (motionEvent.getActionMasked() == 0) {
            this.k.f12564a = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.i == null) {
            setMraidViewable(i == 0);
        } else if (i != 0) {
            setMraidViewable(false);
        }
    }

    public void setVisibilityChangedListener(InterfaceC5269j interfaceC5269j) {
        this.h = interfaceC5269j;
    }
}
