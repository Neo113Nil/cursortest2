package com.paypal.oslo.core.i18n.domain.util;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00132\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/util/NameLayoutResolver;", "", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "localeResolverCache", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;)V", "Lcom/paypal/oslo/core/i18n/domain/model/NameInput;", "nameInput", "Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration;", "nameConfiguration", "Ljava/util/Locale;", "resolveLocale", "(Lcom/paypal/oslo/core/i18n/domain/model/NameInput;Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration;)Ljava/util/Locale;", "", "script", "Lcom/paypal/oslo/core/i18n/domain/model/name/NameMetadata;", "metadata", "resolveLayout", "(Lcom/paypal/oslo/core/i18n/domain/model/NameInput;Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration;Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/name/NameMetadata;)Ljava/lang/String;", "", "getLayoutProperties", "(Lcom/paypal/oslo/core/i18n/domain/model/NameInput;Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration;Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/name/NameMetadata;)Ljava/util/List;", "resolveScript", "(Lcom/paypal/oslo/core/i18n/domain/model/NameInput;Lcom/paypal/oslo/core/i18n/domain/model/name/NameMetadata;)Ljava/lang/String;", "Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration$Person;", "p0", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration$Person;)Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NameLayoutResolver {
    private static final com.paypal.oslo.core.i18n.domain.util.NameLayoutResolver.Companion Companion = new com.paypal.oslo.core.i18n.domain.util.NameLayoutResolver.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public NameLayoutResolver(com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeResolverCache, "");
        this.getHighSpeedVideoFpsRanges = localeResolverCache;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/util/NameLayoutResolver$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.util.Locale resolveLocale(com.paypal.oslo.core.i18n.domain.model.NameInput nameInput, com.paypal.oslo.core.i18n.domain.model.NameConfiguration nameConfiguration) {
        java.util.Locale locale;
        java.util.Locale locale2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameInput, "");
        if (nameInput instanceof com.paypal.oslo.core.i18n.domain.model.NameInput.Person) {
            com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person person = nameConfiguration instanceof com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person ? (com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person) nameConfiguration : null;
            return (person == null || (locale2 = person.getLocale()) == null) ? this.getHighSpeedVideoFpsRanges.getUserLocale().getOrNull() : locale2;
        }
        if (!(nameInput instanceof com.paypal.oslo.core.i18n.domain.model.NameInput.Business)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Business business = nameConfiguration instanceof com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Business ? (com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Business) nameConfiguration : null;
        return (business == null || (locale = business.getLocale()) == null) ? this.getHighSpeedVideoFpsRanges.getUserLocale().getOrNull() : locale;
    }

    public final java.lang.String resolveLayout(com.paypal.oslo.core.i18n.domain.model.NameInput nameInput, com.paypal.oslo.core.i18n.domain.model.NameConfiguration nameConfiguration, java.lang.String script, com.paypal.oslo.core.i18n.domain.model.name.NameMetadata metadata) {
        com.paypal.oslo.core.i18n.domain.model.name.BusinessNameMetadata businessMetadata;
        java.util.Map<java.lang.String, java.lang.String> layouts;
        com.paypal.oslo.core.i18n.domain.model.name.PersonNameMetadata defaultMetadata;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> layout;
        java.util.Map<java.lang.String, java.lang.String> map;
        com.paypal.oslo.core.i18n.domain.model.name.PersonNameMetadata countryMetadata;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> layout2;
        java.util.Map<java.lang.String, java.lang.String> map2;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameInput, "");
        if (nameInput instanceof com.paypal.oslo.core.i18n.domain.model.NameInput.Person) {
            java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(nameConfiguration instanceof com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person ? (com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person) nameConfiguration : null);
            if (script != null) {
                if (metadata != null && (countryMetadata = metadata.getCountryMetadata()) != null && (layout2 = countryMetadata.getLayout()) != null && (map2 = layout2.get(highSpeedVideoSizes)) != null && (str = map2.get(script)) != null) {
                    return str;
                }
                if (metadata != null && (defaultMetadata = metadata.getDefaultMetadata()) != null && (layout = defaultMetadata.getLayout()) != null && (map = layout.get(highSpeedVideoSizes)) != null) {
                    return map.get(script);
                }
            }
            return null;
        }
        if (!(nameInput instanceof com.paypal.oslo.core.i18n.domain.model.NameInput.Business)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (script == null || metadata == null || (businessMetadata = metadata.getBusinessMetadata()) == null || (layouts = businessMetadata.getLayouts()) == null) {
            return null;
        }
        return layouts.get("Latn");
    }

    public final java.util.List<java.lang.String> getLayoutProperties(com.paypal.oslo.core.i18n.domain.model.NameInput nameInput, com.paypal.oslo.core.i18n.domain.model.NameConfiguration nameConfiguration, java.lang.String script, com.paypal.oslo.core.i18n.domain.model.name.NameMetadata metadata) {
        com.paypal.oslo.core.i18n.domain.model.name.BusinessNameMetadata businessMetadata;
        com.paypal.oslo.core.i18n.domain.model.name.PersonNameMetadata defaultMetadata;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> isLayoutProperties;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map;
        com.paypal.oslo.core.i18n.domain.model.name.PersonNameMetadata countryMetadata;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> isLayoutProperties2;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map2;
        java.util.List<java.lang.String> list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameInput, "");
        if (nameInput instanceof com.paypal.oslo.core.i18n.domain.model.NameInput.Person) {
            java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(nameConfiguration instanceof com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person ? (com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person) nameConfiguration : null);
            if (script != null) {
                if (metadata != null && (countryMetadata = metadata.getCountryMetadata()) != null && (isLayoutProperties2 = countryMetadata.isLayoutProperties()) != null && (map2 = isLayoutProperties2.get(highSpeedVideoSizes)) != null && (list = map2.get(script)) != null) {
                    return list;
                }
                if (metadata != null && (defaultMetadata = metadata.getDefaultMetadata()) != null && (isLayoutProperties = defaultMetadata.isLayoutProperties()) != null && (map = isLayoutProperties.get(highSpeedVideoSizes)) != null) {
                    return map.get(script);
                }
            }
            return null;
        }
        if (!(nameInput instanceof com.paypal.oslo.core.i18n.domain.model.NameInput.Business)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (script == null || metadata == null || (businessMetadata = metadata.getBusinessMetadata()) == null) {
            return null;
        }
        return businessMetadata.getRequiredProperties();
    }

    public final java.lang.String resolveScript(com.paypal.oslo.core.i18n.domain.model.NameInput nameInput, com.paypal.oslo.core.i18n.domain.model.name.NameMetadata metadata) {
        com.paypal.oslo.core.i18n.domain.model.name.PersonNameMetadata defaultMetadata;
        com.paypal.oslo.core.i18n.domain.model.name.PersonNameMetadata countryMetadata;
        java.lang.String primaryScript;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameInput, "");
        int i = 0;
        if (!(nameInput instanceof com.paypal.oslo.core.i18n.domain.model.NameInput.Person)) {
            if (!(nameInput instanceof com.paypal.oslo.core.i18n.domain.model.NameInput.Business)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.lang.String businessName = ((com.paypal.oslo.core.i18n.domain.model.NameInput.Business) nameInput).getBusinessName();
            while (i < businessName.length()) {
                if (businessName.charAt(i) <= 591) {
                    i++;
                }
            }
            return "Latn";
        }
        java.lang.String m11446getGivenNamedfzjkSU = ((com.paypal.oslo.core.i18n.domain.model.NameInput.Person) nameInput).getName().m11446getGivenNamedfzjkSU();
        if (m11446getGivenNamedfzjkSU != null) {
            java.lang.String str = m11446getGivenNamedfzjkSU;
            while (i < str.length()) {
                if (str.charAt(i) <= 591) {
                    i++;
                }
            }
            return "Latn";
        }
        if (metadata != null && (countryMetadata = metadata.getCountryMetadata()) != null && (primaryScript = countryMetadata.getPrimaryScript()) != null) {
            return primaryScript;
        }
        if (metadata == null || (defaultMetadata = metadata.getDefaultMetadata()) == null) {
            return null;
        }
        return defaultMetadata.getPrimaryScript();
    }

    private static java.lang.String getHighSpeedVideoSizes(com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person p0) {
        com.paypal.oslo.core.i18n.domain.model.NameStyle style = p0 != null ? p0.getStyle() : null;
        int i = style == null ? -1 : com.paypal.oslo.core.i18n.domain.util.NameLayoutResolver.WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i == 1) {
            return a.b.m;
        }
        if (i == 2) {
            return "informal";
        }
        return "businessInformal";
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.i18n.domain.model.NameStyle.values().length];
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.NameStyle.FULL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.NameStyle.INFORMAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
