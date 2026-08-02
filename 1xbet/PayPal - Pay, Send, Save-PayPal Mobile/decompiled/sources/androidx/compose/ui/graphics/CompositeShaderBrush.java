package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000e\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016"}, d2 = {"Landroidx/compose/ui/graphics/CompositeShaderBrush;", "Landroidx/compose/ui/graphics/ShaderBrush;", "dstBrush", "srcBrush", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "<init>", "(Landroidx/compose/ui/graphics/ShaderBrush;Landroidx/compose/ui/graphics/ShaderBrush;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/geometry/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/getHighSpeedVideoFpsRanges;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/ShaderBrush;", "getDstBrush", "()Landroidx/compose/ui/graphics/ShaderBrush;", "getSrcBrush", com.visa.cbp.getEncExpo.warmup, "getBlendMode-0nO6VwU"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompositeShaderBrush extends androidx.compose.ui.graphics.ShaderBrush {
    public static final int $stable = 0;
    private final int blendMode;
    private final androidx.compose.ui.graphics.ShaderBrush dstBrush;
    private final androidx.compose.ui.graphics.ShaderBrush srcBrush;

    private CompositeShaderBrush(androidx.compose.ui.graphics.ShaderBrush shaderBrush, androidx.compose.ui.graphics.ShaderBrush shaderBrush2, int i) {
        this.dstBrush = shaderBrush;
        this.srcBrush = shaderBrush2;
        this.blendMode = i;
    }

    public final androidx.compose.ui.graphics.ShaderBrush getDstBrush() {
        return this.dstBrush;
    }

    public final androidx.compose.ui.graphics.ShaderBrush getSrcBrush() {
        return this.srcBrush;
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name and from getter */
    public final int getBlendMode() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public final android.graphics.Shader mo5965createShaderuvyYCjk(long size) {
        return androidx.compose.ui.graphics.ShaderKt.m6307CompositeShader7EN7VTw(this.dstBrush.mo5965createShaderuvyYCjk(size), this.srcBrush.mo5965createShaderuvyYCjk(size), this.blendMode);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.graphics.CompositeShaderBrush)) {
            return false;
        }
        androidx.compose.ui.graphics.CompositeShaderBrush compositeShaderBrush = (androidx.compose.ui.graphics.CompositeShaderBrush) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.dstBrush, compositeShaderBrush.dstBrush) && kotlin.jvm.internal.Intrinsics.areEqual(this.srcBrush, compositeShaderBrush.srcBrush) && androidx.compose.ui.graphics.BlendMode.m5906equalsimpl0(this.blendMode, compositeShaderBrush.blendMode);
    }

    public final int hashCode() {
        return (((this.dstBrush.hashCode() * 31) + this.srcBrush.hashCode()) * 31) + androidx.compose.ui.graphics.BlendMode.m5907hashCodeimpl(this.blendMode);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CompositeShaderBrush(dstBrush=");
        sb.append(this.dstBrush);
        sb.append(", srcBrush=");
        sb.append(this.srcBrush);
        sb.append(", blendMode=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.BlendMode.m5908toStringimpl(this.blendMode));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ CompositeShaderBrush(androidx.compose.ui.graphics.ShaderBrush shaderBrush, androidx.compose.ui.graphics.ShaderBrush shaderBrush2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(shaderBrush, shaderBrush2, i);
    }
}
