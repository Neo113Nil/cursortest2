package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.C0852b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0861c;
import com.google.android.gms.common.internal.C0864f;
import com.google.android.gms.common.internal.C0873o;
import com.google.android.gms.common.internal.C0876s;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;

/* loaded from: classes4.dex */
public final class U implements OnCompleteListener {
    public final C0833g a;
    public final int b;
    public final C0828b c;
    public final long d;
    public final long e;

    @VisibleForTesting
    public U(C0833g c0833g, int i, C0828b c0828b, long j, long j2) {
        this.a = c0833g;
        this.b = i;
        this.c = c0828b;
        this.d = j;
        this.e = j2;
    }

    @Nullable
    public static C0864f a(K k, AbstractC0861c abstractC0861c, int i) {
        C0864f telemetryConfiguration = abstractC0861c.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.b) {
            return null;
        }
        int[] iArr = telemetryConfiguration.d;
        if (iArr == null) {
            int[] iArr2 = telemetryConfiguration.f;
            if (iArr2 != null && ArrayUtils.contains(iArr2, i)) {
                return null;
            }
        } else if (!ArrayUtils.contains(iArr, i)) {
            return null;
        }
        if (k.u < telemetryConfiguration.e) {
            return telemetryConfiguration;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    @WorkerThread
    public final void onComplete(@NonNull Task task) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        C0833g c0833g = this.a;
        if (c0833g.c()) {
            C0876s c0876s = com.google.android.gms.common.internal.r.a().a;
            if (c0876s == null || c0876s.b) {
                K k = (K) c0833g.l.get(this.c);
                if (k != null) {
                    Object obj = k.b;
                    if (obj instanceof AbstractC0861c) {
                        AbstractC0861c abstractC0861c = (AbstractC0861c) obj;
                        long j3 = this.d;
                        boolean z = j3 > 0;
                        int gCoreServiceId = abstractC0861c.getGCoreServiceId();
                        if (c0876s != null) {
                            z &= c0876s.c;
                            int i7 = c0876s.d;
                            int i8 = c0876s.e;
                            i = c0876s.a;
                            if (abstractC0861c.hasConnectionInfo() && !abstractC0861c.isConnecting()) {
                                C0864f a = a(k, abstractC0861c, this.b);
                                if (a == null) {
                                    return;
                                }
                                boolean z2 = a.c && j3 > 0;
                                i8 = a.e;
                                z = z2;
                            }
                            i3 = i7;
                            i2 = i8;
                        } else {
                            i = 0;
                            i2 = 100;
                            i3 = 5000;
                        }
                        int i9 = -1;
                        if (task.isSuccessful()) {
                            i6 = 0;
                            i5 = 0;
                        } else if (task.isCanceled()) {
                            i5 = -1;
                            i6 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof com.google.android.gms.common.api.b) {
                                Status status = ((com.google.android.gms.common.api.b) exception).getStatus();
                                i4 = status.a;
                                C0852b c0852b = status.d;
                                if (c0852b != null) {
                                    i5 = c0852b.b;
                                    i6 = i4;
                                }
                            } else {
                                i4 = ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE;
                            }
                            i5 = -1;
                            i6 = i4;
                        }
                        if (z) {
                            long currentTimeMillis = System.currentTimeMillis();
                            i9 = (int) (SystemClock.elapsedRealtime() - this.e);
                            j = j3;
                            j2 = currentTimeMillis;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        V v = new V(new C0873o(this.b, i6, i5, j, j2, null, null, gCoreServiceId, i9), i, i3, i2);
                        zau zauVar = c0833g.p;
                        zauVar.sendMessage(zauVar.obtainMessage(18, v));
                    }
                }
            }
        }
    }
}
