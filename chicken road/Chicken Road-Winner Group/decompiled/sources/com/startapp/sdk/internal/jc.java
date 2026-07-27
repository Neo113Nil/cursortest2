package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import com.startapp.sdk.common.utils.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class jc extends y1 {
    public static final Set v0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("ispCarrId", "ispCarrIdName", "isma", "root", "appSessionDuration")));
    public final int n0;

    /* renamed from: o0, reason: collision with root package name */
    public final int f3916o0;

    /* renamed from: p0, reason: collision with root package name */
    public final boolean f3917p0;

    /* renamed from: q0, reason: collision with root package name */
    public final float f3918q0;

    /* renamed from: r0, reason: collision with root package name */
    public final MetaDataRequest$RequestReason f3919r0;

    /* renamed from: s0, reason: collision with root package name */
    public final String f3920s0;

    /* renamed from: t0, reason: collision with root package name */
    public final Pair f3921t0;

    /* renamed from: u0, reason: collision with root package name */
    public final long f3922u0;

    public jc(Context context, sf sfVar, MetaDataRequest$RequestReason metaDataRequest$RequestReason) {
        super(2);
        this.n0 = sfVar.getInt("totalSessions", 0);
        this.f3916o0 = (int) ((System.currentTimeMillis() - sfVar.getLong("firstSessionTime", System.currentTimeMillis())) / 86400000);
        this.f3918q0 = sfVar.getFloat("inAppPurchaseAmount", 0.0f);
        this.f3917p0 = sfVar.getBoolean("payingUser", false);
        this.f3920s0 = MetaData.E().Q();
        this.f3919r0 = metaDataRequest$RequestReason;
        this.f3921t0 = com.startapp.sdk.adsbase.g.a();
        this.f3922u0 = com.startapp.sdk.adsbase.g.f3222c;
        this.f4675Y = ((n0) com.startapp.sdk.components.a.a(context).f3368p.a()).a();
    }

    @Override // com.startapp.sdk.internal.y1
    public final Set a() {
        return v0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.startapp.sdk.internal.y1
    public final void a(se seVar) {
        super.a(seVar);
        seVar.a(AbstractC0253g.f3737b, AbstractC0253g.a(), true, true);
        seVar.a("totalSessions", Integer.valueOf(this.n0), true, true);
        seVar.a("daysSinceFirstSession", Integer.valueOf(this.f3916o0), true, true);
        seVar.a("profileId", this.f3920s0, false, true);
        boolean z3 = this.f3917p0;
        if (z3) {
            seVar.a("payingUser", Boolean.valueOf(z3), true, true);
            seVar.a("paidAmount", Float.valueOf(this.f3918q0), true, true);
        }
        seVar.a("reason", this.f3919r0, true, true);
        seVar.a("testAdsEnabled", fh.f3695a.f3794t ? Boolean.TRUE : null, false, true);
        seVar.a("apkHash", null, false, true);
        seVar.a("ian", null, false, true);
        Pair pair = this.f3921t0;
        seVar.a((String) pair.first, pair.second, false, true);
        long j3 = this.f3922u0;
        if (j3 != 0) {
            seVar.a("firstInstalledAppTS", Long.valueOf(j3), false, true);
        }
    }
}
