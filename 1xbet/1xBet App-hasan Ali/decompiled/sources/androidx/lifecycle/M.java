package androidx.lifecycle;

import A0.N0;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import t3.AbstractC2425d;

/* loaded from: classes.dex */
public final class M implements U1.d {

    /* renamed from: a, reason: collision with root package name */
    public final v3.g f7023a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7024b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f7025c;

    /* renamed from: d, reason: collision with root package name */
    public final W3.m f7026d;

    public M(v3.g gVar, Y y5) {
        kotlin.jvm.internal.l.f("savedStateRegistry", gVar);
        this.f7023a = gVar;
        this.f7026d = G4.d.E(new O3.l(10, y5));
    }

    @Override // U1.d
    public final Bundle a() {
        Bundle l5 = AbstractC2425d.l((W3.h[]) Arrays.copyOf(new W3.h[0], 0));
        Bundle bundle = this.f7025c;
        if (bundle != null) {
            l5.putAll(bundle);
        }
        for (Map.Entry entry : ((N) this.f7026d.getValue()).f7027a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a5 = ((N0) ((J) entry.getValue()).f7015b.f5046p).a();
            if (!a5.isEmpty()) {
                kotlin.jvm.internal.l.f("key", str);
                l5.putBundle(str, a5);
            }
        }
        this.f7024b = false;
        return l5;
    }

    public final void b() {
        if (this.f7024b) {
            return;
        }
        Bundle u5 = this.f7023a.u("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle l5 = AbstractC2425d.l((W3.h[]) Arrays.copyOf(new W3.h[0], 0));
        Bundle bundle = this.f7025c;
        if (bundle != null) {
            l5.putAll(bundle);
        }
        if (u5 != null) {
            l5.putAll(u5);
        }
        this.f7025c = l5;
        this.f7024b = true;
    }
}
