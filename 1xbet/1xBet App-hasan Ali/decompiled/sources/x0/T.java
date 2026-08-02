package x0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class T {

    /* renamed from: k, reason: collision with root package name */
    public static final T f20963k;

    /* renamed from: l, reason: collision with root package name */
    public static final T f20964l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ T[] f20965m;

    static {
        T t5 = new T("Width", 0);
        f20963k = t5;
        T t6 = new T("Height", 1);
        f20964l = t6;
        f20965m = new T[]{t5, t6};
    }

    public static T valueOf(String str) {
        return (T) Enum.valueOf(T.class, str);
    }

    public static T[] values() {
        return (T[]) f20965m.clone();
    }
}
