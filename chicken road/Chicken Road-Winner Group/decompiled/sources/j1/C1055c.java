package j1;

import java.util.Collections;
import java.util.Map;

/* renamed from: j1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1055c {

    /* renamed from: a, reason: collision with root package name */
    public final String f9526a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f9527b;

    public C1055c(String str, Map map) {
        this.f9526a = str;
        this.f9527b = map;
    }

    public static C1055c a(String str) {
        return new C1055c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1055c)) {
            return false;
        }
        C1055c c1055c = (C1055c) obj;
        return this.f9526a.equals(c1055c.f9526a) && this.f9527b.equals(c1055c.f9527b);
    }

    public final int hashCode() {
        return this.f9527b.hashCode() + (this.f9526a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f9526a + ", properties=" + this.f9527b.values() + "}";
    }
}
