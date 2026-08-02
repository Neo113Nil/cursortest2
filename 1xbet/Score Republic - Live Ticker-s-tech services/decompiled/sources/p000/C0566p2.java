package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import live.football.scorerepublic.R;

/* JADX INFO: renamed from: p2 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0566p2 extends C0200f6 implements InterfaceC0640r2 {

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C0603q2 f5965m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0566p2(C0603q2 c0603q2, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f5965m = c0603q2;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        yd1.m5788a(this, getContentDescription());
        setOnTouchListener(new C0381k2(this, this));
    }

    @Override // p000.InterfaceC0640r2
    /* JADX INFO: renamed from: b */
    public final boolean mo330b() {
        return false;
    }

    @Override // p000.InterfaceC0640r2
    /* JADX INFO: renamed from: c */
    public final boolean mo331c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f5965m.m4028l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
