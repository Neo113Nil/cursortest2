package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;

/* loaded from: classes.dex */
public final class fc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ic f3689a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MetaDataRequest$RequestReason f3690b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3691c;

    public fc(ic icVar, MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z3) {
        this.f3689a = icVar;
        this.f3690b = metaDataRequest$RequestReason;
        this.f3691c = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3689a.a(this.f3690b, this.f3691c);
    }
}
