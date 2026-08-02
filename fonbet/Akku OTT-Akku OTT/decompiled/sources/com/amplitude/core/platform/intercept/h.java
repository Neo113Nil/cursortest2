package com.amplitude.core.platform.intercept;

import com.amplitude.core.k;
import com.amplitude.core.utilities.n;
import com.amplitude.core.utilities.u;
import com.amplitude.core.utilities.y;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C1082i;

/* loaded from: classes3.dex */
public final class h {
    public final k a;
    public final com.amplitude.core.b b;
    public final com.amplitude.common.a c;
    public final com.amplitude.android.h d;
    public final com.amplitude.core.platform.plugins.a e;
    public final AtomicBoolean f;
    public String g;
    public String h;
    public final AtomicBoolean i;
    public final c j;

    public h(k storage, com.amplitude.core.b amplitude, com.amplitude.common.a logger, com.amplitude.android.h configuration, com.amplitude.core.platform.plugins.a plugin) {
        c cVar;
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        this.a = storage;
        this.b = amplitude;
        this.c = logger;
        this.d = configuration;
        this.e = plugin;
        this.f = new AtomicBoolean(false);
        this.i = new AtomicBoolean(false);
        c.Companion.getClass();
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        if (storage instanceof n) {
            cVar = new a((n) storage, logger, amplitude);
        } else if (storage instanceof u) {
            cVar = new b((u) storage);
        } else {
            logger.d("Custom storage, identify intercept not started");
            cVar = null;
        }
        this.j = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ea, code lost:
    
        if (r13.isEmpty() == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b2, code lost:
    
        if (c(r0) == r1) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.amplitude.core.events.a aVar, ContinuationImpl continuationImpl) {
        d dVar;
        int i;
        boolean z;
        h hVar;
        String a;
        h hVar2;
        if (continuationImpl instanceof d) {
            dVar = (d) continuationImpl;
            int i2 = dVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.e = i2 - Integer.MIN_VALUE;
                Object obj = dVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dVar.e;
                boolean z2 = false;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.j == null) {
                        return aVar;
                    }
                    if (this.i.getAndSet(true)) {
                        String str = this.g;
                        String str2 = aVar.a;
                        if (!(str == null && str2 == null) && (str == null || str2 == null || !Intrinsics.areEqual(str, str2))) {
                            this.g = aVar.a;
                            z = true;
                        } else {
                            z = false;
                        }
                        String str3 = this.h;
                        String str4 = aVar.b;
                        if ((str3 != null || str4 != null) && (str3 == null || str4 == null || !Intrinsics.areEqual(str3, str4))) {
                            this.h = aVar.b;
                        }
                        if (z) {
                            dVar.a = this;
                            dVar.b = aVar;
                            dVar.e = 1;
                        }
                        hVar = this;
                    } else {
                        this.g = aVar.a;
                        this.h = aVar.b;
                    }
                    z = true;
                    if (z) {
                    }
                    hVar = this;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            hVar2 = (h) dVar.a;
                            ResultKt.throwOnFailure(obj);
                            com.amplitude.core.b bVar = hVar2.b;
                            C1082i.c(bVar.c, bVar.f, null, new f(hVar2, null), 2);
                            return null;
                        }
                        if (i != 3 && i != 4 && i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.amplitude.core.events.a aVar2 = (com.amplitude.core.events.a) dVar.a;
                        ResultKt.throwOnFailure(obj);
                        return aVar2;
                    }
                    aVar = dVar.b;
                    hVar = (h) dVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                a = aVar.a();
                if (Intrinsics.areEqual(a, "$identify")) {
                    if (!Intrinsics.areEqual(a, "$groupidentify")) {
                        dVar.a = aVar;
                        dVar.b = null;
                        dVar.e = 5;
                        if (hVar.c(dVar) == coroutine_suspended) {
                        }
                    }
                }
                hVar.getClass();
                com.amplitude.core.events.d[] dVarArr = com.amplitude.core.events.d.a;
                Map<String, Object> map = aVar.Q;
                if (map != null && map.size() == 1 && map.containsKey("$set")) {
                    Map<String, Object> map2 = aVar.R;
                    if (map2 != null) {
                        Intrinsics.checkNotNull(map2);
                    }
                    dVar.a = hVar;
                    dVar.b = null;
                    dVar.e = 2;
                    if (hVar.b(aVar, dVar) != coroutine_suspended) {
                        hVar2 = hVar;
                        com.amplitude.core.b bVar2 = hVar2.b;
                        C1082i.c(bVar2.c, bVar2.f, null, new f(hVar2, null), 2);
                        return null;
                    }
                }
                com.amplitude.core.events.d[] dVarArr2 = com.amplitude.core.events.d.a;
                Map<String, Object> map3 = aVar.Q;
                if (map3 != null && map3.size() == 1 && map3.containsKey("$clearAll")) {
                    z2 = true;
                }
                if (z2) {
                    dVar.a = aVar;
                    dVar.b = null;
                    dVar.e = 3;
                    c cVar = hVar.j;
                    Intrinsics.checkNotNull(cVar);
                    Object b = cVar.b(dVar);
                    if (b != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        b = Unit.INSTANCE;
                    }
                    return b == coroutine_suspended ? coroutine_suspended : aVar;
                }
                dVar.a = aVar;
                dVar.b = null;
                dVar.e = 4;
                if (hVar.c(dVar) == coroutine_suspended) {
                }
            }
        }
        dVar = new d(this, continuationImpl);
        Object obj2 = dVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dVar.e;
        boolean z22 = false;
        if (i != 0) {
        }
        a = aVar.a();
        if (Intrinsics.areEqual(a, "$identify")) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(com.amplitude.core.events.a aVar, ContinuationImpl continuationImpl) {
        e eVar;
        int i;
        h hVar;
        if (continuationImpl instanceof e) {
            eVar = (e) continuationImpl;
            int i2 = eVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.d = i2 - Integer.MIN_VALUE;
                Object obj = eVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = eVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        k kVar = this.a;
                        eVar.a = this;
                        eVar.d = 1;
                        if (kVar.h(aVar, eVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Exception e) {
                        e = e;
                        hVar = this;
                        y.d(e, hVar.c, "Error when intercepting identifies");
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hVar = eVar.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e2) {
                        e = e2;
                        y.d(e, hVar.c, "Error when intercepting identifies");
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        eVar = new e(this, continuationImpl);
        Object obj2 = eVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = eVar.d;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        g gVar;
        int i;
        h hVar;
        com.amplitude.core.events.a event;
        if (continuationImpl instanceof g) {
            gVar = (g) continuationImpl;
            int i2 = gVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.d = i2 - Integer.MIN_VALUE;
                Object obj = gVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    gVar.a = this;
                    gVar.d = 1;
                    c cVar = this.j;
                    Intrinsics.checkNotNull(cVar);
                    obj = cVar.a(gVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    hVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hVar = gVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                event = (com.amplitude.core.events.a) obj;
                if (event != null) {
                    com.amplitude.core.platform.plugins.a aVar = hVar.e;
                    Intrinsics.checkNotNullParameter(event, "event");
                    com.amplitude.core.platform.b bVar = aVar.e;
                    if (bVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pipeline");
                        bVar = null;
                    }
                    bVar.a(event);
                }
                return Unit.INSTANCE;
            }
        }
        gVar = new g(this, continuationImpl);
        Object obj2 = gVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gVar.d;
        if (i != 0) {
        }
        event = (com.amplitude.core.events.a) obj2;
        if (event != null) {
        }
        return Unit.INSTANCE;
    }
}
