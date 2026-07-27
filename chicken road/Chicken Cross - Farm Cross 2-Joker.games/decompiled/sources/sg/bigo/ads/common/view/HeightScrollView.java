package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import sg.bigo.ads.L0.g;
import sg.bigo.ads.m0.l;

/* loaded from: classes3.dex */
public class HeightScrollView extends ScrollView {

    /* renamed from: a, reason: collision with root package name */
    public g f12708a;
    public boolean b;
    public View c;
    public int d;

    public HeightScrollView(Context context) {
        super(context);
        this.b = true;
        this.d = 0;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        View view = this.c;
        if (view != null) {
            this.d = view.getHeight() - i2;
        }
        g gVar = this.f12708a;
        if (gVar != null) {
            l lVar = (l) gVar;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) lVar.f13119a.getLayoutParams();
            marginLayoutParams.topMargin = lVar.b - i2;
            lVar.f13119a.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.b) {
            return false;
        }
        if (this.c != null && y < this.d) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlankView(View view) {
        this.c = view;
    }

    public void setOnScrollListener(g gVar) {
        this.f12708a = gVar;
    }

    public void setScrollEnable(boolean z) {
        this.b = z;
    }

    public HeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = true;
        this.d = 0;
    }

    public HeightScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = true;
        this.d = 0;
    }
}
