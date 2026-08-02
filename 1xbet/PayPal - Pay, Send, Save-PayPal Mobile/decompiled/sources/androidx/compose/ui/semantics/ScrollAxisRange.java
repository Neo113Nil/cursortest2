package androidx.compose.ui.semantics;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/semantics/ScrollAxisRange;", "", "Lkotlin/Function0;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "maxValue", "", "reverseScrolling", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function0;", "getValue", "()Lkotlin/jvm/functions/Function0;", "getMaxValue", "Z", "getReverseScrolling", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollAxisRange {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function0<java.lang.Float> maxValue;
    private final boolean reverseScrolling;
    private final kotlin.jvm.functions.Function0<java.lang.Float> value;

    public ScrollAxisRange(kotlin.jvm.functions.Function0<java.lang.Float> function0, kotlin.jvm.functions.Function0<java.lang.Float> function02, boolean z) {
        this.value = function0;
        this.maxValue = function02;
        this.reverseScrolling = z;
    }

    public /* synthetic */ ScrollAxisRange(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function02, (i & 4) != 0 ? false : z);
    }

    public final kotlin.jvm.functions.Function0<java.lang.Float> getValue() {
        return this.value;
    }

    public final kotlin.jvm.functions.Function0<java.lang.Float> getMaxValue() {
        return this.maxValue;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ScrollAxisRange(value=");
        sb.append(this.value.invoke().floatValue());
        sb.append(", maxValue=");
        sb.append(this.maxValue.invoke().floatValue());
        sb.append(", reverseScrolling=");
        sb.append(this.reverseScrolling);
        sb.append(')');
        return sb.toString();
    }
}
