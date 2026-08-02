package com.paypal.oslo.core.i18n.initializer;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/i18n/initializer/LocaleInitializer;", "Landroidx/startup/Initializer;", "", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)V", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LocaleInitializer implements androidx.startup.Initializer<kotlin.Unit> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.i18n.initializer.LocaleInitializer.Companion INSTANCE = new com.paypal.oslo.core.i18n.initializer.LocaleInitializer.Companion(null);

    @Override // androidx.startup.Initializer
    public final /* bridge */ /* synthetic */ kotlin.Unit create(android.content.Context context) {
        create2(context);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: create, reason: avoid collision after fix types in other method */
    public final void create2(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object obj = dagger.hilt.android.EarlyEntryPoints.get(context.getApplicationContext(), com.paypal.oslo.core.i18n.di.I18nEntryPoint.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        com.paypal.oslo.core.i18n.di.I18nEntryPoint i18nEntryPoint = (com.paypal.oslo.core.i18n.di.I18nEntryPoint) obj;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(i18nEntryPoint.ioApplicationScope(), null, null, new com.paypal.oslo.core.i18n.initializer.LocaleInitializer$create$1(i18nEntryPoint, null), 3, null);
    }

    @Override // androidx.startup.Initializer
    public final java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u0006*\u00020\u00060\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\b\b\u0002\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/i18n/initializer/LocaleInitializer$Companion;", "", "<init>", "()V", "Ljava/util/Locale;", "locale", "", "getDefaultCountryCode$i18n_release", "(Ljava/util/Locale;)Ljava/lang/String;", "Landroidx/core/os/LocaleListCompat;", "localeList", "", "fetchDeviceLanguages$i18n_release", "(Landroidx/core/os/LocaleListCompat;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ java.lang.String getDefaultCountryCode$i18n_release$default(com.paypal.oslo.core.i18n.initializer.LocaleInitializer.Companion companion, java.util.Locale locale, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                locale = java.util.Locale.getDefault();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            }
            return companion.getDefaultCountryCode$i18n_release(locale);
        }

        public final java.lang.String getDefaultCountryCode$i18n_release(java.util.Locale locale) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
            java.lang.String country = locale.getCountry();
            if (country.length() == 0) {
                country = "XX";
            }
            return country;
        }

        public static /* synthetic */ java.util.List fetchDeviceLanguages$i18n_release$default(com.paypal.oslo.core.i18n.initializer.LocaleInitializer.Companion companion, androidx.core.os.LocaleListCompat localeListCompat, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                localeListCompat = androidx.core.os.LocaleListCompat.getDefault();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localeListCompat, "");
            }
            return companion.fetchDeviceLanguages$i18n_release(localeListCompat);
        }

        public final java.util.List<java.lang.String> fetchDeviceLanguages$i18n_release(androidx.core.os.LocaleListCompat localeList) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeList, "");
            int size = localeList.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i = 0; i < size; i++) {
                java.util.Locale locale = localeList.get(i);
                java.lang.String language = locale != null ? locale.getLanguage() : null;
                if (language == null) {
                    language = "";
                }
                arrayList.add(language);
            }
            return arrayList;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
