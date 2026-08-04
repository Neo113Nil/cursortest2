package p059i0;

import Y4.D;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import p046g0.j;

/* JADX INFO: loaded from: classes.dex */
public final class g extends D {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f13830k;

    public g(TextView textView) {
        this.f13830k = new f(textView);
    }

    @Override // Y4.D
    public final void S(boolean z4) {
        if (j.j != null) {
            this.f13830k.S(z4);
        }
    }

    @Override // Y4.D
    public final void T(boolean z4) {
        boolean z7 = j.j != null;
        f fVar = this.f13830k;
        if (z7) {
            fVar.T(z4);
        } else {
            fVar.f13829m = z4;
        }
    }

    @Override // Y4.D
    public final TransformationMethod j0(TransformationMethod transformationMethod) {
        return !(j.j != null) ? transformationMethod : this.f13830k.j0(transformationMethod);
    }

    @Override // Y4.D
    public final InputFilter[] r(InputFilter[] inputFilterArr) {
        return !(j.j != null) ? inputFilterArr : this.f13830k.r(inputFilterArr);
    }

    @Override // Y4.D
    public final boolean y() {
        return this.f13830k.f13829m;
    }
}
