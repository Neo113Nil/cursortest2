package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 \\2\u00020\u0001:\u0002]\\B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bB§\u0001\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001a\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\"J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007HÆ\u0003¢\u0006\u0004\b/\u0010'J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\"J\u0010\u00101\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\b5\u00106J¢\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018HÆ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010:\u001a\u00020\r2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b>\u0010\"J'\u0010E\u001a\u00020D2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH\u0001¢\u0006\u0004\bE\u0010FR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010G\u001a\u0004\bH\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010G\u001a\u0004\bI\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010J\u001a\u0004\bK\u0010%R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010L\u001a\u0004\bM\u0010'R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bN\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010O\u001a\u0004\bP\u0010*R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010Q\u001a\u0004\b\u000e\u0010,R\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010R\u001a\u0004\bS\u0010.R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010L\u001a\u0004\bT\u0010'R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010G\u001a\u0004\bU\u0010\"R\u001a\u0010\u0015\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010V\u001a\u0004\bW\u00102R\u001a\u0010\u0017\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010X\u001a\u0004\bY\u00104R\u001a\u0010\u0019\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010Z\u001a\u0004\b[\u00106"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "", "", "id", "lastNChars", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "type", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountAvailableAction;", "availableActions", "currencyCode", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountConfirmation;", "confirmation", "", "isSepaCompliant", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountIssuer;", "issuer", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstitutionImage;", "institutionImages", "nickname", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountOnboardingEntity;", "onboardingEntity", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountStatus;", "status", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountAuthorization;", "authorization", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountConfirmation;ZLcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountIssuer;Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountOnboardingEntity;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountStatus;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountAuthorization;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountConfirmation;ZLcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountIssuer;Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountOnboardingEntity;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountStatus;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountAuthorization;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "component4", "()Ljava/util/List;", "component5", "component6", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountConfirmation;", "component7", "()Z", "component8", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountIssuer;", "component9", "component10", "component11", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountOnboardingEntity;", "component12", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountStatus;", "component13", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountAuthorization;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountConfirmation;ZLcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountIssuer;Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountOnboardingEntity;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountStatus;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountAuthorization;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "getLastNChars", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "getType", "Ljava/util/List;", "getAvailableActions", "getCurrencyCode", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountConfirmation;", "getConfirmation", "Z", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountIssuer;", "getIssuer", "getInstitutionImages", "getNickname", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountOnboardingEntity;", "getOnboardingEntity", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountStatus;", "getStatus", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountAuthorization;", "getAuthorization", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class BankAccountDetails {
    private final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAuthorization authorization;
    private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction> availableActions;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation confirmation;
    private final java.lang.String currencyCode;
    private final java.lang.String id;
    private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage> institutionImages;
    private final boolean isSepaCompliant;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountIssuer issuer;
    private final java.lang.String lastNChars;
    private final java.lang.String nickname;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity onboardingEntity;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountStatus status;
    private final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails.Companion INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.INSTANCE.serializer();
            return serializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails.$r8$lambda$_Sn9l2673OyK9hiqxFp4OBubzQA();
        }
    }), null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails.$r8$lambda$zR5KeDBi98DL6I3V7aMdkXKRn4s();
        }
    }), null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity.INSTANCE.serializer();
            return serializer;
        }
    }), null, null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails> serializer() {
            return com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BankAccountDetails(int i, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType, java.util.List list, java.lang.String str3, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation bankAccountConfirmation, boolean z, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountIssuer bankAccountIssuer, java.util.List list2, java.lang.String str4, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity bankAccountOnboardingEntity, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountStatus bankAccountStatus, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAuthorization bankAccountAuthorization, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (8191 != (i & 8191)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 8191, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.lastNChars = str2;
        this.type = bankAccountType;
        this.availableActions = list;
        this.currencyCode = str3;
        this.confirmation = bankAccountConfirmation;
        this.isSepaCompliant = z;
        this.issuer = bankAccountIssuer;
        this.institutionImages = list2;
        this.nickname = str4;
        this.onboardingEntity = bankAccountOnboardingEntity;
        this.status = bankAccountStatus;
        this.authorization = bankAccountAuthorization;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BankAccountDetails(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType, java.util.List<? extends com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction> list, java.lang.String str3, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation bankAccountConfirmation, boolean z, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountIssuer bankAccountIssuer, java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage> list2, java.lang.String str4, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity bankAccountOnboardingEntity, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountStatus bankAccountStatus, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAuthorization bankAccountAuthorization) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountIssuer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountOnboardingEntity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountAuthorization, "");
        this.id = str;
        this.lastNChars = str2;
        this.type = bankAccountType;
        this.availableActions = list;
        this.currencyCode = str3;
        this.confirmation = bankAccountConfirmation;
        this.isSepaCompliant = z;
        this.issuer = bankAccountIssuer;
        this.institutionImages = list2;
        this.nickname = str4;
        this.onboardingEntity = bankAccountOnboardingEntity;
        this.status = bankAccountStatus;
        this.authorization = bankAccountAuthorization;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.lastNChars);
        output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.type);
        output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.availableActions);
        output.encodeStringElement(serialDesc, 4, self.currencyCode);
        output.encodeNullableSerializableElement(serialDesc, 5, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation$$serializer.INSTANCE, self.confirmation);
        output.encodeBooleanElement(serialDesc, 6, self.isSepaCompliant);
        output.encodeSerializableElement(serialDesc, 7, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountIssuer$$serializer.INSTANCE, self.issuer);
        output.encodeSerializableElement(serialDesc, 8, lazyArr[8].getValue(), self.institutionImages);
        output.encodeNullableSerializableElement(serialDesc, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.nickname);
        output.encodeSerializableElement(serialDesc, 10, lazyArr[10].getValue(), self.onboardingEntity);
        output.encodeSerializableElement(serialDesc, 11, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountStatus$$serializer.INSTANCE, self.status);
        output.encodeSerializableElement(serialDesc, 12, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAuthorization$$serializer.INSTANCE, self.authorization);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    public final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType getType() {
        return this.type;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction> getAvailableActions() {
        return this.availableActions;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation getConfirmation() {
        return this.confirmation;
    }

    public final boolean isSepaCompliant() {
        return this.isSepaCompliant;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountIssuer getIssuer() {
        return this.issuer;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage> getInstitutionImages() {
        return this.institutionImages;
    }

    public final java.lang.String getNickname() {
        return this.nickname;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity getOnboardingEntity() {
        return this.onboardingEntity;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountStatus getStatus() {
        return this.status;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAuthorization getAuthorization() {
        return this.authorization;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$_Sn9l2673OyK9hiqxFp4OBubzQA() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction.INSTANCE.serializer());
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$zR5KeDBi98DL6I3V7aMdkXKRn4s() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.lastNChars;
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType = this.type;
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction> list = this.availableActions;
        java.lang.String str3 = this.currencyCode;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation bankAccountConfirmation = this.confirmation;
        boolean z = this.isSepaCompliant;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountIssuer bankAccountIssuer = this.issuer;
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage> list2 = this.institutionImages;
        java.lang.String str4 = this.nickname;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity bankAccountOnboardingEntity = this.onboardingEntity;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountStatus bankAccountStatus = this.status;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAuthorization bankAccountAuthorization = this.authorization;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BankAccountDetails(id=");
        sb.append(str);
        sb.append(", lastNChars=");
        sb.append(str2);
        sb.append(", type=");
        sb.append(bankAccountType);
        sb.append(", availableActions=");
        sb.append(list);
        sb.append(", currencyCode=");
        sb.append(str3);
        sb.append(", confirmation=");
        sb.append(bankAccountConfirmation);
        sb.append(", isSepaCompliant=");
        sb.append(z);
        sb.append(", issuer=");
        sb.append(bankAccountIssuer);
        sb.append(", institutionImages=");
        sb.append(list2);
        sb.append(", nickname=");
        sb.append(str4);
        sb.append(", onboardingEntity=");
        sb.append(bankAccountOnboardingEntity);
        sb.append(", status=");
        sb.append(bankAccountStatus);
        sb.append(", authorization=");
        sb.append(bankAccountAuthorization);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.lastNChars.hashCode();
        int hashCode3 = this.type.hashCode();
        int hashCode4 = this.availableActions.hashCode();
        int hashCode5 = this.currencyCode.hashCode();
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation bankAccountConfirmation = this.confirmation;
        int hashCode6 = bankAccountConfirmation == null ? 0 : bankAccountConfirmation.hashCode();
        int hashCode7 = java.lang.Boolean.hashCode(this.isSepaCompliant);
        int hashCode8 = this.issuer.hashCode();
        int hashCode9 = this.institutionImages.hashCode();
        java.lang.String str = this.nickname;
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.onboardingEntity.hashCode()) * 31) + this.status.hashCode()) * 31) + this.authorization.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails = (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, bankAccountDetails.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, bankAccountDetails.lastNChars) && this.type == bankAccountDetails.type && kotlin.jvm.internal.Intrinsics.areEqual(this.availableActions, bankAccountDetails.availableActions) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, bankAccountDetails.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmation, bankAccountDetails.confirmation) && this.isSepaCompliant == bankAccountDetails.isSepaCompliant && kotlin.jvm.internal.Intrinsics.areEqual(this.issuer, bankAccountDetails.issuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.institutionImages, bankAccountDetails.institutionImages) && kotlin.jvm.internal.Intrinsics.areEqual(this.nickname, bankAccountDetails.nickname) && this.onboardingEntity == bankAccountDetails.onboardingEntity && kotlin.jvm.internal.Intrinsics.areEqual(this.status, bankAccountDetails.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.authorization, bankAccountDetails.authorization);
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails copy(java.lang.String id, java.lang.String lastNChars, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType type, java.util.List<? extends com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction> availableActions, java.lang.String currencyCode, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation confirmation, boolean isSepaCompliant, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountIssuer issuer, java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage> institutionImages, java.lang.String nickname, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity onboardingEntity, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountStatus status, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAuthorization authorization) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableActions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(institutionImages, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardingEntity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authorization, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails(id, lastNChars, type, availableActions, currencyCode, confirmation, isSepaCompliant, issuer, institutionImages, nickname, onboardingEntity, status, authorization);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage> component9() {
        return this.institutionImages;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountIssuer getIssuer() {
        return this.issuer;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsSepaCompliant() {
        return this.isSepaCompliant;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation getConfirmation() {
        return this.confirmation;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction> component4() {
        return this.availableActions;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    /* renamed from: component13, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAuthorization getAuthorization() {
        return this.authorization;
    }

    /* renamed from: component12, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountStatus getStatus() {
        return this.status;
    }

    /* renamed from: component11, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity getOnboardingEntity() {
        return this.onboardingEntity;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getNickname() {
        return this.nickname;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
