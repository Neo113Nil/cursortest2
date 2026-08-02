package com.google.android.gms.auth.api.phone;

/* loaded from: classes8.dex */
public final class SmsCodeRetriever {
    public static final java.lang.String EXTRA_SMS_CODE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE";
    public static final java.lang.String EXTRA_SMS_CODE_LINE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE_LINE";
    public static final java.lang.String EXTRA_STATUS = "com.google.android.gms.auth.api.phone.EXTRA_STATUS";
    public static final java.lang.String SMS_CODE_RETRIEVED_ACTION = "com.google.android.gms.auth.api.phone.SMS_CODE_RETRIEVED";

    public static com.google.android.gms.auth.api.phone.SmsCodeAutofillClient getAutofillClient(android.app.Activity activity) {
        return new com.google.android.gms.internal.p001authapiphone.zzab(activity);
    }

    public static com.google.android.gms.auth.api.phone.SmsCodeBrowserClient getBrowserClient(android.app.Activity activity) {
        return new com.google.android.gms.internal.p001authapiphone.zzaf(activity);
    }

    public static com.google.android.gms.auth.api.phone.SmsCodeAutofillClient getAutofillClient(android.content.Context context) {
        return new com.google.android.gms.internal.p001authapiphone.zzab(context);
    }

    public static com.google.android.gms.auth.api.phone.SmsCodeBrowserClient getBrowserClient(android.content.Context context) {
        return new com.google.android.gms.internal.p001authapiphone.zzaf(context);
    }

    private SmsCodeRetriever() {
    }
}
