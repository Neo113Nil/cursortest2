package E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class O {

    /* renamed from: k, reason: collision with root package name */
    public static final O f1064k;

    /* renamed from: l, reason: collision with root package name */
    public static final O f1065l;

    /* renamed from: m, reason: collision with root package name */
    public static final O f1066m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ O[] f1067n;

    static {
        O o5 = new O("None", 0);
        f1064k = o5;
        O o6 = new O("Selection", 1);
        f1065l = o6;
        O o7 = new O("Cursor", 2);
        f1066m = o7;
        f1067n = new O[]{o5, o6, o7};
    }

    public static O valueOf(String str) {
        return (O) Enum.valueOf(O.class, str);
    }

    public static O[] values() {
        return (O[]) f1067n.clone();
    }
}
