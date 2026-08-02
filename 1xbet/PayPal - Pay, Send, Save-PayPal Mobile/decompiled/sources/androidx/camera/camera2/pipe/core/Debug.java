package androidx.camera.camera2.pipe.core;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u000e\b\u0004\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ1\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u000e\b\u0004\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ#\u0010\r\u001a\u00020\f2\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0003J7\u0010\u0016\u001a\u00020\f2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u0013\u001a\u00020\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001b\u001a\u00020\u00052\u0012\u0010\u0018\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001d\u001a\u00020\u00052\u0012\u0010\u0018\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001cJ5\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001f0\u001e2\u0012\u0010\u0012\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010 J\u0019\u0010!\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b#\u0010\"J%\u0010*\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020,8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0006X\u0087T¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u0002018\u0006X\u0087T¢\u0006\u0006\n\u0004\b4\u00103\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/core/Debug;", "", "<init>", "()V", "T", "", "label", "Lkotlin/Function0;", "block", "trace", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "instrument$camera_camera2_pipe", "", "traceStart", "(Lkotlin/jvm/functions/Function0;)V", "traceStop", "Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "p0", "p1", "", "p2", "Camera2StreamConfigurationMap", "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/Map;)V", "parameters", "", "limit", "formatParameterMap", "(Ljava/util/Map;I)Ljava/lang/String;", "formatParameterMapToLineSeparatedList", "", "Lkotlin/Pair;", "(Ljava/util/Map;)Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/Object;)Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/pipe/CameraMetadata;", "metadata", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "graphConfig", "Landroidx/camera/camera2/pipe/CameraGraph;", "cameraGraph", "formatCameraGraphProperties", "(Landroidx/camera/camera2/pipe/CameraMetadata;Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/CameraGraph;)Ljava/lang/String;", "Landroidx/camera/camera2/pipe/core/SystemTimeSource;", "systemTimeSource", "Landroidx/camera/camera2/pipe/core/SystemTimeSource;", "getSystemTimeSource$camera_camera2_pipe", "()Landroidx/camera/camera2/pipe/core/SystemTimeSource;", "", "ENABLE_LOGGING", "Z", "ENABLE_TRACING"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Debug {
    public static final boolean ENABLE_LOGGING = true;
    public static final boolean ENABLE_TRACING = true;
    public static final androidx.camera.camera2.pipe.core.Debug INSTANCE = new androidx.camera.camera2.pipe.core.Debug();
    private static final androidx.camera.camera2.pipe.core.SystemTimeSource systemTimeSource = new androidx.camera.camera2.pipe.core.SystemTimeSource();

    private Debug() {
    }

    public final androidx.camera.camera2.pipe.core.SystemTimeSource getSystemTimeSource$camera_camera2_pipe() {
        return systemTimeSource;
    }

    public final <T> T instrument$camera_camera2_pipe(java.lang.String label, kotlin.jvm.functions.Function0<? extends T> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        long mo885nowvQl9yQU = getSystemTimeSource$camera_camera2_pipe().mo885nowvQl9yQU();
        try {
            android.os.Trace.beginSection(label);
            return block.invoke();
        } finally {
            android.os.Trace.endSection();
            long m872constructorimpl = androidx.camera.camera2.pipe.core.DurationNs.m872constructorimpl(getSystemTimeSource$camera_camera2_pipe().mo885nowvQl9yQU() - mo885nowvQl9yQU);
            if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE()) {
                androidx.camera.camera2.pipe.core.Timestamps timestamps = androidx.camera.camera2.pipe.core.Timestamps.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.lang.String.format(null, "%.3f ms", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(m872constructorimpl / 1000000.0d)}, 1)), "");
            }
        }
    }

    public final void traceStart(kotlin.jvm.functions.Function0<java.lang.String> label) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        android.os.Trace.beginSection(label.invoke());
    }

    public final void traceStop() {
        android.os.Trace.endSection();
    }

    private static void Camera2StreamConfigurationMap(java.lang.StringBuilder p0, java.lang.String p1, java.util.Map<?, ? extends java.lang.Object> p2) {
        if (p2.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(p1);
            sb.append(": (None)\n");
            p0.append(sb.toString());
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(p1);
        sb2.append('\n');
        p0.append(sb2.toString());
        java.util.Iterator<T> it = Camera2StreamConfigurationMap(p2).iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("  ");
            sb3.append(kotlin.text.StringsKt.padEnd((java.lang.String) pair.getFirst(), 50, ' '));
            sb3.append(' ');
            sb3.append((java.lang.String) pair.getSecond());
            sb3.append('\n');
            p0.append(sb3.toString());
        }
    }

    public static /* synthetic */ java.lang.String formatParameterMap$default(androidx.camera.camera2.pipe.core.Debug debug, java.util.Map map, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        return debug.formatParameterMap(map, i);
    }

    public final java.lang.String formatParameterMap(java.util.Map<?, ? extends java.lang.Object> parameters, int limit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "");
        return kotlin.collections.CollectionsKt.joinToString$default(Camera2StreamConfigurationMap(parameters), null, "{", "}", limit, null, new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.pipe.core.Debug$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.camera.camera2.pipe.core.Debug.$r8$lambda$qyoCxQw_NlDyB2t4IONaMXi63jI((kotlin.Pair) obj);
            }
        }, 17, null);
    }

    public static /* synthetic */ java.lang.String formatParameterMapToLineSeparatedList$default(androidx.camera.camera2.pipe.core.Debug debug, java.util.Map map, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        return debug.formatParameterMapToLineSeparatedList(map, i);
    }

    public final java.lang.String formatParameterMapToLineSeparatedList(java.util.Map<?, ? extends java.lang.Object> parameters, int limit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "");
        return kotlin.collections.CollectionsKt.joinToString$default(Camera2StreamConfigurationMap(parameters), ",\n", "{\n", "\n}", limit, null, new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.pipe.core.Debug$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.camera.camera2.pipe.core.Debug.$r8$lambda$8Jcj27A32Q5y6wl50i2jptop8xg((kotlin.Pair) obj);
            }
        }, 16, null);
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.Object p0) {
        if (p0 instanceof android.hardware.camera2.CameraCharacteristics.Key) {
            java.lang.String name2 = ((android.hardware.camera2.CameraCharacteristics.Key) p0).getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            return name2;
        }
        if (p0 instanceof android.hardware.camera2.CaptureRequest.Key) {
            java.lang.String name3 = ((android.hardware.camera2.CaptureRequest.Key) p0).getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name3, "");
            return name3;
        }
        if (!(p0 instanceof android.hardware.camera2.CaptureResult.Key)) {
            return java.lang.String.valueOf(p0);
        }
        java.lang.String name4 = ((android.hardware.camera2.CaptureResult.Key) p0).getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name4, "");
        return name4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String getHighSpeedVideoFpsRanges(java.lang.Object p0) {
        return p0 instanceof java.lang.Object[] ? kotlin.collections.ArraysKt.joinToString$default((java.lang.Object[]) p0, (java.lang.CharSequence) null, "[", "]", 0, (java.lang.CharSequence) null, new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.pipe.core.Debug$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.CharSequence highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.camera.camera2.pipe.core.Debug.getHighSpeedVideoFpsRanges(obj);
                return highSpeedVideoFpsRanges;
            }
        }, 25, (java.lang.Object) null) : java.lang.String.valueOf(p0);
    }

    public final java.lang.String formatCameraGraphProperties(androidx.camera.camera2.pipe.CameraMetadata metadata, androidx.camera.camera2.pipe.CameraGraph.Config graphConfig, androidx.camera.camera2.pipe.CameraGraph cameraGraph) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraGraph, "");
        androidx.camera.camera2.pipe.ConcurrentCameraGraphs concurrentCameraGraphs = graphConfig.getConcurrentCameraGraphs();
        java.util.Set<androidx.camera.camera2.pipe.CameraId> cameraIds = concurrentCameraGraphs != null ? concurrentCameraGraphs.getCameraIds() : null;
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.LENS_FACING;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Integer num = (java.lang.Integer) metadata.get(key);
        java.lang.String str3 = "External";
        java.lang.String str4 = "Unknown";
        if (num != null && num.intValue() == 0) {
            str = "Front";
        } else if (num == null || num.intValue() != 1) {
            str = (num == null || num.intValue() != 2) ? "Unknown" : "External";
        } else {
            str = com.knotapi.knot.utilities.Constants.META_BACK_BUTTON;
        }
        android.hardware.camera2.CameraCharacteristics.Key key2 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key2, "");
        java.lang.Integer num2 = (java.lang.Integer) metadata.get(key2);
        if (num2 != null && num2.intValue() == 0) {
            str3 = "Limited";
        } else if (num2 != null && num2.intValue() == 1) {
            str3 = "Full";
        } else if (num2 != null && num2.intValue() == 2) {
            str3 = "Legacy";
        } else if (num2 != null && num2.intValue() == 3) {
            str3 = "Level 3";
        } else if (num2 == null || num2.intValue() != 4) {
            str3 = "Unknown";
        }
        int m357getSessionMode2uNL3no = graphConfig.m357getSessionMode2uNL3no();
        if (androidx.camera.camera2.pipe.CameraGraph.OperatingMode.m376equalsimpl0(m357getSessionMode2uNL3no, androidx.camera.camera2.pipe.CameraGraph.OperatingMode.INSTANCE.m382getHIGH_SPEED2uNL3no())) {
            str4 = "High Speed";
        } else if (androidx.camera.camera2.pipe.CameraGraph.OperatingMode.m376equalsimpl0(m357getSessionMode2uNL3no, androidx.camera.camera2.pipe.CameraGraph.OperatingMode.INSTANCE.m383getNORMAL2uNL3no())) {
            str4 = "Normal";
        } else if (androidx.camera.camera2.pipe.CameraGraph.OperatingMode.m376equalsimpl0(m357getSessionMode2uNL3no, androidx.camera.camera2.pipe.CameraGraph.OperatingMode.INSTANCE.m381getEXTENSION2uNL3no())) {
            str4 = "Extension";
        }
        android.hardware.camera2.CameraCharacteristics.Key key3 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key3, "");
        int[] iArr = (int[]) metadata.get(key3);
        if (iArr != null && kotlin.collections.ArraysKt.contains(iArr, 11)) {
            str2 = "Logical";
        } else {
            str2 = "Physical";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(cameraGraph);
        sb2.append(" (Camera ");
        sb2.append(graphConfig.m353getCameraDz_R5H8());
        sb2.append(")\n");
        sb.append(sb2.toString());
        if (cameraIds != null) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("  Concurrent: ");
            sb3.append(cameraIds);
            sb3.append('\n');
            sb.append(sb3.toString());
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("  Facing:    ");
        sb4.append(str);
        sb4.append(" (");
        sb4.append(str2);
        sb4.append(", ");
        sb4.append(str3);
        sb4.append(")\n");
        sb.append(sb4.toString());
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("  Mode:      ");
        sb5.append(str4);
        sb5.append('\n');
        sb.append(sb5.toString());
        sb.append("Outputs:\n");
        java.util.Iterator<androidx.camera.camera2.pipe.CameraStream> it = cameraGraph.getStreams().getStreams().iterator();
        while (it.hasNext()) {
            int i = 0;
            for (java.lang.Object obj : it.next().getOutputs()) {
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                androidx.camera.camera2.pipe.OutputStream outputStream = (androidx.camera.camera2.pipe.OutputStream) obj;
                sb.append("  ");
                sb.append(kotlin.text.StringsKt.padEnd(i == 0 ? androidx.camera.camera2.pipe.StreamId.m760toStringimpl(outputStream.getStream().getId()) : "", 12, ' '));
                sb.append(kotlin.text.StringsKt.padEnd(androidx.camera.camera2.pipe.OutputId.m541toStringimpl(outputStream.getId()), 12, ' '));
                java.lang.String size = outputStream.getSize().toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(size, "");
                sb.append(kotlin.text.StringsKt.padEnd(size, 12, ' '));
                sb.append(kotlin.text.StringsKt.padEnd(androidx.camera.camera2.pipe.StreamFormat.m714getNameimpl(outputStream.getFormat()), 16, ' '));
                androidx.camera.camera2.pipe.OutputStream.MirrorMode mirrorMode = outputStream.getMirrorMode();
                if (mirrorMode != null) {
                    int m602unboximpl = mirrorMode.m602unboximpl();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" [");
                    sb6.append((java.lang.Object) androidx.camera.camera2.pipe.OutputStream.MirrorMode.m601toStringimpl(m602unboximpl));
                    sb6.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                    sb.append(sb6.toString());
                }
                androidx.camera.camera2.pipe.OutputStream.TimestampBase timestampBase = outputStream.getTimestampBase();
                if (timestampBase != null) {
                    int m645unboximpl = timestampBase.m645unboximpl();
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder(" [");
                    sb7.append((java.lang.Object) androidx.camera.camera2.pipe.OutputStream.TimestampBase.m644toStringimpl(m645unboximpl));
                    sb7.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                    sb.append(sb7.toString());
                }
                androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile dynamicRangeProfile = outputStream.getDynamicRangeProfile();
                if (dynamicRangeProfile != null) {
                    long m582unboximpl = dynamicRangeProfile.m582unboximpl();
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder(" [");
                    sb8.append((java.lang.Object) androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.m581toStringimpl(m582unboximpl));
                    sb8.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                    sb.append(sb8.toString());
                }
                androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase = outputStream.getStreamUseCase();
                if (streamUseCase != null) {
                    long m622unboximpl = streamUseCase.m622unboximpl();
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder(" [");
                    sb9.append((java.lang.Object) androidx.camera.camera2.pipe.OutputStream.StreamUseCase.m621toStringimpl(m622unboximpl));
                    sb9.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                    sb.append(sb9.toString());
                }
                androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint = outputStream.getStreamUseHint();
                if (streamUseHint != null) {
                    long m636unboximpl = streamUseHint.m636unboximpl();
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder(" [");
                    sb10.append((java.lang.Object) androidx.camera.camera2.pipe.OutputStream.StreamUseHint.m635toStringimpl(m636unboximpl));
                    sb10.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                    sb.append(sb10.toString());
                }
                if (!androidx.camera.camera2.pipe.CameraId.m395equalsimpl0(outputStream.getCamera(), graphConfig.m353getCameraDz_R5H8())) {
                    sb.append(" [");
                    sb.append(androidx.camera.camera2.pipe.CameraId.m392boximpl(outputStream.getCamera()));
                    sb.append("]");
                }
                sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                i++;
            }
        }
        if (!cameraGraph.getStreams().getInputs().isEmpty()) {
            sb.append("Inputs:\n");
            for (androidx.camera.camera2.pipe.InputStream inputStream : cameraGraph.getStreams().getInputs()) {
                sb.append(" ");
                sb.append(kotlin.text.StringsKt.padEnd(androidx.camera.camera2.pipe.InputStreamId.m522toStringimpl(inputStream.getGetHighSpeedVideoFpsRangesFor()), 12, ' '));
                sb.append(kotlin.text.StringsKt.padEnd(androidx.camera.camera2.pipe.StreamFormat.m716toStringimpl(inputStream.getGetHighSpeedVideoFpsRanges()), 12, ' '));
                sb.append(kotlin.text.StringsKt.padEnd(java.lang.String.valueOf(inputStream.getGetHighResolutionOutputSizeshNQ4ISI()), 12, ' '));
                sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            }
        }
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder("Session Template: ");
        sb11.append(androidx.camera.camera2.pipe.RequestTemplate.m683getNameimpl(graphConfig.m358getSessionTemplatefGx8uWA()));
        sb11.append('\n');
        sb.append(sb11.toString());
        Camera2StreamConfigurationMap(sb, "Session Parameters", graphConfig.getSessionParameters());
        java.lang.StringBuilder sb12 = new java.lang.StringBuilder("Default Template: ");
        sb12.append(androidx.camera.camera2.pipe.RequestTemplate.m683getNameimpl(graphConfig.m355getDefaultTemplatefGx8uWA()));
        sb12.append('\n');
        sb.append(sb12.toString());
        Camera2StreamConfigurationMap(sb, "Default Parameters", graphConfig.getDefaultParameters());
        Camera2StreamConfigurationMap(sb, "Required Parameters", graphConfig.getRequiredParameters());
        java.lang.String obj2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    public final <T> T trace(java.lang.String label, kotlin.jvm.functions.Function0<? extends T> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        try {
            android.os.Trace.beginSection(label);
            return block.invoke();
        } finally {
            android.os.Trace.endSection();
        }
    }

    private static java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> Camera2StreamConfigurationMap(java.util.Map<?, ? extends java.lang.Object> p0) {
        java.util.ArrayList arrayList = new java.util.ArrayList(p0.size());
        for (java.util.Map.Entry<?, ? extends java.lang.Object> entry : p0.entrySet()) {
            arrayList.add(kotlin.TuplesKt.to(getHighResolutionOutputSizeshNQ4ISI(entry.getKey()), getHighSpeedVideoFpsRanges(entry.getValue())));
        }
        return kotlin.collections.CollectionsKt.sortedWith(arrayList, new java.util.Comparator() { // from class: androidx.camera.camera2.pipe.core.Debug$parametersToSortedStringPairs$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues((java.lang.String) ((kotlin.Pair) t).getFirst(), (java.lang.String) ((kotlin.Pair) t2).getFirst());
            }
        });
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$8Jcj27A32Q5y6wl50i2jptop8xg(kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.String) pair.getFirst());
        sb.append('=');
        sb.append((java.lang.String) pair.getSecond());
        return sb.toString();
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$qyoCxQw_NlDyB2t4IONaMXi63jI(kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.String) pair.getFirst());
        sb.append('=');
        sb.append((java.lang.String) pair.getSecond());
        return sb.toString();
    }
}
