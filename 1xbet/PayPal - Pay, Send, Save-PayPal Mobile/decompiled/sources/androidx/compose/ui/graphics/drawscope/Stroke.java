package androidx.compose.ui.graphics.drawscope;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \"2\u00020\u0001:\u0001\"B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001e\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/Stroke;", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "", "width", "miter", "Landroidx/compose/ui/graphics/StrokeCap;", "cap", "Landroidx/compose/ui/graphics/StrokeJoin;", "join", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "<init>", "(FFIILandroidx/compose/ui/graphics/PathEffect;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getWidth", "()F", "getMiter", com.visa.cbp.getEncExpo.warmup, "getCap-KaPHkGw", "getJoin-LxFBmk8", "Landroidx/compose/ui/graphics/PathEffect;", "getPathEffect", "()Landroidx/compose/ui/graphics/PathEffect;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Stroke extends androidx.compose.ui.graphics.drawscope.DrawStyle {
    public static final float DefaultMiter = 4.0f;
    public static final float HairlineWidth = 0.0f;
    private final int cap;
    private final int join;
    private final float miter;
    private final androidx.compose.ui.graphics.PathEffect pathEffect;
    private final float width;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.drawscope.Stroke.Companion INSTANCE = new androidx.compose.ui.graphics.drawscope.Stroke.Companion(null);
    public static final int $stable = 8;
    private static final int DefaultCap = androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw();
    private static final int DefaultJoin = androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m6351getMiterLxFBmk8();

    private Stroke(float f, float f2, int i, int i2, androidx.compose.ui.graphics.PathEffect pathEffect) {
        super(null);
        this.width = f;
        this.miter = f2;
        this.cap = i;
        this.join = i2;
        this.pathEffect = pathEffect;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getMiter() {
        return this.miter;
    }

    public /* synthetic */ Stroke(float f, float f2, int i, int i2, androidx.compose.ui.graphics.PathEffect pathEffect, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0.0f : f, (i3 & 2) != 0 ? 4.0f : f2, (i3 & 4) != 0 ? DefaultCap : i, (i3 & 8) != 0 ? DefaultJoin : i2, (i3 & 16) != 0 ? null : pathEffect, null);
    }

    /* renamed from: getCap-KaPHkGw, reason: not valid java name and from getter */
    public final int getCap() {
        return this.cap;
    }

    /* renamed from: getJoin-LxFBmk8, reason: not valid java name and from getter */
    public final int getJoin() {
        return this.join;
    }

    public final androidx.compose.ui.graphics.PathEffect getPathEffect() {
        return this.pathEffect;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/Stroke$Companion;", "", "<init>", "()V", "", "HairlineWidth", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "DefaultMiter", "Landroidx/compose/ui/graphics/StrokeCap;", "DefaultCap", com.visa.cbp.getEncExpo.warmup, "getDefaultCap-KaPHkGw", "()I", "Landroidx/compose/ui/graphics/StrokeJoin;", "DefaultJoin", "getDefaultJoin-LxFBmk8"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getDefaultCap-KaPHkGw, reason: not valid java name */
        public final int m6602getDefaultCapKaPHkGw() {
            return androidx.compose.ui.graphics.drawscope.Stroke.DefaultCap;
        }

        /* renamed from: getDefaultJoin-LxFBmk8, reason: not valid java name */
        public final int m6603getDefaultJoinLxFBmk8() {
            return androidx.compose.ui.graphics.drawscope.Stroke.DefaultJoin;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.graphics.drawscope.Stroke)) {
            return false;
        }
        androidx.compose.ui.graphics.drawscope.Stroke stroke = (androidx.compose.ui.graphics.drawscope.Stroke) other;
        return this.width == stroke.width && this.miter == stroke.miter && androidx.compose.ui.graphics.StrokeCap.m6336equalsimpl0(this.cap, stroke.cap) && androidx.compose.ui.graphics.StrokeJoin.m6346equalsimpl0(this.join, stroke.join) && kotlin.jvm.internal.Intrinsics.areEqual(this.pathEffect, stroke.pathEffect);
    }

    public final int hashCode() {
        int hashCode = java.lang.Float.hashCode(this.width);
        int hashCode2 = java.lang.Float.hashCode(this.miter);
        int m6337hashCodeimpl = androidx.compose.ui.graphics.StrokeCap.m6337hashCodeimpl(this.cap);
        int m6347hashCodeimpl = androidx.compose.ui.graphics.StrokeJoin.m6347hashCodeimpl(this.join);
        androidx.compose.ui.graphics.PathEffect pathEffect = this.pathEffect;
        return (((((((hashCode * 31) + hashCode2) * 31) + m6337hashCodeimpl) * 31) + m6347hashCodeimpl) * 31) + (pathEffect != null ? pathEffect.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Stroke(width=");
        sb.append(this.width);
        sb.append(", miter=");
        sb.append(this.miter);
        sb.append(", cap=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.StrokeCap.m6338toStringimpl(this.cap));
        sb.append(", join=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.StrokeJoin.m6348toStringimpl(this.join));
        sb.append(", pathEffect=");
        sb.append(this.pathEffect);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ Stroke(float f, float f2, int i, int i2, androidx.compose.ui.graphics.PathEffect pathEffect, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, i, i2, pathEffect);
    }
}
