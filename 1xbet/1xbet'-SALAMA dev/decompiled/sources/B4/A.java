package B4;

import E4.EnumC0176i;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class A extends B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0074s f1069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC0176i f1070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1071c;

    public A(C0074s c0074s, EnumC0176i enumC0176i, Object obj) {
        this.f1069a = c0074s;
        this.f1070b = enumC0176i;
        this.f1071c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || A.class != obj.getClass()) {
            return false;
        }
        A a2 = (A) obj;
        return this.f1070b == a2.f1070b && Objects.equals(this.f1069a, a2.f1069a) && Objects.equals(this.f1071c, a2.f1071c);
    }

    public final int hashCode() {
        C0074s c0074s = this.f1069a;
        int iHashCode = (c0074s != null ? c0074s.f1192a.hashCode() : 0) * 31;
        EnumC0176i enumC0176i = this.f1070b;
        int iHashCode2 = (iHashCode + (enumC0176i != null ? enumC0176i.hashCode() : 0)) * 31;
        Object obj = this.f1071c;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }
}
