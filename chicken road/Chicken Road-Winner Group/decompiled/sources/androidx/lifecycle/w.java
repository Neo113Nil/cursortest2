package androidx.lifecycle;

import K.T;
import android.os.Bundle;
import d2.C0277g;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class w implements V.d {

    /* renamed from: a, reason: collision with root package name */
    public final V.e f2337a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2338b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f2339c;

    /* renamed from: d, reason: collision with root package name */
    public final C0277g f2340d;

    public w(V.e savedStateRegistry, A a3) {
        kotlin.jvm.internal.j.e(savedStateRegistry, "savedStateRegistry");
        this.f2337a = savedStateRegistry;
        this.f2340d = new C0277g(new T(2, a3));
    }

    @Override // V.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2339c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((x) this.f2340d.a()).f2343c.entrySet().iterator();
        if (!it.hasNext()) {
            this.f2338b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getValue().getClass();
        throw new ClassCastException();
    }
}
