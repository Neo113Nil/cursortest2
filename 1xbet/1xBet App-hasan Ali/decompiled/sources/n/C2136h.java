package n;

import android.content.Context;
import android.graphics.drawable.Drawable;
import game.betting133.sports1xbet.R;
import m.ViewOnTouchListenerC2063a;
import r0.AbstractC2346c;

/* renamed from: n.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2136h extends C2148s implements InterfaceC2141k {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2140j f18247n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2136h(C2140j c2140j, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f18247n = c2140j;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC2346c.E(this, getContentDescription());
        setOnTouchListener(new ViewOnTouchListenerC2063a(this, this));
    }

    @Override // n.InterfaceC2141k
    public final boolean b() {
        return false;
    }

    @Override // n.InterfaceC2141k
    public final boolean d() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f18247n.i();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i5, int i6, int i7) {
        boolean frame = super.setFrame(i, i5, i6, i7);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
