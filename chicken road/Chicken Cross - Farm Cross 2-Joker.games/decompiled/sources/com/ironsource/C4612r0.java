package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.r0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4612r0 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, Q0> f8498a = new HashMap<>();

    /* renamed from: com.ironsource.r0$a */
    public enum a {
        DidntAttemptToLoad,
        FailedToLoad,
        LoadedSuccessfully,
        FailedToShow,
        ShowedSuccessfully,
        NotPartOfWaterfall
    }

    public final Q0 a(String adUnitId, List<? extends NetworkSettings> providers, int i) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(providers, "providers");
        Q0 q0 = this.f8498a.get(adUnitId);
        if (q0 != null) {
            return q0;
        }
        Q0 q02 = new Q0(providers, i);
        this.f8498a.put(adUnitId, q02);
        return q02;
    }
}
