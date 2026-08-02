package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/LocaleResolverMetaData;", "", "", "Lcom/paypal/oslo/core/i18n/domain/model/Country;", "countriesList", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/core/i18n/domain/model/LocaleResolverMetaData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$i18n_release", "(Lcom/paypal/oslo/core/i18n/domain/model/LocaleResolverMetaData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getCountriesList", "getCountriesList$annotations", "()V", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class LocaleResolverMetaData {
    private final java.util.List<com.paypal.oslo.core.i18n.domain.model.Country> countriesList;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.i18n.domain.model.LocaleResolverMetaData.Companion INSTANCE = new com.paypal.oslo.core.i18n.domain.model.LocaleResolverMetaData.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.i18n.domain.model.LocaleResolverMetaData$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.core.i18n.domain.model.LocaleResolverMetaData.$r8$lambda$f51fKbwW4kaFI5ljPZNVvVWxUUo();
        }
    })};

    @kotlinx.serialization.SerialName("countrylist")
    public static /* synthetic */ void getCountriesList$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/LocaleResolverMetaData$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/i18n/domain/model/LocaleResolverMetaData;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.i18n.domain.model.LocaleResolverMetaData> serializer() {
            return com.paypal.oslo.core.i18n.domain.model.LocaleResolverMetaData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ LocaleResolverMetaData(int i, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.core.i18n.domain.model.LocaleResolverMetaData$$serializer.INSTANCE.getDescriptor());
        }
        this.countriesList = list;
    }

    public LocaleResolverMetaData(java.util.List<com.paypal.oslo.core.i18n.domain.model.Country> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.countriesList = list;
    }

    public final java.util.List<com.paypal.oslo.core.i18n.domain.model.Country> getCountriesList() {
        return this.countriesList;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$f51fKbwW4kaFI5ljPZNVvVWxUUo() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.core.i18n.domain.model.Country$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.core.i18n.domain.model.Country> list = this.countriesList;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LocaleResolverMetaData(countriesList=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.countriesList.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.core.i18n.domain.model.LocaleResolverMetaData) && kotlin.jvm.internal.Intrinsics.areEqual(this.countriesList, ((com.paypal.oslo.core.i18n.domain.model.LocaleResolverMetaData) other).countriesList);
    }

    public final com.paypal.oslo.core.i18n.domain.model.LocaleResolverMetaData copy(java.util.List<com.paypal.oslo.core.i18n.domain.model.Country> countriesList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countriesList, "");
        return new com.paypal.oslo.core.i18n.domain.model.LocaleResolverMetaData(countriesList);
    }

    public final java.util.List<com.paypal.oslo.core.i18n.domain.model.Country> component1() {
        return this.countriesList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.LocaleResolverMetaData copy$default(com.paypal.oslo.core.i18n.domain.model.LocaleResolverMetaData localeResolverMetaData, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = localeResolverMetaData.countriesList;
        }
        return localeResolverMetaData.copy(list);
    }
}
