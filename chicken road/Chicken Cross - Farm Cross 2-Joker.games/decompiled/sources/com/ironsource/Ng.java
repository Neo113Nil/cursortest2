package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC4419g3;
import com.ironsource.M0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes6.dex */
public class Ng<Smash extends AbstractC4419g3<?>> {
    AbstractC4419g3<?> d;
    private final List<String> e;
    private final int f;
    Og h;

    /* renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, CopyOnWriteArrayList<Smash>> f7816a = new ConcurrentHashMap<>();
    private String b = "";
    private String c = "";
    private final Timer g = new Timer();
    private final int i = 5;

    class a extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7817a;

        a(String str) {
            this.f7817a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.f7817a + " from memory");
                Ng.this.f7816a.remove(this.f7817a);
                ironLog.verbose("waterfall size is currently " + Ng.this.f7816a.size());
            } finally {
                cancel();
            }
        }
    }

    public Ng(List<String> list, int i, Og og) {
        this.e = list;
        this.f = i;
        this.h = og;
    }

    private synchronized boolean e() {
        boolean z;
        AbstractC4419g3<?> abstractC4419g3 = this.d;
        if (abstractC4419g3 != null && abstractC4419g3.C()) {
            z = this.d.h().equals(this.c);
        }
        return z;
    }

    public synchronized void a(AbstractC4419g3<?> abstractC4419g3) {
        IronLog.INTERNAL.verbose();
        AbstractC4419g3<?> abstractC4419g32 = this.d;
        if (abstractC4419g32 != null && !abstractC4419g32.equals(abstractC4419g3)) {
            this.d.M();
        }
    }

    public synchronized void b(AbstractC4419g3<?> abstractC4419g3) {
        IronLog.INTERNAL.verbose();
        this.d = abstractC4419g3;
    }

    public String c() {
        return this.b;
    }

    public AbstractC4419g3<?> d() {
        return this.d;
    }

    public List<Smash> b() {
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = this.f7816a.get(this.b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList() : copyOnWriteArrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0038, code lost:
    
        if (r0.e.contains(r3) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0044, code lost:
    
        if (r0.d.n().equals(r3) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0049 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0049, B:13:0x0008, B:15:0x000d, B:18:0x0012, B:20:0x0016, B:23:0x001d, B:25:0x0021, B:28:0x002e, B:30:0x0032, B:32:0x003a), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean a(M0.a aVar, String str, String str2, LoadWhileShowSupportState loadWhileShowSupportState, AdapterBaseInterface adapterBaseInterface, IronSource.a aVar2) {
        boolean z;
        if (!a(adapterBaseInterface, aVar2, str)) {
            z = true;
            if (aVar != M0.a.AUTOMATIC_LOAD_WHILE_SHOW) {
                if (aVar != M0.a.MANUAL_WITH_LOAD_ON_SHOW) {
                    if (!z) {
                        IronLog.INTERNAL.verbose(str + " will not be added to the auction request");
                    }
                }
            }
            AbstractC4419g3<?> abstractC4419g3 = this.d;
            if (abstractC4419g3 != null) {
                if (abstractC4419g3.C()) {
                    if (loadWhileShowSupportState == LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK) {
                        if (this.d.c().equals(str)) {
                        }
                    }
                    if (loadWhileShowSupportState != LoadWhileShowSupportState.NONE) {
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

    public boolean a(AdapterBaseInterface adapterBaseInterface, IronSource.a aVar, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof AdapterSettingsInterface) || !((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(Gf.a(aVar))) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }

    public void a(M0.a aVar, CopyOnWriteArrayList<Smash> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        a();
        if (aVar != M0.a.AUTOMATIC_LOAD_WHILE_SHOW && aVar != M0.a.MANUAL_WITH_LOAD_ON_SHOW) {
            this.f7816a.clear();
            this.f7816a.put(str, copyOnWriteArrayList);
        } else {
            this.f7816a.put(str, copyOnWriteArrayList);
            if (!TextUtils.isEmpty(this.c)) {
                if (e()) {
                    ironLog.verbose("ad from previous waterfall " + this.c + " is still showing - the current waterfall " + this.b + " will be deleted instead");
                    String str2 = this.b;
                    this.b = this.c;
                    this.c = str2;
                }
                this.g.schedule(new a(this.c), this.f);
            }
        }
        this.c = this.b;
        this.b = str;
        if (this.f7816a.size() > 5) {
            this.h.a(this.f7816a.size());
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
