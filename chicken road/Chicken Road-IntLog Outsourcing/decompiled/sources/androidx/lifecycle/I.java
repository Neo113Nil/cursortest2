package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class I extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4529b = 0;

    /* renamed from: a, reason: collision with root package name */
    public V0.j f4530a;

    public final void a(EnumC0243m enumC0243m) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            kotlin.jvm.internal.i.d(activity, "activity");
            M.d(activity, enumC0243m);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0243m.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0243m.ON_DESTROY);
        this.f4530a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0243m.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        V0.j jVar = this.f4530a;
        if (jVar != null) {
            ((F) jVar.f3212b).a();
        }
        a(EnumC0243m.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        V0.j jVar = this.f4530a;
        if (jVar != null) {
            F f3 = (F) jVar.f3212b;
            int i2 = f3.f4521a + 1;
            f3.f4521a = i2;
            if (i2 == 1 && f3.f4524d) {
                f3.f4526f.e(EnumC0243m.ON_START);
                f3.f4524d = false;
            }
        }
        a(EnumC0243m.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0243m.ON_STOP);
    }
}
