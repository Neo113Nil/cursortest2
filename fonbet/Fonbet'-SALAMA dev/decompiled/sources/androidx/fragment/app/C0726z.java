package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC0741o;

/* renamed from: androidx.fragment.app.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0726z extends C implements G.m, androidx.lifecycle.Y, androidx.activity.B, G0.h, U {

    /* renamed from: a, reason: collision with root package name */
    public final A f9551a;

    /* renamed from: b, reason: collision with root package name */
    public final A f9552b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f9553c;

    /* renamed from: d, reason: collision with root package name */
    public final S f9554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A f9555e;

    public C0726z(A a2) {
        this.f9555e = a2;
        Handler handler = new Handler();
        this.f9551a = a2;
        this.f9552b = a2;
        this.f9553c = handler;
        this.f9554d = new S();
    }

    @Override // androidx.fragment.app.U
    public final void a(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v) {
        this.f9555e.onAttachFragment(abstractComponentCallbacksC0722v);
    }

    @Override // G.m
    public final void addOnConfigurationChangedListener(O.a aVar) {
        this.f9555e.addOnConfigurationChangedListener(aVar);
    }

    @Override // androidx.fragment.app.C
    public final View b(int i7) {
        return this.f9555e.findViewById(i7);
    }

    @Override // androidx.fragment.app.C
    public final boolean c() {
        Window window = this.f9555e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.lifecycle.InterfaceC0745t
    public final AbstractC0741o getLifecycle() {
        return this.f9555e.mFragmentLifecycleRegistry;
    }

    @Override // androidx.activity.B
    public final androidx.activity.A getOnBackPressedDispatcher() {
        return this.f9555e.getOnBackPressedDispatcher();
    }

    @Override // G0.h
    public final G0.f getSavedStateRegistry() {
        return this.f9555e.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.Y
    public final androidx.lifecycle.X getViewModelStore() {
        return this.f9555e.getViewModelStore();
    }

    @Override // G.m
    public final void removeOnConfigurationChangedListener(O.a aVar) {
        this.f9555e.removeOnConfigurationChangedListener(aVar);
    }
}
