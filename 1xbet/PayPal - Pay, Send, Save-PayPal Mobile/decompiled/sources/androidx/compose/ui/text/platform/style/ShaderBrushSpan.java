package androidx.compose.ui.text.platform.style;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R+\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Landroidx/compose/ui/graphics/ShaderBrush;", "shaderBrush", "", "alpha", "<init>", "(Landroidx/compose/ui/graphics/ShaderBrush;F)V", "Landroid/text/TextPaint;", "textPaint", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "Landroidx/compose/ui/graphics/ShaderBrush;", "getShaderBrush", "()Landroidx/compose/ui/graphics/ShaderBrush;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getAlpha", "()F", "Landroidx/compose/ui/geometry/Size;", "<set-?>", "size$delegate", "Landroidx/compose/runtime/MutableState;", "getSize-NH-jbRc", "()J", "setSize-uvyYCjk", "(J)V", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/runtime/State;", "Landroid/graphics/Shader;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/State;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShaderBrushSpan extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {
    public static final int $stable = 8;
    private final float alpha;
    private final androidx.compose.ui.graphics.ShaderBrush shaderBrush;

    /* renamed from: size$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState size = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Size.m5809boximpl(androidx.compose.ui.geometry.Size.INSTANCE.m5829getUnspecifiedNHjbRc()), null, 2, null);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.runtime.State<android.graphics.Shader> getHighSpeedVideoSizes = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.ui.text.platform.style.ShaderBrushSpan$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.compose.ui.text.platform.style.ShaderBrushSpan.$r8$lambda$KeMyxhuF3EYMhl9vgBGt4ME3jBA(androidx.compose.ui.text.platform.style.ShaderBrushSpan.this);
        }
    });

    public ShaderBrushSpan(androidx.compose.ui.graphics.ShaderBrush shaderBrush, float f) {
        this.shaderBrush = shaderBrush;
        this.alpha = f;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final androidx.compose.ui.graphics.ShaderBrush getShaderBrush() {
        return this.shaderBrush;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m8307getSizeNHjbRc() {
        return ((androidx.compose.ui.geometry.Size) this.size.getValue()).m5826unboximpl();
    }

    /* renamed from: setSize-uvyYCjk, reason: not valid java name */
    public final void m8308setSizeuvyYCjk(long j) {
        this.size.setValue(androidx.compose.ui.geometry.Size.m5809boximpl(j));
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        androidx.compose.ui.text.platform.AndroidTextPaint_androidKt.setAlpha(textPaint, this.alpha);
        textPaint.setShader(this.getHighSpeedVideoSizes.getValue());
    }

    public static /* synthetic */ android.graphics.Shader $r8$lambda$KeMyxhuF3EYMhl9vgBGt4ME3jBA(androidx.compose.ui.text.platform.style.ShaderBrushSpan shaderBrushSpan) {
        if (shaderBrushSpan.m8307getSizeNHjbRc() == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats || androidx.compose.ui.geometry.Size.m5823isEmptyimpl(shaderBrushSpan.m8307getSizeNHjbRc())) {
            return null;
        }
        return shaderBrushSpan.shaderBrush.mo5965createShaderuvyYCjk(shaderBrushSpan.m8307getSizeNHjbRc());
    }
}
