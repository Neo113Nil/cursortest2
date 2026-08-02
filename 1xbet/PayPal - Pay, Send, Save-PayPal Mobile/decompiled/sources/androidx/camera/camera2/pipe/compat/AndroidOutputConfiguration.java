package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001/B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J)\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0013*\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0)8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010#"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidOutputConfiguration;", "Landroidx/camera/camera2/pipe/compat/OutputConfigurationWrapper;", "Landroid/hardware/camera2/params/OutputConfiguration;", "output", "", "surfaceSharing", "", "maxSharedSurfaceCount", "Landroidx/camera/camera2/pipe/CameraId;", "physicalCameraId", "<init>", "(Landroid/hardware/camera2/params/OutputConfiguration;ZILjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/view/Surface;", "surface", "", "addSurface", "(Landroid/view/Surface;)V", "removeSurface", "", "T", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/hardware/camera2/params/OutputConfiguration;", "getHighSpeedVideoSizes", "Z", "getSurfaceSharing", "()Z", com.visa.cbp.getEncExpo.warmup, "getMaxSharedSurfaceCount", "()I", "Ljava/lang/String;", "getPhysicalCameraId-1LO98Z0", "Landroid/view/Surface;", "getSurface", "()Landroid/view/Surface;", "", "getSurfaces", "()Ljava/util/List;", "surfaces", "getSurfaceGroupId", "surfaceGroupId", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidOutputConfiguration implements androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.compat.AndroidOutputConfiguration.Companion INSTANCE = new androidx.camera.camera2.pipe.compat.AndroidOutputConfiguration.Companion(null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.hardware.camera2.params.OutputConfiguration getHighSpeedVideoSizes;
    private final int maxSharedSurfaceCount;
    private final java.lang.String physicalCameraId;
    private final android.view.Surface surface;
    private final boolean surfaceSharing;

    private AndroidOutputConfiguration(android.hardware.camera2.params.OutputConfiguration outputConfiguration, boolean z, int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputConfiguration, "");
        this.getHighSpeedVideoSizes = outputConfiguration;
        this.surfaceSharing = z;
        this.maxSharedSurfaceCount = i;
        this.physicalCameraId = str;
        this.surface = outputConfiguration.getSurface();
    }

    @Override // androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper
    public final boolean getSurfaceSharing() {
        return this.surfaceSharing;
    }

    @Override // androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper
    public final int getMaxSharedSurfaceCount() {
        return this.maxSharedSurfaceCount;
    }

    @Override // androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper
    /* renamed from: getPhysicalCameraId-1LO98Z0, reason: not valid java name and from getter */
    public final java.lang.String getPhysicalCameraId() {
        return this.physicalCameraId;
    }

    @kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u009b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidOutputConfiguration$Companion;", "", "<init>", "()V", "Landroid/view/Surface;", "surface", "", "format", "Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "outputType", "Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;", "mirrorMode", "Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;", "timestampBase", "Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "dynamicRangeProfile", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "streamUseCase", "", "Landroidx/camera/camera2/pipe/OutputStream$SensorPixelMode;", "sensorPixelModes", "Landroid/util/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "", "surfaceSharing", "surfaceGroupId", "Landroidx/camera/camera2/pipe/CameraId;", "physicalCameraId", "Landroidx/camera/camera2/pipe/compat/OutputConfigurationWrapper;", "create-gWWoySg", "(Landroid/view/Surface;Ljava/lang/Integer;Landroidx/camera/camera2/pipe/OutputStream$OutputType;Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;Ljava/util/List;Landroid/util/Size;ZILjava/lang/String;)Landroidx/camera/camera2/pipe/compat/OutputConfigurationWrapper;", "create"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x01a0  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x01c7  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01cc  */
        /* renamed from: create-gWWoySg, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper m772creategWWoySg(android.view.Surface surface, java.lang.Integer format, androidx.camera.camera2.pipe.OutputStream.OutputType outputType, androidx.camera.camera2.pipe.OutputStream.MirrorMode mirrorMode, androidx.camera.camera2.pipe.OutputStream.TimestampBase timestampBase, androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile dynamicRangeProfile, androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase, java.util.List<androidx.camera.camera2.pipe.OutputStream.SensorPixelMode> sensorPixelModes, android.util.Size size, boolean surfaceSharing, int surfaceGroupId, java.lang.String physicalCameraId) {
            java.lang.Class cls;
            android.hardware.camera2.params.OutputConfiguration newOutputConfiguration;
            android.hardware.camera2.params.OutputConfiguration outputConfiguration;
            android.hardware.camera2.params.OutputConfiguration outputConfiguration2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sensorPixelModes, "");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(outputType, androidx.camera.camera2.pipe.OutputStream.OutputType.INSTANCE.getSURFACE_DEFERRED_FOR_QUERY_ONLY$camera_camera2_pipe()) || android.os.Build.VERSION.SDK_INT < 35) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(outputType, androidx.camera.camera2.pipe.OutputStream.OutputType.INSTANCE.getSURFACE())) {
                    if (surface == null) {
                        androidx.camera.camera2.pipe.OutputStream.OutputType.INSTANCE.getSURFACE();
                        throw new java.lang.IllegalStateException("non-null surface!".toString());
                    }
                    try {
                        if (surfaceGroupId != -1) {
                            outputConfiguration = new android.hardware.camera2.params.OutputConfiguration(surfaceGroupId, surface);
                        } else {
                            outputConfiguration = new android.hardware.camera2.params.OutputConfiguration(surface);
                        }
                        outputConfiguration2 = outputConfiguration;
                        if (surfaceSharing) {
                            androidx.camera.camera2.pipe.compat.Api26Compat.enableSurfaceSharing(outputConfiguration2);
                        }
                        if (physicalCameraId != null) {
                            if (android.os.Build.VERSION.SDK_INT >= 28) {
                                if (android.os.Build.VERSION.SDK_INT >= 28) {
                                    androidx.camera.camera2.pipe.compat.Api28Compat.setPhysicalCameraId(outputConfiguration2, physicalCameraId);
                                }
                            } else {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("physicalCameraId is not supported on API ");
                                sb.append(android.os.Build.VERSION.SDK_INT);
                                sb.append(" (requires API 28)");
                                throw new java.lang.IllegalStateException(sb.toString().toString());
                            }
                        }
                        if (mirrorMode != null) {
                            if (android.os.Build.VERSION.SDK_INT >= 33) {
                                androidx.camera.camera2.pipe.compat.Api33Compat.setMirrorMode(outputConfiguration2, mirrorMode.m602unboximpl());
                            } else {
                                if (!androidx.camera.camera2.pipe.OutputStream.MirrorMode.m599equalsimpl0(mirrorMode.m602unboximpl(), androidx.camera.camera2.pipe.OutputStream.MirrorMode.INSTANCE.m603getMIRROR_MODE_AUTODrUKqn0()) && androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                                    androidx.camera.camera2.pipe.OutputStream.MirrorMode.m601toStringimpl(mirrorMode.m602unboximpl());
                                }
                            }
                        }
                        if (timestampBase != null) {
                            if (android.os.Build.VERSION.SDK_INT >= 33) {
                                androidx.camera.camera2.pipe.compat.Api33Compat.setTimestampBase(outputConfiguration2, timestampBase.m645unboximpl());
                            } else {
                                if (!androidx.camera.camera2.pipe.OutputStream.TimestampBase.m642equalsimpl0(timestampBase.m645unboximpl(), androidx.camera.camera2.pipe.OutputStream.TimestampBase.INSTANCE.m647getTIMESTAMP_BASE_DEFAULT6HVI0MA()) && androidx.camera.camera2.pipe.core.Log.INSTANCE.getINFO_LOGGABLE()) {
                                    androidx.camera.camera2.pipe.OutputStream.TimestampBase.m644toStringimpl(timestampBase.m645unboximpl());
                                }
                            }
                        }
                        if (dynamicRangeProfile != null) {
                            if (android.os.Build.VERSION.SDK_INT >= 33) {
                                androidx.camera.camera2.pipe.compat.Api33Compat.setDynamicRangeProfile(outputConfiguration2, dynamicRangeProfile.m582unboximpl());
                            } else {
                                if (!androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.m579equalsimpl0(dynamicRangeProfile.m582unboximpl(), androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.INSTANCE.m595getSTANDARDfFAQAUE()) && androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                                    androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.m581toStringimpl(dynamicRangeProfile.m582unboximpl());
                                }
                            }
                        }
                        if (streamUseCase != null && android.os.Build.VERSION.SDK_INT >= 33) {
                            androidx.camera.camera2.pipe.compat.Api33Compat.setStreamUseCase(outputConfiguration2, streamUseCase.m622unboximpl());
                        }
                        if (!sensorPixelModes.isEmpty()) {
                            if (android.os.Build.VERSION.SDK_INT >= 31) {
                                java.util.Iterator<androidx.camera.camera2.pipe.OutputStream.SensorPixelMode> it = sensorPixelModes.iterator();
                                while (it.hasNext()) {
                                    androidx.camera.camera2.pipe.compat.Api31Compat.addSensorPixelModeUsed(outputConfiguration2, it.next().m613unboximpl());
                                }
                            } else {
                                androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
                            }
                        }
                        return new androidx.camera.camera2.pipe.compat.AndroidOutputConfiguration(outputConfiguration2, surfaceSharing, android.os.Build.VERSION.SDK_INT < 28 ? androidx.camera.camera2.pipe.compat.Api28Compat.getMaxSharedSurfaceCount(outputConfiguration2) : 1, physicalCameraId, null);
                    } catch (java.lang.Throwable unused) {
                        androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
                        return null;
                    }
                }
                if (size == null) {
                    throw new java.lang.IllegalStateException("Size must defined when creating a deferred OutputConfiguration.".toString());
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(outputType, androidx.camera.camera2.pipe.OutputStream.OutputType.INSTANCE.getSURFACE_TEXTURE())) {
                    cls = android.graphics.SurfaceTexture.class;
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(outputType, androidx.camera.camera2.pipe.OutputStream.OutputType.INSTANCE.getSURFACE_VIEW())) {
                    cls = android.view.SurfaceHolder.class;
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(outputType, androidx.camera.camera2.pipe.OutputStream.OutputType.INSTANCE.getMEDIA_CODEC())) {
                    if (android.os.Build.VERSION.SDK_INT < 35) {
                        throw new java.lang.IllegalStateException("OutputType.MEDIA_CODEC requires API 35 or higher.".toString());
                    }
                    cls = android.media.MediaCodec.class;
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(outputType, androidx.camera.camera2.pipe.OutputStream.OutputType.INSTANCE.getMEDIA_RECORDER())) {
                    if (android.os.Build.VERSION.SDK_INT < 35) {
                        throw new java.lang.IllegalStateException("OutputType.MEDIA_RECORDER requires API 35 or higher.".toString());
                    }
                    cls = android.media.MediaRecorder.class;
                } else {
                    throw new java.lang.IllegalStateException("Unsupported OutputType: ".concat(java.lang.String.valueOf(outputType)));
                }
                newOutputConfiguration = androidx.camera.camera2.pipe.compat.Api26Compat.newOutputConfiguration(size, cls);
            } else {
                if (format == null) {
                    throw new java.lang.IllegalStateException("Required value was null.".toString());
                }
                if (size == null) {
                    throw new java.lang.IllegalStateException("Required value was null.".toString());
                }
                newOutputConfiguration = androidx.camera.camera2.pipe.compat.Api35Compat.newImageReaderOutputConfiguration(format.intValue(), size);
            }
            outputConfiguration2 = newOutputConfiguration;
            if (surfaceSharing) {
            }
            if (physicalCameraId != null) {
            }
            if (mirrorMode != null) {
            }
            if (timestampBase != null) {
            }
            if (dynamicRangeProfile != null) {
            }
            if (streamUseCase != null) {
                androidx.camera.camera2.pipe.compat.Api33Compat.setStreamUseCase(outputConfiguration2, streamUseCase.m622unboximpl());
            }
            if (!sensorPixelModes.isEmpty()) {
            }
            return new androidx.camera.camera2.pipe.compat.AndroidOutputConfiguration(outputConfiguration2, surfaceSharing, android.os.Build.VERSION.SDK_INT < 28 ? androidx.camera.camera2.pipe.compat.Api28Compat.getMaxSharedSurfaceCount(outputConfiguration2) : 1, physicalCameraId, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper
    public final android.view.Surface getSurface() {
        return this.surface;
    }

    @Override // androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper
    public final java.util.List<android.view.Surface> getSurfaces() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.camera.camera2.pipe.compat.Api26Compat.getSurfaces(this.getHighSpeedVideoSizes);
        }
        return kotlin.collections.CollectionsKt.listOfNotNull(this.getHighSpeedVideoSizes.getSurface());
    }

    @Override // androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper
    public final void addSurface(android.view.Surface surface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "");
        androidx.camera.camera2.pipe.compat.Api26Compat.addSurfaces(this.getHighSpeedVideoSizes, surface);
    }

    @Override // androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper
    public final int getSurfaceGroupId() {
        return this.getHighSpeedVideoSizes.getSurfaceGroupId();
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final <T> T unwrapAs(kotlin.reflect.KClass<T> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.params.OutputConfiguration.class))) {
            return null;
        }
        android.os.Parcelable parcelable = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(parcelable, "");
        return (T) parcelable;
    }

    public final java.lang.String toString() {
        return this.getHighSpeedVideoSizes.toString();
    }

    @Override // androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper
    public final void removeSurface(android.view.Surface surface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "");
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                androidx.camera.camera2.pipe.compat.Api28Compat.removeSurface(this.getHighSpeedVideoSizes, surface);
            }
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("removeSurface is not supported on API ");
            sb.append(android.os.Build.VERSION.SDK_INT);
            sb.append(" (requires API 28)");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
    }

    public /* synthetic */ AndroidOutputConfiguration(android.hardware.camera2.params.OutputConfiguration outputConfiguration, boolean z, int i, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(outputConfiguration, z, i, str);
    }
}
