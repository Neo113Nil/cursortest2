package com.zettle.sdk.feature.taptopay.core;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\t2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\b2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001d"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TranslationsImpl;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "Landroid/content/Context;", "p0", "Lcom/zettle/sdk/commons/state/State;", "Lcom/zettle/sdk/core/user/userconfig/UserConfig;", "p1", "", "", "", "p2", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "p3", "<init>", "(Landroid/content/Context;Lcom/zettle/sdk/commons/state/State;Ljava/util/Map;Lcom/zettle/sdk/commons/thread/EventsLoop;)V", "Lcom/zettle/sdk/feature/taptopay/core/Translations$LocaleSource;", "", "", "translate", "(Lcom/zettle/sdk/feature/taptopay/core/Translations$LocaleSource;I[Ljava/lang/Object;)Ljava/lang/String;", "(Lcom/zettle/sdk/feature/taptopay/core/Translations$LocaleSource;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/commons/state/StateObserver;", "Lcom/zettle/sdk/commons/state/StateObserver;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class TranslationsImpl implements com.zettle.sdk.feature.taptopay.core.Translations {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRangesFor;
    private android.content.Context getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.core.user.userconfig.UserConfig> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.Integer> getHighSpeedVideoFpsRanges;

    public TranslationsImpl(android.content.Context context, com.zettle.sdk.commons.state.State<com.zettle.sdk.core.user.userconfig.UserConfig> state, java.util.Map<java.lang.String, java.lang.Integer> map, com.zettle.sdk.commons.thread.EventsLoop eventsLoop) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventsLoop, "");
        this.getHighSpeedVideoFpsRanges = map;
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        this.getHighSpeedVideoFpsRangesFor = applicationContext;
        this.getHighResolutionOutputSizeshNQ4ISI = applicationContext;
        com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.core.user.userconfig.UserConfig> stateObserver = new com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.core.user.userconfig.UserConfig>() { // from class: com.zettle.sdk.feature.taptopay.core.TranslationsImpl$special$$inlined$stateObserver$1
            @Override // com.zettle.sdk.commons.state.StateObserver
            public final void onNext(com.zettle.sdk.core.user.userconfig.UserConfig state2) {
                android.content.Context context2;
                android.content.Context context3;
                android.content.Context createConfigurationContext;
                com.zettle.sdk.core.user.userconfig.UserConfig userConfig = state2;
                com.zettle.sdk.feature.taptopay.core.TranslationsImpl translationsImpl = com.zettle.sdk.feature.taptopay.core.TranslationsImpl.this;
                if (userConfig == null) {
                    createConfigurationContext = translationsImpl.getHighSpeedVideoFpsRangesFor;
                } else {
                    context2 = com.zettle.sdk.feature.taptopay.core.TranslationsImpl.this.getHighSpeedVideoFpsRangesFor;
                    android.content.res.Configuration configuration = new android.content.res.Configuration(context2.getResources().getConfiguration());
                    configuration.setLocale(com.zettle.sdk.core.user.userconfig.UserConfigKt.terminalLocal(userConfig));
                    context3 = com.zettle.sdk.feature.taptopay.core.TranslationsImpl.this.getHighSpeedVideoFpsRangesFor;
                    createConfigurationContext = context3.createConfigurationContext(configuration);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createConfigurationContext, "");
                }
                translationsImpl.getHighResolutionOutputSizeshNQ4ISI = createConfigurationContext;
            }
        };
        this.Camera2StreamConfigurationMap = stateObserver;
        state.addObserver(stateObserver, eventsLoop);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.Translations
    public final java.lang.String translate(com.zettle.sdk.feature.taptopay.core.Translations.LocaleSource p0, int p1, java.lang.Object... p2) {
        android.content.Context context;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
        int i = com.zettle.sdk.feature.taptopay.core.TranslationsImpl.WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
        if (i == 1) {
            context = this.getHighResolutionOutputSizeshNQ4ISI;
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            context = this.getHighSpeedVideoFpsRangesFor;
        }
        java.lang.String string = context.getString(p1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        if (p0 == com.zettle.sdk.feature.taptopay.core.Translations.LocaleSource.Account) {
            string = kotlin.text.StringsKt.replace$default(string, "…", "...", false, 4, (java.lang.Object) null);
        }
        if (p2.length == 0) {
            return string;
        }
        java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) string, new java.lang.String[]{"%@"}, false, p2.length + 1, 2, (java.lang.Object) null);
        java.util.Iterator it = kotlin.sequences.SequencesKt.take(kotlin.collections.CollectionsKt.asSequence(split$default), kotlin.collections.CollectionsKt.getLastIndex(split$default)).iterator();
        java.util.Iterator it2 = kotlin.jvm.internal.ArrayIteratorKt.iterator(p2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (it.hasNext()) {
            sb.append((java.lang.String) it.next());
            if (it2.hasNext()) {
                sb.append(it2.next().toString());
            }
        }
        sb.append((java.lang.String) kotlin.collections.CollectionsKt.last(split$default));
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.Translations
    public final java.lang.String translate(com.zettle.sdk.feature.taptopay.core.Translations.LocaleSource p0, java.lang.String p1, java.lang.Object... p2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
        java.lang.Integer num = this.getHighSpeedVideoFpsRanges.get(p1);
        if (num == null) {
            com.zettle.sdk.commons.util.Log.DefaultImpls.e$default(com.zettle.sdk.commons.util.Log.INSTANCE.get("Translations"), "Unknown translation key ".concat(java.lang.String.valueOf(p1)), null, 2, null);
            return p1;
        }
        return translate(p0, num.intValue(), java.util.Arrays.copyOf(p2, p2.length));
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.zettle.sdk.feature.taptopay.core.Translations.LocaleSource.values().length];
            try {
                iArr[com.zettle.sdk.feature.taptopay.core.Translations.LocaleSource.Account.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.zettle.sdk.feature.taptopay.core.Translations.LocaleSource.Device.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
