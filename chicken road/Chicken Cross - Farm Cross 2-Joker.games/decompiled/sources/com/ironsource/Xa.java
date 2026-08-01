package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Xa implements ImpressionDataListener {

    /* renamed from: a, reason: collision with root package name */
    private final LevelPlayImpressionDataListener f8010a;

    public Xa(LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f8010a = listener;
    }

    public final LevelPlayImpressionDataListener a() {
        return this.f8010a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Xa) {
            return Intrinsics.areEqual(this.f8010a, ((Xa) obj).f8010a);
        }
        return false;
    }

    public int hashCode() {
        return this.f8010a.hashCode();
    }

    @Override // com.ironsource.mediationsdk.impressionData.ImpressionDataListener
    public void onImpressionSuccess(V8 impressionData) {
        Intrinsics.checkNotNullParameter(impressionData, "impressionData");
        this.f8010a.onImpressionSuccess(new LevelPlayImpressionData(impressionData.d()));
    }
}
