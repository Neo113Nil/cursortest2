package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.C0877t;
import com.google.android.gms.common.util.Strings;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class FirebaseOptions {
    private static final String API_KEY_RESOURCE_NAME = "google_api_key";
    private static final String APP_ID_RESOURCE_NAME = "google_app_id";
    private static final String DATABASE_URL_RESOURCE_NAME = "firebase_database_url";
    private static final String GA_TRACKING_ID_RESOURCE_NAME = "ga_trackingId";
    private static final String GCM_SENDER_ID_RESOURCE_NAME = "gcm_defaultSenderId";
    private static final String PROJECT_ID_RESOURCE_NAME = "project_id";
    private static final String STORAGE_BUCKET_RESOURCE_NAME = "google_storage_bucket";
    private final String apiKey;
    private final String applicationId;
    private final String databaseUrl;
    private final String gaTrackingId;
    private final String gcmSenderId;
    private final String projectId;
    private final String storageBucket;

    public static final class Builder {
        private String apiKey;
        private String applicationId;
        private String databaseUrl;
        private String gaTrackingId;
        private String gcmSenderId;
        private String projectId;
        private String storageBucket;

        public Builder() {
        }

        @NonNull
        public FirebaseOptions build() {
            return new FirebaseOptions(this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.projectId);
        }

        @NonNull
        public Builder setApiKey(@NonNull String str) {
            C0875q.e(str, "ApiKey must be set.");
            this.apiKey = str;
            return this;
        }

        @NonNull
        public Builder setApplicationId(@NonNull String str) {
            C0875q.e(str, "ApplicationId must be set.");
            this.applicationId = str;
            return this;
        }

        @NonNull
        public Builder setDatabaseUrl(@Nullable String str) {
            this.databaseUrl = str;
            return this;
        }

        @NonNull
        public Builder setGaTrackingId(@Nullable String str) {
            this.gaTrackingId = str;
            return this;
        }

        @NonNull
        public Builder setGcmSenderId(@Nullable String str) {
            this.gcmSenderId = str;
            return this;
        }

        @NonNull
        public Builder setProjectId(@Nullable String str) {
            this.projectId = str;
            return this;
        }

        @NonNull
        public Builder setStorageBucket(@Nullable String str) {
            this.storageBucket = str;
            return this;
        }

        public Builder(@NonNull FirebaseOptions firebaseOptions) {
            this.applicationId = firebaseOptions.applicationId;
            this.apiKey = firebaseOptions.apiKey;
            this.databaseUrl = firebaseOptions.databaseUrl;
            this.gaTrackingId = firebaseOptions.gaTrackingId;
            this.gcmSenderId = firebaseOptions.gcmSenderId;
            this.storageBucket = firebaseOptions.storageBucket;
            this.projectId = firebaseOptions.projectId;
        }
    }

    @Nullable
    public static FirebaseOptions fromResource(@NonNull Context context) {
        C0877t c0877t = new C0877t(context);
        String a = c0877t.a(APP_ID_RESOURCE_NAME);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new FirebaseOptions(a, c0877t.a(API_KEY_RESOURCE_NAME), c0877t.a(DATABASE_URL_RESOURCE_NAME), c0877t.a(GA_TRACKING_ID_RESOURCE_NAME), c0877t.a(GCM_SENDER_ID_RESOURCE_NAME), c0877t.a(STORAGE_BUCKET_RESOURCE_NAME), c0877t.a(PROJECT_ID_RESOURCE_NAME));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseOptions)) {
            return false;
        }
        FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
        return C0874p.a(this.applicationId, firebaseOptions.applicationId) && C0874p.a(this.apiKey, firebaseOptions.apiKey) && C0874p.a(this.databaseUrl, firebaseOptions.databaseUrl) && C0874p.a(this.gaTrackingId, firebaseOptions.gaTrackingId) && C0874p.a(this.gcmSenderId, firebaseOptions.gcmSenderId) && C0874p.a(this.storageBucket, firebaseOptions.storageBucket) && C0874p.a(this.projectId, firebaseOptions.projectId);
    }

    @NonNull
    public String getApiKey() {
        return this.apiKey;
    }

    @NonNull
    public String getApplicationId() {
        return this.applicationId;
    }

    @Nullable
    public String getDatabaseUrl() {
        return this.databaseUrl;
    }

    @Nullable
    public String getGaTrackingId() {
        return this.gaTrackingId;
    }

    @Nullable
    public String getGcmSenderId() {
        return this.gcmSenderId;
    }

    @Nullable
    public String getProjectId() {
        return this.projectId;
    }

    @Nullable
    public String getStorageBucket() {
        return this.storageBucket;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.projectId});
    }

    public String toString() {
        C0874p.a aVar = new C0874p.a(this);
        aVar.a(this.applicationId, "applicationId");
        aVar.a(this.apiKey, "apiKey");
        aVar.a(this.databaseUrl, "databaseUrl");
        aVar.a(this.gcmSenderId, "gcmSenderId");
        aVar.a(this.storageBucket, "storageBucket");
        aVar.a(this.projectId, "projectId");
        return aVar.toString();
    }

    private FirebaseOptions(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        C0875q.i(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.applicationId = str;
        this.apiKey = str2;
        this.databaseUrl = str3;
        this.gaTrackingId = str4;
        this.gcmSenderId = str5;
        this.storageBucket = str6;
        this.projectId = str7;
    }
}
