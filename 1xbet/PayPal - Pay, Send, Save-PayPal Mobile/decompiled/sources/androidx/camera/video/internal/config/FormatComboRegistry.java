package androidx.camera.video.internal.config;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0016B1\b\u0002\u0012&\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0011R4\u0010\u0015\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/camera/video/internal/config/FormatComboRegistry;", "", "", "", "", "", "Landroidx/camera/video/internal/config/FormatCombo;", "p0", "<init>", "(Ljava/util/Map;)V", "outputFormat", "videoMime", "audioMime", "", "getCombos", "(ILjava/lang/String;Ljava/lang/String;)Ljava/util/List;", "getCombosForVideo", "(Ljava/lang/String;)Ljava/util/List;", "getCombosForAudio", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FormatComboRegistry {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.Set<androidx.camera.video.internal.config.FormatCombo>>> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    private FormatComboRegistry(java.util.Map<java.lang.Integer, ? extends java.util.Map<java.lang.String, ? extends java.util.Set<androidx.camera.video.internal.config.FormatCombo>>> map) {
        this.getHighSpeedVideoFpsRangesFor = map;
    }

    public final java.util.List<androidx.camera.video.internal.config.FormatCombo> getCombos(int outputFormat, java.lang.String videoMime, java.lang.String audioMime) {
        java.util.List listOf;
        java.util.List listOf2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoMime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioMime, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (outputFormat == -1) {
            listOf = this.getHighSpeedVideoFpsRangesFor.keySet();
        } else {
            listOf = kotlin.collections.CollectionsKt.listOf(java.lang.Integer.valueOf(outputFormat));
        }
        java.util.Iterator it = listOf.iterator();
        while (it.hasNext()) {
            java.util.Map<java.lang.String, java.util.Set<androidx.camera.video.internal.config.FormatCombo>> map = this.getHighSpeedVideoFpsRangesFor.get(java.lang.Integer.valueOf(((java.lang.Number) it.next()).intValue()));
            if (map != null) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(videoMime, androidx.camera.video.VideoSpec.MIME_TYPE_UNSPECIFIED)) {
                    listOf2 = map.keySet();
                } else {
                    listOf2 = kotlin.collections.CollectionsKt.listOf(videoMime);
                }
                java.util.Iterator it2 = listOf2.iterator();
                while (it2.hasNext()) {
                    java.util.Set<androidx.camera.video.internal.config.FormatCombo> set = map.get((java.lang.String) it2.next());
                    if (set != null) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(audioMime, androidx.camera.video.AudioSpec.MIME_TYPE_UNSPECIFIED)) {
                            arrayList.addAll(set);
                        } else {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            for (java.lang.Object obj : set) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(((androidx.camera.video.internal.config.FormatCombo) obj).getAudioMime(), audioMime)) {
                                    arrayList2.add(obj);
                                }
                            }
                            arrayList.addAll(arrayList2);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final java.util.List<androidx.camera.video.internal.config.FormatCombo> getCombosForVideo(java.lang.String videoMime) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.util.Map<java.lang.String, java.util.Set<androidx.camera.video.internal.config.FormatCombo>>> it = this.getHighSpeedVideoFpsRangesFor.values().iterator();
        while (it.hasNext()) {
            java.util.Set<androidx.camera.video.internal.config.FormatCombo> set = it.next().get(videoMime);
            if (set != null) {
                arrayList.addAll(set);
            }
        }
        return arrayList;
    }

    public final java.util.List<androidx.camera.video.internal.config.FormatCombo> getCombosForAudio(java.lang.String audioMime) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.util.Map<java.lang.String, java.util.Set<androidx.camera.video.internal.config.FormatCombo>>> it = this.getHighSpeedVideoFpsRangesFor.values().iterator();
        while (it.hasNext()) {
            for (java.util.Set<androidx.camera.video.internal.config.FormatCombo> set : it.next().values()) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : set) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((androidx.camera.video.internal.config.FormatCombo) obj).getAudioMime(), audioMime)) {
                        arrayList2.add(obj);
                    }
                }
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR4\u0010\u0016\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00100\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/camera/video/internal/config/FormatComboRegistry$Builder;", "", "<init>", "()V", "", "format", "Lkotlin/Function1;", "Landroidx/camera/video/internal/config/FormatComboRegistry$Builder$ContainerScope;", "", "Lkotlin/ExtensionFunctionType;", "block", "container", "(ILkotlin/jvm/functions/Function1;)V", "Landroidx/camera/video/internal/config/FormatComboRegistry;", "build", "()Landroidx/camera/video/internal/config/FormatComboRegistry;", "", "", "", "Landroidx/camera/video/internal/config/FormatCombo;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "getHighSpeedVideoSizes", "ContainerScope"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.Set<androidx.camera.video.internal.config.FormatCombo>>> getHighSpeedVideoSizes = new java.util.LinkedHashMap();

        public final void container(int format, kotlin.jvm.functions.Function1<? super androidx.camera.video.internal.config.FormatComboRegistry.Builder.ContainerScope, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.Set<androidx.camera.video.internal.config.FormatCombo>>> map = this.getHighSpeedVideoSizes;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(format);
            java.util.LinkedHashMap linkedHashMap = map.get(valueOf);
            if (linkedHashMap == null) {
                linkedHashMap = new java.util.LinkedHashMap();
                map.put(valueOf, linkedHashMap);
            }
            block.invoke(new androidx.camera.video.internal.config.FormatComboRegistry.Builder.ContainerScope(format, linkedHashMap));
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001a\u0010\b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R(\u0010\u0013\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/camera/video/internal/config/FormatComboRegistry$Builder$ContainerScope;", "", "", "container", "", "", "", "Landroidx/camera/video/internal/config/FormatCombo;", "videoMap", "<init>", "(ILjava/util/Map;)V", "", "videoMimes", "audioMimes", "", com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.SUPPORT_PREFIX, "(Ljava/util/List;Ljava/util/List;)V", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "Ljava/util/Map;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ContainerScope {
            private final int Camera2StreamConfigurationMap;
            private final java.util.Map<java.lang.String, java.util.Set<androidx.camera.video.internal.config.FormatCombo>> getHighSpeedVideoFpsRanges;

            public ContainerScope(int i, java.util.Map<java.lang.String, java.util.Set<androidx.camera.video.internal.config.FormatCombo>> map) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
                this.Camera2StreamConfigurationMap = i;
                this.getHighSpeedVideoFpsRanges = map;
            }

            public final void support(java.util.List<java.lang.String> videoMimes, java.util.List<java.lang.String> audioMimes) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoMimes, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioMimes, "");
                for (java.lang.String str : videoMimes) {
                    java.util.Map<java.lang.String, java.util.Set<androidx.camera.video.internal.config.FormatCombo>> map = this.getHighSpeedVideoFpsRanges;
                    java.util.LinkedHashSet linkedHashSet = map.get(str);
                    if (linkedHashSet == null) {
                        linkedHashSet = new java.util.LinkedHashSet();
                        map.put(str, linkedHashSet);
                    }
                    java.util.Set<androidx.camera.video.internal.config.FormatCombo> set = linkedHashSet;
                    java.util.Iterator<T> it = audioMimes.iterator();
                    while (it.hasNext()) {
                        set.add(new androidx.camera.video.internal.config.FormatCombo(this.Camera2StreamConfigurationMap, str, (java.lang.String) it.next()));
                    }
                    set.add(new androidx.camera.video.internal.config.FormatCombo(this.Camera2StreamConfigurationMap, str, null));
                }
                java.util.Map<java.lang.String, java.util.Set<androidx.camera.video.internal.config.FormatCombo>> map2 = this.getHighSpeedVideoFpsRanges;
                java.util.LinkedHashSet linkedHashSet2 = map2.get(null);
                if (linkedHashSet2 == null) {
                    linkedHashSet2 = new java.util.LinkedHashSet();
                    map2.put(null, linkedHashSet2);
                }
                java.util.Set<androidx.camera.video.internal.config.FormatCombo> set2 = linkedHashSet2;
                java.util.Iterator<T> it2 = audioMimes.iterator();
                while (it2.hasNext()) {
                    set2.add(new androidx.camera.video.internal.config.FormatCombo(this.Camera2StreamConfigurationMap, null, (java.lang.String) it2.next()));
                }
            }
        }

        public final androidx.camera.video.internal.config.FormatComboRegistry build() {
            return new androidx.camera.video.internal.config.FormatComboRegistry(this.getHighSpeedVideoSizes, null);
        }
    }

    public /* synthetic */ FormatComboRegistry(java.util.Map map, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }
}
