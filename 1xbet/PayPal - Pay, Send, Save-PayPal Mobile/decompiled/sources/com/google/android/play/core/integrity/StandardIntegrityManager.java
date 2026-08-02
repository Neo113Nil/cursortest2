package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
public interface StandardIntegrityManager {

    public static abstract class PrepareIntegrityTokenRequest {

        public static abstract class Builder {
            public abstract com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest build();

            public abstract com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j);
        }

        public static com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder builder() {
            com.google.android.play.core.integrity.c cVar = new com.google.android.play.core.integrity.c();
            cVar.a(0);
            return cVar;
        }

        abstract int a();

        public abstract long b();
    }

    public static abstract class StandardIntegrityToken {
        public abstract com.google.android.gms.tasks.Task<java.lang.Integer> showDialog(android.app.Activity activity, int i);

        public abstract java.lang.String token();
    }

    public interface StandardIntegrityTokenProvider {
        com.google.android.gms.tasks.Task<com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken> request(com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest);
    }

    public static abstract class StandardIntegrityTokenRequest {

        public static abstract class Builder {
            public abstract com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest build();

            public abstract com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setRequestHash(java.lang.String str);

            public abstract com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setVerdictOptOut(java.util.Set<java.lang.Integer> set);
        }

        public static com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder builder() {
            com.google.android.play.core.integrity.f fVar = new com.google.android.play.core.integrity.f();
            fVar.setVerdictOptOut(com.google.android.play.integrity.internal.as.h());
            return fVar;
        }

        public abstract java.lang.String requestHash();

        public abstract java.util.Set<java.lang.Integer> verdictOptOut();
    }

    com.google.android.gms.tasks.Task<com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest);
}
