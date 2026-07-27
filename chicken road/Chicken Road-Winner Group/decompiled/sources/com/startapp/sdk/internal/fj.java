package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.cache.CachedVideoAd;

/* loaded from: classes.dex */
public final class fj implements ck {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ck f3730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CachedVideoAd f3731b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f3732c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hj f3733d;

    public fj(hj hjVar, ck ckVar, CachedVideoAd cachedVideoAd, Context context) {
        this.f3733d = hjVar;
        this.f3730a = ckVar;
        this.f3731b = cachedVideoAd;
        this.f3732c = context;
    }

    @Override // com.startapp.sdk.internal.ck, com.startapp.sdk.internal.me
    public final void a(String str) {
        ck ckVar = this.f3730a;
        if (ckVar != null) {
            ckVar.a(str);
        }
        if (str != null) {
            this.f3731b.a(System.currentTimeMillis());
            this.f3731b.a(str);
            hj hjVar = this.f3733d;
            Context context = this.f3732c;
            CachedVideoAd cachedVideoAd = this.f3731b;
            hjVar.f3838a.remove(cachedVideoAd);
            hjVar.a(AdsCommonMetaData.k().F().c() - 1);
            hjVar.f3838a.add(cachedVideoAd);
            e7.a(context, hjVar.f3838a);
        }
    }
}
