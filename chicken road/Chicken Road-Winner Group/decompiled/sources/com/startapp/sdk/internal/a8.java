package com.startapp.sdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.json.JsonParser;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class a8 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3434a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f3435b;

    /* renamed from: c, reason: collision with root package name */
    public final AdPreferences f3436c;

    /* renamed from: d, reason: collision with root package name */
    public final MetaDataRequest$RequestReason f3437d;

    /* renamed from: e, reason: collision with root package name */
    public MetaData f3438e;
    public BannerMetaData f;

    /* renamed from: g, reason: collision with root package name */
    public CacheMetaData f3439g;

    /* renamed from: h, reason: collision with root package name */
    public AdInformationMetaData f3440h;

    /* renamed from: i, reason: collision with root package name */
    public AdsCommonMetaData f3441i;

    /* renamed from: j, reason: collision with root package name */
    public final i7 f3442j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3443k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3444l;

    public a8(Context context, ib ibVar, AdPreferences adPreferences, MetaDataRequest$RequestReason metaDataRequest$RequestReason, i7 i7Var, int i3) {
        this.f3434a = context;
        this.f3435b = ibVar;
        this.f3436c = adPreferences;
        this.f3437d = metaDataRequest$RequestReason;
        this.f3442j = i7Var;
        this.f3443k = i3;
    }

    public final void a(Boolean bool) {
        k8 k8Var = (k8) com.startapp.sdk.components.a.a(this.f3434a).y.a();
        k8Var.f3952a.post(new D1.a(this, 7, bool));
    }

    public final void b() {
        ((Executor) com.startapp.sdk.components.a.a(this.f3434a).f3335A.a()).execute(new G0.m(10, this));
    }

    public final /* synthetic */ void c() {
        a(a());
    }

    public final void d() {
        synchronized (MetaData.H()) {
            try {
                if ((this.f3442j == null ? true : Integer.valueOf(this.f3443k).equals(this.f3442j.a())) && this.f3438e != null) {
                    WeakHashMap weakHashMap = si.f4343a;
                    if (this.f3441i != null) {
                        try {
                            if (!si.a((Object) AdsCommonMetaData.k(), (Object) this.f3441i)) {
                                this.f3444l = true;
                                AdsCommonMetaData.a(this.f3434a, this.f3441i);
                            }
                        } catch (Throwable th) {
                            d9.a(th);
                        }
                    }
                    WeakHashMap weakHashMap2 = si.f4343a;
                    if (this.f != null) {
                        try {
                            if (!si.a((Object) BannerMetaData.c(), (Object) this.f)) {
                                this.f3444l = true;
                                BannerMetaData.a(this.f3434a, this.f);
                            }
                        } catch (Throwable th2) {
                            d9.a(th2);
                        }
                    }
                    WeakHashMap weakHashMap3 = si.f4343a;
                    if (this.f3439g != null) {
                        try {
                            if (!si.a((Object) CacheMetaData.b(), (Object) this.f3439g)) {
                                this.f3444l = true;
                                CacheMetaData.a(this.f3434a, this.f3439g);
                            }
                        } catch (Throwable th3) {
                            d9.a(th3);
                        }
                    }
                    WeakHashMap weakHashMap4 = si.f4343a;
                    if (this.f3440h != null) {
                        try {
                            if (!si.a((Object) AdInformationMetaData.c(), (Object) this.f3440h)) {
                                this.f3444l = true;
                                AdInformationMetaData.a(this.f3434a, this.f3440h);
                            }
                        } catch (Throwable th4) {
                            d9.a(th4);
                        }
                    }
                    try {
                        MetaData.a(this.f3434a, this.f3438e.k());
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(Boolean bool) {
        MetaData metaData;
        WeakHashMap weakHashMap = si.f4343a;
        synchronized (MetaData.H()) {
            try {
                if (this.f3442j == null ? true : Integer.valueOf(this.f3443k).equals(this.f3442j.a())) {
                    if (!Boolean.TRUE.equals(bool) || (metaData = this.f3438e) == null) {
                        MetaData.a(this.f3437d);
                    } else {
                        MetaData.a(this.f3434a, metaData, this.f3437d, this.f3444l);
                    }
                }
            } catch (Throwable th) {
                d9.a(th);
            } finally {
            }
        }
    }

    public Boolean a() {
        try {
            jc jcVar = new jc(this.f3434a, (sf) com.startapp.sdk.components.a.a(this.f3434a).f3341G.a(), this.f3437d);
            jcVar.a(this.f3434a, this.f3436c);
            String a3 = a(this.f3434a, jcVar);
            if (TextUtils.isEmpty(a3)) {
                return Boolean.FALSE;
            }
            MetaData metaData = (MetaData) JsonParser.fromJson(a3, MetaData.class);
            this.f3438e = metaData;
            if (metaData == null) {
                return Boolean.FALSE;
            }
            if (metaData.m() != null) {
                q0 q0Var = (q0) com.startapp.sdk.components.a.a(this.f3434a).f3365m.a();
                String m3 = this.f3438e.m();
                if (m3 != null) {
                    m3 = m3.trim();
                }
                synchronized (q0Var.f4234a) {
                    rf edit = q0Var.f4235b.edit();
                    edit.a("31721150b470a3b9", m3);
                    edit.f4299a.putString("31721150b470a3b9", m3);
                    edit.f4299a.commit();
                }
            }
            WeakHashMap weakHashMap = si.f4343a;
            AdsCommonMetaData adsCommonMetaData = (AdsCommonMetaData) JsonParser.fromJson(a3, AdsCommonMetaData.class);
            if (adsCommonMetaData != null) {
                this.f3441i = adsCommonMetaData;
            }
            BannerMetaData bannerMetaData = (BannerMetaData) JsonParser.fromJson(a3, BannerMetaData.class);
            if (bannerMetaData != null) {
                this.f = bannerMetaData;
            }
            CacheMetaData cacheMetaData = (CacheMetaData) JsonParser.fromJson(a3, CacheMetaData.class);
            if (cacheMetaData != null) {
                this.f3439g = cacheMetaData;
            }
            AdInformationMetaData adInformationMetaData = (AdInformationMetaData) JsonParser.fromJson(a3, AdInformationMetaData.class);
            if (adInformationMetaData != null) {
                this.f3440h = adInformationMetaData;
            }
            d();
            return Boolean.TRUE;
        } catch (Throwable th) {
            d9.a(th);
            return Boolean.FALSE;
        }
    }

    public final Void b(n8 n8Var) {
        x6 x6Var = (x6) this.f3435b.a();
        WeakHashMap weakHashMap = si.f4343a;
        n8Var.getClass();
        ((y6) x6Var).a(this, n8Var);
        return null;
    }

    public final String a(Context context, jc jcVar) {
        r8 a3;
        o8 o8Var = (o8) com.startapp.sdk.components.a.a(context).f3366n.a();
        MetaData metaData = this.f3438e;
        double y = metaData != null ? metaData.y() : 0.0d;
        for (String str : MetaData.E().I()) {
            if (si.a(y)) {
                n8 n8Var = new n8(o8Var, str + h0.f3813d);
                n8Var.f4096c = jcVar.a(((HttpClientConfig) o8Var.f.a()).e());
                a(n8Var);
                n8Var.f4097d = ((HttpClientConfig) o8Var.f.a()).a(2);
                a3 = n8Var.b();
            } else {
                n8 n8Var2 = new n8(o8Var, jcVar.a(str + h0.f3813d));
                b(n8Var2);
                n8Var2.f4097d = ((HttpClientConfig) o8Var.f.a()).a(2);
                a3 = n8Var2.a();
            }
            String str2 = a3 != null ? a3.f4290b : null;
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            if (!((f6) com.startapp.sdk.components.a.a(context).f3372t.a()).b()) {
                break;
            }
        }
        return null;
    }

    public final Void a(n8 n8Var) {
        x6 x6Var = (x6) this.f3435b.a();
        WeakHashMap weakHashMap = si.f4343a;
        n8Var.getClass();
        ((y6) x6Var).a(this, n8Var);
        return null;
    }
}
