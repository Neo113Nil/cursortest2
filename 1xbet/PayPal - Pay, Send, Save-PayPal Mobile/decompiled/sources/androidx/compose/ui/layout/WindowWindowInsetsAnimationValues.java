package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R+\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068W@WX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR+\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00118W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R+\u0010 \u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00198W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR+\u0010$\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00118W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001a\u0010&\u001a\u00020%8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020%8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\"\u0010-\u001a\u00020,8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u001d\"\u0004\b0\u0010\u001fR\"\u00101\u001a\u00020,8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010.\u001a\u0004\b2\u0010\u001d\"\u0004\b3\u0010\u001fR\"\u00104\u001a\u00020,8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u0010\u001d\"\u0004\b6\u0010\u001fR\"\u00107\u001a\u00020,8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010.\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010\u001f"}, d2 = {"Landroidx/compose/ui/layout/WindowWindowInsetsAnimationValues;", "Landroidx/compose/ui/layout/PlatformWindowInsetsAnimation;", "", "name", "<init>", "(Ljava/lang/String;)V", "", "<set-?>", "isVisible$delegate", "Landroidx/compose/runtime/MutableState;", "isVisible", "()Z", "setVisible", "(Z)V", "isAnimating$delegate", "isAnimating", "setAnimating", "", "fraction$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getFraction", "()F", "setFraction", "(F)V", "fraction", "", "durationMillis$delegate", "Landroidx/compose/runtime/MutableLongState;", "getDurationMillis", "()J", "setDurationMillis", "(J)V", "durationMillis", "alpha$delegate", "getAlpha", "setAlpha", "alpha", "Landroidx/compose/ui/layout/RectRulers;", "source", "Landroidx/compose/ui/layout/RectRulers;", "getSource", "()Landroidx/compose/ui/layout/RectRulers;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "getTarget", "Landroidx/compose/ui/layout/ValueInsets;", "current", "J", "getCurrent-hdzbrEE", "setCurrent-Ynlvx88", "maximum", "getMaximum-hdzbrEE", "setMaximum-Ynlvx88", "sourceValueInsets", "getSourceValueInsets-hdzbrEE", "setSourceValueInsets-Ynlvx88", "targetValueInsets", "getTargetValueInsets-hdzbrEE", "setTargetValueInsets-Ynlvx88"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WindowWindowInsetsAnimationValues implements androidx.compose.ui.layout.PlatformWindowInsetsAnimation {
    public static final int $stable = 8;
    private long current;
    private long maximum;
    private final androidx.compose.ui.layout.RectRulers source;
    private long sourceValueInsets;
    private final androidx.compose.ui.layout.RectRulers target;
    private long targetValueInsets;

    /* renamed from: isVisible$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isVisible = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);

    /* renamed from: isAnimating$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isAnimating = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);

    /* renamed from: fraction$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState fraction = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    /* renamed from: durationMillis$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableLongState durationMillis = androidx.compose.runtime.SnapshotLongStateKt.mutableLongStateOf(0);

    /* renamed from: alpha$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState alpha = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);

    public WindowWindowInsetsAnimationValues(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" source");
        this.source = androidx.compose.ui.layout.RectRulersKt.RectRulers(sb.toString());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(" target");
        this.target = androidx.compose.ui.layout.RectRulersKt.RectRulers(sb2.toString());
        this.current = androidx.compose.ui.layout.ValueInsets_androidKt.getUnsetValueInsets();
        this.maximum = androidx.compose.ui.layout.ValueInsets_androidKt.getUnsetValueInsets();
        this.sourceValueInsets = androidx.compose.ui.layout.ValueInsets_androidKt.getUnsetValueInsets();
        this.targetValueInsets = androidx.compose.ui.layout.ValueInsets_androidKt.getUnsetValueInsets();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final boolean isVisible() {
        return ((java.lang.Boolean) this.isVisible.getValue()).booleanValue();
    }

    public final void setVisible(boolean z) {
        this.isVisible.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final boolean isAnimating() {
        return ((java.lang.Boolean) this.isAnimating.getValue()).booleanValue();
    }

    public final void setAnimating(boolean z) {
        this.isAnimating.setValue(java.lang.Boolean.valueOf(z));
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final float getFraction() {
        return this.fraction.getFloatValue();
    }

    public final void setFraction(float f) {
        this.fraction.setFloatValue(f);
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final long getDurationMillis() {
        return this.durationMillis.getLongValue();
    }

    public final void setDurationMillis(long j) {
        this.durationMillis.setLongValue(j);
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final float getAlpha() {
        return this.alpha.getFloatValue();
    }

    public final void setAlpha(float f) {
        this.alpha.setFloatValue(f);
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final androidx.compose.ui.layout.RectRulers getSource() {
        return this.source;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final androidx.compose.ui.layout.RectRulers getTarget() {
        return this.target;
    }

    /* renamed from: getCurrent-hdzbrEE, reason: not valid java name and from getter */
    public final long getCurrent() {
        return this.current;
    }

    /* renamed from: setCurrent-Ynlvx88, reason: not valid java name */
    public final void m7490setCurrentYnlvx88(long j) {
        this.current = j;
    }

    /* renamed from: getMaximum-hdzbrEE, reason: not valid java name and from getter */
    public final long getMaximum() {
        return this.maximum;
    }

    /* renamed from: setMaximum-Ynlvx88, reason: not valid java name */
    public final void m7491setMaximumYnlvx88(long j) {
        this.maximum = j;
    }

    /* renamed from: getSourceValueInsets-hdzbrEE, reason: not valid java name and from getter */
    public final long getSourceValueInsets() {
        return this.sourceValueInsets;
    }

    /* renamed from: setSourceValueInsets-Ynlvx88, reason: not valid java name */
    public final void m7492setSourceValueInsetsYnlvx88(long j) {
        this.sourceValueInsets = j;
    }

    /* renamed from: getTargetValueInsets-hdzbrEE, reason: not valid java name and from getter */
    public final long getTargetValueInsets() {
        return this.targetValueInsets;
    }

    /* renamed from: setTargetValueInsets-Ynlvx88, reason: not valid java name */
    public final void m7493setTargetValueInsetsYnlvx88(long j) {
        this.targetValueInsets = j;
    }
}
