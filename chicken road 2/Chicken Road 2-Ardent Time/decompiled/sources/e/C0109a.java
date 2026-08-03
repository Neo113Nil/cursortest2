package e;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0109a implements android.text.method.TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Locale f2743a;

    @Override // android.text.method.TransformationMethod
    public final java.lang.CharSequence getTransformation(java.lang.CharSequence charSequence, android.view.View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f2743a);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(android.view.View view, java.lang.CharSequence charSequence, boolean z2, int i2, android.graphics.Rect rect) {
    }
}
