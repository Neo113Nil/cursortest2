package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/statsig/androidsdk/ExposureKey;", "", "<init>", "()V", "Config", "Gate", "Layer", "Lcom/statsig/androidsdk/ExposureKey$Config;", "Lcom/statsig/androidsdk/ExposureKey$Gate;", "Lcom/statsig/androidsdk/ExposureKey$Layer;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ExposureKey {
    private ExposureKey() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b \u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/statsig/androidsdk/ExposureKey$Gate;", "Lcom/statsig/androidsdk/ExposureKey;", "", "name", "ruleID", "Lcom/statsig/androidsdk/EvaluationReason;", "reason", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationReason;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/statsig/androidsdk/EvaluationReason;", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationReason;Z)Lcom/statsig/androidsdk/ExposureKey$Gate;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "Lcom/statsig/androidsdk/EvaluationReason;", "getReason", "getRuleID", "Z", "getValue"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Gate extends com.statsig.androidsdk.ExposureKey {
        private final java.lang.String name;
        private final com.statsig.androidsdk.EvaluationReason reason;
        private final java.lang.String ruleID;
        private final boolean value;

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getRuleID() {
            return this.ruleID;
        }

        public final com.statsig.androidsdk.EvaluationReason getReason() {
            return this.reason;
        }

        public final boolean getValue() {
            return this.value;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Gate(java.lang.String str, java.lang.String str2, com.statsig.androidsdk.EvaluationReason evaluationReason, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluationReason, "");
            this.name = str;
            this.ruleID = str2;
            this.reason = evaluationReason;
            this.value = z;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.String str2 = this.ruleID;
            com.statsig.androidsdk.EvaluationReason evaluationReason = this.reason;
            boolean z = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Gate(name=");
            sb.append(str);
            sb.append(", ruleID=");
            sb.append(str2);
            sb.append(", reason=");
            sb.append(evaluationReason);
            sb.append(", value=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.name.hashCode() * 31) + this.ruleID.hashCode()) * 31) + this.reason.hashCode()) * 31) + java.lang.Boolean.hashCode(this.value);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.statsig.androidsdk.ExposureKey.Gate)) {
                return false;
            }
            com.statsig.androidsdk.ExposureKey.Gate gate = (com.statsig.androidsdk.ExposureKey.Gate) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, gate.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.ruleID, gate.ruleID) && this.reason == gate.reason && this.value == gate.value;
        }

        public final com.statsig.androidsdk.ExposureKey.Gate copy(java.lang.String name2, java.lang.String ruleID, com.statsig.androidsdk.EvaluationReason reason, boolean value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ruleID, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.statsig.androidsdk.ExposureKey.Gate(name2, ruleID, reason, value);
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getValue() {
            return this.value;
        }

        /* renamed from: component3, reason: from getter */
        public final com.statsig.androidsdk.EvaluationReason getReason() {
            return this.reason;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRuleID() {
            return this.ruleID;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.statsig.androidsdk.ExposureKey.Gate copy$default(com.statsig.androidsdk.ExposureKey.Gate gate, java.lang.String str, java.lang.String str2, com.statsig.androidsdk.EvaluationReason evaluationReason, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = gate.name;
            }
            if ((i & 2) != 0) {
                str2 = gate.ruleID;
            }
            if ((i & 4) != 0) {
                evaluationReason = gate.reason;
            }
            if ((i & 8) != 0) {
                z = gate.value;
            }
            return gate.copy(str, str2, evaluationReason, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/statsig/androidsdk/ExposureKey$Config;", "Lcom/statsig/androidsdk/ExposureKey;", "", "name", "ruleID", "Lcom/statsig/androidsdk/EvaluationReason;", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationReason;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/statsig/androidsdk/EvaluationReason;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationReason;)Lcom/statsig/androidsdk/ExposureKey$Config;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "Lcom/statsig/androidsdk/EvaluationReason;", "getReason", "getRuleID"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Config extends com.statsig.androidsdk.ExposureKey {
        private final java.lang.String name;
        private final com.statsig.androidsdk.EvaluationReason reason;
        private final java.lang.String ruleID;

        public final java.lang.String getName() {
            return this.name;
        }

        public final com.statsig.androidsdk.EvaluationReason getReason() {
            return this.reason;
        }

        public final java.lang.String getRuleID() {
            return this.ruleID;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Config(java.lang.String str, java.lang.String str2, com.statsig.androidsdk.EvaluationReason evaluationReason) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluationReason, "");
            this.name = str;
            this.ruleID = str2;
            this.reason = evaluationReason;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.String str2 = this.ruleID;
            com.statsig.androidsdk.EvaluationReason evaluationReason = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Config(name=");
            sb.append(str);
            sb.append(", ruleID=");
            sb.append(str2);
            sb.append(", reason=");
            sb.append(evaluationReason);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.name.hashCode() * 31) + this.ruleID.hashCode()) * 31) + this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.statsig.androidsdk.ExposureKey.Config)) {
                return false;
            }
            com.statsig.androidsdk.ExposureKey.Config config = (com.statsig.androidsdk.ExposureKey.Config) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, config.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.ruleID, config.ruleID) && this.reason == config.reason;
        }

        public final com.statsig.androidsdk.ExposureKey.Config copy(java.lang.String name2, java.lang.String ruleID, com.statsig.androidsdk.EvaluationReason reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ruleID, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.statsig.androidsdk.ExposureKey.Config(name2, ruleID, reason);
        }

        /* renamed from: component3, reason: from getter */
        public final com.statsig.androidsdk.EvaluationReason getReason() {
            return this.reason;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRuleID() {
            return this.ruleID;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.statsig.androidsdk.ExposureKey.Config copy$default(com.statsig.androidsdk.ExposureKey.Config config, java.lang.String str, java.lang.String str2, com.statsig.androidsdk.EvaluationReason evaluationReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = config.name;
            }
            if ((i & 2) != 0) {
                str2 = config.ruleID;
            }
            if ((i & 4) != 0) {
                evaluationReason = config.reason;
            }
            return config.copy(str, str2, evaluationReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JL\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b\"\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b\b\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u000eR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b'\u0010\u000e"}, d2 = {"Lcom/statsig/androidsdk/ExposureKey$Layer;", "Lcom/statsig/androidsdk/ExposureKey;", "", "configName", "ruleID", "allocatedExperiment", "parameterName", "", "isExplicitParameter", "Lcom/statsig/androidsdk/EvaluationReason;", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/statsig/androidsdk/EvaluationReason;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "component6", "()Lcom/statsig/androidsdk/EvaluationReason;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/statsig/androidsdk/EvaluationReason;)Lcom/statsig/androidsdk/ExposureKey$Layer;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAllocatedExperiment", "getConfigName", "Z", "getParameterName", "Lcom/statsig/androidsdk/EvaluationReason;", "getReason", "getRuleID"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final /* data */ class Layer extends com.statsig.androidsdk.ExposureKey {
        private final java.lang.String allocatedExperiment;
        private final java.lang.String configName;
        private final boolean isExplicitParameter;
        private final java.lang.String parameterName;
        private final com.statsig.androidsdk.EvaluationReason reason;
        private final java.lang.String ruleID;

        public final java.lang.String getConfigName() {
            return this.configName;
        }

        public final java.lang.String getRuleID() {
            return this.ruleID;
        }

        public final java.lang.String getAllocatedExperiment() {
            return this.allocatedExperiment;
        }

        public final java.lang.String getParameterName() {
            return this.parameterName;
        }

        public final boolean isExplicitParameter() {
            return this.isExplicitParameter;
        }

        public final com.statsig.androidsdk.EvaluationReason getReason() {
            return this.reason;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Layer(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, com.statsig.androidsdk.EvaluationReason evaluationReason) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluationReason, "");
            this.configName = str;
            this.ruleID = str2;
            this.allocatedExperiment = str3;
            this.parameterName = str4;
            this.isExplicitParameter = z;
            this.reason = evaluationReason;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.configName;
            java.lang.String str2 = this.ruleID;
            java.lang.String str3 = this.allocatedExperiment;
            java.lang.String str4 = this.parameterName;
            boolean z = this.isExplicitParameter;
            com.statsig.androidsdk.EvaluationReason evaluationReason = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Layer(configName=");
            sb.append(str);
            sb.append(", ruleID=");
            sb.append(str2);
            sb.append(", allocatedExperiment=");
            sb.append(str3);
            sb.append(", parameterName=");
            sb.append(str4);
            sb.append(", isExplicitParameter=");
            sb.append(z);
            sb.append(", reason=");
            sb.append(evaluationReason);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((this.configName.hashCode() * 31) + this.ruleID.hashCode()) * 31) + this.allocatedExperiment.hashCode()) * 31) + this.parameterName.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isExplicitParameter)) * 31) + this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.statsig.androidsdk.ExposureKey.Layer)) {
                return false;
            }
            com.statsig.androidsdk.ExposureKey.Layer layer = (com.statsig.androidsdk.ExposureKey.Layer) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.configName, layer.configName) && kotlin.jvm.internal.Intrinsics.areEqual(this.ruleID, layer.ruleID) && kotlin.jvm.internal.Intrinsics.areEqual(this.allocatedExperiment, layer.allocatedExperiment) && kotlin.jvm.internal.Intrinsics.areEqual(this.parameterName, layer.parameterName) && this.isExplicitParameter == layer.isExplicitParameter && this.reason == layer.reason;
        }

        public final com.statsig.androidsdk.ExposureKey.Layer copy(java.lang.String configName, java.lang.String ruleID, java.lang.String allocatedExperiment, java.lang.String parameterName, boolean isExplicitParameter, com.statsig.androidsdk.EvaluationReason reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ruleID, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allocatedExperiment, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameterName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.statsig.androidsdk.ExposureKey.Layer(configName, ruleID, allocatedExperiment, parameterName, isExplicitParameter, reason);
        }

        /* renamed from: component6, reason: from getter */
        public final com.statsig.androidsdk.EvaluationReason getReason() {
            return this.reason;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsExplicitParameter() {
            return this.isExplicitParameter;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getParameterName() {
            return this.parameterName;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getAllocatedExperiment() {
            return this.allocatedExperiment;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRuleID() {
            return this.ruleID;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getConfigName() {
            return this.configName;
        }

        public static /* synthetic */ com.statsig.androidsdk.ExposureKey.Layer copy$default(com.statsig.androidsdk.ExposureKey.Layer layer, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, com.statsig.androidsdk.EvaluationReason evaluationReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = layer.configName;
            }
            if ((i & 2) != 0) {
                str2 = layer.ruleID;
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                str3 = layer.allocatedExperiment;
            }
            java.lang.String str6 = str3;
            if ((i & 8) != 0) {
                str4 = layer.parameterName;
            }
            java.lang.String str7 = str4;
            if ((i & 16) != 0) {
                z = layer.isExplicitParameter;
            }
            boolean z2 = z;
            if ((i & 32) != 0) {
                evaluationReason = layer.reason;
            }
            return layer.copy(str, str5, str6, str7, z2, evaluationReason);
        }
    }

    public /* synthetic */ ExposureKey(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
