package com.paypal.oslo.feature.mosaic.ui.components.address.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadLayout", "LayoutLoaded", "LayoutFailed", "FieldValueChanged", "Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiEvent$FieldValueChanged;", "Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiEvent$LayoutFailed;", "Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiEvent$LayoutLoaded;", "Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiEvent$LoadLayout;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class MosaicAddressUiEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private MosaicAddressUiEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiEvent$LoadLayout;", "Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadLayout extends com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.LoadLayout INSTANCE = new com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.LoadLayout();

        public final int hashCode() {
            return -44405655;
        }

        private LoadLayout() {
            super("LoadLayout", null);
        }

        public final java.lang.String toString() {
            return "LoadLayout";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.LoadLayout)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiEvent$LayoutLoaded;", "Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiEvent;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;)V", "component1", "()Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;", "copy", "(Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;)Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiEvent$LayoutLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;", "getLayout"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LayoutLoaded extends com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.i18n.domain.model.AddressLayout layout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayoutLoaded(com.paypal.oslo.core.i18n.domain.model.AddressLayout addressLayout) {
            super("LayoutLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressLayout, "");
            this.layout = addressLayout;
        }

        public final com.paypal.oslo.core.i18n.domain.model.AddressLayout getLayout() {
            return this.layout;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.i18n.domain.model.AddressLayout addressLayout = this.layout;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LayoutLoaded(layout=");
            sb.append(addressLayout);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.layout.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.LayoutLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.layout, ((com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.LayoutLoaded) other).layout);
        }

        public final com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.LayoutLoaded copy(com.paypal.oslo.core.i18n.domain.model.AddressLayout layout) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layout, "");
            return new com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.LayoutLoaded(layout);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.AddressLayout getLayout() {
            return this.layout;
        }

        public static /* synthetic */ com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.LayoutLoaded copy$default(com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.LayoutLoaded layoutLoaded, com.paypal.oslo.core.i18n.domain.model.AddressLayout addressLayout, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addressLayout = layoutLoaded.layout;
            }
            return layoutLoaded.copy(addressLayout);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiEvent$LayoutFailed;", "Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiEvent;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiEvent$LayoutFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LayoutFailed extends com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayoutFailed(java.lang.String str) {
            super("LayoutFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LayoutFailed(message=");
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
            return (other instanceof com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.LayoutFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.LayoutFailed) other).message);
        }

        public final com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.LayoutFailed copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.LayoutFailed(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.LayoutFailed copy$default(com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.LayoutFailed layoutFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = layoutFailed.message;
            }
            return layoutFailed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiEvent$FieldValueChanged;", "Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiEvent;", "", "fieldId", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiEvent$FieldValueChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFieldId", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FieldValueChanged extends com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent {
        public static final int $stable = 0;
        private final java.lang.String fieldId;
        private final java.lang.String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FieldValueChanged(java.lang.String str, java.lang.String str2) {
            super("FieldValueChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.fieldId = str;
            this.value = str2;
        }

        public final java.lang.String getFieldId() {
            return this.fieldId;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.fieldId;
            java.lang.String str2 = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FieldValueChanged(fieldId=");
            sb.append(str);
            sb.append(", value=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.fieldId.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.FieldValueChanged)) {
                return false;
            }
            com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.FieldValueChanged fieldValueChanged = (com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.FieldValueChanged) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.fieldId, fieldValueChanged.fieldId) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, fieldValueChanged.value);
        }

        public final com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.FieldValueChanged copy(java.lang.String fieldId, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.FieldValueChanged(fieldId, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFieldId() {
            return this.fieldId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.FieldValueChanged copy$default(com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.FieldValueChanged fieldValueChanged, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fieldValueChanged.fieldId;
            }
            if ((i & 2) != 0) {
                str2 = fieldValueChanged.value;
            }
            return fieldValueChanged.copy(str, str2);
        }
    }

    public /* synthetic */ MosaicAddressUiEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
