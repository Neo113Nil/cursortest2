package com.google.android.gms.common.api;

import W5.AbstractC0486a1;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.api.internal.AbstractC0827d;
import com.google.android.gms.common.api.internal.AbstractC0836m;
import com.google.android.gms.common.api.internal.AbstractC0840q;
import com.google.android.gms.common.api.internal.AbstractC0845w;
import com.google.android.gms.common.api.internal.AbstractC0846x;
import com.google.android.gms.common.api.internal.AbstractServiceConnectionC0838o;
import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.common.api.internal.C;
import com.google.android.gms.common.api.internal.C0824a;
import com.google.android.gms.common.api.internal.C0831h;
import com.google.android.gms.common.api.internal.C0837n;
import com.google.android.gms.common.api.internal.F;
import com.google.android.gms.common.api.internal.InterfaceC0835l;
import com.google.android.gms.common.api.internal.InterfaceC0842t;
import com.google.android.gms.common.api.internal.J;
import com.google.android.gms.common.api.internal.L;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.M;
import com.google.android.gms.common.api.internal.S;
import com.google.android.gms.common.api.internal.T;
import com.google.android.gms.common.internal.AbstractC0854f;
import com.google.android.gms.common.internal.C0855g;
import com.google.android.gms.common.internal.C0856h;
import com.google.android.gms.common.internal.C0864p;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class l {
    protected final C0831h zaa;
    private final Context zab;
    private final String zac;
    private final i zad;
    private final e zae;
    private final C0824a zaf;
    private final Looper zag;
    private final int zah;
    private final o zai;
    private final InterfaceC0842t zaj;

    public l(Context context, Activity activity, i iVar, e eVar, k kVar) {
        D.j(context, "Null context is not permitted.");
        D.j(iVar, "Api must not be null.");
        D.j(kVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.zab = context.getApplicationContext();
        String str = null;
        if (m3.c.i()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", null).invoke(context, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.zac = str;
        this.zad = iVar;
        this.zae = eVar;
        this.zag = kVar.f11207b;
        C0824a c0824a = new C0824a(iVar, eVar, str);
        this.zaf = c0824a;
        this.zai = new F(this);
        C0831h g3 = C0831h.g(this.zab);
        this.zaa = g3;
        this.zah = g3.f11190y.getAndIncrement();
        this.zaj = kVar.f11206a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            InterfaceC0835l fragment = LifecycleCallback.getFragment(activity);
            B b7 = (B) fragment.b(B.class, "ConnectionlessLifecycleHelper");
            if (b7 == null) {
                Object obj = com.google.android.gms.common.c.f11214c;
                b7 = new B(fragment, g3);
            }
            b7.f11096e.add(c0824a);
            g3.b(b7);
        }
        zau zauVar = g3.f11181E;
        zauVar.sendMessage(zauVar.obtainMessage(7, this));
    }

    public final void a(int i7, AbstractC0827d abstractC0827d) {
        abstractC0827d.zak();
        C0831h c0831h = this.zaa;
        c0831h.getClass();
        S s7 = new S(i7, abstractC0827d);
        zau zauVar = c0831h.f11181E;
        zauVar.sendMessage(zauVar.obtainMessage(4, new L(s7, c0831h.f11191z.get(), this)));
    }

    public o asGoogleApiClient() {
        return this.zai;
    }

    public final Task b(int i7, AbstractC0845w abstractC0845w) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C0831h c0831h = this.zaa;
        InterfaceC0842t interfaceC0842t = this.zaj;
        c0831h.getClass();
        int i8 = abstractC0845w.f11200c;
        zau zauVar = c0831h.f11181E;
        if (i8 != 0) {
            C0824a apiKey = getApiKey();
            J j = null;
            if (c0831h.c()) {
                RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) C0864p.b().f11324a;
                boolean z4 = true;
                if (rootTelemetryConfiguration != null) {
                    if (rootTelemetryConfiguration.f11295b) {
                        com.google.android.gms.common.api.internal.D d7 = (com.google.android.gms.common.api.internal.D) c0831h.f11177A.get(apiKey);
                        if (d7 != null) {
                            Object obj = d7.f11105b;
                            if (obj instanceof AbstractC0854f) {
                                AbstractC0854f abstractC0854f = (AbstractC0854f) obj;
                                if (abstractC0854f.hasConnectionInfo() && !abstractC0854f.isConnecting()) {
                                    ConnectionTelemetryConfiguration a2 = J.a(d7, abstractC0854f, i8);
                                    if (a2 != null) {
                                        d7.f11102C++;
                                        z4 = a2.f11232c;
                                    }
                                }
                            }
                        }
                        z4 = rootTelemetryConfiguration.f11296c;
                    }
                }
                j = new J(c0831h, i8, apiKey, z4 ? System.currentTimeMillis() : 0L, z4 ? SystemClock.elapsedRealtime() : 0L);
            }
            if (j != null) {
                Task task = taskCompletionSource.getTask();
                zauVar.getClass();
                task.addOnCompleteListener(new L.f(zauVar, 1), j);
            }
        }
        zauVar.sendMessage(zauVar.obtainMessage(4, new L(new T(i7, abstractC0845w, taskCompletionSource, interfaceC0842t), c0831h.f11191z.get(), this)));
        return taskCompletionSource.getTask();
    }

    public C0855g createClientSettingsBuilder() {
        C0855g c0855g = new C0855g();
        Set emptySet = Collections.emptySet();
        if (c0855g.f11302a == null) {
            c0855g.f11302a = new r.c(0);
        }
        c0855g.f11302a.addAll(emptySet);
        c0855g.f11304c = this.zab.getClass().getName();
        c0855g.f11303b = this.zab.getPackageName();
        return c0855g;
    }

    public Task<Boolean> disconnectService() {
        C0831h c0831h = this.zaa;
        c0831h.getClass();
        C c3 = new C(getApiKey());
        zau zauVar = c0831h.f11181E;
        zauVar.sendMessage(zauVar.obtainMessage(14, c3));
        return c3.f11099b.getTask();
    }

    public <A extends b, T extends AbstractC0827d> T doBestEffortWrite(T t7) {
        a(2, t7);
        return t7;
    }

    public <A extends b, T extends AbstractC0827d> T doRead(T t7) {
        a(0, t7);
        return t7;
    }

    @Deprecated
    public <A extends b, T extends AbstractC0840q, U extends AbstractC0846x> Task<Void> doRegisterEventListener(T t7, U u4) {
        D.i(t7);
        throw null;
    }

    public Task<Boolean> doUnregisterEventListener(AbstractC0836m abstractC0836m) {
        return doUnregisterEventListener(abstractC0836m, 0);
    }

    public <A extends b, T extends AbstractC0827d> T doWrite(T t7) {
        a(1, t7);
        return t7;
    }

    public final C0824a getApiKey() {
        return this.zaf;
    }

    public e getApiOptions() {
        return this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    public String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public <L> C0837n registerListener(L l7, String str) {
        Looper looper = this.zag;
        D.j(l7, "Listener must not be null");
        D.j(looper, "Looper must not be null");
        D.j(str, "Listener type must not be null");
        C0837n c0837n = new C0837n();
        new zzi(looper);
        c0837n.f11193a = l7;
        D.e(str);
        return c0837n;
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g zab(Looper looper, com.google.android.gms.common.api.internal.D d7) {
        C0855g createClientSettingsBuilder = createClientSettingsBuilder();
        C0856h c0856h = new C0856h(createClientSettingsBuilder.f11302a, createClientSettingsBuilder.f11303b, createClientSettingsBuilder.f11304c);
        a aVar = this.zad.f11087a;
        D.i(aVar);
        g buildClient = aVar.buildClient(this.zab, looper, c0856h, (Object) this.zae, (m) d7, (n) d7);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof AbstractC0854f)) {
            ((AbstractC0854f) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag == null || !(buildClient instanceof AbstractServiceConnectionC0838o)) {
            return buildClient;
        }
        AbstractC0486a1.n(buildClient);
        throw null;
    }

    public final M zac(Context context, Handler handler) {
        C0855g createClientSettingsBuilder = createClientSettingsBuilder();
        return new M(context, handler, new C0856h(createClientSettingsBuilder.f11302a, createClientSettingsBuilder.f11303b, createClientSettingsBuilder.f11304c));
    }

    public <TResult, A extends b> Task<TResult> doBestEffortWrite(AbstractC0845w abstractC0845w) {
        return b(2, abstractC0845w);
    }

    public <TResult, A extends b> Task<TResult> doRead(AbstractC0845w abstractC0845w) {
        return b(0, abstractC0845w);
    }

    public <A extends b> Task<Void> doRegisterEventListener(com.google.android.gms.common.api.internal.r rVar) {
        D.i(rVar);
        throw null;
    }

    public Task<Boolean> doUnregisterEventListener(AbstractC0836m abstractC0836m, int i7) {
        D.j(abstractC0836m, "Listener key cannot be null.");
        throw null;
    }

    public <TResult, A extends b> Task<TResult> doWrite(AbstractC0845w abstractC0845w) {
        return b(1, abstractC0845w);
    }
}
