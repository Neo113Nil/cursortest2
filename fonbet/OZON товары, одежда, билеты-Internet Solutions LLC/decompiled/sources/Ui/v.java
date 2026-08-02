package Ui;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    private final int f27822a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27823b;

    public v(int i11, int i12) {
        this.f27822a = i11;
        this.f27823b = i12;
    }

    public static v a(v vVar, int i11) {
        return new v(i11, vVar.f27823b);
    }

    public final int b() {
        return this.f27823b;
    }

    public final int c() {
        return this.f27822a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f27822a == vVar.f27822a && this.f27823b == vVar.f27823b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27823b) + (Integer.hashCode(this.f27822a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RestoreScrollTarget(position=");
        sb2.append(this.f27822a);
        sb2.append(", offset=");
        return K00.b.e(this.f27823b, ")", sb2);
    }
}
