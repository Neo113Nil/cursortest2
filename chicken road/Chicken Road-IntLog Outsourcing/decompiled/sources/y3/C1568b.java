package y3;

import b2.AbstractC0279e;

/* renamed from: y3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1568b {

    /* renamed from: a, reason: collision with root package name */
    public final int f12382a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12383b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12384c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12385d;

    public C1568b(int i2, int i3, int i6, String str) {
        this.f12382a = i2;
        this.f12383b = i3;
        this.f12384c = i6;
        this.f12385d = str;
    }

    public static C1568b a(String str, int i2, int i3) {
        return new C1568b(i2, i3, C1569c.b(i2 << 3), str);
    }

    public final String b() {
        return this.f12385d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1568b)) {
            return false;
        }
        C1568b c1568b = (C1568b) obj;
        return this.f12382a == c1568b.f12382a && this.f12383b == c1568b.f12383b && this.f12384c == c1568b.f12384c && this.f12385d.equals(c1568b.f12385d);
    }

    public final int hashCode() {
        return this.f12385d.hashCode() ^ ((((((this.f12382a ^ 1000003) * 1000003) ^ this.f12383b) * 1000003) ^ this.f12384c) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProtoFieldInfo{fieldNumber=");
        sb.append(this.f12382a);
        sb.append(", tag=");
        sb.append(this.f12383b);
        sb.append(", tagSize=");
        sb.append(this.f12384c);
        sb.append(", jsonName=");
        return AbstractC0279e.h(sb, this.f12385d, "}");
    }
}
