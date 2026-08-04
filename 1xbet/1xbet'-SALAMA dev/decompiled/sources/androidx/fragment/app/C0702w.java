package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.EnumC0718m;

/* JADX INFO: renamed from: androidx.fragment.app.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0702w implements G0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9547b;

    public /* synthetic */ C0702w(Object obj, int i7) {
        this.f9546a = i7;
        this.f9547b = obj;
    }

    @Override // G0.e
    public final Bundle a() {
        switch (this.f9546a) {
            case 0:
                A a2 = (A) this.f9547b;
                a2.markFragmentsCreated();
                a2.mFragmentLifecycleRegistry.e(EnumC0718m.ON_STOP);
                return new Bundle();
            default:
                return ((Q) this.f9547b).V();
        }
    }
}
