package sg.bigo.ads.h;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.ImageView;

/* renamed from: sg.bigo.ads.h.q1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5200q1 implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f12918a;
    public final /* synthetic */ F1 b;

    public C5200q1(F1 f1, ViewGroup viewGroup) {
        this.b = f1;
        this.f12918a = viewGroup;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        View findViewWithTag = this.f12918a.findViewWithTag("adview_background_main_tag");
        if (findViewWithTag instanceof ImageView) {
            this.b.h = (ImageView) findViewWithTag;
        } else {
            Context context = this.f12918a.getContext();
            if (context != null) {
                this.b.h = new ImageView(context);
                this.b.h.setTag("adview_background_main_tag");
                this.b.h.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                sg.bigo.ads.K0.X.a(this.b.h, this.f12918a, null, 0);
            }
        }
        ImageView imageView = this.b.h;
        if (imageView == null || bitmap == null) {
            return;
        }
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.b.h.setImageBitmap(bitmap);
    }
}
