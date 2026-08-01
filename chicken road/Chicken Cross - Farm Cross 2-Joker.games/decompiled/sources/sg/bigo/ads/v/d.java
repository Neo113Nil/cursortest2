package sg.bigo.ads.v;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.s0.y;
import sg.bigo.ads.s0.z;
import sg.bigo.ads.u.AbstractC5486g;
import sg.bigo.ads.u.C5485f;

/* loaded from: classes3.dex */
public final class d extends u implements z {
    public final C5485f s;
    public final ValueCallback t;
    public final String u;

    public d(Context context, C5485f c5485f, int i, int i2, int i3, String str, boolean z, ValueCallback valueCallback) {
        super(context, i, false, i2, i3, R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_item_layout, R.id.inter_media_item_layout, R.id.inter_media_item, R.id.inter_media_item_background);
        this.s = c5485f;
        this.u = str;
        this.t = valueCallback;
        if (!TextUtils.isEmpty(str) && URLUtil.isNetworkUrl(str)) {
            ((AdImageView) this.g).c.a(this);
            ((AdImageView) this.g).a(str, z);
            if (c5485f != null) {
                c5485f.a(0, str);
            }
        }
        ((AdImageView) this.g).setFadeEnable(true);
        this.e.setStrokeWidth(AbstractC4963u.a(context, 1));
        this.e.setStrokeColor(I.a(-7829368, "#08000000"));
        ((AdImageView) this.g).setBackgroundColor(I.a(-7829368, "#FFE1E1E6"));
        ((AdImageView) this.g).setImageDrawable(AbstractC4944a.c(context, R.drawable.bigo_ad_icon_default_only_icon));
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(int i, String str, y yVar) {
        C5485f c5485f = this.s;
        if (c5485f != null) {
            c5485f.a(2, this.u);
        }
        ((AdImageView) this.g).post(new c(this));
    }

    public final void b(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        ((AdImageView) this.g).post(new RunnableC5493a(this, bitmap));
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(Bitmap bitmap, y yVar) {
        C5485f c5485f = this.s;
        if (c5485f != null) {
            c5485f.a(1, this.u);
        }
        ((AdImageView) this.g).post(new b(this, bitmap));
    }

    @Override // sg.bigo.ads.v.u
    public final boolean a() {
        int i;
        int a2;
        return this.n || ((i = this.b) != 0 && ((a2 = AbstractC5486g.a(i)) == 3 || a2 == 2));
    }
}
