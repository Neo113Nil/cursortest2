package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes3.dex */
public class GoogleApiManager implements android.os.Handler.Callback {
    public static final com.google.android.gms.common.api.Status zaa = new com.google.android.gms.common.api.Status(4, "Sign-out occurred while this API call was in progress.");
    private static final com.google.android.gms.common.api.Status zab = new com.google.android.gms.common.api.Status(4, "The user must be signed in to make this API call.");
    private static final java.lang.Object zac = new java.lang.Object();
    private static com.google.android.gms.common.api.internal.GoogleApiManager zad;
    private com.google.android.gms.common.internal.TelemetryData zag;
    private com.google.android.gms.common.internal.TelemetryLoggingClient zah;
    private final android.content.Context zai;
    private final com.google.android.gms.common.GoogleApiAvailability zaj;
    private final com.google.android.gms.common.internal.zal zak;

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final android.os.Handler zar;
    private volatile boolean zas;
    private long zae = 10000;
    private boolean zaf = false;
    private final java.util.concurrent.atomic.AtomicInteger zal = new java.util.concurrent.atomic.AtomicInteger(1);
    private final java.util.concurrent.atomic.AtomicInteger zam = new java.util.concurrent.atomic.AtomicInteger(0);
    private final java.util.Map zan = new java.util.concurrent.ConcurrentHashMap(5, 0.75f, 1);
    private com.google.android.gms.common.api.internal.zaae zao = null;
    private final java.util.Set zap = new androidx.collection.ArraySet();
    private final java.util.Set zaq = new androidx.collection.ArraySet();

    private GoogleApiManager(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.GoogleApiAvailability googleApiAvailability) {
        this.zas = true;
        this.zai = context;
        com.google.android.gms.internal.base.zau zauVar = new com.google.android.gms.internal.base.zau(looper, this);
        this.zar = zauVar;
        this.zaj = googleApiAvailability;
        this.zak = new com.google.android.gms.common.internal.zal(googleApiAvailability);
        if (com.google.android.gms.common.util.DeviceProperties.isAuto(context)) {
            this.zas = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    public static void reportSignOut() {
        synchronized (zac) {
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = zad;
            if (googleApiManager != null) {
                googleApiManager.zam.incrementAndGet();
                android.os.Handler handler = googleApiManager.zar;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.common.api.Status zaF(com.google.android.gms.common.api.internal.ApiKey apiKey, com.google.android.gms.common.ConnectionResult connectionResult) {
        return new com.google.android.gms.common.api.Status(connectionResult, "API: " + apiKey.zaa() + " is not available on this device. Connection failed with: " + java.lang.String.valueOf(connectionResult));
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final com.google.android.gms.common.api.internal.zabq zaG(com.google.android.gms.common.api.GoogleApi googleApi) {
        java.util.Map map = this.zan;
        com.google.android.gms.common.api.internal.ApiKey apiKey = googleApi.getApiKey();
        com.google.android.gms.common.api.internal.zabq zabqVar = (com.google.android.gms.common.api.internal.zabq) map.get(apiKey);
        if (zabqVar == null) {
            zabqVar = new com.google.android.gms.common.api.internal.zabq(this, googleApi);
            this.zan.put(apiKey, zabqVar);
        }
        if (zabqVar.zaA()) {
            this.zaq.add(apiKey);
        }
        zabqVar.zao();
        return zabqVar;
    }

    private final com.google.android.gms.common.internal.TelemetryLoggingClient zaH() {
        if (this.zah == null) {
            this.zah = com.google.android.gms.common.internal.TelemetryLogging.getClient(this.zai);
        }
        return this.zah;
    }

    private final void zaI() {
        com.google.android.gms.common.internal.TelemetryData telemetryData = this.zag;
        if (telemetryData != null) {
            if (telemetryData.zaa() > 0 || zaD()) {
                zaH().log(telemetryData);
            }
            this.zag = null;
        }
    }

    private final void zaJ(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, int i, com.google.android.gms.common.api.GoogleApi googleApi) {
        com.google.android.gms.common.api.internal.zacd zaa2;
        if (i == 0 || (zaa2 = com.google.android.gms.common.api.internal.zacd.zaa(this, i, googleApi.getApiKey())) == null) {
            return;
        }
        com.google.android.gms.tasks.Task task = taskCompletionSource.getTask();
        final android.os.Handler handler = this.zar;
        handler.getClass();
        task.addOnCompleteListener(new java.util.concurrent.Executor() { // from class: com.google.android.gms.common.api.internal.zabk
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                handler.post(runnable);
            }
        }, zaa2);
    }

    public static com.google.android.gms.common.api.internal.GoogleApiManager zaj() {
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager;
        synchronized (zac) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zad, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = zad;
        }
        return googleApiManager;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static com.google.android.gms.common.api.internal.GoogleApiManager zak(android.content.Context context) {
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager;
        synchronized (zac) {
            if (zad == null) {
                zad = new com.google.android.gms.common.api.internal.GoogleApiManager(context.getApplicationContext(), com.google.android.gms.common.internal.GmsClientSupervisor.getOrStartHandlerThread().getLooper(), com.google.android.gms.common.GoogleApiAvailability.getInstance());
            }
            googleApiManager = zad;
        }
        return googleApiManager;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        com.google.android.gms.common.api.internal.ApiKey apiKey;
        boolean zaO;
        com.google.android.gms.common.api.internal.ApiKey apiKey2;
        com.google.android.gms.common.api.internal.ApiKey apiKey3;
        com.google.android.gms.common.api.internal.ApiKey apiKey4;
        com.google.android.gms.common.api.internal.ApiKey apiKey5;
        com.google.android.gms.common.api.internal.zabq zabqVar = null;
        switch (message.what) {
            case 1:
                this.zae = true == ((java.lang.Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.zar.removeMessages(12);
                for (com.google.android.gms.common.api.internal.ApiKey apiKey6 : this.zan.keySet()) {
                    android.os.Handler handler = this.zar;
                    handler.sendMessageDelayed(handler.obtainMessage(12, apiKey6), this.zae);
                }
                return true;
            case 2:
                com.google.android.gms.common.api.internal.zal zalVar = (com.google.android.gms.common.api.internal.zal) message.obj;
                java.util.Iterator it = zalVar.zab().iterator();
                while (true) {
                    if (it.hasNext()) {
                        com.google.android.gms.common.api.internal.ApiKey apiKey7 = (com.google.android.gms.common.api.internal.ApiKey) it.next();
                        com.google.android.gms.common.api.internal.zabq zabqVar2 = (com.google.android.gms.common.api.internal.zabq) this.zan.get(apiKey7);
                        if (zabqVar2 == null) {
                            zalVar.zac(apiKey7, new com.google.android.gms.common.ConnectionResult(13), null);
                        } else if (zabqVar2.zaz()) {
                            zalVar.zac(apiKey7, com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS, zabqVar2.zaf().getEndpointPackageName());
                        } else {
                            com.google.android.gms.common.ConnectionResult zad2 = zabqVar2.zad();
                            if (zad2 != null) {
                                zalVar.zac(apiKey7, zad2, null);
                            } else {
                                zabqVar2.zat(zalVar);
                                zabqVar2.zao();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (com.google.android.gms.common.api.internal.zabq zabqVar3 : this.zan.values()) {
                    zabqVar3.zan();
                    zabqVar3.zao();
                }
                return true;
            case 4:
            case 8:
            case 13:
                com.google.android.gms.common.api.internal.zach zachVar = (com.google.android.gms.common.api.internal.zach) message.obj;
                com.google.android.gms.common.api.internal.zabq zabqVar4 = (com.google.android.gms.common.api.internal.zabq) this.zan.get(zachVar.zac.getApiKey());
                if (zabqVar4 == null) {
                    zabqVar4 = zaG(zachVar.zac);
                }
                if (!zabqVar4.zaA() || this.zam.get() == zachVar.zab) {
                    zabqVar4.zap(zachVar.zaa);
                } else {
                    zachVar.zaa.zad(zaa);
                    zabqVar4.zav();
                }
                return true;
            case 5:
                int i = message.arg1;
                com.google.android.gms.common.ConnectionResult connectionResult = (com.google.android.gms.common.ConnectionResult) message.obj;
                java.util.Iterator it2 = this.zan.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        com.google.android.gms.common.api.internal.zabq zabqVar5 = (com.google.android.gms.common.api.internal.zabq) it2.next();
                        if (zabqVar5.zab() == i) {
                            zabqVar = zabqVar5;
                        }
                    }
                }
                if (zabqVar == null) {
                    android.util.Log.wtf("GoogleApiManager", "Could not find API instance " + i + " while trying to fail enqueued calls.", new java.lang.Exception());
                } else if (connectionResult.getErrorCode() == 13) {
                    zabqVar.zaE(new com.google.android.gms.common.api.Status(17, "Error resolution was canceled by the user, original error message: " + this.zaj.getErrorString(connectionResult.getErrorCode()) + ": " + connectionResult.getErrorMessage()));
                } else {
                    apiKey = zabqVar.zad;
                    zabqVar.zaE(zaF(apiKey, connectionResult));
                }
                return true;
            case 6:
                if (this.zai.getApplicationContext() instanceof android.app.Application) {
                    com.google.android.gms.common.api.internal.BackgroundDetector.initialize((android.app.Application) this.zai.getApplicationContext());
                    com.google.android.gms.common.api.internal.BackgroundDetector.getInstance().addListener(new com.google.android.gms.common.api.internal.zabl(this));
                    if (!com.google.android.gms.common.api.internal.BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.zae = 300000L;
                    }
                }
                return true;
            case 7:
                zaG((com.google.android.gms.common.api.GoogleApi) message.obj);
                return true;
            case 9:
                if (this.zan.containsKey(message.obj)) {
                    ((com.google.android.gms.common.api.internal.zabq) this.zan.get(message.obj)).zau();
                }
                return true;
            case 10:
                java.util.Iterator it3 = this.zaq.iterator();
                while (it3.hasNext()) {
                    com.google.android.gms.common.api.internal.zabq zabqVar6 = (com.google.android.gms.common.api.internal.zabq) this.zan.remove((com.google.android.gms.common.api.internal.ApiKey) it3.next());
                    if (zabqVar6 != null) {
                        zabqVar6.zav();
                    }
                }
                this.zaq.clear();
                return true;
            case 11:
                if (this.zan.containsKey(message.obj)) {
                    ((com.google.android.gms.common.api.internal.zabq) this.zan.get(message.obj)).zaw();
                }
                return true;
            case 12:
                if (this.zan.containsKey(message.obj)) {
                    ((com.google.android.gms.common.api.internal.zabq) this.zan.get(message.obj)).zaB();
                }
                return true;
            case 14:
                com.google.android.gms.common.api.internal.zaaf zaafVar = (com.google.android.gms.common.api.internal.zaaf) message.obj;
                com.google.android.gms.common.api.internal.ApiKey zaa2 = zaafVar.zaa();
                if (this.zan.containsKey(zaa2)) {
                    zaO = ((com.google.android.gms.common.api.internal.zabq) this.zan.get(zaa2)).zaO(false);
                    zaafVar.zab().setResult(java.lang.Boolean.valueOf(zaO));
                } else {
                    zaafVar.zab().setResult(false);
                }
                return true;
            case 15:
                com.google.android.gms.common.api.internal.zabs zabsVar = (com.google.android.gms.common.api.internal.zabs) message.obj;
                java.util.Map map = this.zan;
                apiKey2 = zabsVar.zaa;
                if (map.containsKey(apiKey2)) {
                    java.util.Map map2 = this.zan;
                    apiKey3 = zabsVar.zaa;
                    com.google.android.gms.common.api.internal.zabq.zal((com.google.android.gms.common.api.internal.zabq) map2.get(apiKey3), zabsVar);
                }
                return true;
            case 16:
                com.google.android.gms.common.api.internal.zabs zabsVar2 = (com.google.android.gms.common.api.internal.zabs) message.obj;
                java.util.Map map3 = this.zan;
                apiKey4 = zabsVar2.zaa;
                if (map3.containsKey(apiKey4)) {
                    java.util.Map map4 = this.zan;
                    apiKey5 = zabsVar2.zaa;
                    com.google.android.gms.common.api.internal.zabq.zam((com.google.android.gms.common.api.internal.zabq) map4.get(apiKey5), zabsVar2);
                }
                return true;
            case 17:
                zaI();
                return true;
            case 18:
                com.google.android.gms.common.api.internal.zace zaceVar = (com.google.android.gms.common.api.internal.zace) message.obj;
                if (zaceVar.zac == 0) {
                    zaH().log(new com.google.android.gms.common.internal.TelemetryData(zaceVar.zab, java.util.Arrays.asList(zaceVar.zaa)));
                } else {
                    com.google.android.gms.common.internal.TelemetryData telemetryData = this.zag;
                    if (telemetryData != null) {
                        java.util.List zab2 = telemetryData.zab();
                        if (telemetryData.zaa() != zaceVar.zab || (zab2 != null && zab2.size() >= zaceVar.zad)) {
                            this.zar.removeMessages(17);
                            zaI();
                        } else {
                            this.zag.zac(zaceVar.zaa);
                        }
                    }
                    if (this.zag == null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(zaceVar.zaa);
                        this.zag = new com.google.android.gms.common.internal.TelemetryData(zaceVar.zab, arrayList);
                        android.os.Handler handler2 = this.zar;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), zaceVar.zac);
                    }
                }
                return true;
            case 19:
                this.zaf = false;
                return true;
            default:
                android.util.Log.w("GoogleApiManager", "Unknown message id: " + message.what);
                return false;
        }
    }

    public final void zaA(com.google.android.gms.common.api.internal.zaae zaaeVar) {
        synchronized (zac) {
            if (this.zao != zaaeVar) {
                this.zao = zaaeVar;
                this.zap.clear();
            }
            this.zap.addAll(zaaeVar.zaa());
        }
    }

    final void zaB(com.google.android.gms.common.api.internal.zaae zaaeVar) {
        synchronized (zac) {
            if (this.zao == zaaeVar) {
                this.zao = null;
                this.zap.clear();
            }
        }
    }

    final boolean zaD() {
        if (this.zaf) {
            return false;
        }
        com.google.android.gms.common.internal.RootTelemetryConfiguration config = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance().getConfig();
        if (config != null && !config.getMethodInvocationTelemetryEnabled()) {
            return false;
        }
        int zaa2 = this.zak.zaa(this.zai, 203400000);
        return zaa2 == -1 || zaa2 == 0;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    final boolean zaE(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        return this.zaj.zah(this.zai, connectionResult, i);
    }

    public final int zaa() {
        return this.zal.getAndIncrement();
    }

    final com.google.android.gms.common.api.internal.zabq zai(com.google.android.gms.common.api.internal.ApiKey apiKey) {
        return (com.google.android.gms.common.api.internal.zabq) this.zan.get(apiKey);
    }

    public final com.google.android.gms.tasks.Task zam(java.lang.Iterable iterable) {
        com.google.android.gms.common.api.internal.zal zalVar = new com.google.android.gms.common.api.internal.zal(iterable);
        this.zar.sendMessage(this.zar.obtainMessage(2, zalVar));
        return zalVar.zaa();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final com.google.android.gms.tasks.Task zan(com.google.android.gms.common.api.GoogleApi googleApi) {
        com.google.android.gms.common.api.internal.zaaf zaafVar = new com.google.android.gms.common.api.internal.zaaf(googleApi.getApiKey());
        this.zar.sendMessage(this.zar.obtainMessage(14, zaafVar));
        return zaafVar.zab().getTask();
    }

    public final com.google.android.gms.tasks.Task zao(com.google.android.gms.common.api.GoogleApi googleApi, com.google.android.gms.common.api.internal.RegisterListenerMethod registerListenerMethod, com.google.android.gms.common.api.internal.UnregisterListenerMethod unregisterListenerMethod, java.lang.Runnable runnable) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        zaJ(taskCompletionSource, registerListenerMethod.zaa(), googleApi);
        this.zar.sendMessage(this.zar.obtainMessage(8, new com.google.android.gms.common.api.internal.zach(new com.google.android.gms.common.api.internal.zaf(new com.google.android.gms.common.api.internal.zaci(registerListenerMethod, unregisterListenerMethod, runnable), taskCompletionSource), this.zam.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final com.google.android.gms.tasks.Task zap(com.google.android.gms.common.api.GoogleApi googleApi, com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey, int i) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        zaJ(taskCompletionSource, i, googleApi);
        this.zar.sendMessage(this.zar.obtainMessage(13, new com.google.android.gms.common.api.internal.zach(new com.google.android.gms.common.api.internal.zah(listenerKey, taskCompletionSource), this.zam.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final void zau(com.google.android.gms.common.api.GoogleApi googleApi, int i, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apiMethodImpl) {
        this.zar.sendMessage(this.zar.obtainMessage(4, new com.google.android.gms.common.api.internal.zach(new com.google.android.gms.common.api.internal.zae(i, apiMethodImpl), this.zam.get(), googleApi)));
    }

    public final void zav(com.google.android.gms.common.api.GoogleApi googleApi, int i, com.google.android.gms.common.api.internal.TaskApiCall taskApiCall, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.common.api.internal.StatusExceptionMapper statusExceptionMapper) {
        zaJ(taskCompletionSource, taskApiCall.zaa(), googleApi);
        this.zar.sendMessage(this.zar.obtainMessage(4, new com.google.android.gms.common.api.internal.zach(new com.google.android.gms.common.api.internal.zag(i, taskApiCall, taskCompletionSource, statusExceptionMapper), this.zam.get(), googleApi)));
    }

    final void zaw(com.google.android.gms.common.internal.MethodInvocation methodInvocation, int i, long j, int i2) {
        this.zar.sendMessage(this.zar.obtainMessage(18, new com.google.android.gms.common.api.internal.zace(methodInvocation, i, j, i2)));
    }

    public final void zax(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        if (zaE(connectionResult, i)) {
            return;
        }
        android.os.Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
    }

    public final void zay() {
        android.os.Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void zaz(com.google.android.gms.common.api.GoogleApi googleApi) {
        android.os.Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }
}
