package com.paypal.oslo.feature.settings.closeaccount.domain.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001:\u0002./Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J~\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b)\u0010\u0011R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\u0017R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b,\u0010\u0017R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b-\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/AccountActivityLog;", "", "", "activityTypeId", "activityTypeName", "initiatorId", "initiatorType", "initiatorName", "", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/AccountActivityLog$ReferenceId;", "referenceIds", "summaries", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/AccountActivityLog$DataProperty;", "dataProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/AccountActivityLog;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getActivityTypeId", "getActivityTypeName", "getInitiatorId", "getInitiatorType", "getInitiatorName", "Ljava/util/List;", "getReferenceIds", "getSummaries", "getDataProperties", "ReferenceId", "DataProperty"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AccountActivityLog {
    public static final int $stable = 8;
    private final java.lang.String activityTypeId;
    private final java.lang.String activityTypeName;
    private final java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.DataProperty> dataProperties;
    private final java.lang.String initiatorId;
    private final java.lang.String initiatorName;
    private final java.lang.String initiatorType;
    private final java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.ReferenceId> referenceIds;
    private final java.util.List<java.lang.String> summaries;

    public AccountActivityLog(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.ReferenceId> list, java.util.List<java.lang.String> list2, java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.DataProperty> list3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.activityTypeId = str;
        this.activityTypeName = str2;
        this.initiatorId = str3;
        this.initiatorType = str4;
        this.initiatorName = str5;
        this.referenceIds = list;
        this.summaries = list2;
        this.dataProperties = list3;
    }

    public /* synthetic */ AccountActivityLog(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List list, java.util.List list2, java.util.List list3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : list3);
    }

    public final java.lang.String getActivityTypeId() {
        return this.activityTypeId;
    }

    public final java.lang.String getActivityTypeName() {
        return this.activityTypeName;
    }

    public final java.lang.String getInitiatorId() {
        return this.initiatorId;
    }

    public final java.lang.String getInitiatorType() {
        return this.initiatorType;
    }

    public final java.lang.String getInitiatorName() {
        return this.initiatorName;
    }

    public final java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.ReferenceId> getReferenceIds() {
        return this.referenceIds;
    }

    public final java.util.List<java.lang.String> getSummaries() {
        return this.summaries;
    }

    public final java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.DataProperty> getDataProperties() {
        return this.dataProperties;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/AccountActivityLog$ReferenceId;", "", "", "id", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/AccountActivityLog$ReferenceId;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReferenceId {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final java.lang.String type;

        public ReferenceId(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.type = str2;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReferenceId(id=");
            sb.append(str);
            sb.append(", type=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.ReferenceId)) {
                return false;
            }
            com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.ReferenceId referenceId = (com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.ReferenceId) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, referenceId.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, referenceId.type);
        }

        public final com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.ReferenceId copy(java.lang.String id, java.lang.String type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.ReferenceId(id, type);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.ReferenceId copy$default(com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.ReferenceId referenceId, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = referenceId.id;
            }
            if ((i & 2) != 0) {
                str2 = referenceId.type;
            }
            return referenceId.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/AccountActivityLog$DataProperty;", "", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/AccountActivityLog$DataProperty;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getKey", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DataProperty {
        public static final int $stable = 0;
        private final java.lang.String key;
        private final java.lang.String value;

        public DataProperty(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.key = str;
            this.value = str2;
        }

        public final java.lang.String getKey() {
            return this.key;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.key;
            java.lang.String str2 = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DataProperty(key=");
            sb.append(str);
            sb.append(", value=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.key.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.DataProperty)) {
                return false;
            }
            com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.DataProperty dataProperty = (com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.DataProperty) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.key, dataProperty.key) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, dataProperty.value);
        }

        public final com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.DataProperty copy(java.lang.String key, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.DataProperty(key, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getKey() {
            return this.key;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.DataProperty copy$default(com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.DataProperty dataProperty, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dataProperty.key;
            }
            if ((i & 2) != 0) {
                str2 = dataProperty.value;
            }
            return dataProperty.copy(str, str2);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.activityTypeId;
        java.lang.String str2 = this.activityTypeName;
        java.lang.String str3 = this.initiatorId;
        java.lang.String str4 = this.initiatorType;
        java.lang.String str5 = this.initiatorName;
        java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.ReferenceId> list = this.referenceIds;
        java.util.List<java.lang.String> list2 = this.summaries;
        java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.DataProperty> list3 = this.dataProperties;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AccountActivityLog(activityTypeId=");
        sb.append(str);
        sb.append(", activityTypeName=");
        sb.append(str2);
        sb.append(", initiatorId=");
        sb.append(str3);
        sb.append(", initiatorType=");
        sb.append(str4);
        sb.append(", initiatorName=");
        sb.append(str5);
        sb.append(", referenceIds=");
        sb.append(list);
        sb.append(", summaries=");
        sb.append(list2);
        sb.append(", dataProperties=");
        sb.append(list3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.activityTypeId.hashCode();
        java.lang.String str = this.activityTypeName;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.initiatorId.hashCode();
        java.lang.String str2 = this.initiatorType;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.initiatorName;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.ReferenceId> list = this.referenceIds;
        int hashCode6 = list == null ? 0 : list.hashCode();
        java.util.List<java.lang.String> list2 = this.summaries;
        int hashCode7 = list2 == null ? 0 : list2.hashCode();
        java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.DataProperty> list3 = this.dataProperties;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog)) {
            return false;
        }
        com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog accountActivityLog = (com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.activityTypeId, accountActivityLog.activityTypeId) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityTypeName, accountActivityLog.activityTypeName) && kotlin.jvm.internal.Intrinsics.areEqual(this.initiatorId, accountActivityLog.initiatorId) && kotlin.jvm.internal.Intrinsics.areEqual(this.initiatorType, accountActivityLog.initiatorType) && kotlin.jvm.internal.Intrinsics.areEqual(this.initiatorName, accountActivityLog.initiatorName) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceIds, accountActivityLog.referenceIds) && kotlin.jvm.internal.Intrinsics.areEqual(this.summaries, accountActivityLog.summaries) && kotlin.jvm.internal.Intrinsics.areEqual(this.dataProperties, accountActivityLog.dataProperties);
    }

    public final com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog copy(java.lang.String activityTypeId, java.lang.String activityTypeName, java.lang.String initiatorId, java.lang.String initiatorType, java.lang.String initiatorName, java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.ReferenceId> referenceIds, java.util.List<java.lang.String> summaries, java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.DataProperty> dataProperties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTypeId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initiatorId, "");
        return new com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog(activityTypeId, activityTypeName, initiatorId, initiatorType, initiatorName, referenceIds, summaries, dataProperties);
    }

    public final java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.DataProperty> component8() {
        return this.dataProperties;
    }

    public final java.util.List<java.lang.String> component7() {
        return this.summaries;
    }

    public final java.util.List<com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog.ReferenceId> component6() {
        return this.referenceIds;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getInitiatorName() {
        return this.initiatorName;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getInitiatorType() {
        return this.initiatorType;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getInitiatorId() {
        return this.initiatorId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getActivityTypeName() {
        return this.activityTypeName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getActivityTypeId() {
        return this.activityTypeId;
    }
}
