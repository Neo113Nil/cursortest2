package androidx.profileinstaller;

/* loaded from: classes7.dex */
public class DeviceProfileWriter {
    private final java.io.File Camera2StreamConfigurationMap;
    private final android.content.res.AssetManager getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoFpsRanges;
    final androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;
    private androidx.profileinstaller.DexProfileData[] getHighSpeedVideoSizesFor;
    private final java.util.concurrent.Executor getInputFormats;
    private final java.lang.String getInputSizeshNQ4ISI;
    private final java.lang.String getOutputFormats;
    private boolean getOutputMinFrameDuration = false;
    private byte[] getOutputStallDuration;

    public DeviceProfileWriter(android.content.res.AssetManager assetManager, java.util.concurrent.Executor executor, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback diagnosticsCallback, java.lang.String str, java.lang.String str2, java.lang.String str3, java.io.File file) {
        byte[] bArr;
        this.getHighResolutionOutputSizeshNQ4ISI = assetManager;
        this.getInputFormats = executor;
        this.getHighSpeedVideoFpsRangesFor = diagnosticsCallback;
        this.getHighSpeedVideoSizes = str;
        this.getOutputFormats = str2;
        this.getInputSizeshNQ4ISI = str3;
        this.Camera2StreamConfigurationMap = file;
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            bArr = androidx.profileinstaller.ProfileVersion.getOutputFormats;
        } else {
            switch (android.os.Build.VERSION.SDK_INT) {
                case 26:
                    bArr = androidx.profileinstaller.ProfileVersion.getHighSpeedVideoFpsRangesFor;
                    break;
                case 27:
                    bArr = androidx.profileinstaller.ProfileVersion.Camera2StreamConfigurationMap;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = androidx.profileinstaller.ProfileVersion.getInputFormats;
                    break;
                default:
                    bArr = null;
                    break;
            }
        }
        this.getHighSpeedVideoFpsRanges = bArr;
    }

    public boolean deviceAllowsProfileInstallerAotWrites() {
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getInputFormats.execute(new androidx.profileinstaller.DeviceProfileWriter$$ExternalSyntheticLambda0(this, 3, java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT)));
            return false;
        }
        java.lang.Object obj = null;
        int i = 4;
        if (this.Camera2StreamConfigurationMap.exists()) {
            if (!this.Camera2StreamConfigurationMap.canWrite()) {
                this.getInputFormats.execute(new androidx.profileinstaller.DeviceProfileWriter$$ExternalSyntheticLambda0(this, i, obj));
                return false;
            }
        } else {
            try {
                if (!this.Camera2StreamConfigurationMap.createNewFile()) {
                    this.getInputFormats.execute(new androidx.profileinstaller.DeviceProfileWriter$$ExternalSyntheticLambda0(this, i, obj));
                    return false;
                }
            } catch (java.io.IOException unused) {
                this.getInputFormats.execute(new androidx.profileinstaller.DeviceProfileWriter$$ExternalSyntheticLambda0(this, i, obj));
                return false;
            }
        }
        this.getOutputMinFrameDuration = true;
        return true;
    }

    private void getHighSpeedVideoFpsRangesFor() {
        if (!this.getOutputMinFrameDuration) {
            throw new java.lang.IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public androidx.profileinstaller.DeviceProfileWriter read() {
        androidx.profileinstaller.DeviceProfileWriter Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor();
        if (this.getHighSpeedVideoFpsRanges != null) {
            java.io.InputStream highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI);
            if (highSpeedVideoFpsRangesFor != null) {
                this.getHighSpeedVideoSizesFor = Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor);
            }
            androidx.profileinstaller.DexProfileData[] dexProfileDataArr = this.getHighSpeedVideoSizesFor;
            if (dexProfileDataArr != null && android.os.Build.VERSION.SDK_INT >= 31 && (Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(dexProfileDataArr, this.getHighSpeedVideoFpsRanges)) != null) {
                return Camera2StreamConfigurationMap;
            }
        }
        return this;
    }

    private java.io.InputStream getHighResolutionOutputSizeshNQ4ISI(android.content.res.AssetManager assetManager, java.lang.String str) throws java.io.IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (java.io.FileNotFoundException e) {
            java.lang.String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.getHighSpeedVideoFpsRangesFor.onDiagnosticReceived(5, null);
            }
            return null;
        }
    }

    private java.io.InputStream getHighSpeedVideoFpsRangesFor(android.content.res.AssetManager assetManager) {
        try {
            return getHighResolutionOutputSizeshNQ4ISI(assetManager, this.getOutputFormats);
        } catch (java.io.FileNotFoundException e) {
            this.getHighSpeedVideoFpsRangesFor.onResultReceived(6, e);
            return null;
        } catch (java.io.IOException e2) {
            this.getHighSpeedVideoFpsRangesFor.onResultReceived(7, e2);
            return null;
        }
    }

    private androidx.profileinstaller.DexProfileData[] Camera2StreamConfigurationMap(java.io.InputStream inputStream) {
        try {
            try {
                androidx.profileinstaller.DexProfileData[] highResolutionOutputSizeshNQ4ISI = androidx.profileinstaller.ProfileTranscoder.getHighResolutionOutputSizeshNQ4ISI(inputStream, androidx.profileinstaller.ProfileTranscoder.getHighSpeedVideoSizes(inputStream, androidx.profileinstaller.ProfileTranscoder.getHighSpeedVideoFpsRangesFor), this.getHighSpeedVideoSizes);
                try {
                    inputStream.close();
                    return highResolutionOutputSizeshNQ4ISI;
                } catch (java.io.IOException e) {
                    this.getHighSpeedVideoFpsRangesFor.onResultReceived(7, e);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            } finally {
                try {
                    inputStream.close();
                } catch (java.io.IOException e2) {
                    this.getHighSpeedVideoFpsRangesFor.onResultReceived(7, e2);
                }
            }
        } catch (java.io.IOException e3) {
            this.getHighSpeedVideoFpsRangesFor.onResultReceived(7, e3);
            return null;
        } catch (java.lang.IllegalStateException e4) {
            this.getHighSpeedVideoFpsRangesFor.onResultReceived(8, e4);
            return null;
        }
    }

    private androidx.profileinstaller.DeviceProfileWriter Camera2StreamConfigurationMap(androidx.profileinstaller.DexProfileData[] dexProfileDataArr, byte[] bArr) {
        java.io.InputStream highResolutionOutputSizeshNQ4ISI;
        try {
            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI);
        } catch (java.io.FileNotFoundException e) {
            this.getHighSpeedVideoFpsRangesFor.onResultReceived(9, e);
        } catch (java.io.IOException e2) {
            this.getHighSpeedVideoFpsRangesFor.onResultReceived(7, e2);
        } catch (java.lang.IllegalStateException e3) {
            this.getHighSpeedVideoSizesFor = null;
            this.getHighSpeedVideoFpsRangesFor.onResultReceived(8, e3);
        }
        if (highResolutionOutputSizeshNQ4ISI == null) {
            if (highResolutionOutputSizeshNQ4ISI != null) {
                highResolutionOutputSizeshNQ4ISI.close();
            }
            return null;
        }
        try {
            this.getHighSpeedVideoSizesFor = androidx.profileinstaller.ProfileTranscoder.getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI, androidx.profileinstaller.ProfileTranscoder.getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI, androidx.profileinstaller.ProfileTranscoder.getHighSpeedVideoSizes), bArr, dexProfileDataArr);
            if (highResolutionOutputSizeshNQ4ISI != null) {
                highResolutionOutputSizeshNQ4ISI.close();
            }
            return this;
        } catch (java.lang.Throwable th) {
            if (highResolutionOutputSizeshNQ4ISI != null) {
                try {
                    highResolutionOutputSizeshNQ4ISI.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public androidx.profileinstaller.DeviceProfileWriter transcodeIfNeeded() {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        androidx.profileinstaller.DexProfileData[] dexProfileDataArr = this.getHighSpeedVideoSizesFor;
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        if (dexProfileDataArr != null && bArr != null) {
            getHighSpeedVideoFpsRangesFor();
            try {
                byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                try {
                    androidx.profileinstaller.ProfileTranscoder.getHighSpeedVideoSizes(byteArrayOutputStream, bArr);
                } catch (java.lang.Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.io.IOException e) {
                this.getHighSpeedVideoFpsRangesFor.onResultReceived(7, e);
            } catch (java.lang.IllegalStateException e2) {
                this.getHighSpeedVideoFpsRangesFor.onResultReceived(8, e2);
            }
            if (!androidx.profileinstaller.ProfileTranscoder.getHighResolutionOutputSizeshNQ4ISI(byteArrayOutputStream, bArr, dexProfileDataArr)) {
                this.getHighSpeedVideoFpsRangesFor.onResultReceived(5, null);
                this.getHighSpeedVideoSizesFor = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.getOutputStallDuration = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.getHighSpeedVideoSizesFor = null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean write() {
        byte[] bArr = this.getOutputStallDuration;
        if (bArr == null) {
            return false;
        }
        getHighSpeedVideoFpsRangesFor();
        byte[] bArr2 = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        java.lang.Object[] objArr4 = 0;
        try {
            try {
                java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
                try {
                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(this.Camera2StreamConfigurationMap);
                    try {
                        java.nio.channels.FileChannel channel = fileOutputStream.getChannel();
                        try {
                            java.nio.channels.FileLock tryLock = channel.tryLock();
                            try {
                                androidx.profileinstaller.Encoding.getHighSpeedVideoFpsRanges(byteArrayInputStream, fileOutputStream, tryLock);
                                this.getInputFormats.execute(new androidx.profileinstaller.DeviceProfileWriter$$ExternalSyntheticLambda0(this, 1, objArr == true ? 1 : 0));
                                if (tryLock != null) {
                                    tryLock.close();
                                }
                                if (channel != null) {
                                    channel.close();
                                }
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                return true;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.io.FileNotFoundException e) {
                this.getInputFormats.execute(new androidx.profileinstaller.DeviceProfileWriter$$ExternalSyntheticLambda0(this, 6, e));
                return false;
            } catch (java.io.IOException e2) {
                this.getInputFormats.execute(new androidx.profileinstaller.DeviceProfileWriter$$ExternalSyntheticLambda0(this, 7, e2));
                return false;
            }
        } finally {
            this.getOutputStallDuration = null;
            this.getHighSpeedVideoSizesFor = null;
        }
    }
}
