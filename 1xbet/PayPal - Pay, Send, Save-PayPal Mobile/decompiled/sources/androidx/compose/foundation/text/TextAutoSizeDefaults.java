package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/compose/foundation/text/TextAutoSizeDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/TextUnit;", "MinFontSize", "J", "getMinFontSize-XSAIIZE", "()J", "MaxFontSize", "getMaxFontSize-XSAIIZE"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextAutoSizeDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.foundation.text.TextAutoSizeDefaults INSTANCE = new androidx.compose.foundation.text.TextAutoSizeDefaults();
    private static final long MinFontSize = androidx.compose.ui.unit.TextUnitKt.getSp(12);
    private static final long MaxFontSize = androidx.compose.ui.unit.TextUnitKt.getSp(112);

    private TextAutoSizeDefaults() {
    }

    /* renamed from: getMinFontSize-XSAIIZE, reason: not valid java name */
    public final long m2095getMinFontSizeXSAIIZE() {
        return MinFontSize;
    }

    /* renamed from: getMaxFontSize-XSAIIZE, reason: not valid java name */
    public final long m2094getMaxFontSizeXSAIIZE() {
        return MaxFontSize;
    }
}
