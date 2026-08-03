package com.ironsource;

/* renamed from: com.ironsource.od, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3207od {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6544a;
    private final com.unity3d.mediation.LevelPlay.AdFormat b;

    public C3207od(java.lang.String placementName, com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f6544a = placementName;
        this.b = adFormat;
    }

    public final java.lang.String a() {
        return this.f6544a + "_" + this.b;
    }
}
