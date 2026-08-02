package p000;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: renamed from: zv */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0965zv extends vk1 {

    /* JADX INFO: renamed from: e */
    public final TextView f9965e;

    /* JADX INFO: renamed from: f */
    public final C0817vv f9966f;

    /* JADX INFO: renamed from: g */
    public boolean f9967g = true;

    public C0965zv(TextView textView) {
        this.f9965e = textView;
        this.f9966f = new C0817vv(textView);
    }

    @Override // p000.vk1
    /* JADX INFO: renamed from: b */
    public final InputFilter[] mo489b(InputFilter[] inputFilterArr) {
        if (!this.f9967g) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C0817vv) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            C0817vv c0817vv = this.f9966f;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c0817vv;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == c0817vv) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // p000.vk1
    /* JADX INFO: renamed from: g */
    public final void mo490g(boolean z) {
        if (z) {
            m6042j();
        }
    }

    @Override // p000.vk1
    /* JADX INFO: renamed from: h */
    public final void mo491h(boolean z) {
        this.f9967g = z;
        m6042j();
        TextView textView = this.f9965e;
        textView.setFilters(mo489b(textView.getFilters()));
    }

    /* JADX INFO: renamed from: j */
    public final void m6042j() {
        TextView textView = this.f9965e;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f9967g) {
            if (!(transformationMethod instanceof C0152dw) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new C0152dw(transformationMethod);
            }
        } else if (transformationMethod instanceof C0152dw) {
            transformationMethod = ((C0152dw) transformationMethod).f1854j;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
