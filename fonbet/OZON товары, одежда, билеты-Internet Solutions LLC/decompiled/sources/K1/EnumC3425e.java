package K1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: K1.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class EnumC3425e {
    private static final /* synthetic */ EnumC3425e[] $VALUES;
    public static final EnumC3425e Clickable;
    public static final EnumC3425e Link;
    public static final EnumC3425e Paragraph;
    public static final EnumC3425e Span;
    public static final EnumC3425e String;
    public static final EnumC3425e Url;
    public static final EnumC3425e VerbatimTts;

    static {
        EnumC3425e enumC3425e = new EnumC3425e("Paragraph", 0);
        Paragraph = enumC3425e;
        EnumC3425e enumC3425e2 = new EnumC3425e("Span", 1);
        Span = enumC3425e2;
        EnumC3425e enumC3425e3 = new EnumC3425e("VerbatimTts", 2);
        VerbatimTts = enumC3425e3;
        EnumC3425e enumC3425e4 = new EnumC3425e("Url", 3);
        Url = enumC3425e4;
        EnumC3425e enumC3425e5 = new EnumC3425e("Link", 4);
        Link = enumC3425e5;
        EnumC3425e enumC3425e6 = new EnumC3425e("Clickable", 5);
        Clickable = enumC3425e6;
        EnumC3425e enumC3425e7 = new EnumC3425e("String", 6);
        String = enumC3425e7;
        $VALUES = new EnumC3425e[]{enumC3425e, enumC3425e2, enumC3425e3, enumC3425e4, enumC3425e5, enumC3425e6, enumC3425e7};
    }

    private EnumC3425e() {
        throw null;
    }

    public static EnumC3425e valueOf(String str) {
        return (EnumC3425e) Enum.valueOf(EnumC3425e.class, str);
    }

    public static EnumC3425e[] values() {
        return (EnumC3425e[]) $VALUES.clone();
    }
}
