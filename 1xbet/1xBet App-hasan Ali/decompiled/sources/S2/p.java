package S2;

import Q2.C0379q;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.A7;
import com.google.android.gms.internal.ads.F7;

/* loaded from: classes.dex */
public final class p extends FrameLayout implements View.OnClickListener {

    /* renamed from: k, reason: collision with root package name */
    public final ImageButton f5344k;

    /* renamed from: l, reason: collision with root package name */
    public final d f5345l;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(Context context, o oVar, d dVar) {
        super(context);
        Drawable drawable;
        this.f5345l = dVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f5344k = imageButton;
        String str = (String) Q2.r.f5053d.f5056c.a(F7.f8804b1);
        if (TextUtils.isEmpty(str) || "default".equals(str)) {
            imageButton.setImageResource(R.drawable.btn_dialog);
        } else {
            Resources b3 = P2.o.f4767B.f4774g.b();
            if (b3 != null) {
                try {
                } catch (Resources.NotFoundException unused) {
                    U2.j.d("Close button resource not found, falling back to default.");
                    drawable = null;
                }
                if ("white".equals(str)) {
                    drawable = b3.getDrawable(game.betting133.sports1xbet.R.drawable.admob_close_button_white_circle_black_cross);
                } else {
                    if ("black".equals(str)) {
                        drawable = b3.getDrawable(game.betting133.sports1xbet.R.drawable.admob_close_button_black_circle_white_cross);
                    }
                    drawable = null;
                }
                if (drawable == null) {
                    imageButton.setImageResource(R.drawable.btn_dialog);
                } else {
                    imageButton.setImageDrawable(drawable);
                    imageButton.setScaleType(ImageView.ScaleType.CENTER);
                }
            } else {
                imageButton.setImageResource(R.drawable.btn_dialog);
            }
        }
        this.f5344k.setBackgroundColor(0);
        this.f5344k.setOnClickListener(this);
        ImageButton imageButton2 = this.f5344k;
        U2.e eVar = C0379q.f.f5048a;
        imageButton2.setPadding(U2.e.l(context, oVar.f5340a), U2.e.i(context.getResources().getDisplayMetrics(), 0), U2.e.i(context.getResources().getDisplayMetrics(), oVar.f5341b), U2.e.i(context.getResources().getDisplayMetrics(), oVar.f5342c));
        this.f5344k.setContentDescription("Interstitial close button");
        addView(this.f5344k, new FrameLayout.LayoutParams(U2.e.i(context.getResources().getDisplayMetrics(), oVar.f5343d + oVar.f5340a + oVar.f5341b), U2.e.i(context.getResources().getDisplayMetrics(), oVar.f5343d + oVar.f5342c), 17));
        A7 a7 = F7.f8809c1;
        Q2.r rVar = Q2.r.f5053d;
        long longValue = ((Long) rVar.f5056c.a(a7)).longValue();
        if (longValue <= 0) {
            return;
        }
        n nVar = ((Boolean) rVar.f5056c.a(F7.f8815d1)).booleanValue() ? new n(this, 0) : null;
        this.f5344k.setAlpha(0.0f);
        this.f5344k.animate().alpha(1.0f).setDuration(longValue).setListener(nVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d dVar = this.f5345l;
        if (dVar != null) {
            dVar.f5296G = 2;
            dVar.f5298l.finish();
        }
    }
}
