package com.ironsource;

/* loaded from: classes5.dex */
public class Kg<Smash extends com.ironsource.AbstractC3107j3<?>> {
    com.ironsource.AbstractC3107j3<?> d;
    private final java.util.List<java.lang.String> e;
    private final int f;
    com.ironsource.Lg h;

    /* renamed from: a, reason: collision with root package name */
    java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<Smash>> f5807a = new java.util.concurrent.ConcurrentHashMap<>();
    private java.lang.String b = "";
    private java.lang.String c = "";
    private final java.util.Timer g = new java.util.Timer();
    private final int i = 5;

    class a extends java.util.TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f5808a;

        a(java.lang.String str) {
            this.f5808a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.f5808a + " from memory");
                com.ironsource.Kg.this.f5807a.remove(this.f5808a);
                ironLog.verbose("waterfall size is currently " + com.ironsource.Kg.this.f5807a.size());
            } finally {
                cancel();
            }
        }
    }

    public Kg(java.util.List<java.lang.String> list, int i, com.ironsource.Lg lg) {
        this.e = list;
        this.f = i;
        this.h = lg;
    }

    private synchronized boolean e() {
        boolean z;
        com.ironsource.AbstractC3107j3<?> abstractC3107j3 = this.d;
        if (abstractC3107j3 != null && abstractC3107j3.C()) {
            z = this.d.h().equals(this.c);
        }
        return z;
    }

    public synchronized void a(com.ironsource.AbstractC3107j3<?> abstractC3107j3) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose();
        com.ironsource.AbstractC3107j3<?> abstractC3107j32 = this.d;
        if (abstractC3107j32 != null && !abstractC3107j32.equals(abstractC3107j3)) {
            this.d.M();
        }
    }

    public synchronized void b(com.ironsource.AbstractC3107j3<?> abstractC3107j3) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose();
        this.d = abstractC3107j3;
    }

    public java.lang.String c() {
        return this.b;
    }

    public com.ironsource.AbstractC3107j3<?> d() {
        return this.d;
    }

    public java.util.List<Smash> b() {
        java.util.concurrent.CopyOnWriteArrayList<Smash> copyOnWriteArrayList = this.f5807a.get(this.b);
        return copyOnWriteArrayList == null ? new java.util.concurrent.CopyOnWriteArrayList() : copyOnWriteArrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0038, code lost:
    
        if (r0.e.contains(r3) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0044, code lost:
    
        if (r0.d.n().equals(r3) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0049 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0049, B:13:0x0008, B:15:0x000d, B:18:0x0012, B:20:0x0016, B:23:0x001d, B:25:0x0021, B:28:0x002e, B:30:0x0032, B:32:0x003a), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean a(com.ironsource.O0.a aVar, java.lang.String str, java.lang.String str2, com.ironsource.mediationsdk.LoadWhileShowSupportState loadWhileShowSupportState, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface, com.ironsource.mediationsdk.IronSource.a aVar2) {
        boolean z;
        if (!a(adapterBaseInterface, aVar2, str)) {
            z = true;
            if (aVar != com.ironsource.O0.a.AUTOMATIC_LOAD_WHILE_SHOW) {
                if (aVar != com.ironsource.O0.a.MANUAL_WITH_LOAD_ON_SHOW) {
                    if (!z) {
                        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(str + " will not be added to the auction request");
                    }
                }
            }
            com.ironsource.AbstractC3107j3<?> abstractC3107j3 = this.d;
            if (abstractC3107j3 != null) {
                if (abstractC3107j3.C()) {
                    if (loadWhileShowSupportState == com.ironsource.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK) {
                        if (this.d.c().equals(str)) {
                        }
                    }
                    if (loadWhileShowSupportState != com.ironsource.mediationsdk.LoadWhileShowSupportState.NONE) {
                    }
                }
            }
            if (!z) {
            }
        }
        z = false;
        if (!z) {
        }
        return z;
    }

    public boolean a(com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface, com.ironsource.mediationsdk.IronSource.a aVar, java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose();
        if (com.ironsource.environment.ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface) || !((com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(com.ironsource.Ff.a(aVar))) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }

    public void a(com.ironsource.O0.a aVar, java.util.concurrent.CopyOnWriteArrayList<Smash> copyOnWriteArrayList, java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        a();
        if (aVar != com.ironsource.O0.a.AUTOMATIC_LOAD_WHILE_SHOW && aVar != com.ironsource.O0.a.MANUAL_WITH_LOAD_ON_SHOW) {
            this.f5807a.clear();
            this.f5807a.put(str, copyOnWriteArrayList);
        } else {
            this.f5807a.put(str, copyOnWriteArrayList);
            if (!android.text.TextUtils.isEmpty(this.c)) {
                if (e()) {
                    ironLog.verbose("ad from previous waterfall " + this.c + " is still showing - the current waterfall " + this.b + " will be deleted instead");
                    java.lang.String str2 = this.b;
                    this.b = this.c;
                    this.c = str2;
                }
                this.g.schedule(new com.ironsource.Kg.a(this.c), this.f);
            }
        }
        this.c = this.b;
        this.b = str;
        if (this.f5807a.size() > 5) {
            this.h.a(this.f5807a.size());
        }
    }

    private void a() {
        for (Smash smash : b()) {
            if (!smash.equals(this.d)) {
                smash.M();
            }
        }
    }
}
