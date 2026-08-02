package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* renamed from: androidx.fragment.app.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0717p extends C {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0719s f9475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0718q f9476b;

    public C0717p(DialogInterfaceOnCancelListenerC0718q dialogInterfaceOnCancelListenerC0718q, C0719s c0719s) {
        this.f9476b = dialogInterfaceOnCancelListenerC0718q;
        this.f9475a = c0719s;
    }

    @Override // androidx.fragment.app.C
    public final View b(int i7) {
        this.f9475a.c();
        Dialog dialog = this.f9476b.f9486s0;
        if (dialog != null) {
            return dialog.findViewById(i7);
        }
        return null;
    }

    @Override // androidx.fragment.app.C
    public final boolean c() {
        this.f9475a.c();
        return this.f9476b.f9490w0;
    }
}
