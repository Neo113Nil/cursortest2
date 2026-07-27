package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import java.net.URL;

/* loaded from: classes.dex */
public final class dk {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3603a;

    /* renamed from: b, reason: collision with root package name */
    public final URL f3604b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3605c;

    /* renamed from: d, reason: collision with root package name */
    public final fj f3606d;

    /* renamed from: e, reason: collision with root package name */
    public final gj f3607e;

    public dk(Context context, URL url, String str, fj fjVar, gj gjVar) {
        this.f3603a = context;
        this.f3604b = url;
        this.f3605c = str;
        this.f3606d = fjVar;
        this.f3607e = gjVar;
    }

    public final void a() {
        String str;
        try {
            str = AdsCommonMetaData.k().F().q() ? ne.f4108a.a(this.f3603a, this.f3604b, this.f3605c, this.f3607e) : ek.a(this.f3603a, this.f3604b, this.f3605c);
        } catch (Exception e3) {
            d9.a(e3);
            str = null;
        }
        new Handler(Looper.getMainLooper()).post(new bk(this, str));
    }
}
