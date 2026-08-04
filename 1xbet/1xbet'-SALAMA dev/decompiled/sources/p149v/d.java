package p149v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f16918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f16919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f16920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f16921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d[] f16922e;

    static {
        d dVar = new d("FIXED", 0);
        f16918a = dVar;
        d dVar2 = new d("WRAP_CONTENT", 1);
        f16919b = dVar2;
        d dVar3 = new d("MATCH_CONSTRAINT", 2);
        f16920c = dVar3;
        d dVar4 = new d("MATCH_PARENT", 3);
        f16921d = dVar4;
        f16922e = new d[]{dVar, dVar2, dVar3, dVar4};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f16922e.clone();
    }
}
