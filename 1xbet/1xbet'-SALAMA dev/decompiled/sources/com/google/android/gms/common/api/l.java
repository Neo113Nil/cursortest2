package com.google.android.gms.common.api;

import W5.AbstractC0486a1;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.api.internal.AbstractC0783d;
import com.google.android.gms.common.api.internal.AbstractC0792m;
import com.google.android.gms.common.api.internal.AbstractC0796q;
import com.google.android.gms.common.api.internal.AbstractC0801w;
import com.google.android.gms.common.api.internal.AbstractC0802x;
import com.google.android.gms.common.api.internal.AbstractServiceConnectionC0794o;
import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.common.api.internal.C;
import com.google.android.gms.common.api.internal.C0780a;
import com.google.android.gms.common.api.internal.C0787h;
import com.google.android.gms.common.api.internal.C0793n;
import com.google.android.gms.common.api.internal.F;
import com.google.android.gms.common.api.internal.InterfaceC0791l;
import com.google.android.gms.common.api.internal.InterfaceC0798t;
import com.google.android.gms.common.api.internal.J;
import com.google.android.gms.common.api.internal.L;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.M;
import com.google.android.gms.common.api.internal.S;
import com.google.android.gms.common.api.internal.T;
import com.google.android.gms.common.internal.AbstractC0810f;
import com.google.android.gms.common.internal.C0811g;
import com.google.android.gms.common.internal.C0812h;
import com.google.android.gms.common.internal.C0820p;
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

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    protected final C0787h zaa;
    private final Context zab;
    private final String zac;
    private final i zad;
    private final e zae;
    private final C0780a zaf;
    private final Looper zag;
    private final int zah;
    private final o zai;
    private final InterfaceC0798t zaj;

    public l(Context context, Activity activity, i iVar, e eVar, k kVar) {
        D.j(context, "Null context is not permitted.");
        D.j(iVar, "Api must not be null.");
        D.j(kVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.zab = context.getApplicationContext();
        String str = null;
        if (p090m3.c.i()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", null).invoke(context, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.zac = str;
        this.zad = iVar;
        this.zae = eVar;
        this.zag = kVar.f11207b;
        C0780a c0780a = new C0780a(iVar, eVar, str);
        this.zaf = c0780a;
        this.zai = new F(this);
        C0787h c0787hG = C0787h.g(this.zab);
        this.zaa = c0787hG;
        this.zah = c0787hG.f11190y.getAndIncrement();
        this.zaj = kVar.f11206a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            InterfaceC0791l fragment = LifecycleCallback.getFragment(activity);
            B b7 = (B) fragment.b(B.class, "ConnectionlessLifecycleHelper");
            if (b7 == null) {
                Object obj = com.google.android.gms.common.c.f11214c;
                b7 = new B(fragment, c0787hG);
            }
            b7.f11096e.add(c0780a);
            c0787hG.b(b7);
        }
        zau zauVar = c0787hG.f11181E;
        zauVar.sendMessage(zauVar.obtainMessage(7, this));
    }

    public final void a(int i7, AbstractC0783d abstractC0783d) {
        abstractC0783d.zak();
        C0787h c0787h = this.zaa;
        c0787h.getClass();
        S s7 = new S(i7, abstractC0783d);
        zau zauVar = c0787h.f11181E;
        zauVar.sendMessage(zauVar.obtainMessage(4, new L(s7, c0787h.f11191z.get(), this)));
    }

    public o asGoogleApiClient() {
        return this.zai;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    public final Task b(int i7, AbstractC0801w abstractC0801w) {
        long jCurrentTimeMillis;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C0787h c0787h = this.zaa;
        InterfaceC0798t interfaceC0798t = this.zaj;
        c0787h.getClass();
        int i8 = abstractC0801w.f11200c;
        zau zauVar = c0787h.f11181E;
        if (i8 != 0) {
            C0780a apiKey = getApiKey();
            J j = null;
            if (c0787h.c()) {
                RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) C0820p.b().f11324a;
                boolean z4 = true;
                if (rootTelemetryConfiguration == null) {
                    if (z4) {
                        jCurrentTimeMillis = System.currentTimeMillis();
                    } else {
                        jCurrentTimeMillis = 0;
                    }
                    j = new J(c0787h, i8, apiKey, jCurrentTimeMillis, z4 ? SystemClock.elapsedRealtime() : 0L);
                } else if (rootTelemetryConfiguration.f11295b) {
                    com.google.android.gms.common.api.internal.D d7 = (com.google.android.gms.common.api.internal.D) c0787h.f11177A.get(apiKey);
                    if (d7 != null) {
                        Object obj = d7.f11105b;
                        if (obj instanceof AbstractC0810f) {
                            AbstractC0810f abstractC0810f = (AbstractC0810f) obj;
                            if (!abstractC0810f.hasConnectionInfo() || abstractC0810f.isConnecting()) {
                                z4 = rootTelemetryConfiguration.f11296c;
                            } else {
                                ConnectionTelemetryConfiguration connectionTelemetryConfigurationA = J.a(d7, abstractC0810f, i8);
                                if (connectionTelemetryConfigurationA != null) {
                                    d7.f11102C++;
                                    z4 = connectionTelemetryConfigurationA.f11232c;
                                }
                            }
                            if (z4) {
                                jCurrentTimeMillis = System.currentTimeMillis();
                            } else {
                                jCurrentTimeMillis = 0;
                            }
                            if (z4) {
                            }
                            j = new J(c0787h, i8, apiKey, jCurrentTimeMillis, z4 ? SystemClock.elapsedRealtime() : 0L);
                        }
                    } else {
                        z4 = rootTelemetryConfiguration.f11296c;
                        if (z4) {
                            jCurrentTimeMillis = System.currentTimeMillis();
                        } else {
                            jCurrentTimeMillis = 0;
                        }
                        if (z4) {
                        }
                        j = new J(c0787h, i8, apiKey, jCurrentTimeMillis, z4 ? SystemClock.elapsedRealtime() : 0L);
                    }
                }
            }
            if (j != null) {
                Task task = taskCompletionSource.getTask();
                zauVar.getClass();
                task.addOnCompleteListener(new L.f(zauVar, 1), j);
            }
        }
        zauVar.sendMessage(zauVar.obtainMessage(4, new L(new T(i7, abstractC0801w, taskCompletionSource, interfaceC0798t), c0787h.f11191z.get(), this)));
        return taskCompletionSource.getTask();
    }

    public C0811g createClientSettingsBuilder() {
        C0811g c0811g = new C0811g();
        Set setEmptySet = Collections.emptySet();
        if (c0811g.f11302a == null) {
            c0811g.f11302a = new p122r.c(0);
        }
        c0811g.f11302a.addAll(setEmptySet);
        c0811g.f11304c = this.zab.getClass().getName();
        c0811g.f11303b = this.zab.getPackageName();
        return c0811g;
    }

    public Task<Boolean> disconnectService() {
        C0787h c0787h = this.zaa;
        c0787h.getClass();
        C c3 = new C(getApiKey());
        zau zauVar = c0787h.f11181E;
        zauVar.sendMessage(zauVar.obtainMessage(14, c3));
        return c3.f11099b.getTask();
    }

    public <A extends b, T extends AbstractC0783d> T doBestEffortWrite(T t7) {
        a(2, t7);
        return t7;
    }

    public <A extends b, T extends AbstractC0783d> T doRead(T t7) {
        a(0, t7);
        return t7;
    }

    @Deprecated
    public <A extends b, T extends AbstractC0796q, U extends AbstractC0802x> Task<Void> doRegisterEventListener(T t7, U u4) {
        D.i(t7);
        throw null;
    }

    public Task<Boolean> doUnregisterEventListener(AbstractC0792m abstractC0792m) {
        return doUnregisterEventListener(abstractC0792m, 0);
    }

    public <A extends b, T extends AbstractC0783d> T doWrite(T t7) {
        a(1, t7);
        return t7;
    }

    public final C0780a getApiKey() {
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

    public <L> C0793n registerListener(L l7, String str) {
        Looper looper = this.zag;
        D.j(l7, "Listener must not be null");
        D.j(looper, "Looper must not be null");
        D.j(str, "Listener type must not be null");
        C0793n c0793n = new C0793n();
        new zzi(looper);
        c0793n.f11193a = l7;
        D.e(str);
        return c0793n;
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g zab(Looper looper, com.google.android.gms.common.api.internal.D d7) {
        C0811g c0811gCreateClientSettingsBuilder = createClientSettingsBuilder();
        C0812h c0812h = new C0812h(c0811gCreateClientSettingsBuilder.f11302a, c0811gCreateClientSettingsBuilder.f11303b, c0811gCreateClientSettingsBuilder.f11304c);
        a aVar = this.zad.f11087a;
        D.i(aVar);
        g gVarBuildClient = aVar.buildClient(this.zab, looper, c0812h, (Object) this.zae, (m) d7, (n) d7);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (gVarBuildClient instanceof AbstractC0810f)) {
            ((AbstractC0810f) gVarBuildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag == null || !(gVarBuildClient instanceof AbstractServiceConnectionC0794o)) {
            return gVarBuildClient;
        }
        AbstractC0486a1.n(gVarBuildClient);
        throw null;
    }

    public final M zac(Context context, Handler handler) {
        C0811g c0811gCreateClientSettingsBuilder = createClientSettingsBuilder();
        return new M(context, handler, new C0812h(c0811gCreateClientSettingsBuilder.f11302a, c0811gCreateClientSettingsBuilder.f11303b, c0811gCreateClientSettingsBuilder.f11304c));
    }

    public <TResult, A extends b> Task<TResult> doBestEffortWrite(AbstractC0801w abstractC0801w) {
        return b(2, abstractC0801w);
    }

    public <TResult, A extends b> Task<TResult> doRead(AbstractC0801w abstractC0801w) {
        return b(0, abstractC0801w);
    }

    public <A extends b> Task<Void> doRegisterEventListener(com.google.android.gms.common.api.internal.r rVar) {
        D.i(rVar);
        throw null;
    }

    public Task<Boolean> doUnregisterEventListener(AbstractC0792m abstractC0792m, int i7) {
        D.j(abstractC0792m, "Listener key cannot be null.");
        throw null;
    }

    public <TResult, A extends b> Task<TResult> doWrite(AbstractC0801w abstractC0801w) {
        return b(1, abstractC0801w);
    }
}
