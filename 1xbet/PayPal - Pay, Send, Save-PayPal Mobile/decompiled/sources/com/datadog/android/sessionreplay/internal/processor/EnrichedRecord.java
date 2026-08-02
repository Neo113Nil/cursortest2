package com.datadog.android.sessionreplay.internal.processor;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J>\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\fJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b \u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b!\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/processor/EnrichedRecord;", "", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.APPLICATION_ID_KEY, "sessionId", com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord;", "records", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/datadog/android/sessionreplay/internal/processor/EnrichedRecord;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toJson", "toString", "Ljava/lang/String;", "getApplicationId", "Ljava/util/List;", "getRecords", "getSessionId", "getViewId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class EnrichedRecord {
    public static final java.lang.String APPLICATION_ID_KEY = "application_id";
    public static final java.lang.String RECORDS_KEY = "records";
    public static final java.lang.String SESSION_ID_KEY = "session_id";
    public static final java.lang.String VIEW_ID_KEY = "view_id";
    private final java.lang.String applicationId;
    private final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord> records;
    private final java.lang.String sessionId;
    private final java.lang.String viewId;

    /* JADX WARN: Multi-variable type inference failed */
    public EnrichedRecord(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.applicationId = str;
        this.sessionId = str2;
        this.viewId = str3;
        this.records = list;
    }

    public final java.lang.String getApplicationId() {
        return this.applicationId;
    }

    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final java.lang.String getViewId() {
        return this.viewId;
    }

    public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord> getRecords() {
        return this.records;
    }

    public final java.lang.String toJson() {
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        jsonObject.addProperty("application_id", this.applicationId);
        jsonObject.addProperty("session_id", this.sessionId);
        jsonObject.addProperty("view_id", this.viewId);
        java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord> list = this.records;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord) it.next()).toJson());
        }
        com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray();
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            jsonArray.add((com.google.gson.JsonElement) it2.next());
        }
        jsonObject.add("records", jsonArray);
        java.lang.String obj = jsonObject.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.applicationId;
        java.lang.String str2 = this.sessionId;
        java.lang.String str3 = this.viewId;
        java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord> list = this.records;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EnrichedRecord(applicationId=");
        sb.append(str);
        sb.append(", sessionId=");
        sb.append(str2);
        sb.append(", viewId=");
        sb.append(str3);
        sb.append(", records=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.applicationId.hashCode() * 31) + this.sessionId.hashCode()) * 31) + this.viewId.hashCode()) * 31) + this.records.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.sessionreplay.internal.processor.EnrichedRecord)) {
            return false;
        }
        com.datadog.android.sessionreplay.internal.processor.EnrichedRecord enrichedRecord = (com.datadog.android.sessionreplay.internal.processor.EnrichedRecord) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.applicationId, enrichedRecord.applicationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, enrichedRecord.sessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.viewId, enrichedRecord.viewId) && kotlin.jvm.internal.Intrinsics.areEqual(this.records, enrichedRecord.records);
    }

    public final com.datadog.android.sessionreplay.internal.processor.EnrichedRecord copy(java.lang.String applicationId, java.lang.String sessionId, java.lang.String viewId, java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord> records) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(records, "");
        return new com.datadog.android.sessionreplay.internal.processor.EnrichedRecord(applicationId, sessionId, viewId, records);
    }

    public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord> component4() {
        return this.records;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getViewId() {
        return this.viewId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getApplicationId() {
        return this.applicationId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.datadog.android.sessionreplay.internal.processor.EnrichedRecord copy$default(com.datadog.android.sessionreplay.internal.processor.EnrichedRecord enrichedRecord, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = enrichedRecord.applicationId;
        }
        if ((i & 2) != 0) {
            str2 = enrichedRecord.sessionId;
        }
        if ((i & 4) != 0) {
            str3 = enrichedRecord.viewId;
        }
        if ((i & 8) != 0) {
            list = enrichedRecord.records;
        }
        return enrichedRecord.copy(str, str2, str3, list);
    }
}
