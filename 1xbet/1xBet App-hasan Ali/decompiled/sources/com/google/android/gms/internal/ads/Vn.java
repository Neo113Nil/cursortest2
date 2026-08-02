package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class Vn implements InterfaceC1259ln {
    @Override // com.google.android.gms.internal.ads.InterfaceC1259ln
    public final boolean a(Sq sq, Lq lq) {
        return !TextUtils.isEmpty(lq.f10529v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1259ln
    public final E3.a b(Sq sq, Lq lq) {
        JSONObject jSONObject = lq.f10529v;
        String optString = jSONObject.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        Wq wq = (Wq) sq.f11595a.f11722l;
        Vq vq = new Vq();
        vq.f11955o.f17003l = wq.f12107o.f17003l;
        Q2.X0 x02 = wq.f12098d;
        vq.f11943a = x02;
        vq.f11944b = wq.f12099e;
        vq.f11961u = wq.f12112t;
        vq.f11945c = wq.f;
        vq.f11946d = wq.f12095a;
        vq.f = wq.f12100g;
        vq.f11948g = wq.f12101h;
        vq.f11949h = wq.i;
        vq.i = wq.f12102j;
        M2.a aVar = wq.f12104l;
        vq.f11950j = aVar;
        if (aVar != null) {
            vq.f11947e = aVar.f3604k;
        }
        M2.d dVar = wq.f12105m;
        vq.f11951k = dVar;
        if (dVar != null) {
            vq.f11947e = dVar.f3612k;
            vq.f11952l = dVar.f3613l;
        }
        vq.f11956p = wq.f12108p;
        vq.f11957q = wq.f12109q;
        vq.f11958r = wq.f12097c;
        vq.f11959s = wq.f12110r;
        vq.f11960t = wq.f12111s;
        vq.f11945c = optString;
        Bundle bundle = x02.f4969w;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        Bundle bundle4 = bundle3 == null ? new Bundle() : new Bundle(bundle3);
        bundle4.putInt("gw", 1);
        String optString2 = jSONObject.optString("mad_hac", null);
        if (optString2 != null) {
            bundle4.putString("mad_hac", optString2);
        }
        String optString3 = jSONObject.optString("adJson", null);
        if (optString3 != null) {
            bundle4.putString("_ad", optString3);
        }
        bundle4.putBoolean("_noRefresh", true);
        JSONObject jSONObject2 = lq.f10468D;
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = jSONObject2.optString(next, null);
            if (next != null) {
                bundle4.putString(next, optString4);
            }
        }
        bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle4);
        vq.f11943a = new Q2.X0(x02.f4957k, x02.f4958l, bundle4, x02.f4960n, x02.f4961o, x02.f4962p, x02.f4963q, x02.f4964r, x02.f4965s, x02.f4966t, x02.f4967u, x02.f4968v, bundle2, x02.f4970x, x02.f4971y, x02.f4972z, x02.f4948A, x02.f4949B, x02.f4950C, x02.f4951D, x02.f4952E, x02.f4953F, x02.f4954G, x02.f4955H, x02.f4956I, x02.J);
        Wq a5 = vq.a();
        Bundle bundle5 = new Bundle();
        C1071hd c1071hd = sq.f11596b;
        Bundle bundle6 = new Bundle();
        Nq nq = (Nq) c1071hd.f13762m;
        bundle6.putStringArrayList("nofill_urls", new ArrayList<>(nq.f10822a));
        bundle6.putInt("refresh_interval", nq.f10824c);
        bundle6.putString("gws_query_id", nq.f10823b);
        bundle5.putBundle("parent_common_config", bundle6);
        Wq wq2 = (Wq) sq.f11595a.f11722l;
        Bundle bundle7 = new Bundle();
        bundle7.putString("initial_ad_unit_id", wq2.f);
        bundle7.putString("allocation_id", lq.f10531w);
        bundle7.putString("ad_source_name", lq.f10470F);
        bundle7.putStringArrayList("click_urls", new ArrayList<>(lq.f10493c));
        bundle7.putStringArrayList("imp_urls", new ArrayList<>(lq.f10495d));
        bundle7.putStringArrayList("manual_tracking_urls", new ArrayList<>(lq.f10517p));
        bundle7.putStringArrayList("fill_urls", new ArrayList<>(lq.f10511m));
        bundle7.putStringArrayList("video_start_urls", new ArrayList<>(lq.f10500g));
        bundle7.putStringArrayList("video_reward_urls", new ArrayList<>(lq.f10502h));
        bundle7.putStringArrayList("video_complete_urls", new ArrayList<>(lq.i));
        bundle7.putString("transaction_id", lq.f10505j);
        bundle7.putString("valid_from_timestamp", lq.f10507k);
        bundle7.putBoolean("is_closable_area_disabled", lq.f10478P);
        bundle7.putString("recursive_server_response_data", lq.f10516o0);
        bundle7.putBoolean("is_analytics_logging_enabled", lq.f10485W);
        C0575Dc c0575Dc = lq.f10509l;
        if (c0575Dc != null) {
            Bundle bundle8 = new Bundle();
            bundle8.putInt("rb_amount", c0575Dc.f8198l);
            bundle8.putString("rb_type", c0575Dc.f8197k);
            bundle7.putParcelableArray("rewards", new Bundle[]{bundle8});
        }
        bundle5.putBundle("parent_ad_config", bundle7);
        return c(a5, bundle5, lq, sq);
    }

    public abstract Cr c(Wq wq, Bundle bundle, Lq lq, Sq sq);
}
