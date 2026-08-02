package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class Ro implements Lp {

    /* renamed from: a, reason: collision with root package name */
    public final Wq f11451a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11452b;

    public Ro(Wq wq, long j5) {
        this.f11451a = wq;
        this.f11452b = j5;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final void k(Object obj) {
        Bundle bundle = ((C0572Ch) obj).f8050b;
        Wq wq = this.f11451a;
        bundle.putString("slotname", wq.f);
        Q2.X0 x02 = wq.f12098d;
        if (x02.f4962p) {
            bundle.putBoolean("test_request", true);
        }
        int i = x02.f4963q;
        AbstractC1803xs.U(bundle, "tag_for_child_directed_treatment", i, i != -1);
        if (x02.f4957k >= 8) {
            int i5 = x02.f4951D;
            AbstractC1803xs.U(bundle, "tag_for_under_age_of_consent", i5, i5 != -1);
        }
        AbstractC1803xs.D("url", x02.f4968v, bundle);
        AbstractC1803xs.N(bundle, "neighboring_content_urls", x02.f4953F);
        Bundle bundle2 = x02.f4959m;
        Bundle bundle3 = (Bundle) bundle2.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) Q2.r.f5053d.f5056c.a(F7.g7)).split(",", -1)));
        for (String str : bundle2.keySet()) {
            if (!hashSet.contains(str)) {
                bundle3.remove(str);
            }
        }
        if (bundle3 != null) {
            bundle.putBundle("extras", bundle3);
        }
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final void o(Object obj) {
        Bundle bundle = ((C0572Ch) obj).f8049a;
        Wq wq = this.f11451a;
        Q2.X0 x02 = wq.f12098d;
        bundle.putInt("http_timeout_millis", x02.f4954G);
        bundle.putString("slotname", wq.f);
        int i = wq.f12107o.f17003l;
        if (i == 0) {
            throw null;
        }
        int i5 = i - 1;
        if (i5 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i5 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.f11452b);
        Bundle bundle2 = x02.f4959m;
        AbstractC1803xs.d0(bundle, "is_sdk_preload", true, bundle2.getBoolean("is_sdk_preload", false));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j5 = x02.f4958l;
        AbstractC1803xs.Z(bundle, "cust_age", simpleDateFormat.format(new Date(j5)), j5 != -1);
        if (bundle2 != null) {
            bundle.putBundle("extras", bundle2);
        }
        int i6 = x02.f4960n;
        AbstractC1803xs.U(bundle, "cust_gender", i6, i6 != -1);
        AbstractC1803xs.N(bundle, "kw", x02.f4961o);
        int i7 = x02.f4963q;
        AbstractC1803xs.U(bundle, "tag_for_child_directed_treatment", i7, i7 != -1);
        if (x02.f4962p) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", x02.f4956I);
        int i8 = x02.f4957k;
        AbstractC1803xs.U(bundle, "d_imp_hdr", 1, i8 >= 2 && x02.f4964r);
        String str = x02.f4965s;
        AbstractC1803xs.Z(bundle, "ppid", str, i8 >= 2 && !TextUtils.isEmpty(str));
        Location location = x02.f4967u;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", accuracy);
            bundle3.putLong("lat", (long) latitude);
            bundle3.putLong("long", (long) longitude);
            bundle3.putLong("time", time);
            bundle.putBundle("uule", bundle3);
        }
        AbstractC1803xs.D("url", x02.f4968v, bundle);
        AbstractC1803xs.N(bundle, "neighboring_content_urls", x02.f4953F);
        Bundle bundle4 = x02.f4970x;
        if (bundle4 != null) {
            bundle.putBundle("custom_targeting", bundle4);
        }
        AbstractC1803xs.N(bundle, "category_exclusions", x02.f4971y);
        AbstractC1803xs.D("request_agent", x02.f4972z, bundle);
        AbstractC1803xs.D("request_pkg", x02.f4948A, bundle);
        AbstractC1803xs.d0(bundle, "is_designed_for_families", x02.f4949B, i8 >= 7);
        if (i8 >= 8) {
            int i9 = x02.f4951D;
            AbstractC1803xs.U(bundle, "tag_for_under_age_of_consent", i9, i9 != -1);
            AbstractC1803xs.D("max_ad_content_rating", x02.f4952E, bundle);
        }
    }
}
