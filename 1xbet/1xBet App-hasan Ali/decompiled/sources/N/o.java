package N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: k, reason: collision with root package name */
    public static final o f3715k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ o[] f3716l;

    /* JADX INFO: Fake field, exist only in values array */
    o EF2;

    static {
        o oVar = new o("Filled", 0);
        o oVar2 = new o("Outlined", 1);
        f3715k = oVar2;
        f3716l = new o[]{oVar, oVar2};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f3716l.clone();
    }
}
