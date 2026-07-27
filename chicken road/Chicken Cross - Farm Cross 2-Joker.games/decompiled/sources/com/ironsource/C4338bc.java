package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.bc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4338bc extends C4434h0 {
    public /* synthetic */ C4338bc(UUID uuid, String str, C4411fd c4411fd, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, (i & 4) != 0 ? null : c4411fd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4338bc(UUID adId, String adUnitId, C4411fd c4411fd) {
        super(IronSource.a.NATIVE_AD, adId, adUnitId, c4411fd, null, null, 48, null);
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }

    public C4338bc() {
        this(C4637s7.f8524a.a(), "", null, 4, null);
    }
}
