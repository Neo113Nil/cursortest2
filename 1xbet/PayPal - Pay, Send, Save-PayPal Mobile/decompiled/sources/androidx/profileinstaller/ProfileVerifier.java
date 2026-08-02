package androidx.profileinstaller;

/* loaded from: classes7.dex */
public final class ProfileVerifier {
    private static final androidx.concurrent.futures.ResolvableFuture<androidx.profileinstaller.ProfileVerifier.CompilationStatus> Camera2StreamConfigurationMap = androidx.concurrent.futures.ResolvableFuture.create();
    private static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
    private static androidx.profileinstaller.ProfileVerifier.CompilationStatus getHighSpeedVideoSizes = null;

    private ProfileVerifier() {
    }

    public static androidx.profileinstaller.ProfileVerifier.CompilationStatus writeProfileVerification(android.content.Context context) {
        return Camera2StreamConfigurationMap(context, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:35|36|(1:38)(1:98)|39|40|(2:92|93)(1:42)|43|(7:(8:50|(1:54)|(1:61)|62|(5:69|70|71|72|73)|66|67|68)|71|72|73|66|67|68)|(1:89)(1:(1:91))|(1:54)|(3:56|59|61)|62|(1:64)|69|70) */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0159, code lost:
    
        r5 = androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f8, code lost:
    
        r5 = androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_NO_PROFILE_EMBEDDED;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static androidx.profileinstaller.ProfileVerifier.CompilationStatus Camera2StreamConfigurationMap(android.content.Context context, boolean z) {
        boolean z2;
        long j;
        androidx.profileinstaller.ProfileVerifier.Cache Camera2StreamConfigurationMap2;
        androidx.profileinstaller.ProfileVerifier.Cache cache;
        androidx.profileinstaller.ProfileVerifier.CompilationStatus compilationStatus;
        if (!z && (compilationStatus = getHighSpeedVideoSizes) != null) {
            return compilationStatus;
        }
        synchronized (getHighResolutionOutputSizeshNQ4ISI) {
            if (!z) {
                androidx.profileinstaller.ProfileVerifier.CompilationStatus compilationStatus2 = getHighSpeedVideoSizes;
                if (compilationStatus2 != null) {
                    return compilationStatus2;
                }
            }
            int i = 0;
            try {
                android.content.res.AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                try {
                    boolean z3 = openFd.getLength() > 0;
                    if (openFd != null) {
                        openFd.close();
                    }
                    z2 = z3;
                } finally {
                }
            } catch (java.io.IOException unused) {
                z2 = false;
            }
            if (android.os.Build.VERSION.SDK_INT >= 28 && android.os.Build.VERSION.SDK_INT != 30) {
                java.io.File file = new java.io.File(new java.io.File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                boolean z4 = file.exists() && length > 0;
                java.io.File file2 = new java.io.File(new java.io.File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z5 = file2.exists() && length2 > 0;
                try {
                    android.content.pm.PackageManager packageManager = context.getApplicationContext().getPackageManager();
                    if (android.os.Build.VERSION.SDK_INT >= 33) {
                        j = androidx.profileinstaller.ProfileVerifier.Api33Impl.Camera2StreamConfigurationMap(packageManager, context).lastUpdateTime;
                    } else {
                        j = packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
                    }
                    long j2 = j;
                    java.io.File file3 = new java.io.File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            Camera2StreamConfigurationMap2 = androidx.profileinstaller.ProfileVerifier.Cache.Camera2StreamConfigurationMap(file3);
                        } catch (java.io.IOException unused2) {
                            androidx.profileinstaller.ProfileVerifier.CompilationStatus compilationStatus3 = new androidx.profileinstaller.ProfileVerifier.CompilationStatus(131072, z4, z5, z2);
                            getHighSpeedVideoSizes = compilationStatus3;
                            Camera2StreamConfigurationMap.set(compilationStatus3);
                            return getHighSpeedVideoSizes;
                        }
                    } else {
                        Camera2StreamConfigurationMap2 = null;
                    }
                    try {
                        if (Camera2StreamConfigurationMap2 != null && Camera2StreamConfigurationMap2.getHighSpeedVideoSizes == j2 && Camera2StreamConfigurationMap2.getHighResolutionOutputSizeshNQ4ISI != 2) {
                            i = Camera2StreamConfigurationMap2.getHighResolutionOutputSizeshNQ4ISI;
                            if (z && z5 && i != 1) {
                                i = 2;
                            }
                            if (Camera2StreamConfigurationMap2 != null && Camera2StreamConfigurationMap2.getHighResolutionOutputSizeshNQ4ISI == 2 && i == 1 && length < Camera2StreamConfigurationMap2.getHighSpeedVideoFpsRangesFor) {
                                i = 3;
                            }
                            cache = new androidx.profileinstaller.ProfileVerifier.Cache(1, i, j2, length2);
                            if (Camera2StreamConfigurationMap2 != null || !Camera2StreamConfigurationMap2.equals(cache)) {
                                file3.delete();
                                java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.FileOutputStream(file3));
                                dataOutputStream.writeInt(cache.getHighSpeedVideoFpsRanges);
                                dataOutputStream.writeInt(cache.getHighResolutionOutputSizeshNQ4ISI);
                                dataOutputStream.writeLong(cache.getHighSpeedVideoSizes);
                                dataOutputStream.writeLong(cache.getHighSpeedVideoFpsRangesFor);
                                dataOutputStream.close();
                            }
                            androidx.profileinstaller.ProfileVerifier.CompilationStatus compilationStatus4 = new androidx.profileinstaller.ProfileVerifier.CompilationStatus(i, z4, z5, z2);
                            getHighSpeedVideoSizes = compilationStatus4;
                            Camera2StreamConfigurationMap.set(compilationStatus4);
                            return getHighSpeedVideoSizes;
                        }
                        dataOutputStream.writeInt(cache.getHighSpeedVideoFpsRanges);
                        dataOutputStream.writeInt(cache.getHighResolutionOutputSizeshNQ4ISI);
                        dataOutputStream.writeLong(cache.getHighSpeedVideoSizes);
                        dataOutputStream.writeLong(cache.getHighSpeedVideoFpsRangesFor);
                        dataOutputStream.close();
                        androidx.profileinstaller.ProfileVerifier.CompilationStatus compilationStatus42 = new androidx.profileinstaller.ProfileVerifier.CompilationStatus(i, z4, z5, z2);
                        getHighSpeedVideoSizes = compilationStatus42;
                        Camera2StreamConfigurationMap.set(compilationStatus42);
                        return getHighSpeedVideoSizes;
                    } finally {
                    }
                    if (z4) {
                        i = 1;
                    } else if (z5) {
                        i = 2;
                    }
                    if (z) {
                        i = 2;
                    }
                    if (Camera2StreamConfigurationMap2 != null) {
                        i = 3;
                    }
                    cache = new androidx.profileinstaller.ProfileVerifier.Cache(1, i, j2, length2);
                    if (Camera2StreamConfigurationMap2 != null) {
                    }
                    file3.delete();
                    java.io.DataOutputStream dataOutputStream2 = new java.io.DataOutputStream(new java.io.FileOutputStream(file3));
                } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
                    androidx.profileinstaller.ProfileVerifier.CompilationStatus compilationStatus5 = new androidx.profileinstaller.ProfileVerifier.CompilationStatus(65536, z4, z5, z2);
                    getHighSpeedVideoSizes = compilationStatus5;
                    Camera2StreamConfigurationMap.set(compilationStatus5);
                    return getHighSpeedVideoSizes;
                }
            }
            androidx.profileinstaller.ProfileVerifier.CompilationStatus compilationStatus6 = new androidx.profileinstaller.ProfileVerifier.CompilationStatus(262144, false, false, z2);
            getHighSpeedVideoSizes = compilationStatus6;
            Camera2StreamConfigurationMap.set(compilationStatus6);
            return getHighSpeedVideoSizes;
        }
    }

    public static com.google.common.util.concurrent.ListenableFuture<androidx.profileinstaller.ProfileVerifier.CompilationStatus> getCompilationStatusAsync() {
        return Camera2StreamConfigurationMap;
    }

    static class Cache {
        final int getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        final long getHighSpeedVideoFpsRangesFor;
        final long getHighSpeedVideoSizes;

        Cache(int i, int i2, long j, long j2) {
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
            this.getHighSpeedVideoSizes = j;
            this.getHighSpeedVideoFpsRangesFor = j2;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof androidx.profileinstaller.ProfileVerifier.Cache)) {
                return false;
            }
            androidx.profileinstaller.ProfileVerifier.Cache cache = (androidx.profileinstaller.ProfileVerifier.Cache) obj;
            return this.getHighResolutionOutputSizeshNQ4ISI == cache.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoSizes == cache.getHighSpeedVideoSizes && this.getHighSpeedVideoFpsRanges == cache.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoFpsRangesFor == cache.getHighSpeedVideoFpsRangesFor;
        }

        public int hashCode() {
            return java.util.Objects.hash(java.lang.Integer.valueOf(this.getHighResolutionOutputSizeshNQ4ISI), java.lang.Long.valueOf(this.getHighSpeedVideoSizes), java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRanges), java.lang.Long.valueOf(this.getHighSpeedVideoFpsRangesFor));
        }

        static androidx.profileinstaller.ProfileVerifier.Cache Camera2StreamConfigurationMap(java.io.File file) throws java.io.IOException {
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(file));
            try {
                androidx.profileinstaller.ProfileVerifier.Cache cache = new androidx.profileinstaller.ProfileVerifier.Cache(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return cache;
            } catch (java.lang.Throwable th) {
                try {
                    dataInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static class CompilationStatus {
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE = 1;
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE_NON_MATCHING = 3;
        public static final int RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ = 131072;
        public static final int RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE = 196608;
        public static final int RESULT_CODE_ERROR_NO_PROFILE_EMBEDDED = 327680;
        public static final int RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST = 65536;
        public static final int RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION = 262144;

        @java.lang.Deprecated
        public static final int RESULT_CODE_NO_PROFILE = 0;
        public static final int RESULT_CODE_NO_PROFILE_INSTALLED = 0;
        public static final int RESULT_CODE_PROFILE_ENQUEUED_FOR_COMPILATION = 2;
        private final boolean Camera2StreamConfigurationMap;
        private final boolean getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        private final boolean getHighSpeedVideoSizes;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface ResultCode {
        }

        CompilationStatus(int i, boolean z, boolean z2, boolean z3) {
            this.getHighSpeedVideoFpsRanges = i;
            this.Camera2StreamConfigurationMap = z2;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            this.getHighSpeedVideoSizes = z3;
        }

        public int getProfileInstallResultCode() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public boolean isCompiledWithProfile() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public boolean hasProfileEnqueuedForCompilation() {
            return this.Camera2StreamConfigurationMap;
        }

        public boolean appApkHasEmbeddedProfile() {
            return this.getHighSpeedVideoSizes;
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static android.content.pm.PackageInfo Camera2StreamConfigurationMap(android.content.pm.PackageManager packageManager, android.content.Context context) throws android.content.pm.PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), android.content.pm.PackageManager.PackageInfoFlags.of(0L));
        }
    }
}
