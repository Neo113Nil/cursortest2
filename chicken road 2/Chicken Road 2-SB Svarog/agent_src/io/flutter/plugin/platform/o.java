package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public final class o extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final r f713a;

    /* renamed from: b, reason: collision with root package name */
    public r f714b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f715c;

    public o(Context context, r rVar, Context context2) {
        super(context);
        this.f713a = rVar;
        this.f715c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i2 = 0; i2 < stackTrace.length && i2 < 11; i2++) {
            if (stackTrace[i2].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i2].getMethodName().equals("<init>")) {
                return this.f715c.getSystemService(str);
            }
        }
        if (this.f714b == null) {
            this.f714b = this.f713a;
        }
        return this.f714b;
    }
}
