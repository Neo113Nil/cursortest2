package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final e f5547a;

    /* renamed from: b, reason: collision with root package name */
    public final o2.l f5548b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5549c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f5550d;

    public f(e eVar, o2.l lVar, String str, SafePackageManager safePackageManager) {
        this.f5547a = eVar;
        this.f5548b = lVar;
        this.f5549c = str;
        this.f5550d = safePackageManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context) {
        IBinder iBinder;
        e eVar;
        if (this.f5550d.resolveService(context, this.f5547a.f5544a, 0) == null) {
            throw new l(B0.c.l(new StringBuilder("could not resolve "), this.f5549c, " services"));
        }
        try {
            eVar = this.f5547a;
        } catch (Throwable unused) {
        }
        if (context.bindService(eVar.f5544a, eVar, 1)) {
            e eVar2 = this.f5547a;
            if (eVar2.f5545b == null) {
                synchronized (eVar2.f5546c) {
                    if (eVar2.f5545b == null) {
                        try {
                            eVar2.f5546c.wait(3000L);
                        } catch (InterruptedException unused2) {
                        }
                    }
                }
            }
            iBinder = eVar2.f5545b;
            if (iBinder == null) {
                return this.f5548b.invoke(iBinder);
            }
            throw new g(B0.c.l(new StringBuilder("could not bind to "), this.f5549c, " services"));
        }
        iBinder = null;
        if (iBinder == null) {
        }
    }

    public final void b(Context context) {
        try {
            this.f5547a.a(context);
        } catch (Throwable unused) {
        }
    }

    public f(Intent intent, o2.l lVar, String str) {
        this(new e(intent, str), lVar, str, new SafePackageManager());
    }
}
