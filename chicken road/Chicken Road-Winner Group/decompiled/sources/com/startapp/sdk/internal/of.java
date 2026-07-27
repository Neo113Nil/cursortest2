package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.RcdMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RcdTargets;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class of implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StackTraceElement[] f4166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4167b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pf f4168c;

    public of(pf pfVar, StackTraceElement[] stackTraceElementArr, int i3) {
        this.f4168c = pfVar;
        this.f4166a = stackTraceElementArr;
        this.f4167b = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            pf pfVar = this.f4168c;
            StackTraceElement[] stackTraceElementArr = this.f4166a;
            int i3 = this.f4167b;
            pfVar.f4221d.getClass();
            RcdMetadata R2 = MetaData.E().R();
            if (R2 == null || !R2.c()) {
                R2 = null;
            }
            RcdTargets b3 = R2 != null ? R2.b() : null;
            if (b3 == null) {
                return;
            }
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                pfVar.a(b3, stackTraceElement.getClassName(), i3);
            }
            ((Executor) pfVar.f4220c.a()).execute(pfVar.f4226j);
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
