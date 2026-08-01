package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4540n extends C5 {

    /* renamed from: a, reason: collision with root package name */
    private final IronSource.a f8445a;
    private final UUID b;
    private final String c;

    public C4540n(IronSource.a adFormat, UUID adId, String adUnitId) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f8445a = adFormat;
        this.b = adId;
        this.c = adUnitId;
    }

    @Override // com.ironsource.D0
    public Map<String, Object> a(B0 b0) {
        return a(new C4434h0(this.f8445a, this.b, this.c, null, null, null, 56, null));
    }
}
