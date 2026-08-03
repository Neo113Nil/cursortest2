package com.inmobi.media;

/* renamed from: com.inmobi.media.sb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2746sb implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks {
    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(com.inmobi.media.C2801ub.e, "access$getTAG$p(...)");
        com.inmobi.media.C2801ub.f = true;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        com.inmobi.media.C2801ub.f = false;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(com.inmobi.media.C2801ub.e, "access$getTAG$p(...)");
    }
}
