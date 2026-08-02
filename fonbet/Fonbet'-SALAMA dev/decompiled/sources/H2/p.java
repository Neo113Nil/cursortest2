package H2;

import F2.C0252s;
import F2.C0254t;
import I2.J;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.zzbbp;
import com.google.android.gms.internal.ads.zzbby;

/* loaded from: classes.dex */
public final class p extends FrameLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final ImageButton f3284a;

    /* renamed from: b, reason: collision with root package name */
    public final j f3285b;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(Context context, o oVar, j jVar) {
        super(context);
        Drawable drawable;
        this.f3285b = jVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f3284a = imageButton;
        String str = (String) C0254t.f2723d.f2726c.zzb(zzbby.zzbn);
        if (TextUtils.isEmpty(str) || "default".equals(str)) {
            imageButton.setImageResource(R.drawable.btn_dialog);
        } else {
            Resources zze = E2.o.f1952C.f1961g.zze();
            if (zze != null) {
                try {
                } catch (Resources.NotFoundException unused) {
                    int i7 = J.f3546b;
                    J2.j.b("Close button resource not found, falling back to default.");
                    drawable = null;
                }
                if ("white".equals(str)) {
                    drawable = zze.getDrawable(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.drawable.admob_close_button_white_circle_black_cross);
                } else {
                    if ("black".equals(str)) {
                        drawable = zze.getDrawable(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.drawable.admob_close_button_black_circle_white_cross);
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
        this.f3284a.setBackgroundColor(0);
        this.f3284a.setOnClickListener(this);
        ImageButton imageButton2 = this.f3284a;
        J2.d dVar = C0252s.f2717f.f2718a;
        imageButton2.setPadding(J2.d.p(oVar.f3280a, context), J2.d.m(context.getResources().getDisplayMetrics(), 0), J2.d.m(context.getResources().getDisplayMetrics(), oVar.f3281b), J2.d.m(context.getResources().getDisplayMetrics(), oVar.f3282c));
        this.f3284a.setContentDescription("Interstitial close button");
        addView(this.f3284a, new FrameLayout.LayoutParams(J2.d.m(context.getResources().getDisplayMetrics(), oVar.f3283d + oVar.f3280a + oVar.f3281b), J2.d.m(context.getResources().getDisplayMetrics(), oVar.f3283d + oVar.f3282c), 17));
        zzbbp zzbbpVar = zzbby.zzbo;
        C0254t c0254t = C0254t.f2723d;
        long longValue = ((Long) c0254t.f2726c.zzb(zzbbpVar)).longValue();
        if (longValue <= 0) {
            return;
        }
        n nVar = ((Boolean) c0254t.f2726c.zzb(zzbby.zzbp)).booleanValue() ? new n(this, 0) : null;
        this.f3284a.setAlpha(0.0f);
        this.f3284a.animate().alpha(1.0f).setDuration(longValue).setListener(nVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j jVar = this.f3285b;
        if (jVar != null) {
            jVar.f3258M = 2;
            jVar.f3259a.finish();
        }
    }
}
