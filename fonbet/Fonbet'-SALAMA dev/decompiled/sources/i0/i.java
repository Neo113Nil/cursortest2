package i0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import g0.j;

/* loaded from: classes.dex */
public final class i implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public final TransformationMethod f13828a;

    public i(TransformationMethod transformationMethod) {
        this.f13828a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f13828a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || j.a().b() != 1) {
            return charSequence;
        }
        j a2 = j.a();
        a2.getClass();
        return a2.e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z4, int i7, Rect rect) {
        TransformationMethod transformationMethod = this.f13828a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z4, i7, rect);
        }
    }
}
