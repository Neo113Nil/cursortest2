package com.paypal.oslo.feature.moneymovement.api.ui.purpose;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig;", "", "Loading", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Loading;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PurposeFieldConfig {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Loading;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Loading INSTANCE = new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Loading();

        public final int hashCode() {
            return 583084210;
        }

        private Loading() {
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001:\u0001.BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016JV\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b)\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b\t\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0018R\u001a\u0010\f\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b-\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Ready;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig;", "Lcom/paypal/pds/core/Icon;", "icon", "", "label", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_PLACEHOLDER, "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Ready$ValidationState;", "validation", "enabled", "<init>", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Ready$ValidationState;Z)V", "component1", "()Lcom/paypal/pds/core/Icon;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Z", "component6", "()Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Ready$ValidationState;", "component7", "copy", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Ready$ValidationState;Z)Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Ready;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/pds/core/Icon;", "getIcon", "Ljava/lang/String;", "getLabel", "getValue", "getPlaceholder", "Z", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Ready$ValidationState;", "getValidation", "getEnabled", "ValidationState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready implements com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig {
        public static final int $stable = 0;
        private final boolean enabled;
        private final com.paypal.pds.core.Icon icon;
        private final boolean isExpanded;
        private final java.lang.String label;
        private final java.lang.String placeholder;
        private final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState validation;
        private final java.lang.String value;

        public Ready(com.paypal.pds.core.Icon icon, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState validationState, boolean z2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationState, "");
            this.icon = icon;
            this.label = str;
            this.value = str2;
            this.placeholder = str3;
            this.isExpanded = z;
            this.validation = validationState;
            this.enabled = z2;
        }

        public final com.paypal.pds.core.Icon getIcon() {
            return this.icon;
        }

        public final java.lang.String getLabel() {
            return this.label;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String getPlaceholder() {
            return this.placeholder;
        }

        public final boolean isExpanded() {
            return this.isExpanded;
        }

        public /* synthetic */ Ready(com.paypal.pds.core.Icon icon, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState validationState, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(icon, str, str2, (i & 8) != 0 ? str : str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState.None.INSTANCE : validationState, (i & 64) != 0 ? true : z2);
        }

        public final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState getValidation() {
            return this.validation;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Ready$ValidationState;", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Error", "Success", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Ready$ValidationState$Error;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Ready$ValidationState$None;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Ready$ValidationState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public interface ValidationState {

            @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Ready$ValidationState$None;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Ready$ValidationState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class None implements com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState {
                public static final int $stable = 0;
                public static final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState.None INSTANCE = new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState.None();

                public final int hashCode() {
                    return 1378058307;
                }

                private None() {
                }

                public final java.lang.String toString() {
                    return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE;
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState.None)) {
                        return false;
                    }
                    return true;
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Ready$ValidationState$Error;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Ready$ValidationState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Ready$ValidationState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Error implements com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState {
                public static final int $stable = 0;
                private final java.lang.String message;

                public Error(java.lang.String str) {
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
                    return (other instanceof com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState.Error) other).message);
                }

                public final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState.Error copy(java.lang.String message) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                    return new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState.Error(message);
                }

                /* renamed from: component1, reason: from getter */
                public final java.lang.String getMessage() {
                    return this.message;
                }

                public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState.Error copy$default(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState.Error error, java.lang.String str, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        str = error.message;
                    }
                    return error.copy(str);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Ready$ValidationState$Success;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Ready$ValidationState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig$Ready$ValidationState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Success implements com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState {
                public static final int $stable = 0;
                private final java.lang.String message;

                public Success(java.lang.String str) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                    this.message = str;
                }

                public final java.lang.String getMessage() {
                    return this.message;
                }

                public final java.lang.String toString() {
                    java.lang.String str = this.message;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(message=");
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
                    return (other instanceof com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState.Success) other).message);
                }

                public final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState.Success copy(java.lang.String message) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                    return new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState.Success(message);
                }

                /* renamed from: component1, reason: from getter */
                public final java.lang.String getMessage() {
                    return this.message;
                }

                public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState.Success copy$default(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState.Success success, java.lang.String str, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        str = success.message;
                    }
                    return success.copy(str);
                }
            }
        }

        public final java.lang.String toString() {
            com.paypal.pds.core.Icon icon = this.icon;
            java.lang.String str = this.label;
            java.lang.String str2 = this.value;
            java.lang.String str3 = this.placeholder;
            boolean z = this.isExpanded;
            com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState validationState = this.validation;
            boolean z2 = this.enabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(icon=");
            sb.append(icon);
            sb.append(", label=");
            sb.append(str);
            sb.append(", value=");
            sb.append(str2);
            sb.append(", placeholder=");
            sb.append(str3);
            sb.append(", isExpanded=");
            sb.append(z);
            sb.append(", validation=");
            sb.append(validationState);
            sb.append(", enabled=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((this.icon.hashCode() * 31) + this.label.hashCode()) * 31) + this.value.hashCode()) * 31) + this.placeholder.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isExpanded)) * 31) + this.validation.hashCode()) * 31) + java.lang.Boolean.hashCode(this.enabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready)) {
                return false;
            }
            com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready ready = (com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.icon, ready.icon) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, ready.label) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ready.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.placeholder, ready.placeholder) && this.isExpanded == ready.isExpanded && kotlin.jvm.internal.Intrinsics.areEqual(this.validation, ready.validation) && this.enabled == ready.enabled;
        }

        public final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready copy(com.paypal.pds.core.Icon icon, java.lang.String label, java.lang.String value, java.lang.String placeholder, boolean isExpanded, com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState validation, boolean enabled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placeholder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validation, "");
            return new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready(icon, label, value, placeholder, isExpanded, validation, enabled);
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState getValidation() {
            return this.validation;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsExpanded() {
            return this.isExpanded;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getPlaceholder() {
            return this.placeholder;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLabel() {
            return this.label;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.pds.core.Icon getIcon() {
            return this.icon;
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready copy$default(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready ready, com.paypal.pds.core.Icon icon, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState validationState, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                icon = ready.icon;
            }
            if ((i & 2) != 0) {
                str = ready.label;
            }
            java.lang.String str4 = str;
            if ((i & 4) != 0) {
                str2 = ready.value;
            }
            java.lang.String str5 = str2;
            if ((i & 8) != 0) {
                str3 = ready.placeholder;
            }
            java.lang.String str6 = str3;
            if ((i & 16) != 0) {
                z = ready.isExpanded;
            }
            boolean z3 = z;
            if ((i & 32) != 0) {
                validationState = ready.validation;
            }
            com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig.Ready.ValidationState validationState2 = validationState;
            if ((i & 64) != 0) {
                z2 = ready.enabled;
            }
            return ready.copy(icon, str4, str5, str6, z3, validationState2, z2);
        }
    }
}
