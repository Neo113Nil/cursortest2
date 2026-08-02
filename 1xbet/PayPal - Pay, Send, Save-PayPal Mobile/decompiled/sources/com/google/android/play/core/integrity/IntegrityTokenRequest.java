package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
public abstract class IntegrityTokenRequest {

    public static abstract class Builder {
        public abstract com.google.android.play.core.integrity.IntegrityTokenRequest build();

        public abstract com.google.android.play.core.integrity.IntegrityTokenRequest.Builder setCloudProjectNumber(long j);

        public abstract com.google.android.play.core.integrity.IntegrityTokenRequest.Builder setNonce(java.lang.String str);
    }

    public abstract java.lang.Long cloudProjectNumber();

    public abstract java.lang.String nonce();

    public static com.google.android.play.core.integrity.IntegrityTokenRequest.Builder builder() {
        return new com.google.android.play.core.integrity.am();
    }
}
