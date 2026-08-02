package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.C0852b;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.C0856f;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0861c<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;

    @NonNull
    public static final String DEFAULT_ACCOUNT = "<<default account>>";

    @NonNull
    public static final String KEY_PENDING_INTENT = "pendingIntent";

    @Nullable
    private volatile String zzA;

    @Nullable
    private volatile com.google.android.gms.common.wrappers.a zzB;

    @Nullable
    private C0852b zzC;
    private boolean zzD;

    @Nullable
    private volatile f0 zzE;

    @VisibleForTesting
    p0 zza;
    final Handler zzb;

    @NonNull
    @VisibleForTesting
    protected InterfaceC0112c zzc;

    @NonNull
    @VisibleForTesting
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;

    @Nullable
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final AbstractC0867i zzn;
    private final C0856f zzo;
    private final Object zzp;
    private final Object zzq;

    @Nullable
    private InterfaceC0871m zzr;

    @Nullable
    private IInterface zzs;
    private final ArrayList zzt;

    @Nullable
    private c0 zzu;
    private int zzv;

    @Nullable
    private final a zzw;

    @Nullable
    private final b zzx;
    private final int zzy;

    @Nullable
    private final String zzz;
    private static final C0854d[] zze = new C0854d[0];

    @NonNull
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* renamed from: com.google.android.gms.common.internal.c$a */
    public interface a {
        void onConnected(@Nullable Bundle bundle);

        void onConnectionSuspended(int i);
    }

    /* renamed from: com.google.android.gms.common.internal.c$b */
    public interface b {
        void onConnectionFailed(@NonNull C0852b c0852b);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c, reason: collision with other inner class name */
    public interface InterfaceC0112c {
        void a(@NonNull C0852b c0852b);
    }

    /* renamed from: com.google.android.gms.common.internal.c$d */
    public class d implements InterfaceC0112c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.AbstractC0861c.InterfaceC0112c
        public final void a(@NonNull C0852b c0852b) {
            boolean m = c0852b.m();
            AbstractC0861c abstractC0861c = AbstractC0861c.this;
            if (m) {
                abstractC0861c.getRemoteService(null, abstractC0861c.getScopes());
            } else if (abstractC0861c.zzx != null) {
                abstractC0861c.zzx.onConnectionFailed(c0852b);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$e */
    public interface e {
    }

    @VisibleForTesting
    public AbstractC0861c(@NonNull Context context, @NonNull Handler handler, @NonNull AbstractC0867i abstractC0867i, @NonNull C0856f c0856f, int i, @Nullable a aVar, @Nullable b bVar) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        C0875q.h(context, "Context must not be null");
        this.zzl = context;
        C0875q.h(handler, "Handler must not be null");
        this.zzb = handler;
        this.zzm = handler.getLooper();
        C0875q.h(abstractC0867i, "Supervisor must not be null");
        this.zzn = abstractC0867i;
        C0875q.h(c0856f, "API availability must not be null");
        this.zzo = c0856f;
        this.zzy = i;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = null;
    }

    public static void zzj(AbstractC0861c abstractC0861c, f0 f0Var) {
        abstractC0861c.zzE = f0Var;
        if (abstractC0861c.usesClientTelemetry()) {
            C0864f c0864f = f0Var.d;
            r a2 = r.a();
            C0876s c0876s = c0864f == null ? null : c0864f.a;
            synchronized (a2) {
                if (c0876s == null) {
                    a2.a = r.c;
                    return;
                }
                C0876s c0876s2 = a2.a;
                if (c0876s2 == null || c0876s2.a < c0876s.a) {
                    a2.a = c0876s;
                }
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(AbstractC0861c abstractC0861c, int i) {
        int i2;
        int i3;
        synchronized (abstractC0861c.zzp) {
            i2 = abstractC0861c.zzv;
        }
        if (i2 == 3) {
            abstractC0861c.zzD = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = abstractC0861c.zzb;
        handler.sendMessage(handler.obtainMessage(i3, abstractC0861c.zzd.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean zzn(AbstractC0861c abstractC0861c, int i, int i2, IInterface iInterface) {
        synchronized (abstractC0861c.zzp) {
            try {
                if (abstractC0861c.zzv != i) {
                    return false;
                }
                abstractC0861c.zzp(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzo(AbstractC0861c abstractC0861c) {
        if (abstractC0861c.zzD || TextUtils.isEmpty(abstractC0861c.getServiceDescriptor()) || TextUtils.isEmpty(abstractC0861c.getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(abstractC0861c.getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzp(int i, @Nullable IInterface iInterface) {
        p0 p0Var;
        C0875q.a((i == 4) == (iInterface != 0));
        synchronized (this.zzp) {
            try {
                this.zzv = i;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    c0 c0Var = this.zzu;
                    if (c0Var != null) {
                        AbstractC0867i abstractC0867i = this.zzn;
                        String str = this.zza.a;
                        C0875q.g(str);
                        String str2 = this.zza.b;
                        zze();
                        boolean z = this.zza.c;
                        abstractC0867i.getClass();
                        abstractC0867i.c(new j0(str, str2, z), c0Var);
                        this.zzu = null;
                    }
                } else if (i == 2 || i == 3) {
                    c0 c0Var2 = this.zzu;
                    if (c0Var2 != null && (p0Var = this.zza) != null) {
                        String str3 = p0Var.a;
                        AbstractC0867i abstractC0867i2 = this.zzn;
                        C0875q.g(str3);
                        String str4 = this.zza.b;
                        zze();
                        boolean z2 = this.zza.c;
                        abstractC0867i2.getClass();
                        abstractC0867i2.c(new j0(str3, str4, z2), c0Var2);
                        this.zzd.incrementAndGet();
                    }
                    c0 c0Var3 = new c0(this, this.zzd.get());
                    this.zzu = c0Var3;
                    p0 p0Var2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new p0(getStartServicePackage(), getStartServiceAction(), getUseDynamicLookup()) : new p0(getContext().getPackageName(), getLocalStartServiceAction(), false);
                    this.zza = p0Var2;
                    if (p0Var2.c && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.a)));
                    }
                    AbstractC0867i abstractC0867i3 = this.zzn;
                    String str5 = this.zza.a;
                    C0875q.g(str5);
                    C0852b b2 = abstractC0867i3.b(new j0(str5, this.zza.b, this.zza.c), c0Var3, zze(), getBindServiceExecutor());
                    if (!b2.m()) {
                        String str6 = this.zza.a;
                        int i2 = b2.b;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (b2.c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(KEY_PENDING_INTENT, b2.c);
                        }
                        zzl(i2, bundle, this.zzd.get());
                    }
                } else if (i == 4) {
                    C0875q.g(iInterface);
                    onConnectedLocked(iInterface);
                }
            } finally {
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int c = this.zzo.c(this.zzl, getMinApkVersion());
        if (c == 0) {
            connect(new d());
        } else {
            zzp(1, null);
            triggerNotAvailable(new d(), c, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(@NonNull InterfaceC0112c interfaceC0112c) {
        C0875q.h(interfaceC0112c, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC0112c;
        zzp(2, null);
    }

    @Nullable
    public abstract T createServiceInterface(@NonNull IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            try {
                int size = this.zzt.size();
                for (int i = 0; i < size; i++) {
                    a0 a0Var = (a0) this.zzt.get(i);
                    synchronized (a0Var) {
                        a0Var.a = null;
                    }
                }
                this.zzt.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    public void dump(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr) {
        int i;
        IInterface iInterface;
        InterfaceC0871m interfaceC0871m;
        synchronized (this.zzp) {
            i = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            interfaceC0871m = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC0871m == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(interfaceC0871m.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.zzh;
            append.println(j + " " + simpleDateFormat.format(new Date(j)));
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.zzf;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append((CharSequence) String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.zzg;
            append2.println(j2 + " " + simpleDateFormat.format(new Date(j2)));
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) com.google.android.gms.common.api.d.a(this.zzi));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.zzj;
            append3.println(j3 + " " + simpleDateFormat.format(new Date(j3)));
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    @Nullable
    public Account getAccount() {
        return null;
    }

    @NonNull
    public C0854d[] getApiFeatures() {
        return zze;
    }

    @Nullable
    public com.google.android.gms.common.wrappers.a getAttributionSourceWrapper() {
        return null;
    }

    @Nullable
    public final C0854d[] getAvailableFeatures() {
        f0 f0Var = this.zzE;
        if (f0Var == null) {
            return null;
        }
        return f0Var.b;
    }

    @Nullable
    public Executor getBindServiceExecutor() {
        return null;
    }

    @Nullable
    public Bundle getConnectionHint() {
        return null;
    }

    @NonNull
    public final Context getContext() {
        return this.zzl;
    }

    @NonNull
    public String getEndpointPackageName() {
        p0 p0Var;
        if (!isConnected() || (p0Var = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return p0Var.b;
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    @NonNull
    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    @Nullable
    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    @Nullable
    public String getLocalStartServiceAction() {
        return null;
    }

    @NonNull
    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return C0856f.a;
    }

    @WorkerThread
    public void getRemoteService(@Nullable InterfaceC0869k interfaceC0869k, @NonNull Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = Build.VERSION.SDK_INT < 31 ? this.zzA : this.zzA;
        int i = this.zzy;
        int i2 = C0856f.a;
        Scope[] scopeArr = C0865g.q;
        Bundle bundle = new Bundle();
        C0854d[] c0854dArr = C0865g.r;
        C0865g c0865g = new C0865g(6, i, i2, null, null, scopeArr, bundle, null, c0854dArr, c0854dArr, true, 0, false, str);
        c0865g.d = this.zzl.getPackageName();
        c0865g.i = getServiceRequestExtraArgs;
        if (set != null) {
            c0865g.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            c0865g.j = account;
            if (interfaceC0869k != null) {
                c0865g.e = interfaceC0869k.asBinder();
            }
        } else if (requiresAccount()) {
            c0865g.j = getAccount();
        }
        c0865g.k = zze;
        c0865g.l = getApiFeatures();
        if (usesClientTelemetry()) {
            c0865g.o = true;
        }
        try {
            try {
                synchronized (this.zzq) {
                    try {
                        InterfaceC0871m interfaceC0871m = this.zzr;
                        if (interfaceC0871m != null) {
                            interfaceC0871m.b(new b0(this, this.zzd.get()), c0865g);
                        }
                    } finally {
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                onPostInitHandler(8, null, null, this.zzd.get());
            }
        } catch (DeadObjectException unused2) {
            triggerConnectionSuspended(3);
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    @NonNull
    public Set<Scope> getScopes() {
        return Collections.EMPTY_SET;
    }

    @NonNull
    public final T getService() throws DeadObjectException {
        T t;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                t = (T) this.zzs;
                C0875q.h(t, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    @Nullable
    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                InterfaceC0871m interfaceC0871m = this.zzr;
                if (interfaceC0871m == null) {
                    return null;
                }
                return interfaceC0871m.asBinder();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    public abstract String getServiceDescriptor();

    @NonNull
    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @NonNull
    public abstract String getStartServiceAction();

    @NonNull
    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    @Nullable
    public C0864f getTelemetryConfiguration() {
        f0 f0Var = this.zzE;
        if (f0Var == null) {
            return null;
        }
        return f0Var.d;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.zzp) {
            z = this.zzv == 4;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.zzp) {
            int i = this.zzv;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    @CallSuper
    public void onConnectedLocked(@NonNull T t) {
        this.zzh = System.currentTimeMillis();
    }

    @CallSuper
    public void onConnectionFailed(@NonNull C0852b c0852b) {
        this.zzi = c0852b.b;
        this.zzj = System.currentTimeMillis();
    }

    @CallSuper
    public void onConnectionSuspended(int i) {
        this.zzf = i;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i, @Nullable IBinder iBinder, @Nullable Bundle bundle, int i2) {
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i2, -1, new d0(this, i, iBinder, bundle)));
    }

    public void onUserSignOut(@NonNull e eVar) {
        com.google.android.gms.common.api.internal.J j = (com.google.android.gms.common.api.internal.J) eVar;
        j.a.v.p.post(new com.google.android.gms.common.api.internal.I(j));
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionSourceWrapper(@NonNull com.google.android.gms.common.wrappers.a aVar) {
    }

    public void setAttributionTag(@NonNull String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i) {
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i));
    }

    @VisibleForTesting
    public void triggerNotAvailable(@NonNull InterfaceC0112c interfaceC0112c, int i, @Nullable PendingIntent pendingIntent) {
        C0875q.h(interfaceC0112c, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC0112c;
        this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    @NonNull
    public final String zze() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzl(int i, @Nullable Bundle bundle, int i2) {
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i2, -1, new e0(this, i, bundle)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC0861c(@NonNull Context context, @NonNull Looper looper, int i, @Nullable a aVar, @Nullable b bVar, @Nullable String str) {
        this(context, looper, r3, r4, i, aVar, bVar, str);
        m0 a2 = AbstractC0867i.a(context);
        C0856f c0856f = C0856f.b;
        C0875q.g(aVar);
        C0875q.g(bVar);
    }

    @VisibleForTesting
    public AbstractC0861c(@NonNull Context context, @NonNull Looper looper, @NonNull AbstractC0867i abstractC0867i, @NonNull C0856f c0856f, int i, @Nullable a aVar, @Nullable b bVar, @Nullable String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        C0875q.h(context, "Context must not be null");
        this.zzl = context;
        C0875q.h(looper, "Looper must not be null");
        this.zzm = looper;
        C0875q.h(abstractC0867i, "Supervisor must not be null");
        this.zzn = abstractC0867i;
        C0875q.h(c0856f, "API availability must not be null");
        this.zzo = c0856f;
        this.zzb = new Z(this, looper);
        this.zzy = i;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = str;
    }

    public void disconnect(@NonNull String str) {
        this.zzk = str;
        disconnect();
    }
}
