package com.paypal.oslo.feature.debitcard.api.widget;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Companion", "CardAction", "CardCancelled", "Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetResult$CardAction;", "Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetResult$CardCancelled;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public interface DebitCardWidgetResult extends com.paypal.oslo.core.navigation.result.NavResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.Companion INSTANCE = com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.Companion.Camera2StreamConfigurationMap;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.Companion Camera2StreamConfigurationMap = new com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.Companion();

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult> serializer() {
            return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardAction.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardCancelled.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult$CardAction$$serializer.INSTANCE, com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult$CardCancelled$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetResult$CardAction;", "Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetResult;", "Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardSummary;", "cardSummary", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardSummary;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/debitcard/api/widget/DebitCardSummary;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardSummary;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardSummary;)Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetResult$CardAction;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_api_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetResult$CardAction;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardSummary;", "getCardSummary", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class CardAction implements com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardAction.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardAction.Companion(null);
        private final com.paypal.oslo.feature.debitcard.api.widget.DebitCardSummary cardSummary;

        public /* synthetic */ CardAction(int i, com.paypal.oslo.feature.debitcard.api.widget.DebitCardSummary debitCardSummary, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult$CardAction$$serializer.INSTANCE.getDescriptor());
            }
            this.cardSummary = debitCardSummary;
        }

        public CardAction(com.paypal.oslo.feature.debitcard.api.widget.DebitCardSummary debitCardSummary) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardSummary, "");
            this.cardSummary = debitCardSummary;
        }

        public final com.paypal.oslo.feature.debitcard.api.widget.DebitCardSummary getCardSummary() {
            return this.cardSummary;
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetResult$CardAction$Companion;", "", "<init>", "()V", "", "instrumentId", "productDisplayName", "lastFourDigits", "smallCardArtUrl", "largeCardArtUrl", "Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetResult$CardAction;", "create", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetResult$CardAction;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes12.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardAction> serializer() {
                return com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult$CardAction$$serializer.INSTANCE;
            }

            public final com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardAction create(java.lang.String instrumentId, java.lang.String productDisplayName, java.lang.String lastFourDigits, java.lang.String smallCardArtUrl, java.lang.String largeCardArtUrl) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productDisplayName, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastFourDigits, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smallCardArtUrl, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(largeCardArtUrl, "");
                java.lang.String str = smallCardArtUrl;
                if (str.length() == 0) {
                    str = null;
                }
                java.lang.String str2 = largeCardArtUrl;
                return new com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardAction(new com.paypal.oslo.feature.debitcard.api.widget.DebitCardSummary(instrumentId, productDisplayName, lastFourDigits, new com.paypal.oslo.feature.debitcard.api.widget.CardImages(str, str2.length() != 0 ? str2 : null)));
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.api.widget.DebitCardSummary debitCardSummary = this.cardSummary;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardAction(cardSummary=");
            sb.append(debitCardSummary);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cardSummary.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardAction) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardSummary, ((com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardAction) other).cardSummary);
        }

        public final com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardAction copy(com.paypal.oslo.feature.debitcard.api.widget.DebitCardSummary cardSummary) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardSummary, "");
            return new com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardAction(cardSummary);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.widget.DebitCardSummary getCardSummary() {
            return this.cardSummary;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardAction copy$default(com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardAction cardAction, com.paypal.oslo.feature.debitcard.api.widget.DebitCardSummary debitCardSummary, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardSummary = cardAction.cardSummary;
            }
            return cardAction.copy(debitCardSummary);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetResult$CardCancelled;", "Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetResult;", "", "toastMessage", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetResult$CardCancelled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_api_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetResult$CardCancelled;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getToastMessage", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class CardCancelled implements com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardCancelled.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardCancelled.Companion(null);
        private final java.lang.String toastMessage;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetResult$CardCancelled$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetResult$CardCancelled;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes12.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardCancelled> serializer() {
                return com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult$CardCancelled$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ CardCancelled(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult$CardCancelled$$serializer.INSTANCE.getDescriptor());
            }
            this.toastMessage = str;
        }

        public CardCancelled(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.toastMessage = str;
        }

        public final java.lang.String getToastMessage() {
            return this.toastMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.toastMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardCancelled(toastMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.toastMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardCancelled) && kotlin.jvm.internal.Intrinsics.areEqual(this.toastMessage, ((com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardCancelled) other).toastMessage);
        }

        public final com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardCancelled copy(java.lang.String toastMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toastMessage, "");
            return new com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardCancelled(toastMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getToastMessage() {
            return this.toastMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardCancelled copy$default(com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardCancelled cardCancelled, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cardCancelled.toastMessage;
            }
            return cardCancelled.copy(str);
        }
    }
}
