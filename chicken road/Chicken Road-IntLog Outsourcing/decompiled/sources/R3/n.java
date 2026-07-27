package R3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f2634a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f2635b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f2636c;

    /* renamed from: d, reason: collision with root package name */
    public static final n f2637d;

    /* renamed from: e, reason: collision with root package name */
    public static final n f2638e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ n[] f2639f;

    static {
        n nVar = new n("COUNTER", 0);
        f2634a = nVar;
        n nVar2 = new n("UP_DOWN_COUNTER", 1);
        f2635b = nVar2;
        n nVar3 = new n("HISTOGRAM", 2);
        f2636c = nVar3;
        n nVar4 = new n("OBSERVABLE_COUNTER", 3);
        n nVar5 = new n("OBSERVABLE_UP_DOWN_COUNTER", 4);
        n nVar6 = new n("OBSERVABLE_GAUGE", 5);
        f2637d = nVar6;
        n nVar7 = new n("GAUGE", 6);
        f2638e = nVar7;
        f2639f = new n[]{nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f2639f.clone();
    }
}
