package com.datadog.android.rum.internal.domain.scope;

@kotlin.Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:*\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001*23456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ["}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", "<init>", "()V", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "ActionDropped", "ActionSent", "AddCustomTiming", "AddError", "AddFeatureFlagEvaluation", "AddFeatureFlagEvaluations", "AddLongTask", "AddResourceTiming", "AddViewAttributes", "AddViewLoadingTime", "AppStartEvent", "AppStartTTFDEvent", "AppStartTTIDEvent", "ApplicationStarted", "ErrorDropped", "ErrorSent", "LongTaskDropped", "LongTaskSent", "RemoveViewAttributes", "ResetSession", "ResourceDropped", "ResourceSent", "SdkInit", "SendCustomActionNow", "SetInternalViewAttribute", "SetSyntheticsTestAttribute", "StartAction", "StartFeatureOperation", "StartResource", "StartView", "StopAction", "StopFeatureOperation", "StopResource", "StopResourceWithError", "StopResourceWithStackTrace", "StopSession", "StopView", "TelemetryEventWrapper", "UpdateExternalRefreshRate", "UpdatePerformanceMetric", "WaitForResourceTiming", "WebViewEvent", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ActionDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ActionSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddCustomTiming;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddError;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddFeatureFlagEvaluation;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddFeatureFlagEvaluations;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddLongTask;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddResourceTiming;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddViewAttributes;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddViewLoadingTime;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AppStartEvent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AppStartTTFDEvent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AppStartTTIDEvent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ApplicationStarted;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ErrorDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ErrorSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$LongTaskDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$LongTaskSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$RemoveViewAttributes;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResetSession;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResourceDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResourceSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SdkInit;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SendCustomActionNow;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SetInternalViewAttribute;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SetSyntheticsTestAttribute;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartAction;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartFeatureOperation;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartResource;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartView;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopAction;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopFeatureOperation;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResource;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResourceWithError;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResourceWithStackTrace;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopSession;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopView;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$TelemetryEventWrapper;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$UpdateExternalRefreshRate;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$UpdatePerformanceMetric;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$WaitForResourceTiming;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$WebViewEvent;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class RumRawEvent {
    public abstract com.datadog.android.rum.internal.domain.Time getEventTime();

    private RumRawEvent() {
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u001a\u0010\t\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\r"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartView;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;", "key", "", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;", "component2", "()Ljava/util/Map;", "component3", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartView;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getAttributes", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;", "getKey"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StartView extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final java.util.Map<java.lang.String, java.lang.Object> attributes;
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final com.datadog.android.rum.internal.domain.scope.RumScopeKey key;

        public final com.datadog.android.rum.internal.domain.scope.RumScopeKey getKey() {
            return this.key;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getAttributes() {
            return this.attributes;
        }

        public /* synthetic */ StartView(com.datadog.android.rum.internal.domain.scope.RumScopeKey rumScopeKey, java.util.Map map, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(rumScopeKey, map, (i & 4) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartView(com.datadog.android.rum.internal.domain.scope.RumScopeKey rumScopeKey, java.util.Map<java.lang.String, ? extends java.lang.Object> map, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumScopeKey, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.key = rumScopeKey;
            this.attributes = map;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            com.datadog.android.rum.internal.domain.scope.RumScopeKey rumScopeKey = this.key;
            java.util.Map<java.lang.String, java.lang.Object> map = this.attributes;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StartView(key=");
            sb.append(rumScopeKey);
            sb.append(", attributes=");
            sb.append(map);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.key.hashCode() * 31) + this.attributes.hashCode()) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartView)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartView startView = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartView) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.key, startView.key) && kotlin.jvm.internal.Intrinsics.areEqual(this.attributes, startView.attributes) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, startView.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartView copy(com.datadog.android.rum.internal.domain.scope.RumScopeKey key, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartView(key, attributes, eventTime);
        }

        /* renamed from: component3, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component2() {
            return this.attributes;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.internal.domain.scope.RumScopeKey getKey() {
            return this.key;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartView copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartView startView, com.datadog.android.rum.internal.domain.scope.RumScopeKey rumScopeKey, java.util.Map map, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                rumScopeKey = startView.key;
            }
            if ((i & 2) != 0) {
                map = startView.attributes;
            }
            if ((i & 4) != 0) {
                time = startView.eventTime;
            }
            return startView.copy(rumScopeKey, map, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u001a\u0010\t\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\r"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopView;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;", "key", "", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;", "component2", "()Ljava/util/Map;", "component3", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopView;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getAttributes", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;", "getKey"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StopView extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final java.util.Map<java.lang.String, java.lang.Object> attributes;
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final com.datadog.android.rum.internal.domain.scope.RumScopeKey key;

        public final com.datadog.android.rum.internal.domain.scope.RumScopeKey getKey() {
            return this.key;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getAttributes() {
            return this.attributes;
        }

        public /* synthetic */ StopView(com.datadog.android.rum.internal.domain.scope.RumScopeKey rumScopeKey, java.util.Map map, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(rumScopeKey, map, (i & 4) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopView(com.datadog.android.rum.internal.domain.scope.RumScopeKey rumScopeKey, java.util.Map<java.lang.String, ? extends java.lang.Object> map, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumScopeKey, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.key = rumScopeKey;
            this.attributes = map;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            com.datadog.android.rum.internal.domain.scope.RumScopeKey rumScopeKey = this.key;
            java.util.Map<java.lang.String, java.lang.Object> map = this.attributes;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StopView(key=");
            sb.append(rumScopeKey);
            sb.append(", attributes=");
            sb.append(map);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.key.hashCode() * 31) + this.attributes.hashCode()) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopView)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopView stopView = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopView) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.key, stopView.key) && kotlin.jvm.internal.Intrinsics.areEqual(this.attributes, stopView.attributes) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, stopView.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopView copy(com.datadog.android.rum.internal.domain.scope.RumScopeKey key, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopView(key, attributes, eventTime);
        }

        /* renamed from: component3, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component2() {
            return this.attributes;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.internal.domain.scope.RumScopeKey getKey() {
            return this.key;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopView copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopView stopView, com.datadog.android.rum.internal.domain.scope.RumScopeKey rumScopeKey, java.util.Map map, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                rumScopeKey = stopView.key;
            }
            if ((i & 2) != 0) {
                map = stopView.attributes;
            }
            if ((i & 4) != 0) {
                time = stopView.eventTime;
            }
            return stopView.copy(rumScopeKey, map, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t0\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JP\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u0012R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0007¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010\u0016R\u001a\u0010\f\u001a\u00020\u000b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0014"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartAction;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "Lcom/datadog/android/rum/RumActionType;", "type", "", "name", "", "waitForStop", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Lcom/datadog/android/rum/RumActionType;Ljava/lang/String;ZLjava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Lcom/datadog/android/rum/RumActionType;", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "()Ljava/util/Map;", "component5", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Lcom/datadog/android/rum/RumActionType;Ljava/lang/String;ZLjava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartAction;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/Map;", "getAttributes", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Ljava/lang/String;", "getName", "Lcom/datadog/android/rum/RumActionType;", "getType", "Z", "getWaitForStop"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StartAction extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final java.util.Map<java.lang.String, java.lang.Object> attributes;
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final java.lang.String name;
        private final com.datadog.android.rum.RumActionType type;
        private final boolean waitForStop;

        public final com.datadog.android.rum.RumActionType getType() {
            return this.type;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final boolean getWaitForStop() {
            return this.waitForStop;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getAttributes() {
            return this.attributes;
        }

        public /* synthetic */ StartAction(com.datadog.android.rum.RumActionType rumActionType, java.lang.String str, boolean z, java.util.Map map, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(rumActionType, str, z, map, (i & 16) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartAction(com.datadog.android.rum.RumActionType rumActionType, java.lang.String str, boolean z, java.util.Map<java.lang.String, ? extends java.lang.Object> map, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumActionType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.type = rumActionType;
            this.name = str;
            this.waitForStop = z;
            this.attributes = map;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            com.datadog.android.rum.RumActionType rumActionType = this.type;
            java.lang.String str = this.name;
            boolean z = this.waitForStop;
            java.util.Map<java.lang.String, java.lang.Object> map = this.attributes;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StartAction(type=");
            sb.append(rumActionType);
            sb.append(", name=");
            sb.append(str);
            sb.append(", waitForStop=");
            sb.append(z);
            sb.append(", attributes=");
            sb.append(map);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((this.type.hashCode() * 31) + this.name.hashCode()) * 31) + java.lang.Boolean.hashCode(this.waitForStop)) * 31) + this.attributes.hashCode()) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartAction)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartAction startAction = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartAction) other;
            return this.type == startAction.type && kotlin.jvm.internal.Intrinsics.areEqual(this.name, startAction.name) && this.waitForStop == startAction.waitForStop && kotlin.jvm.internal.Intrinsics.areEqual(this.attributes, startAction.attributes) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, startAction.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartAction copy(com.datadog.android.rum.RumActionType type, java.lang.String name2, boolean waitForStop, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartAction(type, name2, waitForStop, attributes, eventTime);
        }

        /* renamed from: component5, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component4() {
            return this.attributes;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getWaitForStop() {
            return this.waitForStop;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.RumActionType getType() {
            return this.type;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartAction copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartAction startAction, com.datadog.android.rum.RumActionType rumActionType, java.lang.String str, boolean z, java.util.Map map, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                rumActionType = startAction.type;
            }
            if ((i & 2) != 0) {
                str = startAction.name;
            }
            java.lang.String str2 = str;
            if ((i & 4) != 0) {
                z = startAction.waitForStop;
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                map = startAction.attributes;
            }
            java.util.Map map2 = map;
            if ((i & 16) != 0) {
                time = startAction.eventTime;
            }
            return startAction.copy(rumActionType, str2, z2, map2, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JJ\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0010R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0007¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000e"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopAction;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "Lcom/datadog/android/rum/RumActionType;", "type", "", "name", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Lcom/datadog/android/rum/RumActionType;Ljava/lang/String;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Lcom/datadog/android/rum/RumActionType;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/Map;", "component4", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Lcom/datadog/android/rum/RumActionType;Ljava/lang/String;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopAction;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/Map;", "getAttributes", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Ljava/lang/String;", "getName", "Lcom/datadog/android/rum/RumActionType;", "getType"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StopAction extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final java.util.Map<java.lang.String, java.lang.Object> attributes;
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final java.lang.String name;
        private final com.datadog.android.rum.RumActionType type;

        public final com.datadog.android.rum.RumActionType getType() {
            return this.type;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getAttributes() {
            return this.attributes;
        }

        public /* synthetic */ StopAction(com.datadog.android.rum.RumActionType rumActionType, java.lang.String str, java.util.Map map, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(rumActionType, str, map, (i & 8) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopAction(com.datadog.android.rum.RumActionType rumActionType, java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.type = rumActionType;
            this.name = str;
            this.attributes = map;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            com.datadog.android.rum.RumActionType rumActionType = this.type;
            java.lang.String str = this.name;
            java.util.Map<java.lang.String, java.lang.Object> map = this.attributes;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StopAction(type=");
            sb.append(rumActionType);
            sb.append(", name=");
            sb.append(str);
            sb.append(", attributes=");
            sb.append(map);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.datadog.android.rum.RumActionType rumActionType = this.type;
            int hashCode = rumActionType == null ? 0 : rumActionType.hashCode();
            java.lang.String str = this.name;
            return (((((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.attributes.hashCode()) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopAction)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopAction stopAction = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopAction) other;
            return this.type == stopAction.type && kotlin.jvm.internal.Intrinsics.areEqual(this.name, stopAction.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.attributes, stopAction.attributes) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, stopAction.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopAction copy(com.datadog.android.rum.RumActionType type, java.lang.String name2, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopAction(type, name2, attributes, eventTime);
        }

        /* renamed from: component4, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component3() {
            return this.attributes;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.RumActionType getType() {
            return this.type;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopAction copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopAction stopAction, com.datadog.android.rum.RumActionType rumActionType, java.lang.String str, java.util.Map map, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                rumActionType = stopAction.type;
            }
            if ((i & 2) != 0) {
                str = stopAction.name;
            }
            if ((i & 4) != 0) {
                map = stopAction.attributes;
            }
            if ((i & 8) != 0) {
                time = stopAction.eventTime;
            }
            return stopAction.copy(rumActionType, str, map, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JP\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u0011R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartResource;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", "key", "", "url", "Lcom/datadog/android/rum/RumResourceMethod;", "method", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Lcom/datadog/android/rum/RumResourceMethod;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/datadog/android/rum/RumResourceMethod;", "component4", "()Ljava/util/Map;", "component5", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Ljava/lang/Object;Ljava/lang/String;Lcom/datadog/android/rum/RumResourceMethod;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartResource;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/Map;", "getAttributes", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Ljava/lang/Object;", "getKey", "Lcom/datadog/android/rum/RumResourceMethod;", "getMethod", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StartResource extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final java.util.Map<java.lang.String, java.lang.Object> attributes;
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final java.lang.Object key;
        private final com.datadog.android.rum.RumResourceMethod method;
        private final java.lang.String url;

        public final java.lang.Object getKey() {
            return this.key;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final com.datadog.android.rum.RumResourceMethod getMethod() {
            return this.method;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getAttributes() {
            return this.attributes;
        }

        public /* synthetic */ StartResource(java.lang.Object obj, java.lang.String str, com.datadog.android.rum.RumResourceMethod rumResourceMethod, java.util.Map map, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, str, rumResourceMethod, map, (i & 16) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartResource(java.lang.Object obj, java.lang.String str, com.datadog.android.rum.RumResourceMethod rumResourceMethod, java.util.Map<java.lang.String, ? extends java.lang.Object> map, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumResourceMethod, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.key = obj;
            this.url = str;
            this.method = rumResourceMethod;
            this.attributes = map;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.key;
            java.lang.String str = this.url;
            com.datadog.android.rum.RumResourceMethod rumResourceMethod = this.method;
            java.util.Map<java.lang.String, java.lang.Object> map = this.attributes;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StartResource(key=");
            sb.append(obj);
            sb.append(", url=");
            sb.append(str);
            sb.append(", method=");
            sb.append(rumResourceMethod);
            sb.append(", attributes=");
            sb.append(map);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((this.key.hashCode() * 31) + this.url.hashCode()) * 31) + this.method.hashCode()) * 31) + this.attributes.hashCode()) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartResource)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartResource startResource = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartResource) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.key, startResource.key) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, startResource.url) && this.method == startResource.method && kotlin.jvm.internal.Intrinsics.areEqual(this.attributes, startResource.attributes) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, startResource.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartResource copy(java.lang.Object key, java.lang.String url, com.datadog.android.rum.RumResourceMethod method, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartResource(key, url, method, attributes, eventTime);
        }

        /* renamed from: component5, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component4() {
            return this.attributes;
        }

        /* renamed from: component3, reason: from getter */
        public final com.datadog.android.rum.RumResourceMethod getMethod() {
            return this.method;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getKey() {
            return this.key;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartResource copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartResource startResource, java.lang.Object obj, java.lang.String str, com.datadog.android.rum.RumResourceMethod rumResourceMethod, java.util.Map map, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = startResource.key;
            }
            if ((i & 2) != 0) {
                str = startResource.url;
            }
            java.lang.String str2 = str;
            if ((i & 4) != 0) {
                rumResourceMethod = startResource.method;
            }
            com.datadog.android.rum.RumResourceMethod rumResourceMethod2 = rumResourceMethod;
            if ((i & 8) != 0) {
                map = startResource.attributes;
            }
            java.util.Map map2 = map;
            if ((i & 16) != 0) {
                time = startResource.eventTime;
            }
            return startResource.copy(obj, str2, rumResourceMethod2, map2, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$WaitForResourceTiming;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", "key", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Ljava/lang/Object;Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Ljava/lang/Object;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$WaitForResourceTiming;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Ljava/lang/Object;", "getKey"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class WaitForResourceTiming extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final java.lang.Object key;

        public final java.lang.Object getKey() {
            return this.key;
        }

        public /* synthetic */ WaitForResourceTiming(java.lang.Object obj, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WaitForResourceTiming(java.lang.Object obj, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.key = obj;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.key;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WaitForResourceTiming(key=");
            sb.append(obj);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.key.hashCode() * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.WaitForResourceTiming)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.WaitForResourceTiming waitForResourceTiming = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.WaitForResourceTiming) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.key, waitForResourceTiming.key) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, waitForResourceTiming.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.WaitForResourceTiming copy(java.lang.Object key, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.WaitForResourceTiming(key, eventTime);
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getKey() {
            return this.key;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.WaitForResourceTiming copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.WaitForResourceTiming waitForResourceTiming, java.lang.Object obj, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = waitForResourceTiming.key;
            }
            if ((i & 2) != 0) {
                time = waitForResourceTiming.eventTime;
            }
            return waitForResourceTiming.copy(obj, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\r"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddResourceTiming;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", "key", "Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;", "timing", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Ljava/lang/Object;Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;", "component3", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Ljava/lang/Object;Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddResourceTiming;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Ljava/lang/Object;", "getKey", "Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;", "getTiming"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AddResourceTiming extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final java.lang.Object key;
        private final com.datadog.android.rum.internal.domain.event.ResourceTiming timing;

        public final java.lang.Object getKey() {
            return this.key;
        }

        public final com.datadog.android.rum.internal.domain.event.ResourceTiming getTiming() {
            return this.timing;
        }

        public /* synthetic */ AddResourceTiming(java.lang.Object obj, com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, resourceTiming, (i & 4) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddResourceTiming(java.lang.Object obj, com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceTiming, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.key = obj;
            this.timing = resourceTiming;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.key;
            com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming = this.timing;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddResourceTiming(key=");
            sb.append(obj);
            sb.append(", timing=");
            sb.append(resourceTiming);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.key.hashCode() * 31) + this.timing.hashCode()) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddResourceTiming)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddResourceTiming addResourceTiming = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddResourceTiming) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.key, addResourceTiming.key) && kotlin.jvm.internal.Intrinsics.areEqual(this.timing, addResourceTiming.timing) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, addResourceTiming.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddResourceTiming copy(java.lang.Object key, com.datadog.android.rum.internal.domain.event.ResourceTiming timing, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timing, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddResourceTiming(key, timing, eventTime);
        }

        /* renamed from: component3, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.internal.domain.event.ResourceTiming getTiming() {
            return this.timing;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getKey() {
            return this.key;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddResourceTiming copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddResourceTiming addResourceTiming, java.lang.Object obj, com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = addResourceTiming.key;
            }
            if ((i & 2) != 0) {
                resourceTiming = addResourceTiming.timing;
            }
            if ((i & 4) != 0) {
                time = addResourceTiming.eventTime;
            }
            return addResourceTiming.copy(obj, resourceTiming, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ^\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b$\u0010%R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0007¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010\u0018R\u001a\u0010\r\u001a\u00020\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b0\u0010\u0013"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResource;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", "key", "", "statusCode", io.ktor.http.ContentDisposition.Parameters.Size, "Lcom/datadog/android/rum/RumResourceKind;", "kind", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/rum/RumResourceKind;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/Long;", "component3", "component4", "()Lcom/datadog/android/rum/RumResourceKind;", "component5", "()Ljava/util/Map;", "component6", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/rum/RumResourceKind;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResource;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getAttributes", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Ljava/lang/Object;", "getKey", "Lcom/datadog/android/rum/RumResourceKind;", "getKind", "Ljava/lang/Long;", "getSize", "getStatusCode"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StopResource extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final java.util.Map<java.lang.String, java.lang.Object> attributes;
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final java.lang.Object key;
        private final com.datadog.android.rum.RumResourceKind kind;
        private final java.lang.Long size;
        private final java.lang.Long statusCode;

        public final java.lang.Object getKey() {
            return this.key;
        }

        public final java.lang.Long getStatusCode() {
            return this.statusCode;
        }

        public final java.lang.Long getSize() {
            return this.size;
        }

        public final com.datadog.android.rum.RumResourceKind getKind() {
            return this.kind;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getAttributes() {
            return this.attributes;
        }

        public /* synthetic */ StopResource(java.lang.Object obj, java.lang.Long l, java.lang.Long l2, com.datadog.android.rum.RumResourceKind rumResourceKind, java.util.Map map, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, l, l2, rumResourceKind, map, (i & 32) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopResource(java.lang.Object obj, java.lang.Long l, java.lang.Long l2, com.datadog.android.rum.RumResourceKind rumResourceKind, java.util.Map<java.lang.String, ? extends java.lang.Object> map, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumResourceKind, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.key = obj;
            this.statusCode = l;
            this.size = l2;
            this.kind = rumResourceKind;
            this.attributes = map;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.key;
            java.lang.Long l = this.statusCode;
            java.lang.Long l2 = this.size;
            com.datadog.android.rum.RumResourceKind rumResourceKind = this.kind;
            java.util.Map<java.lang.String, java.lang.Object> map = this.attributes;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StopResource(key=");
            sb.append(obj);
            sb.append(", statusCode=");
            sb.append(l);
            sb.append(", size=");
            sb.append(l2);
            sb.append(", kind=");
            sb.append(rumResourceKind);
            sb.append(", attributes=");
            sb.append(map);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.key.hashCode();
            java.lang.Long l = this.statusCode;
            int hashCode2 = l == null ? 0 : l.hashCode();
            java.lang.Long l2 = this.size;
            return (((((((((hashCode * 31) + hashCode2) * 31) + (l2 != null ? l2.hashCode() : 0)) * 31) + this.kind.hashCode()) * 31) + this.attributes.hashCode()) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResource)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResource stopResource = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResource) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.key, stopResource.key) && kotlin.jvm.internal.Intrinsics.areEqual(this.statusCode, stopResource.statusCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.size, stopResource.size) && this.kind == stopResource.kind && kotlin.jvm.internal.Intrinsics.areEqual(this.attributes, stopResource.attributes) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, stopResource.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResource copy(java.lang.Object key, java.lang.Long statusCode, java.lang.Long size, com.datadog.android.rum.RumResourceKind kind, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kind, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResource(key, statusCode, size, kind, attributes, eventTime);
        }

        /* renamed from: component6, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component5() {
            return this.attributes;
        }

        /* renamed from: component4, reason: from getter */
        public final com.datadog.android.rum.RumResourceKind getKind() {
            return this.kind;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Long getSize() {
            return this.size;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Long getStatusCode() {
            return this.statusCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getKey() {
            return this.key;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResource copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResource stopResource, java.lang.Object obj, java.lang.Long l, java.lang.Long l2, com.datadog.android.rum.RumResourceKind rumResourceKind, java.util.Map map, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = stopResource.key;
            }
            if ((i & 2) != 0) {
                l = stopResource.statusCode;
            }
            java.lang.Long l3 = l;
            if ((i & 4) != 0) {
                l2 = stopResource.size;
            }
            java.lang.Long l4 = l2;
            if ((i & 8) != 0) {
                rumResourceKind = stopResource.kind;
            }
            com.datadog.android.rum.RumResourceKind rumResourceKind2 = rumResourceKind;
            if ((i & 16) != 0) {
                map = stopResource.attributes;
            }
            java.util.Map map2 = map;
            if ((i & 32) != 0) {
                time = stopResource.eventTime;
            }
            return stopResource.copy(obj, l3, l4, rumResourceKind2, map2, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJf\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b)\u0010\u0017R%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010\u001b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResourceWithError;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", "key", "", "statusCode", "", "message", "Lcom/datadog/android/rum/RumErrorSource;", "source", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/Long;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/datadog/android/rum/RumErrorSource;", "component5", "()Ljava/lang/Throwable;", "component6", "()Ljava/util/Map;", "component7", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResourceWithError;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/Map;", "getAttributes", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Ljava/lang/Object;", "getKey", "Ljava/lang/String;", "getMessage", "Lcom/datadog/android/rum/RumErrorSource;", "getSource", "Ljava/lang/Long;", "getStatusCode", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StopResourceWithError extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final java.util.Map<java.lang.String, java.lang.Object> attributes;
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final java.lang.Object key;
        private final java.lang.String message;
        private final com.datadog.android.rum.RumErrorSource source;
        private final java.lang.Long statusCode;
        private final java.lang.Throwable throwable;

        public final java.lang.Object getKey() {
            return this.key;
        }

        public final java.lang.Long getStatusCode() {
            return this.statusCode;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final com.datadog.android.rum.RumErrorSource getSource() {
            return this.source;
        }

        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getAttributes() {
            return this.attributes;
        }

        public /* synthetic */ StopResourceWithError(java.lang.Object obj, java.lang.Long l, java.lang.String str, com.datadog.android.rum.RumErrorSource rumErrorSource, java.lang.Throwable th, java.util.Map map, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, l, str, rumErrorSource, th, map, (i & 64) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopResourceWithError(java.lang.Object obj, java.lang.Long l, java.lang.String str, com.datadog.android.rum.RumErrorSource rumErrorSource, java.lang.Throwable th, java.util.Map<java.lang.String, ? extends java.lang.Object> map, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumErrorSource, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.key = obj;
            this.statusCode = l;
            this.message = str;
            this.source = rumErrorSource;
            this.throwable = th;
            this.attributes = map;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.key;
            java.lang.Long l = this.statusCode;
            java.lang.String str = this.message;
            com.datadog.android.rum.RumErrorSource rumErrorSource = this.source;
            java.lang.Throwable th = this.throwable;
            java.util.Map<java.lang.String, java.lang.Object> map = this.attributes;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StopResourceWithError(key=");
            sb.append(obj);
            sb.append(", statusCode=");
            sb.append(l);
            sb.append(", message=");
            sb.append(str);
            sb.append(", source=");
            sb.append(rumErrorSource);
            sb.append(", throwable=");
            sb.append(th);
            sb.append(", attributes=");
            sb.append(map);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.key.hashCode();
            java.lang.Long l = this.statusCode;
            return (((((((((((hashCode * 31) + (l == null ? 0 : l.hashCode())) * 31) + this.message.hashCode()) * 31) + this.source.hashCode()) * 31) + this.throwable.hashCode()) * 31) + this.attributes.hashCode()) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithError)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithError stopResourceWithError = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.key, stopResourceWithError.key) && kotlin.jvm.internal.Intrinsics.areEqual(this.statusCode, stopResourceWithError.statusCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, stopResourceWithError.message) && this.source == stopResourceWithError.source && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, stopResourceWithError.throwable) && kotlin.jvm.internal.Intrinsics.areEqual(this.attributes, stopResourceWithError.attributes) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, stopResourceWithError.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithError copy(java.lang.Object key, java.lang.Long statusCode, java.lang.String message, com.datadog.android.rum.RumErrorSource source, java.lang.Throwable throwable, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithError(key, statusCode, message, source, throwable, attributes, eventTime);
        }

        /* renamed from: component7, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component6() {
            return this.attributes;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        /* renamed from: component4, reason: from getter */
        public final com.datadog.android.rum.RumErrorSource getSource() {
            return this.source;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Long getStatusCode() {
            return this.statusCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getKey() {
            return this.key;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithError copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithError stopResourceWithError, java.lang.Object obj, java.lang.Long l, java.lang.String str, com.datadog.android.rum.RumErrorSource rumErrorSource, java.lang.Throwable th, java.util.Map map, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = stopResourceWithError.key;
            }
            if ((i & 2) != 0) {
                l = stopResourceWithError.statusCode;
            }
            java.lang.Long l2 = l;
            if ((i & 4) != 0) {
                str = stopResourceWithError.message;
            }
            java.lang.String str2 = str;
            if ((i & 8) != 0) {
                rumErrorSource = stopResourceWithError.source;
            }
            com.datadog.android.rum.RumErrorSource rumErrorSource2 = rumErrorSource;
            if ((i & 16) != 0) {
                th = stopResourceWithError.throwable;
            }
            java.lang.Throwable th2 = th;
            if ((i & 32) != 0) {
                map = stopResourceWithError.attributes;
            }
            java.util.Map map2 = map;
            if ((i & 64) != 0) {
                time = stopResourceWithError.eventTime;
            }
            return stopResourceWithError.copy(obj, l2, str2, rumErrorSource2, th2, map2, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u001e\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJr\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b)\u0010\u0017R%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0017R\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b2\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b5\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u0015"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResourceWithStackTrace;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", "key", "", "statusCode", "", "message", "Lcom/datadog/android/rum/RumErrorSource;", "source", "stackTrace", "errorType", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/Long;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/datadog/android/rum/RumErrorSource;", "component5", "component6", "component7", "()Ljava/util/Map;", "component8", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResourceWithStackTrace;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/Map;", "getAttributes", "Ljava/lang/String;", "getErrorType", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Ljava/lang/Object;", "getKey", "getMessage", "Lcom/datadog/android/rum/RumErrorSource;", "getSource", "getStackTrace", "Ljava/lang/Long;", "getStatusCode"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StopResourceWithStackTrace extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final java.util.Map<java.lang.String, java.lang.Object> attributes;
        private final java.lang.String errorType;
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final java.lang.Object key;
        private final java.lang.String message;
        private final com.datadog.android.rum.RumErrorSource source;
        private final java.lang.String stackTrace;
        private final java.lang.Long statusCode;

        public final java.lang.Object getKey() {
            return this.key;
        }

        public final java.lang.Long getStatusCode() {
            return this.statusCode;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final com.datadog.android.rum.RumErrorSource getSource() {
            return this.source;
        }

        public final java.lang.String getStackTrace() {
            return this.stackTrace;
        }

        public final java.lang.String getErrorType() {
            return this.errorType;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getAttributes() {
            return this.attributes;
        }

        public /* synthetic */ StopResourceWithStackTrace(java.lang.Object obj, java.lang.Long l, java.lang.String str, com.datadog.android.rum.RumErrorSource rumErrorSource, java.lang.String str2, java.lang.String str3, java.util.Map map, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, l, str, rumErrorSource, str2, str3, map, (i & 128) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopResourceWithStackTrace(java.lang.Object obj, java.lang.Long l, java.lang.String str, com.datadog.android.rum.RumErrorSource rumErrorSource, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, ? extends java.lang.Object> map, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumErrorSource, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.key = obj;
            this.statusCode = l;
            this.message = str;
            this.source = rumErrorSource;
            this.stackTrace = str2;
            this.errorType = str3;
            this.attributes = map;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.key;
            java.lang.Long l = this.statusCode;
            java.lang.String str = this.message;
            com.datadog.android.rum.RumErrorSource rumErrorSource = this.source;
            java.lang.String str2 = this.stackTrace;
            java.lang.String str3 = this.errorType;
            java.util.Map<java.lang.String, java.lang.Object> map = this.attributes;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StopResourceWithStackTrace(key=");
            sb.append(obj);
            sb.append(", statusCode=");
            sb.append(l);
            sb.append(", message=");
            sb.append(str);
            sb.append(", source=");
            sb.append(rumErrorSource);
            sb.append(", stackTrace=");
            sb.append(str2);
            sb.append(", errorType=");
            sb.append(str3);
            sb.append(", attributes=");
            sb.append(map);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.key.hashCode();
            java.lang.Long l = this.statusCode;
            int hashCode2 = l == null ? 0 : l.hashCode();
            int hashCode3 = this.message.hashCode();
            int hashCode4 = this.source.hashCode();
            int hashCode5 = this.stackTrace.hashCode();
            java.lang.String str = this.errorType;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.attributes.hashCode()) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithStackTrace)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithStackTrace stopResourceWithStackTrace = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithStackTrace) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.key, stopResourceWithStackTrace.key) && kotlin.jvm.internal.Intrinsics.areEqual(this.statusCode, stopResourceWithStackTrace.statusCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, stopResourceWithStackTrace.message) && this.source == stopResourceWithStackTrace.source && kotlin.jvm.internal.Intrinsics.areEqual(this.stackTrace, stopResourceWithStackTrace.stackTrace) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorType, stopResourceWithStackTrace.errorType) && kotlin.jvm.internal.Intrinsics.areEqual(this.attributes, stopResourceWithStackTrace.attributes) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, stopResourceWithStackTrace.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithStackTrace copy(java.lang.Object key, java.lang.Long statusCode, java.lang.String message, com.datadog.android.rum.RumErrorSource source, java.lang.String stackTrace, java.lang.String errorType, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stackTrace, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithStackTrace(key, statusCode, message, source, stackTrace, errorType, attributes, eventTime);
        }

        /* renamed from: component8, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component7() {
            return this.attributes;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getErrorType() {
            return this.errorType;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getStackTrace() {
            return this.stackTrace;
        }

        /* renamed from: component4, reason: from getter */
        public final com.datadog.android.rum.RumErrorSource getSource() {
            return this.source;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Long getStatusCode() {
            return this.statusCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getKey() {
            return this.key;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u001e\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001bJ\u0010\u0010,\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b,\u0010-J\u009a\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b6\u0010\u001bR%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8\u0007¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u0010(R\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010*R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b\n\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b?\u0010!R\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010@\u001a\u0004\bA\u0010-R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\bB\u0010\u001bR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010C\u001a\u0004\bD\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bF\u0010#R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010G\u001a\u0004\bH\u0010\u001fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bI\u0010\u001b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddError;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", "message", "Lcom/datadog/android/rum/RumErrorSource;", "source", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "stacktrace", "", "isFatal", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "type", "Lcom/datadog/android/rum/internal/RumErrorSourceType;", "sourceType", "", "Lcom/datadog/android/core/feature/event/ThreadDump;", "threads", "", "timeSinceAppStartNs", "<init>", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/lang/String;ZLjava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;Ljava/lang/String;Lcom/datadog/android/rum/internal/RumErrorSourceType;Ljava/util/List;Ljava/lang/Long;)V", "component1", "()Ljava/lang/String;", "component10", "()Ljava/util/List;", "component11", "()Ljava/lang/Long;", "component2", "()Lcom/datadog/android/rum/RumErrorSource;", "component3", "()Ljava/lang/Throwable;", "component4", "component5", "()Z", "component6", "()Ljava/util/Map;", "component7", "()Lcom/datadog/android/rum/internal/domain/Time;", "component8", "component9", "()Lcom/datadog/android/rum/internal/RumErrorSourceType;", "copy", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/lang/String;ZLjava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;Ljava/lang/String;Lcom/datadog/android/rum/internal/RumErrorSourceType;Ljava/util/List;Ljava/lang/Long;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddError;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/Map;", "getAttributes", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Z", "Ljava/lang/String;", "getMessage", "Lcom/datadog/android/rum/RumErrorSource;", "getSource", "Lcom/datadog/android/rum/internal/RumErrorSourceType;", "getSourceType", "getStacktrace", "Ljava/util/List;", "getThreads", "Ljava/lang/Throwable;", "getThrowable", "Ljava/lang/Long;", "getTimeSinceAppStartNs", "getType"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AddError extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final java.util.Map<java.lang.String, java.lang.Object> attributes;
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final boolean isFatal;
        private final java.lang.String message;
        private final com.datadog.android.rum.RumErrorSource source;
        private final com.datadog.android.rum.internal.RumErrorSourceType sourceType;
        private final java.lang.String stacktrace;
        private final java.util.List<com.datadog.android.core.feature.event.ThreadDump> threads;
        private final java.lang.Throwable throwable;
        private final java.lang.Long timeSinceAppStartNs;
        private final java.lang.String type;

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final com.datadog.android.rum.RumErrorSource getSource() {
            return this.source;
        }

        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final java.lang.String getStacktrace() {
            return this.stacktrace;
        }

        public final boolean isFatal() {
            return this.isFatal;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getAttributes() {
            return this.attributes;
        }

        public /* synthetic */ AddError(java.lang.String str, com.datadog.android.rum.RumErrorSource rumErrorSource, java.lang.Throwable th, java.lang.String str2, boolean z, java.util.Map map, com.datadog.android.rum.internal.domain.Time time, java.lang.String str3, com.datadog.android.rum.internal.RumErrorSourceType rumErrorSourceType, java.util.List list, java.lang.Long l, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, rumErrorSource, th, str2, z, map, (i & 64) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? com.datadog.android.rum.internal.RumErrorSourceType.ANDROID : rumErrorSourceType, list, (i & 1024) != 0 ? null : l);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        public final java.lang.String getType() {
            return this.type;
        }

        public final com.datadog.android.rum.internal.RumErrorSourceType getSourceType() {
            return this.sourceType;
        }

        public final java.util.List<com.datadog.android.core.feature.event.ThreadDump> getThreads() {
            return this.threads;
        }

        public final java.lang.Long getTimeSinceAppStartNs() {
            return this.timeSinceAppStartNs;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddError(java.lang.String str, com.datadog.android.rum.RumErrorSource rumErrorSource, java.lang.Throwable th, java.lang.String str2, boolean z, java.util.Map<java.lang.String, ? extends java.lang.Object> map, com.datadog.android.rum.internal.domain.Time time, java.lang.String str3, com.datadog.android.rum.internal.RumErrorSourceType rumErrorSourceType, java.util.List<com.datadog.android.core.feature.event.ThreadDump> list, java.lang.Long l) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumErrorSource, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumErrorSourceType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.message = str;
            this.source = rumErrorSource;
            this.throwable = th;
            this.stacktrace = str2;
            this.isFatal = z;
            this.attributes = map;
            this.eventTime = time;
            this.type = str3;
            this.sourceType = rumErrorSourceType;
            this.threads = list;
            this.timeSinceAppStartNs = l;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            com.datadog.android.rum.RumErrorSource rumErrorSource = this.source;
            java.lang.Throwable th = this.throwable;
            java.lang.String str2 = this.stacktrace;
            boolean z = this.isFatal;
            java.util.Map<java.lang.String, java.lang.Object> map = this.attributes;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.String str3 = this.type;
            com.datadog.android.rum.internal.RumErrorSourceType rumErrorSourceType = this.sourceType;
            java.util.List<com.datadog.android.core.feature.event.ThreadDump> list = this.threads;
            java.lang.Long l = this.timeSinceAppStartNs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddError(message=");
            sb.append(str);
            sb.append(", source=");
            sb.append(rumErrorSource);
            sb.append(", throwable=");
            sb.append(th);
            sb.append(", stacktrace=");
            sb.append(str2);
            sb.append(", isFatal=");
            sb.append(z);
            sb.append(", attributes=");
            sb.append(map);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(", type=");
            sb.append(str3);
            sb.append(", sourceType=");
            sb.append(rumErrorSourceType);
            sb.append(", threads=");
            sb.append(list);
            sb.append(", timeSinceAppStartNs=");
            sb.append(l);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            int hashCode2 = this.source.hashCode();
            java.lang.Throwable th = this.throwable;
            int hashCode3 = th == null ? 0 : th.hashCode();
            java.lang.String str = this.stacktrace;
            int hashCode4 = str == null ? 0 : str.hashCode();
            int hashCode5 = java.lang.Boolean.hashCode(this.isFatal);
            int hashCode6 = this.attributes.hashCode();
            int hashCode7 = this.eventTime.hashCode();
            java.lang.String str2 = this.type;
            int hashCode8 = str2 == null ? 0 : str2.hashCode();
            int hashCode9 = this.sourceType.hashCode();
            int hashCode10 = this.threads.hashCode();
            java.lang.Long l = this.timeSinceAppStartNs;
            return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (l != null ? l.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddError)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddError addError = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, addError.message) && this.source == addError.source && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, addError.throwable) && kotlin.jvm.internal.Intrinsics.areEqual(this.stacktrace, addError.stacktrace) && this.isFatal == addError.isFatal && kotlin.jvm.internal.Intrinsics.areEqual(this.attributes, addError.attributes) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, addError.eventTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, addError.type) && this.sourceType == addError.sourceType && kotlin.jvm.internal.Intrinsics.areEqual(this.threads, addError.threads) && kotlin.jvm.internal.Intrinsics.areEqual(this.timeSinceAppStartNs, addError.timeSinceAppStartNs);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddError copy(java.lang.String message, com.datadog.android.rum.RumErrorSource source, java.lang.Throwable throwable, java.lang.String stacktrace, boolean isFatal, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, com.datadog.android.rum.internal.domain.Time eventTime, java.lang.String type, com.datadog.android.rum.internal.RumErrorSourceType sourceType, java.util.List<com.datadog.android.core.feature.event.ThreadDump> threads, java.lang.Long timeSinceAppStartNs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threads, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddError(message, source, throwable, stacktrace, isFatal, attributes, eventTime, type, sourceType, threads, timeSinceAppStartNs);
        }

        /* renamed from: component9, reason: from getter */
        public final com.datadog.android.rum.internal.RumErrorSourceType getSourceType() {
            return this.sourceType;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getType() {
            return this.type;
        }

        /* renamed from: component7, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component6() {
            return this.attributes;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsFatal() {
            return this.isFatal;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getStacktrace() {
            return this.stacktrace;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.RumErrorSource getSource() {
            return this.source;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.Long getTimeSinceAppStartNs() {
            return this.timeSinceAppStartNs;
        }

        public final java.util.List<com.datadog.android.core.feature.event.ThreadDump> component10() {
            return this.threads;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b#\u0010\f"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResourceSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, "resourceId", "", "resourceEndTimestampInNanos", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "component4", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Ljava/lang/String;Ljava/lang/String;JLcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResourceSent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "J", "getResourceEndTimestampInNanos", "Ljava/lang/String;", "getResourceId", "getViewId"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ResourceSent extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final long resourceEndTimestampInNanos;
        private final java.lang.String resourceId;
        private final java.lang.String viewId;

        public final java.lang.String getViewId() {
            return this.viewId;
        }

        public final java.lang.String getResourceId() {
            return this.resourceId;
        }

        public final long getResourceEndTimestampInNanos() {
            return this.resourceEndTimestampInNanos;
        }

        public /* synthetic */ ResourceSent(java.lang.String str, java.lang.String str2, long j, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, j, (i & 8) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResourceSent(java.lang.String str, java.lang.String str2, long j, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.viewId = str;
            this.resourceId = str2;
            this.resourceEndTimestampInNanos = j;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.viewId;
            java.lang.String str2 = this.resourceId;
            long j = this.resourceEndTimestampInNanos;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ResourceSent(viewId=");
            sb.append(str);
            sb.append(", resourceId=");
            sb.append(str2);
            sb.append(", resourceEndTimestampInNanos=");
            sb.append(j);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.viewId.hashCode() * 31) + this.resourceId.hashCode()) * 31) + java.lang.Long.hashCode(this.resourceEndTimestampInNanos)) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResourceSent)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResourceSent resourceSent = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResourceSent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.viewId, resourceSent.viewId) && kotlin.jvm.internal.Intrinsics.areEqual(this.resourceId, resourceSent.resourceId) && this.resourceEndTimestampInNanos == resourceSent.resourceEndTimestampInNanos && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, resourceSent.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResourceSent copy(java.lang.String viewId, java.lang.String resourceId, long resourceEndTimestampInNanos, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResourceSent(viewId, resourceId, resourceEndTimestampInNanos, eventTime);
        }

        /* renamed from: component4, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* renamed from: component3, reason: from getter */
        public final long getResourceEndTimestampInNanos() {
            return this.resourceEndTimestampInNanos;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getResourceId() {
            return this.resourceId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getViewId() {
            return this.viewId;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResourceSent copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResourceSent resourceSent, java.lang.String str, java.lang.String str2, long j, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = resourceSent.viewId;
            }
            if ((i & 2) != 0) {
                str2 = resourceSent.resourceId;
            }
            java.lang.String str3 = str2;
            if ((i & 4) != 0) {
                j = resourceSent.resourceEndTimestampInNanos;
            }
            long j2 = j;
            if ((i & 8) != 0) {
                time = resourceSent.eventTime;
            }
            return resourceSent.copy(str, str3, j2, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JB\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0011J\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ActionSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, "", "frustrationCount", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;", "type", "", "eventEndTimestampInNanos", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Ljava/lang/String;ILcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;JLcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;", "component4", "()J", "component5", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Ljava/lang/String;ILcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;JLcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ActionSent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "J", "getEventEndTimestampInNanos", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", com.visa.cbp.getEncExpo.warmup, "getFrustrationCount", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;", "getType", "Ljava/lang/String;", "getViewId"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ActionSent extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final long eventEndTimestampInNanos;
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final int frustrationCount;
        private final com.datadog.android.rum.model.ActionEvent.ActionEventActionType type;
        private final java.lang.String viewId;

        public final java.lang.String getViewId() {
            return this.viewId;
        }

        public final int getFrustrationCount() {
            return this.frustrationCount;
        }

        public final com.datadog.android.rum.model.ActionEvent.ActionEventActionType getType() {
            return this.type;
        }

        public final long getEventEndTimestampInNanos() {
            return this.eventEndTimestampInNanos;
        }

        public /* synthetic */ ActionSent(java.lang.String str, int i, com.datadog.android.rum.model.ActionEvent.ActionEventActionType actionEventActionType, long j, com.datadog.android.rum.internal.domain.Time time, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, actionEventActionType, j, (i2 & 16) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionSent(java.lang.String str, int i, com.datadog.android.rum.model.ActionEvent.ActionEventActionType actionEventActionType, long j, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionEventActionType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.viewId = str;
            this.frustrationCount = i;
            this.type = actionEventActionType;
            this.eventEndTimestampInNanos = j;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.viewId;
            int i = this.frustrationCount;
            com.datadog.android.rum.model.ActionEvent.ActionEventActionType actionEventActionType = this.type;
            long j = this.eventEndTimestampInNanos;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ActionSent(viewId=");
            sb.append(str);
            sb.append(", frustrationCount=");
            sb.append(i);
            sb.append(", type=");
            sb.append(actionEventActionType);
            sb.append(", eventEndTimestampInNanos=");
            sb.append(j);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((this.viewId.hashCode() * 31) + java.lang.Integer.hashCode(this.frustrationCount)) * 31) + this.type.hashCode()) * 31) + java.lang.Long.hashCode(this.eventEndTimestampInNanos)) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.ActionSent)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.ActionSent actionSent = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.ActionSent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.viewId, actionSent.viewId) && this.frustrationCount == actionSent.frustrationCount && this.type == actionSent.type && this.eventEndTimestampInNanos == actionSent.eventEndTimestampInNanos && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, actionSent.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.ActionSent copy(java.lang.String viewId, int frustrationCount, com.datadog.android.rum.model.ActionEvent.ActionEventActionType type, long eventEndTimestampInNanos, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.ActionSent(viewId, frustrationCount, type, eventEndTimestampInNanos, eventTime);
        }

        /* renamed from: component5, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* renamed from: component4, reason: from getter */
        public final long getEventEndTimestampInNanos() {
            return this.eventEndTimestampInNanos;
        }

        /* renamed from: component3, reason: from getter */
        public final com.datadog.android.rum.model.ActionEvent.ActionEventActionType getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final int getFrustrationCount() {
            return this.frustrationCount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getViewId() {
            return this.viewId;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.ActionSent copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.ActionSent actionSent, java.lang.String str, int i, com.datadog.android.rum.model.ActionEvent.ActionEventActionType actionEventActionType, long j, com.datadog.android.rum.internal.domain.Time time, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = actionSent.viewId;
            }
            if ((i2 & 2) != 0) {
                i = actionSent.frustrationCount;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                actionEventActionType = actionSent.type;
            }
            com.datadog.android.rum.model.ActionEvent.ActionEventActionType actionEventActionType2 = actionEventActionType;
            if ((i2 & 8) != 0) {
                j = actionSent.eventEndTimestampInNanos;
            }
            long j2 = j;
            if ((i2 & 16) != 0) {
                time = actionSent.eventTime;
            }
            return actionSent.copy(str, i3, actionEventActionType2, j2, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b#\u0010\f"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ErrorSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, "resourceId", "", "resourceEndTimestampInNanos", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Long;", "component4", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ErrorSent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Ljava/lang/Long;", "getResourceEndTimestampInNanos", "Ljava/lang/String;", "getResourceId", "getViewId"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ErrorSent extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final java.lang.Long resourceEndTimestampInNanos;
        private final java.lang.String resourceId;
        private final java.lang.String viewId;

        public final java.lang.String getViewId() {
            return this.viewId;
        }

        public final java.lang.String getResourceId() {
            return this.resourceId;
        }

        public final java.lang.Long getResourceEndTimestampInNanos() {
            return this.resourceEndTimestampInNanos;
        }

        public /* synthetic */ ErrorSent(java.lang.String str, java.lang.String str2, java.lang.Long l, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorSent(java.lang.String str, java.lang.String str2, java.lang.Long l, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.viewId = str;
            this.resourceId = str2;
            this.resourceEndTimestampInNanos = l;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.viewId;
            java.lang.String str2 = this.resourceId;
            java.lang.Long l = this.resourceEndTimestampInNanos;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorSent(viewId=");
            sb.append(str);
            sb.append(", resourceId=");
            sb.append(str2);
            sb.append(", resourceEndTimestampInNanos=");
            sb.append(l);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.viewId.hashCode();
            java.lang.String str = this.resourceId;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.Long l = this.resourceEndTimestampInNanos;
            return (((((hashCode * 31) + hashCode2) * 31) + (l != null ? l.hashCode() : 0)) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.ErrorSent)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.ErrorSent errorSent = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.ErrorSent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.viewId, errorSent.viewId) && kotlin.jvm.internal.Intrinsics.areEqual(this.resourceId, errorSent.resourceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.resourceEndTimestampInNanos, errorSent.resourceEndTimestampInNanos) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, errorSent.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.ErrorSent copy(java.lang.String viewId, java.lang.String resourceId, java.lang.Long resourceEndTimestampInNanos, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.ErrorSent(viewId, resourceId, resourceEndTimestampInNanos, eventTime);
        }

        /* renamed from: component4, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Long getResourceEndTimestampInNanos() {
            return this.resourceEndTimestampInNanos;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getResourceId() {
            return this.resourceId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getViewId() {
            return this.viewId;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.ErrorSent copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.ErrorSent errorSent, java.lang.String str, java.lang.String str2, java.lang.Long l, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = errorSent.viewId;
            }
            if ((i & 2) != 0) {
                str2 = errorSent.resourceId;
            }
            if ((i & 4) != 0) {
                l = errorSent.resourceEndTimestampInNanos;
            }
            if ((i & 8) != 0) {
                time = errorSent.eventTime;
            }
            return errorSent.copy(str, str2, l, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u0005\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$LongTaskSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, "", "isFrozenFrame", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Ljava/lang/String;ZLcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Ljava/lang/String;ZLcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$LongTaskSent;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Z", "Ljava/lang/String;", "getViewId"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class LongTaskSent extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final boolean isFrozenFrame;
        private final java.lang.String viewId;

        public final java.lang.String getViewId() {
            return this.viewId;
        }

        public final boolean isFrozenFrame() {
            return this.isFrozenFrame;
        }

        public /* synthetic */ LongTaskSent(java.lang.String str, boolean z, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LongTaskSent(java.lang.String str, boolean z, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.viewId = str;
            this.isFrozenFrame = z;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.viewId;
            boolean z = this.isFrozenFrame;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LongTaskSent(viewId=");
            sb.append(str);
            sb.append(", isFrozenFrame=");
            sb.append(z);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.viewId.hashCode() * 31) + java.lang.Boolean.hashCode(this.isFrozenFrame)) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskSent)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskSent longTaskSent = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskSent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.viewId, longTaskSent.viewId) && this.isFrozenFrame == longTaskSent.isFrozenFrame && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, longTaskSent.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskSent copy(java.lang.String viewId, boolean isFrozenFrame, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskSent(viewId, isFrozenFrame, eventTime);
        }

        /* renamed from: component3, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsFrozenFrame() {
            return this.isFrozenFrame;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getViewId() {
            return this.viewId;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskSent copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskSent longTaskSent, java.lang.String str, boolean z, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = longTaskSent.viewId;
            }
            if ((i & 2) != 0) {
                z = longTaskSent.isFrozenFrame;
            }
            if ((i & 4) != 0) {
                time = longTaskSent.eventTime;
            }
            return longTaskSent.copy(str, z, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResourceDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, "resourceId", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResourceDropped;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Ljava/lang/String;", "getResourceId", "getViewId"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ResourceDropped extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final java.lang.String resourceId;
        private final java.lang.String viewId;

        public final java.lang.String getViewId() {
            return this.viewId;
        }

        public final java.lang.String getResourceId() {
            return this.resourceId;
        }

        public /* synthetic */ ResourceDropped(java.lang.String str, java.lang.String str2, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResourceDropped(java.lang.String str, java.lang.String str2, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.viewId = str;
            this.resourceId = str2;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.viewId;
            java.lang.String str2 = this.resourceId;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ResourceDropped(viewId=");
            sb.append(str);
            sb.append(", resourceId=");
            sb.append(str2);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.viewId.hashCode() * 31) + this.resourceId.hashCode()) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResourceDropped)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResourceDropped resourceDropped = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResourceDropped) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.viewId, resourceDropped.viewId) && kotlin.jvm.internal.Intrinsics.areEqual(this.resourceId, resourceDropped.resourceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, resourceDropped.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResourceDropped copy(java.lang.String viewId, java.lang.String resourceId, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResourceDropped(viewId, resourceId, eventTime);
        }

        /* renamed from: component3, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getResourceId() {
            return this.resourceId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getViewId() {
            return this.viewId;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResourceDropped copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResourceDropped resourceDropped, java.lang.String str, java.lang.String str2, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = resourceDropped.viewId;
            }
            if ((i & 2) != 0) {
                str2 = resourceDropped.resourceId;
            }
            if ((i & 4) != 0) {
                time = resourceDropped.eventTime;
            }
            return resourceDropped.copy(str, str2, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ActionDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ActionDropped;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Ljava/lang/String;", "getViewId"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ActionDropped extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final java.lang.String viewId;

        public final java.lang.String getViewId() {
            return this.viewId;
        }

        public /* synthetic */ ActionDropped(java.lang.String str, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionDropped(java.lang.String str, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.viewId = str;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.viewId;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ActionDropped(viewId=");
            sb.append(str);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.viewId.hashCode() * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.ActionDropped)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.ActionDropped actionDropped = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.ActionDropped) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.viewId, actionDropped.viewId) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, actionDropped.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.ActionDropped copy(java.lang.String viewId, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.ActionDropped(viewId, eventTime);
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getViewId() {
            return this.viewId;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.ActionDropped copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.ActionDropped actionDropped, java.lang.String str, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionDropped.viewId;
            }
            if ((i & 2) != 0) {
                time = actionDropped.eventTime;
            }
            return actionDropped.copy(str, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ErrorDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, "resourceId", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ErrorDropped;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Ljava/lang/String;", "getResourceId", "getViewId"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ErrorDropped extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final java.lang.String resourceId;
        private final java.lang.String viewId;

        public final java.lang.String getViewId() {
            return this.viewId;
        }

        public final java.lang.String getResourceId() {
            return this.resourceId;
        }

        public /* synthetic */ ErrorDropped(java.lang.String str, java.lang.String str2, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorDropped(java.lang.String str, java.lang.String str2, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.viewId = str;
            this.resourceId = str2;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.viewId;
            java.lang.String str2 = this.resourceId;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorDropped(viewId=");
            sb.append(str);
            sb.append(", resourceId=");
            sb.append(str2);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.viewId.hashCode();
            java.lang.String str = this.resourceId;
            return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.ErrorDropped)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.ErrorDropped errorDropped = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.ErrorDropped) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.viewId, errorDropped.viewId) && kotlin.jvm.internal.Intrinsics.areEqual(this.resourceId, errorDropped.resourceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, errorDropped.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.ErrorDropped copy(java.lang.String viewId, java.lang.String resourceId, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.ErrorDropped(viewId, resourceId, eventTime);
        }

        /* renamed from: component3, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getResourceId() {
            return this.resourceId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getViewId() {
            return this.viewId;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.ErrorDropped copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.ErrorDropped errorDropped, java.lang.String str, java.lang.String str2, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = errorDropped.viewId;
            }
            if ((i & 2) != 0) {
                str2 = errorDropped.resourceId;
            }
            if ((i & 4) != 0) {
                time = errorDropped.eventTime;
            }
            return errorDropped.copy(str, str2, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u0005\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$LongTaskDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, "", "isFrozenFrame", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Ljava/lang/String;ZLcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Ljava/lang/String;ZLcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$LongTaskDropped;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Z", "Ljava/lang/String;", "getViewId"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class LongTaskDropped extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final boolean isFrozenFrame;
        private final java.lang.String viewId;

        public final java.lang.String getViewId() {
            return this.viewId;
        }

        public final boolean isFrozenFrame() {
            return this.isFrozenFrame;
        }

        public /* synthetic */ LongTaskDropped(java.lang.String str, boolean z, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LongTaskDropped(java.lang.String str, boolean z, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.viewId = str;
            this.isFrozenFrame = z;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.viewId;
            boolean z = this.isFrozenFrame;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LongTaskDropped(viewId=");
            sb.append(str);
            sb.append(", isFrozenFrame=");
            sb.append(z);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.viewId.hashCode() * 31) + java.lang.Boolean.hashCode(this.isFrozenFrame)) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskDropped)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskDropped longTaskDropped = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskDropped) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.viewId, longTaskDropped.viewId) && this.isFrozenFrame == longTaskDropped.isFrozenFrame && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, longTaskDropped.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskDropped copy(java.lang.String viewId, boolean isFrozenFrame, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskDropped(viewId, isFrozenFrame, eventTime);
        }

        /* renamed from: component3, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsFrozenFrame() {
            return this.isFrozenFrame;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getViewId() {
            return this.viewId;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskDropped copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskDropped longTaskDropped, java.lang.String str, boolean z, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = longTaskDropped.viewId;
            }
            if ((i & 2) != 0) {
                z = longTaskDropped.isFrozenFrame;
            }
            if ((i & 4) != 0) {
                time = longTaskDropped.eventTime;
            }
            return longTaskDropped.copy(str, z, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResetSession;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResetSession;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ResetSession extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.rum.internal.domain.Time eventTime;

        public /* synthetic */ ResetSession(com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResetSession(com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ResetSession(eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResetSession) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, ((com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResetSession) other).eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResetSession copy(com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResetSession(eventTime);
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResetSession copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResetSession resetSession, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                time = resetSession.eventTime;
            }
            return resetSession.copy(time);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ResetSession() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ApplicationStarted;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "", "applicationStartupNanos", "<init>", "(Lcom/datadog/android/rum/internal/domain/Time;J)V", "component1", "()Lcom/datadog/android/rum/internal/domain/Time;", "component2", "()J", "copy", "(Lcom/datadog/android/rum/internal/domain/Time;J)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ApplicationStarted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getApplicationStartupNanos", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ApplicationStarted extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final long applicationStartupNanos;
        private final com.datadog.android.rum.internal.domain.Time eventTime;

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        public final long getApplicationStartupNanos() {
            return this.applicationStartupNanos;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApplicationStarted(com.datadog.android.rum.internal.domain.Time time, long j) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.eventTime = time;
            this.applicationStartupNanos = j;
        }

        public final java.lang.String toString() {
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            long j = this.applicationStartupNanos;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ApplicationStarted(eventTime=");
            sb.append(time);
            sb.append(", applicationStartupNanos=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.eventTime.hashCode() * 31) + java.lang.Long.hashCode(this.applicationStartupNanos);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.ApplicationStarted)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.ApplicationStarted applicationStarted = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.ApplicationStarted) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, applicationStarted.eventTime) && this.applicationStartupNanos == applicationStarted.applicationStartupNanos;
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.ApplicationStarted copy(com.datadog.android.rum.internal.domain.Time eventTime, long applicationStartupNanos) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.ApplicationStarted(eventTime, applicationStartupNanos);
        }

        /* renamed from: component2, reason: from getter */
        public final long getApplicationStartupNanos() {
            return this.applicationStartupNanos;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.ApplicationStarted copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.ApplicationStarted applicationStarted, com.datadog.android.rum.internal.domain.Time time, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                time = applicationStarted.eventTime;
            }
            if ((i & 2) != 0) {
                j = applicationStarted.applicationStartupNanos;
            }
            return applicationStarted.copy(time, j);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddCustomTiming;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", "name", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddCustomTiming;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Ljava/lang/String;", "getName"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AddCustomTiming extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final java.lang.String name;

        public final java.lang.String getName() {
            return this.name;
        }

        public /* synthetic */ AddCustomTiming(java.lang.String str, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddCustomTiming(java.lang.String str, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.name = str;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddCustomTiming(name=");
            sb.append(str);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.name.hashCode() * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddCustomTiming)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddCustomTiming addCustomTiming = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddCustomTiming) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, addCustomTiming.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, addCustomTiming.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddCustomTiming copy(java.lang.String name2, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddCustomTiming(name2, eventTime);
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddCustomTiming copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddCustomTiming addCustomTiming, java.lang.String str, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = addCustomTiming.name;
            }
            if ((i & 2) != 0) {
                time = addCustomTiming.eventTime;
            }
            return addCustomTiming.copy(str, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddViewLoadingTime;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", "overwrite", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(ZLcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Z", "component2", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(ZLcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddViewLoadingTime;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Z", "getOverwrite"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AddViewLoadingTime extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final boolean overwrite;

        public final boolean getOverwrite() {
            return this.overwrite;
        }

        public /* synthetic */ AddViewLoadingTime(boolean z, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddViewLoadingTime(boolean z, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.overwrite = z;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            boolean z = this.overwrite;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddViewLoadingTime(overwrite=");
            sb.append(z);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Boolean.hashCode(this.overwrite) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddViewLoadingTime)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddViewLoadingTime addViewLoadingTime = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddViewLoadingTime) other;
            return this.overwrite == addViewLoadingTime.overwrite && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, addViewLoadingTime.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddViewLoadingTime copy(boolean overwrite, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddViewLoadingTime(overwrite, eventTime);
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getOverwrite() {
            return this.overwrite;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddViewLoadingTime copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddViewLoadingTime addViewLoadingTime, boolean z, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = addViewLoadingTime.overwrite;
            }
            if ((i & 2) != 0) {
                time = addViewLoadingTime.eventTime;
            }
            return addViewLoadingTime.copy(z, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddViewAttributes;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Ljava/util/Map;", "component2", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddViewAttributes;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getAttributes", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AddViewAttributes extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final java.util.Map<java.lang.String, java.lang.Object> attributes;
        private final com.datadog.android.rum.internal.domain.Time eventTime;

        public final java.util.Map<java.lang.String, java.lang.Object> getAttributes() {
            return this.attributes;
        }

        public /* synthetic */ AddViewAttributes(java.util.Map map, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(map, (i & 2) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddViewAttributes(java.util.Map<java.lang.String, ? extends java.lang.Object> map, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.attributes = map;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            java.util.Map<java.lang.String, java.lang.Object> map = this.attributes;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddViewAttributes(attributes=");
            sb.append(map);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.attributes.hashCode() * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddViewAttributes)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddViewAttributes addViewAttributes = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddViewAttributes) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.attributes, addViewAttributes.attributes) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, addViewAttributes.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddViewAttributes copy(java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddViewAttributes(attributes, eventTime);
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component1() {
            return this.attributes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddViewAttributes copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddViewAttributes addViewAttributes, java.util.Map map, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                map = addViewAttributes.attributes;
            }
            if ((i & 2) != 0) {
                time = addViewAttributes.eventTime;
            }
            return addViewAttributes.copy(map, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$RemoveViewAttributes;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Ljava/util/Collection;Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Ljava/util/Collection;", "component2", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Ljava/util/Collection;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$RemoveViewAttributes;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/Collection;", "getAttributes", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class RemoveViewAttributes extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final java.util.Collection<java.lang.String> attributes;
        private final com.datadog.android.rum.internal.domain.Time eventTime;

        public final java.util.Collection<java.lang.String> getAttributes() {
            return this.attributes;
        }

        public /* synthetic */ RemoveViewAttributes(java.util.Collection collection, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(collection, (i & 2) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoveViewAttributes(java.util.Collection<java.lang.String> collection, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.attributes = collection;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            java.util.Collection<java.lang.String> collection = this.attributes;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RemoveViewAttributes(attributes=");
            sb.append(collection);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.attributes.hashCode() * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.RemoveViewAttributes)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.RemoveViewAttributes removeViewAttributes = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.RemoveViewAttributes) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.attributes, removeViewAttributes.attributes) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, removeViewAttributes.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.RemoveViewAttributes copy(java.util.Collection<java.lang.String> attributes, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.RemoveViewAttributes(attributes, eventTime);
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        public final java.util.Collection<java.lang.String> component1() {
            return this.attributes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.RemoveViewAttributes copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.RemoveViewAttributes removeViewAttributes, java.util.Collection collection, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                collection = removeViewAttributes.attributes;
            }
            if ((i & 2) != 0) {
                time = removeViewAttributes.eventTime;
            }
            return removeViewAttributes.copy(collection, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\r"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddLongTask;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", "durationNs", "", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(JLjava/lang/String;Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(JLjava/lang/String;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddLongTask;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "J", "getDurationNs", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Ljava/lang/String;", "getTarget"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AddLongTask extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final long durationNs;
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final java.lang.String target;

        public final long getDurationNs() {
            return this.durationNs;
        }

        public final java.lang.String getTarget() {
            return this.target;
        }

        public /* synthetic */ AddLongTask(long j, java.lang.String str, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(j, str, (i & 4) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddLongTask(long j, java.lang.String str, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.durationNs = j;
            this.target = str;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            long j = this.durationNs;
            java.lang.String str = this.target;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddLongTask(durationNs=");
            sb.append(j);
            sb.append(", target=");
            sb.append(str);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((java.lang.Long.hashCode(this.durationNs) * 31) + this.target.hashCode()) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddLongTask)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddLongTask addLongTask = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddLongTask) other;
            return this.durationNs == addLongTask.durationNs && kotlin.jvm.internal.Intrinsics.areEqual(this.target, addLongTask.target) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, addLongTask.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddLongTask copy(long durationNs, java.lang.String target, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddLongTask(durationNs, target, eventTime);
        }

        /* renamed from: component3, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTarget() {
            return this.target;
        }

        /* renamed from: component1, reason: from getter */
        public final long getDurationNs() {
            return this.durationNs;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddLongTask copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddLongTask addLongTask, long j, java.lang.String str, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = addLongTask.durationNs;
            }
            if ((i & 2) != 0) {
                str = addLongTask.target;
            }
            if ((i & 4) != 0) {
                time = addLongTask.eventTime;
            }
            return addLongTask.copy(j, str, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SendCustomActionNow;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SendCustomActionNow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SendCustomActionNow extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.rum.internal.domain.Time eventTime;

        public /* synthetic */ SendCustomActionNow(com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendCustomActionNow(com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SendCustomActionNow(eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.SendCustomActionNow) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, ((com.datadog.android.rum.internal.domain.scope.RumRawEvent.SendCustomActionNow) other).eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.SendCustomActionNow copy(com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.SendCustomActionNow(eventTime);
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.SendCustomActionNow copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.SendCustomActionNow sendCustomActionNow, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                time = sendCustomActionNow.eventTime;
            }
            return sendCustomActionNow.copy(time);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SendCustomActionNow() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\r"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddFeatureFlagEvaluation;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", "name", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Ljava/lang/String;Ljava/lang/Object;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddFeatureFlagEvaluation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Ljava/lang/String;", "getName", "Ljava/lang/Object;", "getValue"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AddFeatureFlagEvaluation extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final java.lang.String name;
        private final java.lang.Object value;

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.Object getValue() {
            return this.value;
        }

        public /* synthetic */ AddFeatureFlagEvaluation(java.lang.String str, java.lang.Object obj, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, obj, (i & 4) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddFeatureFlagEvaluation(java.lang.String str, java.lang.Object obj, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.name = str;
            this.value = obj;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.Object obj = this.value;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddFeatureFlagEvaluation(name=");
            sb.append(str);
            sb.append(", value=");
            sb.append(obj);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.name.hashCode() * 31) + this.value.hashCode()) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddFeatureFlagEvaluation)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddFeatureFlagEvaluation addFeatureFlagEvaluation = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddFeatureFlagEvaluation) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, addFeatureFlagEvaluation.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, addFeatureFlagEvaluation.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, addFeatureFlagEvaluation.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddFeatureFlagEvaluation copy(java.lang.String name2, java.lang.Object value, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddFeatureFlagEvaluation(name2, value, eventTime);
        }

        /* renamed from: component3, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddFeatureFlagEvaluation copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddFeatureFlagEvaluation addFeatureFlagEvaluation, java.lang.String str, java.lang.Object obj, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = addFeatureFlagEvaluation.name;
            }
            if ((i & 2) != 0) {
                obj = addFeatureFlagEvaluation.value;
            }
            if ((i & 4) != 0) {
                time = addFeatureFlagEvaluation.eventTime;
            }
            return addFeatureFlagEvaluation.copy(str, obj, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\rR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddFeatureFlagEvaluations;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", "", "", "featureFlags", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Ljava/util/Map;", "component2", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddFeatureFlagEvaluations;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Ljava/util/Map;", "getFeatureFlags"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AddFeatureFlagEvaluations extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final java.util.Map<java.lang.String, java.lang.Object> featureFlags;

        public final java.util.Map<java.lang.String, java.lang.Object> getFeatureFlags() {
            return this.featureFlags;
        }

        public /* synthetic */ AddFeatureFlagEvaluations(java.util.Map map, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(map, (i & 2) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddFeatureFlagEvaluations(java.util.Map<java.lang.String, ? extends java.lang.Object> map, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.featureFlags = map;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            java.util.Map<java.lang.String, java.lang.Object> map = this.featureFlags;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddFeatureFlagEvaluations(featureFlags=");
            sb.append(map);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.featureFlags.hashCode() * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddFeatureFlagEvaluations)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddFeatureFlagEvaluations addFeatureFlagEvaluations = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddFeatureFlagEvaluations) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.featureFlags, addFeatureFlagEvaluations.featureFlags) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, addFeatureFlagEvaluations.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddFeatureFlagEvaluations copy(java.util.Map<java.lang.String, ? extends java.lang.Object> featureFlags, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureFlags, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddFeatureFlagEvaluations(featureFlags, eventTime);
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component1() {
            return this.featureFlags;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddFeatureFlagEvaluations copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddFeatureFlagEvaluations addFeatureFlagEvaluations, java.util.Map map, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                map = addFeatureFlagEvaluations.featureFlags;
            }
            if ((i & 2) != 0) {
                time = addFeatureFlagEvaluations.eventTime;
            }
            return addFeatureFlagEvaluations.copy(map, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopSession;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopSession;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StopSession extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.rum.internal.domain.Time eventTime;

        public /* synthetic */ StopSession(com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopSession(com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StopSession(eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopSession) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, ((com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopSession) other).eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopSession copy(com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopSession(eventTime);
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopSession copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopSession stopSession, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                time = stopSession.eventTime;
            }
            return stopSession.copy(time);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public StopSession() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\r"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$UpdatePerformanceMetric;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "Lcom/datadog/android/rum/RumPerformanceMetric;", "metric", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Lcom/datadog/android/rum/RumPerformanceMetric;DLcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Lcom/datadog/android/rum/RumPerformanceMetric;", "component2", "()D", "component3", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Lcom/datadog/android/rum/RumPerformanceMetric;DLcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$UpdatePerformanceMetric;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Lcom/datadog/android/rum/RumPerformanceMetric;", "getMetric", "D", "getValue"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class UpdatePerformanceMetric extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final com.datadog.android.rum.RumPerformanceMetric metric;
        private final double value;

        public final com.datadog.android.rum.RumPerformanceMetric getMetric() {
            return this.metric;
        }

        public final double getValue() {
            return this.value;
        }

        public /* synthetic */ UpdatePerformanceMetric(com.datadog.android.rum.RumPerformanceMetric rumPerformanceMetric, double d, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(rumPerformanceMetric, d, (i & 4) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdatePerformanceMetric(com.datadog.android.rum.RumPerformanceMetric rumPerformanceMetric, double d, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumPerformanceMetric, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.metric = rumPerformanceMetric;
            this.value = d;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            com.datadog.android.rum.RumPerformanceMetric rumPerformanceMetric = this.metric;
            double d = this.value;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdatePerformanceMetric(metric=");
            sb.append(rumPerformanceMetric);
            sb.append(", value=");
            sb.append(d);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.metric.hashCode() * 31) + java.lang.Double.hashCode(this.value)) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.UpdatePerformanceMetric)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.UpdatePerformanceMetric updatePerformanceMetric = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.UpdatePerformanceMetric) other;
            return this.metric == updatePerformanceMetric.metric && java.lang.Double.compare(this.value, updatePerformanceMetric.value) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, updatePerformanceMetric.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.UpdatePerformanceMetric copy(com.datadog.android.rum.RumPerformanceMetric metric, double value, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metric, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.UpdatePerformanceMetric(metric, value, eventTime);
        }

        /* renamed from: component3, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* renamed from: component2, reason: from getter */
        public final double getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.RumPerformanceMetric getMetric() {
            return this.metric;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.UpdatePerformanceMetric copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.UpdatePerformanceMetric updatePerformanceMetric, com.datadog.android.rum.RumPerformanceMetric rumPerformanceMetric, double d, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                rumPerformanceMetric = updatePerformanceMetric.metric;
            }
            if ((i & 2) != 0) {
                d = updatePerformanceMetric.value;
            }
            if ((i & 4) != 0) {
                time = updatePerformanceMetric.eventTime;
            }
            return updatePerformanceMetric.copy(rumPerformanceMetric, d, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$UpdateExternalRefreshRate;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", "frameTimeSeconds", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(DLcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()D", "component2", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(DLcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$UpdateExternalRefreshRate;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "D", "getFrameTimeSeconds"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class UpdateExternalRefreshRate extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final double frameTimeSeconds;

        public final double getFrameTimeSeconds() {
            return this.frameTimeSeconds;
        }

        public /* synthetic */ UpdateExternalRefreshRate(double d, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(d, (i & 2) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateExternalRefreshRate(double d, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.frameTimeSeconds = d;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            double d = this.frameTimeSeconds;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateExternalRefreshRate(frameTimeSeconds=");
            sb.append(d);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Double.hashCode(this.frameTimeSeconds) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.UpdateExternalRefreshRate)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.UpdateExternalRefreshRate updateExternalRefreshRate = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.UpdateExternalRefreshRate) other;
            return java.lang.Double.compare(this.frameTimeSeconds, updateExternalRefreshRate.frameTimeSeconds) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, updateExternalRefreshRate.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.UpdateExternalRefreshRate copy(double frameTimeSeconds, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.UpdateExternalRefreshRate(frameTimeSeconds, eventTime);
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* renamed from: component1, reason: from getter */
        public final double getFrameTimeSeconds() {
            return this.frameTimeSeconds;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.UpdateExternalRefreshRate copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.UpdateExternalRefreshRate updateExternalRefreshRate, double d, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                d = updateExternalRefreshRate.frameTimeSeconds;
            }
            if ((i & 2) != 0) {
                time = updateExternalRefreshRate.eventTime;
            }
            return updateExternalRefreshRate.copy(d, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\r"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SetInternalViewAttribute;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", "key", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Ljava/lang/String;Ljava/lang/Object;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SetInternalViewAttribute;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Ljava/lang/String;", "getKey", "Ljava/lang/Object;", "getValue"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SetInternalViewAttribute extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final java.lang.String key;
        private final java.lang.Object value;

        public final java.lang.String getKey() {
            return this.key;
        }

        public final java.lang.Object getValue() {
            return this.value;
        }

        public /* synthetic */ SetInternalViewAttribute(java.lang.String str, java.lang.Object obj, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, obj, (i & 4) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetInternalViewAttribute(java.lang.String str, java.lang.Object obj, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.key = str;
            this.value = obj;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.key;
            java.lang.Object obj = this.value;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SetInternalViewAttribute(key=");
            sb.append(str);
            sb.append(", value=");
            sb.append(obj);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.key.hashCode();
            java.lang.Object obj = this.value;
            return (((hashCode * 31) + (obj == null ? 0 : obj.hashCode())) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.SetInternalViewAttribute)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.SetInternalViewAttribute setInternalViewAttribute = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.SetInternalViewAttribute) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.key, setInternalViewAttribute.key) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, setInternalViewAttribute.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, setInternalViewAttribute.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.SetInternalViewAttribute copy(java.lang.String key, java.lang.Object value, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.SetInternalViewAttribute(key, value, eventTime);
        }

        /* renamed from: component3, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getKey() {
            return this.key;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.SetInternalViewAttribute copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.SetInternalViewAttribute setInternalViewAttribute, java.lang.String str, java.lang.Object obj, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = setInternalViewAttribute.key;
            }
            if ((i & 2) != 0) {
                obj = setInternalViewAttribute.value;
            }
            if ((i & 4) != 0) {
                time = setInternalViewAttribute.eventTime;
            }
            return setInternalViewAttribute.copy(str, obj, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SetSyntheticsTestAttribute;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", "testId", "resultId", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SetSyntheticsTestAttribute;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Ljava/lang/String;", "getResultId", "getTestId"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SetSyntheticsTestAttribute extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final java.lang.String resultId;
        private final java.lang.String testId;

        public final java.lang.String getTestId() {
            return this.testId;
        }

        public final java.lang.String getResultId() {
            return this.resultId;
        }

        public /* synthetic */ SetSyntheticsTestAttribute(java.lang.String str, java.lang.String str2, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetSyntheticsTestAttribute(java.lang.String str, java.lang.String str2, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.testId = str;
            this.resultId = str2;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.testId;
            java.lang.String str2 = this.resultId;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SetSyntheticsTestAttribute(testId=");
            sb.append(str);
            sb.append(", resultId=");
            sb.append(str2);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.testId.hashCode() * 31) + this.resultId.hashCode()) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.SetSyntheticsTestAttribute)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.SetSyntheticsTestAttribute setSyntheticsTestAttribute = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.SetSyntheticsTestAttribute) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.testId, setSyntheticsTestAttribute.testId) && kotlin.jvm.internal.Intrinsics.areEqual(this.resultId, setSyntheticsTestAttribute.resultId) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, setSyntheticsTestAttribute.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.SetSyntheticsTestAttribute copy(java.lang.String testId, java.lang.String resultId, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(testId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.SetSyntheticsTestAttribute(testId, resultId, eventTime);
        }

        /* renamed from: component3, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getResultId() {
            return this.resultId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTestId() {
            return this.testId;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.SetSyntheticsTestAttribute copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.SetSyntheticsTestAttribute setSyntheticsTestAttribute, java.lang.String str, java.lang.String str2, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = setSyntheticsTestAttribute.testId;
            }
            if ((i & 2) != 0) {
                str2 = setSyntheticsTestAttribute.resultId;
            }
            if ((i & 4) != 0) {
                time = setSyntheticsTestAttribute.eventTime;
            }
            return setSyntheticsTestAttribute.copy(str, str2, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$WebViewEvent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$WebViewEvent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class WebViewEvent extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.rum.internal.domain.Time eventTime;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewEvent(com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.eventTime = time;
        }

        public /* synthetic */ WebViewEvent(com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        public final java.lang.String toString() {
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WebViewEvent(eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.WebViewEvent) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, ((com.datadog.android.rum.internal.domain.scope.RumRawEvent.WebViewEvent) other).eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.WebViewEvent copy(com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.WebViewEvent(eventTime);
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.WebViewEvent copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.WebViewEvent webViewEvent, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                time = webViewEvent.eventTime;
            }
            return webViewEvent.copy(time);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WebViewEvent() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$TelemetryEventWrapper;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "event", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "component2", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$TelemetryEventWrapper;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "getEvent", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TelemetryEventWrapper extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.internal.telemetry.InternalTelemetryEvent event;
        private final com.datadog.android.rum.internal.domain.Time eventTime;

        public final com.datadog.android.internal.telemetry.InternalTelemetryEvent getEvent() {
            return this.event;
        }

        public /* synthetic */ TelemetryEventWrapper(com.datadog.android.internal.telemetry.InternalTelemetryEvent internalTelemetryEvent, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(internalTelemetryEvent, (i & 2) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TelemetryEventWrapper(com.datadog.android.internal.telemetry.InternalTelemetryEvent internalTelemetryEvent, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTelemetryEvent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.event = internalTelemetryEvent;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            com.datadog.android.internal.telemetry.InternalTelemetryEvent internalTelemetryEvent = this.event;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TelemetryEventWrapper(event=");
            sb.append(internalTelemetryEvent);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.event.hashCode() * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.TelemetryEventWrapper)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.TelemetryEventWrapper telemetryEventWrapper = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.TelemetryEventWrapper) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.event, telemetryEventWrapper.event) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, telemetryEventWrapper.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.TelemetryEventWrapper copy(com.datadog.android.internal.telemetry.InternalTelemetryEvent event, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.TelemetryEventWrapper(event, eventTime);
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.internal.telemetry.InternalTelemetryEvent getEvent() {
            return this.event;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.TelemetryEventWrapper copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.TelemetryEventWrapper telemetryEventWrapper, com.datadog.android.internal.telemetry.InternalTelemetryEvent internalTelemetryEvent, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                internalTelemetryEvent = telemetryEventWrapper.event;
            }
            if ((i & 2) != 0) {
                time = telemetryEventWrapper.eventTime;
            }
            return telemetryEventWrapper.copy(internalTelemetryEvent, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u0003\u0010\t"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SdkInit;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", "isAppInForeground", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(ZLcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Z", "component2", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(ZLcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SdkInit;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SdkInit extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final boolean isAppInForeground;

        public final boolean isAppInForeground() {
            return this.isAppInForeground;
        }

        public /* synthetic */ SdkInit(boolean z, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SdkInit(boolean z, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.isAppInForeground = z;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            boolean z = this.isAppInForeground;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SdkInit(isAppInForeground=");
            sb.append(z);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Boolean.hashCode(this.isAppInForeground) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.SdkInit)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.SdkInit sdkInit = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.SdkInit) other;
            return this.isAppInForeground == sdkInit.isAppInForeground && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, sdkInit.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.SdkInit copy(boolean isAppInForeground, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.SdkInit(isAppInForeground, eventTime);
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsAppInForeground() {
            return this.isAppInForeground;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.SdkInit copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.SdkInit sdkInit, boolean z, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = sdkInit.isAppInForeground;
            }
            if ((i & 2) != 0) {
                time = sdkInit.eventTime;
            }
            return sdkInit.copy(z, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u001e\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JH\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010R\u001a\u0010\t\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartFeatureOperation;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", "name", "operationKey", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "component4", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartFeatureOperation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/Map;", "getAttributes", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Ljava/lang/String;", "getName", "getOperationKey"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StartFeatureOperation extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final java.util.Map<java.lang.String, java.lang.Object> attributes;
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final java.lang.String name;
        private final java.lang.String operationKey;

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getOperationKey() {
            return this.operationKey;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getAttributes() {
            return this.attributes;
        }

        public /* synthetic */ StartFeatureOperation(java.lang.String str, java.lang.String str2, java.util.Map map, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, map, (i & 8) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartFeatureOperation(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, ? extends java.lang.Object> map, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.name = str;
            this.operationKey = str2;
            this.attributes = map;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.String str2 = this.operationKey;
            java.util.Map<java.lang.String, java.lang.Object> map = this.attributes;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StartFeatureOperation(name=");
            sb.append(str);
            sb.append(", operationKey=");
            sb.append(str2);
            sb.append(", attributes=");
            sb.append(map);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            java.lang.String str = this.operationKey;
            return (((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.attributes.hashCode()) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartFeatureOperation)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartFeatureOperation startFeatureOperation = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartFeatureOperation) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, startFeatureOperation.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.operationKey, startFeatureOperation.operationKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.attributes, startFeatureOperation.attributes) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, startFeatureOperation.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartFeatureOperation copy(java.lang.String name2, java.lang.String operationKey, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartFeatureOperation(name2, operationKey, attributes, eventTime);
        }

        /* renamed from: component4, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component3() {
            return this.attributes;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getOperationKey() {
            return this.operationKey;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartFeatureOperation copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartFeatureOperation startFeatureOperation, java.lang.String str, java.lang.String str2, java.util.Map map, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = startFeatureOperation.name;
            }
            if ((i & 2) != 0) {
                str2 = startFeatureOperation.operationKey;
            }
            if ((i & 4) != 0) {
                map = startFeatureOperation.attributes;
            }
            if ((i & 8) != 0) {
                time = startFeatureOperation.eventTime;
            }
            return startFeatureOperation.copy(str, str2, map, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u001e\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JT\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u000fR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0007¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopFeatureOperation;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", "name", "operationKey", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Lcom/datadog/android/rum/featureoperations/FailureReason;", "failureReason", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/datadog/android/rum/featureoperations/FailureReason;Lcom/datadog/android/rum/internal/domain/Time;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "component4", "()Lcom/datadog/android/rum/featureoperations/FailureReason;", "component5", "()Lcom/datadog/android/rum/internal/domain/Time;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/datadog/android/rum/featureoperations/FailureReason;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopFeatureOperation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/Map;", "getAttributes", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "Lcom/datadog/android/rum/featureoperations/FailureReason;", "getFailureReason", "Ljava/lang/String;", "getName", "getOperationKey"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StopFeatureOperation extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final java.util.Map<java.lang.String, java.lang.Object> attributes;
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final com.datadog.android.rum.featureoperations.FailureReason failureReason;
        private final java.lang.String name;
        private final java.lang.String operationKey;

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getOperationKey() {
            return this.operationKey;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getAttributes() {
            return this.attributes;
        }

        public final com.datadog.android.rum.featureoperations.FailureReason getFailureReason() {
            return this.failureReason;
        }

        public /* synthetic */ StopFeatureOperation(java.lang.String str, java.lang.String str2, java.util.Map map, com.datadog.android.rum.featureoperations.FailureReason failureReason, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, map, (i & 8) != 0 ? null : failureReason, (i & 16) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopFeatureOperation(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, ? extends java.lang.Object> map, com.datadog.android.rum.featureoperations.FailureReason failureReason, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.name = str;
            this.operationKey = str2;
            this.attributes = map;
            this.failureReason = failureReason;
            this.eventTime = time;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.String str2 = this.operationKey;
            java.util.Map<java.lang.String, java.lang.Object> map = this.attributes;
            com.datadog.android.rum.featureoperations.FailureReason failureReason = this.failureReason;
            com.datadog.android.rum.internal.domain.Time time = this.eventTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StopFeatureOperation(name=");
            sb.append(str);
            sb.append(", operationKey=");
            sb.append(str2);
            sb.append(", attributes=");
            sb.append(map);
            sb.append(", failureReason=");
            sb.append(failureReason);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            java.lang.String str = this.operationKey;
            int hashCode2 = str == null ? 0 : str.hashCode();
            int hashCode3 = this.attributes.hashCode();
            com.datadog.android.rum.featureoperations.FailureReason failureReason = this.failureReason;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (failureReason != null ? failureReason.hashCode() : 0)) * 31) + this.eventTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopFeatureOperation)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopFeatureOperation stopFeatureOperation = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopFeatureOperation) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, stopFeatureOperation.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.operationKey, stopFeatureOperation.operationKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.attributes, stopFeatureOperation.attributes) && this.failureReason == stopFeatureOperation.failureReason && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, stopFeatureOperation.eventTime);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopFeatureOperation copy(java.lang.String name2, java.lang.String operationKey, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, com.datadog.android.rum.featureoperations.FailureReason failureReason, com.datadog.android.rum.internal.domain.Time eventTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            return new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopFeatureOperation(name2, operationKey, attributes, failureReason, eventTime);
        }

        /* renamed from: component5, reason: from getter */
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* renamed from: component4, reason: from getter */
        public final com.datadog.android.rum.featureoperations.FailureReason getFailureReason() {
            return this.failureReason;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component3() {
            return this.attributes;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getOperationKey() {
            return this.operationKey;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopFeatureOperation copy$default(com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopFeatureOperation stopFeatureOperation, java.lang.String str, java.lang.String str2, java.util.Map map, com.datadog.android.rum.featureoperations.FailureReason failureReason, com.datadog.android.rum.internal.domain.Time time, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stopFeatureOperation.name;
            }
            if ((i & 2) != 0) {
                str2 = stopFeatureOperation.operationKey;
            }
            java.lang.String str3 = str2;
            if ((i & 4) != 0) {
                map = stopFeatureOperation.attributes;
            }
            java.util.Map map2 = map;
            if ((i & 8) != 0) {
                failureReason = stopFeatureOperation.failureReason;
            }
            com.datadog.android.rum.featureoperations.FailureReason failureReason2 = failureReason;
            if ((i & 16) != 0) {
                time = stopFeatureOperation.eventTime;
            }
            return stopFeatureOperation.copy(str, str3, map2, failureReason2, time);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AppStartEvent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "Lcom/datadog/android/rum/internal/startup/RumStartupScenario;", com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporterImpl.KEY_SCENARIO, "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Lcom/datadog/android/rum/internal/startup/RumStartupScenario;Lcom/datadog/android/rum/internal/domain/Time;)V", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "Lcom/datadog/android/rum/internal/startup/RumStartupScenario;", "getScenario", "()Lcom/datadog/android/rum/internal/startup/RumStartupScenario;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AppStartEvent extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final com.datadog.android.rum.internal.startup.RumStartupScenario scenario;

        public final com.datadog.android.rum.internal.startup.RumStartupScenario getScenario() {
            return this.scenario;
        }

        public /* synthetic */ AppStartEvent(com.datadog.android.rum.internal.startup.RumStartupScenario rumStartupScenario, com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(rumStartupScenario, (i & 2) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppStartEvent(com.datadog.android.rum.internal.startup.RumStartupScenario rumStartupScenario, com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumStartupScenario, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.scenario = rumStartupScenario;
            this.eventTime = time;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AppStartTTIDEvent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "Lcom/datadog/android/rum/internal/startup/RumTTIDInfo;", "info", "<init>", "(Lcom/datadog/android/rum/internal/domain/Time;Lcom/datadog/android/rum/internal/startup/RumTTIDInfo;)V", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "Lcom/datadog/android/rum/internal/startup/RumTTIDInfo;", "getInfo", "()Lcom/datadog/android/rum/internal/startup/RumTTIDInfo;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AppStartTTIDEvent extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.rum.internal.domain.Time eventTime;
        private final com.datadog.android.rum.internal.startup.RumTTIDInfo info;

        public /* synthetic */ AppStartTTIDEvent(com.datadog.android.rum.internal.domain.Time time, com.datadog.android.rum.internal.startup.RumTTIDInfo rumTTIDInfo, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time, rumTTIDInfo);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        public final com.datadog.android.rum.internal.startup.RumTTIDInfo getInfo() {
            return this.info;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppStartTTIDEvent(com.datadog.android.rum.internal.domain.Time time, com.datadog.android.rum.internal.startup.RumTTIDInfo rumTTIDInfo) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumTTIDInfo, "");
            this.eventTime = time;
            this.info = rumTTIDInfo;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AppStartTTFDEvent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "<init>", "(Lcom/datadog/android/rum/internal/domain/Time;)V", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AppStartTTFDEvent extends com.datadog.android.rum.internal.domain.scope.RumRawEvent {
        private final com.datadog.android.rum.internal.domain.Time eventTime;

        public /* synthetic */ AppStartTTFDEvent(com.datadog.android.rum.internal.domain.Time time, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null) : time);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public final com.datadog.android.rum.internal.domain.Time getEventTime() {
            return this.eventTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppStartTTFDEvent(com.datadog.android.rum.internal.domain.Time time) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
            this.eventTime = time;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AppStartTTFDEvent() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ RumRawEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
