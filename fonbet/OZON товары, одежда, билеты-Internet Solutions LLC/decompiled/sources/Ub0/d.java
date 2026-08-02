package Ub0;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class d {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d Armenian;
    public static final d Azerbaijani;
    public static final d Chinese;

    @NotNull
    public static final a Companion;
    public static final d English;
    public static final d Kazakhstan;
    public static final d Mongolian;
    public static final d Russian;
    public static final d Swahili;
    public static final d Tajik;
    public static final d Turkish;
    public static final d Turkmen;
    public static final d Uzbekistan;

    @NotNull
    private final String headerTag;

    @NotNull
    private final Locale resourceLocale;

    public static final class a {
    }

    static {
        Locale locale = new Locale("ru");
        d dVar = new d("Russian", 0, locale, locale.toLanguageTag());
        Russian = dVar;
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        d dVar2 = new d(1, "English", ENGLISH);
        English = dVar2;
        Locale locale2 = new Locale("tr");
        d dVar3 = new d("Turkish", 2, locale2, locale2.toLanguageTag());
        Turkish = dVar3;
        Locale CHINESE = Locale.CHINESE;
        Intrinsics.checkNotNullExpressionValue(CHINESE, "CHINESE");
        d dVar4 = new d("Chinese", 3, CHINESE, "zh-Hans");
        Chinese = dVar4;
        Locale forLanguageTag = Locale.forLanguageTag("uz-Latn");
        Intrinsics.checkNotNullExpressionValue(forLanguageTag, "forLanguageTag(...)");
        d dVar5 = new d(4, "Uzbekistan", forLanguageTag);
        Uzbekistan = dVar5;
        Locale locale3 = new Locale("kk");
        d dVar6 = new d("Kazakhstan", 5, locale3, locale3.toLanguageTag());
        Kazakhstan = dVar6;
        Locale locale4 = new Locale("hy");
        d dVar7 = new d("Armenian", 6, locale4, locale4.toLanguageTag());
        Armenian = dVar7;
        Locale locale5 = new Locale("tg");
        d dVar8 = new d("Tajik", 7, locale5, locale5.toLanguageTag());
        Tajik = dVar8;
        Locale locale6 = new Locale("mn");
        d dVar9 = new d("Mongolian", 8, locale6, locale6.toLanguageTag());
        Mongolian = dVar9;
        Locale forLanguageTag2 = Locale.forLanguageTag("az-Latn");
        Intrinsics.checkNotNullExpressionValue(forLanguageTag2, "forLanguageTag(...)");
        d dVar10 = new d(9, "Azerbaijani", forLanguageTag2);
        Azerbaijani = dVar10;
        Locale locale7 = new Locale("tk");
        d dVar11 = new d("Turkmen", 10, locale7, locale7.toLanguageTag());
        Turkmen = dVar11;
        Locale locale8 = new Locale("sw");
        d dVar12 = new d("Swahili", 11, locale8, locale8.toLanguageTag());
        Swahili = dVar12;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12};
        $VALUES = dVarArr;
        $ENTRIES = Xc.b.a(dVarArr);
        Companion = new a();
    }

    private d(String str, int i11, Locale locale, String str2) {
        this.resourceLocale = locale;
        this.headerTag = str2;
    }

    @NotNull
    public static Xc.a<d> a() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    @NotNull
    public final String b() {
        return this.headerTag;
    }

    @NotNull
    public final Locale d() {
        return this.resourceLocale;
    }

    /* synthetic */ d(int i11, String str, Locale locale) {
        this(str, i11, locale, locale.toLanguageTag());
    }
}
