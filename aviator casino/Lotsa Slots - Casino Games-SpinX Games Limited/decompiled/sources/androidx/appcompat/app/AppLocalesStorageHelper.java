package androidx.appcompat.app;

/* loaded from: classes.dex */
class AppLocalesStorageHelper {
    static final java.lang.String APPLICATION_LOCALES_RECORD_FILE = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";
    static final java.lang.String APP_LOCALES_META_DATA_HOLDER_SERVICE_NAME = "androidx.appcompat.app.AppLocalesMetadataHolderService";
    static final java.lang.String LOCALE_RECORD_ATTRIBUTE_TAG = "application_locales";
    static final java.lang.String LOCALE_RECORD_FILE_TAG = "locales";
    static final java.lang.String TAG = "AppLocalesStorageHelper";

    private AppLocalesStorageHelper() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r3 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0039, code lost:
    
        r2 = r4.getAttributeValue(null, androidx.appcompat.app.AppLocalesStorageHelper.LOCALE_RECORD_ATTRIBUTE_TAG);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004f, code lost:
    
        if (r3 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static java.lang.String readLocales(android.content.Context context) {
        java.io.FileInputStream openFileInput;
        java.lang.String str = "";
        try {
            try {
                openFileInput = context.openFileInput(APPLICATION_LOCALES_RECORD_FILE);
                try {
                    org.xmlpull.v1.XmlPullParser newPullParser = android.util.Xml.newPullParser();
                    newPullParser.setInput(openFileInput, "UTF-8");
                    int depth = newPullParser.getDepth();
                    while (true) {
                        int next = newPullParser.next();
                        if (next == 1 || (next == 3 && newPullParser.getDepth() <= depth)) {
                            break;
                        }
                        if (next != 3 && next != 4 && newPullParser.getName().equals(LOCALE_RECORD_FILE_TAG)) {
                            break;
                        }
                    }
                } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
                    android.util.Log.w(TAG, "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                }
                if (!str.isEmpty()) {
                    android.util.Log.d(TAG, "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: " + str);
                } else {
                    context.deleteFile(APPLICATION_LOCALES_RECORD_FILE);
                }
                return str;
            } catch (java.io.FileNotFoundException unused2) {
                android.util.Log.w(TAG, "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return "";
            }
        } catch (java.lang.Throwable th) {
            if (openFileInput != null) {
                try {
                    openFileInput.close();
                } catch (java.io.IOException unused3) {
                }
            }
            throw th;
        }
    }

    static void persistLocales(android.content.Context context, java.lang.String str) {
        if (str.equals("")) {
            context.deleteFile(APPLICATION_LOCALES_RECORD_FILE);
            return;
        }
        try {
            java.io.FileOutputStream openFileOutput = context.openFileOutput(APPLICATION_LOCALES_RECORD_FILE, 0);
            org.xmlpull.v1.XmlSerializer newSerializer = android.util.Xml.newSerializer();
            try {
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument("UTF-8", true);
                    newSerializer.startTag(null, LOCALE_RECORD_FILE_TAG);
                    newSerializer.attribute(null, LOCALE_RECORD_ATTRIBUTE_TAG, str);
                    newSerializer.endTag(null, LOCALE_RECORD_FILE_TAG);
                    newSerializer.endDocument();
                    android.util.Log.d(TAG, "Storing App Locales : app-locales: " + str + " persisted successfully.");
                    if (openFileOutput == null) {
                        return;
                    }
                } catch (java.lang.Exception e) {
                    android.util.Log.w(TAG, "Storing App Locales : Failed to persist app-locales: " + str, e);
                    if (openFileOutput == null) {
                        return;
                    }
                }
                try {
                    openFileOutput.close();
                } catch (java.io.IOException unused) {
                }
            } catch (java.lang.Throwable th) {
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (java.io.IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (java.io.FileNotFoundException unused3) {
            android.util.Log.w(TAG, java.lang.String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", APPLICATION_LOCALES_RECORD_FILE));
        }
    }

    static void syncLocalesToFramework(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            android.content.ComponentName componentName = new android.content.ComponentName(context, APP_LOCALES_META_DATA_HOLDER_SERVICE_NAME);
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (androidx.appcompat.app.AppCompatDelegate.getApplicationLocales().isEmpty()) {
                    java.lang.String readLocales = readLocales(context);
                    java.lang.Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        androidx.appcompat.app.AppCompatDelegate.Api33Impl.localeManagerSetApplicationLocales(systemService, androidx.appcompat.app.AppCompatDelegate.Api24Impl.localeListForLanguageTags(readLocales));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    static class ThreadPerTaskExecutor implements java.util.concurrent.Executor {
        ThreadPerTaskExecutor() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            new java.lang.Thread(runnable).start();
        }
    }

    static class SerialExecutor implements java.util.concurrent.Executor {
        java.lang.Runnable mActive;
        final java.util.concurrent.Executor mExecutor;
        private final java.lang.Object mLock = new java.lang.Object();
        final java.util.Queue<java.lang.Runnable> mTasks = new java.util.ArrayDeque();

        SerialExecutor(java.util.concurrent.Executor executor) {
            this.mExecutor = executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(final java.lang.Runnable runnable) {
            synchronized (this.mLock) {
                this.mTasks.add(new java.lang.Runnable() { // from class: androidx.appcompat.app.AppLocalesStorageHelper$SerialExecutor$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.appcompat.app.AppLocalesStorageHelper.SerialExecutor.this.m5xd188c474(runnable);
                    }
                });
                if (this.mActive == null) {
                    scheduleNext();
                }
            }
        }

        /* renamed from: lambda$execute$0$androidx-appcompat-app-AppLocalesStorageHelper$SerialExecutor, reason: not valid java name */
        /* synthetic */ void m5xd188c474(java.lang.Runnable runnable) {
            try {
                runnable.run();
            } finally {
                scheduleNext();
            }
        }

        protected void scheduleNext() {
            synchronized (this.mLock) {
                java.lang.Runnable poll = this.mTasks.poll();
                this.mActive = poll;
                if (poll != null) {
                    this.mExecutor.execute(poll);
                }
            }
        }
    }
}
