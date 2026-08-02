package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: am */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0023am {

    /* JADX INFO: renamed from: a */
    public int f243a;

    /* JADX INFO: renamed from: b */
    public int f244b;

    /* JADX INFO: renamed from: c */
    public float f245c;

    /* JADX INFO: renamed from: d */
    public float f246d;

    /* JADX INFO: renamed from: a */
    public final void m275a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iz0.f3756g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f245c = typedArrayObtainStyledAttributes.getFloat(index, this.f245c);
            } else if (index == 0) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f243a);
                this.f243a = i2;
                this.f243a = C0103cm.f1288d[i2];
            } else if (index == 4) {
                this.f244b = typedArrayObtainStyledAttributes.getInt(index, this.f244b);
            } else if (index == 3) {
                this.f246d = typedArrayObtainStyledAttributes.getFloat(index, this.f246d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
