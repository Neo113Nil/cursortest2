package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003$%#B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;", "", "", "Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout$Row;", "rows", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$i18n_release", "(Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getRows", "Companion", "Row", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class AddressLayout {
    private final java.util.List<com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row> rows;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.i18n.domain.model.AddressLayout.Companion INSTANCE = new com.paypal.oslo.core.i18n.domain.model.AddressLayout.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.i18n.domain.model.AddressLayout$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.core.i18n.domain.model.AddressLayout.$r8$lambda$6IATr2qXICrBbLFzs4R0tkOsN0E();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.i18n.domain.model.AddressLayout> serializer() {
            return com.paypal.oslo.core.i18n.domain.model.AddressLayout$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AddressLayout(int i, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.core.i18n.domain.model.AddressLayout$$serializer.INSTANCE.getDescriptor());
        }
        this.rows = list;
    }

    public AddressLayout(java.util.List<com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.rows = list;
    }

    public final java.util.List<com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row> getRows() {
        return this.rows;
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout$Row;", "", "", "Lcom/paypal/oslo/core/i18n/domain/model/AddressComponent;", "components", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout$Row;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$i18n_release", "(Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout$Row;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getComponents", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Row {
        private final java.util.List<com.paypal.oslo.core.i18n.domain.model.AddressComponent> components;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row.Companion INSTANCE = new com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.i18n.domain.model.AddressLayout$Row$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row.$r8$lambda$GoDDpZ7KyuK1FC0Uv5F9juVxuVI();
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout$Row$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout$Row;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes10.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row> serializer() {
                return com.paypal.oslo.core.i18n.domain.model.AddressLayout$Row$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Row(int i, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.core.i18n.domain.model.AddressLayout$Row$$serializer.INSTANCE.getDescriptor());
            }
            this.components = list;
        }

        public Row(java.util.List<com.paypal.oslo.core.i18n.domain.model.AddressComponent> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.components = list;
        }

        public final java.util.List<com.paypal.oslo.core.i18n.domain.model.AddressComponent> getComponents() {
            return this.components;
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$GoDDpZ7KyuK1FC0Uv5F9juVxuVI() {
            return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.core.i18n.domain.model.AddressComponent$$serializer.INSTANCE);
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.core.i18n.domain.model.AddressComponent> list = this.components;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Row(components=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.components.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row) && kotlin.jvm.internal.Intrinsics.areEqual(this.components, ((com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row) other).components);
        }

        public final com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row copy(java.util.List<com.paypal.oslo.core.i18n.domain.model.AddressComponent> components) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(components, "");
            return new com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row(components);
        }

        public final java.util.List<com.paypal.oslo.core.i18n.domain.model.AddressComponent> component1() {
            return this.components;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row copy$default(com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row row, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = row.components;
            }
            return row.copy(list);
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$6IATr2qXICrBbLFzs4R0tkOsN0E() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.core.i18n.domain.model.AddressLayout$Row$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row> list = this.rows;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressLayout(rows=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.rows.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.core.i18n.domain.model.AddressLayout) && kotlin.jvm.internal.Intrinsics.areEqual(this.rows, ((com.paypal.oslo.core.i18n.domain.model.AddressLayout) other).rows);
    }

    public final com.paypal.oslo.core.i18n.domain.model.AddressLayout copy(java.util.List<com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row> rows) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rows, "");
        return new com.paypal.oslo.core.i18n.domain.model.AddressLayout(rows);
    }

    public final java.util.List<com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row> component1() {
        return this.rows;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.AddressLayout copy$default(com.paypal.oslo.core.i18n.domain.model.AddressLayout addressLayout, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = addressLayout.rows;
        }
        return addressLayout.copy(list);
    }
}
