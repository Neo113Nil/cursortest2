package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.chicken.jump.road.pump.R;
import k.ViewOnTouchListenerC1060a;
import x.AbstractC1247a;

/* renamed from: l.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1089h extends C1098q implements InterfaceC1091j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1090i f9793c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1089h(C1090i c1090i, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f9793c = c1090i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        X0.a.J(this, getContentDescription());
        setOnTouchListener(new ViewOnTouchListenerC1060a(this, this));
    }

    @Override // l.InterfaceC1091j
    public final boolean b() {
        return false;
    }

    @Override // l.InterfaceC1091j
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f9793c.k();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i3, int i4, int i5, int i6) {
        boolean frame = super.setFrame(i3, i4, i5, i6);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            AbstractC1247a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
