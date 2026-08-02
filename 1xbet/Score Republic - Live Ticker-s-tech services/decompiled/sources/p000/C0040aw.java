package p000;

import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: renamed from: aw */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0040aw extends vk1 {

    /* JADX INFO: renamed from: e */
    public final C0965zv f646e;

    public C0040aw(TextView textView) {
        this.f646e = new C0965zv(textView);
    }

    @Override // p000.vk1
    /* JADX INFO: renamed from: b */
    public final InputFilter[] mo489b(InputFilter[] inputFilterArr) {
        return !(C0595pv.f6261k != null) ? inputFilterArr : this.f646e.mo489b(inputFilterArr);
    }

    @Override // p000.vk1
    /* JADX INFO: renamed from: g */
    public final void mo490g(boolean z) {
        if (C0595pv.f6261k != null) {
            this.f646e.mo490g(z);
        }
    }

    @Override // p000.vk1
    /* JADX INFO: renamed from: h */
    public final void mo491h(boolean z) {
        boolean z2 = C0595pv.f6261k != null;
        C0965zv c0965zv = this.f646e;
        if (z2) {
            c0965zv.mo491h(z);
        } else {
            c0965zv.f9967g = z;
        }
    }
}
