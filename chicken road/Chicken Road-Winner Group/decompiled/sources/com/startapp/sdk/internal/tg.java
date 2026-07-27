package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;

/* loaded from: classes.dex */
public final class tg implements ic {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4392a;

    public tg(Context context) {
        this.f4392a = context;
    }

    @Override // com.startapp.sdk.internal.ic
    public final void a() {
        MetaData.E().a(this);
    }

    @Override // com.startapp.sdk.internal.ic
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z3) {
        if (z3) {
            com.startapp.sdk.adsbase.g.f3223d = null;
            com.startapp.sdk.adsbase.g.f3224e = null;
            com.startapp.sdk.adsbase.g.f(this.f4392a);
        }
        MetaData.E().a(this);
    }
}
