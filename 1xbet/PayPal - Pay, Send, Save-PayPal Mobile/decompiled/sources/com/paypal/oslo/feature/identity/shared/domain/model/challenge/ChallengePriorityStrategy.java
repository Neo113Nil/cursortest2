package com.paypal.oslo.feature.identity.shared.domain.model.challenge;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengePriorityStrategy;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "Default", "SilentAuthFirst", "PreferredType", "FirstInList"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class ChallengePriorityStrategy {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy.Companion INSTANCE;
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy Default;
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy FirstInList;
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy PreferredType;
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy SilentAuthFirst;

    private ChallengePriorityStrategy(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy challengePriorityStrategy = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy("Default", 0);
        Default = challengePriorityStrategy;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy challengePriorityStrategy2 = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy("SilentAuthFirst", 1);
        SilentAuthFirst = challengePriorityStrategy2;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy challengePriorityStrategy3 = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy("PreferredType", 2);
        PreferredType = challengePriorityStrategy3;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy challengePriorityStrategy4 = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy("FirstInList", 3);
        FirstInList = challengePriorityStrategy4;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy[] challengePriorityStrategyArr = {challengePriorityStrategy, challengePriorityStrategy2, challengePriorityStrategy3, challengePriorityStrategy4};
        $VALUES = challengePriorityStrategyArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(challengePriorityStrategyArr);
        INSTANCE = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy", com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengePriorityStrategy$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "challenges", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengePriorityStrategy;", "fromChallenges", "(Ljava/util/List;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengePriorityStrategy;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy fromChallenges(java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenges, "");
            java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = challenges;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) it.next()).getType() == com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SILENT_AUTH) {
                        return com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy.SilentAuthFirst;
                    }
                }
            }
            return com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy.Default;
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy[] values() {
        return (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy> getEntries() {
        return $ENTRIES;
    }
}
