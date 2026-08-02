package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArraySet;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.C0855e;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.AbstractC0830d;
import com.google.android.gms.common.api.internal.AbstractC0842p;
import com.google.android.gms.common.api.internal.AbstractC0847v;
import com.google.android.gms.common.api.internal.AbstractC0849x;
import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.common.api.internal.C;
import com.google.android.gms.common.api.internal.C0827a;
import com.google.android.gms.common.api.internal.C0828b;
import com.google.android.gms.common.api.internal.C0833g;
import com.google.android.gms.common.api.internal.C0836j;
import com.google.android.gms.common.api.internal.C0838l;
import com.google.android.gms.common.api.internal.C0839m;
import com.google.android.gms.common.api.internal.C0843q;
import com.google.android.gms.common.api.internal.InterfaceC0837k;
import com.google.android.gms.common.api.internal.InterfaceC0845t;
import com.google.android.gms.common.api.internal.K;
import com.google.android.gms.common.api.internal.O;
import com.google.android.gms.common.api.internal.ServiceConnectionC0840n;
import com.google.android.gms.common.api.internal.W;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.internal.k0;
import com.google.android.gms.common.api.internal.l0;
import com.google.android.gms.common.internal.AbstractC0861c;
import com.google.android.gms.common.internal.C0863e;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes4.dex */
public abstract class g<O extends a.d> {

    @NonNull
    protected final C0833g zaa;
    private final Context zab;

    @Nullable
    private final String zac;
    private final com.google.android.gms.common.api.a zad;
    private final a.d zae;
    private final C0828b zaf;
    private final Looper zag;
    private final int zah;
    private final h zai;
    private final InterfaceC0845t zaj;

    public static class a {

        @NonNull
        public static final a c = new a(new C0827a(), Looper.getMainLooper());

        @NonNull
        public final InterfaceC0845t a;

        @NonNull
        public final Looper b;

        public a(InterfaceC0845t interfaceC0845t, Looper looper) {
            this.a = interfaceC0845t;
            this.b = looper;
        }
    }

    @MainThread
    public g(@NonNull Activity activity, @NonNull com.google.android.gms.common.api.a<O> aVar, @NonNull O o, @NonNull a aVar2) {
        this(activity, activity, aVar, o, aVar2);
    }

    private final AbstractC0830d zad(int i, @NonNull AbstractC0830d abstractC0830d) {
        abstractC0830d.zak();
        C0833g c0833g = this.zaa;
        c0833g.getClass();
        W w = new W(new j0(i, abstractC0830d), c0833g.k.get(), this);
        zau zauVar = c0833g.p;
        zauVar.sendMessage(zauVar.obtainMessage(4, w));
        return abstractC0830d;
    }

    private final Task zae(int i, @NonNull AbstractC0847v abstractC0847v) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        InterfaceC0845t interfaceC0845t = this.zaj;
        C0833g c0833g = this.zaa;
        c0833g.getClass();
        c0833g.g(taskCompletionSource, abstractC0847v.c, this);
        W w = new W(new k0(i, abstractC0847v, taskCompletionSource, interfaceC0845t), c0833g.k.get(), this);
        zau zauVar = c0833g.p;
        zauVar.sendMessage(zauVar.obtainMessage(4, w));
        return taskCompletionSource.getTask();
    }

    @NonNull
    public h asGoogleApiClient() {
        return this.zai;
    }

    @NonNull
    public C0863e.a createClientSettingsBuilder() {
        Collection collection;
        GoogleSignInAccount h;
        C0863e.a aVar = new C0863e.a();
        a.d dVar = this.zae;
        Account account = null;
        if (!(dVar instanceof a.d.b) || (h = ((a.d.b) dVar).h()) == null) {
            a.d dVar2 = this.zae;
            if (dVar2 instanceof a.d.InterfaceC0111a) {
                account = ((a.d.InterfaceC0111a) dVar2).getAccount();
            }
        } else {
            String str = h.d;
            if (str != null) {
                account = new Account(str, "com.google");
            }
        }
        aVar.a = account;
        a.d dVar3 = this.zae;
        if (dVar3 instanceof a.d.b) {
            GoogleSignInAccount h2 = ((a.d.b) dVar3).h();
            collection = h2 == null ? Collections.EMPTY_SET : h2.l();
        } else {
            collection = Collections.EMPTY_SET;
        }
        if (aVar.b == null) {
            aVar.b = new ArraySet();
        }
        aVar.b.addAll(collection);
        aVar.d = this.zab.getClass().getName();
        aVar.c = this.zab.getPackageName();
        return aVar;
    }

    @NonNull
    public Task<Boolean> disconnectService() {
        C0833g c0833g = this.zaa;
        c0833g.getClass();
        C c = new C(getApiKey());
        zau zauVar = c0833g.p;
        zauVar.sendMessage(zauVar.obtainMessage(14, c));
        return c.b.getTask();
    }

    @NonNull
    public <A extends a.b, T extends AbstractC0830d<? extends l, A>> T doBestEffortWrite(@NonNull T t) {
        zad(2, t);
        return t;
    }

    @NonNull
    public <A extends a.b, T extends AbstractC0830d<? extends l, A>> T doRead(@NonNull T t) {
        zad(0, t);
        return t;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @Deprecated
    public <A extends a.b, T extends AbstractC0842p<A, ?>, U extends AbstractC0849x<A, ?>> Task<Void> doRegisterEventListener(@NonNull T t, @NonNull U u) {
        C0875q.g(t);
        throw null;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(@NonNull C0838l.a<?> aVar) {
        return doUnregisterEventListener(aVar, 0);
    }

    @NonNull
    public <A extends a.b, T extends AbstractC0830d<? extends l, A>> T doWrite(@NonNull T t) {
        zad(1, t);
        return t;
    }

    @Nullable
    public String getApiFallbackAttributionTag(@NonNull Context context) {
        return null;
    }

    @NonNull
    public final C0828b<O> getApiKey() {
        return this.zaf;
    }

    @NonNull
    public O getApiOptions() {
        return (O) this.zae;
    }

    @NonNull
    public Context getApplicationContext() {
        return this.zab;
    }

    @Nullable
    public String getContextAttributionTag() {
        return this.zac;
    }

    @Nullable
    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    @NonNull
    public Looper getLooper() {
        return this.zag;
    }

    @NonNull
    public <L> C0838l<L> registerListener(@NonNull L l, @NonNull String str) {
        return C0839m.a(this.zag, l, str);
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    public final a.f zab(Looper looper, K k) {
        C0863e.a createClientSettingsBuilder = createClientSettingsBuilder();
        C0863e c0863e = new C0863e(createClientSettingsBuilder.a, createClientSettingsBuilder.b, null, createClientSettingsBuilder.c, createClientSettingsBuilder.d, com.google.android.gms.signin.a.a);
        a.AbstractC0110a abstractC0110a = this.zad.a;
        C0875q.g(abstractC0110a);
        a.f buildClient = abstractC0110a.buildClient(this.zab, looper, c0863e, (C0863e) this.zae, (h.a) k, (h.b) k);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof AbstractC0861c)) {
            ((AbstractC0861c) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (buildClient instanceof ServiceConnectionC0840n)) {
            ((ServiceConnectionC0840n) buildClient).getClass();
        }
        return buildClient;
    }

    public final c0 zac(Context context, Handler handler) {
        C0863e.a createClientSettingsBuilder = createClientSettingsBuilder();
        return new c0(context, handler, new C0863e(createClientSettingsBuilder.a, createClientSettingsBuilder.b, null, createClientSettingsBuilder.c, createClientSettingsBuilder.d, com.google.android.gms.signin.a.a));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(@NonNull Activity activity, @NonNull com.google.android.gms.common.api.a<O> aVar, @NonNull O o, @NonNull InterfaceC0845t interfaceC0845t) {
        this(activity, (com.google.android.gms.common.api.a) aVar, (a.d) o, new a(interfaceC0845t, r0));
        C0875q.h(interfaceC0845t, "StatusExceptionMapper must not be null.");
        Looper mainLooper = activity.getMainLooper();
        C0875q.h(mainLooper, "Looper must not be null.");
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> Task<TResult> doBestEffortWrite(@NonNull AbstractC0847v<A, TResult> abstractC0847v) {
        return zae(2, abstractC0847v);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> Task<TResult> doRead(@NonNull AbstractC0847v<A, TResult> abstractC0847v) {
        return zae(0, abstractC0847v);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <A extends a.b> Task<Void> doRegisterEventListener(@NonNull C0843q<A, ?> c0843q) {
        C0875q.g(c0843q);
        throw null;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(@NonNull C0838l.a<?> aVar, int i) {
        C0875q.h(aVar, "Listener key cannot be null.");
        C0833g c0833g = this.zaa;
        c0833g.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        c0833g.g(taskCompletionSource, i, this);
        W w = new W(new l0(aVar, taskCompletionSource), c0833g.k.get(), this);
        zau zauVar = c0833g.p;
        zauVar.sendMessage(zauVar.obtainMessage(13, w));
        return taskCompletionSource.getTask();
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> Task<TResult> doWrite(@NonNull AbstractC0847v<A, TResult> abstractC0847v) {
        return zae(1, abstractC0847v);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public g(@NonNull Context context, @NonNull com.google.android.gms.common.api.a<O> aVar, @NonNull O o, @NonNull Looper looper, @NonNull InterfaceC0845t interfaceC0845t) {
        this(context, aVar, o, new a(interfaceC0845t, looper));
        C0875q.h(looper, "Looper must not be null.");
        C0875q.h(interfaceC0845t, "StatusExceptionMapper must not be null.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public g(@NonNull Context context, @NonNull com.google.android.gms.common.api.a<O> aVar, @NonNull O o, @NonNull InterfaceC0845t interfaceC0845t) {
        this(context, aVar, o, new a(interfaceC0845t, Looper.getMainLooper()));
        C0875q.h(interfaceC0845t, "StatusExceptionMapper must not be null.");
    }

    private g(@NonNull Context context, @Nullable Activity activity, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        String apiFallbackAttributionTag;
        C0875q.h(context, "Null context is not permitted.");
        C0875q.h(aVar, "Api must not be null.");
        C0875q.h(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        C0875q.h(applicationContext, "The provided context did not have an application context.");
        this.zab = applicationContext;
        if (Build.VERSION.SDK_INT >= 30) {
            apiFallbackAttributionTag = context.getAttributionTag();
        } else {
            apiFallbackAttributionTag = getApiFallbackAttributionTag(context);
        }
        this.zac = apiFallbackAttributionTag;
        this.zad = aVar;
        this.zae = dVar;
        this.zag = aVar2.b;
        C0828b c0828b = new C0828b(aVar, dVar, apiFallbackAttributionTag);
        this.zaf = c0828b;
        this.zai = new O(this);
        C0833g h = C0833g.h(applicationContext);
        this.zaa = h;
        this.zah = h.j.getAndIncrement();
        this.zaj = aVar2.a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            InterfaceC0837k fragment = C0836j.getFragment(activity);
            B b = (B) fragment.b(B.class, "ConnectionlessLifecycleHelper");
            b = b == null ? new B(fragment, h, C0855e.d) : b;
            b.e.add(c0828b);
            h.b(b);
        }
        zau zauVar = h.p;
        zauVar.sendMessage(zauVar.obtainMessage(7, this));
    }

    public g(@NonNull Context context, @NonNull com.google.android.gms.common.api.a<O> aVar, @NonNull O o, @NonNull a aVar2) {
        this(context, (Activity) null, aVar, o, aVar2);
    }
}
