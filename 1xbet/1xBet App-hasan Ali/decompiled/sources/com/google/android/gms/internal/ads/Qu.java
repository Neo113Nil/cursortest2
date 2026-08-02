package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* loaded from: classes.dex */
public abstract class Qu {

    /* renamed from: k, reason: collision with root package name */
    public transient Fu f11283k;

    /* renamed from: l, reason: collision with root package name */
    public transient Pu f11284l;

    /* renamed from: m, reason: collision with root package name */
    public transient Eu f11285m;

    public final Map a() {
        Eu eu = this.f11285m;
        if (eu != null) {
            return eu;
        }
        C1581sv c1581sv = (C1581sv) this;
        Map map = c1581sv.f15613n;
        Eu gu = map instanceof NavigableMap ? new Gu(c1581sv, (NavigableMap) map) : map instanceof SortedMap ? new Ku(c1581sv, (SortedMap) map) : new Eu(c1581sv, map);
        this.f11285m = gu;
        return gu;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Qu) {
            return a().equals(((Qu) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return ((Eu) a()).f8625m.hashCode();
    }

    public final String toString() {
        return ((Eu) a()).f8625m.toString();
    }
}
