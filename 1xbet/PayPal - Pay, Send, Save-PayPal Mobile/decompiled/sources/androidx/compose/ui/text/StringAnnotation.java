package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/StringAnnotation;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class StringAnnotation implements androidx.compose.ui.text.AnnotatedString.Annotation {
    private final java.lang.String value;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static java.lang.String m7990constructorimpl(java.lang.String str) {
        return str;
    }

    private /* synthetic */ StringAnnotation(java.lang.String str) {
        this.value = str;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ java.lang.String m7995unboximpl() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m7994toStringimpl(this.value);
    }

    public final int hashCode() {
        return m7993hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object other) {
        return m7991equalsimpl(this.value, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m7994toStringimpl(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StringAnnotation(value=");
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7993hashCodeimpl(java.lang.String str) {
        return str.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7992equalsimpl0(java.lang.String str, java.lang.String str2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(str, str2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7991equalsimpl(java.lang.String str, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.text.StringAnnotation) && kotlin.jvm.internal.Intrinsics.areEqual(str, ((androidx.compose.ui.text.StringAnnotation) obj).m7995unboximpl());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.text.StringAnnotation m7989boximpl(java.lang.String str) {
        return new androidx.compose.ui.text.StringAnnotation(str);
    }
}
