package p155w1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: w1.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1038t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1038t1 f17869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1038t1 f17870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC1038t1 f17871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC1038t1 f17872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC1038t1 f17873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC1038t1 f17874f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final EnumC1038t1 f17875x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ EnumC1038t1[] f17876y;

    static {
        EnumC1038t1 enumC1038t1 = new EnumC1038t1("CORE", 0);
        f17869a = enumC1038t1;
        EnumC1038t1 enumC1038t2 = new EnumC1038t1("DATA_PROCESSOR", 1);
        f17870b = enumC1038t2;
        EnumC1038t1 enumC1038t3 = new EnumC1038t1("PROVIDER", 2);
        f17871c = enumC1038t3;
        EnumC1038t1 enumC1038t4 = new EnumC1038t1("PUBLIC_API", 3);
        f17872d = enumC1038t4;
        EnumC1038t1 enumC1038t5 = new EnumC1038t1("REPORTS", 4);
        f17873e = enumC1038t5;
        EnumC1038t1 enumC1038t6 = new EnumC1038t1("CONFIG", 5);
        f17874f = enumC1038t6;
        EnumC1038t1 enumC1038t7 = new EnumC1038t1("MISC", 6);
        f17875x = enumC1038t7;
        f17876y = new EnumC1038t1[]{enumC1038t1, enumC1038t2, enumC1038t3, enumC1038t4, enumC1038t5, enumC1038t6, enumC1038t7};
    }

    public static EnumC1038t1 valueOf(String str) {
        return (EnumC1038t1) Enum.valueOf(EnumC1038t1.class, str);
    }

    public static EnumC1038t1[] values() {
        return (EnumC1038t1[]) f17876y.clone();
    }
}
