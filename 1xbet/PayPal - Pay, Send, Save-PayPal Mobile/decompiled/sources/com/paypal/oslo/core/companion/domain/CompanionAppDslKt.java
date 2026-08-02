package com.paypal.oslo.core.companion.domain;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aF\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00002\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a,\u0010\u0010\u001a\u00028\u0000\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"", "id", "name", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lkotlin/Function1;", "Lcom/paypal/oslo/core/companion/domain/ConfigSectionBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lcom/paypal/oslo/core/companion/domain/ConfigSection;", "section", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/core/companion/domain/ConfigSection;", "T", "Lcom/paypal/oslo/core/companion/domain/CompanionAppConfiguration;", "path", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "get", "(Lcom/paypal/oslo/core/companion/domain/CompanionAppConfiguration;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CompanionAppDslKt {
    public static /* synthetic */ com.paypal.oslo.core.companion.domain.ConfigSection section$default(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return section(str, str2, str3, function1);
    }

    public static final com.paypal.oslo.core.companion.domain.ConfigSection section(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.companion.domain.ConfigSectionBuilder, kotlin.Unit> function1) {
        java.lang.String str4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.paypal.oslo.core.companion.domain.ConfigSectionBuilder configSectionBuilder = new com.paypal.oslo.core.companion.domain.ConfigSectionBuilder();
        function1.invoke(configSectionBuilder);
        if (str2 == null) {
            if (str.length() > 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.String valueOf = java.lang.String.valueOf(str.charAt(0));
                kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf, "");
                java.lang.String upperCase = valueOf.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                sb.append((java.lang.Object) upperCase);
                java.lang.String substring = str.substring(1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                sb.append(substring);
                str4 = sb.toString();
            } else {
                str4 = str;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str4);
            sb2.append(" Configuration");
            str2 = sb2.toString();
        }
        if (str3 == null) {
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Configure ");
            sb3.append(lowerCase);
            sb3.append(" settings");
            str3 = sb3.toString();
        }
        return configSectionBuilder.buildSection$companion_release(str, str2, str3);
    }

    public static final /* synthetic */ <T> T get(com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration, java.lang.String str, T t) {
        T t2;
        T t3;
        java.util.List<com.paypal.oslo.core.companion.domain.ConfigField<?>> fields;
        T t4;
        java.util.List<com.paypal.oslo.core.companion.domain.ConfigSection> subsections;
        T t5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companionAppConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"."}, false, 0, 6, (java.lang.Object) null);
        if (split$default.size() >= 2) {
            java.util.Iterator<T> it = companionAppConfiguration.getSections().iterator();
            while (true) {
                t2 = null;
                if (!it.hasNext()) {
                    t3 = null;
                    break;
                }
                t3 = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.companion.domain.ConfigSection) t3).getId(), split$default.get(0))) {
                    break;
                }
            }
            com.paypal.oslo.core.companion.domain.ConfigSection configSection = (com.paypal.oslo.core.companion.domain.ConfigSection) t3;
            int size = split$default.size();
            for (int i = 1; i < size - 1; i++) {
                if (configSection == null || (subsections = configSection.getSubsections()) == null) {
                    configSection = null;
                } else {
                    java.util.Iterator<T> it2 = subsections.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t5 = null;
                            break;
                        }
                        t5 = it2.next();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.companion.domain.ConfigSection) t5).getId(), split$default.get(i))) {
                            break;
                        }
                    }
                    configSection = (com.paypal.oslo.core.companion.domain.ConfigSection) t5;
                }
            }
            if (configSection != null && (fields = configSection.getFields()) != null) {
                java.util.Iterator<T> it3 = fields.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        t4 = (T) null;
                        break;
                    }
                    t4 = it3.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.companion.domain.ConfigField) t4).getId(), kotlin.collections.CollectionsKt.last(split$default))) {
                        break;
                    }
                }
                com.paypal.oslo.core.companion.domain.ConfigField configField = t4;
                if (configField != null) {
                    t2 = (T) configField.getValue();
                }
            }
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
            T t6 = t2;
            if (t2 != null) {
                return t2;
            }
        }
        return t;
    }
}
