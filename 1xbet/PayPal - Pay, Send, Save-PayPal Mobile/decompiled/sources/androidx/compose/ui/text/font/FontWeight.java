package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u000e"}, d2 = {"Landroidx/compose/ui/text/font/FontWeight;", "", "", "weight", "<init>", "(I)V", "other", "compareTo", "(Landroidx/compose/ui/text/font/FontWeight;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getWeight", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontWeight implements java.lang.Comparable<androidx.compose.ui.text.font.FontWeight> {
    public static final int $stable = 0;
    private static final androidx.compose.ui.text.font.FontWeight Black;
    private static final androidx.compose.ui.text.font.FontWeight Bold;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.font.FontWeight.Companion INSTANCE = new androidx.compose.ui.text.font.FontWeight.Companion(null);
    private static final androidx.compose.ui.text.font.FontWeight ExtraBold;
    private static final androidx.compose.ui.text.font.FontWeight ExtraLight;
    private static final androidx.compose.ui.text.font.FontWeight Light;
    private static final androidx.compose.ui.text.font.FontWeight Medium;
    private static final androidx.compose.ui.text.font.FontWeight Normal;
    private static final androidx.compose.ui.text.font.FontWeight SemiBold;
    private static final androidx.compose.ui.text.font.FontWeight Thin;
    private static final androidx.compose.ui.text.font.FontWeight W100;
    private static final androidx.compose.ui.text.font.FontWeight W200;
    private static final androidx.compose.ui.text.font.FontWeight W300;
    private static final androidx.compose.ui.text.font.FontWeight W400;
    private static final androidx.compose.ui.text.font.FontWeight W500;
    private static final androidx.compose.ui.text.font.FontWeight W600;
    private static final androidx.compose.ui.text.font.FontWeight W700;
    private static final androidx.compose.ui.text.font.FontWeight W800;
    private static final androidx.compose.ui.text.font.FontWeight W900;
    private static final java.util.List<androidx.compose.ui.text.font.FontWeight> values;
    private final int weight;

    public FontWeight(int i) {
        this.weight = i;
        if (i <= 0 || i >= 1001) {
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("Font weight can be in range [1, 1000]. Current value: ".concat(java.lang.String.valueOf(i)));
        }
    }

    public final int getWeight() {
        return this.weight;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u0010\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0016\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR\u001d\u0010\u0019\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR\u001d\u0010\u001c\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR\u001d\u0010\u001f\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\bR\u001d\u0010\"\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\"\u0010\u0006\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\bR\u001d\u0010%\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b%\u0010\u0006\u0012\u0004\b'\u0010\u0003\u001a\u0004\b&\u0010\bR\u001d\u0010(\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b(\u0010\u0006\u0012\u0004\b*\u0010\u0003\u001a\u0004\b)\u0010\bR\u001d\u0010+\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b+\u0010\u0006\u0012\u0004\b-\u0010\u0003\u001a\u0004\b,\u0010\bR\u001d\u0010.\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b.\u0010\u0006\u0012\u0004\b0\u0010\u0003\u001a\u0004\b/\u0010\bR\u001d\u00101\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b1\u0010\u0006\u0012\u0004\b3\u0010\u0003\u001a\u0004\b2\u0010\bR\u001d\u00104\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b4\u0010\u0006\u0012\u0004\b6\u0010\u0003\u001a\u0004\b5\u0010\bR\u001d\u00107\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b7\u0010\u0006\u0012\u0004\b9\u0010\u0003\u001a\u0004\b8\u0010\bR\u001d\u0010:\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b:\u0010\u0006\u0012\u0004\b<\u0010\u0003\u001a\u0004\b;\u0010\bR \u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040=8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A"}, d2 = {"Landroidx/compose/ui/text/font/FontWeight$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/FontWeight;", "W100", "Landroidx/compose/ui/text/font/FontWeight;", "getW100", "()Landroidx/compose/ui/text/font/FontWeight;", "getW100$annotations", "W200", "getW200", "getW200$annotations", "W300", "getW300", "getW300$annotations", "W400", "getW400", "getW400$annotations", "W500", "getW500", "getW500$annotations", "W600", "getW600", "getW600$annotations", "W700", "getW700", "getW700$annotations", "W800", "getW800", "getW800$annotations", "W900", "getW900", "getW900$annotations", "Thin", "getThin", "getThin$annotations", "ExtraLight", "getExtraLight", "getExtraLight$annotations", "Light", "getLight", "getLight$annotations", "Normal", "getNormal", "getNormal$annotations", "Medium", "getMedium", "getMedium$annotations", "SemiBold", "getSemiBold", "getSemiBold$annotations", "Bold", "getBold", "getBold$annotations", "ExtraBold", "getExtraBold", "getExtraBold$annotations", "Black", "getBlack", "getBlack$annotations", "", "values", "Ljava/util/List;", "getValues$ui_text", "()Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getBlack$annotations() {
        }

        public static /* synthetic */ void getBold$annotations() {
        }

        public static /* synthetic */ void getExtraBold$annotations() {
        }

        public static /* synthetic */ void getExtraLight$annotations() {
        }

        public static /* synthetic */ void getLight$annotations() {
        }

        public static /* synthetic */ void getMedium$annotations() {
        }

        public static /* synthetic */ void getNormal$annotations() {
        }

        public static /* synthetic */ void getSemiBold$annotations() {
        }

        public static /* synthetic */ void getThin$annotations() {
        }

        public static /* synthetic */ void getW100$annotations() {
        }

        public static /* synthetic */ void getW200$annotations() {
        }

        public static /* synthetic */ void getW300$annotations() {
        }

        public static /* synthetic */ void getW400$annotations() {
        }

        public static /* synthetic */ void getW500$annotations() {
        }

        public static /* synthetic */ void getW600$annotations() {
        }

        public static /* synthetic */ void getW700$annotations() {
        }

        public static /* synthetic */ void getW800$annotations() {
        }

        public static /* synthetic */ void getW900$annotations() {
        }

        private Companion() {
        }

        public final androidx.compose.ui.text.font.FontWeight getW100() {
            return androidx.compose.ui.text.font.FontWeight.W100;
        }

        public final androidx.compose.ui.text.font.FontWeight getW200() {
            return androidx.compose.ui.text.font.FontWeight.W200;
        }

        public final androidx.compose.ui.text.font.FontWeight getW300() {
            return androidx.compose.ui.text.font.FontWeight.W300;
        }

        public final androidx.compose.ui.text.font.FontWeight getW400() {
            return androidx.compose.ui.text.font.FontWeight.W400;
        }

        public final androidx.compose.ui.text.font.FontWeight getW500() {
            return androidx.compose.ui.text.font.FontWeight.W500;
        }

        public final androidx.compose.ui.text.font.FontWeight getW600() {
            return androidx.compose.ui.text.font.FontWeight.W600;
        }

        public final androidx.compose.ui.text.font.FontWeight getW700() {
            return androidx.compose.ui.text.font.FontWeight.W700;
        }

        public final androidx.compose.ui.text.font.FontWeight getW800() {
            return androidx.compose.ui.text.font.FontWeight.W800;
        }

        public final androidx.compose.ui.text.font.FontWeight getW900() {
            return androidx.compose.ui.text.font.FontWeight.W900;
        }

        public final androidx.compose.ui.text.font.FontWeight getThin() {
            return androidx.compose.ui.text.font.FontWeight.Thin;
        }

        public final androidx.compose.ui.text.font.FontWeight getExtraLight() {
            return androidx.compose.ui.text.font.FontWeight.ExtraLight;
        }

        public final androidx.compose.ui.text.font.FontWeight getLight() {
            return androidx.compose.ui.text.font.FontWeight.Light;
        }

        public final androidx.compose.ui.text.font.FontWeight getNormal() {
            return androidx.compose.ui.text.font.FontWeight.Normal;
        }

        public final androidx.compose.ui.text.font.FontWeight getMedium() {
            return androidx.compose.ui.text.font.FontWeight.Medium;
        }

        public final androidx.compose.ui.text.font.FontWeight getSemiBold() {
            return androidx.compose.ui.text.font.FontWeight.SemiBold;
        }

        public final androidx.compose.ui.text.font.FontWeight getBold() {
            return androidx.compose.ui.text.font.FontWeight.Bold;
        }

        public final androidx.compose.ui.text.font.FontWeight getExtraBold() {
            return androidx.compose.ui.text.font.FontWeight.ExtraBold;
        }

        public final androidx.compose.ui.text.font.FontWeight getBlack() {
            return androidx.compose.ui.text.font.FontWeight.Black;
        }

        public final java.util.List<androidx.compose.ui.text.font.FontWeight> getValues$ui_text() {
            return androidx.compose.ui.text.font.FontWeight.values;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        androidx.compose.ui.text.font.FontWeight fontWeight = new androidx.compose.ui.text.font.FontWeight(100);
        W100 = fontWeight;
        androidx.compose.ui.text.font.FontWeight fontWeight2 = new androidx.compose.ui.text.font.FontWeight(200);
        W200 = fontWeight2;
        androidx.compose.ui.text.font.FontWeight fontWeight3 = new androidx.compose.ui.text.font.FontWeight(300);
        W300 = fontWeight3;
        androidx.compose.ui.text.font.FontWeight fontWeight4 = new androidx.compose.ui.text.font.FontWeight(400);
        W400 = fontWeight4;
        androidx.compose.ui.text.font.FontWeight fontWeight5 = new androidx.compose.ui.text.font.FontWeight(500);
        W500 = fontWeight5;
        androidx.compose.ui.text.font.FontWeight fontWeight6 = new androidx.compose.ui.text.font.FontWeight(600);
        W600 = fontWeight6;
        androidx.compose.ui.text.font.FontWeight fontWeight7 = new androidx.compose.ui.text.font.FontWeight(700);
        W700 = fontWeight7;
        androidx.compose.ui.text.font.FontWeight fontWeight8 = new androidx.compose.ui.text.font.FontWeight(com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP);
        W800 = fontWeight8;
        androidx.compose.ui.text.font.FontWeight fontWeight9 = new androidx.compose.ui.text.font.FontWeight(900);
        W900 = fontWeight9;
        Thin = fontWeight;
        ExtraLight = fontWeight2;
        Light = fontWeight3;
        Normal = fontWeight4;
        Medium = fontWeight5;
        SemiBold = fontWeight6;
        Bold = fontWeight7;
        ExtraBold = fontWeight8;
        Black = fontWeight9;
        values = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.text.font.FontWeight[]{fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8, fontWeight9});
    }

    @Override // java.lang.Comparable
    public final int compareTo(androidx.compose.ui.text.font.FontWeight other) {
        return kotlin.jvm.internal.Intrinsics.compare(this.weight, other.weight);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.ui.text.font.FontWeight) && this.weight == ((androidx.compose.ui.text.font.FontWeight) other).weight;
    }

    public final int hashCode() {
        return this.weight;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FontWeight(weight=");
        sb.append(this.weight);
        sb.append(')');
        return sb.toString();
    }
}
