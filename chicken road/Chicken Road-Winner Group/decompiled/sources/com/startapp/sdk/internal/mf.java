package com.startapp.sdk.internal;

import android.app.Activity;
import android.view.View;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.RcdMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RcdTargets;
import java.util.Collection;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class mf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f4058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f4059b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pf f4060c;

    public mf(pf pfVar, Activity activity, View view) {
        this.f4060c = pfVar;
        this.f4058a = activity;
        this.f4059b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            pf pfVar = this.f4060c;
            Activity activity = this.f4058a;
            View view = this.f4059b;
            pfVar.f4221d.getClass();
            RcdMetadata R2 = MetaData.E().R();
            if (R2 == null || !R2.c()) {
                R2 = null;
            }
            RcdTargets b3 = R2 != null ? R2.b() : null;
            if (b3 == null) {
                return;
            }
            try {
                Collection a3 = b3.a(8);
                String name = activity.getClass().getName();
                if (a3.contains(name)) {
                    pfVar.a(name, 8);
                    return;
                }
            } catch (Throwable th) {
                d9.a(th);
            }
            try {
                pfVar.a(b3, view);
            } catch (Throwable th2) {
                d9.a(th2);
            }
            ((Executor) pfVar.f4220c.a()).execute(pfVar.f4226j);
        } catch (Throwable th3) {
            d9.a(th3);
        }
    }
}
