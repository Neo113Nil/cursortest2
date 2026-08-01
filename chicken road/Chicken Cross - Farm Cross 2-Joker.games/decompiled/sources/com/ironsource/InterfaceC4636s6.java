package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.s6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4636s6 {
    void a();

    void a(LevelPlayAdInfo levelPlayAdInfo);

    void b(IronSourceError ironSourceError);

    void b(LevelPlayAdInfo levelPlayAdInfo);

    void c(IronSourceError ironSourceError);

    default void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }
}
