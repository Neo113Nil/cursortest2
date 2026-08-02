package com.google.android.gms.auth.api.phone;

/* loaded from: classes8.dex */
public interface SmsCodeAutofillClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface PermissionState {
        public static final int DENIED = 2;
        public static final int GRANTED = 1;
        public static final int NONE = 0;
    }

    com.google.android.gms.tasks.Task<java.lang.Integer> checkPermissionState();

    com.google.android.gms.tasks.Task<java.lang.Boolean> hasOngoingSmsRequest(java.lang.String str);

    com.google.android.gms.tasks.Task<java.lang.Void> startSmsCodeRetriever();
}
