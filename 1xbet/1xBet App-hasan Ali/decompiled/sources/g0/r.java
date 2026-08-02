package g0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: k, reason: collision with root package name */
    public static final r f17054k;

    /* renamed from: l, reason: collision with root package name */
    public static final r f17055l;

    /* renamed from: m, reason: collision with root package name */
    public static final r f17056m;

    /* renamed from: n, reason: collision with root package name */
    public static final r f17057n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ r[] f17058o;

    static {
        r rVar = new r("Active", 0);
        f17054k = rVar;
        r rVar2 = new r("ActiveParent", 1);
        f17055l = rVar2;
        r rVar3 = new r("Captured", 2);
        f17056m = rVar3;
        r rVar4 = new r("Inactive", 3);
        f17057n = rVar4;
        f17058o = new r[]{rVar, rVar2, rVar3, rVar4};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f17058o.clone();
    }

    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return false;
                }
                throw new D2.e();
            }
        }
        return true;
    }
}
