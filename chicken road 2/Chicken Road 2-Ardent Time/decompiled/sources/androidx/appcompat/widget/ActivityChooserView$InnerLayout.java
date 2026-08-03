package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends android.widget.LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2035a = {android.R.attr.background};

    public ActivityChooserView$InnerLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2035a);
        setBackgroundDrawable((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : d.AbstractC0106a.a(context, resourceId));
        obtainStyledAttributes.recycle();
    }
}
