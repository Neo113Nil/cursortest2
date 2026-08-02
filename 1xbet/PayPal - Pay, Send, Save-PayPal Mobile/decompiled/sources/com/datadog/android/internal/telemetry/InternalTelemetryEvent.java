package com.datadog.android.internal.telemetry;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "", "<init>", "()V", "ApiUsage", com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "InterceptorInstantiated", "Log", "Metric", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Configuration;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$InterceptorInstantiated;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Log;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Metric;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class InternalTelemetryEvent {
    private InternalTelemetryEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR'\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0013\u0014"}, d2 = {"Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Log;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "", "p0", "", "", "p1", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "additionalProperties", "Ljava/util/Map;", "getAdditionalProperties", "()Ljava/util/Map;", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Debug", "Error", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Log$Debug;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Log$Error;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Log extends com.datadog.android.internal.telemetry.InternalTelemetryEvent {
        private final java.util.Map<java.lang.String, java.lang.Object> additionalProperties;
        private final java.lang.String message;

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Log$Debug;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Log;", "", "message", "", "", "additionalProperties", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Debug extends com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Debug(java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
                super(str, map, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            }
        }

        private Log(java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
            super(null);
            this.message = str;
            this.additionalProperties = map;
        }

        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000e\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0015\u0010\u000e"}, d2 = {"Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Log$Error;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Log;", "", "message", "", "", "additionalProperties", "", "error", "stacktrace", "kind", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)V", "resolveKind", "()Ljava/lang/String;", "resolveStacktrace", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "Ljava/lang/String;", "getKind", "getStacktrace"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Error extends com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log {
            private final java.lang.Throwable error;
            private final java.lang.String kind;
            private final java.lang.String stacktrace;

            public /* synthetic */ Error(java.lang.String str, java.util.Map map, java.lang.Throwable th, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : th, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
            }

            public final java.lang.Throwable getError() {
                return this.error;
            }

            public final java.lang.String getStacktrace() {
                return this.stacktrace;
            }

            public final java.lang.String getKind() {
                return this.kind;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.lang.Throwable th, java.lang.String str2, java.lang.String str3) {
                super(str, map, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.error = th;
                this.stacktrace = str2;
                this.kind = str3;
            }

            public final java.lang.String resolveKind() {
                java.lang.Class<?> cls;
                java.lang.Class<?> cls2;
                java.lang.String str = this.kind;
                if (str == null) {
                    java.lang.Throwable th = this.error;
                    str = (th == null || (cls2 = th.getClass()) == null) ? null : cls2.getCanonicalName();
                    if (str == null) {
                        java.lang.Throwable th2 = this.error;
                        if (th2 == null || (cls = th2.getClass()) == null) {
                            return null;
                        }
                        return cls.getSimpleName();
                    }
                }
                return str;
            }

            public final java.lang.String resolveStacktrace() {
                java.lang.String str = this.stacktrace;
                if (str != null) {
                    return str;
                }
                java.lang.Throwable th = this.error;
                if (th != null) {
                    return com.datadog.android.internal.utils.ThrowableExtKt.loggableStackTrace(th);
                }
                return null;
            }
        }

        public /* synthetic */ Log(java.lang.String str, java.util.Map map, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, map);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JL\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b'\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b(\u0010\u000e"}, d2 = {"Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Configuration;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "", "trackErrors", "", "batchSize", "batchUploadFrequency", "useProxy", "useLocalEncryption", "", "batchProcessingLevel", "<init>", "(ZJJZZI)V", "component1", "()Z", "component2", "()J", "component3", "component4", "component5", "component6", "()I", "copy", "(ZJJZZI)Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Configuration;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getBatchProcessingLevel", "J", "getBatchSize", "getBatchUploadFrequency", "Z", "getTrackErrors", "getUseLocalEncryption", "getUseProxy"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class Configuration extends com.datadog.android.internal.telemetry.InternalTelemetryEvent {
        private final int batchProcessingLevel;
        private final long batchSize;
        private final long batchUploadFrequency;
        private final boolean trackErrors;
        private final boolean useLocalEncryption;
        private final boolean useProxy;

        public final boolean getTrackErrors() {
            return this.trackErrors;
        }

        public final long getBatchSize() {
            return this.batchSize;
        }

        public final long getBatchUploadFrequency() {
            return this.batchUploadFrequency;
        }

        public final boolean getUseProxy() {
            return this.useProxy;
        }

        public final boolean getUseLocalEncryption() {
            return this.useLocalEncryption;
        }

        public final int getBatchProcessingLevel() {
            return this.batchProcessingLevel;
        }

        public Configuration(boolean z, long j, long j2, boolean z2, boolean z3, int i) {
            super(null);
            this.trackErrors = z;
            this.batchSize = j;
            this.batchUploadFrequency = j2;
            this.useProxy = z2;
            this.useLocalEncryption = z3;
            this.batchProcessingLevel = i;
        }

        public final java.lang.String toString() {
            boolean z = this.trackErrors;
            long j = this.batchSize;
            long j2 = this.batchUploadFrequency;
            boolean z2 = this.useProxy;
            boolean z3 = this.useLocalEncryption;
            int i = this.batchProcessingLevel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Configuration(trackErrors=");
            sb.append(z);
            sb.append(", batchSize=");
            sb.append(j);
            sb.append(", batchUploadFrequency=");
            sb.append(j2);
            sb.append(", useProxy=");
            sb.append(z2);
            sb.append(", useLocalEncryption=");
            sb.append(z3);
            sb.append(", batchProcessingLevel=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((java.lang.Boolean.hashCode(this.trackErrors) * 31) + java.lang.Long.hashCode(this.batchSize)) * 31) + java.lang.Long.hashCode(this.batchUploadFrequency)) * 31) + java.lang.Boolean.hashCode(this.useProxy)) * 31) + java.lang.Boolean.hashCode(this.useLocalEncryption)) * 31) + java.lang.Integer.hashCode(this.batchProcessingLevel);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.internal.telemetry.InternalTelemetryEvent.Configuration)) {
                return false;
            }
            com.datadog.android.internal.telemetry.InternalTelemetryEvent.Configuration configuration = (com.datadog.android.internal.telemetry.InternalTelemetryEvent.Configuration) other;
            return this.trackErrors == configuration.trackErrors && this.batchSize == configuration.batchSize && this.batchUploadFrequency == configuration.batchUploadFrequency && this.useProxy == configuration.useProxy && this.useLocalEncryption == configuration.useLocalEncryption && this.batchProcessingLevel == configuration.batchProcessingLevel;
        }

        public final com.datadog.android.internal.telemetry.InternalTelemetryEvent.Configuration copy(boolean trackErrors, long batchSize, long batchUploadFrequency, boolean useProxy, boolean useLocalEncryption, int batchProcessingLevel) {
            return new com.datadog.android.internal.telemetry.InternalTelemetryEvent.Configuration(trackErrors, batchSize, batchUploadFrequency, useProxy, useLocalEncryption, batchProcessingLevel);
        }

        /* renamed from: component6, reason: from getter */
        public final int getBatchProcessingLevel() {
            return this.batchProcessingLevel;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getUseLocalEncryption() {
            return this.useLocalEncryption;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getUseProxy() {
            return this.useProxy;
        }

        /* renamed from: component3, reason: from getter */
        public final long getBatchUploadFrequency() {
            return this.batchUploadFrequency;
        }

        /* renamed from: component2, reason: from getter */
        public final long getBatchSize() {
            return this.batchSize;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getTrackErrors() {
            return this.trackErrors;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR'\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Metric;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "", "message", "", "", "additionalProperties", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Metric;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/Map;", "getAdditionalProperties", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class Metric extends com.datadog.android.internal.telemetry.InternalTelemetryEvent {
        private final java.util.Map<java.lang.String, java.lang.Object> additionalProperties;
        private final java.lang.String message;

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Metric(java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.additionalProperties = map;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.util.Map<java.lang.String, java.lang.Object> map = this.additionalProperties;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Metric(message=");
            sb.append(str);
            sb.append(", additionalProperties=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            java.util.Map<java.lang.String, java.lang.Object> map = this.additionalProperties;
            return (hashCode * 31) + (map == null ? 0 : map.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.internal.telemetry.InternalTelemetryEvent.Metric)) {
                return false;
            }
            com.datadog.android.internal.telemetry.InternalTelemetryEvent.Metric metric = (com.datadog.android.internal.telemetry.InternalTelemetryEvent.Metric) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, metric.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalProperties, metric.additionalProperties);
        }

        public final com.datadog.android.internal.telemetry.InternalTelemetryEvent.Metric copy(java.lang.String message, java.util.Map<java.lang.String, ? extends java.lang.Object> additionalProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.datadog.android.internal.telemetry.InternalTelemetryEvent.Metric(message, additionalProperties);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component2() {
            return this.additionalProperties;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.internal.telemetry.InternalTelemetryEvent.Metric copy$default(com.datadog.android.internal.telemetry.InternalTelemetryEvent.Metric metric, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = metric.message;
            }
            if ((i & 2) != 0) {
                map = metric.additionalProperties;
            }
            return metric.copy(str, map);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fB!\b\u0004\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0004\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "", "", "", "p0", "<init>", "(Ljava/util/Map;)V", "additionalProperties", "Ljava/util/Map;", "getAdditionalProperties", "()Ljava/util/Map;", "AddOperationStepVital", "AddViewLoadingTime", "NetworkInstrumentation", "TrackWebView", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$AddOperationStepVital;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$AddViewLoadingTime;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$NetworkInstrumentation;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$TrackWebView;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class ApiUsage extends com.datadog.android.internal.telemetry.InternalTelemetryEvent {
        private final java.util.Map<java.lang.String, java.lang.Object> additionalProperties;

        public /* synthetic */ ApiUsage(java.util.LinkedHashMap linkedHashMap, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new java.util.LinkedHashMap() : linkedHashMap, null);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        private ApiUsage(java.util.Map<java.lang.String, java.lang.Object> map) {
            super(null);
            this.additionalProperties = map;
        }

        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\u0010\u0010\u000e"}, d2 = {"Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$AddViewLoadingTime;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage;", "", "overwrite", "noView", "noActiveView", "", "", "", "additionalProperties", "<init>", "(ZZZLjava/util/Map;)V", "Z", "getNoActiveView", "()Z", "getNoView", "getOverwrite"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class AddViewLoadingTime extends com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage {
            private final boolean noActiveView;
            private final boolean noView;
            private final boolean overwrite;

            public final boolean getOverwrite() {
                return this.overwrite;
            }

            public final boolean getNoView() {
                return this.noView;
            }

            public final boolean getNoActiveView() {
                return this.noActiveView;
            }

            public /* synthetic */ AddViewLoadingTime(boolean z, boolean z2, boolean z3, java.util.LinkedHashMap linkedHashMap, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(z, z2, z3, (i & 8) != 0 ? new java.util.LinkedHashMap() : linkedHashMap);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddViewLoadingTime(boolean z, boolean z2, boolean z3, java.util.Map<java.lang.String, java.lang.Object> map) {
                super(map, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
                this.overwrite = z;
                this.noView = z2;
                this.noActiveView = z3;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$AddOperationStepVital;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$AddOperationStepVital$ActionType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_TYPE_KEY, "", "", "", "additionalProperties", "<init>", "(Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$AddOperationStepVital$ActionType;Ljava/util/Map;)V", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$AddOperationStepVital$ActionType;", "getActionType", "()Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$AddOperationStepVital$ActionType;", "ActionType"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class AddOperationStepVital extends com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage {
            private final com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.AddOperationStepVital.ActionType actionType;

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$AddOperationStepVital$ActionType;", "", "<init>", "(Ljava/lang/String;I)V", "START", "SUCCEED", "FAIL"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public enum ActionType {
                START,
                SUCCEED,
                FAIL
            }

            public final com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.AddOperationStepVital.ActionType getActionType() {
                return this.actionType;
            }

            public /* synthetic */ AddOperationStepVital(com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.AddOperationStepVital.ActionType actionType, java.util.LinkedHashMap linkedHashMap, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(actionType, (i & 2) != 0 ? new java.util.LinkedHashMap() : linkedHashMap);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddOperationStepVital(com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.AddOperationStepVital.ActionType actionType, java.util.Map<java.lang.String, java.lang.Object> map) {
                super(map, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionType, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
                this.actionType = actionType;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$TrackWebView;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage;", "", "", "", "additionalProperties", "<init>", "(Ljava/util/Map;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class TrackWebView extends com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage {
            public /* synthetic */ TrackWebView(java.util.LinkedHashMap linkedHashMap, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? new java.util.LinkedHashMap() : linkedHashMap);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TrackWebView(java.util.Map<java.lang.String, java.lang.Object> map) {
                super(map, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            }

            /* JADX WARN: Multi-variable type inference failed */
            public TrackWebView() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$NetworkInstrumentation;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$NetworkInstrumentation$LibraryType;", "type", "", "", "", "additionalProperties", "<init>", "(Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$NetworkInstrumentation$LibraryType;Ljava/util/Map;)V", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$NetworkInstrumentation$LibraryType;", "getType", "()Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$NetworkInstrumentation$LibraryType;", "LibraryType"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NetworkInstrumentation extends com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage {
            private final com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.NetworkInstrumentation.LibraryType type;

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$NetworkInstrumentation$LibraryType;", "", "<init>", "(Ljava/lang/String;I)V", "CRONET", "OKHTTP"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public enum LibraryType {
                CRONET,
                OKHTTP
            }

            public final com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.NetworkInstrumentation.LibraryType getType() {
                return this.type;
            }

            public /* synthetic */ NetworkInstrumentation(com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.NetworkInstrumentation.LibraryType libraryType, java.util.LinkedHashMap linkedHashMap, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(libraryType, (i & 2) != 0 ? new java.util.LinkedHashMap() : linkedHashMap);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NetworkInstrumentation(com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.NetworkInstrumentation.LibraryType libraryType, java.util.Map<java.lang.String, java.lang.Object> map) {
                super(map, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryType, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
                this.type = libraryType;
            }
        }

        public /* synthetic */ ApiUsage(java.util.Map map, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(map);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$InterceptorInstantiated;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class InterceptorInstantiated extends com.datadog.android.internal.telemetry.InternalTelemetryEvent {
        public static final com.datadog.android.internal.telemetry.InternalTelemetryEvent.InterceptorInstantiated INSTANCE = new com.datadog.android.internal.telemetry.InternalTelemetryEvent.InterceptorInstantiated();

        private InterceptorInstantiated() {
            super(null);
        }
    }

    public /* synthetic */ InternalTelemetryEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
