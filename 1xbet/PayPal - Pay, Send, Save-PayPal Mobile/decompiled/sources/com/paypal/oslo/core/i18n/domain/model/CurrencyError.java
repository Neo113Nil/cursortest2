package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "FormatError", "MetadataFetchError", "CurrencyDetailsFetchError", "LocaleResolutionError", "ParsingFailure", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError$CurrencyDetailsFetchError;", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError$FormatError;", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError$LocaleResolutionError;", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError$MetadataFetchError;", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError$ParsingFailure;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class CurrencyError {
    private final java.lang.String description;

    private CurrencyError(java.lang.String str) {
        this.description = str;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError$FormatError;", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError$FormatError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class FormatError extends com.paypal.oslo.core.i18n.domain.model.CurrencyError {
        private final java.lang.String description;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FormatError(java.lang.String str) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.description = str;
        }

        @Override // com.paypal.oslo.core.i18n.domain.model.CurrencyError
        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.description;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FormatError(description=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.description.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.i18n.domain.model.CurrencyError.FormatError) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, ((com.paypal.oslo.core.i18n.domain.model.CurrencyError.FormatError) other).description);
        }

        public final com.paypal.oslo.core.i18n.domain.model.CurrencyError.FormatError copy(java.lang.String description) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
            return new com.paypal.oslo.core.i18n.domain.model.CurrencyError.FormatError(description);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.CurrencyError.FormatError copy$default(com.paypal.oslo.core.i18n.domain.model.CurrencyError.FormatError formatError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = formatError.description;
            }
            return formatError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError$MetadataFetchError;", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError$MetadataFetchError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class MetadataFetchError extends com.paypal.oslo.core.i18n.domain.model.CurrencyError {
        private final java.lang.String description;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MetadataFetchError(java.lang.String str) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.description = str;
        }

        @Override // com.paypal.oslo.core.i18n.domain.model.CurrencyError
        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.description;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MetadataFetchError(description=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.description.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.i18n.domain.model.CurrencyError.MetadataFetchError) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, ((com.paypal.oslo.core.i18n.domain.model.CurrencyError.MetadataFetchError) other).description);
        }

        public final com.paypal.oslo.core.i18n.domain.model.CurrencyError.MetadataFetchError copy(java.lang.String description) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
            return new com.paypal.oslo.core.i18n.domain.model.CurrencyError.MetadataFetchError(description);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.CurrencyError.MetadataFetchError copy$default(com.paypal.oslo.core.i18n.domain.model.CurrencyError.MetadataFetchError metadataFetchError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = metadataFetchError.description;
            }
            return metadataFetchError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError$CurrencyDetailsFetchError;", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError$CurrencyDetailsFetchError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class CurrencyDetailsFetchError extends com.paypal.oslo.core.i18n.domain.model.CurrencyError {
        private final java.lang.String description;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CurrencyDetailsFetchError(java.lang.String str) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.description = str;
        }

        @Override // com.paypal.oslo.core.i18n.domain.model.CurrencyError
        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.description;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyDetailsFetchError(description=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.description.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.i18n.domain.model.CurrencyError.CurrencyDetailsFetchError) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, ((com.paypal.oslo.core.i18n.domain.model.CurrencyError.CurrencyDetailsFetchError) other).description);
        }

        public final com.paypal.oslo.core.i18n.domain.model.CurrencyError.CurrencyDetailsFetchError copy(java.lang.String description) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
            return new com.paypal.oslo.core.i18n.domain.model.CurrencyError.CurrencyDetailsFetchError(description);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.CurrencyError.CurrencyDetailsFetchError copy$default(com.paypal.oslo.core.i18n.domain.model.CurrencyError.CurrencyDetailsFetchError currencyDetailsFetchError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = currencyDetailsFetchError.description;
            }
            return currencyDetailsFetchError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError$LocaleResolutionError;", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError$LocaleResolutionError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class LocaleResolutionError extends com.paypal.oslo.core.i18n.domain.model.CurrencyError {
        private final java.lang.String description;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocaleResolutionError(java.lang.String str) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.description = str;
        }

        @Override // com.paypal.oslo.core.i18n.domain.model.CurrencyError
        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.description;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LocaleResolutionError(description=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.description.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.i18n.domain.model.CurrencyError.LocaleResolutionError) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, ((com.paypal.oslo.core.i18n.domain.model.CurrencyError.LocaleResolutionError) other).description);
        }

        public final com.paypal.oslo.core.i18n.domain.model.CurrencyError.LocaleResolutionError copy(java.lang.String description) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
            return new com.paypal.oslo.core.i18n.domain.model.CurrencyError.LocaleResolutionError(description);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.CurrencyError.LocaleResolutionError copy$default(com.paypal.oslo.core.i18n.domain.model.CurrencyError.LocaleResolutionError localeResolutionError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = localeResolutionError.description;
            }
            return localeResolutionError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError$ParsingFailure;", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError$ParsingFailure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class ParsingFailure extends com.paypal.oslo.core.i18n.domain.model.CurrencyError {
        private final java.lang.Throwable cause;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParsingFailure(java.lang.String str, java.lang.Throwable th) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.cause = th;
        }

        public /* synthetic */ ParsingFailure(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ParsingFailure(message=");
            sb.append(str);
            sb.append(", cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            java.lang.Throwable th = this.cause;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.i18n.domain.model.CurrencyError.ParsingFailure)) {
                return false;
            }
            com.paypal.oslo.core.i18n.domain.model.CurrencyError.ParsingFailure parsingFailure = (com.paypal.oslo.core.i18n.domain.model.CurrencyError.ParsingFailure) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, parsingFailure.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, parsingFailure.cause);
        }

        public final com.paypal.oslo.core.i18n.domain.model.CurrencyError.ParsingFailure copy(java.lang.String message, java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.core.i18n.domain.model.CurrencyError.ParsingFailure(message, cause);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.CurrencyError.ParsingFailure copy$default(com.paypal.oslo.core.i18n.domain.model.CurrencyError.ParsingFailure parsingFailure, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = parsingFailure.message;
            }
            if ((i & 2) != 0) {
                th = parsingFailure.cause;
            }
            return parsingFailure.copy(str, th);
        }
    }

    public /* synthetic */ CurrencyError(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
