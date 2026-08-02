package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 \"2\u00020\u0001:\u0001\"B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u0012\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001c\u0010\u0019R\u001d\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\u0012\n\u0004\b\u0007\u0010\u001e\u0012\u0004\b!\u0010\u001b\u001a\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/ui/graphics/Shadow;", "", "Landroidx/compose/ui/graphics/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/geometry/Offset;", "offset", "", "blurRadius", "<init>", "(JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy-qcb84PM", "(JJF)Landroidx/compose/ui/graphics/Shadow;", "copy", "J", "getColor-0d7_KjU", "()J", "getColor-0d7_KjU$annotations", "()V", "getOffset-F1C5BW0", "getOffset-F1C5BW0$annotations", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getBlurRadius", "()F", "getBlurRadius$annotations", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Shadow {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.Shadow.Companion INSTANCE = new androidx.compose.ui.graphics.Shadow.Companion(null);
    private static final androidx.compose.ui.graphics.Shadow None = new androidx.compose.ui.graphics.Shadow(0, 0, 0.0f, 7, null);
    private final float blurRadius;
    private final long color;
    private final long offset;

    public static /* synthetic */ void getBlurRadius$annotations() {
    }

    /* renamed from: getColor-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m6317getColor0d7_KjU$annotations() {
    }

    /* renamed from: getOffset-F1C5BW0$annotations, reason: not valid java name */
    public static /* synthetic */ void m6318getOffsetF1C5BW0$annotations() {
    }

    private Shadow(long j, long j2, float f) {
        this.color = j;
        this.offset = j2;
        this.blurRadius = f;
    }

    public /* synthetic */ Shadow(long j, long j2, float f, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(com.datadog.android.sessionreplay.utils.ColorConstantsKt.MASK_ALPHA) : j, (i & 2) != 0 ? androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0() : j2, (i & 4) != 0 ? 0.0f : f, null);
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: getOffset-F1C5BW0, reason: not valid java name and from getter */
    public final long getOffset() {
        return this.offset;
    }

    public final float getBlurRadius() {
        return this.blurRadius;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/Shadow$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Shadow;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Landroidx/compose/ui/graphics/Shadow;", "getNone", "()Landroidx/compose/ui/graphics/Shadow;", "getNone$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public static /* synthetic */ void getNone$annotations() {
        }

        private Companion() {
        }

        public final androidx.compose.ui.graphics.Shadow getNone() {
            return androidx.compose.ui.graphics.Shadow.None;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.graphics.Shadow)) {
            return false;
        }
        androidx.compose.ui.graphics.Shadow shadow = (androidx.compose.ui.graphics.Shadow) other;
        return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.color, shadow.color) && androidx.compose.ui.geometry.Offset.m5749equalsimpl0(this.offset, shadow.offset) && this.blurRadius == shadow.blurRadius;
    }

    public final int hashCode() {
        return (((androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.color) * 31) + androidx.compose.ui.geometry.Offset.m5754hashCodeimpl(this.offset)) * 31) + java.lang.Float.hashCode(this.blurRadius);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Shadow(color=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.Color.m6004toStringimpl(this.color));
        sb.append(", offset=");
        sb.append((java.lang.Object) androidx.compose.ui.geometry.Offset.m5760toStringimpl(this.offset));
        sb.append(", blurRadius=");
        sb.append(this.blurRadius);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: copy-qcb84PM$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.graphics.Shadow m6316copyqcb84PM$default(androidx.compose.ui.graphics.Shadow shadow, long j, long j2, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = shadow.color;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = shadow.offset;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            f = shadow.blurRadius;
        }
        return shadow.m6319copyqcb84PM(j3, j4, f);
    }

    /* renamed from: copy-qcb84PM, reason: not valid java name */
    public final androidx.compose.ui.graphics.Shadow m6319copyqcb84PM(long color, long offset, float blurRadius) {
        return new androidx.compose.ui.graphics.Shadow(color, offset, blurRadius, null);
    }

    public /* synthetic */ Shadow(long j, long j2, float f, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, f);
    }
}
