package com.paypal.oslo.feature.activity.domain.ledger.models;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000fJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityDateHeaderModel;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityBaseSection;", "", "headerText", "", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityActionItems;", "actionItems", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityDateHeaderModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityDateHeaderModel;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getHeaderText", "Ljava/util/List;", "getActionItems", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class ActivityDateHeaderModel extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityBaseSection {
    public static final int $stable = 0;
    private final java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems> actionItems;
    private final java.lang.String headerText;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel.Companion INSTANCE = new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel.m11779$r8$lambda$Pk_bKOSd2gkoW4aeZs0Um96zzE();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityDateHeaderModel$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityDateHeaderModel;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel> serializer() {
            return com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ActivityDateHeaderModel(int i, java.lang.String str, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel$$serializer.INSTANCE.getDescriptor());
        }
        this.headerText = str;
        if ((i & 2) == 0) {
            this.actionItems = kotlin.collections.CollectionsKt.emptyList();
        } else {
            this.actionItems = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityDateHeaderModel(java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.headerText = str;
        this.actionItems = list;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$activity_prodRelease(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.headerText);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !kotlin.jvm.internal.Intrinsics.areEqual(self.actionItems, kotlin.collections.CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.actionItems);
        }
    }

    public final java.lang.String getHeaderText() {
        return this.headerText;
    }

    public /* synthetic */ ActivityDateHeaderModel(java.lang.String str, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems> getActionItems() {
        return this.actionItems;
    }

    /* renamed from: $r8$lambda$Pk_bKOSd2gkoW4aeZs0Um96-zzE, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m11779$r8$lambda$Pk_bKOSd2gkoW4aeZs0Um96zzE() {
        return new kotlinx.serialization.internal.ArrayListSerializer(new kotlinx.serialization.PolymorphicSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems.class), new java.lang.annotation.Annotation[0]));
    }

    public final java.lang.String toString() {
        java.lang.String str = this.headerText;
        java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems> list = this.actionItems;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityDateHeaderModel(headerText=");
        sb.append(str);
        sb.append(", actionItems=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.headerText.hashCode() * 31) + this.actionItems.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel activityDateHeaderModel = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.headerText, activityDateHeaderModel.headerText) && kotlin.jvm.internal.Intrinsics.areEqual(this.actionItems, activityDateHeaderModel.actionItems);
    }

    public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel copy(java.lang.String headerText, java.util.List<? extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems> actionItems) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionItems, "");
        return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel(headerText, actionItems);
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems> component2() {
        return this.actionItems;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getHeaderText() {
        return this.headerText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel copy$default(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel activityDateHeaderModel, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = activityDateHeaderModel.headerText;
        }
        if ((i & 2) != 0) {
            list = activityDateHeaderModel.actionItems;
        }
        return activityDateHeaderModel.copy(str, list);
    }
}
