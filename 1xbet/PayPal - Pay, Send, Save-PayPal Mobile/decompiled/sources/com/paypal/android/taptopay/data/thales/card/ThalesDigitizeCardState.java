package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState;", "", "DigitizeCardCompleted", "Error", "HandleAppToAppIdentityVerification", "HandleOtpIdentityVerification", "SDKError", "SelectIdentityVerification", "Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState$DigitizeCardCompleted;", "Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState$Error;", "Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState$HandleAppToAppIdentityVerification;", "Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState$HandleOtpIdentityVerification;", "Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState$SDKError;", "Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState$SelectIdentityVerification;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface ThalesDigitizeCardState {

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ,\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJF\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022$\b\u0002\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\rR6\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState$SelectIdentityVerification;", "Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState;", "", "Lcom/paypal/android/taptopay/domain/model/card/IdentityVerificationMethod;", "methods", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "onSelected", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "component1", "()Ljava/util/List;", "component2", "()Lkotlin/jvm/functions/Function2;", "copy", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState$SelectIdentityVerification;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getMethods", "Lkotlin/jvm/functions/Function2;", "getOnSelected"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectIdentityVerification implements com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState {
        private final java.util.List<com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod> methods;
        private final kotlin.jvm.functions.Function2<com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> onSelected;

        /* JADX WARN: Multi-variable type inference failed */
        public SelectIdentityVerification(java.util.List<? extends com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod> list, kotlin.jvm.functions.Function2<? super com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
            this.methods = list;
            this.onSelected = function2;
        }

        public final java.util.List<com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod> getMethods() {
            return this.methods;
        }

        public final kotlin.jvm.functions.Function2<com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getOnSelected() {
            return this.onSelected;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod> list = this.methods;
            kotlin.jvm.functions.Function2<com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.onSelected;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectIdentityVerification(methods=");
            sb.append(list);
            sb.append(", onSelected=");
            sb.append(function2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.methods.hashCode() * 31) + this.onSelected.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.SelectIdentityVerification)) {
                return false;
            }
            com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.SelectIdentityVerification selectIdentityVerification = (com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.SelectIdentityVerification) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.methods, selectIdentityVerification.methods) && kotlin.jvm.internal.Intrinsics.areEqual(this.onSelected, selectIdentityVerification.onSelected);
        }

        public final com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.SelectIdentityVerification copy(java.util.List<? extends com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod> methods, kotlin.jvm.functions.Function2<? super com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> onSelected) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methods, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onSelected, "");
            return new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.SelectIdentityVerification(methods, onSelected);
        }

        public final kotlin.jvm.functions.Function2<com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> component2() {
            return this.onSelected;
        }

        public final java.util.List<com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod> component1() {
            return this.methods;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.SelectIdentityVerification copy$default(com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.SelectIdentityVerification selectIdentityVerification, java.util.List list, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = selectIdentityVerification.methods;
            }
            if ((i & 2) != 0) {
                function2 = selectIdentityVerification.onSelected;
            }
            return selectIdentityVerification.copy(list, function2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ,\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\f\u001a\u00020\u00002$\b\u0002\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R3\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState$HandleOtpIdentityVerification;", "Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState;", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "", "", "onOtp", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "component1", "()Lkotlin/jvm/functions/Function2;", "copy", "(Lkotlin/jvm/functions/Function2;)Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState$HandleOtpIdentityVerification;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function2;", "getOnOtp"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleOtpIdentityVerification implements com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState {
        private final kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> onOtp;

        /* JADX WARN: Multi-variable type inference failed */
        public HandleOtpIdentityVerification(kotlin.jvm.functions.Function2<? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
            this.onOtp = function2;
        }

        public final kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getOnOtp() {
            return this.onOtp;
        }

        public final java.lang.String toString() {
            kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.onOtp;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HandleOtpIdentityVerification(onOtp=");
            sb.append(function2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.onOtp.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.HandleOtpIdentityVerification) && kotlin.jvm.internal.Intrinsics.areEqual(this.onOtp, ((com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.HandleOtpIdentityVerification) other).onOtp);
        }

        public final com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.HandleOtpIdentityVerification copy(kotlin.jvm.functions.Function2<? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> onOtp) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onOtp, "");
            return new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.HandleOtpIdentityVerification(onOtp);
        }

        public final kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> component1() {
            return this.onOtp;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.HandleOtpIdentityVerification copy$default(com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.HandleOtpIdentityVerification handleOtpIdentityVerification, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function2 = handleOtpIdentityVerification.onOtp;
            }
            return handleOtpIdentityVerification.copy(function2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState$HandleAppToAppIdentityVerification;", "Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState;", "", "scheme", "payload", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState$HandleAppToAppIdentityVerification;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPayload", "getScheme", "getSource"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleAppToAppIdentityVerification implements com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState {
        private final java.lang.String payload;
        private final java.lang.String scheme;
        private final java.lang.String source;

        public HandleAppToAppIdentityVerification(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.scheme = str;
            this.payload = str2;
            this.source = str3;
        }

        public final java.lang.String getScheme() {
            return this.scheme;
        }

        public final java.lang.String getPayload() {
            return this.payload;
        }

        public final java.lang.String getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.scheme;
            java.lang.String str2 = this.payload;
            java.lang.String str3 = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HandleAppToAppIdentityVerification(scheme=");
            sb.append(str);
            sb.append(", payload=");
            sb.append(str2);
            sb.append(", source=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.scheme.hashCode() * 31) + this.payload.hashCode()) * 31) + this.source.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.HandleAppToAppIdentityVerification)) {
                return false;
            }
            com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.HandleAppToAppIdentityVerification handleAppToAppIdentityVerification = (com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.HandleAppToAppIdentityVerification) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.scheme, handleAppToAppIdentityVerification.scheme) && kotlin.jvm.internal.Intrinsics.areEqual(this.payload, handleAppToAppIdentityVerification.payload) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, handleAppToAppIdentityVerification.source);
        }

        public final com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.HandleAppToAppIdentityVerification copy(java.lang.String scheme, java.lang.String payload, java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.HandleAppToAppIdentityVerification(scheme, payload, source);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPayload() {
            return this.payload;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getScheme() {
            return this.scheme;
        }

        public static /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.HandleAppToAppIdentityVerification copy$default(com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.HandleAppToAppIdentityVerification handleAppToAppIdentityVerification, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = handleAppToAppIdentityVerification.scheme;
            }
            if ((i & 2) != 0) {
                str2 = handleAppToAppIdentityVerification.payload;
            }
            if ((i & 4) != 0) {
                str3 = handleAppToAppIdentityVerification.source;
            }
            return handleAppToAppIdentityVerification.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState$DigitizeCardCompleted;", "Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState;", "", "digitalCardId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState$DigitizeCardCompleted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDigitalCardId"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DigitizeCardCompleted implements com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState {
        private final java.lang.String digitalCardId;

        public DigitizeCardCompleted(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.digitalCardId = str;
        }

        public final java.lang.String getDigitalCardId() {
            return this.digitalCardId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.digitalCardId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DigitizeCardCompleted(digitalCardId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.digitalCardId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.DigitizeCardCompleted) && kotlin.jvm.internal.Intrinsics.areEqual(this.digitalCardId, ((com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.DigitizeCardCompleted) other).digitalCardId);
        }

        public final com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.DigitizeCardCompleted copy(java.lang.String digitalCardId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitalCardId, "");
            return new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.DigitizeCardCompleted(digitalCardId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDigitalCardId() {
            return this.digitalCardId;
        }

        public static /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.DigitizeCardCompleted copy$default(com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.DigitizeCardCompleted digitizeCardCompleted, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = digitizeCardCompleted.digitalCardId;
            }
            return digitizeCardCompleted.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState$Error;", "Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState;", "", "debugMessage", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebugMessage", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState {
        private final java.lang.String debugMessage;
        private final java.lang.Throwable throwable;

        public Error(java.lang.String str, java.lang.Throwable th) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.debugMessage = str;
            this.throwable = th;
        }

        public /* synthetic */ Error(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public final java.lang.String getDebugMessage() {
            return this.debugMessage;
        }

        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.debugMessage;
            java.lang.Throwable th = this.throwable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(debugMessage=");
            sb.append(str);
            sb.append(", throwable=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.debugMessage.hashCode();
            java.lang.Throwable th = this.throwable;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.Error)) {
                return false;
            }
            com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.Error error = (com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, error.debugMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, error.throwable);
        }

        public final com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.Error copy(java.lang.String debugMessage, java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
            return new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.Error(debugMessage, throwable);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDebugMessage() {
            return this.debugMessage;
        }

        public static /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.Error copy$default(com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.Error error, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.debugMessage;
            }
            if ((i & 2) != 0) {
                th = error.throwable;
            }
            return error.copy(str, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState$SDKError;", "Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState;", "Lcom/gemalto/mfs/mwsdk/mobilegateway/enrollment/MGErrorCode;", "errorCode", "", "debugMessage", "<init>", "(Lcom/gemalto/mfs/mwsdk/mobilegateway/enrollment/MGErrorCode;Ljava/lang/String;)V", "component1", "()Lcom/gemalto/mfs/mwsdk/mobilegateway/enrollment/MGErrorCode;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/gemalto/mfs/mwsdk/mobilegateway/enrollment/MGErrorCode;Ljava/lang/String;)Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState$SDKError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebugMessage", "Lcom/gemalto/mfs/mwsdk/mobilegateway/enrollment/MGErrorCode;", "getErrorCode"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SDKError implements com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState {
        private final java.lang.String debugMessage;
        private final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode errorCode;

        public SDKError(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mGErrorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorCode = mGErrorCode;
            this.debugMessage = str;
        }

        public final java.lang.String getDebugMessage() {
            return this.debugMessage;
        }

        public final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String toString() {
            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode = this.errorCode;
            java.lang.String str = this.debugMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SDKError(errorCode=");
            sb.append(mGErrorCode);
            sb.append(", debugMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.errorCode.hashCode() * 31) + this.debugMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.SDKError)) {
                return false;
            }
            com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.SDKError sDKError = (com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.SDKError) other;
            return this.errorCode == sDKError.errorCode && kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, sDKError.debugMessage);
        }

        public final com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.SDKError copy(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode errorCode, java.lang.String debugMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
            return new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.SDKError(errorCode, debugMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDebugMessage() {
            return this.debugMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.SDKError copy$default(com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.SDKError sDKError, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mGErrorCode = sDKError.errorCode;
            }
            if ((i & 2) != 0) {
                str = sDKError.debugMessage;
            }
            return sDKError.copy(mGErrorCode, str);
        }
    }
}
