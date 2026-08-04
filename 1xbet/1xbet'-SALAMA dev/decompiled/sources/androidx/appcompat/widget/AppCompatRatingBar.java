package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatRatingBar extends RatingBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0650x f8294a;

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        X0.a(getContext(), this);
        C0650x c0650x = new C0650x(this);
        this.f8294a = c0650x;
        c0650x.b(attributeSet, i7);
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
