package sg.bigo.ads.G;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import sg.bigo.ads.C.l;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.R;
import sg.bigo.ads.U0.k;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.e1.InterfaceC5087a;

/* loaded from: classes3.dex */
public final class i extends h {
    public View i;

    public i(l lVar, Context context) {
        super(lVar, context);
        sg.bigo.ads.R.b.f = 0;
    }

    @Override // sg.bigo.ads.G.h
    public final void a(int i) {
        if (this.i != null) {
            this.i.setBackground(new BitmapDrawable(this.c.getResources(), a()));
        }
        super.a(i);
    }

    @Override // sg.bigo.ads.G.h
    public final void b() {
        this.b = new FrameLayout(this.c);
        int a2 = AbstractC4963u.a(this.c, 276);
        int a3 = AbstractC4963u.a(this.c, 174);
        MediaView mediaView = new MediaView(this.c);
        this.d = mediaView;
        mediaView.setImageBlurBorder(false);
        this.d.setLayoutParams(new ViewGroup.LayoutParams(a2, a3));
        View a4 = AbstractC4944a.a(this.c, R.layout.bigo_ad_banner_placeholder_img, null, false);
        this.i = a4;
        if (a4 == null) {
            return;
        }
        X.a(a4, this.d, null, -1);
        View view = this.i;
        h.a((TextView) view.findViewById(R.id.bigo_ad_banner_background_text), ((k) ((InterfaceC5087a) this.f12308a.e())).g());
        h.a((TextView) view.findViewById(R.id.bigo_ad_image_title), ((k) ((InterfaceC5087a) this.f12308a.e())).g());
        h.a((TextView) view.findViewById(R.id.bigo_ad_banner_image_description), ((k) ((InterfaceC5087a) this.f12308a.e())).c());
        TextView textView = (TextView) view.findViewById(R.id.bigo_ad_banner_image_domain);
        String advertiser = this.f12308a.getAdvertiser();
        if (textView == null) {
            return;
        }
        if (TextUtils.isEmpty(advertiser)) {
            textView.setVisibility(8);
        } else {
            textView.setText(advertiser);
        }
    }

    @Override // sg.bigo.ads.G.h
    public final int[] c() {
        return new int[]{AbstractC4963u.a(this.c, -57), AbstractC4963u.a(this.c, 153)};
    }

    @Override // sg.bigo.ads.G.h
    public final int d() {
        return AbstractC4963u.a(this.c, 8);
    }

    @Override // sg.bigo.ads.G.h
    public final int e() {
        return R.layout.bigo_ad_native_banner_medium;
    }

    @Override // sg.bigo.ads.G.h
    public final int f() {
        return ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
    }

    @Override // sg.bigo.ads.G.h
    public final int g() {
        return 300;
    }
}
