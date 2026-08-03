package androidx.profileinstaller;

/* loaded from: classes2.dex */
public final class ProfileVerifier {
    private static final java.lang.String CUR_PROFILES_BASE_DIR = "/data/misc/profiles/cur/0/";
    private static final java.lang.String PROFILE_FILE_NAME = "primary.prof";
    private static final java.lang.String PROFILE_INSTALLED_CACHE_FILE_NAME = "profileInstalled";
    private static final java.lang.String REF_PROFILES_BASE_DIR = "/data/misc/profiles/ref/";
    private static final java.lang.String TAG = "ProfileVerifier";
    private static final androidx.concurrent.futures.ResolvableFuture<androidx.profileinstaller.ProfileVerifier.CompilationStatus> sFuture = androidx.concurrent.futures.ResolvableFuture.create();
    private static final java.lang.Object SYNC_OBJ = new java.lang.Object();
    private static androidx.profileinstaller.ProfileVerifier.CompilationStatus sCompilationStatus = null;

    private ProfileVerifier() {
    }

    public static androidx.profileinstaller.ProfileVerifier.CompilationStatus writeProfileVerification(android.content.Context context) {
        return writeProfileVerification(context, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:14|(1:78)(1:18)|19|(1:77)(1:23)|24|25|26|(2:63|64)(1:28)|29|(8:36|(1:40)|(1:47)|48|(2:55|56)|52|53|54)|(1:62)|(1:40)|(3:42|45|47)|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cf, code lost:
    
        r3 = androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a0, code lost:
    
        r3 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static androidx.profileinstaller.ProfileVerifier.CompilationStatus writeProfileVerification(android.content.Context context, boolean z) {
        androidx.profileinstaller.ProfileVerifier.Cache readFromFile;
        androidx.profileinstaller.ProfileVerifier.Cache cache;
        androidx.profileinstaller.ProfileVerifier.CompilationStatus compilationStatus;
        if (!z && (compilationStatus = sCompilationStatus) != null) {
            return compilationStatus;
        }
        synchronized (SYNC_OBJ) {
            if (!z) {
                androidx.profileinstaller.ProfileVerifier.CompilationStatus compilationStatus2 = sCompilationStatus;
                if (compilationStatus2 != null) {
                    return compilationStatus2;
                }
            }
            int i = 0;
            if (android.os.Build.VERSION.SDK_INT >= 28 && android.os.Build.VERSION.SDK_INT != 30) {
                java.io.File file = new java.io.File(new java.io.File(REF_PROFILES_BASE_DIR, context.getPackageName()), PROFILE_FILE_NAME);
                long length = file.length();
                boolean z2 = file.exists() && length > 0;
                java.io.File file2 = new java.io.File(new java.io.File(CUR_PROFILES_BASE_DIR, context.getPackageName()), PROFILE_FILE_NAME);
                long length2 = file2.length();
                boolean z3 = file2.exists() && length2 > 0;
                try {
                    long packageLastUpdateTime = getPackageLastUpdateTime(context);
                    java.io.File file3 = new java.io.File(context.getFilesDir(), PROFILE_INSTALLED_CACHE_FILE_NAME);
                    if (file3.exists()) {
                        try {
                            readFromFile = androidx.profileinstaller.ProfileVerifier.Cache.readFromFile(file3);
                        } catch (java.io.IOException unused) {
                            return setCompilationStatus(131072, z2, z3);
                        }
                    } else {
                        readFromFile = null;
                    }
                    if (readFromFile != null && readFromFile.mPackageLastUpdateTime == packageLastUpdateTime && readFromFile.mResultCode != 2) {
                        i = readFromFile.mResultCode;
                        if (z && z3 && i != 1) {
                            i = 2;
                        }
                        if (readFromFile != null && readFromFile.mResultCode == 2 && i == 1 && length < readFromFile.mInstalledCurrentProfileSize) {
                            i = 3;
                        }
                        cache = new androidx.profileinstaller.ProfileVerifier.Cache(1, i, packageLastUpdateTime, length2);
                        if (readFromFile != null || !readFromFile.equals(cache)) {
                            cache.writeOnFile(file3);
                        }
                        return setCompilationStatus(i, z2, z3);
                    }
                    if (z3) {
                        i = 2;
                    }
                    if (z) {
                        i = 2;
                    }
                    if (readFromFile != null) {
                        i = 3;
                    }
                    cache = new androidx.profileinstaller.ProfileVerifier.Cache(1, i, packageLastUpdateTime, length2);
                    if (readFromFile != null) {
                    }
                    cache.writeOnFile(file3);
                    return setCompilationStatus(i, z2, z3);
                } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                    return setCompilationStatus(65536, z2, z3);
                }
            }
            return setCompilationStatus(262144, false, false);
        }
    }

    private static androidx.profileinstaller.ProfileVerifier.CompilationStatus setCompilationStatus(int i, boolean z, boolean z2) {
        androidx.profileinstaller.ProfileVerifier.CompilationStatus compilationStatus = new androidx.profileinstaller.ProfileVerifier.CompilationStatus(i, z, z2);
        sCompilationStatus = compilationStatus;
        sFuture.set(compilationStatus);
        return sCompilationStatus;
    }

    private static long getPackageLastUpdateTime(android.content.Context context) throws android.content.pm.PackageManager.NameNotFoundException {
        android.content.pm.PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.profileinstaller.ProfileVerifier.Api33Impl.getPackageInfo(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static com.google.common.util.concurrent.ListenableFuture<androidx.profileinstaller.ProfileVerifier.CompilationStatus> getCompilationStatusAsync() {
        return sFuture;
    }

    static class Cache {
        private static final int SCHEMA = 1;
        final long mInstalledCurrentProfileSize;
        final long mPackageLastUpdateTime;
        final int mResultCode;
        final int mSchema;

        Cache(int i, int i2, long j, long j2) {
            this.mSchema = i;
            this.mResultCode = i2;
            this.mPackageLastUpdateTime = j;
            this.mInstalledCurrentProfileSize = j2;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof androidx.profileinstaller.ProfileVerifier.Cache)) {
                return false;
            }
            androidx.profileinstaller.ProfileVerifier.Cache cache = (androidx.profileinstaller.ProfileVerifier.Cache) obj;
            return this.mResultCode == cache.mResultCode && this.mPackageLastUpdateTime == cache.mPackageLastUpdateTime && this.mSchema == cache.mSchema && this.mInstalledCurrentProfileSize == cache.mInstalledCurrentProfileSize;
        }

        public int hashCode() {
            return java.util.Objects.hash(java.lang.Integer.valueOf(this.mResultCode), java.lang.Long.valueOf(this.mPackageLastUpdateTime), java.lang.Integer.valueOf(this.mSchema), java.lang.Long.valueOf(this.mInstalledCurrentProfileSize));
        }

        void writeOnFile(java.io.File file) throws java.io.IOException {
            file.delete();
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.mSchema);
                dataOutputStream.writeInt(this.mResultCode);
                dataOutputStream.writeLong(this.mPackageLastUpdateTime);
                dataOutputStream.writeLong(this.mInstalledCurrentProfileSize);
                dataOutputStream.close();
            } catch (java.lang.Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        static androidx.profileinstaller.ProfileVerifier.Cache readFromFile(java.io.File file) throws java.io.IOException {
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
        private static final int RESULT_CODE_ERROR_CODE_BIT_SHIFT = 16;
        public static final int RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST = 65536;
        public static final int RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION = 262144;
        public static final int RESULT_CODE_NO_PROFILE = 0;
        public static final int RESULT_CODE_PROFILE_ENQUEUED_FOR_COMPILATION = 2;
        private final boolean mHasCurrentProfile;
        private final boolean mHasReferenceProfile;
        final int mResultCode;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface ResultCode {
        }

        CompilationStatus(int i, boolean z, boolean z2) {
            this.mResultCode = i;
            this.mHasCurrentProfile = z2;
            this.mHasReferenceProfile = z;
        }

        public int getProfileInstallResultCode() {
            return this.mResultCode;
        }

        public boolean isCompiledWithProfile() {
            return this.mHasReferenceProfile;
        }

        public boolean hasProfileEnqueuedForCompilation() {
            return this.mHasCurrentProfile;
        }
    }

    private static class Api33Impl {
        private Api33Impl() {
        }

        static android.content.pm.PackageInfo getPackageInfo(android.content.pm.PackageManager packageManager, android.content.Context context) throws android.content.pm.PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), android.content.pm.PackageManager.PackageInfoFlags.of(0L));
        }
    }
}
