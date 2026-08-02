package com.facebook.internal.instrument;

import android.content.SharedPreferences;
import androidx.annotation.RestrictTo;
import com.facebook.S;
import com.facebook.internal.C0715k;
import com.facebook.internal.instrument.c;
import com.facebook.w;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONArray;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nExceptionAnalyzer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionAnalyzer.kt\ncom/facebook/internal/instrument/ExceptionAnalyzer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,99:1\n13579#2,2:100\n*S KotlinDebug\n*F\n+ 1 ExceptionAnalyzer.kt\ncom/facebook/internal/instrument/ExceptionAnalyzer\n*L\n47#1:100,2\n*E\n"})
/* loaded from: classes3.dex */
public final class b {
    public static boolean a;

    @JvmStatic
    public static final void a(Throwable th) {
        HashMap hashMap;
        C0715k.b feature;
        boolean startsWith$default;
        if (!a || th == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "e.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "it.className");
            C0715k c0715k = C0715k.a;
            Intrinsics.checkNotNullParameter(className, "className");
            synchronized (C0715k.a) {
                hashMap = C0715k.b;
                if (hashMap.isEmpty()) {
                    hashMap.put(C0715k.b.AAM, new String[]{"com.facebook.appevents.aam."});
                    hashMap.put(C0715k.b.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                    hashMap.put(C0715k.b.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
                    hashMap.put(C0715k.b.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                    hashMap.put(C0715k.b.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
                    hashMap.put(C0715k.b.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                    hashMap.put(C0715k.b.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                    hashMap.put(C0715k.b.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                    hashMap.put(C0715k.b.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                    hashMap.put(C0715k.b.ProtectedMode, new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
                    hashMap.put(C0715k.b.MACARuleMatching, new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
                    hashMap.put(C0715k.b.BlocklistEvents, new String[]{"com.facebook.appevents.integrity.BlocklistEventsManager"});
                    hashMap.put(C0715k.b.FilterRedactedEvents, new String[]{"com.facebook.appevents.integrity.RedactedEventsManager"});
                    hashMap.put(C0715k.b.FilterSensitiveParams, new String[]{"com.facebook.appevents.integrity.SensitiveParamsManager"});
                    hashMap.put(C0715k.b.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                    hashMap.put(C0715k.b.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                    hashMap.put(C0715k.b.IapLogging, new String[]{"com.facebook.appevents.iap."});
                    hashMap.put(C0715k.b.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
                    hashMap.put(C0715k.b.GPSARATriggers, new String[]{"com.facebook.appevents.gps.ara.GpsARAManager"});
                    hashMap.put(C0715k.b.GPSPACAProcessing, new String[]{"com.facebook.appevents.gps.pa.PACustomAudienceClient"});
                    hashMap.put(C0715k.b.GPSTopicsObservation, new String[]{"com.facebook.appevents.gps.topics.GpsTopicsManager"});
                    hashMap.put(C0715k.b.VVP, new String[]{"com.facebook.appevents.integrity.VVPManager"});
                }
            }
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    feature = C0715k.b.Unknown;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                feature = (C0715k.b) entry.getKey();
                for (String str : (String[]) entry.getValue()) {
                    startsWith$default = StringsKt__StringsJVMKt.startsWith$default(className, str, false, 2, null);
                    if (startsWith$default) {
                        break;
                    }
                }
            }
            if (feature != C0715k.b.Unknown) {
                Intrinsics.checkNotNullParameter(feature, "feature");
                SharedPreferences.Editor edit = w.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit();
                feature.getClass();
                edit.putString("FBSDKFeature" + feature, "18.3.0").apply();
                hashSet.add(feature.toString());
            }
        }
        w wVar = w.a;
        if (!S.c() || hashSet.isEmpty()) {
            return;
        }
        JSONArray features = new JSONArray((Collection) hashSet);
        Intrinsics.checkNotNullParameter(features, "features");
        c cVar = new c();
        cVar.b = c.EnumC0092c.b;
        Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        cVar.g = valueOf;
        cVar.c = features;
        StringBuffer stringBuffer = new StringBuffer("analysis_log_");
        stringBuffer.append(String.valueOf(valueOf));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n         …)\n            .toString()");
        cVar.a = stringBuffer2;
        cVar.b();
    }
}
