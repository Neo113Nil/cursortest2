package t0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: k, reason: collision with root package name */
    public static final w f19525k;

    /* renamed from: l, reason: collision with root package name */
    public static final w f19526l;

    /* renamed from: m, reason: collision with root package name */
    public static final w f19527m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ w[] f19528n;

    static {
        w wVar = new w("Unknown", 0);
        f19525k = wVar;
        w wVar2 = new w("Dispatching", 1);
        f19526l = wVar2;
        w wVar3 = new w("NotDispatching", 2);
        f19527m = wVar3;
        f19528n = new w[]{wVar, wVar2, wVar3};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f19528n.clone();
    }
}
