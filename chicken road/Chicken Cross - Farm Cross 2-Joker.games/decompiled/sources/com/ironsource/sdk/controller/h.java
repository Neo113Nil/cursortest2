package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.C4491k4;
import com.ironsource.C4704w2;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4673u7;
import com.ironsource.Pc;
import com.ironsource.U3;
import com.ironsource.sdk.controller.v;

/* loaded from: classes6.dex */
public class h extends FrameLayout implements Pc {

    /* renamed from: a, reason: collision with root package name */
    private Context f8575a;
    private v b;
    private final InterfaceC4673u7 c;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup windowDecorViewGroup = h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.addView(h.this);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup windowDecorViewGroup = h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.removeView(h.this);
            }
        }
    }

    public h(Context context) {
        super(context);
        this.c = Ib.a0().a();
        this.f8575a = context;
        setClickable(true);
    }

    private void b() {
        ((Activity) this.f8575a).runOnUiThread(new b());
    }

    private int getNavigationBarPadding() {
        Activity activity = (Activity) this.f8575a;
        try {
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getDrawingRect(rect);
            Rect rect2 = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (this.c.A(activity) == 1) {
                int i = rect.bottom - rect2.bottom;
                if (i > 0) {
                    return i;
                }
                return 0;
            }
            int i2 = rect.right - rect2.right;
            if (i2 > 0) {
                return i2;
            }
            return 0;
        } catch (Exception e) {
            C4491k4.d().a(e);
            return 0;
        }
    }

    private int getStatusBarHeight() {
        int identifier;
        try {
            Context context = this.f8575a;
            if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
                return this.f8575a.getResources().getDimensionPixelSize(identifier);
            }
        } catch (Exception e) {
            C4491k4.d().a(e);
        }
        return 0;
    }

    private int getStatusBarPadding() {
        int statusBarHeight;
        if ((((Activity) this.f8575a).getWindow().getAttributes().flags & 1024) == 0 && (statusBarHeight = getStatusBarHeight()) > 0) {
            return statusBarHeight;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getWindowDecorViewGroup() {
        Activity activity = (Activity) this.f8575a;
        if (activity != null) {
            return (ViewGroup) activity.getWindow().getDecorView();
        }
        return null;
    }

    public void a(v vVar) {
        this.b = vVar;
        vVar.a(this);
        this.b.H();
        this.f8575a = this.b.q();
        a(getStatusBarPadding(), getNavigationBarPadding());
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.I();
        this.b.b(true, U3.i.Z);
    }

    @Override // com.ironsource.Pc
    public boolean onBackButtonPressed() {
        return C4704w2.a().a((Activity) this.f8575a);
    }

    @Override // com.ironsource.Pc
    public void onCloseRequested() {
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.E();
        this.b.b(false, U3.i.Z);
        v vVar = this.b;
        if (vVar != null) {
            vVar.a(v.EnumC1342v.Gone);
            this.b.F();
            this.b.G();
        }
        removeAllViews();
    }

    @Override // com.ironsource.Pc
    public void onOrientationChanged(String str, int i) {
    }

    private void a() {
        ((Activity) this.f8575a).runOnUiThread(new a());
    }

    private void a(int i, int i2) {
        try {
            Context context = this.f8575a;
            if (context != null) {
                int A = this.c.A(context);
                if (A == 1) {
                    setPadding(0, i, 0, i2);
                } else if (A == 2) {
                    setPadding(0, i, i2, 0);
                }
            }
        } catch (Exception e) {
            C4491k4.d().a(e);
        }
    }
}
