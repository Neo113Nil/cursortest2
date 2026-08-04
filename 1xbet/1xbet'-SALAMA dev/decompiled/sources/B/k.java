package B;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f889e;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f951w);
        this.f885a = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == 1) {
                this.f888d = typedArrayObtainStyledAttributes.getFloat(index, this.f888d);
            } else if (index == 0) {
                int i8 = typedArrayObtainStyledAttributes.getInt(index, this.f886b);
                this.f886b = i8;
                this.f886b = m.f904g[i8];
            } else if (index == 4) {
                this.f887c = typedArrayObtainStyledAttributes.getInt(index, this.f887c);
            } else if (index == 3) {
                this.f889e = typedArrayObtainStyledAttributes.getFloat(index, this.f889e);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
