package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lIllIlIlIl {
    public final com.microblink.blinkid.secured.IlIlIlllIl IlIllIlIIl;
    public int IllIIIIllI;
    public android.util.Size IllIIIllII;
    public android.util.Size llIIIlllll;
    public android.hardware.camera2.CameraCharacteristics llIIlIlIIl;

    public lIllIlIlIl(com.microblink.blinkid.secured.IlIlIlllIl ilIlIlllIl) {
        this.IlIllIlIIl = ilIlIlllIl;
    }

    public final void llIIlIlIIl(android.hardware.camera2.CameraCharacteristics cameraCharacteristics, com.microblink.blinkid.secured.lIIlllIIlI liillliili) {
        com.microblink.blinkid.secured.IllllIIIIl IlIllIlIIl;
        android.util.Size size;
        this.llIIlIlIIl = cameraCharacteristics;
        com.microblink.blinkid.hardware.camera.VideoResolutionPreset videoResolutionPreset = liillliili.llIIlIlIIl;
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            throw new java.lang.RuntimeException("Unable to obtain scaler stream configuration map. This is a bug in device!");
        }
        for (int i : streamConfigurationMap.getOutputFormats()) {
            if (i == 35) {
                android.util.Size[] outputSizes = streamConfigurationMap.getOutputSizes(35);
                if (videoResolutionPreset == com.microblink.blinkid.hardware.camera.VideoResolutionPreset.VIDEO_RESOLUTION_MAX_AVAILABLE) {
                    size = llIIlIlIIl(35);
                } else {
                    android.util.Size size2 = outputSizes[0];
                    java.lang.Integer num = (java.lang.Integer) this.llIIlIlIIl.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
                    com.microblink.blinkid.secured.IIIllIIlIl iIIllIIlIl = null;
                    if (num != null && num.intValue() == 1) {
                        com.microblink.blinkid.secured.IllllIIIIl IlIllIlIIl2 = this.IlIllIlIIl.IlIllIlIIl();
                        if (IlIllIlIIl2 != null) {
                            iIIllIIlIl = IlIllIlIIl2.IllIIIllII;
                        }
                    } else if (num != null && num.intValue() == 0 && (IlIllIlIIl = this.IlIllIlIIl.IlIllIlIIl()) != null) {
                        iIIllIIlIl = IlIllIlIIl.llIIIlllll;
                    }
                    com.microblink.blinkid.hardware.camera.VideoResolutionPreset videoResolutionPreset2 = com.microblink.blinkid.hardware.camera.VideoResolutionPreset.VIDEO_RESOLUTION_DEFAULT;
                    if (videoResolutionPreset != videoResolutionPreset2 || iIIllIIlIl == null) {
                        android.view.Display defaultDisplay = ((android.view.WindowManager) this.IlIllIlIIl.IlIllIlIIl.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME)).getDefaultDisplay();
                        android.graphics.Point point = new android.graphics.Point();
                        defaultDisplay.getSize(point);
                        int max = java.lang.Math.max(point.x, point.y);
                        int min = java.lang.Math.min(point.x, point.y);
                        double d = videoResolutionPreset == videoResolutionPreset2 ? max / min : 1.7777777777777777d;
                        com.microblink.blinkid.util.Log.i(this, "Expected camera frame aspect ratio is {}", java.lang.Double.valueOf(d));
                        int idealHeight = videoResolutionPreset.getIdealHeight();
                        long round = java.lang.Math.round(idealHeight * d);
                        com.microblink.blinkid.util.Log.i(this, "Attempting to choose resolution most similar to {}x{} (screen is {}x{})", java.lang.Long.valueOf(round), java.lang.Integer.valueOf(idealHeight), java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(min));
                        long j = round * idealHeight;
                        double llIIlIlIIl = llIIlIlIIl(size2, d, j);
                        for (int i2 = 1; i2 < outputSizes.length; i2++) {
                            com.microblink.blinkid.util.Log.d(this, "Available preview size is {}", outputSizes[i2]);
                            double llIIlIlIIl2 = llIIlIlIIl(outputSizes[i2], d, j);
                            com.microblink.blinkid.util.Log.v(this, "Compatibility for size {} is {}", outputSizes[i2], java.lang.Double.valueOf(llIIlIlIIl2));
                            if (llIIlIlIIl2 < llIIlIlIIl) {
                                size2 = outputSizes[i2];
                                llIIlIlIIl = llIIlIlIIl2;
                            }
                        }
                        size = size2;
                    } else {
                        android.util.Size size3 = new android.util.Size(iIIllIIlIl.llIIlIlIIl, iIIllIIlIl.IlIllIlIIl);
                        com.microblink.blinkid.util.Log.i(this, "This device will use special preview size because normal default appears to be buggy", size3);
                        size = size3;
                    }
                }
                com.microblink.blinkid.util.Log.i(this, "For preset {}, selected preview size is {}", videoResolutionPreset, size);
                com.microblink.blinkid.util.Log.i(this, "Output stall duration is {}", java.lang.Long.valueOf(streamConfigurationMap.getOutputStallDuration(35, size)));
                com.microblink.blinkid.util.Log.i(this, "Output min frame duration is {}", java.lang.Long.valueOf(streamConfigurationMap.getOutputMinFrameDuration(35, size)));
                this.IllIIIllII = size;
                android.util.Size llIIlIlIIl3 = llIIlIlIIl(35);
                android.util.Size llIIlIlIIl4 = llIIlIlIIl(256);
                if (llIIlIlIIl3.getHeight() * llIIlIlIIl3.getWidth() >= llIIlIlIIl4.getHeight() * llIIlIlIIl4.getWidth()) {
                    this.IllIIIIllI = 35;
                } else {
                    this.IllIIIIllI = 256;
                    llIIlIlIIl3 = llIIlIlIIl4;
                }
                this.llIIIlllll = llIIlIlIIl3;
                return;
            }
        }
        throw new java.lang.RuntimeException("Expected preview format not supported!");
    }

    public final com.microblink.blinkid.secured.lIllIIIlll llIIlIlIIl() {
        android.util.Size size = this.IllIIIllII;
        if (size == null) {
            return null;
        }
        return new com.microblink.blinkid.secured.lIllIIIlll(size.getWidth(), this.IllIIIllII.getHeight());
    }

    public final android.util.Size llIIlIlIIl(int i) {
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) this.llIIlIlIIl.get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            for (int i2 : streamConfigurationMap.getOutputFormats()) {
                if (i2 == i) {
                    android.util.Size[] outputSizes = streamConfigurationMap.getOutputSizes(i);
                    android.util.Size size = outputSizes[0];
                    int width = size.getWidth() * size.getHeight();
                    for (int i3 = 1; i3 < outputSizes.length; i3++) {
                        int height = outputSizes[i3].getHeight() * outputSizes[i3].getWidth();
                        if (height > width) {
                            size = outputSizes[i3];
                            width = height;
                        }
                    }
                    return size;
                }
            }
            throw new java.lang.RuntimeException("Expected preview format not supported!");
        }
        throw new java.lang.RuntimeException("Unable to obtain scaler stream configuration map. This is a bug in device!");
    }

    public static double llIIlIlIIl(android.util.Size size, double d, long j) {
        if (size.getWidth() * size.getHeight() <= 230400) {
            return Double.POSITIVE_INFINITY;
        }
        return (java.lang.Math.abs((size.getWidth() / size.getHeight()) - d) * 1100.0d) + (java.lang.Math.abs(((size.getWidth() * size.getHeight()) / j) - 1.0d) * 1200.0d);
    }
}
