package W0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: k, reason: collision with root package name */
    public static final m f6016k;

    /* renamed from: l, reason: collision with root package name */
    public static final m f6017l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ m[] f6018m;

    static {
        m mVar = new m("Ltr", 0);
        f6016k = mVar;
        m mVar2 = new m("Rtl", 1);
        f6017l = mVar2;
        f6018m = new m[]{mVar, mVar2};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f6018m.clone();
    }
}
