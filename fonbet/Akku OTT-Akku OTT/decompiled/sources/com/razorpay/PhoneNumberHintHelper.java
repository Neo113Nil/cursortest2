package com.razorpay;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import androidx.core.app.ActivityCompat;
import androidx.media3.common.C0341z;
import com.google.android.gms.auth.api.identity.C0814h;
import com.google.android.gms.auth.api.identity.C0816j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/razorpay/PhoneNumberHintHelper;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "triggerPhoneNumberHintApi", "(Landroid/app/Activity;)V", "", "resultCode", "Landroid/content/Intent;", "data", "Lcom/razorpay/PhoneNumberHintHelper$PhoneNumberResponse;", "onActivityResultReceived", "(Landroid/app/Activity;ILandroid/content/Intent;)Lcom/razorpay/PhoneNumberHintHelper$PhoneNumberResponse;", "Lcom/google/android/gms/auth/api/identity/h;", "request", "Lcom/google/android/gms/auth/api/identity/h;", "getRequest", "()Lcom/google/android/gms/auth/api/identity/h;", "PhoneNumberHintResponseStates", "PhoneNumberResponse", "checkout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* renamed from: com.razorpay.o_$O$0$$, reason: from Kotlin metadata */
/* loaded from: classes4.dex */
public final class PhoneNumberHintHelper {
    public static final PhoneNumberHintHelper INSTANCE = new PhoneNumberHintHelper();
    private static final C0814h request;

    static {
        C0814h c0814h = new C0814h(0);
        Intrinsics.checkNotNullExpressionValue(c0814h, "builder().build()");
        request = c0814h;
    }

    private PhoneNumberHintHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: triggerPhoneNumberHintApi$lambda-0, reason: not valid java name */
    public static final void m1709triggerPhoneNumberHintApi$lambda0(Activity activity, PendingIntent result) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            AnalyticsUtil.trackEvent(AnalyticsEvent.PHONE_NUMBER_HINT_INTENT_LAUNCHED);
            ActivityCompat.startIntentSenderForResult(activity, result.getIntentSender(), 102, null, 0, 0, 0, null);
        } catch (Exception unused) {
            AnalyticsUtil.trackEvent(AnalyticsEvent.PHONE_NUMBER_HINT_INTENT_LAUNCH_FAILED);
            Logger.e("Launching the PendingIntent failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: triggerPhoneNumberHintApi$lambda-1, reason: not valid java name */
    public static final void m1710triggerPhoneNumberHintApi$lambda1(Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AnalyticsUtil.trackEvent(AnalyticsEvent.PHONE_NUMBER_HINT_INTENT_LAUNCH_FAILED);
        Logger.e("Phone Number Hint failed");
    }

    public final C0814h getRequest() {
        return request;
    }

    public final o_$O$0$$$_$O0_o onActivityResultReceived(Activity activity, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (i != -1 || intent == null) {
            return new o_$O$0$$$_$O0_o(o_$O$0$$$O$$$__o0Oo.USER_DECLINED, null, "User declined the request");
        }
        try {
            String phoneNumberFromIntent = C0816j.a(activity).getPhoneNumberFromIntent(intent);
            Intrinsics.checkNotNullExpressionValue(phoneNumberFromIntent, "getSignInClient(activity…oneNumberFromIntent(data)");
            Logger.d("Selected Phone Number: " + phoneNumberFromIntent);
            return !StringsKt.isBlank(phoneNumberFromIntent) ? new o_$O$0$$$_$O0_o(o_$O$0$$$O$$$__o0Oo.SUCCESS, phoneNumberFromIntent, null) : new o_$O$0$$$_$O0_o(o_$O$0$$$O$$$__o0Oo.FAILED_TO_FETCH_NUMBER, null, "Unable to fetch contact details.");
        } catch (com.google.android.gms.common.api.b e) {
            o_$O$0$$$O$$$__o0Oo o__o_0___o_____o0oo = o_$O$0$$$O$$$__o0Oo.FAILED;
            String message = e.getMessage();
            if (message == null) {
                message = "Something went wrong.";
            }
            return new o_$O$0$$$_$O0_o(o__o_0___o_____o0oo, null, message);
        }
    }

    public final void triggerPhoneNumberHintApi(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C0816j.a(activity).getPhoneNumberHintIntent(request).addOnSuccessListener(new C0341z(activity, 2)).addOnFailureListener(new androidx.media3.common.audio.m());
    }
}
