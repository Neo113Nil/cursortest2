package com.paypal.oslo.core.remoteconfig.contract;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigUserState;", "", "SdkNotInitialized", "NonAuthenticated", "Authenticated", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigUserState$Authenticated;", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigUserState$NonAuthenticated;", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigUserState$SdkNotInitialized;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface RemoteConfigUserState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigUserState$SdkNotInitialized;", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigUserState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SdkNotInitialized implements com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState {
        public static final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState.SdkNotInitialized INSTANCE = new com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState.SdkNotInitialized();

        public final int hashCode() {
            return -775571425;
        }

        private SdkNotInitialized() {
        }

        public final java.lang.String toString() {
            return "SdkNotInitialized";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState.SdkNotInitialized)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigUserState$NonAuthenticated;", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigUserState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class NonAuthenticated implements com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState {
        public static final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState.NonAuthenticated INSTANCE = new com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState.NonAuthenticated();

        public final int hashCode() {
            return -490665314;
        }

        private NonAuthenticated() {
        }

        public final java.lang.String toString() {
            return "NonAuthenticated";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState.NonAuthenticated)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigUserState$Authenticated;", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigUserState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class Authenticated implements com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState {
        public static final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState.Authenticated INSTANCE = new com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState.Authenticated();

        public final int hashCode() {
            return -1795399309;
        }

        private Authenticated() {
        }

        public final java.lang.String toString() {
            return "Authenticated";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState.Authenticated)) {
                return false;
            }
            return true;
        }
    }
}
