package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0081\b\u0018\u0000 52\u00020\u0001:\u000265B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJR\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0013J'\u0010*\u001a\u00020)2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/UnenrolledAccountFeaturesSnapshot;", "", "", "name", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditImage;", "icon", "personalizationTrackingId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/EngagementAction;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditImage;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/EngagementAction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditImage;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/EngagementAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditImage;", "component5", "component6", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/EngagementAction;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditImage;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/EngagementAction;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/UnenrolledAccountFeaturesSnapshot;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/UnenrolledAccountFeaturesSnapshot;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getName", "getTitle", "getDescription", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditImage;", "getIcon", "getPersonalizationTrackingId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/EngagementAction;", "getAction", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class UnenrolledAccountFeaturesSnapshot {
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementAction action;
    private final java.lang.String description;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage icon;
    private final java.lang.String name;
    private final java.lang.String personalizationTrackingId;
    private final java.lang.String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.UnenrolledAccountFeaturesSnapshot.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.UnenrolledAccountFeaturesSnapshot.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.UnenrolledAccountFeaturesSnapshot$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementAction.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/UnenrolledAccountFeaturesSnapshot$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/UnenrolledAccountFeaturesSnapshot;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.UnenrolledAccountFeaturesSnapshot> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.UnenrolledAccountFeaturesSnapshot$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ UnenrolledAccountFeaturesSnapshot(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage creditImage, java.lang.String str4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementAction engagementAction, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 63, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.UnenrolledAccountFeaturesSnapshot$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        this.title = str2;
        this.description = str3;
        this.icon = creditImage;
        this.personalizationTrackingId = str4;
        this.action = engagementAction;
    }

    public UnenrolledAccountFeaturesSnapshot(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage creditImage, java.lang.String str4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementAction engagementAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditImage, "");
        this.name = str;
        this.title = str2;
        this.description = str3;
        this.icon = creditImage;
        this.personalizationTrackingId = str4;
        this.action = engagementAction;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.UnenrolledAccountFeaturesSnapshot self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.name);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.description);
        output.encodeSerializableElement(serialDesc, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage$$serializer.INSTANCE, self.icon);
        output.encodeNullableSerializableElement(serialDesc, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.personalizationTrackingId);
        output.encodeNullableSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.action);
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage getIcon() {
        return this.icon;
    }

    public final java.lang.String getPersonalizationTrackingId() {
        return this.personalizationTrackingId;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementAction getAction() {
        return this.action;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.title;
        java.lang.String str3 = this.description;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage creditImage = this.icon;
        java.lang.String str4 = this.personalizationTrackingId;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementAction engagementAction = this.action;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UnenrolledAccountFeaturesSnapshot(name=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        sb.append(", icon=");
        sb.append(creditImage);
        sb.append(", personalizationTrackingId=");
        sb.append(str4);
        sb.append(", action=");
        sb.append(engagementAction);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = this.title.hashCode();
        java.lang.String str = this.description;
        int hashCode3 = str == null ? 0 : str.hashCode();
        int hashCode4 = this.icon.hashCode();
        java.lang.String str2 = this.personalizationTrackingId;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementAction engagementAction = this.action;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (engagementAction != null ? engagementAction.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.UnenrolledAccountFeaturesSnapshot)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.UnenrolledAccountFeaturesSnapshot unenrolledAccountFeaturesSnapshot = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.UnenrolledAccountFeaturesSnapshot) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, unenrolledAccountFeaturesSnapshot.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, unenrolledAccountFeaturesSnapshot.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, unenrolledAccountFeaturesSnapshot.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.icon, unenrolledAccountFeaturesSnapshot.icon) && kotlin.jvm.internal.Intrinsics.areEqual(this.personalizationTrackingId, unenrolledAccountFeaturesSnapshot.personalizationTrackingId) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, unenrolledAccountFeaturesSnapshot.action);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.UnenrolledAccountFeaturesSnapshot copy(java.lang.String name2, java.lang.String title, java.lang.String description, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage icon, java.lang.String personalizationTrackingId, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementAction action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.UnenrolledAccountFeaturesSnapshot(name2, title, description, icon, personalizationTrackingId, action);
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementAction getAction() {
        return this.action;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getPersonalizationTrackingId() {
        return this.personalizationTrackingId;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.UnenrolledAccountFeaturesSnapshot copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.UnenrolledAccountFeaturesSnapshot unenrolledAccountFeaturesSnapshot, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage creditImage, java.lang.String str4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementAction engagementAction, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = unenrolledAccountFeaturesSnapshot.name;
        }
        if ((i & 2) != 0) {
            str2 = unenrolledAccountFeaturesSnapshot.title;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = unenrolledAccountFeaturesSnapshot.description;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            creditImage = unenrolledAccountFeaturesSnapshot.icon;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage creditImage2 = creditImage;
        if ((i & 16) != 0) {
            str4 = unenrolledAccountFeaturesSnapshot.personalizationTrackingId;
        }
        java.lang.String str7 = str4;
        if ((i & 32) != 0) {
            engagementAction = unenrolledAccountFeaturesSnapshot.action;
        }
        return unenrolledAccountFeaturesSnapshot.copy(str, str5, str6, creditImage2, str7, engagementAction);
    }
}
