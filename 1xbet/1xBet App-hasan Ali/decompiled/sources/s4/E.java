package s4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class E {

    /* renamed from: k, reason: collision with root package name */
    public static final E f19227k;

    /* renamed from: l, reason: collision with root package name */
    public static final E f19228l;

    /* renamed from: m, reason: collision with root package name */
    public static final E f19229m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ E[] f19230n;

    static {
        E e3 = new E("START", 0);
        f19227k = e3;
        E e5 = new E("STOP", 1);
        f19228l = e5;
        E e6 = new E("STOP_AND_RESET_REPLAY_CACHE", 2);
        f19229m = e6;
        f19230n = new E[]{e3, e5, e6};
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f19230n.clone();
    }
}
