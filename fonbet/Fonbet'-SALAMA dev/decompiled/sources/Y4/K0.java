package Y4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class K0 {

    /* renamed from: a, reason: collision with root package name */
    public static final K0 f7700a;

    /* renamed from: b, reason: collision with root package name */
    public static final K0 f7701b;

    /* renamed from: c, reason: collision with root package name */
    public static final K0 f7702c;

    /* renamed from: d, reason: collision with root package name */
    public static final K0 f7703d;

    /* renamed from: e, reason: collision with root package name */
    public static final K0 f7704e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ K0[] f7705f;

    static {
        K0 k02 = new K0("UPDATE", 0);
        f7700a = k02;
        K0 k03 = new K0("DELETE", 1);
        f7701b = k03;
        K0 k04 = new K0("VERIFY", 2);
        f7702c = k04;
        K0 k05 = new K0("TRANSFORM", 3);
        f7703d = k05;
        K0 k06 = new K0("OPERATION_NOT_SET", 4);
        f7704e = k06;
        f7705f = new K0[]{k02, k03, k04, k05, k06};
    }

    public static K0 valueOf(String str) {
        return (K0) Enum.valueOf(K0.class, str);
    }

    public static K0[] values() {
        return (K0[]) f7705f.clone();
    }
}
