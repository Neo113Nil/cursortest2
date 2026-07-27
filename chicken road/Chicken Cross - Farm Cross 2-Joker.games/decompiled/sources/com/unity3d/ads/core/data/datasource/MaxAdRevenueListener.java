package com.unity3d.ads.core.data.datasource;

import android.os.Bundle;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C4761z5;
import com.ironsource.mediationsdk.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.ads.core.data.model.AdRevenueAdFormat;
import com.unity3d.ads.core.data.model.AdRevenueData;
import com.unity3d.ads.core.domain.events.HandleAdRevenueEvent;
import com.unity3d.ads.core.log.Logger;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MaxAdRevenueListener.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\rH\u0002J\u000e\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\u0012H\u0002J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/MaxAdRevenueListener;", "", "handleAdRevenueEvent", "Lcom/unity3d/ads/core/domain/events/HandleAdRevenueEvent;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "<init>", "(Lcom/unity3d/ads/core/domain/events/HandleAdRevenueEvent;Lkotlinx/coroutines/CoroutineScope;Lcom/unity3d/ads/core/log/Logger;)V", "onMessageReceived", "", "messageData", "Landroid/os/Bundle;", "parseRevenueBundle", "Lcom/unity3d/ads/core/data/model/AdRevenueData;", "bundle", "bundleToTraceString", "", "validateString", "parseMaxAdFormatString", "Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;", "formatStr", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MaxAdRevenueListener {
    private static final String KEY_AD_FORMAT = "ad_format";
    private static final String KEY_COUNTRY_CODE = "country_code";
    private static final String KEY_MAX_AD_UNIT_ID = "max_ad_unit_id";
    private static final String KEY_NETWORK_NAME = "network_name";
    private static final String KEY_REVENUE = "revenue";
    private static final String KEY_THIRD_PARTY_AD_PLACEMENT_ID = "third_party_ad_placement_id";
    private static final int MAX_STRING_LENGTH = 500;
    private final HandleAdRevenueEvent handleAdRevenueEvent;
    private final Logger logger;
    private final CoroutineScope scope;

    public MaxAdRevenueListener(HandleAdRevenueEvent handleAdRevenueEvent, CoroutineScope scope, Logger logger) {
        Intrinsics.checkNotNullParameter(handleAdRevenueEvent, "handleAdRevenueEvent");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.handleAdRevenueEvent = handleAdRevenueEvent;
        this.scope = scope;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMessageReceived$lambda$0(MaxAdRevenueListener maxAdRevenueListener, Bundle bundle) {
        return "Ad revenue subscribed event (raw): " + maxAdRevenueListener.bundleToTraceString(bundle);
    }

    public final void onMessageReceived(final Bundle messageData) {
        Intrinsics.checkNotNullParameter(messageData, "messageData");
        this.logger.trace(new Function0() { // from class: com.unity3d.ads.core.data.datasource.MaxAdRevenueListener$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onMessageReceived$lambda$0;
                onMessageReceived$lambda$0 = MaxAdRevenueListener.onMessageReceived$lambda$0(MaxAdRevenueListener.this, messageData);
                return onMessageReceived$lambda$0;
            }
        });
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new MaxAdRevenueListener$onMessageReceived$2(this, messageData, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0060 A[Catch: Exception -> 0x009b, TryCatch #0 {Exception -> 0x009b, blocks: (B:3:0x0009, B:5:0x0010, B:7:0x0049, B:9:0x0051, B:10:0x0058, B:12:0x0060, B:13:0x0067, B:15:0x006f, B:16:0x0076, B:18:0x007e, B:19:0x0085, B:28:0x0019, B:30:0x0023, B:32:0x0030, B:33:0x0036), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f A[Catch: Exception -> 0x009b, TryCatch #0 {Exception -> 0x009b, blocks: (B:3:0x0009, B:5:0x0010, B:7:0x0049, B:9:0x0051, B:10:0x0058, B:12:0x0060, B:13:0x0067, B:15:0x006f, B:16:0x0076, B:18:0x007e, B:19:0x0085, B:28:0x0019, B:30:0x0023, B:32:0x0030, B:33:0x0036), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e A[Catch: Exception -> 0x009b, TryCatch #0 {Exception -> 0x009b, blocks: (B:3:0x0009, B:5:0x0010, B:7:0x0049, B:9:0x0051, B:10:0x0058, B:12:0x0060, B:13:0x0067, B:15:0x006f, B:16:0x0076, B:18:0x007e, B:19:0x0085, B:28:0x0019, B:30:0x0023, B:32:0x0030, B:33:0x0036), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051 A[Catch: Exception -> 0x009b, TryCatch #0 {Exception -> 0x009b, blocks: (B:3:0x0009, B:5:0x0010, B:7:0x0049, B:9:0x0051, B:10:0x0058, B:12:0x0060, B:13:0x0067, B:15:0x006f, B:16:0x0076, B:18:0x007e, B:19:0x0085, B:28:0x0019, B:30:0x0023, B:32:0x0030, B:33:0x0036), top: B:2:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AdRevenueData parseRevenueBundle(Bundle bundle) {
        Double valueOf;
        try {
            if (bundle.containsKey("revenue")) {
                double d = bundle.getDouble("revenue");
                if (d >= 0.0d && Math.abs(d) <= Double.MAX_VALUE) {
                    valueOf = Double.valueOf(d);
                    String string = bundle.getString(KEY_COUNTRY_CODE);
                    String validateString = string == null ? validateString(string) : null;
                    String string2 = bundle.getString(KEY_NETWORK_NAME);
                    String validateString2 = string2 == null ? validateString(string2) : null;
                    String string3 = bundle.getString(KEY_MAX_AD_UNIT_ID);
                    String validateString3 = string3 == null ? validateString(string3) : null;
                    String string4 = bundle.getString(KEY_THIRD_PARTY_AD_PLACEMENT_ID);
                    return new AdRevenueData(null, valueOf, validateString, validateString2, validateString3, string4 == null ? validateString(string4) : null, parseMaxAdFormatString(bundle.getString("ad_format")), 1, null);
                }
                Logger.DefaultImpls.trace$default(this.logger, "Invalid or missing revenue in revenue event: " + d, null, 2, null);
            } else {
                Logger.DefaultImpls.trace$default(this.logger, "Missing revenue key in revenue event", null, 2, null);
            }
            valueOf = null;
            String string5 = bundle.getString(KEY_COUNTRY_CODE);
            if (string5 == null) {
            }
            String string22 = bundle.getString(KEY_NETWORK_NAME);
            if (string22 == null) {
            }
            String string32 = bundle.getString(KEY_MAX_AD_UNIT_ID);
            if (string32 == null) {
            }
            String string42 = bundle.getString(KEY_THIRD_PARTY_AD_PLACEMENT_ID);
            return new AdRevenueData(null, valueOf, validateString, validateString2, validateString3, string42 == null ? validateString(string42) : null, parseMaxAdFormatString(bundle.getString("ad_format")), 1, null);
        } catch (Exception e) {
            this.logger.trace("Failed to parse revenue Bundle", e);
            return null;
        }
    }

    private final String bundleToTraceString(final Bundle bundle) {
        try {
            if (bundle.isEmpty()) {
                return JsonUtils.EMPTY_JSON;
            }
            Set<String> keySet = bundle.keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "keySet(...)");
            return CollectionsKt.joinToString$default(keySet, null, "{", "}", 0, null, new Function1() { // from class: com.unity3d.ads.core.data.datasource.MaxAdRevenueListener$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CharSequence bundleToTraceString$lambda$1;
                    bundleToTraceString$lambda$1 = MaxAdRevenueListener.bundleToTraceString$lambda$1(bundle, (String) obj);
                    return bundleToTraceString$lambda$1;
                }
            }, 25, null);
        } catch (Throwable unused) {
            return "<error serializing bundle>";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence bundleToTraceString$lambda$1(Bundle bundle, String str) {
        String obj;
        try {
            Object obj2 = bundle.get(str);
            if (obj2 == null) {
                obj = "null";
            } else if (obj2 instanceof String) {
                obj = (((String) obj2).length() <= 500 ? new StringBuilder("\"").append((String) obj2).append('\"') : new StringBuilder("\"").append(StringsKt.take((String) obj2, 500)).append("...\"")).toString();
            } else {
                obj = obj2.toString();
            }
            return str + C4761z5.U + obj;
        } catch (Throwable unused) {
            return str + "=<error>";
        }
    }

    private final String validateString(String str) {
        if (StringsKt.isBlank(str) || str.length() > 500) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r0.equals("REWARDED_INTERSTITIAL") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return com.unity3d.ads.core.data.model.AdRevenueAdFormat.REWARDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r0.equals("REWARDED_INTER") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r0.equals("REWARDED") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r0.equals("INTER") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return com.unity3d.ads.core.data.model.AdRevenueAdFormat.INTERSTITIAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (r0.equals("INTERSTITIAL") == false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AdRevenueAdFormat parseMaxAdFormatString(String formatStr) {
        String str = formatStr;
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        String upperCase = formatStr.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        switch (upperCase.hashCode()) {
            case -1999289321:
                if (upperCase.equals("NATIVE")) {
                    return AdRevenueAdFormat.NATIVE;
                }
                return AdRevenueAdFormat.INSTANCE.fromString(formatStr);
            case -1372958932:
                break;
            case 2374915:
                if (upperCase.equals("MREC")) {
                    return AdRevenueAdFormat.MREC;
                }
                return AdRevenueAdFormat.INSTANCE.fromString(formatStr);
            case 69823676:
                break;
            case 543046670:
                break;
            case 1654540619:
                break;
            case 1854800829:
                break;
            case 1951953708:
                if (upperCase.equals(j.f8411a)) {
                    return AdRevenueAdFormat.BANNER;
                }
                return AdRevenueAdFormat.INSTANCE.fromString(formatStr);
            default:
                return AdRevenueAdFormat.INSTANCE.fromString(formatStr);
        }
    }
}
