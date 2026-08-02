package com.google.android.gms.internal.ads;

import T2.C0437o;
import android.app.ActivityManager;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class Ms implements Ei, Jw, InterfaceC1805xu {

    /* renamed from: m, reason: collision with root package name */
    public static final Ms f10735m = new Ms();

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10736k;

    /* renamed from: l, reason: collision with root package name */
    public Context f10737l;

    public /* synthetic */ Ms() {
        this.f10736k = 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1805xu
    /* renamed from: a */
    public Object mo12a() {
        int i = 1;
        switch (this.f10736k) {
            case 3:
                H2.j jVar = AbstractC1803xs.f16343b;
                if (jVar.f2300l) {
                    return Boolean.TRUE;
                }
                Context applicationContext = this.f10737l.getApplicationContext();
                if (applicationContext == null) {
                    throw new IllegalArgumentException("Application Context cannot be null");
                }
                if (!jVar.f2300l) {
                    jVar.f2300l = true;
                    Ns a5 = Ns.a();
                    a5.getClass();
                    a5.f10854b = new Es(new Handler(), applicationContext, a5);
                    Gs gs = Gs.f9282n;
                    boolean z3 = applicationContext instanceof Application;
                    if (z3) {
                        ((Application) applicationContext).registerActivityLifecycleCallbacks(gs);
                    }
                    AbstractC1803xs.f16346e = (UiModeManager) applicationContext.getSystemService("uimode");
                    WindowManager windowManager = Us.f11828a;
                    Us.f11830c = applicationContext.getResources().getDisplayMetrics().density;
                    Us.f11828a = (WindowManager) applicationContext.getSystemService("window");
                    applicationContext.registerReceiver(new T2.K(2), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
                    f10735m.f10737l = applicationContext.getApplicationContext();
                    Fs fs = Fs.f9134e;
                    if (!fs.f9135a) {
                        Js js = (Js) fs.f9138d;
                        if (z3) {
                            ((Application) applicationContext).registerActivityLifecycleCallbacks(js);
                        }
                        js.f10077m = fs;
                        js.f10075k = true;
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        js.f10076l = runningAppProcessInfo.importance == 100;
                        fs.f9136b = js.f10076l;
                        fs.f9135a = true;
                    }
                    Os.f11007d.f11008a = new WeakReference(applicationContext);
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    applicationContext.registerReceiver(new T2.K(i), intentFilter);
                }
                return Boolean.valueOf(jVar.f2300l);
            default:
                return C1514rH.a(this.f10737l);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ei
    /* renamed from: k */
    public void mo13k(Object obj) {
        ((Wh) obj).u(this.f10737l);
    }

    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o */
    public /* bridge */ /* synthetic */ void mo14o(Object obj) {
        if (((Boolean) AbstractC0790b8.f12772j.s()).booleanValue()) {
            AbstractC1668us.V(this.f10737l);
        }
    }

    @Override // com.google.android.gms.internal.ads.Jw
    public void u(Throwable th) {
        if (((Boolean) AbstractC0790b8.f12771h.s()).booleanValue() && (th instanceof C0437o)) {
            AbstractC1668us.V(this.f10737l);
        }
    }

    public /* synthetic */ Ms(Context context, int i) {
        this.f10736k = i;
        this.f10737l = context;
    }
}
