package com.facebook.appevents;

import com.facebook.internal.C0715k;
import com.facebook.internal.p;

/* loaded from: classes3.dex */
public final class u implements p.b {
    @Override // com.facebook.internal.p.b
    public final void onSuccess() {
        C0715k.a(new q(), C0715k.b.AAM);
        C0715k.a(new androidx.collection.i(), C0715k.b.RestrictiveDataFiltering);
        C0715k.a(new androidx.media3.exoplayer.mediacodec.j(), C0715k.b.PrivacyProtection);
        C0715k.a(new androidx.media3.exoplayer.source.preload.i(), C0715k.b.EventDeactivation);
        C0715k.a(new r(), C0715k.b.BannedParamFiltering);
        C0715k.a(new s(), C0715k.b.IapLogging);
        C0715k.a(new androidx.core.database.a(), C0715k.b.StdParamEnforcement);
        C0715k.a(new t(), C0715k.b.ProtectedMode);
        C0715k.a(new androidx.core.graphics.a(), C0715k.b.MACARuleMatching);
        C0715k.a(new androidx.collection.a(), C0715k.b.BlocklistEvents);
        C0715k.a(new androidx.collection.b(), C0715k.b.FilterRedactedEvents);
        C0715k.a(new androidx.collection.c(), C0715k.b.FilterSensitiveParams);
        C0715k.a(new androidx.collection.d(), C0715k.b.CloudBridge);
        C0715k.a(new androidx.collection.e(), C0715k.b.GPSARATriggers);
        C0715k.a(new androidx.collection.f(), C0715k.b.GPSPACAProcessing);
        C0715k.a(new androidx.collection.g(), C0715k.b.GPSTopicsObservation);
        C0715k.a(new androidx.collection.h(), C0715k.b.VVP);
    }
}
