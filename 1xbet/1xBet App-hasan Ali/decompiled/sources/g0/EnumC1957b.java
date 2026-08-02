package g0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1957b {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC1957b f17015k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC1957b f17016l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC1957b f17017m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ EnumC1957b[] f17018n;

    static {
        EnumC1957b enumC1957b = new EnumC1957b("None", 0);
        f17015k = enumC1957b;
        EnumC1957b enumC1957b2 = new EnumC1957b("Cancelled", 1);
        f17016l = enumC1957b2;
        EnumC1957b enumC1957b3 = new EnumC1957b("Redirected", 2);
        f17017m = enumC1957b3;
        f17018n = new EnumC1957b[]{enumC1957b, enumC1957b2, enumC1957b3, new EnumC1957b("RedirectCancelled", 3)};
    }

    public static EnumC1957b valueOf(String str) {
        return (EnumC1957b) Enum.valueOf(EnumC1957b.class, str);
    }

    public static EnumC1957b[] values() {
        return (EnumC1957b[]) f17018n.clone();
    }
}
