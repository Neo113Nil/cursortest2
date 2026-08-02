package androidx.core.graphics;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/graphics/Shader;", "Lkotlin/Function1;", "Landroid/graphics/Matrix;", "", "Lkotlin/ExtensionFunctionType;", "block", "transform", "(Landroid/graphics/Shader;Lkotlin/jvm/functions/Function1;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShaderKt {
    public static final void transform(android.graphics.Shader shader, kotlin.jvm.functions.Function1<? super android.graphics.Matrix, kotlin.Unit> function1) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        shader.getLocalMatrix(matrix);
        function1.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
