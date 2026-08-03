package com.facebook.appevents.internal;

/* compiled from: FileDownloadTask.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0012B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u00020\u00042\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\r\"\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/facebook/appevents/internal/FileDownloadTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "", "uriStr", "destFile", "Ljava/io/File;", "onSuccess", "Lcom/facebook/appevents/internal/FileDownloadTask$Callback;", "(Ljava/lang/String;Ljava/io/File;Lcom/facebook/appevents/internal/FileDownloadTask$Callback;)V", "doInBackground", "args", "", "([Ljava/lang/String;)Ljava/lang/Boolean;", "onPostExecute", "", "isSuccess", "Callback", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FileDownloadTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.lang.Boolean> {
    private final java.io.File destFile;
    private final com.facebook.appevents.internal.FileDownloadTask.Callback onSuccess;
    private final java.lang.String uriStr;

    /* compiled from: FileDownloadTask.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/appevents/internal/FileDownloadTask$Callback;", "", "onComplete", "", "file", "Ljava/io/File;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface Callback {
        void onComplete(java.io.File file);
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ java.lang.Boolean doInBackground(java.lang.String[] strArr) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                    return null;
                }
                try {
                    return doInBackground2(strArr);
                } catch (java.lang.Throwable th) {
                    com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                    return null;
                }
            } catch (java.lang.Throwable th2) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th2, this);
                return null;
            }
        } catch (java.lang.Throwable th3) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th3, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(java.lang.Boolean bool) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    onPostExecute(bool.booleanValue());
                } catch (java.lang.Throwable th) {
                    com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                }
            } catch (java.lang.Throwable th2) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th2, this);
            }
        } catch (java.lang.Throwable th3) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th3, this);
        }
    }

    public FileDownloadTask(java.lang.String uriStr, java.io.File destFile, com.facebook.appevents.internal.FileDownloadTask.Callback onSuccess) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uriStr, "uriStr");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destFile, "destFile");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        this.uriStr = uriStr;
        this.destFile = destFile;
        this.onSuccess = onSuccess;
    }

    /* renamed from: doInBackground, reason: avoid collision after fix types in other method */
    public java.lang.Boolean doInBackground2(java.lang.String... args) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                    return null;
                }
                try {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
                    try {
                        java.net.URL url = new java.net.URL(this.uriStr);
                        int contentLength = url.openConnection().getContentLength();
                        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(url.openStream());
                        byte[] bArr = new byte[contentLength];
                        dataInputStream.readFully(bArr);
                        dataInputStream.close();
                        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.FileOutputStream(this.destFile));
                        dataOutputStream.write(bArr);
                        dataOutputStream.flush();
                        dataOutputStream.close();
                        return true;
                    } catch (java.lang.Exception unused) {
                        return false;
                    }
                } catch (java.lang.Throwable th) {
                    com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                    return null;
                }
            } catch (java.lang.Throwable th2) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th2, this);
                return null;
            }
        } catch (java.lang.Throwable th3) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th3, this);
            return null;
        }
    }

    protected void onPostExecute(boolean isSuccess) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (!com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this) && isSuccess) {
                    try {
                        this.onSuccess.onComplete(this.destFile);
                    } catch (java.lang.Throwable th) {
                        com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                    }
                }
            } catch (java.lang.Throwable th2) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th2, this);
            }
        } catch (java.lang.Throwable th3) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th3, this);
        }
    }
}
