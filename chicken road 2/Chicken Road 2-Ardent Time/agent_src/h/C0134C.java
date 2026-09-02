package h;

/* renamed from: h.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0134C extends android.view.ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final float f3042a;

    /* renamed from: b, reason: collision with root package name */
    public int f3043b;

    public C0134C(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3043b = -1;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.AbstractC0095a.f2541j);
        this.f3042a = obtainStyledAttributes.getFloat(3, 0.0f);
        this.f3043b = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public C0134C(int i2) {
        super(i2, -2);
        this.f3043b = -1;
        this.f3042a = 0.0f;
    }

    public C0134C(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3043b = -1;
    }
}
