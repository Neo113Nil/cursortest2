package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: zl */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0955zl {

    /* JADX INFO: renamed from: j */
    public static final SparseIntArray f9849j;

    /* JADX INFO: renamed from: a */
    public int f9850a;

    /* JADX INFO: renamed from: b */
    public int f9851b;

    /* JADX INFO: renamed from: c */
    public int f9852c;

    /* JADX INFO: renamed from: d */
    public float f9853d;

    /* JADX INFO: renamed from: e */
    public float f9854e;

    /* JADX INFO: renamed from: f */
    public float f9855f;

    /* JADX INFO: renamed from: g */
    public int f9856g;

    /* JADX INFO: renamed from: h */
    public String f9857h;

    /* JADX INFO: renamed from: i */
    public int f9858i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9849j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    /* JADX INFO: renamed from: a */
    public final void m5935a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iz0.f3755f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f9849j.get(index)) {
                case 1:
                    this.f9854e = typedArrayObtainStyledAttributes.getFloat(index, this.f9854e);
                    break;
                case 2:
                    this.f9852c = typedArrayObtainStyledAttributes.getInt(index, this.f9852c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = d71.f1567a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f9850a = C0103cm.m969e(typedArrayObtainStyledAttributes, index, this.f9850a);
                    break;
                case 6:
                    this.f9851b = typedArrayObtainStyledAttributes.getInteger(index, this.f9851b);
                    break;
                case 7:
                    this.f9853d = typedArrayObtainStyledAttributes.getFloat(index, this.f9853d);
                    break;
                case 8:
                    this.f9856g = typedArrayObtainStyledAttributes.getInteger(index, this.f9856g);
                    break;
                case 9:
                    this.f9855f = typedArrayObtainStyledAttributes.getFloat(index, this.f9855f);
                    break;
                case 10:
                    int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        this.f9858i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    } else if (i2 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f9857h = string;
                        if (string.indexOf("/") > 0) {
                            this.f9858i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.f9858i);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
