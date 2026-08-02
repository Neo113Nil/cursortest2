package androidx.compose.runtime.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/internal/IntRef;", "", "", "element", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getElement", "()I", "setElement"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntRef {
    public static final int $stable = 8;
    private int element;

    public IntRef(int i) {
        this.element = i;
    }

    public /* synthetic */ IntRef(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final int getElement() {
        return this.element;
    }

    public final void setElement(int i) {
        this.element = i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IntRef(element = ");
        sb.append(this.element);
        sb.append(")@");
        java.lang.String num = java.lang.Integer.toString(hashCode(), kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "");
        sb.append(num);
        return sb.toString();
    }

    public IntRef() {
        this(0, 1, null);
    }
}
