package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: bm */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0067bm {

    /* JADX INFO: renamed from: n */
    public static final SparseIntArray f904n;

    /* JADX INFO: renamed from: a */
    public float f905a;

    /* JADX INFO: renamed from: b */
    public float f906b;

    /* JADX INFO: renamed from: c */
    public float f907c;

    /* JADX INFO: renamed from: d */
    public float f908d;

    /* JADX INFO: renamed from: e */
    public float f909e;

    /* JADX INFO: renamed from: f */
    public float f910f;

    /* JADX INFO: renamed from: g */
    public float f911g;

    /* JADX INFO: renamed from: h */
    public int f912h;

    /* JADX INFO: renamed from: i */
    public float f913i;

    /* JADX INFO: renamed from: j */
    public float f914j;

    /* JADX INFO: renamed from: k */
    public float f915k;

    /* JADX INFO: renamed from: l */
    public boolean f916l;

    /* JADX INFO: renamed from: m */
    public float f917m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f904n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    /* JADX INFO: renamed from: a */
    public final void m723a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iz0.f3758i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f904n.get(index)) {
                case 1:
                    this.f905a = typedArrayObtainStyledAttributes.getFloat(index, this.f905a);
                    break;
                case 2:
                    this.f906b = typedArrayObtainStyledAttributes.getFloat(index, this.f906b);
                    break;
                case 3:
                    this.f907c = typedArrayObtainStyledAttributes.getFloat(index, this.f907c);
                    break;
                case 4:
                    this.f908d = typedArrayObtainStyledAttributes.getFloat(index, this.f908d);
                    break;
                case 5:
                    this.f909e = typedArrayObtainStyledAttributes.getFloat(index, this.f909e);
                    break;
                case 6:
                    this.f910f = typedArrayObtainStyledAttributes.getDimension(index, this.f910f);
                    break;
                case 7:
                    this.f911g = typedArrayObtainStyledAttributes.getDimension(index, this.f911g);
                    break;
                case 8:
                    this.f913i = typedArrayObtainStyledAttributes.getDimension(index, this.f913i);
                    break;
                case 9:
                    this.f914j = typedArrayObtainStyledAttributes.getDimension(index, this.f914j);
                    break;
                case 10:
                    this.f915k = typedArrayObtainStyledAttributes.getDimension(index, this.f915k);
                    break;
                case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                    this.f916l = true;
                    this.f917m = typedArrayObtainStyledAttributes.getDimension(index, this.f917m);
                    break;
                case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                    this.f912h = C0103cm.m969e(typedArrayObtainStyledAttributes, index, this.f912h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
