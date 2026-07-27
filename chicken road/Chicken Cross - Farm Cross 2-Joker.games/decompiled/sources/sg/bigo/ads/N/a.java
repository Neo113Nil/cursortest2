package sg.bigo.ads.N;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import sg.bigo.ads.d1.AbstractC5068d;

/* loaded from: classes3.dex */
public abstract class a extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC5068d f12463a;

    public a(Context context) {
        super(context);
    }

    public abstract AbstractC5068d a();

    public final synchronized AbstractC5068d getViewImpl() {
        if (this.f12463a == null) {
            this.f12463a = a();
        }
        return this.f12463a;
    }

    @Override // android.view.View
    @Deprecated
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
