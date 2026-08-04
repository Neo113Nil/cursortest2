package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0810f;
import com.google.android.gms.common.internal.C0820p;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
import io.sentry.logger.LoggerBatchProcessor;

/* JADX INFO: loaded from: classes.dex */
public final class J implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0787h f11119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0780a f11121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11123e;

    public J(C0787h c0787h, int i7, C0780a c0780a, long j, long j3) {
        this.f11119a = c0787h;
        this.f11120b = i7;
        this.f11121c = c0780a;
        this.f11122d = j;
        this.f11123e = j3;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x002d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x002e A[RETURN] */
    public static ConnectionTelemetryConfiguration a(D d7, AbstractC0810f abstractC0810f, int i7) {
        ConnectionTelemetryConfiguration telemetryConfiguration = abstractC0810f.getTelemetryConfiguration();
        if (telemetryConfiguration != null && telemetryConfiguration.f11231b) {
            int i8 = 0;
            int[] iArr = telemetryConfiguration.f11233d;
            if (iArr == null) {
                int[] iArr2 = telemetryConfiguration.f11235f;
                if (iArr2 != null) {
                    while (i8 < iArr2.length) {
                        if (iArr2[i8] != i7) {
                            i8++;
                        }
                    }
                }
                if (d7.f11102C < telemetryConfiguration.f11234e) {
                    return telemetryConfiguration;
                }
                return null;
            }
            while (i8 < iArr.length) {
                if (iArr[i8] == i7) {
                    if (d7.f11102C < telemetryConfiguration.f11234e) {
                        return telemetryConfiguration;
                    }
                    return null;
                }
                i8++;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        D d7;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iElapsedRealtime;
        long j;
        long j3;
        C0787h c0787h = this.f11119a;
        if (c0787h.c()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) C0820p.b().f11324a;
            if ((rootTelemetryConfiguration == null || rootTelemetryConfiguration.f11295b) && (d7 = (D) c0787h.f11177A.get(this.f11121c)) != null) {
                Object obj = d7.f11105b;
                if (obj instanceof AbstractC0810f) {
                    AbstractC0810f abstractC0810f = (AbstractC0810f) obj;
                    long j7 = this.f11122d;
                    boolean z4 = j7 > 0;
                    int gCoreServiceId = abstractC0810f.getGCoreServiceId();
                    if (rootTelemetryConfiguration != null) {
                        z4 &= rootTelemetryConfiguration.f11296c;
                        boolean zHasConnectionInfo = abstractC0810f.hasConnectionInfo();
                        i7 = rootTelemetryConfiguration.f11297d;
                        int i13 = rootTelemetryConfiguration.f11294a;
                        if (!zHasConnectionInfo || abstractC0810f.isConnecting()) {
                            i9 = rootTelemetryConfiguration.f11298e;
                            i8 = i13;
                        } else {
                            ConnectionTelemetryConfiguration connectionTelemetryConfigurationA = a(d7, abstractC0810f, this.f11120b);
                            if (connectionTelemetryConfigurationA == null) {
                                return;
                            }
                            boolean z7 = connectionTelemetryConfigurationA.f11232c && j7 > 0;
                            i9 = connectionTelemetryConfigurationA.f11234e;
                            i8 = i13;
                            z4 = z7;
                        }
                    } else {
                        i7 = LoggerBatchProcessor.FLUSH_AFTER_MS;
                        i8 = 0;
                        i9 = 100;
                    }
                    int i14 = i7;
                    if (task.isSuccessful()) {
                        i11 = 0;
                        i12 = 0;
                    } else if (task.isCanceled()) {
                        i11 = -1;
                        i12 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof com.google.android.gms.common.api.j) {
                            Status status = ((com.google.android.gms.common.api.j) exception).getStatus();
                            i10 = status.f11082a;
                            ConnectionResult connectionResult = status.f11085d;
                            if (connectionResult != null) {
                                i11 = connectionResult.f11061b;
                            }
                            i12 = i10;
                        } else {
                            i10 = ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE;
                        }
                        i11 = -1;
                        i12 = i10;
                    }
                    if (z4) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f11123e);
                        j = j7;
                        j3 = jCurrentTimeMillis;
                    } else {
                        iElapsedRealtime = -1;
                        j = 0;
                        j3 = 0;
                    }
                    zau zauVar = c0787h.f11181E;
                    zauVar.sendMessage(zauVar.obtainMessage(18, new K(new MethodInvocation(this.f11120b, i12, i11, j, j3, null, null, gCoreServiceId, iElapsedRealtime), i8, i14, i9)));
                }
            }
        }
    }
}
