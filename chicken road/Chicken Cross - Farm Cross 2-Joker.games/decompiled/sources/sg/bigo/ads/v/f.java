package sg.bigo.ads.v;

import android.content.Context;
import android.widget.Button;
import sg.bigo.ads.R;
import sg.bigo.ads.u.AbstractC5486g;

/* loaded from: classes3.dex */
public final class f extends u {
    public final Button s;

    public f(Context context, int i, boolean z, int i2, int i3) {
        super(context, i, z, i2, i3, R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_media_layout, R.id.inter_media_layout, R.id.inter_media, R.id.inter_media_main_background);
        this.s = (Button) this.e.findViewById(R.id.inter_btn_mute);
    }

    @Override // sg.bigo.ads.v.u
    public final boolean a() {
        int i;
        return this.n || ((i = this.b) != 0 && AbstractC5486g.a(i) == 3);
    }
}
