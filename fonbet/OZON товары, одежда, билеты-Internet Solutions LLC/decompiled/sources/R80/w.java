package R80;

import java.util.Set;
import java.util.regex.Pattern;
import kotlin.collections.C7705l;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class w {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w APVZ;
    public static final w BANK;
    public static final w CHECKOUT;
    public static final w RKO;

    @NotNull
    private final String bxHost;

    @NotNull
    private final Set<Pattern> prodPatterns;

    @NotNull
    private final Set<Pattern> qaPatterns;

    @NotNull
    private final Set<String> schemes;

    static {
        Pattern compile = Pattern.compile("https://finance\\.ozonru\\.me/business");
        Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
        Pattern a11 = C8060b.a(compile);
        Pattern compile2 = Pattern.compile("https://ozon-stg\\.ozonru\\.me/fintech/business");
        Intrinsics.checkNotNullExpressionValue(compile2, "compile(...)");
        Pattern a12 = C8060b.a(compile2);
        Pattern compile3 = Pattern.compile("https://localhost\\.ozonru\\.me");
        Intrinsics.checkNotNullExpressionValue(compile3, "compile(...)");
        Pattern[] elements = {a11, a12, C8060b.a(compile3)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set j02 = C7705l.j0(elements);
        Pattern compile4 = Pattern.compile("https://finance\\.ozon\\.ru/business");
        Intrinsics.checkNotNullExpressionValue(compile4, "compile(...)");
        Pattern a13 = C8060b.a(compile4);
        Pattern compile5 = Pattern.compile("https://ozon\\.ru/fintech/business");
        Intrinsics.checkNotNullExpressionValue(compile5, "compile(...)");
        Pattern[] elements2 = {a13, C8060b.a(compile5)};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        Set j03 = C7705l.j0(elements2);
        String[] elements3 = {"http", "https", "ozonbanksme"};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        w wVar = new w("RKO", 0, j02, j03, C7705l.j0(elements3), "rko");
        RKO = wVar;
        Pattern compile6 = Pattern.compile("https://finance\\.ozonru\\.me(?!/business)");
        Intrinsics.checkNotNullExpressionValue(compile6, "compile(...)");
        Pattern a14 = C8060b.a(compile6);
        Pattern compile7 = Pattern.compile("https://ozon-stg\\.ozonru\\.me/fintech(?!/business)");
        Intrinsics.checkNotNullExpressionValue(compile7, "compile(...)");
        Pattern a15 = C8060b.a(compile7);
        Pattern compile8 = Pattern.compile("https://localhost\\.ozonru\\.me");
        Intrinsics.checkNotNullExpressionValue(compile8, "compile(...)");
        Pattern[] elements4 = {a14, a15, C8060b.a(compile8)};
        Intrinsics.checkNotNullParameter(elements4, "elements");
        Set j04 = C7705l.j0(elements4);
        Pattern compile9 = Pattern.compile("https://finance\\.ozon\\.ru(?!/business)");
        Intrinsics.checkNotNullExpressionValue(compile9, "compile(...)");
        Pattern a16 = C8060b.a(compile9);
        Pattern compile10 = Pattern.compile("https://ozon\\.ru/fintech(?!/business)");
        Intrinsics.checkNotNullExpressionValue(compile10, "compile(...)");
        Pattern[] elements5 = {a16, C8060b.a(compile10)};
        Intrinsics.checkNotNullParameter(elements5, "elements");
        Set j05 = C7705l.j0(elements5);
        String[] elements6 = {"http", "https", "ozonbank"};
        Intrinsics.checkNotNullParameter(elements6, "elements");
        w wVar2 = new w("BANK", 1, j04, j05, C7705l.j0(elements6), "bank");
        BANK = wVar2;
        Pattern compile11 = Pattern.compile("https://meet\\.finance\\.ozonru\\.me");
        Intrinsics.checkNotNullExpressionValue(compile11, "compile(...)");
        Pattern a17 = C8060b.a(compile11);
        Pattern compile12 = Pattern.compile("https://localhost\\.ozonru\\.me");
        Intrinsics.checkNotNullExpressionValue(compile12, "compile(...)");
        Pattern[] elements7 = {a17, C8060b.a(compile12)};
        Intrinsics.checkNotNullParameter(elements7, "elements");
        Set j06 = C7705l.j0(elements7);
        Pattern compile13 = Pattern.compile("https://meet\\.finance\\.ozon\\.ru");
        Intrinsics.checkNotNullExpressionValue(compile13, "compile(...)");
        Set h11 = e0.h(C8060b.a(compile13));
        String[] elements8 = {"http", "https", "ozoncheck"};
        Intrinsics.checkNotNullParameter(elements8, "elements");
        w wVar3 = new w("APVZ", 2, j06, h11, C7705l.j0(elements8), "apvz");
        APVZ = wVar3;
        Pattern compile14 = Pattern.compile("https://checkout\\.ozonru\\.me");
        Intrinsics.checkNotNullExpressionValue(compile14, "compile(...)");
        Pattern a18 = C8060b.a(compile14);
        Pattern compile15 = Pattern.compile("https://localhost\\.checkout\\.ozonru\\.me(:?)(\\d*)");
        Intrinsics.checkNotNullExpressionValue(compile15, "compile(...)");
        Pattern a19 = C8060b.a(compile15);
        Pattern compile16 = Pattern.compile("https://localhost\\.ozonru\\.me");
        Intrinsics.checkNotNullExpressionValue(compile16, "compile(...)");
        Pattern[] elements9 = {a18, a19, C8060b.a(compile16)};
        Intrinsics.checkNotNullParameter(elements9, "elements");
        Set j07 = C7705l.j0(elements9);
        Pattern compile17 = Pattern.compile("https://checkout\\.ozon\\.ru");
        Intrinsics.checkNotNullExpressionValue(compile17, "compile(...)");
        Set h12 = e0.h(C8060b.a(compile17));
        String[] elements10 = {"http", "https"};
        Intrinsics.checkNotNullParameter(elements10, "elements");
        w wVar4 = new w("CHECKOUT", 3, j07, h12, C7705l.j0(elements10), "fintech_checkout");
        CHECKOUT = wVar4;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4};
        $VALUES = wVarArr;
        $ENTRIES = Xc.b.a(wVarArr);
    }

    private w(String str, int i11, Set set, Set set2, Set set3, String str2) {
        this.qaPatterns = set;
        this.prodPatterns = set2;
        this.schemes = set3;
        this.bxHost = str2;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }

    @NotNull
    public final String a() {
        return this.bxHost;
    }

    @NotNull
    public final Set<Pattern> b(boolean z11) {
        return z11 ? e0.f(this.qaPatterns, this.prodPatterns) : this.prodPatterns;
    }

    @NotNull
    public final Set<String> d() {
        return this.schemes;
    }
}
