package com.facebook.appevents.gps.pa;

import android.adservices.common.AdData;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import androidx.activity.C0168a;
import androidx.activity.C0169b;
import androidx.activity.C0170c;
import androidx.credentials.C0294i;
import androidx.credentials.C0297l;
import androidx.credentials.O;
import androidx.credentials.P;
import androidx.credentials.Q;
import com.facebook.w;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

@SourceDebugExtension({"SMAP\nPACustomAudienceClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PACustomAudienceClient.kt\ncom/facebook/appevents/gps/pa/PACustomAudienceClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,186:1\n1#2:187\n29#3:188\n29#3:189\n29#3:190\n29#3:191\n*S KotlinDebug\n*F\n+ 1 PACustomAudienceClient.kt\ncom/facebook/appevents/gps/pa/PACustomAudienceClient\n*L\n135#1:188\n139#1:189\n147#1:190\n148#1:191\n*E\n"})
/* loaded from: classes3.dex */
public final class a {
    public static final a a = new a();
    public static boolean b;
    public static boolean c;
    public static CustomAudienceManager d;
    public static com.facebook.appevents.gps.a e;
    public static String f;

    /* renamed from: com.facebook.appevents.gps.pa.a$a, reason: collision with other inner class name */
    public static final class C0080a implements OutcomeReceiver {
        /* JADX WARN: Removed duplicated region for block: B:5:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onError(Throwable th) {
            com.facebook.appevents.gps.a aVar;
            Exception error = (Exception) th;
            Intrinsics.checkNotNullParameter(error, "error");
            com.facebook.internal.instrument.crashshield.a.b(a.class);
            error.toString();
            com.facebook.appevents.gps.a aVar2 = null;
            if (!com.facebook.internal.instrument.crashshield.a.b(a.class)) {
                try {
                    aVar = a.e;
                } catch (Throwable th2) {
                    com.facebook.internal.instrument.crashshield.a.a(th2, a.class);
                }
                if (aVar != null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    aVar2 = aVar;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_pa_failed_reason", error.toString());
                Unit unit = Unit.INSTANCE;
                aVar2.a(bundle, "gps_pa_failed");
            }
            aVar = null;
            if (aVar != null) {
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("gps_pa_failed_reason", error.toString());
            Unit unit2 = Unit.INSTANCE;
            aVar2.a(bundle2, "gps_pa_failed");
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onResult(Object result) {
            com.facebook.appevents.gps.a aVar;
            Intrinsics.checkNotNullParameter(result, "result");
            com.facebook.internal.instrument.crashshield.a.b(a.class);
            if (!com.facebook.internal.instrument.crashshield.a.b(a.class)) {
                try {
                    aVar = a.e;
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, a.class);
                }
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                    aVar = null;
                }
                aVar.a(null, "gps_pa_succeed");
            }
            aVar = null;
            if (aVar == null) {
            }
            aVar.a(null, "gps_pa_succeed");
        }
    }

    static {
        "Fledge: ".concat(a.class.getSimpleName());
    }

    @JvmStatic
    @TargetApi(34)
    public static final void a() {
        String obj;
        CustomAudienceManager customAudienceManager;
        if (com.facebook.internal.instrument.crashshield.a.b(a.class)) {
            return;
        }
        try {
            c = true;
            Context a2 = w.a();
            e = new com.facebook.appevents.gps.a(a2);
            f = "https://www." + w.s + "/privacy_sandbox/pa/logic";
            com.facebook.appevents.gps.a aVar = null;
            try {
                customAudienceManager = CustomAudienceManager.get(a2);
                d = customAudienceManager;
                if (customAudienceManager != null) {
                    b = true;
                }
                obj = null;
            } catch (Error e2) {
                obj = e2.toString();
                e2.toString();
            } catch (Exception e3) {
                obj = e3.toString();
                e3.toString();
            }
            if (b) {
                return;
            }
            com.facebook.appevents.gps.a aVar2 = e;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
            } else {
                aVar = aVar2;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_pa_failed_reason", obj);
            Unit unit = Unit.INSTANCE;
            aVar.a(bundle, "gps_pa_failed");
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, a.class);
        }
    }

    @TargetApi(34)
    public final void b(String str, String str2) {
        AdData.Builder renderUri;
        AdData.Builder metadata;
        AdData build;
        TrustedBiddingData.Builder trustedBiddingUri;
        TrustedBiddingData.Builder trustedBiddingKeys;
        TrustedBiddingData build2;
        CustomAudience.Builder name;
        AdTechIdentifier fromString;
        CustomAudience.Builder buyer;
        CustomAudience.Builder dailyUpdateUri;
        CustomAudience.Builder biddingLogicUri;
        CustomAudience.Builder trustedBiddingData;
        AdSelectionSignals fromString2;
        CustomAudience.Builder userBiddingSignals;
        CustomAudience.Builder ads;
        CustomAudience build3;
        JoinCustomAudienceRequest.Builder customAudience;
        JoinCustomAudienceRequest build4;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            String c2 = c(str, str2);
            if (c2 == null) {
                return;
            }
            com.facebook.appevents.gps.a aVar = null;
            try {
                C0080a c0080a = new C0080a();
                C0294i.g();
                AdData.Builder a2 = C0297l.a();
                StringBuilder sb = new StringBuilder();
                String str3 = f;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                    str3 = null;
                }
                sb.append(str3);
                sb.append("/ad");
                Uri parse = Uri.parse(sb.toString());
                Intrinsics.checkExpressionValueIsNotNull(parse, "Uri.parse(this)");
                renderUri = a2.setRenderUri(parse);
                metadata = renderUri.setMetadata("{'isRealAd': false}");
                build = metadata.build();
                Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …\n                .build()");
                C0168a.h();
                TrustedBiddingData.Builder a3 = O.a();
                StringBuilder sb2 = new StringBuilder();
                String str4 = f;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                    str4 = null;
                }
                sb2.append(str4);
                sb2.append("?trusted_bidding");
                Uri parse2 = Uri.parse(sb2.toString());
                Intrinsics.checkExpressionValueIsNotNull(parse2, "Uri.parse(this)");
                trustedBiddingUri = a3.setTrustedBiddingUri(parse2);
                trustedBiddingKeys = trustedBiddingUri.setTrustedBiddingKeys(CollectionsKt.listOf(""));
                build2 = trustedBiddingKeys.build();
                Intrinsics.checkNotNullExpressionValue(build2, "Builder()\n              …\n                .build()");
                C0169b.f();
                name = Q.a().setName(c2);
                fromString = AdTechIdentifier.fromString("facebook.com");
                buyer = name.setBuyer(fromString);
                StringBuilder sb3 = new StringBuilder();
                String str5 = f;
                if (str5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                    str5 = null;
                }
                sb3.append(str5);
                sb3.append("?daily&app_id=");
                sb3.append(str);
                Uri parse3 = Uri.parse(sb3.toString());
                Intrinsics.checkExpressionValueIsNotNull(parse3, "Uri.parse(this)");
                dailyUpdateUri = buyer.setDailyUpdateUri(parse3);
                StringBuilder sb4 = new StringBuilder();
                String str6 = f;
                if (str6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                    str6 = null;
                }
                sb4.append(str6);
                sb4.append("?bidding");
                Uri parse4 = Uri.parse(sb4.toString());
                Intrinsics.checkExpressionValueIsNotNull(parse4, "Uri.parse(this)");
                biddingLogicUri = dailyUpdateUri.setBiddingLogicUri(parse4);
                trustedBiddingData = biddingLogicUri.setTrustedBiddingData(build2);
                fromString2 = AdSelectionSignals.fromString("{}");
                userBiddingSignals = trustedBiddingData.setUserBiddingSignals(fromString2);
                ads = userBiddingSignals.setAds(CollectionsKt.listOf(build));
                build3 = ads.build();
                Intrinsics.checkNotNullExpressionValue(build3, "Builder()\n              …(listOf(dummyAd)).build()");
                C0170c.e();
                customAudience = P.a().setCustomAudience(build3);
                build4 = customAudience.build();
                Intrinsics.checkNotNullExpressionValue(build4, "Builder().setCustomAudience(ca).build()");
                CustomAudienceManager customAudienceManager = d;
                if (customAudienceManager != null) {
                    customAudienceManager.joinCustomAudience(build4, Executors.newSingleThreadExecutor(), c0080a);
                }
            } catch (Error e2) {
                e2.toString();
                com.facebook.appevents.gps.a aVar2 = e;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    aVar = aVar2;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_pa_failed_reason", e2.toString());
                Unit unit = Unit.INSTANCE;
                aVar.a(bundle, "gps_pa_failed");
            } catch (Exception e3) {
                e3.toString();
                com.facebook.appevents.gps.a aVar3 = e;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    aVar = aVar3;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_pa_failed_reason", e3.toString());
                Unit unit2 = Unit.INSTANCE;
                aVar.a(bundle2, "gps_pa_failed");
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }

    public final String c(String str, String str2) {
        boolean contains$default;
        if (!com.facebook.internal.instrument.crashshield.a.b(this) && str2 != null) {
            try {
                if (!Intrinsics.areEqual(str2, "_removed_")) {
                    contains$default = StringsKt__StringsKt.contains$default(str2, "gps", false, 2, (Object) null);
                    if (!contains$default) {
                        return str + '@' + str2 + '@' + (System.currentTimeMillis() / 1000) + "@1";
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
                return null;
            }
        }
        return null;
    }
}
