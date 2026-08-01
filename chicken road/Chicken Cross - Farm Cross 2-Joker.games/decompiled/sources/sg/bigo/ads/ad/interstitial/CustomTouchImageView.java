package sg.bigo.ads.ad.interstitial;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import sg.bigo.ads.h.InterfaceC5216w;

/* loaded from: classes3.dex */
public class CustomTouchImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC5216w f12681a;
    public final Rect b;
    public float c;
    public boolean d;

    public CustomTouchImageView(Context context) {
        super(context);
        this.b = new Rect();
        this.c = 1.0f;
        this.d = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.d && motionEvent.getAction() == 0) {
            if (this.c == 1.0f) {
                InterfaceC5216w interfaceC5216w = this.f12681a;
                if (interfaceC5216w != null) {
                    interfaceC5216w.a();
                }
                return true;
            }
            float x = (int) motionEvent.getX();
            float y = (int) motionEvent.getY();
            float f = this.c;
            float width = getWidth();
            float f2 = width * f;
            float height = getHeight();
            float f3 = f * height;
            float f4 = (width - f2) / 2.0f;
            float f5 = (height - f3) / 2.0f;
            float f6 = f2 + f4;
            float f7 = f3 + f5;
            if (x >= f4 && x <= f6 && y >= f5 && y <= f7) {
                InterfaceC5216w interfaceC5216w2 = this.f12681a;
                if (interfaceC5216w2 != null) {
                    interfaceC5216w2.a();
                }
                return true;
            }
            getGlobalVisibleRect(this.b);
            InterfaceC5216w interfaceC5216w3 = this.f12681a;
            if (interfaceC5216w3 != null) {
                interfaceC5216w3.a(this.b);
            }
        }
        return false;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        this.d = z;
    }

    public void setCloseListener(InterfaceC5216w interfaceC5216w) {
        this.f12681a = interfaceC5216w;
    }

    public void setRegionScale(float f) {
        this.c = f;
    }

    public CustomTouchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = 1.0f;
        this.d = true;
    }

    public CustomTouchImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new Rect();
        this.c = 1.0f;
        this.d = true;
    }
}
