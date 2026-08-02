package i0;

import Y4.D;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* renamed from: i0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1239f extends D {

    /* renamed from: k, reason: collision with root package name */
    public final TextView f13821k;

    /* renamed from: l, reason: collision with root package name */
    public final C1237d f13822l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13823m = true;

    public C1239f(TextView textView) {
        this.f13821k = textView;
        this.f13822l = new C1237d(textView);
    }

    @Override // Y4.D
    public final void S(boolean z4) {
        if (z4) {
            TextView textView = this.f13821k;
            textView.setTransformationMethod(j0(textView.getTransformationMethod()));
        }
    }

    @Override // Y4.D
    public final void T(boolean z4) {
        this.f13823m = z4;
        TextView textView = this.f13821k;
        textView.setTransformationMethod(j0(textView.getTransformationMethod()));
        textView.setFilters(r(textView.getFilters()));
    }

    @Override // Y4.D
    public final TransformationMethod j0(TransformationMethod transformationMethod) {
        return this.f13823m ? ((transformationMethod instanceof i) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new i(transformationMethod) : transformationMethod instanceof i ? ((i) transformationMethod).f13828a : transformationMethod;
    }

    @Override // Y4.D
    public final InputFilter[] r(InputFilter[] inputFilterArr) {
        if (!this.f13823m) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i7 = 0; i7 < inputFilterArr.length; i7++) {
                InputFilter inputFilter = inputFilterArr[i7];
                if (inputFilter instanceof C1237d) {
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
            C1237d c1237d = this.f13822l;
            if (i10 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c1237d;
                return inputFilterArr3;
            }
            if (inputFilterArr[i10] == c1237d) {
                return inputFilterArr;
            }
            i10++;
        }
    }

    @Override // Y4.D
    public final boolean y() {
        return this.f13823m;
    }
}
