package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.vl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4168vl {
    public C4168vl() {
        Vl store = Ml.b;
        C3862kq clock = C3862kq.f7210a;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(clock, "clock");
    }

    public final boolean a(Context context, String collectorId, SignalsConfig.SynapseCollectorConfig synapseCollectorConfig) {
        if (synapseCollectorConfig.getMaxRetries() > 0 && synapseCollectorConfig.getDisableOnMaxRetries()) {
            try {
                Ml ml = Ml.f6723a;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(collectorId, "collectorId");
                Db a2 = Vl.a(context);
                String key = Vl.b(collectorId);
                Intrinsics.checkNotNullParameter(key, "key");
                return ((int) a2.f6510a.getLong(key, 0L)) >= synapseCollectorConfig.getMaxRetries();
            } catch (Exception unused) {
                String str = "Store read failed for '" + collectorId + "' failureCount.";
            }
        }
        return false;
    }

    public final boolean b(Context context, InterfaceC4195wl interfaceC4195wl, SignalsConfig.SynapseCollectorConfig synapseCollectorConfig) {
        short s;
        long j;
        if (!synapseCollectorConfig.isEnabled()) {
            String str = "Skipping '" + interfaceC4195wl.a() + "': config disabled or refresh interval invalid.";
            return false;
        }
        if (!a(context, interfaceC4195wl.a(), synapseCollectorConfig.getRefreshAfterSecs())) {
            if (!a(context, interfaceC4195wl, synapseCollectorConfig)) {
                String str2 = "Skipping '" + interfaceC4195wl.a() + "': not due yet.";
                return false;
            }
            String str3 = "Collector '" + interfaceC4195wl.a() + "' due by config fingerprint change.";
            HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("trigger", interfaceC4195wl.a()), TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2505));
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b("SynapseCollectorTriggered", hashMapOf, EnumC3944nm.f7271a);
            return true;
        }
        String str4 = "Collector '" + interfaceC4195wl.a() + "' due by refresh interval.";
        try {
            Ml ml = Ml.f6723a;
            String collectorId = interfaceC4195wl.a();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(collectorId, "collectorId");
            Db a2 = Vl.a(context);
            String key = Vl.c(collectorId);
            Intrinsics.checkNotNullParameter(key, "key");
            j = a2.f6510a.getLong(key, -1L);
        } catch (Exception unused) {
        }
        if ((j == -1 ? null : Long.valueOf(j)) == null) {
            s = 2503;
            HashMap hashMapOf2 = MapsKt.hashMapOf(TuplesKt.to("trigger", interfaceC4195wl.a()), TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s)));
            C3829jm c3829jm2 = C3829jm.f7187a;
            C3829jm.b("SynapseCollectorTriggered", hashMapOf2, EnumC3944nm.f7271a);
            return true;
        }
        s = 2504;
        HashMap hashMapOf22 = MapsKt.hashMapOf(TuplesKt.to("trigger", interfaceC4195wl.a()), TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s)));
        C3829jm c3829jm22 = C3829jm.f7187a;
        C3829jm.b("SynapseCollectorTriggered", hashMapOf22, EnumC3944nm.f7271a);
        return true;
    }

    public final boolean a(Context context, String collectorId, int i) {
        try {
            Ml ml = Ml.f6723a;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(collectorId, "collectorId");
            Db a2 = Vl.a(context);
            String key = Vl.c(collectorId);
            Intrinsics.checkNotNullParameter(key, "key");
            long j = a2.f6510a.getLong(key, -1L);
            Long valueOf = j == -1 ? null : Long.valueOf(j);
            return valueOf == null || System.currentTimeMillis() - valueOf.longValue() > ((long) i) * 1000;
        } catch (Exception unused) {
            String str = "Store read failed for '" + collectorId + "' lastRunAt - skipping.";
            return false;
        }
    }

    public final boolean a(Context context, InterfaceC4195wl interfaceC4195wl, SignalsConfig.SynapseCollectorConfig synapseCollectorConfig) {
        try {
            if (interfaceC4195wl.a(synapseCollectorConfig) == null) {
                return false;
            }
            try {
                Ml ml = Ml.f6723a;
                String collectorId = interfaceC4195wl.a();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(collectorId, "collectorId");
                Db a2 = Vl.a(context);
                String key = Vl.a(collectorId);
                Intrinsics.checkNotNullParameter(key, "key");
                if (a2.f6510a.getString(key, null) == null) {
                    return false;
                }
                return !Intrinsics.areEqual(r4, r6);
            } catch (Exception unused) {
                String str = "Store read failed for '" + interfaceC4195wl.a() + "' fingerprint - skipping config-change trigger.";
                return false;
            }
        } catch (Exception unused2) {
            String str2 = "getConfigFingerprint threw for '" + interfaceC4195wl.a() + "'.";
            return false;
        }
    }

    public final ArrayList a(Context context, SignalsConfig signalsConfig, List collectors) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(signalsConfig, "signalsConfig");
        Intrinsics.checkNotNullParameter(collectors, "collectors");
        ArrayList arrayList = new ArrayList();
        Iterator it = collectors.iterator();
        while (it.hasNext()) {
            InterfaceC4195wl interfaceC4195wl = (InterfaceC4195wl) it.next();
            SignalsConfig.SynapseCollectorConfig a2 = interfaceC4195wl.a(signalsConfig);
            Pair pair = null;
            if (a2 == null) {
                String str = "Skipping '" + interfaceC4195wl.a() + "': no config.";
            } else if (a(context, interfaceC4195wl.a(), a2)) {
                String str2 = "Skipping '" + interfaceC4195wl.a() + "': permanently blocked after max retries.";
            } else if (b(context, interfaceC4195wl, a2)) {
                pair = TuplesKt.to(interfaceC4195wl, a2);
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return arrayList;
    }
}
