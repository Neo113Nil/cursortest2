package E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f2242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f2243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ w[] f2244c;

    static {
        w wVar = new w("ADDED", 0);
        f2242a = wVar;
        w wVar2 = new w("REMOVED", 1);
        f2243b = wVar2;
        f2244c = new w[]{wVar, wVar2};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f2244c.clone();
    }
}
