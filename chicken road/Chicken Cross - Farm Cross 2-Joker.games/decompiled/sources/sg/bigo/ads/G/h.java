package sg.bigo.ads.G;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import sg.bigo.ads.C.l;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.R;
import sg.bigo.ads.U.q;
import sg.bigo.ads.U.r;
import sg.bigo.ads.U0.k;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.s0.x;

/* loaded from: classes3.dex */
public abstract class h {
    public static final r h = new r(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);

    /* renamed from: a, reason: collision with root package name */
    public final l f12308a;
    public FrameLayout b;
    public Context c;
    public MediaView d;
    public Bitmap e;
    public g f;
    public Bitmap g;

    public h(l lVar, Context context) {
        this.f12308a = lVar;
        this.c = context;
        b();
    }

    public final void a(boolean z) {
        d dVar = new d(this);
        synchronized (this) {
            if (z) {
                Bitmap bitmap = this.g;
                if (bitmap != null) {
                    AbstractC5446j.b(new c(dVar, bitmap));
                    return;
                }
            }
            InterfaceC5087a interfaceC5087a = (InterfaceC5087a) this.f12308a.e();
            if (z) {
                a(interfaceC5087a, dVar);
            } else {
                k kVar = (k) interfaceC5087a;
                String a2 = q.a(kVar.j(), this.f12308a.k.e);
                if (I.a((CharSequence) a2)) {
                    a(kVar, dVar);
                    return;
                }
                AbstractC5446j.a(3, null, new e(this, Uri.parse(a2).getPath(), kVar, dVar), 0L);
            }
        }
    }

    public abstract void b();

    public abstract int[] c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public final Bitmap a() {
        Bitmap bitmap;
        int width;
        int height;
        Bitmap a2;
        Bitmap bitmap2 = this.e;
        if (bitmap2 != null) {
            return bitmap2;
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) AbstractC4944a.c(this.c, R.drawable.bigo_ad_default_base_image);
        if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null || bitmap.getHeight() <= 0 || bitmap.getWidth() <= 0 || (a2 = AbstractC4962t.a((width = bitmap.getWidth()), (height = bitmap.getHeight()), bitmap.getConfig())) == null) {
            return null;
        }
        Canvas canvas = new Canvas(a2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        Paint paint = new Paint();
        float[] fArr = new float[3];
        l lVar = this.f12308a;
        Integer num = lVar.S ? lVar.V : null;
        if (num == null) {
            num = Integer.valueOf(I.a(-16776961, "#009dff"));
        }
        Color.colorToHSV(Color.argb(255, Color.red(num.intValue()), Color.green(num.intValue()), Color.blue(num.intValue())), fArr);
        fArr[1] = 100.0f;
        fArr[2] = 100.0f;
        paint.setColor(Color.HSVToColor(fArr));
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
        canvas.drawRect(0.0f, 0.0f, width, height, paint);
        this.e = a2;
        return a2;
    }

    public final synchronized void a(InterfaceC5087a interfaceC5087a, ValueCallback valueCallback) {
        k kVar = (k) interfaceC5087a;
        String e = kVar.e();
        if (I.a((CharSequence) e)) {
            valueCallback.onReceiveValue(null);
        } else {
            x.a(this.f12308a.k.e, e, kVar.T, new f(this, valueCallback));
        }
    }

    public void a(int i) {
        Button button;
        FrameLayout frameLayout = this.b;
        if (frameLayout != null && (button = (Button) frameLayout.findViewById(R.id.inter_btn_cta)) != null) {
            new Handler(Looper.getMainLooper()).post(new sg.bigo.ads.F.a(button));
        }
        if (i == 1) {
            new Handler(Looper.getMainLooper()).post(new sg.bigo.ads.F.d(this.b, 2000L, 6));
            return;
        }
        if (i != 2) {
            return;
        }
        FrameLayout frameLayout2 = this.b;
        int[] c = c();
        if (c.length >= 2 && frameLayout2 != null) {
            View findViewById = frameLayout2.findViewById(R.id.inter_banner_click_img);
            View findViewById2 = frameLayout2.findViewById(R.id.inter_banner_click_guide_contain);
            if (findViewById == null || findViewById2 == null) {
                return;
            }
            frameLayout2.postDelayed(new sg.bigo.ads.F.g(findViewById2, findViewById, c, frameLayout2, 3), 2000L);
        }
    }

    public static void a(TextView textView, String str) {
        if (textView == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
            if (TextUtils.isEmpty("")) {
                return;
            }
        }
        textView.setText(str);
    }
}
