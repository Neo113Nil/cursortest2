package com.google.android.gms.common.api.internal;

/* loaded from: classes3.dex */
final class zacd implements com.google.android.gms.tasks.OnCompleteListener {
    private final com.google.android.gms.common.api.internal.GoogleApiManager zaa;
    private final int zab;
    private final com.google.android.gms.common.api.internal.ApiKey zac;
    private final long zad;
    private final long zae;

    static com.google.android.gms.common.api.internal.zacd zaa(com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager, int i, com.google.android.gms.common.api.internal.ApiKey apiKey) {
        boolean z;
        if (!googleApiManager.zaD()) {
            return null;
        }
        com.google.android.gms.common.internal.RootTelemetryConfiguration config = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance().getConfig();
        if (config == null) {
            z = true;
        } else {
            if (!config.getMethodInvocationTelemetryEnabled()) {
                return null;
            }
            z = config.getMethodTimingTelemetryEnabled();
            com.google.android.gms.common.api.internal.zabq zai = googleApiManager.zai(apiKey);
            if (zai != null) {
                if (!(zai.zaf() instanceof com.google.android.gms.common.internal.BaseGmsClient)) {
                    return null;
                }
                com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = (com.google.android.gms.common.internal.BaseGmsClient) zai.zaf();
                if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                    com.google.android.gms.common.internal.ConnectionTelemetryConfiguration zab = zab(zai, baseGmsClient, i);
                    if (zab == null) {
                        return null;
                    }
                    zai.zaq();
                    z = zab.getMethodTimingTelemetryEnabled();
                }
            }
        }
        return new com.google.android.gms.common.api.internal.zacd(googleApiManager, i, apiKey, z ? java.lang.System.currentTimeMillis() : 0L, z ? android.os.SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static com.google.android.gms.common.internal.ConnectionTelemetryConfiguration zab(com.google.android.gms.common.api.internal.zabq zabqVar, com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, int i) {
        com.google.android.gms.common.internal.ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled()) {
            return null;
        }
        int[] methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist();
        if (methodInvocationMethodKeyAllowlist == null) {
            int[] methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist();
            if (methodInvocationMethodKeyDisallowlist != null && com.google.android.gms.common.util.ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i)) {
                return null;
            }
        } else if (!com.google.android.gms.common.util.ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i)) {
            return null;
        }
        if (zabqVar.zac() < telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return telemetryConfiguration;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(com.google.android.gms.tasks.Task task) {
        com.google.android.gms.common.api.internal.zabq zai;
        int i;
        int i2;
        int i3;
        int errorCode;
        long j;
        long j2;
        int i4;
        if (this.zaa.zaD()) {
            com.google.android.gms.common.internal.RootTelemetryConfiguration config = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zai = this.zaa.zai(this.zac)) != null && (zai.zaf() instanceof com.google.android.gms.common.internal.BaseGmsClient)) {
                com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = (com.google.android.gms.common.internal.BaseGmsClient) zai.zaf();
                int i5 = 0;
                boolean z = this.zad > 0;
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                int i6 = 100;
                if (config != null) {
                    z &= config.getMethodTimingTelemetryEnabled();
                    int batchPeriodMillis = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    i = config.getVersion();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        com.google.android.gms.common.internal.ConnectionTelemetryConfiguration zab = zab(zai, baseGmsClient, this.zab);
                        if (zab == null) {
                            return;
                        }
                        boolean z2 = zab.getMethodTimingTelemetryEnabled() && this.zad > 0;
                        maxMethodInvocationsInBatch = zab.getMaxMethodInvocationsLogged();
                        z = z2;
                    }
                    i3 = batchPeriodMillis;
                    i2 = maxMethodInvocationsInBatch;
                } else {
                    i = 0;
                    i2 = 100;
                    i3 = 5000;
                }
                com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
                if (task.isSuccessful()) {
                    errorCode = 0;
                } else {
                    if (!task.isCanceled()) {
                        java.lang.Exception exception = task.getException();
                        if (exception instanceof com.google.android.gms.common.api.ApiException) {
                            com.google.android.gms.common.api.Status status = ((com.google.android.gms.common.api.ApiException) exception).getStatus();
                            i6 = status.getStatusCode();
                            com.google.android.gms.common.ConnectionResult connectionResult = status.getConnectionResult();
                            if (connectionResult != null) {
                                errorCode = connectionResult.getErrorCode();
                                i5 = i6;
                            }
                        } else {
                            i5 = 101;
                            errorCode = -1;
                        }
                    }
                    i5 = i6;
                    errorCode = -1;
                }
                if (z) {
                    long j3 = this.zad;
                    long j4 = this.zae;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    i4 = (int) (android.os.SystemClock.elapsedRealtime() - j4);
                    j2 = currentTimeMillis;
                    j = j3;
                } else {
                    j = 0;
                    j2 = 0;
                    i4 = -1;
                }
                googleApiManager.zaw(new com.google.android.gms.common.internal.MethodInvocation(this.zab, i5, errorCode, j, j2, null, null, gCoreServiceId, i4), i, i3, i2);
            }
        }
    }

    zacd(com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager, int i, com.google.android.gms.common.api.internal.ApiKey apiKey, long j, long j2, java.lang.String str, java.lang.String str2) {
        this.zaa = googleApiManager;
        this.zab = i;
        this.zac = apiKey;
        this.zad = j;
        this.zae = j2;
    }
}
