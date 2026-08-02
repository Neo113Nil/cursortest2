package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes.dex */
public class AppCompatSeekBar extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0675z f8295a;

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        X0.a(getContext(), this);
        C0675z c0675z = new C0675z(this);
        this.f8295a = c0675z;
        c0675z.b(attributeSet, i7);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0675z c0675z = this.f8295a;
        Drawable drawable = c0675z.f8758f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        AppCompatSeekBar appCompatSeekBar = c0675z.f8757e;
        if (drawable.setState(appCompatSeekBar.getDrawableState())) {
            appCompatSeekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8295a.f8758f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f8295a.g(canvas);
    }
}
