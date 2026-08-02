package androidx.camera.video.internal.muxer;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0010J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u0003J'\u0010\"\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0013\u0010(\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)J#\u0010-\u001a\u00028\u0000\"\u0004\b\u0000\u0010*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0002¢\u0006\u0004\b-\u0010.R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010-\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00104\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u00106"}, d2 = {"Landroidx/camera/video/internal/muxer/MediaMuxerImpl;", "Landroidx/camera/video/internal/muxer/Muxer;", "<init>", "()V", "", "path", "", "format", "", "setOutput", "(Ljava/lang/String;I)V", "Landroid/os/ParcelFileDescriptor;", "parcelFileDescriptor", "(Landroid/os/ParcelFileDescriptor;I)V", "degrees", "setOrientationDegrees", "(I)V", "", "latitude", "longitude", "setLocation", "(DD)V", "captureFps", "setCaptureFps", "Landroid/media/MediaFormat;", "addTrack", "(Landroid/media/MediaFormat;)I", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "trackIndex", "Ljava/nio/ByteBuffer;", "byteBuffer", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "writeSampleData", "(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V", "release", "", "isInterruptionResilient", "()Z", "getHighSpeedVideoSizes", "(I)I", "T", "Lkotlin/Function0;", "p0", "getHighSpeedVideoFpsRangesFor", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroid/media/MediaMuxer;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/media/MediaMuxer;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/video/internal/muxer/MediaMuxerImpl$State;", "Camera2StreamConfigurationMap", "Landroidx/camera/video/internal/muxer/MediaMuxerImpl$State;", com.visa.cbp.getEncExpo.warmup, "State"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MediaMuxerImpl implements androidx.camera.video.internal.muxer.Muxer {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.camera.video.internal.muxer.MediaMuxerImpl.State getHighSpeedVideoFpsRangesFor = androidx.camera.video.internal.muxer.MediaMuxerImpl.State.getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private android.media.MediaMuxer getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    @Override // androidx.camera.video.internal.muxer.Muxer
    public final boolean isInterruptionResilient() {
        return false;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Landroidx/camera/video/internal/muxer/MediaMuxerImpl$State;", "", "<init>", "(Ljava/lang/String;I)V", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class State {
        public static final androidx.camera.video.internal.muxer.MediaMuxerImpl.State Camera2StreamConfigurationMap;
        public static final androidx.camera.video.internal.muxer.MediaMuxerImpl.State getHighResolutionOutputSizeshNQ4ISI;
        public static final androidx.camera.video.internal.muxer.MediaMuxerImpl.State getHighSpeedVideoFpsRanges;
        public static final androidx.camera.video.internal.muxer.MediaMuxerImpl.State getHighSpeedVideoFpsRangesFor;
        public static final androidx.camera.video.internal.muxer.MediaMuxerImpl.State getHighSpeedVideoSizes;
        private static final /* synthetic */ androidx.camera.video.internal.muxer.MediaMuxerImpl.State[] getInputFormats;
        private static final /* synthetic */ kotlin.enums.EnumEntries getOutputMinFrameDuration;

        private State(java.lang.String str, int i) {
        }

        static {
            androidx.camera.video.internal.muxer.MediaMuxerImpl.State state = new androidx.camera.video.internal.muxer.MediaMuxerImpl.State("IDLE", 0);
            getHighSpeedVideoFpsRangesFor = state;
            androidx.camera.video.internal.muxer.MediaMuxerImpl.State state2 = new androidx.camera.video.internal.muxer.MediaMuxerImpl.State("CONFIGURED", 1);
            getHighSpeedVideoSizes = state2;
            androidx.camera.video.internal.muxer.MediaMuxerImpl.State state3 = new androidx.camera.video.internal.muxer.MediaMuxerImpl.State("STARTED", 2);
            getHighSpeedVideoFpsRanges = state3;
            androidx.camera.video.internal.muxer.MediaMuxerImpl.State state4 = new androidx.camera.video.internal.muxer.MediaMuxerImpl.State("STOPPED", 3);
            Camera2StreamConfigurationMap = state4;
            androidx.camera.video.internal.muxer.MediaMuxerImpl.State state5 = new androidx.camera.video.internal.muxer.MediaMuxerImpl.State("RELEASED", 4);
            getHighResolutionOutputSizeshNQ4ISI = state5;
            androidx.camera.video.internal.muxer.MediaMuxerImpl.State[] stateArr = {state, state2, state3, state4, state5};
            getInputFormats = stateArr;
            getOutputMinFrameDuration = kotlin.enums.EnumEntriesKt.enumEntries(stateArr);
        }

        public static androidx.camera.video.internal.muxer.MediaMuxerImpl.State[] values() {
            return (androidx.camera.video.internal.muxer.MediaMuxerImpl.State[]) getInputFormats.clone();
        }

        public static androidx.camera.video.internal.muxer.MediaMuxerImpl.State valueOf(java.lang.String str) {
            return (androidx.camera.video.internal.muxer.MediaMuxerImpl.State) java.lang.Enum.valueOf(androidx.camera.video.internal.muxer.MediaMuxerImpl.State.class, str);
        }
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public final void setOutput(java.lang.String path, int format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        if (this.getHighSpeedVideoFpsRangesFor != androidx.camera.video.internal.muxer.MediaMuxerImpl.State.getHighSpeedVideoFpsRangesFor) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Muxer is not idle. Current state: ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        this.getHighSpeedVideoFpsRanges = new android.media.MediaMuxer(path, getHighSpeedVideoSizes(format));
        this.getHighSpeedVideoFpsRangesFor = androidx.camera.video.internal.muxer.MediaMuxerImpl.State.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public final void setOutput(android.os.ParcelFileDescriptor parcelFileDescriptor, int format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcelFileDescriptor, "");
        if (this.getHighSpeedVideoFpsRangesFor != androidx.camera.video.internal.muxer.MediaMuxerImpl.State.getHighSpeedVideoFpsRangesFor) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Muxer is not idle. Current state: ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        this.getHighSpeedVideoFpsRanges = androidx.camera.video.internal.compat.Api26Impl.createMediaMuxer(parcelFileDescriptor.getFileDescriptor(), getHighSpeedVideoSizes(format));
        parcelFileDescriptor.close();
        this.getHighSpeedVideoFpsRangesFor = androidx.camera.video.internal.muxer.MediaMuxerImpl.State.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public final void setOrientationDegrees(int degrees) {
        if (this.getHighSpeedVideoFpsRangesFor != androidx.camera.video.internal.muxer.MediaMuxerImpl.State.getHighSpeedVideoSizes) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Muxer is not configured. Current state: ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        android.media.MediaMuxer mediaMuxer = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mediaMuxer);
        mediaMuxer.setOrientationHint(degrees);
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public final void setLocation(double latitude, double longitude) {
        if (this.getHighSpeedVideoFpsRangesFor != androidx.camera.video.internal.muxer.MediaMuxerImpl.State.getHighSpeedVideoSizes) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Muxer is not configured. Current state: ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        android.util.Pair<java.lang.Double, java.lang.Double> adjustGeoLocation = androidx.camera.video.internal.workaround.CorrectNegativeLatLongForMediaMuxer.adjustGeoLocation(latitude, longitude);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adjustGeoLocation, "");
        android.media.MediaMuxer mediaMuxer = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mediaMuxer);
        mediaMuxer.setLocation((float) ((java.lang.Number) adjustGeoLocation.first).doubleValue(), (float) ((java.lang.Number) adjustGeoLocation.second).doubleValue());
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public final void setCaptureFps(int captureFps) {
        if (this.getHighSpeedVideoFpsRangesFor != androidx.camera.video.internal.muxer.MediaMuxerImpl.State.getHighSpeedVideoSizes) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Muxer is not configured. Current state: ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        if (captureFps <= 0) {
            throw new java.lang.IllegalStateException("captureFps must be positive".toString());
        }
        this.Camera2StreamConfigurationMap = captureFps;
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public final int addTrack(final android.media.MediaFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        if (this.getHighSpeedVideoFpsRangesFor != androidx.camera.video.internal.muxer.MediaMuxerImpl.State.getHighSpeedVideoSizes) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Muxer is not configured. Current state: ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        if (androidx.camera.video.internal.utils.MediaFormatExt.INSTANCE.isVideo(format) && this.Camera2StreamConfigurationMap > 0) {
            format.setInteger(androidx.camera.video.internal.utils.MediaFormatExt.KEY_TIMELAPSE_ENABLED, 1);
            format.setInteger(androidx.camera.video.internal.utils.MediaFormatExt.KEY_TIMELAPSE_FPS, this.Camera2StreamConfigurationMap);
        }
        return ((java.lang.Number) getHighSpeedVideoFpsRangesFor(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.video.internal.muxer.MediaMuxerImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(androidx.camera.video.internal.muxer.MediaMuxerImpl.$r8$lambda$_EIJiCkunTdZLEmGUvpuFC8LwY4(androidx.camera.video.internal.muxer.MediaMuxerImpl.this, format));
            }
        })).intValue();
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public final void start() {
        if (this.getHighSpeedVideoFpsRangesFor == androidx.camera.video.internal.muxer.MediaMuxerImpl.State.getHighSpeedVideoFpsRanges) {
            return;
        }
        if (this.getHighSpeedVideoFpsRangesFor != androidx.camera.video.internal.muxer.MediaMuxerImpl.State.getHighSpeedVideoSizes) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Muxer is not configured. Current state: ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        getHighSpeedVideoFpsRangesFor(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.video.internal.muxer.MediaMuxerImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.camera.video.internal.muxer.MediaMuxerImpl.$r8$lambda$KFA6XPxldB7toleFZtaKR49gVKM(androidx.camera.video.internal.muxer.MediaMuxerImpl.this);
            }
        });
        this.getHighSpeedVideoFpsRangesFor = androidx.camera.video.internal.muxer.MediaMuxerImpl.State.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public final void stop() {
        if (this.getHighSpeedVideoFpsRangesFor == androidx.camera.video.internal.muxer.MediaMuxerImpl.State.Camera2StreamConfigurationMap) {
            return;
        }
        if (this.getHighSpeedVideoFpsRangesFor != androidx.camera.video.internal.muxer.MediaMuxerImpl.State.getHighSpeedVideoFpsRanges) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Muxer is not started. Current state: ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        try {
            getHighSpeedVideoFpsRangesFor(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.video.internal.muxer.MediaMuxerImpl$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.camera.video.internal.muxer.MediaMuxerImpl.m1034$r8$lambda$m9R5j7PSARi2fWvAO6BEzVKm5Q(androidx.camera.video.internal.muxer.MediaMuxerImpl.this);
                }
            });
        } finally {
            this.getHighSpeedVideoFpsRangesFor = androidx.camera.video.internal.muxer.MediaMuxerImpl.State.Camera2StreamConfigurationMap;
        }
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public final void writeSampleData(final int trackIndex, final java.nio.ByteBuffer byteBuffer, final android.media.MediaCodec.BufferInfo bufferInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferInfo, "");
        if (this.getHighSpeedVideoFpsRangesFor != androidx.camera.video.internal.muxer.MediaMuxerImpl.State.getHighSpeedVideoFpsRanges) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Muxer is not started. Current state: ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        getHighSpeedVideoFpsRangesFor(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.video.internal.muxer.MediaMuxerImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.camera.video.internal.muxer.MediaMuxerImpl.m1035$r8$lambda$y22WbsosSWg_UepfpxMqeSwjow(androidx.camera.video.internal.muxer.MediaMuxerImpl.this, trackIndex, byteBuffer, bufferInfo);
            }
        });
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public final void release() {
        kotlin.Unit unit;
        if (this.getHighSpeedVideoFpsRangesFor == androidx.camera.video.internal.muxer.MediaMuxerImpl.State.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            androidx.camera.video.internal.muxer.MediaMuxerImpl mediaMuxerImpl = this;
            android.media.MediaMuxer mediaMuxer = this.getHighSpeedVideoFpsRanges;
            if (mediaMuxer != null) {
                mediaMuxer.release();
                unit = kotlin.Unit.INSTANCE;
            } else {
                unit = null;
            }
            kotlin.Result.m23436constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoFpsRangesFor = androidx.camera.video.internal.muxer.MediaMuxerImpl.State.getHighResolutionOutputSizeshNQ4ISI;
    }

    private static int getHighSpeedVideoSizes(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw new java.lang.IllegalArgumentException("Unsupported format: ".concat(java.lang.String.valueOf(i)));
    }

    private static <T> T getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function0<? extends T> p0) throws androidx.camera.video.internal.muxer.MuxerException {
        try {
            return p0.invoke();
        } catch (java.lang.Exception e) {
            throw new androidx.camera.video.internal.muxer.MuxerException("MediaMuxer operation failed", e);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KFA6XPxldB7toleFZtaKR49gVKM(androidx.camera.video.internal.muxer.MediaMuxerImpl mediaMuxerImpl) {
        android.media.MediaMuxer mediaMuxer = mediaMuxerImpl.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mediaMuxer);
        mediaMuxer.start();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ int $r8$lambda$_EIJiCkunTdZLEmGUvpuFC8LwY4(androidx.camera.video.internal.muxer.MediaMuxerImpl mediaMuxerImpl, android.media.MediaFormat mediaFormat) {
        android.media.MediaMuxer mediaMuxer = mediaMuxerImpl.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mediaMuxer);
        return mediaMuxer.addTrack(mediaFormat);
    }

    /* renamed from: $r8$lambda$m9R5j7PSARi2fWvAO6-BEzVKm5Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m1034$r8$lambda$m9R5j7PSARi2fWvAO6BEzVKm5Q(androidx.camera.video.internal.muxer.MediaMuxerImpl mediaMuxerImpl) {
        android.media.MediaMuxer mediaMuxer = mediaMuxerImpl.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mediaMuxer);
        mediaMuxer.stop();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$y22WbsosSWg_U-epfpxMqeSwjow, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m1035$r8$lambda$y22WbsosSWg_UepfpxMqeSwjow(androidx.camera.video.internal.muxer.MediaMuxerImpl mediaMuxerImpl, int i, java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) {
        android.media.MediaMuxer mediaMuxer = mediaMuxerImpl.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mediaMuxer);
        mediaMuxer.writeSampleData(i, byteBuffer, bufferInfo);
        return kotlin.Unit.INSTANCE;
    }
}
