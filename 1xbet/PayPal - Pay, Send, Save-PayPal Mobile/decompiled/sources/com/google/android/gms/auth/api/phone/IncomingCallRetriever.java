package com.google.android.gms.auth.api.phone;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e"}, d2 = {"Lcom/google/android/gms/auth/api/phone/IncomingCallRetriever;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/google/android/gms/auth/api/phone/IncomingCallRetrieverClient;", "getClient", "(Landroid/content/Context;)Lcom/google/android/gms/auth/api/phone/IncomingCallRetrieverClient;", "Landroid/app/Activity;", "activity", "(Landroid/app/Activity;)Lcom/google/android/gms/auth/api/phone/IncomingCallRetrieverClient;", "", "PHONE_VERIFICATION_STATUS_INTENT_ACTION", "Ljava/lang/String;", com.google.android.gms.auth.api.phone.IncomingCallRetriever.PHONE_VERIFICATION_STATUS_INTENT_EXTRA, "SEND_PERMISSION", "ACTIVITY_RESULT_INTENT_EXTRA_MESSAGE", "ACTIVITY_RESULT_INTENT_EXTRA_STATUS_CODE"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IncomingCallRetriever {
    public static final java.lang.String ACTIVITY_RESULT_INTENT_EXTRA_MESSAGE = "MESSAGE";
    public static final java.lang.String ACTIVITY_RESULT_INTENT_EXTRA_STATUS_CODE = "STATUS_CODE";
    public static final com.google.android.gms.auth.api.phone.IncomingCallRetriever INSTANCE = new com.google.android.gms.auth.api.phone.IncomingCallRetriever();
    public static final java.lang.String PHONE_VERIFICATION_STATUS_INTENT_ACTION = "com.google.android.gms.auth.api.phone.PHONE_VERIFICATION_STATUS_INTENT_ACTION";
    public static final java.lang.String PHONE_VERIFICATION_STATUS_INTENT_EXTRA = "PHONE_VERIFICATION_STATUS_INTENT_EXTRA";
    public static final java.lang.String SEND_PERMISSION = "com.google.android.gms.auth.api.phone.permission.SEND";

    @kotlin.jvm.JvmStatic
    public static final com.google.android.gms.auth.api.phone.IncomingCallRetrieverClient getClient(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        return new com.google.android.gms.internal.p001authapiphone.zzr(activity, null, 2, null);
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.android.gms.auth.api.phone.IncomingCallRetrieverClient getClient(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.google.android.gms.internal.p001authapiphone.zzr(context, null, 2, null);
    }

    private IncomingCallRetriever() {
    }
}
