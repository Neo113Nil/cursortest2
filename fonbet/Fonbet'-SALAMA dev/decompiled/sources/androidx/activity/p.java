package androidx.activity;

import A1.K0;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0741o;
import androidx.lifecycle.C0747v;
import androidx.lifecycle.EnumC0739m;
import androidx.lifecycle.InterfaceC0745t;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;

/* loaded from: classes.dex */
public class p extends Dialog implements InterfaceC0745t, B, G0.h {

    /* renamed from: a, reason: collision with root package name */
    public C0747v f8111a;

    /* renamed from: b, reason: collision with root package name */
    public final G0.g f8112b;

    /* renamed from: c, reason: collision with root package name */
    public final A f8113c;

    public p(Context context, int i7) {
        super(context, i7);
        this.f8112b = new G0.g(this);
        this.f8113c = new A(new K0(this, 21));
    }

    public static void a(p pVar) {
        t6.h.e(pVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t6.h.e(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public final C0747v b() {
        C0747v c0747v = this.f8111a;
        if (c0747v != null) {
            return c0747v;
        }
        C0747v c0747v2 = new C0747v(this);
        this.f8111a = c0747v2;
        return c0747v2;
    }

    public final void c() {
        Window window = getWindow();
        t6.h.b(window);
        View decorView = window.getDecorView();
        t6.h.d(decorView, "window!!.decorView");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        t6.h.b(window2);
        View decorView2 = window2.getDecorView();
        t6.h.d(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        t6.h.b(window3);
        View decorView3 = window3.getDecorView();
        t6.h.d(decorView3, "window!!.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.lifecycle.InterfaceC0745t
    public final AbstractC0741o getLifecycle() {
        return b();
    }

    @Override // androidx.activity.B
    public final A getOnBackPressedDispatcher() {
        return this.f8113c;
    }

    @Override // G0.h
    public final G0.f getSavedStateRegistry() {
        return this.f8112b.f2847b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f8113c.a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            t6.h.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            A a2 = this.f8113c;
            a2.getClass();
            a2.f8084e = onBackInvokedDispatcher;
            a2.b(a2.f8086g);
        }
        this.f8112b.b(bundle);
        b().e(EnumC0739m.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        t6.h.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f8112b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        b().e(EnumC0739m.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().e(EnumC0739m.ON_DESTROY);
        this.f8111a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i7) {
        c();
        super.setContentView(i7);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        t6.h.e(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t6.h.e(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
