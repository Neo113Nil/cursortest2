package K4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f4072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f4073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f4074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f4075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f4076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x f4077f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ x[] f4078x;

    static {
        x xVar = new x("Initial", 0);
        f4072a = xVar;
        x xVar2 = new x("Starting", 1);
        f4073b = xVar2;
        x xVar3 = new x("Open", 2);
        f4074c = xVar3;
        x xVar4 = new x("Healthy", 3);
        f4075d = xVar4;
        x xVar5 = new x("Error", 4);
        f4076e = xVar5;
        x xVar6 = new x("Backoff", 5);
        f4077f = xVar6;
        f4078x = new x[]{xVar, xVar2, xVar3, xVar4, xVar5, xVar6};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f4078x.clone();
    }
}
