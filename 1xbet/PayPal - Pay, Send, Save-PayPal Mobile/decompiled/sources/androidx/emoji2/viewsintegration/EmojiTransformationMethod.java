package androidx.emoji2.viewsintegration;

/* loaded from: classes3.dex */
class EmojiTransformationMethod implements android.text.method.TransformationMethod {
    final android.text.method.TransformationMethod Camera2StreamConfigurationMap;

    EmojiTransformationMethod(android.text.method.TransformationMethod transformationMethod) {
        this.Camera2StreamConfigurationMap = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public java.lang.CharSequence getTransformation(java.lang.CharSequence charSequence, android.view.View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        android.text.method.TransformationMethod transformationMethod = this.Camera2StreamConfigurationMap;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || androidx.emoji2.text.EmojiCompat.get().getLoadState() != 1) ? charSequence : androidx.emoji2.text.EmojiCompat.get().process(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(android.view.View view, java.lang.CharSequence charSequence, boolean z, int i, android.graphics.Rect rect) {
        android.text.method.TransformationMethod transformationMethod = this.Camera2StreamConfigurationMap;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
