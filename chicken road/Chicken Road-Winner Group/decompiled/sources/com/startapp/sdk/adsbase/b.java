package com.startapp.sdk.adsbase;

import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import com.startapp.sdk.internal.fi;
import com.startapp.sdk.internal.ic;
import com.startapp.sdk.internal.x6;
import com.startapp.sdk.internal.y6;

/* loaded from: classes.dex */
public final class b implements ic {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdPreferences f3181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f3182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3183c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ad f3184d;

    public b(Ad ad, AdPreferences adPreferences, a aVar, String str) {
        this.f3184d = ad;
        this.f3181a = adPreferences;
        this.f3182b = aVar;
        this.f3183c = str;
    }

    @Override // com.startapp.sdk.internal.ic
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z3) {
        ((y6) ((x6) this.f3184d.eventTracer.a())).c(this, fi.f3717m);
        this.f3184d.loadAds(this.f3181a, this.f3182b, this.f3183c);
    }

    @Override // com.startapp.sdk.internal.ic
    public final void a() {
        ((y6) ((x6) this.f3184d.eventTracer.a())).c(this, fi.f3718n);
        this.f3184d.loadAds(this.f3181a, this.f3182b, this.f3183c);
    }
}
