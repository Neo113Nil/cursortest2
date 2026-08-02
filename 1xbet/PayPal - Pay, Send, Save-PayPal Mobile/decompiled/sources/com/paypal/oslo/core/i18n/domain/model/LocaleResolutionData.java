package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/LocaleResolutionData;", "", "<init>", "()V", "Cached", "Resolved", "Lcom/paypal/oslo/core/i18n/domain/model/LocaleResolutionData$Cached;", "Lcom/paypal/oslo/core/i18n/domain/model/LocaleResolutionData$Resolved;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class LocaleResolutionData {
    private LocaleResolutionData() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/LocaleResolutionData$Cached;", "Lcom/paypal/oslo/core/i18n/domain/model/LocaleResolutionData;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Cached extends com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData {
        public static final com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData.Cached INSTANCE = new com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData.Cached();

        private Cached() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/LocaleResolutionData$Resolved;", "Lcom/paypal/oslo/core/i18n/domain/model/LocaleResolutionData;", "", "", "preferredLanguageList", "Lcom/paypal/oslo/core/i18n/domain/model/SupportedLanguage;", "resolvedLanguage", "Lcom/paypal/oslo/core/i18n/domain/model/Country;", "resolvedCountry", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/core/i18n/domain/model/SupportedLanguage;Lcom/paypal/oslo/core/i18n/domain/model/Country;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/core/i18n/domain/model/SupportedLanguage;", "component3", "()Lcom/paypal/oslo/core/i18n/domain/model/Country;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/core/i18n/domain/model/SupportedLanguage;Lcom/paypal/oslo/core/i18n/domain/model/Country;)Lcom/paypal/oslo/core/i18n/domain/model/LocaleResolutionData$Resolved;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPreferredLanguageList", "Lcom/paypal/oslo/core/i18n/domain/model/SupportedLanguage;", "getResolvedLanguage", "Lcom/paypal/oslo/core/i18n/domain/model/Country;", "getResolvedCountry"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Resolved extends com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData {
        private final java.util.List<java.lang.String> preferredLanguageList;
        private final com.paypal.oslo.core.i18n.domain.model.Country resolvedCountry;
        private final com.paypal.oslo.core.i18n.domain.model.SupportedLanguage resolvedLanguage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Resolved(java.util.List<java.lang.String> list, com.paypal.oslo.core.i18n.domain.model.SupportedLanguage supportedLanguage, com.paypal.oslo.core.i18n.domain.model.Country country) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedLanguage, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
            this.preferredLanguageList = list;
            this.resolvedLanguage = supportedLanguage;
            this.resolvedCountry = country;
        }

        public final java.util.List<java.lang.String> getPreferredLanguageList() {
            return this.preferredLanguageList;
        }

        public final com.paypal.oslo.core.i18n.domain.model.SupportedLanguage getResolvedLanguage() {
            return this.resolvedLanguage;
        }

        public final com.paypal.oslo.core.i18n.domain.model.Country getResolvedCountry() {
            return this.resolvedCountry;
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.preferredLanguageList;
            com.paypal.oslo.core.i18n.domain.model.SupportedLanguage supportedLanguage = this.resolvedLanguage;
            com.paypal.oslo.core.i18n.domain.model.Country country = this.resolvedCountry;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Resolved(preferredLanguageList=");
            sb.append(list);
            sb.append(", resolvedLanguage=");
            sb.append(supportedLanguage);
            sb.append(", resolvedCountry=");
            sb.append(country);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.preferredLanguageList.hashCode() * 31) + this.resolvedLanguage.hashCode()) * 31) + this.resolvedCountry.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData.Resolved)) {
                return false;
            }
            com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData.Resolved resolved = (com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData.Resolved) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.preferredLanguageList, resolved.preferredLanguageList) && kotlin.jvm.internal.Intrinsics.areEqual(this.resolvedLanguage, resolved.resolvedLanguage) && kotlin.jvm.internal.Intrinsics.areEqual(this.resolvedCountry, resolved.resolvedCountry);
        }

        public final com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData.Resolved copy(java.util.List<java.lang.String> preferredLanguageList, com.paypal.oslo.core.i18n.domain.model.SupportedLanguage resolvedLanguage, com.paypal.oslo.core.i18n.domain.model.Country resolvedCountry) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferredLanguageList, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolvedLanguage, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolvedCountry, "");
            return new com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData.Resolved(preferredLanguageList, resolvedLanguage, resolvedCountry);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.Country getResolvedCountry() {
            return this.resolvedCountry;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.SupportedLanguage getResolvedLanguage() {
            return this.resolvedLanguage;
        }

        public final java.util.List<java.lang.String> component1() {
            return this.preferredLanguageList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData.Resolved copy$default(com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData.Resolved resolved, java.util.List list, com.paypal.oslo.core.i18n.domain.model.SupportedLanguage supportedLanguage, com.paypal.oslo.core.i18n.domain.model.Country country, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = resolved.preferredLanguageList;
            }
            if ((i & 2) != 0) {
                supportedLanguage = resolved.resolvedLanguage;
            }
            if ((i & 4) != 0) {
                country = resolved.resolvedCountry;
            }
            return resolved.copy(list, supportedLanguage, country);
        }
    }

    public /* synthetic */ LocaleResolutionData(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
