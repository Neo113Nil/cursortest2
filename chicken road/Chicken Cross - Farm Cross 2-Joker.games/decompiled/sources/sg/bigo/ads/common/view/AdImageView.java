package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.K0.RunnableC4961s;
import sg.bigo.ads.L0.C4982b;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.s0.p;

/* loaded from: classes3.dex */
public class AdImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12706a;
    public boolean b;
    public final p c;

    public AdImageView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageBitmapInternal(Bitmap bitmap) {
        if (this.b) {
            AbstractC4962t.a(this, bitmap);
        } else {
            super.setImageBitmap(bitmap);
        }
    }

    private void setImageBitmapWithGradient(Bitmap bitmap) {
        AbstractC5446j.a(3, null, new RunnableC4961s(bitmap, new C4982b(this)), 0L);
    }

    public void setBlurBorder(boolean z) {
        this.f12706a = z;
    }

    public void setFadeEnable(boolean z) {
        this.b = z;
    }

    public void setIconTag(boolean z) {
        p pVar = this.c;
        if (pVar != null) {
            pVar.b = z;
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        if (!this.f12706a || bitmap == null) {
            setImageBitmapInternal(bitmap);
        } else {
            setImageBitmapWithGradient(bitmap);
        }
    }

    public AdImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public final void a(String str, boolean z) {
        this.c.a(null, str, z);
    }

    public AdImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12706a = false;
        this.b = false;
        this.c = new p(this);
    }
}
