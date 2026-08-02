package org.betup.services.ads;

import android.app.Activity;
import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: AdMobDiagnostics.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0002J$\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0007J\"\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0007J\"\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u0007J6\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lorg/betup/services/ads/AdMobDiagnostics;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "useProductionAdUnits", "", "configureDebugTestDevices", "", "activity", "Landroid/app/Activity;", "computeAdMobTestDeviceHash", "context", "Landroid/content/Context;", "logRequest", "format", "adUnitId", "placement", "logLoaded", "mediationAdapter", "logFailed", "message", TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "responseInfo", "Lcom/google/android/libraries/ads/mobile/sdk/common/ResponseInfo;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdMobDiagnostics {
    public static final int $stable = 0;
    public static final AdMobDiagnostics INSTANCE = new AdMobDiagnostics();
    private static final String TAG = "AdMobDiagnostics";

    @JvmStatic
    public static final void configureDebugTestDevices(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @JvmStatic
    public static final void logFailed(String format, String adUnitId, Object code, String message, ResponseInfo responseInfo) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }

    @JvmStatic
    public static final void logFailed(String format, String adUnitId, String message) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }

    @JvmStatic
    public static final void logLoaded(String format, String adUnitId, String mediationAdapter) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }

    @JvmStatic
    public static final void logRequest(String format, String adUnitId, String placement) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }

    @JvmStatic
    public static final boolean useProductionAdUnits() {
        return true;
    }

    private AdMobDiagnostics() {
    }

    private final String computeAdMobTestDeviceHash(Context context) {
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            String str = string;
            if (str != null && !StringsKt.isBlank(str)) {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] bytes = string.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                byte[] digest = messageDigest.digest(bytes);
                Intrinsics.checkNotNull(digest);
                return ArraysKt.joinToString$default(digest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: org.betup.services.ads.AdMobDiagnostics$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        CharSequence computeAdMobTestDeviceHash$lambda$1;
                        computeAdMobTestDeviceHash$lambda$1 = AdMobDiagnostics.computeAdMobTestDeviceHash$lambda$1(((Byte) obj).byteValue());
                        return computeAdMobTestDeviceHash$lambda$1;
                    }
                }, 30, (Object) null);
            }
            return null;
        } catch (Exception e) {
            Log.w(TAG, "Failed to compute AdMob test device hash", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence computeAdMobTestDeviceHash$lambda$1(byte b) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static /* synthetic */ void logRequest$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        logRequest(str, str2, str3);
    }
}
