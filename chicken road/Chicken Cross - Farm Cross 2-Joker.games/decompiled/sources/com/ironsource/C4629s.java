package com.ironsource;

import com.ironsource.InterfaceC4387e7;
import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4629s implements InterfaceC4387e7, InterfaceC4387e7.a {

    /* renamed from: a, reason: collision with root package name */
    private final Map<IronSource.a, AtomicBoolean> f8512a = MapsKt.mapOf(TuplesKt.to(IronSource.a.REWARDED_VIDEO, new AtomicBoolean(false)), TuplesKt.to(IronSource.a.INTERSTITIAL, new AtomicBoolean(false)), TuplesKt.to(IronSource.a.BANNER, new AtomicBoolean(false)));

    @Override // com.ironsource.InterfaceC4387e7.a
    public void a(IronSource.a adFormat, boolean z) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        AtomicBoolean atomicBoolean = this.f8512a.get(adFormat);
        if (atomicBoolean != null) {
            atomicBoolean.set(z);
        }
    }

    @Override // com.ironsource.InterfaceC4387e7
    public boolean a(IronSource.a adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        AtomicBoolean atomicBoolean = this.f8512a.get(adFormat);
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        return false;
    }
}
