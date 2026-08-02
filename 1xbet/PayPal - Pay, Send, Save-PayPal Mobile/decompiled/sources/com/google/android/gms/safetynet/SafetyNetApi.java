package com.google.android.gms.safetynet;

/* loaded from: classes8.dex */
public interface SafetyNetApi {

    public static class AttestationResponse extends com.google.android.gms.common.api.Response<com.google.android.gms.safetynet.SafetyNetApi.AttestationResult> {
        public java.lang.String getJwsResult() {
            return getResult().getJwsResult();
        }
    }

    @java.lang.Deprecated
    public interface AttestationResult extends com.google.android.gms.common.api.Result {
        java.lang.String getJwsResult();
    }

    public static class HarmfulAppsResponse extends com.google.android.gms.common.api.Response<com.google.android.gms.safetynet.SafetyNetApi.HarmfulAppsResult> {
        public java.util.List<com.google.android.gms.safetynet.HarmfulAppsData> getHarmfulAppsList() {
            return getResult().getHarmfulAppsList();
        }

        public int getHoursSinceLastScanWithHarmfulApp() {
            return getResult().getHoursSinceLastScanWithHarmfulApp();
        }

        public long getLastScanTimeMs() {
            return getResult().getLastScanTimeMs();
        }
    }

    @java.lang.Deprecated
    public interface HarmfulAppsResult extends com.google.android.gms.common.api.Result {
        java.util.List<com.google.android.gms.safetynet.HarmfulAppsData> getHarmfulAppsList();

        int getHoursSinceLastScanWithHarmfulApp();

        long getLastScanTimeMs();
    }

    public static class RecaptchaTokenResponse extends com.google.android.gms.common.api.Response<com.google.android.gms.safetynet.SafetyNetApi.RecaptchaTokenResult> {
        public java.lang.String getTokenResult() {
            return getResult().getTokenResult();
        }
    }

    @java.lang.Deprecated
    public interface RecaptchaTokenResult extends com.google.android.gms.common.api.Result {
        java.lang.String getTokenResult();
    }

    public static class SafeBrowsingResponse extends com.google.android.gms.common.api.Response<com.google.android.gms.safetynet.SafetyNetApi.SafeBrowsingResult> {
        public java.util.List<com.google.android.gms.safetynet.SafeBrowsingThreat> getDetectedThreats() {
            return getResult().getDetectedThreats();
        }

        public long getLastUpdateTimeMs() {
            return getResult().getLastUpdateTimeMs();
        }

        public java.lang.String getMetadata() {
            return getResult().getMetadata();
        }

        public byte[] getState() {
            return getResult().getState();
        }
    }

    @java.lang.Deprecated
    public interface SafeBrowsingResult extends com.google.android.gms.common.api.Result {
        java.util.List<com.google.android.gms.safetynet.SafeBrowsingThreat> getDetectedThreats();

        long getLastUpdateTimeMs();

        java.lang.String getMetadata();

        byte[] getState();
    }

    public static class VerifyAppsUserResponse extends com.google.android.gms.common.api.Response<com.google.android.gms.safetynet.SafetyNetApi.VerifyAppsUserResult> {
        public boolean isVerifyAppsEnabled() {
            return getResult().isVerifyAppsEnabled();
        }
    }

    @java.lang.Deprecated
    public interface VerifyAppsUserResult extends com.google.android.gms.common.api.Result {
        boolean isVerifyAppsEnabled();
    }

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.safetynet.SafetyNetApi.AttestationResult> attest(com.google.android.gms.common.api.GoogleApiClient googleApiClient, byte[] bArr);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.safetynet.SafetyNetApi.VerifyAppsUserResult> enableVerifyApps(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.safetynet.SafetyNetApi.VerifyAppsUserResult> isVerifyAppsEnabled(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    @java.lang.Deprecated
    boolean isVerifyAppsEnabled(android.content.Context context);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.safetynet.SafetyNetApi.HarmfulAppsResult> listHarmfulApps(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.safetynet.SafetyNetApi.SafeBrowsingResult> lookupUri(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, java.lang.String str2, int... iArr);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.safetynet.SafetyNetApi.SafeBrowsingResult> lookupUri(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.util.List<java.lang.Integer> list, java.lang.String str);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.safetynet.SafetyNetApi.RecaptchaTokenResult> verifyWithRecaptcha(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str);
}
