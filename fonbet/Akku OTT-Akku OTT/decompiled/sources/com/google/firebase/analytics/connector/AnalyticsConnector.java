package com.google.firebase.analytics.connector;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.firebase.annotations.DeferredApi;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public interface AnalyticsConnector {

    public interface AnalyticsConnectorHandle {
        void registerEventNames(@NonNull Set<String> set);

        void unregister();

        void unregisterEventNames();
    }

    public interface AnalyticsConnectorListener {
        void onMessageTriggered(int i, @Nullable Bundle bundle);
    }

    public static class ConditionalUserProperty {
        public boolean active;
        public long creationTimestamp;

        @Nullable
        public String expiredEventName;

        @Nullable
        public Bundle expiredEventParams;

        @NonNull
        public String name;

        @NonNull
        public String origin;
        public long timeToLive;

        @Nullable
        public String timedOutEventName;

        @Nullable
        public Bundle timedOutEventParams;

        @Nullable
        public String triggerEventName;
        public long triggerTimeout;

        @Nullable
        public String triggeredEventName;

        @Nullable
        public Bundle triggeredEventParams;
        public long triggeredTimestamp;

        @Nullable
        public Object value;
    }

    void clearConditionalUserProperty(@NonNull @Size(max = 24, min = 1) String str, @Nullable String str2, @Nullable Bundle bundle);

    @NonNull
    @WorkerThread
    List<ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @Nullable @Size(max = 23, min = 1) String str2);

    @WorkerThread
    int getMaxUserProperties(@NonNull @Size(min = 1) String str);

    @NonNull
    @WorkerThread
    Map<String, Object> getUserProperties(boolean z);

    void logEvent(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle);

    @Nullable
    @DeferredApi
    AnalyticsConnectorHandle registerAnalyticsConnectorListener(@NonNull String str, @NonNull AnalyticsConnectorListener analyticsConnectorListener);

    void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty);

    void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull Object obj);
}
