package org.betup.services.analytics;

import android.content.Context;
import android.os.Build;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserInfo;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.sentry.protocol.App;
import io.sentry.protocol.Device;
import io.sentry.protocol.Response;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.betup.BuildConfig;
import org.json.JSONObject;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: AuthDiagnosticLogger.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007J7\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0005H\u0007J\n\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0007J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lorg/betup/services/analytics/AuthDiagnosticLogger;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "MAX_REASON_LENGTH", "", "MAX_TIMELINE_ENTRIES", "recentEntries", "Ljava/util/ArrayDeque;", "", "logAuthStage", "", "context", "Landroid/content/Context;", IronSourceConstants.EVENTS_PROVIDER, X3.i.q, "outcome", "detail", "logAuthFailure", "reason", "statusCode", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getRecentEntries", "maxChars", "getCurrentFirebaseUserId", "appendEntry", "entry", "Lorg/json/JSONObject;", "enrichEntry", "sanitize", "timestampFormatter", "Ljava/text/SimpleDateFormat;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthDiagnosticLogger {
    private static final int MAX_REASON_LENGTH = 500;
    private static final int MAX_TIMELINE_ENTRIES = 40;
    public static final AuthDiagnosticLogger INSTANCE = new AuthDiagnosticLogger();
    private static final ArrayDeque<String> recentEntries = new ArrayDeque<>(40);
    public static final int $stable = 8;

    private AuthDiagnosticLogger() {
    }

    @JvmStatic
    public static final void logAuthStage(Context context, String provider, String stage, String outcome, String detail) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(stage, "stage");
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        Intrinsics.checkNotNullParameter(detail, "detail");
        AuthDiagnosticLogger authDiagnosticLogger = INSTANCE;
        JSONObject put = new JSONObject().put("event", "auth_stage").put(IronSourceConstants.EVENTS_PROVIDER, provider).put(X3.i.q, stage).put("outcome", authDiagnosticLogger.sanitize(outcome)).put("detail", authDiagnosticLogger.sanitize(detail));
        Intrinsics.checkNotNullExpressionValue(put, "put(...)");
        authDiagnosticLogger.appendEntry(context, put);
    }

    @JvmStatic
    public static final void logAuthFailure(Context context, String provider, String stage, String reason, Integer statusCode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(stage, "stage");
        Intrinsics.checkNotNullParameter(reason, "reason");
        JSONObject put = new JSONObject().put("event", "auth_failure").put(IronSourceConstants.EVENTS_PROVIDER, provider).put(X3.i.q, stage);
        AuthDiagnosticLogger authDiagnosticLogger = INSTANCE;
        JSONObject put2 = put.put("reason", authDiagnosticLogger.sanitize(reason));
        if (statusCode != null) {
            put2.put(Response.JsonKeys.STATUS_CODE, statusCode.intValue());
        }
        Intrinsics.checkNotNull(put2);
        authDiagnosticLogger.appendEntry(context, put2);
    }

    @JvmStatic
    public static final String getRecentEntries(int maxChars) {
        String joinToString$default;
        ArrayDeque<String> arrayDeque = recentEntries;
        synchronized (arrayDeque) {
            joinToString$default = CollectionsKt.joinToString$default(arrayDeque, "\n", null, null, 0, null, null, 62, null);
            if (joinToString$default.length() > maxChars) {
                joinToString$default = StringsKt.takeLast(joinToString$default, maxChars);
            }
        }
        return joinToString$default;
    }

    @JvmStatic
    public static final String getCurrentFirebaseUserId() {
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        if (currentUser != null) {
            return currentUser.getUid();
        }
        return null;
    }

    private final synchronized void appendEntry(Context context, JSONObject entry) {
        try {
            Result.Companion companion = Result.INSTANCE;
            AuthDiagnosticLogger authDiagnosticLogger = this;
            String jSONObject = enrichEntry(context, entry).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            ArrayDeque<String> arrayDeque = recentEntries;
            synchronized (arrayDeque) {
                if (arrayDeque.size() >= 40) {
                    arrayDeque.removeFirst();
                }
                arrayDeque.addLast(jSONObject);
                Unit unit = Unit.INSTANCE;
            }
            Result.m10853constructorimpl(Unit.INSTANCE);
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00da, code lost:
    
        if (r11 != null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final JSONObject enrichEntry(Context context, JSONObject entry) {
        Object obj;
        String str;
        List<? extends UserInfo> providerData;
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        JSONObject put = entry.put("timestamp_ms", System.currentTimeMillis()).put("timestamp_iso", timestampFormatter().format(new Date())).put("app_version_name", BuildConfig.VERSION_NAME).put("app_version_code", BuildConfig.VERSION_CODE).put(App.JsonKeys.BUILD_TYPE, "release").put("package_name", context.getPackageName()).put(Device.JsonKeys.MANUFACTURER, Build.MANUFACTURER).put(Device.JsonKeys.BRAND, Build.BRAND).put("model", Build.MODEL).put("sdk_int", Build.VERSION.SDK_INT);
        if (currentUser == null || (obj = currentUser.getUid()) == null) {
            obj = JSONObject.NULL;
        }
        JSONObject put2 = put.put("firebase_uid", obj).put("firebase_is_anonymous", currentUser != null ? Boolean.valueOf(currentUser.isAnonymous()) : JSONObject.NULL);
        if (currentUser != null && (providerData = currentUser.getProviderData()) != null) {
            ArrayList arrayList = new ArrayList();
            for (UserInfo userInfo : providerData) {
                String providerId = userInfo != null ? userInfo.getProviderId() : null;
                if (providerId != null) {
                    arrayList.add(providerId);
                }
            }
            List distinct = CollectionsKt.distinct(arrayList);
            if (distinct != null) {
                str = CollectionsKt.joinToString$default(distinct, ",", null, null, 0, null, null, 62, null);
            }
        }
        str = "";
        JSONObject put3 = put2.put("firebase_provider_ids", str);
        Intrinsics.checkNotNullExpressionValue(put3, "put(...)");
        return put3;
    }

    private final String sanitize(String detail) {
        return StringsKt.take(StringsKt.trim((CharSequence) new Regex("\\s+").replace(detail, " ")).toString(), 500);
    }

    private final SimpleDateFormat timestampFormatter() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
    }
}
