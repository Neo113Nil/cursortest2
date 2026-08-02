package com.paypal.oslo.feature.taptopay.ui.paymode.model;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents;", "", "RenderUiEvent", "NoActiveCardsFound", "ContactlessUnavailableEvent", "ErrorCardsNotLoadedEvent", "ErrorEvent", "NavigateToNfcSettingsPromptEvent", "NavigateToLimitReachedEvent", "PromptReAuthEvent", "NavigateToRequireScreenLockEvent", "AuthenticationExpiredEvent", "DismissPayModeEvent", "NavigateToEnableNfcPromptEvent", "DeviceCompromisedEvent", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$AuthenticationExpiredEvent;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$ContactlessUnavailableEvent;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$DeviceCompromisedEvent;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$DismissPayModeEvent;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$ErrorCardsNotLoadedEvent;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$ErrorEvent;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$NavigateToEnableNfcPromptEvent;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$NavigateToLimitReachedEvent;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$NavigateToNfcSettingsPromptEvent;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$NavigateToRequireScreenLockEvent;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$NoActiveCardsFound;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$PromptReAuthEvent;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$RenderUiEvent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PayModeEvents {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$RenderUiEvent;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RenderUiEvent implements com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.RenderUiEvent INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.RenderUiEvent();

        public final int hashCode() {
            return -1543490313;
        }

        private RenderUiEvent() {
        }

        public final java.lang.String toString() {
            return "RenderUiEvent";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.RenderUiEvent)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$NoActiveCardsFound;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoActiveCardsFound implements com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.NoActiveCardsFound INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.NoActiveCardsFound();

        public final int hashCode() {
            return -89462081;
        }

        private NoActiveCardsFound() {
        }

        public final java.lang.String toString() {
            return "NoActiveCardsFound";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.NoActiveCardsFound)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$ContactlessUnavailableEvent;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContactlessUnavailableEvent implements com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.ContactlessUnavailableEvent INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.ContactlessUnavailableEvent();

        public final int hashCode() {
            return -997085494;
        }

        private ContactlessUnavailableEvent() {
        }

        public final java.lang.String toString() {
            return "ContactlessUnavailableEvent";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.ContactlessUnavailableEvent)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$ErrorCardsNotLoadedEvent;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents;", "", "errorDescription", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$ErrorCardsNotLoadedEvent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ErrorCardsNotLoadedEvent implements com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents {
        public static final int $stable = 0;
        private final java.lang.String errorDescription;

        public ErrorCardsNotLoadedEvent(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorDescription = str;
        }

        public final java.lang.String getErrorDescription() {
            return this.errorDescription;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorDescription;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorCardsNotLoadedEvent(errorDescription=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorDescription.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.ErrorCardsNotLoadedEvent) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDescription, ((com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.ErrorCardsNotLoadedEvent) other).errorDescription);
        }

        public final com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.ErrorCardsNotLoadedEvent copy(java.lang.String errorDescription) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDescription, "");
            return new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.ErrorCardsNotLoadedEvent(errorDescription);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorDescription() {
            return this.errorDescription;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.ErrorCardsNotLoadedEvent copy$default(com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.ErrorCardsNotLoadedEvent errorCardsNotLoadedEvent, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = errorCardsNotLoadedEvent.errorDescription;
            }
            return errorCardsNotLoadedEvent.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$ErrorEvent;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents;", "", "errorCode", "errorDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$ErrorEvent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode", "getErrorDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ErrorEvent implements com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents {
        public static final int $stable = 0;
        private final java.lang.String errorCode;
        private final java.lang.String errorDescription;

        public ErrorEvent(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.errorCode = str;
            this.errorDescription = str2;
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String getErrorDescription() {
            return this.errorDescription;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorCode;
            java.lang.String str2 = this.errorDescription;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorEvent(errorCode=");
            sb.append(str);
            sb.append(", errorDescription=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.errorCode.hashCode() * 31) + this.errorDescription.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.ErrorEvent)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.ErrorEvent errorEvent = (com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.ErrorEvent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, errorEvent.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDescription, errorEvent.errorDescription);
        }

        public final com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.ErrorEvent copy(java.lang.String errorCode, java.lang.String errorDescription) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDescription, "");
            return new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.ErrorEvent(errorCode, errorDescription);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorDescription() {
            return this.errorDescription;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.ErrorEvent copy$default(com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.ErrorEvent errorEvent, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = errorEvent.errorCode;
            }
            if ((i & 2) != 0) {
                str2 = errorEvent.errorDescription;
            }
            return errorEvent.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$NavigateToNfcSettingsPromptEvent;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToNfcSettingsPromptEvent implements com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.NavigateToNfcSettingsPromptEvent INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.NavigateToNfcSettingsPromptEvent();

        public final int hashCode() {
            return -900178867;
        }

        private NavigateToNfcSettingsPromptEvent() {
        }

        public final java.lang.String toString() {
            return "NavigateToNfcSettingsPromptEvent";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.NavigateToNfcSettingsPromptEvent)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$NavigateToLimitReachedEvent;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToLimitReachedEvent implements com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.NavigateToLimitReachedEvent INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.NavigateToLimitReachedEvent();

        public final int hashCode() {
            return 435344414;
        }

        private NavigateToLimitReachedEvent() {
        }

        public final java.lang.String toString() {
            return "NavigateToLimitReachedEvent";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.NavigateToLimitReachedEvent)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$PromptReAuthEvent;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PromptReAuthEvent implements com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.PromptReAuthEvent INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.PromptReAuthEvent();

        public final int hashCode() {
            return -1086719902;
        }

        private PromptReAuthEvent() {
        }

        public final java.lang.String toString() {
            return "PromptReAuthEvent";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.PromptReAuthEvent)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$NavigateToRequireScreenLockEvent;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToRequireScreenLockEvent implements com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.NavigateToRequireScreenLockEvent INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.NavigateToRequireScreenLockEvent();

        public final int hashCode() {
            return -1539852925;
        }

        private NavigateToRequireScreenLockEvent() {
        }

        public final java.lang.String toString() {
            return "NavigateToRequireScreenLockEvent";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.NavigateToRequireScreenLockEvent)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$AuthenticationExpiredEvent;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthenticationExpiredEvent implements com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.AuthenticationExpiredEvent INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.AuthenticationExpiredEvent();

        public final int hashCode() {
            return 922545510;
        }

        private AuthenticationExpiredEvent() {
        }

        public final java.lang.String toString() {
            return "AuthenticationExpiredEvent";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.AuthenticationExpiredEvent)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$DismissPayModeEvent;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissPayModeEvent implements com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.DismissPayModeEvent INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.DismissPayModeEvent();

        public final int hashCode() {
            return 1278323808;
        }

        private DismissPayModeEvent() {
        }

        public final java.lang.String toString() {
            return "DismissPayModeEvent";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.DismissPayModeEvent)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$NavigateToEnableNfcPromptEvent;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToEnableNfcPromptEvent implements com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.NavigateToEnableNfcPromptEvent INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.NavigateToEnableNfcPromptEvent();

        public final int hashCode() {
            return -815831277;
        }

        private NavigateToEnableNfcPromptEvent() {
        }

        public final java.lang.String toString() {
            return "NavigateToEnableNfcPromptEvent";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.NavigateToEnableNfcPromptEvent)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents$DeviceCompromisedEvent;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeviceCompromisedEvent implements com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.DeviceCompromisedEvent INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.DeviceCompromisedEvent();

        public final int hashCode() {
            return 54213855;
        }

        private DeviceCompromisedEvent() {
        }

        public final java.lang.String toString() {
            return "DeviceCompromisedEvent";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.DeviceCompromisedEvent)) {
                return false;
            }
            return true;
        }
    }
}
