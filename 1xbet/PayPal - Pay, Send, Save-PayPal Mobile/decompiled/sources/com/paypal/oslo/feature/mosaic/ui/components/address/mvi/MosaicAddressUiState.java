package com.paypal.oslo.feature.mosaic.ui.components.address.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Loading", "Loaded", "Error", "Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiState$Error;", "Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiState$Initial;", "Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiState$Loaded;", "Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiState$Loading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class MosaicAddressUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private MosaicAddressUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiState$Initial;", "Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Initial INSTANCE = new com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Initial();

        public final int hashCode() {
            return 1489641506;
        }

        private Initial() {
            super("Initial", null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiState$Loading;", "Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Loading INSTANCE = new com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Loading();

        public final int hashCode() {
            return -122050022;
        }

        private Loading() {
            super("Loading", null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiState$Loaded;", "Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiState;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "", "", "fieldValues", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;Ljava/util/Map;)V", "component1", "()Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;", "component2", "()Ljava/util/Map;", "copy", "(Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;Ljava/util/Map;)Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiState$Loaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;", "getLayout", "Ljava/util/Map;", "getFieldValues"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loaded extends com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState {
        public static final int $stable = 8;
        private final java.util.Map<java.lang.String, java.lang.String> fieldValues;
        private final com.paypal.oslo.core.i18n.domain.model.AddressLayout layout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(com.paypal.oslo.core.i18n.domain.model.AddressLayout addressLayout, java.util.Map<java.lang.String, java.lang.String> map) {
            super("Loaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressLayout, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.layout = addressLayout;
            this.fieldValues = map;
        }

        public final com.paypal.oslo.core.i18n.domain.model.AddressLayout getLayout() {
            return this.layout;
        }

        public /* synthetic */ Loaded(com.paypal.oslo.core.i18n.domain.model.AddressLayout addressLayout, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(addressLayout, (i & 2) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
        }

        public final java.util.Map<java.lang.String, java.lang.String> getFieldValues() {
            return this.fieldValues;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.i18n.domain.model.AddressLayout addressLayout = this.layout;
            java.util.Map<java.lang.String, java.lang.String> map = this.fieldValues;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loaded(layout=");
            sb.append(addressLayout);
            sb.append(", fieldValues=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.layout.hashCode() * 31) + this.fieldValues.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Loaded)) {
                return false;
            }
            com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Loaded loaded = (com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Loaded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.layout, loaded.layout) && kotlin.jvm.internal.Intrinsics.areEqual(this.fieldValues, loaded.fieldValues);
        }

        public final com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Loaded copy(com.paypal.oslo.core.i18n.domain.model.AddressLayout layout, java.util.Map<java.lang.String, java.lang.String> fieldValues) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layout, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldValues, "");
            return new com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Loaded(layout, fieldValues);
        }

        public final java.util.Map<java.lang.String, java.lang.String> component2() {
            return this.fieldValues;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.AddressLayout getLayout() {
            return this.layout;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Loaded copy$default(com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Loaded loaded, com.paypal.oslo.core.i18n.domain.model.AddressLayout addressLayout, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addressLayout = loaded.layout;
            }
            if ((i & 2) != 0) {
                map = loaded.fieldValues;
            }
            return loaded.copy(addressLayout, map);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiState$Error;", "Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Error) other).message);
        }

        public final com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Error copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Error(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Error copy$default(com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }
    }

    public /* synthetic */ MosaicAddressUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
