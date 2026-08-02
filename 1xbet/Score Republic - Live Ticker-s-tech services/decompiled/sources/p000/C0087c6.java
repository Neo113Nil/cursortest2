package p000;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: c6 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0087c6 {

    /* JADX INFO: renamed from: a */
    public final TextView f1148a;

    /* JADX INFO: renamed from: b */
    public final nu1 f1149b;

    public C0087c6(TextView textView) {
        this.f1148a = textView;
        this.f1149b = new nu1(textView);
    }

    /* JADX INFO: renamed from: a */
    public final void m886a(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f1148a.getContext().obtainStyledAttributes(attributeSet, mz0.f5195i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m888c(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m887b(boolean z) {
        ((vk1) this.f1149b.f5551k).mo490g(z);
    }

    /* JADX INFO: renamed from: c */
    public final void m888c(boolean z) {
        ((vk1) this.f1149b.f5551k).mo491h(z);
    }
}
