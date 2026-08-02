package com.facebook.appevents.internal;

import android.os.AsyncTask;
import androidx.annotation.VisibleForTesting;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l extends AsyncTask<String, Void, Boolean> {
    public final String a;
    public final File b;
    public final a c;

    public interface a {
        void a(File file);
    }

    public l(String uriStr, File destFile, a onSuccess) {
        Intrinsics.checkNotNullParameter(uriStr, "uriStr");
        Intrinsics.checkNotNullParameter(destFile, "destFile");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        this.a = uriStr;
        this.b = destFile;
        this.c = onSuccess;
    }

    @VisibleForTesting(otherwise = 4)
    public final Boolean a(String... args) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(args, "args");
                try {
                    URL url = new URL(this.a);
                    int contentLength = url.openConnection().getContentLength();
                    DataInputStream dataInputStream = new DataInputStream(url.openStream());
                    byte[] bArr = new byte[contentLength];
                    dataInputStream.readFully(bArr);
                    dataInputStream.close();
                    DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.b));
                    dataOutputStream.write(bArr);
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    return Boolean.TRUE;
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
                return null;
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Boolean doInBackground(String[] strArr) {
        if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
            try {
                if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                    try {
                        return a(strArr);
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, this);
                    }
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.a.a(th2, this);
                return null;
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Boolean bool) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                return;
            }
            try {
                boolean booleanValue = bool.booleanValue();
                if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                    return;
                }
                try {
                    if (!com.facebook.internal.instrument.crashshield.a.b(this) && booleanValue) {
                        try {
                            this.c.a(this.b);
                        } catch (Throwable th) {
                            com.facebook.internal.instrument.crashshield.a.a(th, this);
                        }
                    }
                } catch (Throwable th2) {
                    com.facebook.internal.instrument.crashshield.a.a(th2, this);
                }
            } catch (Throwable th3) {
                com.facebook.internal.instrument.crashshield.a.a(th3, this);
            }
        } catch (Throwable th4) {
            com.facebook.internal.instrument.crashshield.a.a(th4, this);
        }
    }
}
