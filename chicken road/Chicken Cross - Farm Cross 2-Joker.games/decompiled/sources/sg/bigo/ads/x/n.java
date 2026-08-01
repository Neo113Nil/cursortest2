package sg.bigo.ads.x;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.ImageView;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.RoundedImageView;

/* loaded from: classes3.dex */
public final class n implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f13377a;

    public n(o oVar) {
        this.f13377a = oVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        int a2 = AbstractC4963u.a(this.f13377a.f13378a.q.getContext(), 16);
        RoundedImageView roundedImageView = new RoundedImageView(this.f13377a.f13378a.q.getContext());
        roundedImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        roundedImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        float f = a2;
        roundedImageView.f12714a = f;
        roundedImageView.b = f;
        roundedImageView.c = 0.0f;
        roundedImageView.d = 0.0f;
        roundedImageView.invalidate();
        ((FrameLayout) this.f13377a.f13378a.q.findViewById(R.id.inter_media_layout)).addView(roundedImageView, 0);
        roundedImageView.setImageBitmap(bitmap);
    }
}
