package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0013\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/EmojiSupportMatch;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class EmojiSupportMatch {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.EmojiSupportMatch.Companion INSTANCE = new androidx.compose.ui.text.EmojiSupportMatch.Companion(null);
    private static final int Default = m7865constructorimpl(0);
    private static final int None = m7865constructorimpl(1);
    private static final int All = m7865constructorimpl(2);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7865constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7867equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ EmojiSupportMatch(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public final java.lang.String toString() {
        return m7869toStringimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m7869toStringimpl(int i) {
        if (i == Default) {
            return "EmojiSupportMatch.Default";
        }
        if (i == None) {
            return "EmojiSupportMatch.None";
        }
        if (i == All) {
            return "EmojiSupportMatch.All";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/compose/ui/text/EmojiSupportMatch$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/EmojiSupportMatch;", "Default", com.visa.cbp.getEncExpo.warmup, "getDefault-_3YsG6Y", "()I", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "getNone-_3YsG6Y", "All", "getAll-_3YsG6Y"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getDefault-_3YsG6Y, reason: not valid java name */
        public final int m7872getDefault_3YsG6Y() {
            return androidx.compose.ui.text.EmojiSupportMatch.Default;
        }

        /* renamed from: getNone-_3YsG6Y, reason: not valid java name */
        public final int m7873getNone_3YsG6Y() {
            return androidx.compose.ui.text.EmojiSupportMatch.None;
        }

        /* renamed from: getAll-_3YsG6Y, reason: not valid java name */
        public final int m7871getAll_3YsG6Y() {
            return androidx.compose.ui.text.EmojiSupportMatch.All;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final int hashCode() {
        return m7868hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean equals(java.lang.Object obj) {
        return m7866equalsimpl(this.getHighSpeedVideoFpsRangesFor, obj);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7868hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7866equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.text.EmojiSupportMatch) && i == ((androidx.compose.ui.text.EmojiSupportMatch) obj).getGetHighSpeedVideoFpsRangesFor();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.text.EmojiSupportMatch m7864boximpl(int i) {
        return new androidx.compose.ui.text.EmojiSupportMatch(i);
    }
}
