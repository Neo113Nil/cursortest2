package androidx.compose.ui.text.style;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015"}, d2 = {"Landroidx/compose/ui/text/style/TextGeometricTransform;", "", "", "scaleX", "skewX", "<init>", "(FF)V", "copy", "(FF)Landroidx/compose/ui/text/style/TextGeometricTransform;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getScaleX", "()F", "getSkewX", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextGeometricTransform {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.style.TextGeometricTransform.Companion INSTANCE = new androidx.compose.ui.text.style.TextGeometricTransform.Companion(null);
    private static final androidx.compose.ui.text.style.TextGeometricTransform None = new androidx.compose.ui.text.style.TextGeometricTransform(1.0f, 0.0f);
    private final float scaleX;
    private final float skewX;

    public TextGeometricTransform(float f, float f2) {
        this.scaleX = f;
        this.skewX = f2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/TextGeometricTransform;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Landroidx/compose/ui/text/style/TextGeometricTransform;", "getNone$ui_text", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "getNone$ui_text$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public static /* synthetic */ void getNone$ui_text$annotations() {
        }

        private Companion() {
        }

        public final androidx.compose.ui.text.style.TextGeometricTransform getNone$ui_text() {
            return androidx.compose.ui.text.style.TextGeometricTransform.None;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TextGeometricTransform(float f, float f2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getSkewX() {
        return this.skewX;
    }

    public static /* synthetic */ androidx.compose.ui.text.style.TextGeometricTransform copy$default(androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = textGeometricTransform.scaleX;
        }
        if ((i & 2) != 0) {
            f2 = textGeometricTransform.skewX;
        }
        return textGeometricTransform.copy(f, f2);
    }

    public final androidx.compose.ui.text.style.TextGeometricTransform copy(float scaleX, float skewX) {
        return new androidx.compose.ui.text.style.TextGeometricTransform(scaleX, skewX);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.style.TextGeometricTransform)) {
            return false;
        }
        androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform = (androidx.compose.ui.text.style.TextGeometricTransform) other;
        return this.scaleX == textGeometricTransform.scaleX && this.skewX == textGeometricTransform.skewX;
    }

    public final int hashCode() {
        return (java.lang.Float.hashCode(this.scaleX) * 31) + java.lang.Float.hashCode(this.skewX);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.scaleX);
        sb.append(", skewX=");
        sb.append(this.skewX);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextGeometricTransform() {
        this(r2, r2, 3, null);
        float f = 0.0f;
    }
}
