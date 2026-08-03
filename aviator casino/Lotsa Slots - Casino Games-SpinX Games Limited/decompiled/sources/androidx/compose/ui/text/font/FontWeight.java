package androidx.compose.ui.text.font;

/* compiled from: FontWeight.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/font/FontWeight;", "", com.helpshift.proactive.InAppViewConstants.WEIGHT, "", "(I)V", "getWeight", "()I", "compareTo", "other", "equals", "", "", "hashCode", "toString", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
        if (1 > i || i >= 1001) {
            throw new java.lang.IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i).toString());
        }
    }

    public final int getWeight() {
        return this.weight;
    }

    /* compiled from: FontWeight.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007R\u001c\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007R\u001c\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0007R\u001c\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0007R\u001c\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u0007R\u001c\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0007R\u001c\u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u0007R\u001c\u0010 \u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0002\u001a\u0004\b\"\u0010\u0007R\u001c\u0010#\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010\u0007R\u001c\u0010&\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0002\u001a\u0004\b(\u0010\u0007R\u001c\u0010)\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0002\u001a\u0004\b+\u0010\u0007R\u001c\u0010,\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u0002\u001a\u0004\b.\u0010\u0007R\u001c\u0010/\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u0002\u001a\u0004\b1\u0010\u0007R\u001c\u00102\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\u0002\u001a\u0004\b4\u0010\u0007R\u001c\u00105\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010\u0002\u001a\u0004\b7\u0010\u0007R\u001c\u00108\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010\u0002\u001a\u0004\b:\u0010\u0007R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040<X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Landroidx/compose/ui/text/font/FontWeight$Companion;", "", "()V", "Black", "Landroidx/compose/ui/text/font/FontWeight;", "getBlack$annotations", "getBlack", "()Landroidx/compose/ui/text/font/FontWeight;", "Bold", "getBold$annotations", "getBold", "ExtraBold", "getExtraBold$annotations", "getExtraBold", "ExtraLight", "getExtraLight$annotations", "getExtraLight", "Light", "getLight$annotations", "getLight", "Medium", "getMedium$annotations", "getMedium", "Normal", "getNormal$annotations", "getNormal", "SemiBold", "getSemiBold$annotations", "getSemiBold", "Thin", "getThin$annotations", "getThin", "W100", "getW100$annotations", "getW100", "W200", "getW200$annotations", "getW200", "W300", "getW300$annotations", "getW300", "W400", "getW400$annotations", "getW400", "W500", "getW500$annotations", "getW500", "W600", "getW600$annotations", "getW600", "W700", "getW700$annotations", "getW700", "W800", "getW800$annotations", "getW800", "W900", "getW900$annotations", "getW900", "values", "", "getValues$ui_text_release", "()Ljava/util/List;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

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

        public final java.util.List<androidx.compose.ui.text.font.FontWeight> getValues$ui_text_release() {
            return androidx.compose.ui.text.font.FontWeight.values;
        }
    }

    static {
        androidx.compose.ui.text.font.FontWeight fontWeight = new androidx.compose.ui.text.font.FontWeight(100);
        W100 = fontWeight;
        androidx.compose.ui.text.font.FontWeight fontWeight2 = new androidx.compose.ui.text.font.FontWeight(200);
        W200 = fontWeight2;
        androidx.compose.ui.text.font.FontWeight fontWeight3 = new androidx.compose.ui.text.font.FontWeight(androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis);
        W300 = fontWeight3;
        androidx.compose.ui.text.font.FontWeight fontWeight4 = new androidx.compose.ui.text.font.FontWeight(400);
        W400 = fontWeight4;
        androidx.compose.ui.text.font.FontWeight fontWeight5 = new androidx.compose.ui.text.font.FontWeight(500);
        W500 = fontWeight5;
        androidx.compose.ui.text.font.FontWeight fontWeight6 = new androidx.compose.ui.text.font.FontWeight(600);
        W600 = fontWeight6;
        androidx.compose.ui.text.font.FontWeight fontWeight7 = new androidx.compose.ui.text.font.FontWeight(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED);
        W700 = fontWeight7;
        androidx.compose.ui.text.font.FontWeight fontWeight8 = new androidx.compose.ui.text.font.FontWeight(800);
        W800 = fontWeight8;
        androidx.compose.ui.text.font.FontWeight fontWeight9 = new androidx.compose.ui.text.font.FontWeight(androidx.datastore.preferences.protobuf.DescriptorProtos.Edition.EDITION_LEGACY_VALUE);
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
    public int compareTo(androidx.compose.ui.text.font.FontWeight other) {
        return kotlin.jvm.internal.Intrinsics.compare(this.weight, other.weight);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.ui.text.font.FontWeight) && this.weight == ((androidx.compose.ui.text.font.FontWeight) other).weight;
    }

    public int hashCode() {
        return this.weight;
    }

    public java.lang.String toString() {
        return "FontWeight(weight=" + this.weight + ')';
    }
}
