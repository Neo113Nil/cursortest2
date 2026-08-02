package androidx.compose.ui.text.style;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087@\u0018\u0000 !2\u00020\u0001:\u0004!\"#$B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fJ+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0018\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0005R\u0014\u0010\u001d\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0005R\u0011\u0010\t\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0005R\u0011\u0010\u000b\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b \u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak;", "", "", com.daon.sdk.face.license.License.FEATURE_MASK, "constructor-impl", "(I)I", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "strategy", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "strictness", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "wordBreak", "(III)I", "copy-gijOMQM", "(IIII)I", "copy", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getStrategy-fcGXIks", "getStrictness-usljTpc", "getWordBreak-jp8hJ3c", "Companion", "Strategy", "Strictness", "WordBreak"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class LineBreak {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.style.LineBreak.Companion INSTANCE = new androidx.compose.ui.text.style.LineBreak.Companion(null);
    private static final int Heading;
    private static final int Paragraph;
    private static final int Simple;
    private static final int Unspecified;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8342constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8347equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ LineBreak(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8343constructorimpl(int i, int i2, int i3) {
        int highSpeedVideoSizes;
        highSpeedVideoSizes = androidx.compose.ui.text.style.LineBreak_androidKt.getHighSpeedVideoSizes(i, i2, i3);
        return m8342constructorimpl(highSpeedVideoSizes);
    }

    /* renamed from: getStrategy-fcGXIks, reason: not valid java name */
    public static final int m8348getStrategyfcGXIks(int i) {
        int highResolutionOutputSizeshNQ4ISI;
        highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.text.style.LineBreak_androidKt.getHighResolutionOutputSizeshNQ4ISI(i);
        return androidx.compose.ui.text.style.LineBreak.Strategy.m8363constructorimpl(highResolutionOutputSizeshNQ4ISI);
    }

    /* renamed from: getStrictness-usljTpc, reason: not valid java name */
    public static final int m8349getStrictnessusljTpc(int i) {
        int highSpeedVideoFpsRanges;
        highSpeedVideoFpsRanges = androidx.compose.ui.text.style.LineBreak_androidKt.getHighSpeedVideoFpsRanges(i);
        return androidx.compose.ui.text.style.LineBreak.Strictness.m8374constructorimpl(highSpeedVideoFpsRanges);
    }

    /* renamed from: getWordBreak-jp8hJ3c, reason: not valid java name */
    public static final int m8350getWordBreakjp8hJ3c(int i) {
        int Camera2StreamConfigurationMap;
        Camera2StreamConfigurationMap = androidx.compose.ui.text.style.LineBreak_androidKt.Camera2StreamConfigurationMap(i);
        return androidx.compose.ui.text.style.LineBreak.WordBreak.m8386constructorimpl(Camera2StreamConfigurationMap);
    }

    /* renamed from: copy-gijOMQM$default, reason: not valid java name */
    public static /* synthetic */ int m8345copygijOMQM$default(int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i2 = m8348getStrategyfcGXIks(i);
        }
        if ((i5 & 2) != 0) {
            i3 = m8349getStrictnessusljTpc(i);
        }
        if ((i5 & 4) != 0) {
            i4 = m8350getWordBreakjp8hJ3c(i);
        }
        return m8344copygijOMQM(i, i2, i3, i4);
    }

    /* renamed from: copy-gijOMQM, reason: not valid java name */
    public static final int m8344copygijOMQM(int i, int i2, int i3, int i4) {
        return m8343constructorimpl(i2, i3, i4);
    }

    public final java.lang.String toString() {
        return m8352toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8352toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LineBreak(strategy=");
        sb.append((java.lang.Object) androidx.compose.ui.text.style.LineBreak.Strategy.m8367toStringimpl(m8348getStrategyfcGXIks(i)));
        sb.append(", strictness=");
        sb.append((java.lang.Object) androidx.compose.ui.text.style.LineBreak.Strictness.m8378toStringimpl(m8349getStrictnessusljTpc(i)));
        sb.append(", wordBreak=");
        sb.append((java.lang.Object) androidx.compose.ui.text.style.LineBreak.WordBreak.m8390toStringimpl(m8350getWordBreakjp8hJ3c(i)));
        sb.append(')');
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u0010\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\b"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/LineBreak;", "Simple", com.visa.cbp.getEncExpo.warmup, "getSimple-rAG3T2k", "()I", "getSimple-rAG3T2k$annotations", "Heading", "getHeading-rAG3T2k", "getHeading-rAG3T2k$annotations", "Paragraph", "getParagraph-rAG3T2k", "getParagraph-rAG3T2k$annotations", "Unspecified", "getUnspecified-rAG3T2k", "getUnspecified-rAG3T2k$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* renamed from: getHeading-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m8354getHeadingrAG3T2k$annotations() {
        }

        /* renamed from: getParagraph-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m8355getParagraphrAG3T2k$annotations() {
        }

        /* renamed from: getSimple-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m8356getSimplerAG3T2k$annotations() {
        }

        /* renamed from: getUnspecified-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m8357getUnspecifiedrAG3T2k$annotations() {
        }

        private Companion() {
        }

        /* renamed from: getSimple-rAG3T2k, reason: not valid java name */
        public final int m8360getSimplerAG3T2k() {
            return androidx.compose.ui.text.style.LineBreak.Simple;
        }

        /* renamed from: getHeading-rAG3T2k, reason: not valid java name */
        public final int m8358getHeadingrAG3T2k() {
            return androidx.compose.ui.text.style.LineBreak.Heading;
        }

        /* renamed from: getParagraph-rAG3T2k, reason: not valid java name */
        public final int m8359getParagraphrAG3T2k() {
            return androidx.compose.ui.text.style.LineBreak.Paragraph;
        }

        /* renamed from: getUnspecified-rAG3T2k, reason: not valid java name */
        public final int m8361getUnspecifiedrAG3T2k() {
            return androidx.compose.ui.text.style.LineBreak.Unspecified;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int highSpeedVideoSizes;
        int highSpeedVideoSizes2;
        int highSpeedVideoSizes3;
        highSpeedVideoSizes = androidx.compose.ui.text.style.LineBreak_androidKt.getHighSpeedVideoSizes(androidx.compose.ui.text.style.LineBreak.Strategy.INSTANCE.m8371getSimplefcGXIks(), androidx.compose.ui.text.style.LineBreak.Strictness.INSTANCE.m8382getNormalusljTpc(), androidx.compose.ui.text.style.LineBreak.WordBreak.INSTANCE.m8392getDefaultjp8hJ3c());
        Simple = m8342constructorimpl(highSpeedVideoSizes);
        highSpeedVideoSizes2 = androidx.compose.ui.text.style.LineBreak_androidKt.getHighSpeedVideoSizes(androidx.compose.ui.text.style.LineBreak.Strategy.INSTANCE.m8369getBalancedfcGXIks(), androidx.compose.ui.text.style.LineBreak.Strictness.INSTANCE.m8381getLooseusljTpc(), androidx.compose.ui.text.style.LineBreak.WordBreak.INSTANCE.m8393getPhrasejp8hJ3c());
        Heading = m8342constructorimpl(highSpeedVideoSizes2);
        highSpeedVideoSizes3 = androidx.compose.ui.text.style.LineBreak_androidKt.getHighSpeedVideoSizes(androidx.compose.ui.text.style.LineBreak.Strategy.INSTANCE.m8370getHighQualityfcGXIks(), androidx.compose.ui.text.style.LineBreak.Strictness.INSTANCE.m8383getStrictusljTpc(), androidx.compose.ui.text.style.LineBreak.WordBreak.INSTANCE.m8392getDefaultjp8hJ3c());
        Paragraph = m8342constructorimpl(highSpeedVideoSizes3);
        Unspecified = m8342constructorimpl(0);
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0013\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strategy;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    /* loaded from: classes6.dex */
    public static final class Strategy {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final int getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.compose.ui.text.style.LineBreak.Strategy.Companion INSTANCE = new androidx.compose.ui.text.style.LineBreak.Strategy.Companion(null);
        private static final int getHighResolutionOutputSizeshNQ4ISI = m8363constructorimpl(1);
        private static final int HighQuality = m8363constructorimpl(2);
        private static final int Balanced = m8363constructorimpl(3);
        private static final int getHighSpeedVideoSizes = m8363constructorimpl(0);

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m8363constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m8365equalsimpl0(int i, int i2) {
            return i == i2;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strategy$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "Simple", com.visa.cbp.getEncExpo.warmup, "getSimple-fcGXIks", "()I", "HighQuality", "getHighQuality-fcGXIks", "Balanced", "getBalanced-fcGXIks", "Unspecified", "getUnspecified-fcGXIks"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getSimple-fcGXIks, reason: not valid java name */
            public final int m8371getSimplefcGXIks() {
                return androidx.compose.ui.text.style.LineBreak.Strategy.getHighResolutionOutputSizeshNQ4ISI;
            }

            /* renamed from: getHighQuality-fcGXIks, reason: not valid java name */
            public final int m8370getHighQualityfcGXIks() {
                return androidx.compose.ui.text.style.LineBreak.Strategy.HighQuality;
            }

            /* renamed from: getBalanced-fcGXIks, reason: not valid java name */
            public final int m8369getBalancedfcGXIks() {
                return androidx.compose.ui.text.style.LineBreak.Strategy.Balanced;
            }

            /* renamed from: getUnspecified-fcGXIks, reason: not valid java name */
            public final int m8372getUnspecifiedfcGXIks() {
                return androidx.compose.ui.text.style.LineBreak.Strategy.getHighSpeedVideoSizes;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private /* synthetic */ Strategy(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        public final java.lang.String toString() {
            return m8367toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m8367toStringimpl(int i) {
            return m8365equalsimpl0(i, getHighResolutionOutputSizeshNQ4ISI) ? "Strategy.Simple" : m8365equalsimpl0(i, HighQuality) ? "Strategy.HighQuality" : m8365equalsimpl0(i, Balanced) ? "Strategy.Balanced" : m8365equalsimpl0(i, getHighSpeedVideoSizes) ? "Strategy.Unspecified" : "Invalid";
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final int hashCode() {
            return m8366hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        public final boolean equals(java.lang.Object obj) {
            return m8364equalsimpl(this.getHighResolutionOutputSizeshNQ4ISI, obj);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m8366hashCodeimpl(int i) {
            return java.lang.Integer.hashCode(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m8364equalsimpl(int i, java.lang.Object obj) {
            return (obj instanceof androidx.compose.ui.text.style.LineBreak.Strategy) && i == ((androidx.compose.ui.text.style.LineBreak.Strategy) obj).getGetHighResolutionOutputSizeshNQ4ISI();
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.compose.ui.text.style.LineBreak.Strategy m8362boximpl(int i) {
            return new androidx.compose.ui.text.style.LineBreak.Strategy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0013\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strictness;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    /* loaded from: classes6.dex */
    public static final class Strictness {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.compose.ui.text.style.LineBreak.Strictness.Companion INSTANCE = new androidx.compose.ui.text.style.LineBreak.Strictness.Companion(null);
        private static final int Default = m8374constructorimpl(1);
        private static final int Loose = m8374constructorimpl(2);
        private static final int Normal = m8374constructorimpl(3);
        private static final int Strict = m8374constructorimpl(4);
        private static final int getHighSpeedVideoFpsRanges = m8374constructorimpl(0);

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final int Camera2StreamConfigurationMap;

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m8374constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m8376equalsimpl0(int i, int i2) {
            return i == i2;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strictness$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "Default", com.visa.cbp.getEncExpo.warmup, "getDefault-usljTpc", "()I", "Loose", "getLoose-usljTpc", "Normal", "getNormal-usljTpc", "Strict", "getStrict-usljTpc", "Unspecified", "getUnspecified-usljTpc"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getDefault-usljTpc, reason: not valid java name */
            public final int m8380getDefaultusljTpc() {
                return androidx.compose.ui.text.style.LineBreak.Strictness.Default;
            }

            /* renamed from: getLoose-usljTpc, reason: not valid java name */
            public final int m8381getLooseusljTpc() {
                return androidx.compose.ui.text.style.LineBreak.Strictness.Loose;
            }

            /* renamed from: getNormal-usljTpc, reason: not valid java name */
            public final int m8382getNormalusljTpc() {
                return androidx.compose.ui.text.style.LineBreak.Strictness.Normal;
            }

            /* renamed from: getStrict-usljTpc, reason: not valid java name */
            public final int m8383getStrictusljTpc() {
                return androidx.compose.ui.text.style.LineBreak.Strictness.Strict;
            }

            /* renamed from: getUnspecified-usljTpc, reason: not valid java name */
            public final int m8384getUnspecifiedusljTpc() {
                return androidx.compose.ui.text.style.LineBreak.Strictness.getHighSpeedVideoFpsRanges;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private /* synthetic */ Strictness(int i) {
            this.Camera2StreamConfigurationMap = i;
        }

        public final java.lang.String toString() {
            return m8378toStringimpl(this.Camera2StreamConfigurationMap);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m8378toStringimpl(int i) {
            return m8376equalsimpl0(i, Default) ? "Strictness.None" : m8376equalsimpl0(i, Loose) ? "Strictness.Loose" : m8376equalsimpl0(i, Normal) ? "Strictness.Normal" : m8376equalsimpl0(i, Strict) ? "Strictness.Strict" : m8376equalsimpl0(i, getHighSpeedVideoFpsRanges) ? "Strictness.Unspecified" : "Invalid";
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        public final int hashCode() {
            return m8377hashCodeimpl(this.Camera2StreamConfigurationMap);
        }

        public final boolean equals(java.lang.Object obj) {
            return m8375equalsimpl(this.Camera2StreamConfigurationMap, obj);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m8377hashCodeimpl(int i) {
            return java.lang.Integer.hashCode(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m8375equalsimpl(int i, java.lang.Object obj) {
            return (obj instanceof androidx.compose.ui.text.style.LineBreak.Strictness) && i == ((androidx.compose.ui.text.style.LineBreak.Strictness) obj).getCamera2StreamConfigurationMap();
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.compose.ui.text.style.LineBreak.Strictness m8373boximpl(int i) {
            return new androidx.compose.ui.text.style.LineBreak.Strictness(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0011\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    /* loaded from: classes6.dex */
    public static final class WordBreak {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.compose.ui.text.style.LineBreak.WordBreak.Companion INSTANCE = new androidx.compose.ui.text.style.LineBreak.WordBreak.Companion(null);
        private static final int Default = m8386constructorimpl(1);
        private static final int Phrase = m8386constructorimpl(2);
        private static final int getHighResolutionOutputSizeshNQ4ISI = m8386constructorimpl(0);
        private final int getHighSpeedVideoSizes;

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m8386constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m8388equalsimpl0(int i, int i2) {
            return i == i2;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$WordBreak$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "Default", com.visa.cbp.getEncExpo.warmup, "getDefault-jp8hJ3c", "()I", "Phrase", "getPhrase-jp8hJ3c", "Unspecified", "getUnspecified-jp8hJ3c"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getDefault-jp8hJ3c, reason: not valid java name */
            public final int m8392getDefaultjp8hJ3c() {
                return androidx.compose.ui.text.style.LineBreak.WordBreak.Default;
            }

            /* renamed from: getPhrase-jp8hJ3c, reason: not valid java name */
            public final int m8393getPhrasejp8hJ3c() {
                return androidx.compose.ui.text.style.LineBreak.WordBreak.Phrase;
            }

            /* renamed from: getUnspecified-jp8hJ3c, reason: not valid java name */
            public final int m8394getUnspecifiedjp8hJ3c() {
                return androidx.compose.ui.text.style.LineBreak.WordBreak.getHighResolutionOutputSizeshNQ4ISI;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private /* synthetic */ WordBreak(int i) {
            this.getHighSpeedVideoSizes = i;
        }

        public final java.lang.String toString() {
            return m8390toStringimpl(this.getHighSpeedVideoSizes);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m8390toStringimpl(int i) {
            return m8388equalsimpl0(i, Default) ? "WordBreak.None" : m8388equalsimpl0(i, Phrase) ? "WordBreak.Phrase" : m8388equalsimpl0(i, getHighResolutionOutputSizeshNQ4ISI) ? "WordBreak.Unspecified" : "Invalid";
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }

        public final int hashCode() {
            return m8389hashCodeimpl(this.getHighSpeedVideoSizes);
        }

        public final boolean equals(java.lang.Object obj) {
            return m8387equalsimpl(this.getHighSpeedVideoSizes, obj);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m8389hashCodeimpl(int i) {
            return java.lang.Integer.hashCode(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m8387equalsimpl(int i, java.lang.Object obj) {
            return (obj instanceof androidx.compose.ui.text.style.LineBreak.WordBreak) && i == ((androidx.compose.ui.text.style.LineBreak.WordBreak) obj).getGetHighSpeedVideoSizes();
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.compose.ui.text.style.LineBreak.WordBreak m8385boximpl(int i) {
            return new androidx.compose.ui.text.style.LineBreak.WordBreak(i);
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int hashCode() {
        return m8351hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object obj) {
        return m8346equalsimpl(this.getHighResolutionOutputSizeshNQ4ISI, obj);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8351hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8346equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.text.style.LineBreak) && i == ((androidx.compose.ui.text.style.LineBreak) obj).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.text.style.LineBreak m8341boximpl(int i) {
        return new androidx.compose.ui.text.style.LineBreak(i);
    }
}
