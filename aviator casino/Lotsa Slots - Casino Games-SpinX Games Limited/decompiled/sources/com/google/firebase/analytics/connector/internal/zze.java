package com.google.firebase.analytics.connector.internal;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.5.0 */
/* loaded from: classes3.dex */
public final class zze implements com.google.firebase.analytics.connector.internal.zza {
    final java.util.Set zza;
    private final com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener zzb;
    private final com.google.android.gms.measurement.api.AppMeasurementSdk zzc;
    private final com.google.firebase.analytics.connector.internal.zzd zzd;

    public zze(com.google.android.gms.measurement.api.AppMeasurementSdk appMeasurementSdk, com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.zzb = analyticsConnectorListener;
        this.zzc = appMeasurementSdk;
        com.google.firebase.analytics.connector.internal.zzd zzdVar = new com.google.firebase.analytics.connector.internal.zzd(this);
        this.zzd = zzdVar;
        appMeasurementSdk.registerOnMeasurementEventListener(zzdVar);
        this.zza = new java.util.HashSet();
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.zzb;
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzb(java.util.Set set) {
        java.util.Set set2 = this.zza;
        set2.clear();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (hashSet.size() >= 50) {
                break;
            }
            int i = com.google.firebase.analytics.connector.internal.zzc.zza;
            if (str != null && str.length() != 0) {
                int codePointAt = str.codePointAt(0);
                if (!java.lang.Character.isLetter(codePointAt)) {
                    if (codePointAt == 95) {
                        codePointAt = 95;
                    }
                }
                int length = str.length();
                int charCount = java.lang.Character.charCount(codePointAt);
                while (true) {
                    if (charCount < length) {
                        int codePointAt2 = str.codePointAt(charCount);
                        if (codePointAt2 == 95 || java.lang.Character.isLetterOrDigit(codePointAt2)) {
                            charCount += java.lang.Character.charCount(codePointAt2);
                        }
                    } else if (str.length() != 0) {
                        int codePointAt3 = str.codePointAt(0);
                        if (java.lang.Character.isLetter(codePointAt3)) {
                            int length2 = str.length();
                            int charCount2 = java.lang.Character.charCount(codePointAt3);
                            while (true) {
                                if (charCount2 >= length2) {
                                    java.lang.String zzb = com.google.android.gms.measurement.internal.zzjl.zzb(str);
                                    if (zzb != null) {
                                        str = zzb;
                                    }
                                    com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
                                    hashSet.add(str);
                                } else {
                                    int codePointAt4 = str.codePointAt(charCount2);
                                    if (codePointAt4 == 95 || java.lang.Character.isLetterOrDigit(codePointAt4)) {
                                        charCount2 += java.lang.Character.charCount(codePointAt4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        set2.addAll(hashSet);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzc() {
        this.zza.clear();
    }

    final /* synthetic */ com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener zzd() {
        return this.zzb;
    }
}
