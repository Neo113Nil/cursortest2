package Ve;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class Z8 implements Bk {

    /* renamed from: a, reason: collision with root package name */
    public static final Z8 f30577a;

    /* renamed from: b, reason: collision with root package name */
    public static final Z8 f30578b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Z8[] f30579c;

    static {
        Z8 z82 = new Z8("BY_SYSTEM", 0);
        f30577a = z82;
        Z8 z83 = new Z8("BY_USER", 1);
        f30578b = z83;
        f30579c = new Z8[]{z82, z83};
    }

    public static Z8 valueOf(String str) {
        return (Z8) Enum.valueOf(Z8.class, str);
    }

    public static Z8[] values() {
        return (Z8[]) f30579c.clone();
    }
}
