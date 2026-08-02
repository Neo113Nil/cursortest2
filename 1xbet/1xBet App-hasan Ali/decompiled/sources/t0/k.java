package t0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: k, reason: collision with root package name */
    public static final k f19489k;

    /* renamed from: l, reason: collision with root package name */
    public static final k f19490l;

    /* renamed from: m, reason: collision with root package name */
    public static final k f19491m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ k[] f19492n;

    static {
        k kVar = new k("Initial", 0);
        f19489k = kVar;
        k kVar2 = new k("Main", 1);
        f19490l = kVar2;
        k kVar3 = new k("Final", 2);
        f19491m = kVar3;
        f19492n = new k[]{kVar, kVar2, kVar3};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f19492n.clone();
    }
}
