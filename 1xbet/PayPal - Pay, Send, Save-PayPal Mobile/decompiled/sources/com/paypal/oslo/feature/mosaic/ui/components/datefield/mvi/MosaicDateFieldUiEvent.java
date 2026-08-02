package com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initialize", "FieldFocused", "FieldUnfocused", "DateValidated", "ValidationFailed", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiEvent$DateValidated;", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiEvent$FieldFocused;", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiEvent$FieldUnfocused;", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiEvent$Initialize;", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiEvent$ValidationFailed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class MosaicDateFieldUiEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private MosaicDateFieldUiEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiEvent$Initialize;", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiEvent;", "", "dateFormat", "inputMask", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiEvent$Initialize;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDateFormat", "getInputMask"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent {
        public static final int $stable = 0;
        private final java.lang.String dateFormat;
        private final java.lang.String inputMask;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initialize(java.lang.String str, java.lang.String str2) {
            super("Initialize", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.dateFormat = str;
            this.inputMask = str2;
        }

        public final java.lang.String getDateFormat() {
            return this.dateFormat;
        }

        public final java.lang.String getInputMask() {
            return this.inputMask;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.dateFormat;
            java.lang.String str2 = this.inputMask;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialize(dateFormat=");
            sb.append(str);
            sb.append(", inputMask=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.dateFormat.hashCode() * 31) + this.inputMask.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.Initialize)) {
                return false;
            }
            com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.Initialize initialize = (com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.Initialize) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.dateFormat, initialize.dateFormat) && kotlin.jvm.internal.Intrinsics.areEqual(this.inputMask, initialize.inputMask);
        }

        public final com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.Initialize copy(java.lang.String dateFormat, java.lang.String inputMask) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFormat, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputMask, "");
            return new com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.Initialize(dateFormat, inputMask);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getInputMask() {
            return this.inputMask;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDateFormat() {
            return this.dateFormat;
        }

        public static /* synthetic */ com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.Initialize copy$default(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.Initialize initialize, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = initialize.dateFormat;
            }
            if ((i & 2) != 0) {
                str2 = initialize.inputMask;
            }
            return initialize.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiEvent$FieldFocused;", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FieldFocused extends com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.FieldFocused INSTANCE = new com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.FieldFocused();

        public final int hashCode() {
            return -2069455706;
        }

        private FieldFocused() {
            super("FieldFocused", null);
        }

        public final java.lang.String toString() {
            return "FieldFocused";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.FieldFocused)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiEvent$FieldUnfocused;", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FieldUnfocused extends com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.FieldUnfocused INSTANCE = new com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.FieldUnfocused();

        public final int hashCode() {
            return -785444819;
        }

        private FieldUnfocused() {
            super("FieldUnfocused", null);
        }

        public final java.lang.String toString() {
            return "FieldUnfocused";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.FieldUnfocused)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiEvent$DateValidated;", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DateValidated extends com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.DateValidated INSTANCE = new com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.DateValidated();

        public final int hashCode() {
            return 1150461847;
        }

        private DateValidated() {
            super("DateValidated", null);
        }

        public final java.lang.String toString() {
            return "DateValidated";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.DateValidated)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiEvent$ValidationFailed;", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiEvent;", "", "error", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiEvent$ValidationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidationFailed extends com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent {
        public static final int $stable = 0;
        private final java.lang.String error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidationFailed(java.lang.String str) {
            super("ValidationFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.error = str;
        }

        public final java.lang.String getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationFailed(error=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.ValidationFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.ValidationFailed) other).error);
        }

        public final com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.ValidationFailed copy(java.lang.String error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.ValidationFailed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.ValidationFailed copy$default(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.ValidationFailed validationFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = validationFailed.error;
            }
            return validationFailed.copy(str);
        }
    }

    public /* synthetic */ MosaicDateFieldUiEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
