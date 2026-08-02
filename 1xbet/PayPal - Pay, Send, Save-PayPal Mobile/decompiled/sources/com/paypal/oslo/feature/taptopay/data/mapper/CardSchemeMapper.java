package com.paypal.oslo.feature.taptopay.data.mapper;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/mapper/CardSchemeMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/taptopay/domain/model/setup/CardScheme;", "domain", "Lcom/payair/model/CardScheme;", "domainToSdk", "(Lcom/paypal/oslo/feature/taptopay/domain/model/setup/CardScheme;)Lcom/payair/model/CardScheme;", "sdk", "sdkToDomain", "(Lcom/payair/model/CardScheme;)Lcom/paypal/oslo/feature/taptopay/domain/model/setup/CardScheme;", "", "domains", "", "domainListToSdkSet", "(Ljava/util/List;)Ljava/util/Set;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardSchemeMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.taptopay.data.mapper.CardSchemeMapper INSTANCE = new com.paypal.oslo.feature.taptopay.data.mapper.CardSchemeMapper();

    private CardSchemeMapper() {
    }

    public final com.payair.model.CardScheme domainToSdk(com.paypal.oslo.feature.taptopay.domain.model.setup.CardScheme domain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domain, "");
        java.lang.String code = domain.getCode();
        if (kotlin.jvm.internal.Intrinsics.areEqual(code, "VISA")) {
            return com.payair.model.CardScheme.VISA;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(code, "MASTERCARD")) {
            return com.payair.model.CardScheme.MASTERCARD;
        }
        throw new java.lang.IllegalArgumentException("Unknown card scheme: ".concat(java.lang.String.valueOf(domain.getCode())));
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.setup.CardScheme sdkToDomain(com.payair.model.CardScheme sdk) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdk, "");
        int i = com.paypal.oslo.feature.taptopay.data.mapper.CardSchemeMapper.WhenMappings.$EnumSwitchMapping$0[sdk.ordinal()];
        if (i == 1) {
            return new com.paypal.oslo.feature.taptopay.domain.model.setup.CardScheme("Visa", "VISA");
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.taptopay.domain.model.setup.CardScheme("Mastercard", "MASTERCARD");
    }

    public final java.util.Set<com.payair.model.CardScheme> domainListToSdkSet(java.util.List<com.paypal.oslo.feature.taptopay.domain.model.setup.CardScheme> domains) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domains, "");
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.setup.CardScheme> list = domains;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.domainToSdk((com.paypal.oslo.feature.taptopay.domain.model.setup.CardScheme) it.next()));
        }
        return kotlin.collections.CollectionsKt.toSet(arrayList);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.payair.model.CardScheme.values().length];
            try {
                iArr[com.payair.model.CardScheme.VISA.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.payair.model.CardScheme.MASTERCARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
