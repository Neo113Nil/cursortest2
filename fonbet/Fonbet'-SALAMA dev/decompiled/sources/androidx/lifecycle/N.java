package androidx.lifecycle;

import android.os.Bundle;
import f6.C1114g;
import java.util.Map;

/* loaded from: classes.dex */
public final class N implements G0.e {

    /* renamed from: a, reason: collision with root package name */
    public final G0.f f9584a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9585b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f9586c;

    /* renamed from: d, reason: collision with root package name */
    public final C1114g f9587d;

    public N(G0.f fVar, Y y4) {
        t6.h.e(fVar, "savedStateRegistry");
        this.f9584a = fVar;
        this.f9587d = Y4.D.C(new U0.i(y4, 1));
    }

    @Override // G0.e
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f9586c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((O) this.f9587d.getValue()).f9588d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a2 = ((J) entry.getValue()).f9577e.a();
            if (!t6.h.a(a2, Bundle.EMPTY)) {
                bundle.putBundle(str, a2);
            }
        }
        this.f9585b = false;
        return bundle;
    }

    public final void b() {
        if (this.f9585b) {
            return;
        }
        Bundle a2 = this.f9584a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f9586c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (a2 != null) {
            bundle.putAll(a2);
        }
        this.f9586c = bundle;
        this.f9585b = true;
    }
}
