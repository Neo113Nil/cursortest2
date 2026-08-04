package p059i0;

import Y4.D;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class f extends D {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f13827k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f13828l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13829m = true;

    public f(TextView textView) {
        this.f13827k = textView;
        this.f13828l = new d(textView);
    }

    @Override // Y4.D
    public final void S(boolean z4) {
        if (z4) {
            TextView textView = this.f13827k;
            textView.setTransformationMethod(j0(textView.getTransformationMethod()));
        }
    }

    @Override // Y4.D
    public final void T(boolean z4) {
        this.f13829m = z4;
        TextView textView = this.f13827k;
        textView.setTransformationMethod(j0(textView.getTransformationMethod()));
        textView.setFilters(r(textView.getFilters()));
    }

    @Override // Y4.D
    public final TransformationMethod j0(TransformationMethod transformationMethod) {
        if (this.f13829m) {
            return ((transformationMethod instanceof i) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new i(transformationMethod);
        }
        return transformationMethod instanceof i ? ((i) transformationMethod).f13834a : transformationMethod;
    }

    @Override // Y4.D
    public final InputFilter[] r(InputFilter[] inputFilterArr) {
        if (!this.f13829m) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i7 = 0; i7 < inputFilterArr.length; i7++) {
                InputFilter inputFilter = inputFilterArr[i7];
                if (inputFilter instanceof d) {
                    sparseArray.put(i7, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                if (sparseArray.indexOfKey(i9) < 0) {
                    inputFilterArr2[i8] = inputFilterArr[i9];
                    i8++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i10 = 0;
        while (true) {
            d dVar = this.f13828l;
            if (i10 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i10] == dVar) {
                return inputFilterArr;
            }
            i10++;
        }
    }

    @Override // Y4.D
    public final boolean y() {
        return this.f13829m;
    }
}
