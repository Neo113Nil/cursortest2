package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import live.football.scorerepublic.R;

/* JADX INFO: renamed from: m6 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0459m6 extends SeekBar {

    /* JADX INFO: renamed from: j */
    public final C0496n6 f4981j;

    public C0459m6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        zc1.m5876a(this, getContext());
        C0496n6 c0496n6 = new C0496n6(this);
        this.f4981j = c0496n6;
        c0496n6.mo2544o(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0496n6 c0496n6 = this.f4981j;
        C0459m6 c0459m6 = c0496n6.f5302q;
        Drawable drawable = c0496n6.f5303r;
        if (drawable != null && drawable.isStateful() && drawable.setState(c0459m6.getDrawableState())) {
            c0459m6.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4981j.f5303r;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f4981j.m3486F(canvas);
    }
}
