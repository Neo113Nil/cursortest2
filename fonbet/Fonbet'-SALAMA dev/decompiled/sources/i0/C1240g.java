package i0;

import Y4.D;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import g0.j;

/* renamed from: i0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1240g extends D {

    /* renamed from: k, reason: collision with root package name */
    public final C1239f f13824k;

    public C1240g(TextView textView) {
        this.f13824k = new C1239f(textView);
    }

    @Override // Y4.D
    public final void S(boolean z4) {
        if (j.j != null) {
            this.f13824k.S(z4);
        }
    }

    @Override // Y4.D
    public final void T(boolean z4) {
        boolean z7 = j.j != null;
        C1239f c1239f = this.f13824k;
        if (z7) {
            c1239f.T(z4);
        } else {
            c1239f.f13823m = z4;
        }
    }

    @Override // Y4.D
    public final TransformationMethod j0(TransformationMethod transformationMethod) {
        return !(j.j != null) ? transformationMethod : this.f13824k.j0(transformationMethod);
    }

    @Override // Y4.D
    public final InputFilter[] r(InputFilter[] inputFilterArr) {
        return !(j.j != null) ? inputFilterArr : this.f13824k.r(inputFilterArr);
    }

    @Override // Y4.D
    public final boolean y() {
        return this.f13824k.f13823m;
    }
}
