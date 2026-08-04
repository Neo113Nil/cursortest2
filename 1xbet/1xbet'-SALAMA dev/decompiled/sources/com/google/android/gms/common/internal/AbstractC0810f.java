package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.b1;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
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

/* JADX INFO: renamed from: com.google.android.gms.common.internal.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0810f {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    O zza;
    final Handler zzb;
    protected InterfaceC0808d zzc;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private final Context zzl;
    private final Looper zzm;
    private final AbstractC0814j zzn;
    private final com.google.android.gms.common.d zzo;
    private InterfaceC0818n zzr;
    private IInterface zzs;
    private H zzu;
    private final InterfaceC0806b zzw;
    private final InterfaceC0807c zzx;
    private final int zzy;
    private final String zzz;
    private static final Feature[] zze = new Feature[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};
    private volatile String zzk = null;
    private final Object zzp = new Object();
    private final Object zzq = new Object();
    private final ArrayList zzt = new ArrayList();
    private int zzv = 1;
    private ConnectionResult zzB = null;
    private boolean zzC = false;
    private volatile zzk zzD = null;
    protected AtomicInteger zzd = new AtomicInteger(0);

    public AbstractC0810f(Context context, Looper looper, N n2, com.google.android.gms.common.d dVar, int i7, InterfaceC0806b interfaceC0806b, InterfaceC0807c interfaceC0807c, String str) {
        D.j(context, "Context must not be null");
        this.zzl = context;
        D.j(looper, "Looper must not be null");
        this.zzm = looper;
        D.j(n2, "Supervisor must not be null");
        this.zzn = n2;
        D.j(dVar, "API availability must not be null");
        this.zzo = dVar;
        this.zzb = new F(this, looper);
        this.zzy = i7;
        this.zzw = interfaceC0806b;
        this.zzx = interfaceC0807c;
        this.zzz = str;
    }

    public static void zzj(AbstractC0810f abstractC0810f, zzk zzkVar) {
        abstractC0810f.zzD = zzkVar;
        if (abstractC0810f.usesClientTelemetry()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzkVar.f11356d;
            C0820p c0820pB = C0820p.b();
            RootTelemetryConfiguration rootTelemetryConfiguration = connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.f11230a;
            synchronized (c0820pB) {
                try {
                    if (rootTelemetryConfiguration == null) {
                        rootTelemetryConfiguration = C0820p.f11323c;
                    } else {
                        RootTelemetryConfiguration rootTelemetryConfiguration2 = (RootTelemetryConfiguration) c0820pB.f11324a;
                        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.f11294a < rootTelemetryConfiguration.f11294a) {
                        }
                    }
                    c0820pB.f11324a = rootTelemetryConfiguration;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(AbstractC0810f abstractC0810f, int i7) {
        int i8;
        int i9;
        synchronized (abstractC0810f.zzp) {
            i8 = abstractC0810f.zzv;
        }
        if (i8 == 3) {
            abstractC0810f.zzC = true;
            i9 = 5;
        } else {
            i9 = 4;
        }
        Handler handler = abstractC0810f.zzb;
        handler.sendMessage(handler.obtainMessage(i9, abstractC0810f.zzd.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean zzn(AbstractC0810f abstractC0810f, int i7, int i8, IInterface iInterface) {
        synchronized (abstractC0810f.zzp) {
            try {
                if (abstractC0810f.zzv != i7) {
                    return false;
                }
                abstractC0810f.a(i8, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzo(AbstractC0810f abstractC0810f) {
        if (abstractC0810f.zzC || TextUtils.isEmpty(abstractC0810f.getServiceDescriptor()) || TextUtils.isEmpty(abstractC0810f.getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(abstractC0810f.getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void a(int i7, IInterface iInterface) {
        O o7;
        D.b((i7 == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i7;
                this.zzs = iInterface;
                if (i7 == 1) {
                    H h6 = this.zzu;
                    if (h6 != null) {
                        AbstractC0814j abstractC0814j = this.zzn;
                        String str = this.zza.f11291a;
                        D.i(str);
                        String str2 = this.zza.f11292b;
                        zze();
                        abstractC0814j.b(str, str2, h6, this.zza.f11293c);
                        this.zzu = null;
                    }
                } else if (i7 == 2 || i7 == 3) {
                    H h7 = this.zzu;
                    if (h7 != null && (o7 = this.zza) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + o7.f11291a + " on " + o7.f11292b);
                        AbstractC0814j abstractC0814j2 = this.zzn;
                        String str3 = this.zza.f11291a;
                        D.i(str3);
                        String str4 = this.zza.f11292b;
                        zze();
                        abstractC0814j2.b(str3, str4, h7, this.zza.f11293c);
                        this.zzd.incrementAndGet();
                    }
                    H h8 = new H(this, this.zzd.get());
                    this.zzu = h8;
                    O o8 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new O(getStartServicePackage(), getStartServiceAction(), getUseDynamicLookup()) : new O(getContext().getPackageName(), getLocalStartServiceAction(), false);
                    this.zza = o8;
                    if (o8.f11293c && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.f11291a)));
                    }
                    AbstractC0814j abstractC0814j3 = this.zzn;
                    String str5 = this.zza.f11291a;
                    D.i(str5);
                    if (!abstractC0814j3.c(new K(str5, this.zza.f11292b, this.zza.f11293c), h8, zze(), getBindServiceExecutor())) {
                        O o9 = this.zza;
                        Log.w("GmsClient", "unable to connect to service: " + o9.f11291a + " on " + o9.f11292b);
                        zzl(16, null, this.zzd.get());
                    }
                } else if (i7 == 4) {
                    D.i(iInterface);
                    onConnectedLocked(iInterface);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int iD = this.zzo.d(this.zzl, getMinApkVersion());
        if (iD == 0) {
            connect(new C0820p(this));
        } else {
            a(1, null);
            triggerNotAvailable(new C0820p(this), iD, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(InterfaceC0808d interfaceC0808d) {
        D.j(interfaceC0808d, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC0808d;
        a(2, null);
    }

    public abstract IInterface createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            try {
                int size = this.zzt.size();
                for (int i7 = 0; i7 < size; i7++) {
                    A a2 = (A) this.zzt.get(i7);
                    synchronized (a2) {
                        a2.f11223a = null;
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
        a(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i7;
        IInterface iInterface;
        InterfaceC0818n interfaceC0818n;
        synchronized (this.zzp) {
            i7 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            interfaceC0818n = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i7 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i7 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i7 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i7 == 4) {
            printWriter.print("CONNECTED");
        } else if (i7 != 5) {
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
        if (interfaceC0818n == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(((C) interfaceC0818n).asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.zzh;
            printWriterAppend.println(j + " " + simpleDateFormat.format(new Date(j)));
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i8 = this.zzf;
            if (i8 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i8 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i8 != 3) {
                printWriter.append((CharSequence) String.valueOf(i8));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j3 = this.zzg;
            printWriterAppend2.println(j3 + " " + simpleDateFormat.format(new Date(j3)));
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) Q0.a.C(this.zzi));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j7 = this.zzj;
            printWriterAppend3.println(j7 + " " + simpleDateFormat.format(new Date(j7)));
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public Feature[] getApiFeatures() {
        return zze;
    }

    public final Feature[] getAvailableFeatures() {
        zzk zzkVar = this.zzD;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.f11354b;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        O o7;
        if (!isConnected() || (o7 = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return o7.f11292b;
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return com.google.android.gms.common.d.f11216a;
    }

    public void getRemoteService(InterfaceC0816l interfaceC0816l, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = this.zzA;
        int i7 = com.google.android.gms.common.d.f11216a;
        Scope[] scopeArr = GetServiceRequest.f11243F;
        Bundle bundle = new Bundle();
        int i8 = this.zzy;
        Feature[] featureArr = GetServiceRequest.f11244G;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i8, i7, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f11253d = this.zzl.getPackageName();
        getServiceRequest.f11256x = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.f11255f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            getServiceRequest.f11257y = account;
            if (interfaceC0816l != null) {
                getServiceRequest.f11254e = interfaceC0816l.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.f11257y = getAccount();
        }
        getServiceRequest.f11258z = zze;
        getServiceRequest.f11245A = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.f11248D = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    InterfaceC0818n interfaceC0818n = this.zzr;
                    if (interfaceC0818n != null) {
                        ((C) interfaceC0818n).Z(new G(this, this.zzd.get()), getServiceRequest);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e7) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e7);
            triggerConnectionSuspended(3);
        } catch (RemoteException e8) {
            e = e8;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e9) {
            throw e9;
        } catch (RuntimeException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    public Set<Scope> getScopes() {
        return Collections.emptySet();
    }

    public final IInterface getService() {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                iInterface = this.zzs;
                D.j(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                InterfaceC0818n interfaceC0818n = this.zzr;
                if (interfaceC0818n == null) {
                    return null;
                }
                return ((C) interfaceC0818n).asBinder();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        zzk zzkVar = this.zzD;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.f11356d;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean isConnected() {
        boolean z4;
        synchronized (this.zzp) {
            z4 = this.zzv == 4;
        }
        return z4;
    }

    public boolean isConnecting() {
        boolean z4;
        synchronized (this.zzp) {
            int i7 = this.zzv;
            z4 = true;
            if (i7 != 2 && i7 != 3) {
                z4 = false;
            }
        }
        return z4;
    }

    public void onConnectedLocked(IInterface iInterface) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzi = connectionResult.f11061b;
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i7) {
        this.zzf = i7;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i7, IBinder iBinder, Bundle bundle, int i8) {
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i8, -1, new I(this, i7, iBinder, bundle)));
    }

    public void onUserSignOut(InterfaceC0809e interfaceC0809e) {
        p145u1.c cVar = (p145u1.c) interfaceC0809e;
        ((com.google.android.gms.common.api.internal.D) cVar.f16597b).f11103D.f11181E.post(new b1(cVar, 3));
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

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i7) {
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i7));
    }

    public void triggerNotAvailable(InterfaceC0808d interfaceC0808d, int i7, PendingIntent pendingIntent) {
        D.j(interfaceC0808d, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC0808d;
        this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i7, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zze() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzl(int i7, Bundle bundle, int i8) {
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i8, -1, new J(this, i7)));
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }
}
