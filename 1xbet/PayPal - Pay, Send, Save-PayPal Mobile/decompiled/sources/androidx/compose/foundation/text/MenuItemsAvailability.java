package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\f\b\u0081@\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\t\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\n\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001a\u0088\u0001\u0016\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/foundation/text/MenuItemsAvailability;", "", "", "p0", "getHighSpeedVideoFpsRanges", "(I)I", "", "canCopy", "canPaste", "canCut", "canSelectAll", "canAutofill", "constructor-impl", "(ZZZZZ)I", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue", "getCanCopy-impl", "(I)Z", "getCanPaste-impl", "getCanCut-impl", "getCanSelectAll-impl", "getCanAutofill-impl", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class MenuItemsAvailability {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.text.MenuItemsAvailability.Companion INSTANCE = new androidx.compose.foundation.text.MenuItemsAvailability.Companion(null);
    private static final int None = getHighSpeedVideoFpsRanges(0);
    private final int value;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2082equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: getCanAutofill-impl, reason: not valid java name */
    public static final boolean m2083getCanAutofillimpl(int i) {
        return (i & 16) == 16;
    }

    /* renamed from: getCanCopy-impl, reason: not valid java name */
    public static final boolean m2084getCanCopyimpl(int i) {
        return (i & 1) == 1;
    }

    /* renamed from: getCanCut-impl, reason: not valid java name */
    public static final boolean m2085getCanCutimpl(int i) {
        return (i & 4) == 4;
    }

    /* renamed from: getCanPaste-impl, reason: not valid java name */
    public static final boolean m2086getCanPasteimpl(int i) {
        return (i & 2) == 2;
    }

    /* renamed from: getCanSelectAll-impl, reason: not valid java name */
    public static final boolean m2087getCanSelectAllimpl(int i) {
        return (i & 8) == 8;
    }

    private static int getHighSpeedVideoFpsRanges(int i) {
        return i;
    }

    private /* synthetic */ MenuItemsAvailability(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2080constructorimpl(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        int i = z2 ? 2 : 0;
        int i2 = z3 ? 4 : 0;
        return getHighSpeedVideoFpsRanges((z ? 1 : 0) | i | i2 | (z4 ? 8 : 0) | (z5 ? 16 : 0));
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/foundation/text/MenuItemsAvailability$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/text/MenuItemsAvailability;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, com.visa.cbp.getEncExpo.warmup, "getNone-JKCFgKw", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getNone-JKCFgKw, reason: not valid java name */
        public final int m2091getNoneJKCFgKw() {
            return androidx.compose.foundation.text.MenuItemsAvailability.None;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2090unboximpl() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m2089toStringimpl(this.value);
    }

    public final int hashCode() {
        return m2088hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object other) {
        return m2081equalsimpl(this.value, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m2089toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MenuItemsAvailability(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2088hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2081equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.foundation.text.MenuItemsAvailability) && i == ((androidx.compose.foundation.text.MenuItemsAvailability) obj).m2090unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.foundation.text.MenuItemsAvailability m2079boximpl(int i) {
        return new androidx.compose.foundation.text.MenuItemsAvailability(i);
    }
}
