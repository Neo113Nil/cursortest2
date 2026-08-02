package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraph$Config;", "graphConfig", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "streamGraph", "", "Landroidx/camera/camera2/pipe/StreamId;", "Landroid/view/Surface;", "surfaces", "Landroidx/camera/camera2/pipe/compat/OutputConfigurations;", "buildOutputConfigurations", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;Ljava/util/Map;)Landroidx/camera/camera2/pipe/compat/OutputConfigurations;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CaptureSessionFactoryKt {
    public static final androidx.camera.camera2.pipe.compat.OutputConfigurations buildOutputConfigurations(androidx.camera.camera2.pipe.CameraGraph.Config config, androidx.camera.camera2.pipe.graph.StreamGraphImpl streamGraphImpl, java.util.Map<androidx.camera.camera2.pipe.StreamId, ? extends android.view.Surface> map) {
        androidx.camera.camera2.pipe.OutputStream.TimestampBase timestampBase;
        androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper m772creategWWoySg;
        androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper m772creategWWoySg2;
        android.view.Surface surface;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamGraphImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<androidx.camera.camera2.pipe.StreamId, androidx.camera.camera2.pipe.media.ImageSource> entry : streamGraphImpl.getImageSourceMap$camera_camera2_pipe().entrySet()) {
            int m761unboximpl = entry.getKey().m761unboximpl();
            androidx.camera.camera2.pipe.media.ImageSource value = entry.getValue();
            androidx.camera.camera2.pipe.CameraStream cameraStream = streamGraphImpl.m748getaKI5c8E(m761unboximpl);
            if (cameraStream == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            java.util.List<androidx.camera.camera2.pipe.OutputStream> outputs = cameraStream.getOutputs();
            if (outputs.size() != 1) {
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    java.lang.Object unwrapAs = value.unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.camera.camera2.pipe.media.AndroidMultiResolutionImageReader.class));
                    if (unwrapAs == null) {
                        throw new java.lang.IllegalStateException("Required value was null.".toString());
                    }
                    java.util.List<android.hardware.camera2.params.OutputConfiguration> outputConfigurations$camera_camera2_pipe = ((androidx.camera.camera2.pipe.media.AndroidMultiResolutionImageReader) unwrapAs).getOutputConfigurations$camera_camera2_pipe();
                    if (outputConfigurations$camera_camera2_pipe.size() != outputs.size()) {
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                    int size = outputs.size();
                    for (int i = 0; i < size; i++) {
                        androidx.camera.camera2.pipe.OutputStream outputStream = outputs.get(i);
                        android.hardware.camera2.params.OutputConfiguration outputConfiguration = outputConfigurations$camera_camera2_pipe.get(i);
                        androidx.camera.camera2.pipe.graph.StreamGraphImpl.OutputConfig outputConfig = streamGraphImpl.getOutputConfigMap$camera_camera2_pipe().get(outputStream);
                        if (outputConfig == null) {
                            throw new java.lang.IllegalStateException("Required value was null.".toString());
                        }
                        androidx.camera.camera2.pipe.graph.StreamGraphImpl.OutputConfig outputConfig2 = outputConfig;
                        if (outputConfig2.getExternalOutputConfig() != null) {
                            throw new java.lang.IllegalStateException("External OutputConfiguration shouldn't be set in multi-output streams configured with ImageSource.Config".toString());
                        }
                        linkedHashMap3.put(outputConfig2, outputConfiguration);
                    }
                } else {
                    throw new java.lang.IllegalArgumentException("Cannot configure multiple outputs pre-S!");
                }
            }
        }
        for (androidx.camera.camera2.pipe.CameraStream cameraStream2 : streamGraphImpl.getStreams()) {
            java.util.List<androidx.camera.camera2.pipe.OutputStream> outputs2 = cameraStream2.getOutputs();
            if (outputs2.size() == 1) {
                android.view.Surface surface2 = map.get(androidx.camera.camera2.pipe.StreamId.m755boximpl(cameraStream2.getId()));
                if (surface2 != null) {
                    linkedHashMap2.put(androidx.camera.camera2.pipe.OutputId.m536boximpl(((androidx.camera.camera2.pipe.OutputStream) kotlin.collections.CollectionsKt.single((java.util.List) outputs2)).getId()), surface2);
                }
            } else {
                for (androidx.camera.camera2.pipe.OutputStream outputStream2 : outputs2) {
                    androidx.camera.camera2.pipe.graph.StreamGraphImpl.OutputConfig outputConfig3 = streamGraphImpl.getOutputConfigMap$camera_camera2_pipe().get(outputStream2);
                    if (outputConfig3 == null) {
                        throw new java.lang.IllegalStateException("Required value was null.".toString());
                    }
                    androidx.camera.camera2.pipe.graph.StreamGraphImpl.OutputConfig outputConfig4 = outputConfig3;
                    android.hardware.camera2.params.OutputConfiguration externalOutputConfig = outputConfig4.getExternalOutputConfig();
                    if (externalOutputConfig == null) {
                        externalOutputConfig = (android.hardware.camera2.params.OutputConfiguration) linkedHashMap3.get(outputConfig4);
                    }
                    if (externalOutputConfig != null) {
                        surface = externalOutputConfig.getSurface();
                    } else {
                        surface = map.get(androidx.camera.camera2.pipe.StreamId.m755boximpl(cameraStream2.getId()));
                    }
                    if (surface != null) {
                        linkedHashMap2.put(androidx.camera.camera2.pipe.OutputId.m536boximpl(outputStream2.getId()), surface);
                    }
                }
            }
        }
        androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper outputConfigurationWrapper = null;
        for (androidx.camera.camera2.pipe.graph.StreamGraphImpl.OutputConfig outputConfig5 : streamGraphImpl.getOutputConfigs$camera_camera2_pipe()) {
            java.util.List<androidx.camera.camera2.pipe.CameraStream> streams = outputConfig5.getStreams();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it = streams.iterator();
            while (it.hasNext()) {
                android.view.Surface surface3 = map.get(androidx.camera.camera2.pipe.StreamId.m755boximpl(((androidx.camera.camera2.pipe.CameraStream) it.next()).getId()));
                if (surface3 != null) {
                    arrayList2.add(surface3);
                }
            }
            java.util.ArrayList arrayList3 = arrayList2;
            android.hardware.camera2.params.OutputConfiguration externalOutputConfig2 = outputConfig5.getExternalOutputConfig();
            if (externalOutputConfig2 == null) {
                externalOutputConfig2 = (android.hardware.camera2.params.OutputConfiguration) linkedHashMap3.get(outputConfig5);
            }
            android.hardware.camera2.params.OutputConfiguration outputConfiguration2 = externalOutputConfig2;
            if (outputConfiguration2 != null) {
                if (arrayList3.size() != outputConfig5.getStreams().size()) {
                    java.util.List<androidx.camera.camera2.pipe.CameraStream> streams2 = outputConfig5.getStreams();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    for (java.lang.Object obj : streams2) {
                        if (!map.containsKey(androidx.camera.camera2.pipe.StreamId.m755boximpl(((androidx.camera.camera2.pipe.CameraStream) obj).getId()))) {
                            arrayList4.add(obj);
                        }
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Surfaces are not yet available for ");
                    sb.append(outputConfig5);
                    sb.append("! Missing surfaces for ");
                    sb.append(arrayList4);
                    sb.append('!');
                    throw new java.lang.IllegalStateException(sb.toString().toString());
                }
                arrayList.add(new androidx.camera.camera2.pipe.compat.AndroidOutputConfiguration(outputConfiguration2, false, 1, null, null));
            } else if (outputConfig5.getDeferrable() && arrayList3.size() != outputConfig5.getStreams().size()) {
                androidx.camera.camera2.pipe.compat.AndroidOutputConfiguration.Companion companion = androidx.camera.camera2.pipe.compat.AndroidOutputConfiguration.INSTANCE;
                android.util.Size size2 = outputConfig5.getSize();
                androidx.camera.camera2.pipe.OutputStream.OutputType deferredOutputType = outputConfig5.getDeferredOutputType();
                kotlin.jvm.internal.Intrinsics.checkNotNull(deferredOutputType);
                androidx.camera.camera2.pipe.OutputStream.MirrorMode mirrorMode = outputConfig5.getMirrorMode();
                androidx.camera.camera2.pipe.OutputStream.TimestampBase timestampBase2 = outputConfig5.getTimestampBase();
                androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile dynamicRangeProfile = outputConfig5.getDynamicRangeProfile();
                androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase = outputConfig5.getStreamUseCase();
                java.util.List<androidx.camera.camera2.pipe.OutputStream.SensorPixelMode> sensorPixelModes = outputConfig5.getSensorPixelModes();
                boolean surfaceSharing = outputConfig5.getSurfaceSharing();
                java.lang.Integer groupNumber = outputConfig5.getGroupNumber();
                m772creategWWoySg2 = companion.m772creategWWoySg(null, (r25 & 2) != 0 ? null : null, (r25 & 4) != 0 ? androidx.camera.camera2.pipe.OutputStream.OutputType.INSTANCE.getSURFACE() : deferredOutputType, (r25 & 8) != 0 ? null : mirrorMode, (r25 & 16) != 0 ? null : timestampBase2, (r25 & 32) != 0 ? null : dynamicRangeProfile, (r25 & 64) != 0 ? null : streamUseCase, (r25 & 128) != 0 ? kotlin.collections.CollectionsKt.emptyList() : sensorPixelModes, (r25 & 256) != 0 ? null : size2, (r25 & 512) != 0 ? false : surfaceSharing, (r25 & 1024) != 0 ? -1 : groupNumber != null ? groupNumber.intValue() : -1, (r25 & 2048) == 0 ? !androidx.camera.camera2.pipe.CameraId.m395equalsimpl0(outputConfig5.getCamera(), config.m353getCameraDz_R5H8()) ? outputConfig5.getCamera() : null : null);
                if (m772creategWWoySg2 != null) {
                    arrayList.add(m772creategWWoySg2);
                    java.util.Iterator<androidx.camera.camera2.pipe.CameraStream> it2 = outputConfig5.getStreamBuilder$camera_camera2_pipe().iterator();
                    while (it2.hasNext()) {
                        linkedHashMap.put(androidx.camera.camera2.pipe.StreamId.m755boximpl(it2.next().getId()), m772creategWWoySg2);
                    }
                } else {
                    androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
                }
            } else {
                if (arrayList3.size() != outputConfig5.getStreams().size()) {
                    java.util.List<androidx.camera.camera2.pipe.CameraStream> streams3 = outputConfig5.getStreams();
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : streams3) {
                        if (!map.containsKey(androidx.camera.camera2.pipe.StreamId.m755boximpl(((androidx.camera.camera2.pipe.CameraStream) obj2).getId()))) {
                            arrayList5.add(obj2);
                        }
                    }
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Surfaces are not yet available for ");
                    sb2.append(outputConfig5);
                    sb2.append("! Missing surfaces for ");
                    sb2.append(arrayList5);
                    sb2.append('!');
                    throw new java.lang.IllegalStateException(sb2.toString().toString());
                }
                androidx.camera.camera2.pipe.compat.AndroidOutputConfiguration.Companion companion2 = androidx.camera.camera2.pipe.compat.AndroidOutputConfiguration.INSTANCE;
                android.view.Surface surface4 = (android.view.Surface) kotlin.collections.CollectionsKt.first((java.util.List) arrayList3);
                androidx.camera.camera2.pipe.OutputStream.MirrorMode mirrorMode2 = outputConfig5.getMirrorMode();
                timestampBase = outputConfig5.getTimestampBase();
                androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile dynamicRangeProfile2 = outputConfig5.getDynamicRangeProfile();
                androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase2 = outputConfig5.getStreamUseCase();
                java.util.List<androidx.camera.camera2.pipe.OutputStream.SensorPixelMode> sensorPixelModes2 = outputConfig5.getSensorPixelModes();
                android.util.Size size3 = outputConfig5.getSize();
                boolean surfaceSharing2 = outputConfig5.getSurfaceSharing();
                java.lang.Integer groupNumber2 = outputConfig5.getGroupNumber();
                m772creategWWoySg = companion2.m772creategWWoySg(surface4, (r25 & 2) != 0 ? null : null, (r25 & 4) != 0 ? androidx.camera.camera2.pipe.OutputStream.OutputType.INSTANCE.getSURFACE() : null, (r25 & 8) != 0 ? null : mirrorMode2, (r25 & 16) != 0 ? null : timestampBase, (r25 & 32) != 0 ? null : dynamicRangeProfile2, (r25 & 64) != 0 ? null : streamUseCase2, (r25 & 128) != 0 ? kotlin.collections.CollectionsKt.emptyList() : sensorPixelModes2, (r25 & 256) != 0 ? null : size3, (r25 & 512) != 0 ? false : surfaceSharing2, (r25 & 1024) != 0 ? -1 : groupNumber2 != null ? groupNumber2.intValue() : -1, (r25 & 2048) == 0 ? !androidx.camera.camera2.pipe.CameraId.m395equalsimpl0(outputConfig5.getCamera(), config.m353getCameraDz_R5H8()) ? outputConfig5.getCamera() : null : null);
                if (m772creategWWoySg != null) {
                    java.util.Iterator it3 = kotlin.collections.CollectionsKt.drop(arrayList3, 1).iterator();
                    while (it3.hasNext()) {
                        m772creategWWoySg.addSurface((android.view.Surface) it3.next());
                    }
                    if (config.getPostviewStream() != null) {
                        androidx.camera.camera2.pipe.CameraStream cameraStream3 = streamGraphImpl.get(config.getPostviewStream());
                        if (cameraStream3 == null) {
                            throw new java.lang.IllegalStateException("Postview Stream in StreamGraph cannot be null for reprocessing request".toString());
                        }
                        if (outputConfigurationWrapper == null && outputConfig5.getStreams().contains(cameraStream3)) {
                            outputConfigurationWrapper = m772creategWWoySg;
                        } else {
                            arrayList.add(m772creategWWoySg);
                        }
                    } else {
                        arrayList.add(m772creategWWoySg);
                    }
                } else {
                    androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
                }
            }
        }
        return new androidx.camera.camera2.pipe.compat.OutputConfigurations(arrayList, linkedHashMap, outputConfigurationWrapper, linkedHashMap2);
    }

    public static final /* synthetic */ java.util.Map access$buildSimpleOutputSurfaceMap(java.util.Map map, androidx.camera.camera2.pipe.graph.StreamGraphImpl streamGraphImpl) {
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        for (androidx.camera.camera2.pipe.CameraStream cameraStream : streamGraphImpl.getStreams()) {
            android.view.Surface surface = (android.view.Surface) map.get(androidx.camera.camera2.pipe.StreamId.m755boximpl(cameraStream.getId()));
            if (surface != null) {
                java.util.Iterator<androidx.camera.camera2.pipe.OutputStream> it = cameraStream.getOutputs().iterator();
                while (it.hasNext()) {
                    createMapBuilder.put(androidx.camera.camera2.pipe.OutputId.m536boximpl(it.next().getId()), surface);
                }
            }
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }
}
