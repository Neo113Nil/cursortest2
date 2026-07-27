package sg.bigo.ads.t;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import sg.bigo.ads.h.AbstractC5204s;
import sg.bigo.ads.n.C5408w;

/* renamed from: sg.bigo.ads.t.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5472b extends v {
    public final ViewOnTouchListenerC5471a N0;
    public final ViewOnTouchListenerC5471a O0;
    public int P0;
    public ViewGroup.MarginLayoutParams Q0;

    public C5472b(Activity activity) {
        super(activity);
        this.N0 = new ViewOnTouchListenerC5471a(this, true);
        this.O0 = new ViewOnTouchListenerC5471a(this, false);
    }

    @Override // sg.bigo.ads.t.v, sg.bigo.ads.t.i, sg.bigo.ads.Y0.x, sg.bigo.ads.j1.h
    public final void C() {
        super.C();
        this.x0.setOnTouchListener(this.O0);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w0.getLayoutParams();
            this.Q0 = marginLayoutParams;
            this.P0 = marginLayoutParams.topMargin;
        } catch (Exception unused) {
        }
    }

    @Override // sg.bigo.ads.t.v
    public final void R() {
        Window window = this.f12687a.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 80;
        window.setAttributes(attributes);
    }

    @Override // sg.bigo.ads.t.v
    public final void b(int i, int i2) {
        int i3 = this.s0;
        int i4 = i3 - this.u0;
        int i5 = this.t0;
        WeakReference weakReference = C5476f.e;
        InterfaceC5475e interfaceC5475e = weakReference != null ? (InterfaceC5475e) weakReference.get() : null;
        if (interfaceC5475e != null) {
            AbstractC5204s abstractC5204s = (AbstractC5204s) interfaceC5475e;
            Object X = abstractC5204s.X();
            if (X instanceof InterfaceC5477g) {
                C5408w c5408w = (C5408w) ((InterfaceC5477g) X);
                c5408w.b(i2, i4, i3, i5);
                if (c5408w.P && abstractC5204s.V && !abstractC5204s.i.get()) {
                    abstractC5204s.R();
                }
            }
        }
    }

    @Override // sg.bigo.ads.t.v
    public final void k(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w0.getLayoutParams();
        marginLayoutParams.topMargin = Math.max(0, marginLayoutParams.topMargin + i);
        this.w0.requestLayout();
        b(this.w0.getMeasuredWidth(), this.s0 - (marginLayoutParams.topMargin + i));
    }

    @Override // sg.bigo.ads.t.v, sg.bigo.ads.Y0.x, sg.bigo.ads.j1.h
    public final boolean b(MotionEvent motionEvent) {
        this.N0.onTouch(this.h, motionEvent);
        return true;
    }
}
