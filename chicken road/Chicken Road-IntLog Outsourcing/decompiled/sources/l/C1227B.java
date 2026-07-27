package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import g.AbstractC0444a;

/* renamed from: l.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1227B extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final float f10745a;

    /* renamed from: b, reason: collision with root package name */
    public int f10746b;

    public C1227B(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10746b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0444a.f5702j);
        this.f10745a = obtainStyledAttributes.getFloat(3, 0.0f);
        this.f10746b = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public C1227B(int i2) {
        super(i2, -2);
        this.f10746b = -1;
        this.f10745a = 0.0f;
    }

    public C1227B(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f10746b = -1;
    }
}
