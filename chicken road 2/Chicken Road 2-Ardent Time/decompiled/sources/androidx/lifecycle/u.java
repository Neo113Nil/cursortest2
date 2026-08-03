package androidx.lifecycle;

/* loaded from: classes.dex */
public final class u extends android.app.Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2411b = 0;

    /* renamed from: a, reason: collision with root package name */
    public Z0.h f2412a;

    public final void a(androidx.lifecycle.d dVar) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            android.app.Activity activity = getActivity();
            kotlin.jvm.internal.i.d(activity, "activity");
            Q1.d.i(activity, dVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        a(androidx.lifecycle.d.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(androidx.lifecycle.d.ON_DESTROY);
        this.f2412a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(androidx.lifecycle.d.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        Z0.h hVar = this.f2412a;
        if (hVar != null) {
            ((androidx.lifecycle.r) hVar.f1903b).c();
        }
        a(androidx.lifecycle.d.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        Z0.h hVar = this.f2412a;
        if (hVar != null) {
            androidx.lifecycle.r rVar = (androidx.lifecycle.r) hVar.f1903b;
            int i2 = rVar.f2403a + 1;
            rVar.f2403a = i2;
            if (i2 == 1 && rVar.f2406d) {
                rVar.f2408f.d(androidx.lifecycle.d.ON_START);
                rVar.f2406d = false;
            }
        }
        a(androidx.lifecycle.d.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(androidx.lifecycle.d.ON_STOP);
    }
}
