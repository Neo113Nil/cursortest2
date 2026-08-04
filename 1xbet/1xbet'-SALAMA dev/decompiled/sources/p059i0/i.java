package p059i0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import p046g0.j;

/* JADX INFO: loaded from: classes.dex */
public final class i implements TransformationMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransformationMethod f13834a;

    public i(TransformationMethod transformationMethod) {
        this.f13834a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f13834a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || j.a().b() != 1) {
            return charSequence;
        }
        j jVarA = j.a();
        jVarA.getClass();
        return jVarA.e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z4, int i7, Rect rect) {
        TransformationMethod transformationMethod = this.f13834a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z4, i7, rect);
        }
    }
}
