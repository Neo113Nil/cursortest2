package com.startapp.sdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.json.JsonParser;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ee extends a8 {

    /* renamed from: m, reason: collision with root package name */
    public MetaData f3637m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f3638n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AdPreferences f3639o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ fe f3640p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ee(fe feVar, Context context, ib ibVar, AdPreferences adPreferences, Context context2, AdPreferences adPreferences2) {
        super(context, ibVar, adPreferences, r4, null, 0);
        MetaDataRequest$RequestReason metaDataRequest$RequestReason = MetaDataRequest$RequestReason.PERIODIC;
        this.f3640p = feVar;
        this.f3638n = context2;
        this.f3639o = adPreferences2;
    }

    @Override // com.startapp.sdk.internal.a8
    public final Boolean a() {
        try {
            com.startapp.sdk.adsbase.g.e(this.f3638n);
            jc jcVar = new jc(this.f3638n, (sf) com.startapp.sdk.components.a.a(this.f3638n).f3341G.a(), MetaDataRequest$RequestReason.PERIODIC);
            jcVar.a(this.f3638n, this.f3639o);
            String a3 = a(this.f3638n, jcVar);
            if (!TextUtils.isEmpty(a3)) {
                MetaData metaData = (MetaData) JsonParser.fromJson(a3, MetaData.class);
                this.f3637m = metaData;
                return Boolean.valueOf(metaData != null);
            }
        } catch (Throwable th) {
            d9.a(th);
        }
        return Boolean.FALSE;
    }

    @Override // com.startapp.sdk.internal.a8
    /* renamed from: c */
    public final void b(Boolean bool) {
        ya yaVar;
        MetaData metaData;
        WeakHashMap weakHashMap = si.f4343a;
        try {
            if (bool.booleanValue() && (metaData = this.f3637m) != null) {
                MetaData.a(this.f3638n, metaData, MetaDataRequest$RequestReason.PERIODIC, this.f3444l);
            }
            yaVar = this.f3640p.callback;
            yaVar.a();
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
