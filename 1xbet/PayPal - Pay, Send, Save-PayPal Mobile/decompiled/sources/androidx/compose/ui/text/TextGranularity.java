package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u0010\u0092\u0001\u00020\u0006"}, d2 = {"Landroidx/compose/ui/text/TextGranularity;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "Companion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class TextGranularity {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.TextGranularity.Companion INSTANCE = new androidx.compose.ui.text.TextGranularity.Companion(null);
    private static final int Character = 0;
    private static final int Word = 1;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7998equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/compose/ui/text/TextGranularity$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/TextGranularity;", "Character", com.visa.cbp.getEncExpo.warmup, "getCharacter-DRrd7Zo", "()I", "Word", "getWord-DRrd7Zo"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getCharacter-DRrd7Zo, reason: not valid java name */
        public final int m8002getCharacterDRrd7Zo() {
            return androidx.compose.ui.text.TextGranularity.Character;
        }

        /* renamed from: getWord-DRrd7Zo, reason: not valid java name */
        public final int m8003getWordDRrd7Zo() {
            return androidx.compose.ui.text.TextGranularity.Word;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ TextGranularity(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        return m8000toStringimpl(this.Camera2StreamConfigurationMap);
    }

    public final int hashCode() {
        return m7999hashCodeimpl(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object other) {
        return m7997equalsimpl(this.Camera2StreamConfigurationMap, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8000toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextGranularity(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7999hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7997equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.text.TextGranularity) && i == ((androidx.compose.ui.text.TextGranularity) obj).getCamera2StreamConfigurationMap();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.text.TextGranularity m7996boximpl(int i) {
        return new androidx.compose.ui.text.TextGranularity(i);
    }
}
