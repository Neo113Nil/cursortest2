package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.cache.CachedVideoAd;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ej implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ck f3658b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ me f3659c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hj f3660d;

    public ej(hj hjVar, String str, ck ckVar, me meVar) {
        this.f3660d = hjVar;
        this.f3657a = str;
        this.f3658b = ckVar;
        this.f3659c = meVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hj hjVar = this.f3660d;
        Context context = hjVar.f3839b;
        String str = this.f3657a;
        ck ckVar = this.f3658b;
        me meVar = this.f3659c;
        if (hjVar.f3838a == null) {
            LinkedList linkedList = (LinkedList) e7.a(context, (String) null, "StartIoCachedAds");
            hjVar.f3838a = linkedList;
            if (linkedList == null) {
                hjVar.f3838a = new LinkedList();
            }
            if (hjVar.a(AdsCommonMetaData.k().F().c())) {
                e7.a(context, hjVar.f3838a);
            }
        }
        try {
            URL url = new URL(str);
            WeakHashMap weakHashMap = si.f4343a;
            String d3 = si.d(url.getHost() + url.getPath());
            new dk(context, url, d3, new fj(hjVar, ckVar, new CachedVideoAd(d3), context), new gj(meVar)).a();
        } catch (MalformedURLException e3) {
            if (ckVar != null) {
                ckVar.a(null);
            }
            d9.a(e3);
        }
    }
}
