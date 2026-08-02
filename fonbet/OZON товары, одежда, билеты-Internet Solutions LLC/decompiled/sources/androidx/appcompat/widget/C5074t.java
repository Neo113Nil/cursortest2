package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;

/* renamed from: androidx.appcompat.widget.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5074t extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    private final C5075u f37970a;

    public C5074t(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        W.a(this, getContext());
        C5075u c5075u = new C5075u(this);
        this.f37970a = c5075u;
        c5075u.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f37970a.f();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f37970a.g();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f37970a.e(canvas);
    }
}
