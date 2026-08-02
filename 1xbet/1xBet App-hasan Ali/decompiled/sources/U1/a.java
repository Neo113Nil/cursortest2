package U1;

import W3.h;
import X3.m;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.l;
import t3.AbstractC2425d;
import v3.g;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f5849a;

    public a(g gVar) {
        l.f("registry", gVar);
        this.f5849a = new LinkedHashSet();
        gVar.C("androidx.savedstate.Restarter", this);
    }

    @Override // U1.d
    public final Bundle a() {
        Bundle l5 = AbstractC2425d.l((h[]) Arrays.copyOf(new h[0], 0));
        List m02 = m.m0(this.f5849a);
        l5.putStringArrayList("classes_to_restore", m02 instanceof ArrayList ? (ArrayList) m02 : new ArrayList<>(m02));
        return l5;
    }
}
