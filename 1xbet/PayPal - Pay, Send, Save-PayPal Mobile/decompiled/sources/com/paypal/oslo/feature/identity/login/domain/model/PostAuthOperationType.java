package com.paypal.oslo.feature.identity.login.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/PostAuthOperationType;", "", "<init>", "(Ljava/lang/String;I)V", "USER_PREVIEW_BIND", "BIOMETRIC_DEVICE_AUTH_BIND", "BIOMETRIC_FINGERPRINT_BIND", "BIOMETRIC_FACE_ID_BIND", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PostAuthOperationType {
    public static final com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType BIOMETRIC_DEVICE_AUTH_BIND;
    public static final com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType BIOMETRIC_FACE_ID_BIND;
    public static final com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType BIOMETRIC_FINGERPRINT_BIND;
    public static final com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType UNKNOWN;
    public static final com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType USER_PREVIEW_BIND;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType[] getHighSpeedVideoSizes;

    private PostAuthOperationType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType postAuthOperationType = new com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType("USER_PREVIEW_BIND", 0);
        USER_PREVIEW_BIND = postAuthOperationType;
        com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType postAuthOperationType2 = new com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType("BIOMETRIC_DEVICE_AUTH_BIND", 1);
        BIOMETRIC_DEVICE_AUTH_BIND = postAuthOperationType2;
        com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType postAuthOperationType3 = new com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType("BIOMETRIC_FINGERPRINT_BIND", 2);
        BIOMETRIC_FINGERPRINT_BIND = postAuthOperationType3;
        com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType postAuthOperationType4 = new com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType("BIOMETRIC_FACE_ID_BIND", 3);
        BIOMETRIC_FACE_ID_BIND = postAuthOperationType4;
        com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType postAuthOperationType5 = new com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType("UNKNOWN", 4);
        UNKNOWN = postAuthOperationType5;
        com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType[] postAuthOperationTypeArr = {postAuthOperationType, postAuthOperationType2, postAuthOperationType3, postAuthOperationType4, postAuthOperationType5};
        getHighSpeedVideoSizes = postAuthOperationTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(postAuthOperationTypeArr);
    }

    public static com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType[] values() {
        return (com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
