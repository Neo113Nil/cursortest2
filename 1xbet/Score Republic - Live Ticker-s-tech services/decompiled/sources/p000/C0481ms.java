package p000;

/* JADX INFO: renamed from: ms */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0481ms {

    /* JADX INFO: renamed from: a */
    public final cz0 f5152a;

    /* JADX INFO: renamed from: b */
    public final int f5153b;

    /* JADX INFO: renamed from: c */
    public final int f5154c;

    public C0481ms(cz0 cz0Var, int i, int i2) {
        kd0.m3010f(cz0Var, "Null dependency anInterface.");
        this.f5152a = cz0Var;
        this.f5153b = i;
        this.f5154c = i2;
    }

    /* JADX INFO: renamed from: a */
    public static C0481ms m3429a(Class cls) {
        return new C0481ms(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0481ms)) {
            return false;
        }
        C0481ms c0481ms = (C0481ms) obj;
        return this.f5152a.equals(c0481ms.f5152a) && this.f5153b == c0481ms.f5153b && this.f5154c == c0481ms.f5154c;
    }

    public final int hashCode() {
        return this.f5154c ^ ((((this.f5152a.hashCode() ^ 1000003) * 1000003) ^ this.f5153b) * 1000003);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f5152a);
        sb.append(", type=");
        int i = this.f5153b;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.f5154c;
        if (i2 == 0) {
            str2 = "direct";
        } else if (i2 == 1) {
            str2 = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(j11.m2773h("Unsupported injection: ", i2));
            }
            str2 = "deferred";
        }
        return AbstractC0024an.m285h(sb, str2, "}");
    }

    public C0481ms(int i, int i2, Class cls) {
        this(cz0.m1050a(cls), i, i2);
    }
}
