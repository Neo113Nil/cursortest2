package androidx.appcompat.widget;

import m.InterfaceC1414B;

/* loaded from: classes.dex */
public final class A extends AbstractViewOnTouchListenerC0655o0 {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ I f8174A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f8175B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(AppCompatSpinner appCompatSpinner, AppCompatSpinner appCompatSpinner2, I i7) {
        super(appCompatSpinner2);
        this.f8175B = appCompatSpinner;
        this.f8174A = i7;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0655o0
    public final InterfaceC1414B b() {
        return this.f8174A;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0655o0
    public final boolean c() {
        AppCompatSpinner appCompatSpinner = this.f8175B;
        if (appCompatSpinner.getInternalPopup().b()) {
            return true;
        }
        appCompatSpinner.f8302f.m(C.b(appCompatSpinner), C.a(appCompatSpinner));
        return true;
    }
}
