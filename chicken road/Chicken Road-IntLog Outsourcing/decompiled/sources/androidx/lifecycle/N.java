package androidx.lifecycle;

import a.AbstractC0169a;
import a0.C0175f;
import a0.InterfaceC0174e;
import android.os.Bundle;
import f4.C0434k;
import java.util.Map;

/* loaded from: classes.dex */
public final class N implements InterfaceC0174e {

    /* renamed from: a, reason: collision with root package name */
    public final C0175f f4543a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4544b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f4545c;

    /* renamed from: d, reason: collision with root package name */
    public final C0434k f4546d;

    public N(C0175f savedStateRegistry, Z z) {
        kotlin.jvm.internal.i.e(savedStateRegistry, "savedStateRegistry");
        this.f4543a = savedStateRegistry;
        this.f4546d = AbstractC0169a.A(new M.U(5, z));
    }

    @Override // a0.InterfaceC0174e
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4545c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((O) this.f4546d.getValue()).f4547a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a6 = ((J) entry.getValue()).f4536e.a();
            if (!kotlin.jvm.internal.i.a(a6, Bundle.EMPTY)) {
                bundle.putBundle(str, a6);
            }
        }
        this.f4544b = false;
        return bundle;
    }

    public final void b() {
        if (this.f4544b) {
            return;
        }
        Bundle a6 = this.f4543a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4545c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (a6 != null) {
            bundle.putAll(a6);
        }
        this.f4545c = bundle;
        this.f4544b = true;
    }
}
