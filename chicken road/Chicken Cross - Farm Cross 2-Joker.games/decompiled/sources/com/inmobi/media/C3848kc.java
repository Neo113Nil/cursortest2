package com.inmobi.media;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.kc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3848kc implements GoogleApiClient.ConnectionCallbacks {
    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Intrinsics.checkNotNullExpressionValue(C3906mc.e, "access$getTAG$p(...)");
        C3906mc.f = true;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        C3906mc.f = false;
        Intrinsics.checkNotNullExpressionValue(C3906mc.e, "access$getTAG$p(...)");
    }
}
