package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0487p {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0487p f7058k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0487p f7059l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC0487p f7060m;

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC0487p f7061n;

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC0487p f7062o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ EnumC0487p[] f7063p;

    static {
        EnumC0487p enumC0487p = new EnumC0487p("DESTROYED", 0);
        f7058k = enumC0487p;
        EnumC0487p enumC0487p2 = new EnumC0487p("INITIALIZED", 1);
        f7059l = enumC0487p2;
        EnumC0487p enumC0487p3 = new EnumC0487p("CREATED", 2);
        f7060m = enumC0487p3;
        EnumC0487p enumC0487p4 = new EnumC0487p("STARTED", 3);
        f7061n = enumC0487p4;
        EnumC0487p enumC0487p5 = new EnumC0487p("RESUMED", 4);
        f7062o = enumC0487p5;
        f7063p = new EnumC0487p[]{enumC0487p, enumC0487p2, enumC0487p3, enumC0487p4, enumC0487p5};
    }

    public static EnumC0487p valueOf(String str) {
        return (EnumC0487p) Enum.valueOf(EnumC0487p.class, str);
    }

    public static EnumC0487p[] values() {
        return (EnumC0487p[]) f7063p.clone();
    }
}
