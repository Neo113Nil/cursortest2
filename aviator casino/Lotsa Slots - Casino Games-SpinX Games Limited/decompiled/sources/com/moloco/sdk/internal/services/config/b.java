package com.moloco.sdk.internal.services.config;

/* loaded from: classes5.dex */
public final class b implements com.moloco.sdk.internal.services.config.a {
    public static final int e = 8;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7262a = "RemoteConfigService";
    public final java.util.Map<java.lang.String, java.lang.Object> b = new java.util.LinkedHashMap();
    public final java.util.Map<java.lang.String, java.lang.String> c = new java.util.LinkedHashMap();
    public final java.util.List<com.moloco.sdk.internal.services.config.handlers.a> d = kotlin.collections.CollectionsKt.listOf(new com.moloco.sdk.internal.services.config.handlers.b());

    @Override // com.moloco.sdk.internal.services.config.a
    public void a(com.moloco.sdk.Init.SDKInitResponse sdkInitResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
        b(sdkInitResponse);
        c(sdkInitResponse);
    }

    @Override // com.moloco.sdk.internal.services.config.a
    public java.lang.String b(java.lang.String featureFlagName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureFlagName, "featureFlagName");
        return this.c.get(featureFlagName);
    }

    public final void c(com.moloco.sdk.Init.SDKInitResponse sDKInitResponse) {
        java.util.List<com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag> experimentalFeatureFlagsList = sDKInitResponse.getExperimentalFeatureFlagsList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(experimentalFeatureFlagsList, "getExperimentalFeatureFlagsList(...)");
        for (com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag experimentalFeatureFlag : experimentalFeatureFlagsList) {
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.f7262a, "Adding ExperimentalFeatureFlag: " + experimentalFeatureFlag.getName(), null, false, 12, null);
            java.util.Map<java.lang.String, java.lang.String> map = this.c;
            java.lang.String name = experimentalFeatureFlag.getName();
            java.lang.String value = experimentalFeatureFlag.getValue();
            map.put(name, (value == null || value.length() == 0) ? null : experimentalFeatureFlag.getValue());
        }
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l d(com.moloco.sdk.Init.SDKInitResponse sDKInitResponse) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l lVar;
        java.util.List<com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag> experimentalFeatureFlagsList = sDKInitResponse.getExperimentalFeatureFlagsList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(experimentalFeatureFlagsList, "getExperimentalFeatureFlagsList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(experimentalFeatureFlagsList, 10));
        java.util.Iterator<T> it = experimentalFeatureFlagsList.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.moloco.sdk.Init.SDKInitResponse.ExperimentalFeatureFlag) it.next()).getName());
        }
        boolean contains = arrayList.contains("ANDROID_STREAMING_ENABLED");
        com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, this.f7262a, "Adding StreamingEnabled: " + contains, null, false, 12, null);
        if (sDKInitResponse.hasConfigs() && sDKInitResponse.getConfigs().hasCommonConfigs() && sDKInitResponse.getConfigs().getCommonConfigs().hasMediaConfig()) {
            com.moloco.sdk.ConfigsOuterClass.Configs.CommonConfigs.MediaConfig mediaConfig = sDKInitResponse.getConfigs().getCommonConfigs().getMediaConfig();
            lVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l(((int) sDKInitResponse.getConfigs().getCommonConfigs().getMediaConfig().getStreamingChunkSizeKilobytes()) > 0 ? ((int) mediaConfig.getStreamingChunkSizeKilobytes()) * 1024 : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m.a().e(), contains, sDKInitResponse.getConfigs().getCommonConfigs().getMediaConfig().getMinStreamingPlayableDurationOnTimeoutSecs() > 0.0d ? mediaConfig.getMinStreamingPlayableDurationOnTimeoutSecs() : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m.a().g(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m.a().f());
        } else {
            lVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m.a().e(), contains, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m.a().g(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m.a().f());
        }
        com.moloco.sdk.internal.MolocoLogger.debug$default(molocoLogger, this.f7262a, "Parsed and adding MediaConfig: " + lVar.e() + ", " + lVar.h() + ", " + lVar.g() + ", " + lVar.f() + ' ', false, 4, null);
        return lVar;
    }

    public final void b(com.moloco.sdk.Init.SDKInitResponse sDKInitResponse) {
        for (com.moloco.sdk.internal.services.config.handlers.a aVar : this.d) {
            this.b.put(aVar.a().getName(), aVar.a(sDKInitResponse));
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.f7262a, "Adding config: " + aVar.a().getName(), null, false, 12, null);
        }
        this.b.put(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l.class.getName(), d(sDKInitResponse));
    }

    @Override // com.moloco.sdk.internal.services.config.a
    public <T> T a(java.lang.Class<T> configType, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configType, "configType");
        com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.f7262a, "Retrieving config: " + configType, false, 4, null);
        T t2 = (T) this.b.get(configType.getName());
        return t2 == null ? t : t2;
    }

    @Override // com.moloco.sdk.internal.services.config.a
    public boolean a(java.lang.String featureFlagName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureFlagName, "featureFlagName");
        return this.c.containsKey(featureFlagName);
    }
}
