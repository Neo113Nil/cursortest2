package com.google.firebase.analytics;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.5.0 */
/* loaded from: classes3.dex */
public class GoogleAnalyticsServerPreviewActivity extends android.app.Activity {
    @Override // android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.google.android.gms.internal.measurement.zzfb.zza(this, null).zze(getIntent());
        finish();
    }
}
