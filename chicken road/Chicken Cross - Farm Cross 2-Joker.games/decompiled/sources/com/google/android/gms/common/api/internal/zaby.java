package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-base@@18.7.2 */
/* loaded from: classes9.dex */
final class zaby implements OnCompleteListener {
    private final GoogleApiManager zaa;
    private final int zab;
    private final ApiKey zac;
    private final long zad;
    private final long zae;

    zaby(GoogleApiManager googleApiManager, int i, ApiKey apiKey, long j, long j2, String str, String str2) {
        this.zaa = googleApiManager;
        this.zab = i;
        this.zac = apiKey;
        this.zad = j;
        this.zae = j2;
    }

    static zaby zaa(GoogleApiManager googleApiManager, int i, ApiKey apiKey) {
        boolean z;
        if (!googleApiManager.zam()) {
            return null;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config == null) {
            z = true;
        } else {
            if (!config.getMethodInvocationTelemetryEnabled()) {
                return null;
            }
            z = config.getMethodTimingTelemetryEnabled();
            zabk zag = googleApiManager.zag(apiKey);
            if (zag != null) {
                if (!(zag.zaf() instanceof BaseGmsClient)) {
                    return null;
                }
                BaseGmsClient baseGmsClient = (BaseGmsClient) zag.zaf();
                if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                    ConnectionTelemetryConfiguration zab = zab(zag, baseGmsClient, i);
                    if (zab == null) {
                        return null;
                    }
                    zag.zas();
                    z = zab.getMethodTimingTelemetryEnabled();
                }
            }
        }
        return new zaby(googleApiManager, i, apiKey, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static ConnectionTelemetryConfiguration zab(zabk zabkVar, BaseGmsClient baseGmsClient, int i) {
        int[] methodInvocationMethodKeyAllowlist;
        int[] methodInvocationMethodKeyDisallowlist;
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled() || ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) != null ? !ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i) : !((methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist()) == null || !ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i))) || zabkVar.zar() >= telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return null;
        }
        return telemetryConfiguration;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    @Override // com.google.android.gms.tasks.OnCompleteListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onComplete(Task task) {
        zabk zag;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        long j2;
        int i8;
        GoogleApiManager googleApiManager = this.zaa;
        if (googleApiManager.zam()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zag = googleApiManager.zag(this.zac)) != null && (zag.zaf() instanceof BaseGmsClient)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) zag.zaf();
                long j3 = this.zad;
                boolean z = j3 > 0;
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                if (config != null) {
                    z &= config.getMethodTimingTelemetryEnabled();
                    i = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    int version = config.getVersion();
                    if (!baseGmsClient.hasConnectionInfo() || baseGmsClient.isConnecting()) {
                        i2 = version;
                        i4 = i;
                        i3 = maxMethodInvocationsInBatch;
                        if (!task.isSuccessful()) {
                            i7 = 0;
                            i6 = 0;
                        } else if (task.isCanceled()) {
                            i6 = -1;
                            i7 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof ApiException) {
                                Status status = ((ApiException) exception).getStatus();
                                i5 = status.getStatusCode();
                                ConnectionResult connectionResult = status.getConnectionResult();
                                if (connectionResult != null) {
                                    i6 = connectionResult.getErrorCode();
                                    i7 = i5;
                                }
                            } else {
                                i5 = 101;
                            }
                            i6 = -1;
                            i7 = i5;
                        }
                        if (z) {
                            j = 0;
                            j2 = 0;
                            i8 = -1;
                        } else {
                            long j4 = this.zae;
                            long currentTimeMillis = System.currentTimeMillis();
                            i8 = (int) (SystemClock.elapsedRealtime() - j4);
                            j = j3;
                            j2 = currentTimeMillis;
                        }
                        googleApiManager.zar(new MethodInvocation(this.zab, i7, i6, j, j2, null, null, gCoreServiceId, i8), i2, i4, i3);
                    }
                    ConnectionTelemetryConfiguration zab = zab(zag, baseGmsClient, this.zab);
                    if (zab == null) {
                        return;
                    }
                    boolean z2 = zab.getMethodTimingTelemetryEnabled() && j3 > 0;
                    i3 = zab.getMaxMethodInvocationsLogged();
                    z = z2;
                    i2 = version;
                } else {
                    i = 5000;
                    i2 = 0;
                    i3 = 100;
                }
                i4 = i;
                if (!task.isSuccessful()) {
                }
                if (z) {
                }
                googleApiManager.zar(new MethodInvocation(this.zab, i7, i6, j, j2, null, null, gCoreServiceId, i8), i2, i4, i3);
            }
        }
    }
}
