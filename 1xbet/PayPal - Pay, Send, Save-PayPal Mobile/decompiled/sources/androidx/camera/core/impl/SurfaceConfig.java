package androidx.camera.core.impl;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0004,-./B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0018R\u001a\u0010)\u001a\u00020\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001f"}, d2 = {"Landroidx/camera/core/impl/SurfaceConfig;", "", "Landroidx/camera/core/impl/SurfaceConfig$ConfigType;", "configType", "Landroidx/camera/core/impl/SurfaceConfig$ConfigSize;", "configSize", "Landroidx/camera/core/impl/StreamUseCase;", "streamUseCase", "<init>", "(Landroidx/camera/core/impl/SurfaceConfig$ConfigType;Landroidx/camera/core/impl/SurfaceConfig$ConfigSize;Landroidx/camera/core/impl/StreamUseCase;)V", "other", "", "isSupported", "(Landroidx/camera/core/impl/SurfaceConfig;)Z", "Landroidx/camera/core/impl/SurfaceSizeDefinition;", "definition", "Landroid/util/Size;", "getResolution", "(Landroidx/camera/core/impl/SurfaceSizeDefinition;)Landroid/util/Size;", "component1", "()Landroidx/camera/core/impl/SurfaceConfig$ConfigType;", "component2", "()Landroidx/camera/core/impl/SurfaceConfig$ConfigSize;", "component3", "()Landroidx/camera/core/impl/StreamUseCase;", "copy", "(Landroidx/camera/core/impl/SurfaceConfig$ConfigType;Landroidx/camera/core/impl/SurfaceConfig$ConfigSize;Landroidx/camera/core/impl/StreamUseCase;)Landroidx/camera/core/impl/SurfaceConfig;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/core/impl/SurfaceConfig$ConfigType;", "getConfigType", "Landroidx/camera/core/impl/SurfaceConfig$ConfigSize;", "getConfigSize", "Landroidx/camera/core/impl/StreamUseCase;", "getStreamUseCase", "imageFormat", com.visa.cbp.getEncExpo.warmup, "getImageFormat", "Companion", "ConfigType", "ConfigSource", "ConfigSize"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SurfaceConfig {
    private static final java.util.Map<androidx.camera.core.impl.SurfaceConfig.ConfigType, java.lang.Integer> Camera2StreamConfigurationMap;
    private static final java.util.Map<java.lang.Integer, androidx.camera.core.impl.SurfaceConfig.ConfigType> getHighSpeedVideoFpsRangesFor;
    private final androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize;
    private final androidx.camera.core.impl.SurfaceConfig.ConfigType configType;
    private final int imageFormat;
    private final androidx.camera.core.impl.StreamUseCase streamUseCase;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.core.impl.SurfaceConfig.Companion INSTANCE = new androidx.camera.core.impl.SurfaceConfig.Companion(null);
    public static final androidx.camera.core.impl.StreamUseCase DEFAULT_STREAM_USE_CASE = androidx.camera.core.impl.StreamUseCase.DEFAULT;
    private static final androidx.camera.core.impl.SurfaceConfig.ConfigSize[] getHighSpeedVideoSizes = {androidx.camera.core.impl.SurfaceConfig.ConfigSize.S720P_16_9, androidx.camera.core.impl.SurfaceConfig.ConfigSize.S1080P_4_3, androidx.camera.core.impl.SurfaceConfig.ConfigSize.S1080P_16_9, androidx.camera.core.impl.SurfaceConfig.ConfigSize.S1440P_16_9, androidx.camera.core.impl.SurfaceConfig.ConfigSize.UHD, androidx.camera.core.impl.SurfaceConfig.ConfigSize.X_VGA};

    public SurfaceConfig(androidx.camera.core.impl.SurfaceConfig.ConfigType configType, androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize, androidx.camera.core.impl.StreamUseCase streamUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configSize, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamUseCase, "");
        this.configType = configType;
        this.configSize = configSize;
        this.streamUseCase = streamUseCase;
        java.lang.Integer num = Camera2StreamConfigurationMap.get(configType);
        this.imageFormat = num != null ? num.intValue() : 0;
    }

    public final androidx.camera.core.impl.SurfaceConfig.ConfigType getConfigType() {
        return this.configType;
    }

    public final androidx.camera.core.impl.SurfaceConfig.ConfigSize getConfigSize() {
        return this.configSize;
    }

    public /* synthetic */ SurfaceConfig(androidx.camera.core.impl.SurfaceConfig.ConfigType configType, androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize, androidx.camera.core.impl.StreamUseCase streamUseCase, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(configType, configSize, (i & 4) != 0 ? DEFAULT_STREAM_USE_CASE : streamUseCase);
    }

    public final androidx.camera.core.impl.StreamUseCase getStreamUseCase() {
        return this.streamUseCase;
    }

    @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\b8\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!"}, d2 = {"Landroidx/camera/core/impl/SurfaceConfig$Companion;", "", "<init>", "()V", "Landroidx/camera/core/impl/SurfaceConfig$ConfigType;", "type", "Landroidx/camera/core/impl/SurfaceConfig$ConfigSize;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/camera/core/impl/StreamUseCase;", "streamUseCase", "Landroidx/camera/core/impl/SurfaceConfig;", "create", "(Landroidx/camera/core/impl/SurfaceConfig$ConfigType;Landroidx/camera/core/impl/SurfaceConfig$ConfigSize;Landroidx/camera/core/impl/StreamUseCase;)Landroidx/camera/core/impl/SurfaceConfig;", "", "imageFormat", "getConfigType", "(I)Landroidx/camera/core/impl/SurfaceConfig$ConfigType;", "Landroid/util/Size;", "Landroidx/camera/core/impl/SurfaceSizeDefinition;", "surfaceSizeDefinition", "cameraMode", "Landroidx/camera/core/impl/SurfaceConfig$ConfigSource;", "configSource", "transformSurfaceConfig", "(ILandroid/util/Size;Landroidx/camera/core/impl/SurfaceSizeDefinition;ILandroidx/camera/core/impl/SurfaceConfig$ConfigSource;Landroidx/camera/core/impl/StreamUseCase;)Landroidx/camera/core/impl/SurfaceConfig;", "DEFAULT_STREAM_USE_CASE", "Landroidx/camera/core/impl/StreamUseCase;", "", "getHighSpeedVideoSizes", "[Landroidx/camera/core/impl/SurfaceConfig$ConfigSize;", "getHighResolutionOutputSizeshNQ4ISI", "", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ androidx.camera.core.impl.SurfaceConfig create$default(androidx.camera.core.impl.SurfaceConfig.Companion companion, androidx.camera.core.impl.SurfaceConfig.ConfigType configType, androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize, androidx.camera.core.impl.StreamUseCase streamUseCase, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                streamUseCase = androidx.camera.core.impl.SurfaceConfig.DEFAULT_STREAM_USE_CASE;
            }
            return companion.create(configType, configSize, streamUseCase);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.core.impl.SurfaceConfig create(androidx.camera.core.impl.SurfaceConfig.ConfigType type, androidx.camera.core.impl.SurfaceConfig.ConfigSize size, androidx.camera.core.impl.StreamUseCase streamUseCase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamUseCase, "");
            return new androidx.camera.core.impl.SurfaceConfig(type, size, streamUseCase);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.core.impl.SurfaceConfig.ConfigType getConfigType(int imageFormat) {
            androidx.camera.core.impl.SurfaceConfig.ConfigType configType = (androidx.camera.core.impl.SurfaceConfig.ConfigType) androidx.camera.core.impl.SurfaceConfig.getHighSpeedVideoFpsRangesFor.get(java.lang.Integer.valueOf(imageFormat));
            return configType == null ? androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV : configType;
        }

        public static /* synthetic */ androidx.camera.core.impl.SurfaceConfig transformSurfaceConfig$default(androidx.camera.core.impl.SurfaceConfig.Companion companion, int i, android.util.Size size, androidx.camera.core.impl.SurfaceSizeDefinition surfaceSizeDefinition, int i2, androidx.camera.core.impl.SurfaceConfig.ConfigSource configSource, androidx.camera.core.impl.StreamUseCase streamUseCase, int i3, java.lang.Object obj) {
            if ((i3 & 8) != 0) {
                i2 = 0;
            }
            int i4 = i2;
            if ((i3 & 16) != 0) {
                configSource = androidx.camera.core.impl.SurfaceConfig.ConfigSource.CAPTURE_SESSION_TABLES;
            }
            androidx.camera.core.impl.SurfaceConfig.ConfigSource configSource2 = configSource;
            if ((i3 & 32) != 0) {
                streamUseCase = androidx.camera.core.impl.SurfaceConfig.DEFAULT_STREAM_USE_CASE;
            }
            return companion.transformSurfaceConfig(i, size, surfaceSizeDefinition, i4, configSource2, streamUseCase);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.core.impl.SurfaceConfig transformSurfaceConfig(int imageFormat, android.util.Size size, androidx.camera.core.impl.SurfaceSizeDefinition surfaceSizeDefinition, int cameraMode, androidx.camera.core.impl.SurfaceConfig.ConfigSource configSource, androidx.camera.core.impl.StreamUseCase streamUseCase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceSizeDefinition, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configSource, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamUseCase, "");
            androidx.camera.core.impl.SurfaceConfig.ConfigType configType = getConfigType(imageFormat);
            androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.NOT_SUPPORT;
            int area = androidx.camera.core.internal.utils.SizeUtil.getArea(size);
            if (cameraMode == 1) {
                if (area <= androidx.camera.core.internal.utils.SizeUtil.getArea(surfaceSizeDefinition.getS720pSize(imageFormat))) {
                    configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.S720P_16_9;
                } else if (area <= androidx.camera.core.internal.utils.SizeUtil.getArea(surfaceSizeDefinition.getS1440pSize(imageFormat))) {
                    configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.S1440P_4_3;
                }
            } else if (configSource == androidx.camera.core.impl.SurfaceConfig.ConfigSource.FEATURE_COMBINATION_TABLE) {
                android.util.Size maximumSize = surfaceSizeDefinition.getMaximumSize(imageFormat);
                androidx.camera.core.impl.SurfaceConfig.ConfigSize[] configSizeArr = androidx.camera.core.impl.SurfaceConfig.getHighSpeedVideoSizes;
                int length = configSizeArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize2 = configSizeArr[i];
                    if (kotlin.jvm.internal.Intrinsics.areEqual(size, configSize2.getRelatedFixedSize())) {
                        configSize = configSize2;
                        break;
                    }
                    i++;
                }
                if (configSize == androidx.camera.core.impl.SurfaceConfig.ConfigSize.NOT_SUPPORT && kotlin.jvm.internal.Intrinsics.areEqual(size, maximumSize)) {
                    configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM;
                }
            } else if (area <= androidx.camera.core.internal.utils.SizeUtil.getArea(surfaceSizeDefinition.getAnalysisSize())) {
                configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.VGA;
            } else if (area <= androidx.camera.core.internal.utils.SizeUtil.getArea(surfaceSizeDefinition.getPreviewSize())) {
                configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW;
            } else if (area <= androidx.camera.core.internal.utils.SizeUtil.getArea(surfaceSizeDefinition.getRecordSize())) {
                configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.RECORD;
            } else {
                android.util.Size maximumSize2 = surfaceSizeDefinition.getMaximumSize(imageFormat);
                android.util.Size ultraMaximumSize = surfaceSizeDefinition.getUltraMaximumSize(imageFormat);
                if ((maximumSize2 == null || area <= androidx.camera.core.internal.utils.SizeUtil.getArea(maximumSize2)) && cameraMode != 2) {
                    configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM;
                } else if (ultraMaximumSize != null && area <= androidx.camera.core.internal.utils.SizeUtil.getArea(ultraMaximumSize)) {
                    configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.ULTRA_MAXIMUM;
                }
            }
            return create(configType, configSize, streamUseCase);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.core.impl.SurfaceConfig transformSurfaceConfig(int i, android.util.Size size, androidx.camera.core.impl.SurfaceSizeDefinition surfaceSizeDefinition, int i2, androidx.camera.core.impl.SurfaceConfig.ConfigSource configSource) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceSizeDefinition, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configSource, "");
            return transformSurfaceConfig$default(this, i, size, surfaceSizeDefinition, i2, configSource, null, 32, null);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.core.impl.SurfaceConfig transformSurfaceConfig(int i, android.util.Size size, androidx.camera.core.impl.SurfaceSizeDefinition surfaceSizeDefinition, int i2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceSizeDefinition, "");
            return transformSurfaceConfig$default(this, i, size, surfaceSizeDefinition, i2, null, null, 48, null);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.core.impl.SurfaceConfig transformSurfaceConfig(int i, android.util.Size size, androidx.camera.core.impl.SurfaceSizeDefinition surfaceSizeDefinition) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceSizeDefinition, "");
            return transformSurfaceConfig$default(this, i, size, surfaceSizeDefinition, 0, null, null, 56, null);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.core.impl.SurfaceConfig create(androidx.camera.core.impl.SurfaceConfig.ConfigType configType, androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configSize, "");
            return create$default(this, configType, configSize, null, 4, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        java.util.Map<androidx.camera.core.impl.SurfaceConfig.ConfigType, java.lang.Integer> mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV, 35), kotlin.TuplesKt.to(androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG, 256), kotlin.TuplesKt.to(androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG_R, 4101), kotlin.TuplesKt.to(androidx.camera.core.impl.SurfaceConfig.ConfigType.RAW, 32), kotlin.TuplesKt.to(androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV, 34));
        Camera2StreamConfigurationMap = mapOf;
        java.util.Set<java.util.Map.Entry<androidx.camera.core.impl.SurfaceConfig.ConfigType, java.lang.Integer>> entrySet = mapOf.entrySet();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entrySet, 10)), 16));
        java.util.Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            linkedHashMap.put(java.lang.Integer.valueOf(((java.lang.Number) entry.getValue()).intValue()), (androidx.camera.core.impl.SurfaceConfig.ConfigType) entry.getKey());
        }
        getHighSpeedVideoFpsRangesFor = linkedHashMap;
    }

    public final boolean isSupported(androidx.camera.core.impl.SurfaceConfig other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        if (other.configSize.getId() <= this.configSize.getId() && other.configType == this.configType) {
            return this.streamUseCase == androidx.camera.core.impl.StreamUseCase.DEFAULT || other.streamUseCase == androidx.camera.core.impl.StreamUseCase.DEFAULT || other.streamUseCase == this.streamUseCase;
        }
        return false;
    }

    public final int getImageFormat() {
        return this.imageFormat;
    }

    public final android.util.Size getResolution(androidx.camera.core.impl.SurfaceSizeDefinition definition) {
        android.util.Size previewSize;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definition, "");
        switch (androidx.camera.core.impl.SurfaceConfig.WhenMappings.$EnumSwitchMapping$0[this.configSize.ordinal()]) {
            case 1:
                previewSize = definition.getPreviewSize();
                break;
            case 2:
                previewSize = definition.getRecordSize();
                break;
            case 3:
                previewSize = definition.getMaximumSize(this.imageFormat);
                break;
            case 4:
                previewSize = definition.getMaximum4x3Size(this.imageFormat);
                break;
            case 5:
                previewSize = definition.getMaximum16x9Size(this.imageFormat);
                break;
            case 6:
                previewSize = definition.getUltraMaximumSize(this.imageFormat);
                break;
            case 7:
                throw new java.lang.IllegalStateException("Not supported config size");
            default:
                previewSize = this.configSize.getRelatedFixedSize();
                break;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(previewSize);
        return previewSize;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Landroidx/camera/core/impl/SurfaceConfig$ConfigType;", "", "<init>", "(Ljava/lang/String;I)V", "PRIV", "YUV", "JPEG", "JPEG_R", "RAW"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ConfigType {
        private static final /* synthetic */ androidx.camera.core.impl.SurfaceConfig.ConfigType[] Camera2StreamConfigurationMap;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigType JPEG;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigType JPEG_R;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigType PRIV;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigType RAW;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigType YUV;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

        private ConfigType(java.lang.String str, int i) {
        }

        static {
            androidx.camera.core.impl.SurfaceConfig.ConfigType configType = new androidx.camera.core.impl.SurfaceConfig.ConfigType("PRIV", 0);
            PRIV = configType;
            androidx.camera.core.impl.SurfaceConfig.ConfigType configType2 = new androidx.camera.core.impl.SurfaceConfig.ConfigType("YUV", 1);
            YUV = configType2;
            androidx.camera.core.impl.SurfaceConfig.ConfigType configType3 = new androidx.camera.core.impl.SurfaceConfig.ConfigType("JPEG", 2);
            JPEG = configType3;
            androidx.camera.core.impl.SurfaceConfig.ConfigType configType4 = new androidx.camera.core.impl.SurfaceConfig.ConfigType("JPEG_R", 3);
            JPEG_R = configType4;
            androidx.camera.core.impl.SurfaceConfig.ConfigType configType5 = new androidx.camera.core.impl.SurfaceConfig.ConfigType("RAW", 4);
            RAW = configType5;
            androidx.camera.core.impl.SurfaceConfig.ConfigType[] configTypeArr = {configType, configType2, configType3, configType4, configType5};
            Camera2StreamConfigurationMap = configTypeArr;
            getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(configTypeArr);
        }

        public static androidx.camera.core.impl.SurfaceConfig.ConfigType[] values() {
            return (androidx.camera.core.impl.SurfaceConfig.ConfigType[]) Camera2StreamConfigurationMap.clone();
        }

        public static androidx.camera.core.impl.SurfaceConfig.ConfigType valueOf(java.lang.String str) {
            return (androidx.camera.core.impl.SurfaceConfig.ConfigType) java.lang.Enum.valueOf(androidx.camera.core.impl.SurfaceConfig.ConfigType.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.camera.core.impl.SurfaceConfig.ConfigType> getEntries() {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/camera/core/impl/SurfaceConfig$ConfigSource;", "", "<init>", "(Ljava/lang/String;I)V", "FEATURE_COMBINATION_TABLE", "CAPTURE_SESSION_TABLES"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ConfigSource {
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigSource CAPTURE_SESSION_TABLES;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigSource FEATURE_COMBINATION_TABLE;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ androidx.camera.core.impl.SurfaceConfig.ConfigSource[] getHighSpeedVideoFpsRanges;

        private ConfigSource(java.lang.String str, int i) {
        }

        static {
            androidx.camera.core.impl.SurfaceConfig.ConfigSource configSource = new androidx.camera.core.impl.SurfaceConfig.ConfigSource("FEATURE_COMBINATION_TABLE", 0);
            FEATURE_COMBINATION_TABLE = configSource;
            androidx.camera.core.impl.SurfaceConfig.ConfigSource configSource2 = new androidx.camera.core.impl.SurfaceConfig.ConfigSource("CAPTURE_SESSION_TABLES", 1);
            CAPTURE_SESSION_TABLES = configSource2;
            androidx.camera.core.impl.SurfaceConfig.ConfigSource[] configSourceArr = {configSource, configSource2};
            getHighSpeedVideoFpsRanges = configSourceArr;
            getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(configSourceArr);
        }

        public static androidx.camera.core.impl.SurfaceConfig.ConfigSource[] values() {
            return (androidx.camera.core.impl.SurfaceConfig.ConfigSource[]) getHighSpeedVideoFpsRanges.clone();
        }

        public static androidx.camera.core.impl.SurfaceConfig.ConfigSource valueOf(java.lang.String str) {
            return (androidx.camera.core.impl.SurfaceConfig.ConfigSource) java.lang.Enum.valueOf(androidx.camera.core.impl.SurfaceConfig.ConfigSource.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.camera.core.impl.SurfaceConfig.ConfigSource> getEntries() {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e"}, d2 = {"Landroidx/camera/core/impl/SurfaceConfig$ConfigSize;", "", "", "p0", "Landroid/util/Size;", "p1", "<init>", "(Ljava/lang/String;IILandroid/util/Size;)V", "id", com.visa.cbp.getEncExpo.warmup, "getId", "()I", "relatedFixedSize", "Landroid/util/Size;", "getRelatedFixedSize", "()Landroid/util/Size;", "VGA", "X_VGA", "S720P_16_9", "PREVIEW", "S1080P_4_3", "S1080P_16_9", "S1440P_4_3", "S1440P_16_9", "UHD", "RECORD", "MAXIMUM", "MAXIMUM_4_3", "MAXIMUM_16_9", "ULTRA_MAXIMUM", "NOT_SUPPORT"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ConfigSize {
        private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigSize MAXIMUM;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigSize MAXIMUM_16_9;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigSize MAXIMUM_4_3;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigSize NOT_SUPPORT;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigSize PREVIEW;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigSize RECORD;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigSize S1080P_16_9;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigSize S1080P_4_3;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigSize S1440P_16_9;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigSize S1440P_4_3;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigSize S720P_16_9;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigSize UHD;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigSize ULTRA_MAXIMUM;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigSize VGA;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigSize X_VGA;
        private static final /* synthetic */ androidx.camera.core.impl.SurfaceConfig.ConfigSize[] getHighSpeedVideoFpsRangesFor;
        private final int id;
        private final android.util.Size relatedFixedSize;

        private ConfigSize(java.lang.String str, int i, int i2, android.util.Size size) {
            this.id = i2;
            this.relatedFixedSize = size;
        }

        /* synthetic */ ConfigSize(java.lang.String str, int i, int i2, android.util.Size size, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2, (i3 & 2) != 0 ? null : size);
        }

        public final int getId() {
            return this.id;
        }

        public final android.util.Size getRelatedFixedSize() {
            return this.relatedFixedSize;
        }

        static {
            androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize = new androidx.camera.core.impl.SurfaceConfig.ConfigSize("VGA", 0, 0, new android.util.Size(640, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND));
            VGA = configSize;
            androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize2 = new androidx.camera.core.impl.SurfaceConfig.ConfigSize("X_VGA", 1, 1, new android.util.Size(1024, com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS));
            X_VGA = configSize2;
            androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize3 = new androidx.camera.core.impl.SurfaceConfig.ConfigSize("S720P_16_9", 2, 2, new android.util.Size(1280, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT));
            S720P_16_9 = configSize3;
            androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize4 = new androidx.camera.core.impl.SurfaceConfig.ConfigSize("PREVIEW", 3, 3, null, 2, null);
            PREVIEW = configSize4;
            androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize5 = new androidx.camera.core.impl.SurfaceConfig.ConfigSize("S1080P_4_3", 4, 4, new android.util.Size(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_WIDTH, 1080));
            S1080P_4_3 = configSize5;
            androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize6 = new androidx.camera.core.impl.SurfaceConfig.ConfigSize("S1080P_16_9", 5, 5, new android.util.Size(1920, 1080));
            S1080P_16_9 = configSize6;
            androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize7 = new androidx.camera.core.impl.SurfaceConfig.ConfigSize("S1440P_4_3", 6, 6, new android.util.Size(1920, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_WIDTH));
            S1440P_4_3 = configSize7;
            androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize8 = new androidx.camera.core.impl.SurfaceConfig.ConfigSize("S1440P_16_9", 7, 7, new android.util.Size(2560, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_WIDTH));
            S1440P_16_9 = configSize8;
            androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize9 = new androidx.camera.core.impl.SurfaceConfig.ConfigSize("UHD", 8, 8, new android.util.Size(3840, 2160));
            UHD = configSize9;
            android.util.Size size = null;
            int i = 2;
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize10 = new androidx.camera.core.impl.SurfaceConfig.ConfigSize("RECORD", 9, 9, size, i, defaultConstructorMarker);
            RECORD = configSize10;
            androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize11 = new androidx.camera.core.impl.SurfaceConfig.ConfigSize("MAXIMUM", 10, 10, null, 2, null);
            MAXIMUM = configSize11;
            androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize12 = new androidx.camera.core.impl.SurfaceConfig.ConfigSize("MAXIMUM_4_3", 11, 11, size, i, defaultConstructorMarker);
            MAXIMUM_4_3 = configSize12;
            android.util.Size size2 = null;
            int i2 = 2;
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker2 = null;
            androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize13 = new androidx.camera.core.impl.SurfaceConfig.ConfigSize("MAXIMUM_16_9", 12, 12, size2, i2, defaultConstructorMarker2);
            MAXIMUM_16_9 = configSize13;
            androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize14 = new androidx.camera.core.impl.SurfaceConfig.ConfigSize("ULTRA_MAXIMUM", 13, 13, null, 2, null);
            ULTRA_MAXIMUM = configSize14;
            androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize15 = new androidx.camera.core.impl.SurfaceConfig.ConfigSize("NOT_SUPPORT", 14, 14, size2, i2, defaultConstructorMarker2);
            NOT_SUPPORT = configSize15;
            androidx.camera.core.impl.SurfaceConfig.ConfigSize[] configSizeArr = {configSize, configSize2, configSize3, configSize4, configSize5, configSize6, configSize7, configSize8, configSize9, configSize10, configSize11, configSize12, configSize13, configSize14, configSize15};
            getHighSpeedVideoFpsRangesFor = configSizeArr;
            Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(configSizeArr);
        }

        public static androidx.camera.core.impl.SurfaceConfig.ConfigSize[] values() {
            return (androidx.camera.core.impl.SurfaceConfig.ConfigSize[]) getHighSpeedVideoFpsRangesFor.clone();
        }

        public static androidx.camera.core.impl.SurfaceConfig.ConfigSize valueOf(java.lang.String str) {
            return (androidx.camera.core.impl.SurfaceConfig.ConfigSize) java.lang.Enum.valueOf(androidx.camera.core.impl.SurfaceConfig.ConfigSize.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.camera.core.impl.SurfaceConfig.ConfigSize> getEntries() {
            return Camera2StreamConfigurationMap;
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SurfaceConfig(configType=");
        sb.append(this.configType);
        sb.append(", configSize=");
        sb.append(this.configSize);
        sb.append(", streamUseCase=");
        sb.append(this.streamUseCase);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.configType.hashCode() * 31) + this.configSize.hashCode()) * 31) + this.streamUseCase.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.core.impl.SurfaceConfig)) {
            return false;
        }
        androidx.camera.core.impl.SurfaceConfig surfaceConfig = (androidx.camera.core.impl.SurfaceConfig) other;
        return this.configType == surfaceConfig.configType && this.configSize == surfaceConfig.configSize && this.streamUseCase == surfaceConfig.streamUseCase;
    }

    public final androidx.camera.core.impl.SurfaceConfig copy(androidx.camera.core.impl.SurfaceConfig.ConfigType configType, androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize, androidx.camera.core.impl.StreamUseCase streamUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configSize, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamUseCase, "");
        return new androidx.camera.core.impl.SurfaceConfig(configType, configSize, streamUseCase);
    }

    /* renamed from: component3, reason: from getter */
    public final androidx.camera.core.impl.StreamUseCase getStreamUseCase() {
        return this.streamUseCase;
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.camera.core.impl.SurfaceConfig.ConfigSize getConfigSize() {
        return this.configSize;
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.camera.core.impl.SurfaceConfig.ConfigType getConfigType() {
        return this.configType;
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.core.impl.SurfaceConfig transformSurfaceConfig(int i, android.util.Size size, androidx.camera.core.impl.SurfaceSizeDefinition surfaceSizeDefinition, int i2, androidx.camera.core.impl.SurfaceConfig.ConfigSource configSource, androidx.camera.core.impl.StreamUseCase streamUseCase) {
        return INSTANCE.transformSurfaceConfig(i, size, surfaceSizeDefinition, i2, configSource, streamUseCase);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.core.impl.SurfaceConfig transformSurfaceConfig(int i, android.util.Size size, androidx.camera.core.impl.SurfaceSizeDefinition surfaceSizeDefinition, int i2, androidx.camera.core.impl.SurfaceConfig.ConfigSource configSource) {
        return INSTANCE.transformSurfaceConfig(i, size, surfaceSizeDefinition, i2, configSource);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.core.impl.SurfaceConfig transformSurfaceConfig(int i, android.util.Size size, androidx.camera.core.impl.SurfaceSizeDefinition surfaceSizeDefinition, int i2) {
        return INSTANCE.transformSurfaceConfig(i, size, surfaceSizeDefinition, i2);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.core.impl.SurfaceConfig transformSurfaceConfig(int i, android.util.Size size, androidx.camera.core.impl.SurfaceSizeDefinition surfaceSizeDefinition) {
        return INSTANCE.transformSurfaceConfig(i, size, surfaceSizeDefinition);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.core.impl.SurfaceConfig.ConfigType getConfigType(int i) {
        return INSTANCE.getConfigType(i);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.core.impl.SurfaceConfig create(androidx.camera.core.impl.SurfaceConfig.ConfigType configType, androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize, androidx.camera.core.impl.StreamUseCase streamUseCase) {
        return INSTANCE.create(configType, configSize, streamUseCase);
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.camera.core.impl.SurfaceConfig.ConfigSize.values().length];
            try {
                iArr[androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.camera.core.impl.SurfaceConfig.ConfigSize.RECORD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM_4_3.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM_16_9.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.camera.core.impl.SurfaceConfig.ConfigSize.ULTRA_MAXIMUM.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[androidx.camera.core.impl.SurfaceConfig.ConfigSize.NOT_SUPPORT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.core.impl.SurfaceConfig create(androidx.camera.core.impl.SurfaceConfig.ConfigType configType, androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize) {
        return INSTANCE.create(configType, configSize);
    }

    public static /* synthetic */ androidx.camera.core.impl.SurfaceConfig copy$default(androidx.camera.core.impl.SurfaceConfig surfaceConfig, androidx.camera.core.impl.SurfaceConfig.ConfigType configType, androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize, androidx.camera.core.impl.StreamUseCase streamUseCase, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            configType = surfaceConfig.configType;
        }
        if ((i & 2) != 0) {
            configSize = surfaceConfig.configSize;
        }
        if ((i & 4) != 0) {
            streamUseCase = surfaceConfig.streamUseCase;
        }
        return surfaceConfig.copy(configType, configSize, streamUseCase);
    }
}
