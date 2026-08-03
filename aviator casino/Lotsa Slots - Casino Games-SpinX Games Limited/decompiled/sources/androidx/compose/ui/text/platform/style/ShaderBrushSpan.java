package androidx.compose.ui.text.platform.style;

/* compiled from: ShaderBrushSpan.android.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R1\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "shaderBrush", "Landroidx/compose/ui/graphics/ShaderBrush;", "alpha", "", "(Landroidx/compose/ui/graphics/ShaderBrush;F)V", "getAlpha", "()F", "getShaderBrush", "()Landroidx/compose/ui/graphics/ShaderBrush;", "shaderState", "Landroidx/compose/runtime/State;", "Landroid/graphics/Shader;", "<set-?>", "Landroidx/compose/ui/geometry/Size;", "size", "getSize-NH-jbRc", "()J", "setSize-uvyYCjk", "(J)V", "size$delegate", "Landroidx/compose/runtime/MutableState;", "updateDrawState", "", "textPaint", "Landroid/text/TextPaint;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShaderBrushSpan extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {
    public static final int $stable = 0;
    private final float alpha;
    private final androidx.compose.ui.graphics.ShaderBrush shaderBrush;

    /* renamed from: size$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState size = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Size.m1928boximpl(androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc()), null, 2, null);
    private final androidx.compose.runtime.State<android.graphics.Shader> shaderState = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0<android.graphics.Shader>() { // from class: androidx.compose.ui.text.platform.style.ShaderBrushSpan$shaderState$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final android.graphics.Shader invoke() {
            if (androidx.compose.ui.text.platform.style.ShaderBrushSpan.this.m4242getSizeNHjbRc() == androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc() || androidx.compose.ui.geometry.Size.m1942isEmptyimpl(androidx.compose.ui.text.platform.style.ShaderBrushSpan.this.m4242getSizeNHjbRc())) {
                return null;
            }
            return androidx.compose.ui.text.platform.style.ShaderBrushSpan.this.getShaderBrush().mo2082createShaderuvyYCjk(androidx.compose.ui.text.platform.style.ShaderBrushSpan.this.m4242getSizeNHjbRc());
        }
    });

    public final androidx.compose.ui.graphics.ShaderBrush getShaderBrush() {
        return this.shaderBrush;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public ShaderBrushSpan(androidx.compose.ui.graphics.ShaderBrush shaderBrush, float f) {
        this.shaderBrush = shaderBrush;
        this.alpha = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m4242getSizeNHjbRc() {
        return ((androidx.compose.ui.geometry.Size) this.size.getValue()).getPackedValue();
    }

    /* renamed from: setSize-uvyYCjk, reason: not valid java name */
    public final void m4243setSizeuvyYCjk(long j) {
        this.size.setValue(androidx.compose.ui.geometry.Size.m1928boximpl(j));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        androidx.compose.ui.text.platform.AndroidTextPaint_androidKt.setAlpha(textPaint, this.alpha);
        textPaint.setShader(this.shaderState.getValue());
    }
}
