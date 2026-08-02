package androidx.window.core;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u001d\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u001f\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010 \u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\"\u0010!"}, d2 = {"Landroidx/window/core/Bounds;", "", "", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "<init>", "(IIII)V", "Landroid/graphics/Rect;", "rect", "(Landroid/graphics/Rect;)V", "toRect", "()Landroid/graphics/Rect;", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", com.visa.cbp.getEncExpo.warmup, "getLeft", "getTop", "getRight", "getBottom", "getWidth", "width", "getHeight", "height", "isEmpty", "()Z", "isZero", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Bounds {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.core.Bounds.Companion INSTANCE = new androidx.window.core.Bounds.Companion(null);
    private static final androidx.window.core.Bounds EMPTY_BOUNDS = new androidx.window.core.Bounds(0, 0, 0, 0);
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public Bounds(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
        if (i > i3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Left must be less than or equal to right, left: ");
            sb.append(i);
            sb.append(", right: ");
            sb.append(i3);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (i2 <= i4) {
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("top must be less than or equal to bottom, top: ");
        sb2.append(i2);
        sb2.append(", bottom: ");
        sb2.append(i4);
        throw new java.lang.IllegalArgumentException(sb2.toString().toString());
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Bounds(android.graphics.Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "");
    }

    public final android.graphics.Rect toRect() {
        return new android.graphics.Rect(this.left, this.top, this.right, this.bottom);
    }

    public final int getWidth() {
        return this.right - this.left;
    }

    public final int getHeight() {
        return this.bottom - this.top;
    }

    public final boolean isEmpty() {
        return getHeight() == 0 || getWidth() == 0;
    }

    public final boolean isZero() {
        return getHeight() == 0 && getWidth() == 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Bounds { [");
        sb.append(this.left);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        sb.append(this.top);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        sb.append(this.right);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        sb.append(this.bottom);
        sb.append("] }");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        androidx.window.core.Bounds bounds = (androidx.window.core.Bounds) other;
        return this.left == bounds.left && this.top == bounds.top && this.right == bounds.right && this.bottom == bounds.bottom;
    }

    public final int hashCode() {
        int i = this.left;
        return (((((i * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/window/core/Bounds$Companion;", "", "<init>", "()V", "Landroidx/window/core/Bounds;", "EMPTY_BOUNDS", "Landroidx/window/core/Bounds;", "getEMPTY_BOUNDS", "()Landroidx/window/core/Bounds;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.window.core.Bounds getEMPTY_BOUNDS() {
            return androidx.window.core.Bounds.EMPTY_BOUNDS;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
