package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class DialogTitle extends h.C0161t {
    public DialogTitle(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // h.C0161t, android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int lineCount;
        super.onMeasure(i2, i3);
        android.text.Layout layout = getLayout();
        if (layout == null || (lineCount = layout.getLineCount()) <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
            return;
        }
        setSingleLine(false);
        setMaxLines(2);
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, c.AbstractC0095a.f2550s, android.R.attr.textAppearanceMedium, android.R.style.TextAppearance.Medium);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
        super.onMeasure(i2, i3);
    }
}
