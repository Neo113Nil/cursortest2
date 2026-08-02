package x1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import n.C2111E;
import v.AbstractC2527w;

/* loaded from: classes.dex */
public final class f extends AbstractC2527w {

    /* renamed from: a, reason: collision with root package name */
    public final C2111E f21078a;

    /* renamed from: b, reason: collision with root package name */
    public final d f21079b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21080c = true;

    public f(C2111E c2111e) {
        this.f21078a = c2111e;
        this.f21079b = new d(c2111e);
    }

    @Override // v.AbstractC2527w
    public final InputFilter[] d(InputFilter[] inputFilterArr) {
        if (!this.f21080c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof d) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i5 = 0;
            for (int i6 = 0; i6 < length; i6++) {
                if (sparseArray.indexOfKey(i6) < 0) {
                    inputFilterArr2[i5] = inputFilterArr[i6];
                    i5++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i7 = 0;
        while (true) {
            d dVar = this.f21079b;
            if (i7 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i7] == dVar) {
                return inputFilterArr;
            }
            i7++;
        }
    }

    @Override // v.AbstractC2527w
    public final void g(boolean z3) {
        if (z3) {
            i();
        }
    }

    @Override // v.AbstractC2527w
    public final void h(boolean z3) {
        this.f21080c = z3;
        i();
        C2111E c2111e = this.f21078a;
        c2111e.setFilters(d(c2111e.getFilters()));
    }

    public final void i() {
        C2111E c2111e = this.f21078a;
        TransformationMethod transformationMethod = c2111e.getTransformationMethod();
        if (this.f21080c) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f21086a;
        }
        c2111e.setTransformationMethod(transformationMethod);
    }
}
