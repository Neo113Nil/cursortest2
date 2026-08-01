package com.inmobi.media;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.PowerManager;
import android.os.SystemClock;
import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public abstract class Sf {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        if (r5 < (r9 != null ? r9.getRefreshDebounceTime() : 1000)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
    
        if (r5 > r3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static B6 a(ConnectivityManager connectivityManager) {
        long nonValidatedExpiry;
        Network network = connectivityManager.getActiveNetwork();
        if (network == null) {
            return B6.j;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
        if (networkCapabilities == null) {
            return B6.j;
        }
        Intrinsics.checkNotNullExpressionValue("Sf", "TAG");
        String str = "Network capabilities: " + networkCapabilities;
        if (!networkCapabilities.hasCapability(12)) {
            return B6.j;
        }
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        if (((AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class)).getSkipNetworkValidationFeatureEnabled() || networkCapabilities.hasCapability(16)) {
            return null;
        }
        Network network2 = B5.f6469a;
        Intrinsics.checkNotNullParameter(network, "network");
        AdConfig.CustomNetworkValidation a2 = B5.a();
        if (!(a2 != null ? a2.getEnabled() : false)) {
            return B6.j;
        }
        long j = B5.d;
        if (j != 0) {
            CoroutineScope coroutineScope = AbstractC4143un.f7420a;
            long elapsedRealtime = SystemClock.elapsedRealtime() - j;
            AdConfig.CustomNetworkValidation a3 = B5.a();
        }
        B5.d = SystemClock.elapsedRealtime();
        if (Intrinsics.areEqual(B5.f6469a, network)) {
            long j2 = B5.c;
            CoroutineScope coroutineScope2 = AbstractC4143un.f7420a;
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - j2;
            if (B5.b) {
                AdConfig.CustomNetworkValidation a4 = B5.a();
                nonValidatedExpiry = a4 != null ? a4.getValidatedExpiry() : UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
            } else {
                AdConfig.CustomNetworkValidation a5 = B5.a();
                nonValidatedExpiry = a5 != null ? a5.getNonValidatedExpiry() : 30000L;
            }
        }
        if (B5.e.compareAndSet(false, true)) {
            BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.e, null, null, new A5(network, null), 3, null);
        }
        if (B5.b) {
            return null;
        }
        return B6.o;
    }

    public static boolean b() {
        Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return false;
        }
        try {
            Object systemService = context.getSystemService("power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            if (powerManager != null) {
                return powerManager.isDeviceIdleMode();
            }
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("Sf", "TAG");
            String str = "SDK encountered unexpected error in checking idle mode; " + e.getMessage();
        }
        return false;
    }

    public static B6 a() {
        B6 b6;
        Context context = AbstractC3914mk.f7252a;
        if (context != null) {
            try {
                Object systemService = context.getSystemService("connectivity");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                b6 = a((ConnectivityManager) systemService);
            } catch (Exception e) {
                Intrinsics.checkNotNullExpressionValue("Sf", "TAG");
                String str = "SDK encountered unexpected error in checking network availability; " + e.getMessage();
                b6 = B6.l;
            }
            if (b6 != null) {
                return b6;
            }
            if (b()) {
                return B6.i;
            }
            return null;
        }
        return B6.h;
    }
}
