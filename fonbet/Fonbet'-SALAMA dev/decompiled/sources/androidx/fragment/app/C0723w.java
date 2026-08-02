package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.EnumC0739m;

/* renamed from: androidx.fragment.app.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0723w implements G0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9546a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9547b;

    public /* synthetic */ C0723w(Object obj, int i7) {
        this.f9546a = i7;
        this.f9547b = obj;
    }

    @Override // G0.e
    public final Bundle a() {
        switch (this.f9546a) {
            case 0:
                A a2 = (A) this.f9547b;
                a2.markFragmentsCreated();
                a2.mFragmentLifecycleRegistry.e(EnumC0739m.ON_STOP);
                return new Bundle();
            default:
                return ((Q) this.f9547b).V();
        }
    }
}
