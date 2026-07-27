package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.UUID;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class mg {

    /* renamed from: d, reason: collision with root package name */
    public static final mg f4061d = new mg();

    /* renamed from: a, reason: collision with root package name */
    public String f4062a = "";

    /* renamed from: b, reason: collision with root package name */
    public long f4063b = 0;

    /* renamed from: c, reason: collision with root package name */
    public MetaDataRequest$RequestReason f4064c = MetaDataRequest$RequestReason.LAUNCH;

    public final synchronized void a(Context context, MetaDataRequest$RequestReason metaDataRequest$RequestReason) {
        this.f4062a = UUID.randomUUID().toString();
        this.f4063b = System.currentTimeMillis();
        this.f4064c = metaDataRequest$RequestReason;
        WeakHashMap weakHashMap = si.f4343a;
        t tVar = t.f4350d;
        tVar.f4351a.clear();
        tVar.f4352b.clear();
        tVar.f4353c.clear();
        MetaData.E().a(context, new AdPreferences(), metaDataRequest$RequestReason, false, null, true);
    }
}
