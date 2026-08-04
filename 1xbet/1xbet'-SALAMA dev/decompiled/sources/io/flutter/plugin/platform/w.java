package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f14218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public D f14219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f14220c;

    public w(Context context, D d7, Context context2) {
        super(context);
        this.f14218a = d7;
        this.f14220c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i7 = 0; i7 < stackTrace.length && i7 < 11; i7++) {
            if (stackTrace[i7].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i7].getMethodName().equals("<init>")) {
                return this.f14220c.getSystemService(str);
            }
        }
        if (this.f14219b == null) {
            this.f14219b = this.f14218a;
        }
        return this.f14219b;
    }
}
