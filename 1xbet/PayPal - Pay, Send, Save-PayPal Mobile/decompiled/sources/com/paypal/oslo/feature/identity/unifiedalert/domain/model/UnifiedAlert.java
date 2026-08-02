package com.paypal.oslo.feature.identity.unifiedalert.domain.model;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002LKBs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u0095\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u001c\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0092\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010\u001dJ'\u0010:\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b>\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b?\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b@\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\bA\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\bB\u0010\u001dR&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010$R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bF\u0010&R\u001a\u0010\r\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bG\u0010&R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010H\u001a\u0004\bI\u0010)R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010J\u001a\u0004\b\u0011\u0010+"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "", "", "userId", "transactionId", "documentId", "alertType", "title", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "", "metadata", "", "expiresAtEpoch", "actionDateEpoch", "", "acceptableClaims", "", "isUnifiedAlert", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;JJLjava/util/List;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;JJLjava/util/List;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "currentTimeMillis", "isActive", "(J)Z", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/Map;", "component8", "()J", "component9", "component10", "()Ljava/util/List;", "component11", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;JJLjava/util/List;Z)Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_prodRelease", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getUserId", "getTransactionId", "getDocumentId", "getAlertType", "getTitle", "getBody", "Ljava/util/Map;", "getMetadata", "J", "getExpiresAtEpoch", "getActionDateEpoch", "Ljava/util/List;", "getAcceptableClaims", "Z", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class UnifiedAlert {
    private final java.util.List<java.lang.String> acceptableClaims;
    private final long actionDateEpoch;
    private final java.lang.String alertType;
    private final java.lang.String body;
    private final java.lang.String documentId;
    private final long expiresAtEpoch;
    private final boolean isUnifiedAlert;
    private final java.util.Map<java.lang.String, java.lang.String> metadata;
    private final java.lang.String title;
    private final java.lang.String transactionId;
    private final java.lang.String userId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert.Companion INSTANCE = new com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert.$r8$lambda$MFqIKorTSOzkhKhCOTb3bE8oM1I();
        }
    }), null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert.m15373$r8$lambda$6tNE5NhzVSPAOfiR757oDiJYPA();
        }
    }), null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert> serializer() {
            return com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ UnifiedAlert(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.Map map, long j, long j2, java.util.List list, boolean z, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i & 2047)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 2047, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert$$serializer.INSTANCE.getDescriptor());
        }
        this.userId = str;
        this.transactionId = str2;
        this.documentId = str3;
        this.alertType = str4;
        this.title = str5;
        this.body = str6;
        this.metadata = map;
        this.expiresAtEpoch = j;
        this.actionDateEpoch = j2;
        this.acceptableClaims = list;
        this.isUnifiedAlert = z;
    }

    public UnifiedAlert(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.Map<java.lang.String, java.lang.String> map, long j, long j2, java.util.List<java.lang.String> list, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.userId = str;
        this.transactionId = str2;
        this.documentId = str3;
        this.alertType = str4;
        this.title = str5;
        this.body = str6;
        this.metadata = map;
        this.expiresAtEpoch = j;
        this.actionDateEpoch = j2;
        this.acceptableClaims = list;
        this.isUnifiedAlert = z;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$identity_prodRelease(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.userId);
        output.encodeStringElement(serialDesc, 1, self.transactionId);
        output.encodeStringElement(serialDesc, 2, self.documentId);
        output.encodeStringElement(serialDesc, 3, self.alertType);
        output.encodeNullableSerializableElement(serialDesc, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.title);
        output.encodeStringElement(serialDesc, 5, self.body);
        output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.metadata);
        output.encodeLongElement(serialDesc, 7, self.expiresAtEpoch);
        output.encodeLongElement(serialDesc, 8, self.actionDateEpoch);
        output.encodeSerializableElement(serialDesc, 9, lazyArr[9].getValue(), self.acceptableClaims);
        output.encodeBooleanElement(serialDesc, 10, self.isUnifiedAlert);
    }

    public final java.lang.String getUserId() {
        return this.userId;
    }

    public final java.lang.String getTransactionId() {
        return this.transactionId;
    }

    public final java.lang.String getDocumentId() {
        return this.documentId;
    }

    public final java.lang.String getAlertType() {
        return this.alertType;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getBody() {
        return this.body;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getMetadata() {
        return this.metadata;
    }

    public final long getExpiresAtEpoch() {
        return this.expiresAtEpoch;
    }

    public final long getActionDateEpoch() {
        return this.actionDateEpoch;
    }

    public final java.util.List<java.lang.String> getAcceptableClaims() {
        return this.acceptableClaims;
    }

    public final boolean isUnifiedAlert() {
        return this.isUnifiedAlert;
    }

    public static /* synthetic */ boolean isActive$default(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = java.lang.System.currentTimeMillis();
        }
        return unifiedAlert.isActive(j);
    }

    public final boolean isActive(long currentTimeMillis) {
        return java.util.concurrent.TimeUnit.SECONDS.toMillis(this.expiresAtEpoch) > currentTimeMillis;
    }

    /* renamed from: $r8$lambda$6tNE5Nhz-VSPAOfiR757oDiJYPA, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m15373$r8$lambda$6tNE5NhzVSPAOfiR757oDiJYPA() {
        return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE);
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$MFqIKorTSOzkhKhCOTb3bE8oM1I() {
        return new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.userId;
        java.lang.String str2 = this.transactionId;
        java.lang.String str3 = this.documentId;
        java.lang.String str4 = this.alertType;
        java.lang.String str5 = this.title;
        java.lang.String str6 = this.body;
        java.util.Map<java.lang.String, java.lang.String> map = this.metadata;
        long j = this.expiresAtEpoch;
        long j2 = this.actionDateEpoch;
        java.util.List<java.lang.String> list = this.acceptableClaims;
        boolean z = this.isUnifiedAlert;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UnifiedAlert(userId=");
        sb.append(str);
        sb.append(", transactionId=");
        sb.append(str2);
        sb.append(", documentId=");
        sb.append(str3);
        sb.append(", alertType=");
        sb.append(str4);
        sb.append(", title=");
        sb.append(str5);
        sb.append(", body=");
        sb.append(str6);
        sb.append(", metadata=");
        sb.append(map);
        sb.append(", expiresAtEpoch=");
        sb.append(j);
        sb.append(", actionDateEpoch=");
        sb.append(j2);
        sb.append(", acceptableClaims=");
        sb.append(list);
        sb.append(", isUnifiedAlert=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.userId.hashCode();
        int hashCode2 = this.transactionId.hashCode();
        int hashCode3 = this.documentId.hashCode();
        int hashCode4 = this.alertType.hashCode();
        java.lang.String str = this.title;
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.body.hashCode()) * 31) + this.metadata.hashCode()) * 31) + java.lang.Long.hashCode(this.expiresAtEpoch)) * 31) + java.lang.Long.hashCode(this.actionDateEpoch)) * 31) + this.acceptableClaims.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isUnifiedAlert);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert)) {
            return false;
        }
        com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert = (com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.userId, unifiedAlert.userId) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionId, unifiedAlert.transactionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.documentId, unifiedAlert.documentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.alertType, unifiedAlert.alertType) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, unifiedAlert.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.body, unifiedAlert.body) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, unifiedAlert.metadata) && this.expiresAtEpoch == unifiedAlert.expiresAtEpoch && this.actionDateEpoch == unifiedAlert.actionDateEpoch && kotlin.jvm.internal.Intrinsics.areEqual(this.acceptableClaims, unifiedAlert.acceptableClaims) && this.isUnifiedAlert == unifiedAlert.isUnifiedAlert;
    }

    public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert copy(java.lang.String userId, java.lang.String transactionId, java.lang.String documentId, java.lang.String alertType, java.lang.String title, java.lang.String body, java.util.Map<java.lang.String, java.lang.String> metadata, long expiresAtEpoch, long actionDateEpoch, java.util.List<java.lang.String> acceptableClaims, boolean isUnifiedAlert) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acceptableClaims, "");
        return new com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert(userId, transactionId, documentId, alertType, title, body, metadata, expiresAtEpoch, actionDateEpoch, acceptableClaims, isUnifiedAlert);
    }

    /* renamed from: component9, reason: from getter */
    public final long getActionDateEpoch() {
        return this.actionDateEpoch;
    }

    /* renamed from: component8, reason: from getter */
    public final long getExpiresAtEpoch() {
        return this.expiresAtEpoch;
    }

    public final java.util.Map<java.lang.String, java.lang.String> component7() {
        return this.metadata;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getBody() {
        return this.body;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getAlertType() {
        return this.alertType;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDocumentId() {
        return this.documentId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsUnifiedAlert() {
        return this.isUnifiedAlert;
    }

    public final java.util.List<java.lang.String> component10() {
        return this.acceptableClaims;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUserId() {
        return this.userId;
    }
}
