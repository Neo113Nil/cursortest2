package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class A extends AbstractViewOnTouchListenerC0634o0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ I f8174A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f8175B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(AppCompatSpinner appCompatSpinner, AppCompatSpinner appCompatSpinner2, I i7) {
        super(appCompatSpinner2);
        this.f8175B = appCompatSpinner;
        this.f8174A = i7;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0634o0
    public final p086m.B b() {
        return this.f8174A;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0634o0
    public final boolean c() {
        AppCompatSpinner appCompatSpinner = this.f8175B;
        if (appCompatSpinner.getInternalPopup().b()) {
            return true;
        }
        appCompatSpinner.f8302f.m(C.b(appCompatSpinner), C.a(appCompatSpinner));
        return true;
    }
}
