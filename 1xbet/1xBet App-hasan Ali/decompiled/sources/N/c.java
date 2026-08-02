package N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: k, reason: collision with root package name */
    public static final c f3668k;

    /* renamed from: l, reason: collision with root package name */
    public static final c f3669l;

    /* renamed from: m, reason: collision with root package name */
    public static final c f3670m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ c[] f3671n;

    static {
        c cVar = new c("Focused", 0);
        f3668k = cVar;
        c cVar2 = new c("UnfocusedEmpty", 1);
        f3669l = cVar2;
        c cVar3 = new c("UnfocusedNotEmpty", 2);
        f3670m = cVar3;
        f3671n = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f3671n.clone();
    }
}
