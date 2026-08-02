package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* loaded from: classes.dex */
public class AppCompatRatingBar extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0671x f8294a;

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        X0.a(getContext(), this);
        C0671x c0671x = new C0671x(this);
        this.f8294a = c0671x;
        c0671x.b(attributeSet, i7);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        Bitmap bitmap = (Bitmap) this.f8294a.f8756c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i7, 0), getMeasuredHeight());
        }
    }
}
