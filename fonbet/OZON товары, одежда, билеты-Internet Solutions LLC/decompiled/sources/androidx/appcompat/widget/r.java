package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
public final class r extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    private final C5071p f37969a;

    public r(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        W.a(this, getContext());
        C5071p c5071p = new C5071p(this);
        this.f37969a = c5071p;
        c5071p.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        Bitmap a11 = this.f37969a.a();
        if (a11 != null) {
            setMeasuredDimension(View.resolveSizeAndState(a11.getWidth() * getNumStars(), i11, 0), getMeasuredHeight());
        }
    }
}
