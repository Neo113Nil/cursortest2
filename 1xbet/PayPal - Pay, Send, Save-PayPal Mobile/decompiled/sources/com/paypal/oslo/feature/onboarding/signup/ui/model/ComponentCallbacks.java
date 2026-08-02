package com.paypal.oslo.feature.onboarding.signup.ui.model;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks;", "", "Empty", "Email", "GooglePrefilled", "Phone", "Password", "Name", "Address", "TermsAndConditions", com.google.common.net.HttpHeaders.LINK, "Dropdown", "Button", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Address;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Button;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Dropdown;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Email;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Empty;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$GooglePrefilled;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Link;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Name;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Password;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Phone;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$TermsAndConditions;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ComponentCallbacks {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Empty;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Empty implements com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Empty INSTANCE = new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Empty();

        public final int hashCode() {
            return -695978885;
        }

        private Empty() {
        }

        public final java.lang.String toString() {
            return "Empty";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Empty)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Email;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks;", "Lkotlin/Function1;", "", "", "onValueChange", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "component1", "()Lkotlin/jvm/functions/Function1;", "copy", "(Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Email;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "getOnValueChange"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Email implements com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks {
        public static final int $stable = 0;
        private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onValueChange;

        /* JADX WARN: Multi-variable type inference failed */
        public Email(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            this.onValueChange = function1;
        }

        public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnValueChange() {
            return this.onValueChange;
        }

        public final java.lang.String toString() {
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.onValueChange;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Email(onValueChange=");
            sb.append(function1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.onValueChange.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Email) && kotlin.jvm.internal.Intrinsics.areEqual(this.onValueChange, ((com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Email) other).onValueChange);
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Email copy(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueChange) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onValueChange, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Email(onValueChange);
        }

        public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> component1() {
            return this.onValueChange;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Email copy$default(com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Email email, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function1 = email.onValueChange;
            }
            return email.copy(function1);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$GooglePrefilled;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks;", "Lkotlin/Function0;", "", "onEndIconClick", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "component1", "()Lkotlin/jvm/functions/Function0;", "copy", "(Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$GooglePrefilled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function0;", "getOnEndIconClick"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GooglePrefilled implements com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks {
        public static final int $stable = 0;
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onEndIconClick;

        public GooglePrefilled(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
            this.onEndIconClick = function0;
        }

        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnEndIconClick() {
            return this.onEndIconClick;
        }

        public final java.lang.String toString() {
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onEndIconClick;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GooglePrefilled(onEndIconClick=");
            sb.append(function0);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.onEndIconClick.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.GooglePrefilled) && kotlin.jvm.internal.Intrinsics.areEqual(this.onEndIconClick, ((com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.GooglePrefilled) other).onEndIconClick);
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.GooglePrefilled copy(kotlin.jvm.functions.Function0<kotlin.Unit> onEndIconClick) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEndIconClick, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.GooglePrefilled(onEndIconClick);
        }

        public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
            return this.onEndIconClick;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.GooglePrefilled copy$default(com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.GooglePrefilled googlePrefilled, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function0 = googlePrefilled.onEndIconClick;
            }
            return googlePrefilled.copy(function0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Phone;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks;", "Lkotlin/Function1;", "", "", "onValueChange", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "component1", "()Lkotlin/jvm/functions/Function1;", "copy", "(Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Phone;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "getOnValueChange"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Phone implements com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks {
        public static final int $stable = 0;
        private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onValueChange;

        /* JADX WARN: Multi-variable type inference failed */
        public Phone(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            this.onValueChange = function1;
        }

        public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnValueChange() {
            return this.onValueChange;
        }

        public final java.lang.String toString() {
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.onValueChange;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Phone(onValueChange=");
            sb.append(function1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.onValueChange.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Phone) && kotlin.jvm.internal.Intrinsics.areEqual(this.onValueChange, ((com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Phone) other).onValueChange);
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Phone copy(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueChange) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onValueChange, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Phone(onValueChange);
        }

        public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> component1() {
            return this.onValueChange;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Phone copy$default(com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Phone phone, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function1 = phone.onValueChange;
            }
            return phone.copy(function1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Password;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks;", "Lkotlin/Function1;", "", "", "onValueChange", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "component1", "()Lkotlin/jvm/functions/Function1;", "copy", "(Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Password;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "getOnValueChange"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Password implements com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks {
        public static final int $stable = 0;
        private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onValueChange;

        /* JADX WARN: Multi-variable type inference failed */
        public Password(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            this.onValueChange = function1;
        }

        public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnValueChange() {
            return this.onValueChange;
        }

        public final java.lang.String toString() {
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.onValueChange;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Password(onValueChange=");
            sb.append(function1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.onValueChange.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Password) && kotlin.jvm.internal.Intrinsics.areEqual(this.onValueChange, ((com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Password) other).onValueChange);
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Password copy(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueChange) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onValueChange, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Password(onValueChange);
        }

        public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> component1() {
            return this.onValueChange;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Password copy$default(com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Password password, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function1 = password.onValueChange;
            }
            return password.copy(function1);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ,\u0010\u000b\u001a\u00020\u00002\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R)\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Name;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks;", "Lkotlin/Function2;", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/FieldType;", "", "", "onFieldChange", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "component1", "()Lkotlin/jvm/functions/Function2;", "copy", "(Lkotlin/jvm/functions/Function2;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Name;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function2;", "getOnFieldChange"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Name implements com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks {
        public static final int $stable = 0;
        private final kotlin.jvm.functions.Function2<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType, java.lang.String, kotlin.Unit> onFieldChange;

        /* JADX WARN: Multi-variable type inference failed */
        public Name(kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType, ? super java.lang.String, kotlin.Unit> function2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
            this.onFieldChange = function2;
        }

        public final kotlin.jvm.functions.Function2<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType, java.lang.String, kotlin.Unit> getOnFieldChange() {
            return this.onFieldChange;
        }

        public final java.lang.String toString() {
            kotlin.jvm.functions.Function2<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType, java.lang.String, kotlin.Unit> function2 = this.onFieldChange;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Name(onFieldChange=");
            sb.append(function2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.onFieldChange.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Name) && kotlin.jvm.internal.Intrinsics.areEqual(this.onFieldChange, ((com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Name) other).onFieldChange);
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Name copy(kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType, ? super java.lang.String, kotlin.Unit> onFieldChange) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onFieldChange, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Name(onFieldChange);
        }

        public final kotlin.jvm.functions.Function2<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType, java.lang.String, kotlin.Unit> component1() {
            return this.onFieldChange;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Name copy$default(com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Name name2, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function2 = name2.onFieldChange;
            }
            return name2.copy(function2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JH\u0010\u0013\u001a\u00020\u00002\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR)\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Address;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks;", "Lkotlin/Function2;", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/FieldType;", "", "", "onFieldChange", "Lkotlin/Function0;", "onCompressedAddressClick", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Dropdown;", "dropdownCallbacks", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Dropdown;)V", "component1", "()Lkotlin/jvm/functions/Function2;", "component2", "()Lkotlin/jvm/functions/Function0;", "component3", "()Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Dropdown;", "copy", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Dropdown;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Address;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function2;", "getOnFieldChange", "Lkotlin/jvm/functions/Function0;", "getOnCompressedAddressClick", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Dropdown;", "getDropdownCallbacks"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Address implements com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Dropdown dropdownCallbacks;
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onCompressedAddressClick;
        private final kotlin.jvm.functions.Function2<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType, java.lang.String, kotlin.Unit> onFieldChange;

        /* JADX WARN: Multi-variable type inference failed */
        public Address(kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType, ? super java.lang.String, kotlin.Unit> function2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Dropdown dropdown) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
            this.onFieldChange = function2;
            this.onCompressedAddressClick = function0;
            this.dropdownCallbacks = dropdown;
        }

        public /* synthetic */ Address(kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Dropdown dropdown, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(function2, function0, (i & 4) != 0 ? null : dropdown);
        }

        public final kotlin.jvm.functions.Function2<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType, java.lang.String, kotlin.Unit> getOnFieldChange() {
            return this.onFieldChange;
        }

        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnCompressedAddressClick() {
            return this.onCompressedAddressClick;
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Dropdown getDropdownCallbacks() {
            return this.dropdownCallbacks;
        }

        public final java.lang.String toString() {
            kotlin.jvm.functions.Function2<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType, java.lang.String, kotlin.Unit> function2 = this.onFieldChange;
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onCompressedAddressClick;
            com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Dropdown dropdown = this.dropdownCallbacks;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Address(onFieldChange=");
            sb.append(function2);
            sb.append(", onCompressedAddressClick=");
            sb.append(function0);
            sb.append(", dropdownCallbacks=");
            sb.append(dropdown);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.onFieldChange.hashCode();
            int hashCode2 = this.onCompressedAddressClick.hashCode();
            com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Dropdown dropdown = this.dropdownCallbacks;
            return (((hashCode * 31) + hashCode2) * 31) + (dropdown == null ? 0 : dropdown.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Address)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Address address = (com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Address) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.onFieldChange, address.onFieldChange) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCompressedAddressClick, address.onCompressedAddressClick) && kotlin.jvm.internal.Intrinsics.areEqual(this.dropdownCallbacks, address.dropdownCallbacks);
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Address copy(kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType, ? super java.lang.String, kotlin.Unit> onFieldChange, kotlin.jvm.functions.Function0<kotlin.Unit> onCompressedAddressClick, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Dropdown dropdownCallbacks) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onFieldChange, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCompressedAddressClick, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Address(onFieldChange, onCompressedAddressClick, dropdownCallbacks);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Dropdown getDropdownCallbacks() {
            return this.dropdownCallbacks;
        }

        public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
            return this.onCompressedAddressClick;
        }

        public final kotlin.jvm.functions.Function2<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType, java.lang.String, kotlin.Unit> component1() {
            return this.onFieldChange;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Address copy$default(com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Address address, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Dropdown dropdown, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function2 = address.onFieldChange;
            }
            if ((i & 2) != 0) {
                function0 = address.onCompressedAddressClick;
            }
            if ((i & 4) != 0) {
                dropdown = address.dropdownCallbacks;
            }
            return address.copy(function2, function0, dropdown);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\"\u0010\u0006\u001a\u001e\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u001e\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000b\u001a\u00020\u00002$\b\u0002\u0010\u0006\u001a\u001e\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R3\u0010\u0006\u001a\u001e\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$TermsAndConditions;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks;", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "", "onLinkClick", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "component1", "()Lkotlin/jvm/functions/Function2;", "copy", "(Lkotlin/jvm/functions/Function2;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$TermsAndConditions;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function2;", "getOnLinkClick"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TermsAndConditions implements com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks {
        public static final int $stable = 0;
        private final kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> onLinkClick;

        /* JADX WARN: Multi-variable type inference failed */
        public TermsAndConditions(kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
            this.onLinkClick = function2;
        }

        public final kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> getOnLinkClick() {
            return this.onLinkClick;
        }

        public final java.lang.String toString() {
            kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> function2 = this.onLinkClick;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TermsAndConditions(onLinkClick=");
            sb.append(function2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.onLinkClick.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.TermsAndConditions) && kotlin.jvm.internal.Intrinsics.areEqual(this.onLinkClick, ((com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.TermsAndConditions) other).onLinkClick);
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.TermsAndConditions copy(kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> onLinkClick) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onLinkClick, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.TermsAndConditions(onLinkClick);
        }

        public final kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> component1() {
            return this.onLinkClick;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.TermsAndConditions copy$default(com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.TermsAndConditions termsAndConditions, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function2 = termsAndConditions.onLinkClick;
            }
            return termsAndConditions.copy(function2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Link;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks;", "Lkotlin/Function0;", "", "onLinkClick", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "component1", "()Lkotlin/jvm/functions/Function0;", "copy", "(Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Link;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function0;", "getOnLinkClick"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Link implements com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks {
        public static final int $stable = 0;
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onLinkClick;

        public Link(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
            this.onLinkClick = function0;
        }

        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnLinkClick() {
            return this.onLinkClick;
        }

        public final java.lang.String toString() {
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onLinkClick;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Link(onLinkClick=");
            sb.append(function0);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.onLinkClick.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Link) && kotlin.jvm.internal.Intrinsics.areEqual(this.onLinkClick, ((com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Link) other).onLinkClick);
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Link copy(kotlin.jvm.functions.Function0<kotlin.Unit> onLinkClick) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onLinkClick, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Link(onLinkClick);
        }

        public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
            return this.onLinkClick;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Link copy$default(com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Link link, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function0 = link.onLinkClick;
            }
            return link.copy(function0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0016\u0010\u0002\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u0010\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u0019\u0010\u0011\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003JU\u0010\u0013\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u00032\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\tHÖ\u0081\u0004R!\u0010\u0002\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR!\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Dropdown;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks;", "onItemSelect", "Lkotlin/Function1;", "Lcom/paypal/pds/components/MenuItem;", "Lcom/paypal/pds/components/DropdownItem;", "", "onItemDeselect", "onSearchQueryChanged", "", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getOnItemSelect", "()Lkotlin/jvm/functions/Function1;", "getOnItemDeselect", "getOnSearchQueryChanged", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "onboarding_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Dropdown implements com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks {
        public static final int $stable = 0;
        private final kotlin.jvm.functions.Function1<com.paypal.pds.components.MenuItem, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
        private final kotlin.jvm.functions.Function1<com.paypal.pds.components.MenuItem, kotlin.Unit> getHighSpeedVideoFpsRanges;
        private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighSpeedVideoSizes;

        /* JADX WARN: Multi-variable type inference failed */
        public Dropdown(kotlin.jvm.functions.Function1<? super com.paypal.pds.components.MenuItem, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super com.paypal.pds.components.MenuItem, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
            this.getHighSpeedVideoFpsRanges = function1;
            this.getHighResolutionOutputSizeshNQ4ISI = function12;
            this.getHighSpeedVideoSizes = function13;
        }

        public final kotlin.jvm.functions.Function1<com.paypal.pds.components.MenuItem, kotlin.Unit> getOnItemSelect() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final kotlin.jvm.functions.Function1<com.paypal.pds.components.MenuItem, kotlin.Unit> getOnItemDeselect() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnSearchQueryChanged() {
            return this.getHighSpeedVideoSizes;
        }

        public final java.lang.String toString() {
            kotlin.jvm.functions.Function1<com.paypal.pds.components.MenuItem, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function1<com.paypal.pds.components.MenuItem, kotlin.Unit> function12 = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function13 = this.getHighSpeedVideoSizes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Dropdown(onItemSelect=");
            sb.append(function1);
            sb.append(", onItemDeselect=");
            sb.append(function12);
            sb.append(", onSearchQueryChanged=");
            sb.append(function13);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.getHighSpeedVideoFpsRanges.hashCode();
            int hashCode2 = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
            return (((hashCode * 31) + hashCode2) * 31) + (function1 == null ? 0 : function1.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Dropdown)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Dropdown dropdown = (com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Dropdown) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, dropdown.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, dropdown.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, dropdown.getHighSpeedVideoSizes);
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Dropdown copy(kotlin.jvm.functions.Function1<? super com.paypal.pds.components.MenuItem, kotlin.Unit> onItemSelect, kotlin.jvm.functions.Function1<? super com.paypal.pds.components.MenuItem, kotlin.Unit> onItemDeselect, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSearchQueryChanged) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onItemSelect, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onItemDeselect, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Dropdown(onItemSelect, onItemDeselect, onSearchQueryChanged);
        }

        public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> component3() {
            return this.getHighSpeedVideoSizes;
        }

        public final kotlin.jvm.functions.Function1<com.paypal.pds.components.MenuItem, kotlin.Unit> component2() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final kotlin.jvm.functions.Function1<com.paypal.pds.components.MenuItem, kotlin.Unit> component1() {
            return this.getHighSpeedVideoFpsRanges;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Dropdown copy$default(com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Dropdown dropdown, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function1 = dropdown.getHighSpeedVideoFpsRanges;
            }
            if ((i & 2) != 0) {
                function12 = dropdown.getHighResolutionOutputSizeshNQ4ISI;
            }
            if ((i & 4) != 0) {
                function13 = dropdown.getHighSpeedVideoSizes;
            }
            return dropdown.copy(function1, function12, function13);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Button;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks;", "Lkotlin/Function0;", "", "onClick", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "component1", "()Lkotlin/jvm/functions/Function0;", "copy", "(Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Button;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function0;", "getOnClick"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Button implements com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks {
        public static final int $stable = 0;
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onClick;

        public Button(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
            this.onClick = function0;
        }

        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClick() {
            return this.onClick;
        }

        public final java.lang.String toString() {
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onClick;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Button(onClick=");
            sb.append(function0);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.onClick.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Button) && kotlin.jvm.internal.Intrinsics.areEqual(this.onClick, ((com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Button) other).onClick);
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Button copy(kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Button(onClick);
        }

        public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
            return this.onClick;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Button copy$default(com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Button button, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function0 = button.onClick;
            }
            return button.copy(function0);
        }
    }
}
