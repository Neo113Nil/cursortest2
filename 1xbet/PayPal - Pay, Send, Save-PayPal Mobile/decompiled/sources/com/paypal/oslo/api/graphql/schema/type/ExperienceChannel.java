package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ExperienceChannel;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", com.paypal.oslo.feature.debitcard.pushprovisioning.constants.PushProvisioningConstants.EXPERIENCE_CHANNEL, "EIGHT_BALL", com.paypal.android.taptopay.domain.repository.payment.PPDCFIRequestResponseModelsKt.EXPERIENCE_CHANNEL_VENICE, "ADMIN", "IVR", "MERCHANT_ONB", "CONNECT_WITH_PP", "DAEMON", "ACCEPT_MONEY", "OSLO", "WALLET_EXTENSION", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExperienceChannel {
    public static final com.paypal.oslo.api.graphql.schema.type.ExperienceChannel ACCEPT_MONEY;
    public static final com.paypal.oslo.api.graphql.schema.type.ExperienceChannel ADMIN;
    public static final com.paypal.oslo.api.graphql.schema.type.ExperienceChannel CONNECT_WITH_PP;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.ExperienceChannel.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ExperienceChannel DAEMON;
    public static final com.paypal.oslo.api.graphql.schema.type.ExperienceChannel EIGHT_BALL;
    public static final com.paypal.oslo.api.graphql.schema.type.ExperienceChannel IVR;
    public static final com.paypal.oslo.api.graphql.schema.type.ExperienceChannel MERCHANT_ONB;
    public static final com.paypal.oslo.api.graphql.schema.type.ExperienceChannel OSLO;
    public static final com.paypal.oslo.api.graphql.schema.type.ExperienceChannel TESLA;
    public static final com.paypal.oslo.api.graphql.schema.type.ExperienceChannel UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.ExperienceChannel VENICE;
    public static final com.paypal.oslo.api.graphql.schema.type.ExperienceChannel WALLET_EXTENSION;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ExperienceChannel[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ExperienceChannel(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.ExperienceChannel experienceChannel = new com.paypal.oslo.api.graphql.schema.type.ExperienceChannel(com.paypal.oslo.feature.debitcard.pushprovisioning.constants.PushProvisioningConstants.EXPERIENCE_CHANNEL, 0, com.paypal.oslo.feature.debitcard.pushprovisioning.constants.PushProvisioningConstants.EXPERIENCE_CHANNEL);
        TESLA = experienceChannel;
        com.paypal.oslo.api.graphql.schema.type.ExperienceChannel experienceChannel2 = new com.paypal.oslo.api.graphql.schema.type.ExperienceChannel("EIGHT_BALL", 1, "EIGHT_BALL");
        EIGHT_BALL = experienceChannel2;
        com.paypal.oslo.api.graphql.schema.type.ExperienceChannel experienceChannel3 = new com.paypal.oslo.api.graphql.schema.type.ExperienceChannel(com.paypal.android.taptopay.domain.repository.payment.PPDCFIRequestResponseModelsKt.EXPERIENCE_CHANNEL_VENICE, 2, com.paypal.android.taptopay.domain.repository.payment.PPDCFIRequestResponseModelsKt.EXPERIENCE_CHANNEL_VENICE);
        VENICE = experienceChannel3;
        com.paypal.oslo.api.graphql.schema.type.ExperienceChannel experienceChannel4 = new com.paypal.oslo.api.graphql.schema.type.ExperienceChannel("ADMIN", 3, "ADMIN");
        ADMIN = experienceChannel4;
        com.paypal.oslo.api.graphql.schema.type.ExperienceChannel experienceChannel5 = new com.paypal.oslo.api.graphql.schema.type.ExperienceChannel("IVR", 4, "IVR");
        IVR = experienceChannel5;
        com.paypal.oslo.api.graphql.schema.type.ExperienceChannel experienceChannel6 = new com.paypal.oslo.api.graphql.schema.type.ExperienceChannel("MERCHANT_ONB", 5, "MERCHANT_ONB");
        MERCHANT_ONB = experienceChannel6;
        com.paypal.oslo.api.graphql.schema.type.ExperienceChannel experienceChannel7 = new com.paypal.oslo.api.graphql.schema.type.ExperienceChannel("CONNECT_WITH_PP", 6, "CONNECT_WITH_PP");
        CONNECT_WITH_PP = experienceChannel7;
        com.paypal.oslo.api.graphql.schema.type.ExperienceChannel experienceChannel8 = new com.paypal.oslo.api.graphql.schema.type.ExperienceChannel("DAEMON", 7, "DAEMON");
        DAEMON = experienceChannel8;
        com.paypal.oslo.api.graphql.schema.type.ExperienceChannel experienceChannel9 = new com.paypal.oslo.api.graphql.schema.type.ExperienceChannel("ACCEPT_MONEY", 8, "ACCEPT_MONEY");
        ACCEPT_MONEY = experienceChannel9;
        com.paypal.oslo.api.graphql.schema.type.ExperienceChannel experienceChannel10 = new com.paypal.oslo.api.graphql.schema.type.ExperienceChannel("OSLO", 9, "OSLO");
        OSLO = experienceChannel10;
        com.paypal.oslo.api.graphql.schema.type.ExperienceChannel experienceChannel11 = new com.paypal.oslo.api.graphql.schema.type.ExperienceChannel("WALLET_EXTENSION", 10, "WALLET_EXTENSION");
        WALLET_EXTENSION = experienceChannel11;
        com.paypal.oslo.api.graphql.schema.type.ExperienceChannel experienceChannel12 = new com.paypal.oslo.api.graphql.schema.type.ExperienceChannel("UNKNOWN__", 11, "UNKNOWN__");
        UNKNOWN__ = experienceChannel12;
        com.paypal.oslo.api.graphql.schema.type.ExperienceChannel[] experienceChannelArr = {experienceChannel, experienceChannel2, experienceChannel3, experienceChannel4, experienceChannel5, experienceChannel6, experienceChannel7, experienceChannel8, experienceChannel9, experienceChannel10, experienceChannel11, experienceChannel12};
        getHighSpeedVideoFpsRangesFor = experienceChannelArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(experienceChannelArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.ExperienceChannel.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("ExperienceChannel", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.debitcard.pushprovisioning.constants.PushProvisioningConstants.EXPERIENCE_CHANNEL, "EIGHT_BALL", com.paypal.android.taptopay.domain.repository.payment.PPDCFIRequestResponseModelsKt.EXPERIENCE_CHANNEL_VENICE, "ADMIN", "IVR", "MERCHANT_ONB", "CONNECT_WITH_PP", "DAEMON", "ACCEPT_MONEY", "OSLO", "WALLET_EXTENSION"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ExperienceChannel$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/ExperienceChannel;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/ExperienceChannel;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ExperienceChannel;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.ExperienceChannel.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ExperienceChannel[]{com.paypal.oslo.api.graphql.schema.type.ExperienceChannel.TESLA, com.paypal.oslo.api.graphql.schema.type.ExperienceChannel.EIGHT_BALL, com.paypal.oslo.api.graphql.schema.type.ExperienceChannel.VENICE, com.paypal.oslo.api.graphql.schema.type.ExperienceChannel.ADMIN, com.paypal.oslo.api.graphql.schema.type.ExperienceChannel.IVR, com.paypal.oslo.api.graphql.schema.type.ExperienceChannel.MERCHANT_ONB, com.paypal.oslo.api.graphql.schema.type.ExperienceChannel.CONNECT_WITH_PP, com.paypal.oslo.api.graphql.schema.type.ExperienceChannel.DAEMON, com.paypal.oslo.api.graphql.schema.type.ExperienceChannel.ACCEPT_MONEY, com.paypal.oslo.api.graphql.schema.type.ExperienceChannel.OSLO, com.paypal.oslo.api.graphql.schema.type.ExperienceChannel.WALLET_EXTENSION});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.ExperienceChannel[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.ExperienceChannel[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.ExperienceChannel[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.ExperienceChannel safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.ExperienceChannel.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.ExperienceChannel) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.ExperienceChannel experienceChannel = (com.paypal.oslo.api.graphql.schema.type.ExperienceChannel) obj;
            return experienceChannel == null ? com.paypal.oslo.api.graphql.schema.type.ExperienceChannel.UNKNOWN__ : experienceChannel;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.ExperienceChannel[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.ExperienceChannel[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.ExperienceChannel valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.ExperienceChannel) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.ExperienceChannel.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
