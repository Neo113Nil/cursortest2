package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import g.AbstractC0301a;

/* loaded from: classes.dex */
public class D extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final float f9688a;

    /* renamed from: b, reason: collision with root package name */
    public int f9689b;

    public D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9689b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0301a.f4934j);
        this.f9688a = obtainStyledAttributes.getFloat(3, 0.0f);
        this.f9689b = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public D(int i3) {
        super(i3, -2);
        this.f9689b = -1;
        this.f9688a = 0.0f;
    }

    public D(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f9689b = -1;
    }
}
