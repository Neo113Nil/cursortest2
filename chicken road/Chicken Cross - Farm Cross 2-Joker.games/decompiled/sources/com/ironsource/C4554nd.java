package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.nd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4554nd {

    /* renamed from: a, reason: collision with root package name */
    private final String f8455a;
    private final LevelPlay.AdFormat b;

    public C4554nd(String placementName, LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f8455a = placementName;
        this.b = adFormat;
    }

    public final String a() {
        return this.f8455a + "_" + this.b;
    }
}
