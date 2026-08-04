package Y4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K0 f7700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final K0 f7701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final K0 f7702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final K0 f7703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final K0 f7704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ K0[] f7705f;

    static {
        K0 k7 = new K0("UPDATE", 0);
        f7700a = k7;
        K0 k8 = new K0("DELETE", 1);
        f7701b = k8;
        K0 k9 = new K0("VERIFY", 2);
        f7702c = k9;
        K0 k10 = new K0("TRANSFORM", 3);
        f7703d = k10;
        K0 k11 = new K0("OPERATION_NOT_SET", 4);
        f7704e = k11;
        f7705f = new K0[]{k7, k8, k9, k10, k11};
    }

    public static K0 valueOf(String str) {
        return (K0) Enum.valueOf(K0.class, str);
    }

    public static K0[] values() {
        return (K0[]) f7705f.clone();
    }
}
