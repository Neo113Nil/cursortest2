package P;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class T {

    /* renamed from: k, reason: collision with root package name */
    public static final T f4396k;

    /* renamed from: l, reason: collision with root package name */
    public static final T f4397l;

    /* renamed from: m, reason: collision with root package name */
    public static final T f4398m;

    /* renamed from: n, reason: collision with root package name */
    public static final T f4399n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ T[] f4400o;

    static {
        T t5 = new T("IGNORED", 0);
        f4396k = t5;
        T t6 = new T("SCHEDULED", 1);
        f4397l = t6;
        T t7 = new T("DEFERRED", 2);
        f4398m = t7;
        T t8 = new T("IMMINENT", 3);
        f4399n = t8;
        f4400o = new T[]{t5, t6, t7, t8};
    }

    public static T valueOf(String str) {
        return (T) Enum.valueOf(T.class, str);
    }

    public static T[] values() {
        return (T[]) f4400o.clone();
    }
}
