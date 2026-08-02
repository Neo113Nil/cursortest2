package x1;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import v1.k;

/* loaded from: classes.dex */
public final class j implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public final TransformationMethod f21086a;

    public j(TransformationMethod transformationMethod) {
        this.f21086a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f21086a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || k.a().c() != 1) {
            return charSequence;
        }
        k a5 = k.a();
        a5.getClass();
        return a5.g(0, charSequence.length(), 0, charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z3, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f21086a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z3, i, rect);
        }
    }
}
