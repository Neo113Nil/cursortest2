package D1;

import Q1.j;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f924a = new LinkedHashMap();

    public abstract Object a(j jVar);

    public final boolean equals(Object obj) {
        return (obj instanceof b) && l.a(this.f924a, ((b) obj).f924a);
    }

    public final int hashCode() {
        return this.f924a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f924a + ')';
    }
}
