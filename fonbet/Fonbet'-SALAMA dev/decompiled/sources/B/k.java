package B;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f885a;

    /* renamed from: b, reason: collision with root package name */
    public int f886b;

    /* renamed from: c, reason: collision with root package name */
    public int f887c;

    /* renamed from: d, reason: collision with root package name */
    public float f888d;

    /* renamed from: e, reason: collision with root package name */
    public float f889e;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f951w);
        this.f885a = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            if (index == 1) {
                this.f888d = obtainStyledAttributes.getFloat(index, this.f888d);
            } else if (index == 0) {
                int i8 = obtainStyledAttributes.getInt(index, this.f886b);
                this.f886b = i8;
                this.f886b = m.f904g[i8];
            } else if (index == 4) {
                this.f887c = obtainStyledAttributes.getInt(index, this.f887c);
            } else if (index == 3) {
                this.f889e = obtainStyledAttributes.getFloat(index, this.f889e);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
