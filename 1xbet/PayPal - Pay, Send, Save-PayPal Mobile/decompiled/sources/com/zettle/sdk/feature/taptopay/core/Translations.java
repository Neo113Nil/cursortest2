package com.zettle.sdk.feature.taptopay.core;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eJ3\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H&¢\u0006\u0004\b\t\u0010\nJ3\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\b2\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H&¢\u0006\u0004\b\t\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/Translations;", "", "Lcom/zettle/sdk/feature/taptopay/core/Translations$LocaleSource;", "source", "", "id", "", "args", "", "translate", "(Lcom/zettle/sdk/feature/taptopay/core/Translations$LocaleSource;I[Ljava/lang/Object;)Ljava/lang/String;", "key", "(Lcom/zettle/sdk/feature/taptopay/core/Translations$LocaleSource;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Companion", "LocaleSource"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface Translations {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.Translations.Companion INSTANCE = com.zettle.sdk.feature.taptopay.core.Translations.Companion.getHighResolutionOutputSizeshNQ4ISI;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/Translations$LocaleSource;", "", "<init>", "(Ljava/lang/String;I)V", "Account", "Device"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum LocaleSource {
        Account,
        Device
    }

    java.lang.String translate(com.zettle.sdk.feature.taptopay.core.Translations.LocaleSource source, int id, java.lang.Object... args);

    java.lang.String translate(com.zettle.sdk.feature.taptopay.core.Translations.LocaleSource source, java.lang.String key, java.lang.Object... args);

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJC\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u0014J#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/Translations$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/zettle/sdk/commons/state/State;", "Lcom/zettle/sdk/core/user/userconfig/UserConfig;", "userConfig", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "create", "(Landroid/content/Context;Lcom/zettle/sdk/commons/state/State;)Lcom/zettle/sdk/feature/taptopay/core/Translations;", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "loop", "create$core_publicRelease", "(Landroid/content/Context;Lcom/zettle/sdk/commons/state/State;Lcom/zettle/sdk/commons/thread/EventsLoop;)Lcom/zettle/sdk/feature/taptopay/core/Translations;", "", "", "", "dynamicStrings", "(Landroid/content/Context;Lcom/zettle/sdk/commons/state/State;Ljava/util/Map;Lcom/zettle/sdk/commons/thread/EventsLoop;)Lcom/zettle/sdk/feature/taptopay/core/Translations;", "Landroid/content/res/XmlResourceParser;", "parser", "load$core_publicRelease", "(Landroid/content/res/XmlResourceParser;)Ljava/util/Map;", "getHighSpeedVideoSizes", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.feature.taptopay.core.Translations.Companion getHighResolutionOutputSizeshNQ4ISI = new com.zettle.sdk.feature.taptopay.core.Translations.Companion();

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private static volatile java.util.Map<java.lang.String, java.lang.Integer> getHighSpeedVideoFpsRangesFor;

        private Companion() {
        }

        public final com.zettle.sdk.feature.taptopay.core.Translations create(android.content.Context context, com.zettle.sdk.commons.state.State<com.zettle.sdk.core.user.userconfig.UserConfig> userConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userConfig, "");
            return create$core_publicRelease(context, userConfig, com.zettle.sdk.commons.thread.EventsLoop.INSTANCE.getMain());
        }

        public final com.zettle.sdk.feature.taptopay.core.Translations create$core_publicRelease(android.content.Context context, com.zettle.sdk.commons.state.State<com.zettle.sdk.core.user.userconfig.UserConfig> userConfig, com.zettle.sdk.commons.thread.EventsLoop loop) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loop, "");
            java.util.Map<java.lang.String, java.lang.Integer> map = getHighSpeedVideoFpsRangesFor;
            if (map == null) {
                android.content.res.XmlResourceParser xml = context.getResources().getXml(com.zettle.sdk.feature.taptopay.core.R.xml.dynamic_translations);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(xml, "");
                android.content.res.XmlResourceParser xmlResourceParser = xml;
                try {
                    java.util.Map<java.lang.String, java.lang.Integer> load$core_publicRelease = getHighResolutionOutputSizeshNQ4ISI.load$core_publicRelease(xmlResourceParser);
                    kotlin.jdk7.AutoCloseableKt.closeFinally(xmlResourceParser, null);
                    getHighSpeedVideoFpsRangesFor = load$core_publicRelease;
                    map = load$core_publicRelease;
                } finally {
                }
            }
            return create$core_publicRelease(context, userConfig, map, loop);
        }

        public final com.zettle.sdk.feature.taptopay.core.Translations create$core_publicRelease(android.content.Context context, com.zettle.sdk.commons.state.State<com.zettle.sdk.core.user.userconfig.UserConfig> userConfig, java.util.Map<java.lang.String, java.lang.Integer> dynamicStrings, com.zettle.sdk.commons.thread.EventsLoop loop) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicStrings, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loop, "");
            return new com.zettle.sdk.feature.taptopay.core.TranslationsImpl(context, userConfig, dynamicStrings, loop);
        }

        public final java.util.Map<java.lang.String, java.lang.Integer> load$core_publicRelease(final android.content.res.XmlResourceParser parser) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parser, "");
            try {
                return kotlin.collections.MapsKt.toMap(kotlin.sequences.SequencesKt.mapNotNull(kotlin.sequences.SequencesKt.filter(kotlin.sequences.SequencesKt.generateSequence(new kotlin.jvm.functions.Function0<android.content.res.XmlResourceParser>() { // from class: com.zettle.sdk.feature.taptopay.core.Translations$Companion$load$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                    public final android.content.res.XmlResourceParser invoke() {
                        if (parser.next() == 1) {
                            return null;
                        }
                        return parser;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }), new kotlin.jvm.functions.Function1<android.content.res.XmlResourceParser, java.lang.Boolean>() { // from class: com.zettle.sdk.feature.taptopay.core.Translations$Companion$load$2
                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Boolean invoke(android.content.res.XmlResourceParser xmlResourceParser) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(xmlResourceParser, "");
                        return java.lang.Boolean.valueOf(xmlResourceParser.getEventType() == 2 && kotlin.jvm.internal.Intrinsics.areEqual(xmlResourceParser.getName(), "item"));
                    }
                }), new kotlin.jvm.functions.Function1<android.content.res.XmlResourceParser, kotlin.Pair<? extends java.lang.String, ? extends java.lang.Integer>>() { // from class: com.zettle.sdk.feature.taptopay.core.Translations$Companion$load$3
                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                    public final kotlin.Pair<java.lang.String, java.lang.Integer> invoke(android.content.res.XmlResourceParser xmlResourceParser) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(xmlResourceParser, "");
                        java.lang.String attributeValue = xmlResourceParser.getAttributeValue(null, "key");
                        java.lang.String attributeValue2 = xmlResourceParser.getAttributeValue(null, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                        if (attributeValue == null || attributeValue2 == null || !kotlin.text.StringsKt.startsWith$default(attributeValue2, "@", false, 2, (java.lang.Object) null)) {
                            return null;
                        }
                        try {
                            return new kotlin.Pair<>(attributeValue, java.lang.Integer.valueOf(java.lang.Integer.parseInt(kotlin.text.StringsKt.drop(attributeValue2, 1))));
                        } catch (java.lang.NumberFormatException unused) {
                            return null;
                        }
                    }
                }));
            } catch (java.io.IOException e) {
                com.zettle.sdk.commons.util.Log.INSTANCE.get("Translations").e("Error reading dynamic translations", e);
                return kotlin.collections.MapsKt.emptyMap();
            }
        }
    }
}
