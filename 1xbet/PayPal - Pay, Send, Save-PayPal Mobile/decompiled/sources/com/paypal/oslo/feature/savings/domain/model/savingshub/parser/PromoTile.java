package com.paypal.oslo.feature.savings.domain.model.savingshub.parser;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b1\u0018\u0000 \u00162\u00020\u0001:\u0004\u0017\u0018\u0019\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118'X§\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0003\u001a\u001b\u001c"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoTile;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/SavingsHubComponent;", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoTile;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "getType", "()Ljava/lang/String;", "getType$annotations", "type", "Companion", "Promo", "Interest", "Unknown", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoTile$Interest;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoTile$Promo;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoTile$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class PromoTile implements com.paypal.oslo.feature.savings.domain.model.savingshub.parser.SavingsHubComponent {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Companion INSTANCE = new com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.m18718$r8$lambda$eoLvT7T1LzUDUktUqWlbYiuAc();
        }
    });

    @kotlinx.serialization.SerialName("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    public abstract java.lang.String getType();

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoTile$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoTile;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private PromoTile() {
    }

    public /* synthetic */ PromoTile(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000fJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoTile$Promo;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoTile;", "", "type", "", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/ConfigKV;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoTile$Promo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$savings_prodRelease", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoTile$Promo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getType", "Ljava/util/List;", "getConfiguration", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    @kotlinx.serialization.SerialName("PromoTile")
    public static final /* data */ class Promo extends com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile {
        private final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.ConfigKV> configuration;
        private final java.lang.String type;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Promo.Companion INSTANCE = new com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Promo.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile$Promo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Promo.$r8$lambda$DYmhcnwDpPDnCzlgSj6An_F1iNk();
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoTile$Promo$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoTile$Promo;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes14.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Promo> serializer() {
                return com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile$Promo$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Promo(int i, java.lang.String str, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if ((i & 1) == 0) {
                this.type = null;
            } else {
                this.type = str;
            }
            if ((i & 2) == 0) {
                this.configuration = null;
            } else {
                this.configuration = list;
            }
        }

        public Promo(java.lang.String str, java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.ConfigKV> list) {
            super(null);
            this.type = str;
            this.configuration = list;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$savings_prodRelease(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Promo self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.write$Self(self, output, serialDesc);
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.getType() != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.getType());
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.configuration != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.configuration);
            }
        }

        public /* synthetic */ Promo(java.lang.String str, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
        }

        @Override // com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile
        public final java.lang.String getType() {
            return this.type;
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.ConfigKV> getConfiguration() {
            return this.configuration;
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$DYmhcnwDpPDnCzlgSj6An_F1iNk() {
            return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.ConfigKV$$serializer.INSTANCE);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.type;
            java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.ConfigKV> list = this.configuration;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Promo(type=");
            sb.append(str);
            sb.append(", configuration=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.type;
            int hashCode = str == null ? 0 : str.hashCode();
            java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.ConfigKV> list = this.configuration;
            return (hashCode * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Promo)) {
                return false;
            }
            com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Promo promo = (com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Promo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.type, promo.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.configuration, promo.configuration);
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Promo copy(java.lang.String type, java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.ConfigKV> configuration) {
            return new com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Promo(type, configuration);
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.ConfigKV> component2() {
            return this.configuration;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getType() {
            return this.type;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Promo copy$default(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Promo promo, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = promo.type;
            }
            if ((i & 2) != 0) {
                list = promo.configuration;
            }
            return promo.copy(str, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Promo() {
            this((java.lang.String) null, (java.util.List) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000fJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoTile$Interest;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoTile;", "", "type", "", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/ConfigKV;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoTile$Interest;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$savings_prodRelease", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoTile$Interest;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getType", "Ljava/util/List;", "getConfiguration", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    @kotlinx.serialization.SerialName("InterestTile")
    public static final /* data */ class Interest extends com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile {
        private final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.ConfigKV> configuration;
        private final java.lang.String type;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Interest.Companion INSTANCE = new com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Interest.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile$Interest$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Interest.m18719$r8$lambda$aiTq75rgnmRYdb9SKVrCn4vxNU();
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoTile$Interest$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoTile$Interest;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes14.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Interest> serializer() {
                return com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile$Interest$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Interest(int i, java.lang.String str, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (2 != (i & 2)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 2, com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile$Interest$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.type = null;
            } else {
                this.type = str;
            }
            this.configuration = list;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Interest(java.lang.String str, java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.ConfigKV> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.type = str;
            this.configuration = list;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$savings_prodRelease(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Interest self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.write$Self(self, output, serialDesc);
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.getType() != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.getType());
            }
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.configuration);
        }

        public /* synthetic */ Interest(java.lang.String str, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, list);
        }

        @Override // com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile
        public final java.lang.String getType() {
            return this.type;
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.ConfigKV> getConfiguration() {
            return this.configuration;
        }

        /* renamed from: $r8$lambda$aiTq75rgnmRYdb9SKVrCn4-vxNU, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m18719$r8$lambda$aiTq75rgnmRYdb9SKVrCn4vxNU() {
            return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.ConfigKV$$serializer.INSTANCE);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.type;
            java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.ConfigKV> list = this.configuration;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Interest(type=");
            sb.append(str);
            sb.append(", configuration=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.type;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.configuration.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Interest)) {
                return false;
            }
            com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Interest interest = (com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Interest) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.type, interest.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.configuration, interest.configuration);
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Interest copy(java.lang.String type, java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.ConfigKV> configuration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
            return new com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Interest(type, configuration);
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.ConfigKV> component2() {
            return this.configuration;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getType() {
            return this.type;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Interest copy$default(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Interest interest, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = interest.type;
            }
            if ((i & 2) != 0) {
                list = interest.configuration;
            }
            return interest.copy(str, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000fJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoTile$Unknown;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoTile;", "", "type", "", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/ConfigKV;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoTile$Unknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$savings_prodRelease", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoTile$Unknown;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getType", "Ljava/util/List;", "getConfiguration", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Unknown extends com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile {
        private final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.ConfigKV> configuration;
        private final java.lang.String type;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Unknown.Companion INSTANCE = new com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Unknown.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile$Unknown$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Unknown.m18720$r8$lambda$dZtEFUN9Rrk7Q0xirjecpjulVg();
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoTile$Unknown$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoTile$Unknown;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes14.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Unknown> serializer() {
                return com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile$Unknown$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Unknown(int i, java.lang.String str, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile$Unknown$$serializer.INSTANCE.getDescriptor());
            }
            this.type = str;
            if ((i & 2) == 0) {
                this.configuration = kotlin.collections.CollectionsKt.emptyList();
            } else {
                this.configuration = list;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(java.lang.String str, java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.ConfigKV> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.type = str;
            this.configuration = list;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$savings_prodRelease(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Unknown self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.write$Self(self, output, serialDesc);
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.getType());
            if (output.shouldEncodeElementDefault(serialDesc, 1) || !kotlin.jvm.internal.Intrinsics.areEqual(self.configuration, kotlin.collections.CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.configuration);
            }
        }

        @Override // com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile
        public final java.lang.String getType() {
            return this.type;
        }

        public /* synthetic */ Unknown(java.lang.String str, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.ConfigKV> getConfiguration() {
            return this.configuration;
        }

        /* renamed from: $r8$lambda$dZtEFUN9Rrk7Q0xirjecpj-ulVg, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m18720$r8$lambda$dZtEFUN9Rrk7Q0xirjecpjulVg() {
            return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.ConfigKV$$serializer.INSTANCE);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.type;
            java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.ConfigKV> list = this.configuration;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(type=");
            sb.append(str);
            sb.append(", configuration=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.type.hashCode() * 31) + this.configuration.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Unknown)) {
                return false;
            }
            com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Unknown unknown = (com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Unknown) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.type, unknown.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.configuration, unknown.configuration);
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Unknown copy(java.lang.String type, java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.ConfigKV> configuration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
            return new com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Unknown(type, configuration);
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.ConfigKV> component2() {
            return this.configuration;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getType() {
            return this.type;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Unknown copy$default(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Unknown unknown, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unknown.type;
            }
            if ((i & 2) != 0) {
                list = unknown.configuration;
            }
            return unknown.copy(str, list);
        }
    }

    /* renamed from: $r8$lambda$eoLv-T7T1LzU-DUktUqWlbYiuAc, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m18718$r8$lambda$eoLvT7T1LzUDUktUqWlbYiuAc() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Interest.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Promo.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile.Unknown.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile$Interest$$serializer.INSTANCE, com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile$Promo$$serializer.INSTANCE, com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile$Unknown$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ PromoTile(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
