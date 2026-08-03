package com.ironsource;

/* loaded from: classes5.dex */
public final class Za implements com.ironsource.mediationsdk.impressionData.ImpressionDataListener {

    /* renamed from: a, reason: collision with root package name */
    private final com.unity3d.mediation.impression.LevelPlayImpressionDataListener f6118a;

    public Za(com.unity3d.mediation.impression.LevelPlayImpressionDataListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        this.f6118a = listener;
    }

    public final com.unity3d.mediation.impression.LevelPlayImpressionDataListener a() {
        return this.f6118a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.ironsource.Za) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.f6118a, ((com.ironsource.Za) obj).f6118a);
        }
        return false;
    }

    public int hashCode() {
        return this.f6118a.hashCode();
    }

    @Override // com.ironsource.mediationsdk.impressionData.ImpressionDataListener
    public void onImpressionSuccess(com.ironsource.V8 impressionData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impressionData, "impressionData");
        this.f6118a.onImpressionSuccess(new com.unity3d.mediation.impression.LevelPlayImpressionData(impressionData.d()));
    }
}
