package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes2.dex */
public final class w extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final D f14212a;

    /* renamed from: b, reason: collision with root package name */
    public D f14213b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f14214c;

    public w(Context context, D d7, Context context2) {
        super(context);
        this.f14212a = d7;
        this.f14214c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i7 = 0; i7 < stackTrace.length && i7 < 11; i7++) {
            if (stackTrace[i7].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i7].getMethodName().equals("<init>")) {
                return this.f14214c.getSystemService(str);
            }
        }
        if (this.f14213b == null) {
            this.f14213b = this.f14212a;
        }
        return this.f14213b;
    }
}
