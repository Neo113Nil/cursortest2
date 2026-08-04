package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: renamed from: androidx.fragment.app.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0696p extends C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0698s f9475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0697q f9476b;

    public C0696p(DialogInterfaceOnCancelListenerC0697q dialogInterfaceOnCancelListenerC0697q, C0698s c0698s) {
        this.f9476b = dialogInterfaceOnCancelListenerC0697q;
        this.f9475a = c0698s;
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
