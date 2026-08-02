package androidx.compose.foundation.text.input.internal.selection;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\b\u0018\u0000 ,2\u00020\u0001:\u0001,B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000eJB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b+\u0010\u000e"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "", "", "visible", "Landroidx/compose/ui/geometry/Offset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "lineHeight", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "handlesCrossed", "<init>", "(ZJFLandroidx/compose/ui/text/style/ResolvedTextDirection;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Z", "component2-F1C5BW0", "()J", "component2", "component3", "()F", "component4", "()Landroidx/compose/ui/text/style/ResolvedTextDirection;", "component5", "copy-YqVAtuI", "(ZJFLandroidx/compose/ui/text/style/ResolvedTextDirection;Z)Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getVisible", "J", "getPosition-F1C5BW0", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getLineHeight", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getDirection", "getHandlesCrossed", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TextFieldHandleState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.Companion INSTANCE = new androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.Companion(null);
    private static final androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState Hidden = new androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState(false, androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0(), 0.0f, androidx.compose.ui.text.style.ResolvedTextDirection.Ltr, false, null);
    private final androidx.compose.ui.text.style.ResolvedTextDirection direction;
    private final boolean handlesCrossed;
    private final float lineHeight;
    private final long position;
    private final boolean visible;

    private TextFieldHandleState(boolean z, long j, float f, androidx.compose.ui.text.style.ResolvedTextDirection resolvedTextDirection, boolean z2) {
        this.visible = z;
        this.position = j;
        this.lineHeight = f;
        this.direction = resolvedTextDirection;
        this.handlesCrossed = z2;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m2296getPositionF1C5BW0() {
        return this.position;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    public final androidx.compose.ui.text.style.ResolvedTextDirection getDirection() {
        return this.direction;
    }

    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "Hidden", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "getHidden", "()Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState getHidden() {
            return androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.Hidden;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextFieldHandleState(visible=");
        sb.append(this.visible);
        sb.append(", position=");
        sb.append((java.lang.Object) androidx.compose.ui.geometry.Offset.m5760toStringimpl(this.position));
        sb.append(", lineHeight=");
        sb.append(this.lineHeight);
        sb.append(", direction=");
        sb.append(this.direction);
        sb.append(", handlesCrossed=");
        sb.append(this.handlesCrossed);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((java.lang.Boolean.hashCode(this.visible) * 31) + androidx.compose.ui.geometry.Offset.m5754hashCodeimpl(this.position)) * 31) + java.lang.Float.hashCode(this.lineHeight)) * 31) + this.direction.hashCode()) * 31) + java.lang.Boolean.hashCode(this.handlesCrossed);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState)) {
            return false;
        }
        androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState textFieldHandleState = (androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState) other;
        return this.visible == textFieldHandleState.visible && androidx.compose.ui.geometry.Offset.m5749equalsimpl0(this.position, textFieldHandleState.position) && java.lang.Float.compare(this.lineHeight, textFieldHandleState.lineHeight) == 0 && this.direction == textFieldHandleState.direction && this.handlesCrossed == textFieldHandleState.handlesCrossed;
    }

    /* renamed from: copy-YqVAtuI, reason: not valid java name */
    public final androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState m2295copyYqVAtuI(boolean visible, long position, float lineHeight, androidx.compose.ui.text.style.ResolvedTextDirection direction, boolean handlesCrossed) {
        return new androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState(visible, position, lineHeight, direction, handlesCrossed, null);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    /* renamed from: component4, reason: from getter */
    public final androidx.compose.ui.text.style.ResolvedTextDirection getDirection() {
        return this.direction;
    }

    /* renamed from: component3, reason: from getter */
    public final float getLineHeight() {
        return this.lineHeight;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name and from getter */
    public final long getPosition() {
        return this.position;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    /* renamed from: copy-YqVAtuI$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState m2293copyYqVAtuI$default(androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState textFieldHandleState, boolean z, long j, float f, androidx.compose.ui.text.style.ResolvedTextDirection resolvedTextDirection, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = textFieldHandleState.visible;
        }
        if ((i & 2) != 0) {
            j = textFieldHandleState.position;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            f = textFieldHandleState.lineHeight;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            resolvedTextDirection = textFieldHandleState.direction;
        }
        androidx.compose.ui.text.style.ResolvedTextDirection resolvedTextDirection2 = resolvedTextDirection;
        if ((i & 16) != 0) {
            z2 = textFieldHandleState.handlesCrossed;
        }
        return textFieldHandleState.m2295copyYqVAtuI(z, j2, f2, resolvedTextDirection2, z2);
    }

    public /* synthetic */ TextFieldHandleState(boolean z, long j, float f, androidx.compose.ui.text.style.ResolvedTextDirection resolvedTextDirection, boolean z2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, j, f, resolvedTextDirection, z2);
    }
}
