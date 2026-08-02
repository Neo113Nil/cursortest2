package V0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: k, reason: collision with root package name */
    public static final j f5940k;

    /* renamed from: l, reason: collision with root package name */
    public static final j f5941l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ j[] f5942m;

    static {
        j jVar = new j("Ltr", 0);
        f5940k = jVar;
        j jVar2 = new j("Rtl", 1);
        f5941l = jVar2;
        f5942m = new j[]{jVar, jVar2};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f5942m.clone();
    }
}
