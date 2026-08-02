package com.paypal.oslo.feature.businessinventory.navigation;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode;", "Landroid/os/Parcelable;", "Companion", "View", "Select", "Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode$Select;", "Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode$View;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public interface TaxesPresentationMode extends android.os.Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Companion INSTANCE = com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Companion.Camera2StreamConfigurationMap;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Companion Camera2StreamConfigurationMap = new com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Companion();

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode> serializer() {
            return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode$Select$$serializer.INSTANCE, new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View", com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\u0006J\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode$View;", "Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode;", "<init>", "()V", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes11.dex */
    public static final /* data */ class View implements com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View INSTANCE = new com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode$View$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View.$r8$lambda$ieSCO0vHvnaPAPTnwCcGNkSK7rQ();
            }
        });
        public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View> CREATOR = new com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int hashCode() {
            return -595187148;
        }

        private View() {
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$ieSCO0vHvnaPAPTnwCcGNkSK7rQ() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View[] newArray(int i) {
                return new com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }

        public final java.lang.String toString() {
            return "View";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fJ\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010#\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode$Select;", "Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode;", "", "selectedTaxId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode$Select;", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$business_inventory_prodRelease", "(Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode$Select;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getSelectedTaxId", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Select implements com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode {
        public static final int $stable = 0;
        private final java.lang.String selectedTaxId;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select.Companion INSTANCE = new com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select.Companion(null);
        public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select> CREATOR = new com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode$Select$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode$Select;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select> serializer() {
                return com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode$Select$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Select(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.selectedTaxId = null;
            } else {
                this.selectedTaxId = str;
            }
        }

        public Select(java.lang.String str) {
            this.selectedTaxId = str;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$business_inventory_prodRelease(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.selectedTaxId != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.selectedTaxId);
            }
        }

        public /* synthetic */ Select(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getSelectedTaxId() {
            return this.selectedTaxId;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.selectedTaxId);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.selectedTaxId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Select(selectedTaxId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.selectedTaxId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedTaxId, ((com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select) other).selectedTaxId);
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select[] newArray(int i) {
                return new com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select(parcel.readString());
            }
        }

        public final com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select copy(java.lang.String selectedTaxId) {
            return new com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select(selectedTaxId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSelectedTaxId() {
            return this.selectedTaxId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select copy$default(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select select, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = select.selectedTaxId;
            }
            return select.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Select() {
            this((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
        }
    }
}
