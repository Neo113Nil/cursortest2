package o1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f10154a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f10155b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f10156c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e[] f10157d;

    static {
        e eVar = new e("VIDEO_CONTROLS", 0);
        f10154a = eVar;
        e eVar2 = new e("CLOSE_AD", 1);
        f10155b = eVar2;
        e eVar3 = new e("NOT_VISIBLE", 2);
        e eVar4 = new e("OTHER", 3);
        f10156c = eVar4;
        f10157d = new e[]{eVar, eVar2, eVar3, eVar4};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f10157d.clone();
    }
}
