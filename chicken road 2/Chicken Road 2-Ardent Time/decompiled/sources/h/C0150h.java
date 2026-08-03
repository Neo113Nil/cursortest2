package h;

/* renamed from: h.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0150h extends h.C0159q implements h.InterfaceC0152j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.C0151i f3160c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0150h(h.C0151i c0151i, android.content.Context context) {
        super(context, com.watchfacestudio.huasi_urx110.R.attr.actionOverflowButtonStyle);
        this.f3160c = c0151i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        u0.AbstractC0995a.z(this, getContentDescription());
        setOnTouchListener(new g.a(this, this));
    }

    @Override // h.InterfaceC0152j
    public final boolean a() {
        return false;
    }

    @Override // h.InterfaceC0152j
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f3160c.j();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i2, int i3, int i4, int i5) {
        boolean frame = super.setFrame(i2, i3, i4, i5);
        android.graphics.drawable.Drawable drawable = getDrawable();
        android.graphics.drawable.Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = java.lang.Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            s.AbstractC0989a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
