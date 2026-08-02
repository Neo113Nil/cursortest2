package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.facebook.z;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes3.dex */
public final class C extends AsyncTask<Void, Void, List<? extends E>> {
    public static final a Companion = new a();
    public final D a;
    public Exception b;

    public static final class a {
    }

    public C(D requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.a = requests;
    }

    public final void a(List<E> result) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(result, "result");
                super.onPostExecute(result);
                Exception exc = this.b;
                if (exc != null) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1)), "format(format, *args)");
                    com.facebook.internal.E e = com.facebook.internal.E.a;
                    w wVar = w.a;
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
        }
    }

    @Override // android.os.AsyncTask
    public final List<? extends E> doInBackground(Void[] voidArr) {
        if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
            try {
                if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                    try {
                        Void[] params = voidArr;
                        D d = this.a;
                        if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                            try {
                                if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                                    try {
                                        Intrinsics.checkNotNullParameter(params, "params");
                                        try {
                                            d.getClass();
                                            z.Companion.getClass();
                                            return z.c.c(d);
                                        } catch (Exception e) {
                                            this.b = e;
                                        }
                                    } catch (Throwable th) {
                                        com.facebook.internal.instrument.crashshield.a.a(th, this);
                                    }
                                }
                            } catch (Throwable th2) {
                                com.facebook.internal.instrument.crashshield.a.a(th2, this);
                            }
                        }
                    } catch (Throwable th3) {
                        com.facebook.internal.instrument.crashshield.a.a(th3, this);
                    }
                }
            } catch (Throwable th4) {
                com.facebook.internal.instrument.crashshield.a.a(th4, this);
                return null;
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(List<? extends E> list) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                return;
            }
            try {
                a(list);
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
        }
    }

    @Override // android.os.AsyncTask
    @VisibleForTesting(otherwise = 4)
    public final void onPreExecute() {
        D d = this.a;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                return;
            }
            try {
                super.onPreExecute();
                w wVar = w.a;
                if (d.a == null) {
                    d.a = Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
        }
    }

    public final String toString() {
        String str = "{RequestAsyncTask:  connection: null, requests: " + this.a + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }
}
