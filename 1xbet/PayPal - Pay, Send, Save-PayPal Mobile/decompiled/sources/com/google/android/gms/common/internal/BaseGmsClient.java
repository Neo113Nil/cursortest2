package com.google.android.gms.common.internal;

/* loaded from: classes4.dex */
public abstract class BaseGmsClient<T extends android.os.IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final java.lang.String DEFAULT_ACCOUNT = "<<default account>>";
    public static final java.lang.String KEY_PENDING_INTENT = "pendingIntent";
    private volatile java.lang.String zzA;
    private volatile com.google.android.gms.common.wrappers.AttributionSourceWrapper zzB;
    private com.google.android.gms.common.ConnectionResult zzC;
    private boolean zzD;
    private volatile com.google.android.gms.common.internal.zzj zzE;
    private android.os.UserHandle zzF;
    com.google.android.gms.common.internal.zzs zza;
    final android.os.Handler zzb;
    protected com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks zzc;
    protected java.util.concurrent.atomic.AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile java.lang.String zzk;
    private final android.content.Context zzl;
    private final android.os.Looper zzm;
    private final com.google.android.gms.common.internal.GmsClientSupervisor zzn;
    private final com.google.android.gms.common.GoogleApiAvailabilityLight zzo;
    private final java.lang.Object zzp;
    private final java.lang.Object zzq;
    private com.google.android.gms.common.internal.IGmsServiceBroker zzr;
    private android.os.IInterface zzs;
    private final java.util.ArrayList zzt;
    private com.google.android.gms.common.internal.zze zzu;
    private int zzv;
    private final com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks zzw;
    private final com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener zzx;
    private final int zzy;
    private final java.lang.String zzz;
    private static final com.google.android.gms.common.Feature[] zze = new com.google.android.gms.common.Feature[0];
    public static final java.lang.String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    public interface BaseConnectionCallbacks {
        public static final int CAUSE_DEAD_OBJECT_EXCEPTION = 3;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected(android.os.Bundle bundle);

        void onConnectionSuspended(int i);
    }

    public interface BaseOnConnectionFailedListener {
        void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult);
    }

    public interface ConnectionProgressReportCallbacks {
        void onReportServiceBinding(com.google.android.gms.common.ConnectionResult connectionResult);
    }

    public class LegacyClientCallbackAdapter implements com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks {
        final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zza;

        public LegacyClientCallbackAdapter(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient) {
            java.util.Objects.requireNonNull(baseGmsClient);
            this.zza = baseGmsClient;
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public final void onReportServiceBinding(com.google.android.gms.common.ConnectionResult connectionResult) {
            if (connectionResult.isSuccess()) {
                com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = this.zza;
                baseGmsClient.getRemoteService(null, baseGmsClient.getScopes());
            } else {
                com.google.android.gms.common.internal.BaseGmsClient baseGmsClient2 = this.zza;
                if (baseGmsClient2.zzl() != null) {
                    baseGmsClient2.zzl().onConnectionFailed(connectionResult);
                }
            }
        }
    }

    public interface SignOutCallbacks {
        void onSignOutComplete();
    }

    protected BaseGmsClient(android.content.Context context, android.os.Handler handler, com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor, com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        this.zzk = null;
        this.zzp = new java.lang.Object();
        this.zzq = new java.lang.Object();
        this.zzt = new java.util.ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new java.util.concurrent.atomic.AtomicInteger(0);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
        this.zzl = context;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(handler, "Handler must not be null");
        this.zzb = handler;
        this.zzm = handler.getLooper();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(gmsClientSupervisor, "Supervisor must not be null");
        this.zzn = gmsClientSupervisor;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.zzo = googleApiAvailabilityLight;
        this.zzy = i;
        this.zzw = baseConnectionCallbacks;
        this.zzx = baseOnConnectionFailedListener;
        this.zzz = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzp(int i, android.os.IInterface iInterface) {
        com.google.android.gms.common.ConnectionResult zza;
        com.google.android.gms.common.internal.zzs zzsVar;
        com.google.android.gms.common.internal.Preconditions.checkArgument((i == 4) == (iInterface != 0));
        synchronized (this.zzp) {
            this.zzv = i;
            this.zzs = iInterface;
            android.os.Bundle bundle = null;
            if (i == 1) {
                com.google.android.gms.common.internal.zze zzeVar = this.zzu;
                if (zzeVar != null) {
                    if (this.zzF == null || android.os.Build.VERSION.SDK_INT < 33) {
                        com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor = this.zzn;
                        java.lang.String zza2 = this.zza.zza();
                        com.google.android.gms.common.internal.Preconditions.checkNotNull(zza2);
                        java.lang.String str = zza2;
                        gmsClientSupervisor.zzc(new com.google.android.gms.common.internal.zzn(zza2, this.zza.zzb(), 4225, this.zza.zzc(), null), zzeVar, zza());
                    } else {
                        com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor2 = this.zzn;
                        java.lang.String zza3 = this.zza.zza();
                        com.google.android.gms.common.internal.Preconditions.checkNotNull(zza3);
                        java.lang.String str2 = zza3;
                        gmsClientSupervisor2.zzb(zza3, this.zza.zzb(), 4225, zzeVar, zza(), this.zza.zzc(), this.zzF);
                    }
                    this.zzu = null;
                }
            } else if (i == 2 || i == 3) {
                com.google.android.gms.common.internal.zze zzeVar2 = this.zzu;
                if (zzeVar2 != null && (zzsVar = this.zza) != null) {
                    java.lang.String zza4 = zzsVar.zza();
                    java.lang.String zzb = zzsVar.zzb();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zza4).length() + 70 + java.lang.String.valueOf(zzb).length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(zza4);
                    sb.append(" on ");
                    sb.append(zzb);
                    android.util.Log.e("GmsClient", sb.toString());
                    com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor3 = this.zzn;
                    java.lang.String zza5 = this.zza.zza();
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(zza5);
                    java.lang.String str3 = zza5;
                    gmsClientSupervisor3.zzb(zza5, this.zza.zzb(), 4225, zzeVar2, zza(), this.zza.zzc(), this.zzF);
                    this.zzd.incrementAndGet();
                }
                com.google.android.gms.common.internal.zze zzeVar3 = new com.google.android.gms.common.internal.zze(this, this.zzd.get());
                this.zzu = zzeVar3;
                com.google.android.gms.common.internal.zzs zzsVar2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new com.google.android.gms.common.internal.zzs(getStartServicePackage(), getStartServiceAction(), false, 4225, getUseDynamicLookup()) : new com.google.android.gms.common.internal.zzs(getContext().getPackageName(), getLocalStartServiceAction(), true, 4225, false);
                this.zza = zzsVar2;
                if (zzsVar2.zzc() && getMinApkVersion() < 17895000) {
                    java.lang.String zza6 = this.zza.zza();
                    java.lang.String.valueOf(zza6);
                    throw new java.lang.IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(java.lang.String.valueOf(zza6)));
                }
                if (this.zzF == null || android.os.Build.VERSION.SDK_INT < 33) {
                    com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor4 = this.zzn;
                    java.lang.String zza7 = this.zza.zza();
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(zza7);
                    java.lang.String str4 = zza7;
                    zza = gmsClientSupervisor4.zza(new com.google.android.gms.common.internal.zzn(zza7, this.zza.zzb(), 4225, this.zza.zzc(), null), zzeVar3, zza(), getBindServiceExecutor());
                } else {
                    com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor5 = this.zzn;
                    java.lang.String zza8 = this.zza.zza();
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(zza8);
                    java.lang.String str5 = zza8;
                    java.lang.String zzb2 = this.zza.zzb();
                    java.lang.String zza9 = zza();
                    boolean zzc = this.zza.zzc();
                    android.os.UserHandle userHandle = this.zzF;
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(userHandle);
                    android.os.UserHandle userHandle2 = userHandle;
                    zza = gmsClientSupervisor5.zza(new com.google.android.gms.common.internal.zzn(zza8, zzb2, 4225, zzc, userHandle), zzeVar3, zza9, null);
                }
                if (!zza.isSuccess()) {
                    java.lang.String zza10 = this.zza.zza();
                    java.lang.String zzb3 = this.zza.zzb();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zza10).length() + 34 + java.lang.String.valueOf(zzb3).length());
                    sb2.append("unable to connect to service: ");
                    sb2.append(zza10);
                    sb2.append(" on ");
                    sb2.append(zzb3);
                    android.util.Log.w("GmsClient", sb2.toString());
                    int errorCode = zza.getErrorCode() == -1 ? 16 : zza.getErrorCode();
                    if (zza.getResolution() != null) {
                        bundle = new android.os.Bundle();
                        bundle.putParcelable(KEY_PENDING_INTENT, zza.getResolution());
                    }
                    zzb(errorCode, bundle, this.zzd.get());
                }
            } else if (i == 4) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(iInterface);
                android.os.IInterface iInterface2 = iInterface;
                onConnectedLocked(iInterface);
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int isGooglePlayServicesAvailable = this.zzo.isGooglePlayServicesAvailable(this.zzl, getMinApkVersion());
        if (isGooglePlayServicesAvailable == 0) {
            connect(new com.google.android.gms.common.internal.BaseGmsClient.LegacyClientCallbackAdapter(this));
        } else {
            zzp(1, null);
            triggerNotAvailable(new com.google.android.gms.common.internal.BaseGmsClient.LegacyClientCallbackAdapter(this), isGooglePlayServicesAvailable, null);
        }
    }

    protected final void checkConnected() {
        if (!isConnected()) {
            throw new java.lang.IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.zzc = connectionProgressReportCallbacks;
        zzp(2, null);
    }

    protected abstract T createServiceInterface(android.os.IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        java.util.ArrayList arrayList = this.zzt;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((com.google.android.gms.common.internal.zzc) arrayList.get(i)).zzf();
            }
            arrayList.clear();
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        int i;
        android.os.IInterface iInterface;
        com.google.android.gms.common.internal.IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.zzp) {
            i = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            iGmsServiceBroker = this.zzr;
        }
        printWriter.append((java.lang.CharSequence) str).append("mConnectState=");
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
            printWriter.append((java.lang.CharSequence) getServiceDescriptor()).append("@").append((java.lang.CharSequence) java.lang.Integer.toHexString(java.lang.System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(java.lang.Integer.toHexString(java.lang.System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", java.util.Locale.US);
        if (this.zzh > 0) {
            java.io.PrintWriter append = printWriter.append((java.lang.CharSequence) str).append("lastConnectedTime=");
            long j = this.zzh;
            java.lang.String format = simpleDateFormat.format(new java.util.Date(j));
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 1 + java.lang.String.valueOf(format).length());
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.zzg > 0) {
            printWriter.append((java.lang.CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.zzf;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append((java.lang.CharSequence) java.lang.String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            java.io.PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.zzg;
            java.lang.String format2 = simpleDateFormat.format(new java.util.Date(j2));
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(j2).length() + 1 + java.lang.String.valueOf(format2).length());
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.zzj > 0) {
            printWriter.append((java.lang.CharSequence) str).append("lastFailedStatus=").append((java.lang.CharSequence) com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(this.zzi));
            java.io.PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.zzj;
            java.lang.String format3 = simpleDateFormat.format(new java.util.Date(j3));
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(j3).length() + 1 + java.lang.String.valueOf(format3).length());
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    protected boolean enableLocalFallback() {
        return false;
    }

    public android.accounts.Account getAccount() {
        return null;
    }

    protected java.util.concurrent.Executor getBindServiceExecutor() {
        return null;
    }

    public android.os.Bundle getConnectionHint() {
        return null;
    }

    public java.lang.String getEndpointPackageName() {
        com.google.android.gms.common.internal.zzs zzsVar;
        if (!isConnected() || (zzsVar = this.zza) == null) {
            throw new java.lang.RuntimeException("Failed to connect when checking package");
        }
        return zzsVar.zzb();
    }

    protected android.os.Bundle getGetServiceRequestExtraArgs() {
        return new android.os.Bundle();
    }

    protected java.lang.String getLocalStartServiceAction() {
        return null;
    }

    public int getMinApkVersion() {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public void getRemoteService(com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor, java.util.Set<com.google.android.gms.common.api.Scope> set) {
        java.lang.String attributionTag;
        android.os.Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        if (android.os.Build.VERSION.SDK_INT < 31) {
            attributionTag = this.zzA;
        } else if (this.zzB == null) {
            attributionTag = this.zzA;
        } else {
            android.content.AttributionSource attributionSource = this.zzB.getAttributionSource();
            attributionTag = attributionSource == null ? this.zzA : attributionSource.getAttributionTag() == null ? this.zzA : attributionSource.getAttributionTag();
        }
        java.lang.String str = attributionTag;
        int i = this.zzy;
        int i2 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        com.google.android.gms.common.api.Scope[] scopeArr = com.google.android.gms.common.internal.GetServiceRequest.zza;
        android.os.Bundle bundle = new android.os.Bundle();
        com.google.android.gms.common.Feature[] featureArr = com.google.android.gms.common.internal.GetServiceRequest.zzb;
        com.google.android.gms.common.internal.GetServiceRequest getServiceRequest = new com.google.android.gms.common.internal.GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.zzf = this.zzl.getPackageName();
        getServiceRequest.zzi = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.zzh = (com.google.android.gms.common.api.Scope[]) set.toArray(new com.google.android.gms.common.api.Scope[0]);
        }
        if (requiresSignIn()) {
            android.accounts.Account account = getAccount();
            if (account == null) {
                account = new android.accounts.Account("<<default account>>", "com.google");
            }
            getServiceRequest.zzj = account;
            if (iAccountAccessor != null) {
                getServiceRequest.zzg = iAccountAccessor.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.zzj = getAccount();
        }
        getServiceRequest.zzk = zze;
        getServiceRequest.zzl = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.zzo = true;
        }
        try {
            synchronized (this.zzq) {
                com.google.android.gms.common.internal.IGmsServiceBroker iGmsServiceBroker = this.zzr;
                if (iGmsServiceBroker != null) {
                    iGmsServiceBroker.getService(new com.google.android.gms.common.internal.zzd(this, this.zzd.get()), getServiceRequest);
                } else {
                    android.util.Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (android.os.DeadObjectException e) {
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            triggerConnectionSuspended(3);
        } catch (android.os.RemoteException e2) {
            e = e2;
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (java.lang.SecurityException e3) {
            throw e3;
        } catch (java.lang.RuntimeException e4) {
            e = e4;
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    protected java.util.Set<com.google.android.gms.common.api.Scope> getScopes() {
        return java.util.Collections.emptySet();
    }

    public final T getService() throws android.os.DeadObjectException {
        T t;
        synchronized (this.zzp) {
            if (this.zzv == 5) {
                throw new android.os.DeadObjectException();
            }
            checkConnected();
            t = (T) this.zzs;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(t, "Client is connected but service is null");
            T t2 = t;
        }
        return t;
    }

    protected abstract java.lang.String getServiceDescriptor();

    public android.content.Intent getSignInIntent() {
        throw new java.lang.UnsupportedOperationException("Not a sign in API");
    }

    protected abstract java.lang.String getStartServiceAction();

    protected boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
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
            z = i == 2 || i == 3;
        }
        return z;
    }

    protected void onConnectedLocked(T t) {
        this.zzh = java.lang.System.currentTimeMillis();
    }

    protected void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zzi = connectionResult.getErrorCode();
        this.zzj = java.lang.System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i) {
        this.zzf = i;
        this.zzg = java.lang.System.currentTimeMillis();
    }

    protected void onPostInitHandler(int i, android.os.IBinder iBinder, android.os.Bundle bundle, int i2) {
        com.google.android.gms.common.internal.zzf zzfVar = new com.google.android.gms.common.internal.zzf(this, i, iBinder, bundle);
        android.os.Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, zzfVar));
    }

    public void onUserSignOut(com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks signOutCallbacks) {
        signOutCallbacks.onSignOutComplete();
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

    public void setUserHandle(android.os.UserHandle userHandle) {
        if (isConnected()) {
            throw new java.lang.IllegalStateException("setUserHandle must be called before connect()");
        }
        this.zzF = userHandle;
    }

    public void triggerConnectionSuspended(int i) {
        int i2 = this.zzd.get();
        android.os.Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, i2, i));
    }

    protected void triggerNotAvailable(com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks, int i, android.app.PendingIntent pendingIntent) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.zzc = connectionProgressReportCallbacks;
        int i2 = this.zzd.get();
        android.os.Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, i2, i, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    protected final java.lang.String zza() {
        java.lang.String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    protected final void zzb(int i, android.os.Bundle bundle, int i2) {
        com.google.android.gms.common.internal.zzg zzgVar = new com.google.android.gms.common.internal.zzg(this, i, bundle);
        android.os.Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, zzgVar));
    }

    final /* synthetic */ void zzc(com.google.android.gms.common.internal.zzj zzjVar) {
        this.zzE = zzjVar;
        if (usesClientTelemetry()) {
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.zzd;
            com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance().zza(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.zza());
        }
    }

    final /* synthetic */ boolean zze(int i, int i2, android.os.IInterface iInterface) {
        synchronized (this.zzp) {
            if (this.zzv != i) {
                return false;
            }
            zzp(i2, iInterface);
            return true;
        }
    }

    final /* synthetic */ void zzf(int i) {
        int i2;
        int i3;
        synchronized (this.zzp) {
            i2 = this.zzv;
        }
        if (i2 == 3) {
            this.zzD = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        android.os.Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(i3, this.zzd.get(), 16));
    }

    final /* synthetic */ boolean zzg() {
        if (this.zzD || android.text.TextUtils.isEmpty(getServiceDescriptor()) || android.text.TextUtils.isEmpty(getLocalStartServiceAction())) {
            return false;
        }
        try {
            java.lang.Class.forName(getServiceDescriptor());
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    public android.os.IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            com.google.android.gms.common.internal.IGmsServiceBroker iGmsServiceBroker = this.zzr;
            if (iGmsServiceBroker == null) {
                return null;
            }
            return iGmsServiceBroker.asBinder();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected BaseGmsClient(android.content.Context context, android.os.Looper looper, int i, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener, java.lang.String str) {
        this(context, looper, r3, r4, i, baseConnectionCallbacks, baseOnConnectionFailedListener, str);
        com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(context);
        com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(baseConnectionCallbacks);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(baseOnConnectionFailedListener);
    }

    public void disconnect(java.lang.String str) {
        this.zzk = str;
        disconnect();
    }

    protected BaseGmsClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor, com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener, java.lang.String str) {
        this.zzk = null;
        this.zzp = new java.lang.Object();
        this.zzq = new java.lang.Object();
        this.zzt = new java.util.ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new java.util.concurrent.atomic.AtomicInteger(0);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
        this.zzl = context;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(looper, "Looper must not be null");
        this.zzm = looper;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(gmsClientSupervisor, "Supervisor must not be null");
        this.zzn = gmsClientSupervisor;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.zzo = googleApiAvailabilityLight;
        this.zzb = new com.google.android.gms.common.internal.zzb(this, looper);
        this.zzy = i;
        this.zzw = baseConnectionCallbacks;
        this.zzx = baseOnConnectionFailedListener;
        this.zzz = str;
    }

    final /* synthetic */ boolean zzo() {
        return this.zzD;
    }

    final /* synthetic */ void zzn(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zzC = connectionResult;
    }

    final /* synthetic */ com.google.android.gms.common.ConnectionResult zzm() {
        return this.zzC;
    }

    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener zzl() {
        return this.zzx;
    }

    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks zzk() {
        return this.zzw;
    }

    final /* synthetic */ java.util.ArrayList zzj() {
        return this.zzt;
    }

    final /* synthetic */ void zzi(com.google.android.gms.common.internal.IGmsServiceBroker iGmsServiceBroker) {
        this.zzr = iGmsServiceBroker;
    }

    final /* synthetic */ java.lang.Object zzh() {
        return this.zzq;
    }

    final /* synthetic */ void zzd(int i, android.os.IInterface iInterface) {
        zzp(i, null);
    }

    public void setAttributionTag(java.lang.String str) {
        this.zzA = str;
    }

    public void setAttributionSourceWrapper(com.google.android.gms.common.wrappers.AttributionSourceWrapper attributionSourceWrapper) {
        this.zzB = attributionSourceWrapper;
    }

    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public com.google.android.gms.common.internal.ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        com.google.android.gms.common.internal.zzj zzjVar = this.zzE;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.zzd;
    }

    protected java.lang.String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public final android.os.Looper getLooper() {
        return this.zzm;
    }

    public java.lang.String getLastDisconnectMessage() {
        return this.zzk;
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public final android.content.Context getContext() {
        return this.zzl;
    }

    public final com.google.android.gms.common.Feature[] getAvailableFeatures() {
        com.google.android.gms.common.internal.zzj zzjVar = this.zzE;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.zzb;
    }

    public com.google.android.gms.common.wrappers.AttributionSourceWrapper getAttributionSourceWrapper() {
        return this.zzB;
    }

    public com.google.android.gms.common.Feature[] getApiFeatures() {
        return zze;
    }
}
