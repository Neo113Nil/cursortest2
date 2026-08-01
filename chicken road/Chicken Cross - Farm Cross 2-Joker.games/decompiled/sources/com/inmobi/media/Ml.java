package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Ml {

    /* renamed from: a, reason: collision with root package name */
    public static final Ml f6723a = new Ml();
    public static final Vl b = new Vl();
    public static final CoroutineScope c = AbstractC3904ma.d;
    public static final Lazy d = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Ml$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Ml.a();
        }
    });
    public static final Gl e = new Gl();
    public static final AtomicBoolean f = new AtomicBoolean(false);
    public static final MutableStateFlow g = StateFlowKt.MutableStateFlow(Boolean.TRUE);

    public static void b(Context context, List list, List list2, long j) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            InterfaceC4195wl interfaceC4195wl = (InterfaceC4195wl) pair.component1();
            Pair pair2 = TuplesKt.to(interfaceC4195wl.a(), new Pair(interfaceC4195wl, (SignalsConfig.SynapseCollectorConfig) pair.component2()));
            linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof Bl) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Bl bl = (Bl) it2.next();
            try {
                String collectorId = bl.f6480a;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(collectorId, "collectorId");
                Vl.a(context).a(Vl.c(collectorId), j, false);
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                Intrinsics.checkNotNullExpressionValue("Ml", "TAG");
                String str = "Failed to write lastRunAt for '" + bl.f6480a + "': " + e3.getMessage();
            }
            try {
                String collectorId2 = bl.f6480a;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(collectorId2, "collectorId");
                Vl.a(context).a(Vl.b(collectorId2), 0, false);
            } catch (CancellationException e4) {
                throw e4;
            } catch (Exception e5) {
                Intrinsics.checkNotNullExpressionValue("Ml", "TAG");
                String str2 = "Failed to reset failureCount for '" + bl.f6480a + "': " + e5.getMessage();
            }
            Pair pair3 = (Pair) linkedHashMap.get(bl.f6480a);
            if (pair3 != null) {
                a(context, bl.f6480a, (InterfaceC4195wl) pair3.component1(), (SignalsConfig.SynapseCollectorConfig) pair3.component2());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d1, code lost:
    
        if (r5 == r4) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102 A[LOOP:1: B:48:0x00fc->B:50:0x0102, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, SignalsConfig signalsConfig, ContinuationImpl continuationImpl) {
        Hl hl;
        int i;
        ArrayList a2;
        Object supervisorScope;
        List list;
        Iterator it;
        JSONObject a3;
        List list2;
        long j;
        Context context2;
        JSONObject jSONObject;
        Context context3;
        List list3;
        long j2;
        Ul ul;
        Context context4 = context;
        if (continuationImpl instanceof Hl) {
            hl = (Hl) continuationImpl;
            int i2 = hl.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hl.i = i2 - Integer.MIN_VALUE;
                Object obj = hl.g;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = hl.i;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4168vl c4168vl = new C4168vl();
                    Collection values = ((Al) d.getValue()).f6460a.values();
                    Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
                    a2 = c4168vl.a(context4, signalsConfig, CollectionsKt.toList(values));
                    if (a2.isEmpty()) {
                        Intrinsics.checkNotNullExpressionValue("Ml", "TAG");
                        HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Boxing.boxShort((short) 2513)));
                        C3829jm c3829jm = C3829jm.f7187a;
                        C3829jm.b("SynapsePushAborted", hashMapOf, EnumC3944nm.f7271a);
                        return Unit.INSTANCE;
                    }
                    Kl kl = new Kl(a2, context4, null);
                    hl.f6608a = context4;
                    hl.b = a2;
                    hl.i = 1;
                    supervisorScope = SupervisorKt.supervisorScope(kl, hl);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            long j3 = hl.e;
                            jSONObject = hl.d;
                            List list4 = hl.c;
                            list2 = hl.b;
                            context2 = hl.f6608a;
                            ResultKt.throwOnFailure(obj);
                            list = list4;
                            j = j3;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Gl gl = e;
                            hl.f6608a = context2;
                            hl.b = list2;
                            hl.c = list;
                            hl.d = jSONObject;
                            hl.e = j;
                            hl.f = elapsedRealtime;
                            hl.i = 3;
                            obj = gl.invoke(jSONObject, hl);
                            if (obj != coroutine_suspended) {
                                context3 = context2;
                                list3 = list;
                                j2 = elapsedRealtime;
                                ul = (Ul) obj;
                                if (!Intrinsics.areEqual(ul, Tl.f6876a)) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j2 = hl.f;
                        j = hl.e;
                        jSONObject = hl.d;
                        list3 = hl.c;
                        list2 = hl.b;
                        context3 = hl.f6608a;
                        ResultKt.throwOnFailure(obj);
                        ul = (Ul) obj;
                        if (!Intrinsics.areEqual(ul, Tl.f6876a)) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - j2;
                            b(context3, list2, list3, j);
                            a(context3, list2, list3, true);
                            Intrinsics.checkNotNullExpressionValue("Ml", "TAG");
                            String str = "Synapse payload pushed (" + jSONObject.length() + " keys).";
                            HashMap hashMapOf2 = MapsKt.hashMapOf(TuplesKt.to("latency", Boxing.boxLong(elapsedRealtime2)));
                            C3829jm c3829jm2 = C3829jm.f7187a;
                            C3829jm.b("SynapsePushSuccess", hashMapOf2, EnumC3944nm.f7271a);
                            Intrinsics.checkNotNullExpressionValue("Ml", "TAG");
                            jSONObject.toString();
                            return Unit.INSTANCE;
                        }
                        if (!(ul instanceof Sl)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        long elapsedRealtime3 = SystemClock.elapsedRealtime() - j2;
                        Intrinsics.checkNotNullExpressionValue("Ml", "TAG");
                        Sl sl = (Sl) ul;
                        String str2 = "Synapse payload push failed [" + sl.f6856a + "]. Skipping store update.";
                        a(context3, list2, list3, false);
                        int i3 = sl.f6856a;
                        HashMap hashMapOf3 = MapsKt.hashMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Boxing.boxShort((-32768 > i3 || i3 >= 32768) ? (short) 2515 : (short) i3)), TuplesKt.to("latency", Boxing.boxLong(elapsedRealtime3)));
                        C3829jm c3829jm3 = C3829jm.f7187a;
                        C3829jm.b("SynapsePushFailure", hashMapOf3, EnumC3944nm.f7271a);
                        return Unit.INSTANCE;
                    }
                    ?? r0 = hl.b;
                    Context context5 = hl.f6608a;
                    ResultKt.throwOnFailure(obj);
                    a2 = r0;
                    context4 = context5;
                    supervisorScope = obj;
                }
                list = (List) supervisorScope;
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof Cl) {
                        arrayList.add(obj2);
                    }
                }
                for (it = arrayList.iterator(); it.hasNext(); it = it) {
                    Cl cl = (Cl) it.next();
                    Intrinsics.checkNotNullExpressionValue("Ml", "TAG");
                    String str3 = "Collector '" + cl.f6498a + "' failed [" + ((int) cl.b) + "]: " + cl.c;
                }
                a(context4, a2, list, currentTimeMillis);
                a3 = Ol.a(list);
                if (a3.length() != 0) {
                    Intrinsics.checkNotNullExpressionValue("Ml", "TAG");
                    HashMap hashMapOf4 = MapsKt.hashMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Boxing.boxShort((short) 2514)));
                    C3829jm c3829jm4 = C3829jm.f7187a;
                    C3829jm.b("SynapsePushAborted", hashMapOf4, EnumC3944nm.f7271a);
                    return Unit.INSTANCE;
                }
                MutableStateFlow mutableStateFlow = g;
                Il il = new Il(null);
                hl.f6608a = context4;
                hl.b = a2;
                hl.c = list;
                hl.d = a3;
                hl.e = currentTimeMillis;
                hl.i = 2;
                if (FlowKt.first(mutableStateFlow, il, hl) != coroutine_suspended) {
                    list2 = a2;
                    j = currentTimeMillis;
                    context2 = context4;
                    jSONObject = a3;
                    long elapsedRealtime4 = SystemClock.elapsedRealtime();
                    Gl gl2 = e;
                    hl.f6608a = context2;
                    hl.b = list2;
                    hl.c = list;
                    hl.d = jSONObject;
                    hl.e = j;
                    hl.f = elapsedRealtime4;
                    hl.i = 3;
                    obj = gl2.invoke(jSONObject, hl);
                    if (obj != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        hl = new Hl(this, continuationImpl);
        Object obj3 = hl.g;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = hl.i;
        if (i != 0) {
        }
        list = (List) supervisorScope;
        long currentTimeMillis2 = System.currentTimeMillis();
        ArrayList arrayList2 = new ArrayList();
        while (r16.hasNext()) {
        }
        while (it.hasNext()) {
        }
        a(context4, a2, list, currentTimeMillis2);
        a3 = Ol.a(list);
        if (a3.length() != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, InterfaceC4195wl interfaceC4195wl, SignalsConfig.SynapseCollectorConfig synapseCollectorConfig, ContinuationImpl continuationImpl) {
        Fl fl;
        int i;
        Exception exc;
        long j;
        CancellationException cancellationException;
        Object cl;
        HashMap hashMapOf;
        InterfaceC4195wl interfaceC4195wl2 = interfaceC4195wl;
        if (continuationImpl instanceof Fl) {
            fl = (Fl) continuationImpl;
            int i2 = fl.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fl.e = i2 - Integer.MIN_VALUE;
                Object obj = fl.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fl.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        fl.f6563a = interfaceC4195wl2;
                        fl.b = elapsedRealtime;
                        fl.e = 1;
                        obj = interfaceC4195wl2.a(context, synapseCollectorConfig, fl);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        j = elapsedRealtime;
                    } catch (CancellationException e2) {
                        cancellationException = e2;
                        j = elapsedRealtime;
                        if (!JobKt.isActive(fl.getContext())) {
                        }
                    } catch (Exception e3) {
                        exc = e3;
                        j = elapsedRealtime;
                        Intrinsics.checkNotNullExpressionValue("Ml", "TAG");
                        String str = "Collector '" + interfaceC4195wl2.a() + "' threw: " + exc.getMessage();
                        Lazy lazy = Ba.f6473a;
                        Ba.a(new C3810j3(exc));
                        cl = new Cl(interfaceC4195wl2.a(), (short) 2509, null, exc, 4);
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - j;
                        if (cl instanceof Bl) {
                        }
                        C3829jm c3829jm = C3829jm.f7187a;
                        C3829jm.b("SynapseCollectorCompleted", hashMapOf, EnumC3944nm.f7271a);
                        return cl;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = fl.b;
                    interfaceC4195wl2 = fl.f6563a;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (CancellationException e4) {
                        cancellationException = e4;
                        if (!JobKt.isActive(fl.getContext())) {
                            Intrinsics.checkNotNullExpressionValue("Ml", "TAG");
                            String str2 = "Collector '" + interfaceC4195wl2.a() + "' cancelled: " + cancellationException.getMessage();
                            cl = new Cl(interfaceC4195wl2.a(), (short) 2517, null, cancellationException, 4);
                            long elapsedRealtime22 = SystemClock.elapsedRealtime() - j;
                            if (cl instanceof Bl) {
                            }
                            C3829jm c3829jm2 = C3829jm.f7187a;
                            C3829jm.b("SynapseCollectorCompleted", hashMapOf, EnumC3944nm.f7271a);
                            return cl;
                        }
                        throw cancellationException;
                    } catch (Exception e5) {
                        exc = e5;
                        Intrinsics.checkNotNullExpressionValue("Ml", "TAG");
                        String str3 = "Collector '" + interfaceC4195wl2.a() + "' threw: " + exc.getMessage();
                        Lazy lazy2 = Ba.f6473a;
                        Ba.a(new C3810j3(exc));
                        cl = new Cl(interfaceC4195wl2.a(), (short) 2509, null, exc, 4);
                        long elapsedRealtime222 = SystemClock.elapsedRealtime() - j;
                        if (cl instanceof Bl) {
                        }
                        C3829jm c3829jm22 = C3829jm.f7187a;
                        C3829jm.b("SynapseCollectorCompleted", hashMapOf, EnumC3944nm.f7271a);
                        return cl;
                    }
                }
                cl = (El) obj;
                long elapsedRealtime2222 = SystemClock.elapsedRealtime() - j;
                if (cl instanceof Bl) {
                    hashMapOf = MapsKt.hashMapOf(TuplesKt.to("trigger", ((Bl) cl).f6480a), TuplesKt.to("latency", Boxing.boxLong(elapsedRealtime2222)));
                } else if (cl instanceof Dl) {
                    hashMapOf = MapsKt.hashMapOf(TuplesKt.to("trigger", ((Dl) cl).f6517a), TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Boxing.boxShort((short) 2506)), TuplesKt.to("latency", Boxing.boxLong(elapsedRealtime2222)));
                } else if (cl instanceof Cl) {
                    Cl cl2 = (Cl) cl;
                    hashMapOf = MapsKt.hashMapOf(TuplesKt.to("trigger", cl2.f6498a), TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Boxing.boxShort(cl2.b)), TuplesKt.to("latency", Boxing.boxLong(elapsedRealtime2222)));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                C3829jm c3829jm222 = C3829jm.f7187a;
                C3829jm.b("SynapseCollectorCompleted", hashMapOf, EnumC3944nm.f7271a);
                return cl;
            }
        }
        fl = new Fl(this, continuationImpl);
        Object obj2 = fl.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fl.e;
        if (i != 0) {
        }
        cl = (El) obj2;
        long elapsedRealtime22222 = SystemClock.elapsedRealtime() - j;
        if (cl instanceof Bl) {
        }
        C3829jm c3829jm2222 = C3829jm.f7187a;
        C3829jm.b("SynapseCollectorCompleted", hashMapOf, EnumC3944nm.f7271a);
        return cl;
    }

    public static final InterfaceC4195wl a(Pair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (InterfaceC4195wl) it.getFirst();
    }

    public static final boolean a(Set set, InterfaceC4195wl it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return set.contains(it.a());
    }

    public static void a(Context context, String str, InterfaceC4195wl interfaceC4195wl, SignalsConfig.SynapseCollectorConfig synapseCollectorConfig) {
        try {
            String a2 = interfaceC4195wl.a(synapseCollectorConfig);
            if (a2 != null) {
                Vl.a(context, str, a2);
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            Intrinsics.checkNotNullExpressionValue("Ml", "TAG");
            String str2 = "Failed to write fingerprint for '" + str + "': " + e3.getMessage();
        }
    }

    public static final Al a() {
        Al al = new Al();
        al.a(new C3622cb());
        al.a(new H1());
        return al;
    }

    public static void a(Context context, List list, List list2, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof Bl) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Bl) it.next()).f6480a);
        }
        final Set set = CollectionsKt.toSet(arrayList2);
        for (InterfaceC4195wl interfaceC4195wl : SequencesKt.filter(SequencesKt.map(CollectionsKt.asSequence(list), new Function1() { // from class: com.inmobi.media.Ml$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Ml.a((Pair) obj2);
            }
        }), new Function1() { // from class: com.inmobi.media.Ml$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(Ml.a(set, (InterfaceC4195wl) obj2));
            }
        })) {
            if (z) {
                try {
                    interfaceC4195wl.a(context);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Exception e3) {
                    Intrinsics.checkNotNullExpressionValue("Ml", "TAG");
                    String str = "Push callback failed for '" + interfaceC4195wl.a() + "': " + e3.getMessage();
                }
            } else {
                interfaceC4195wl.b(context);
            }
        }
    }

    public static void a(Context context, List list, List list2, long j) {
        Iterator it;
        LinkedHashMap linkedHashMap;
        String str;
        String str2;
        Cl cl;
        Db a2;
        String key;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            InterfaceC4195wl interfaceC4195wl = (InterfaceC4195wl) pair.component1();
            Pair pair2 = TuplesKt.to(interfaceC4195wl.a(), new Pair(interfaceC4195wl, (SignalsConfig.SynapseCollectorConfig) pair.component2()));
            linkedHashMap2.put(pair2.getFirst(), pair2.getSecond());
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            El el = (El) it3.next();
            if (el instanceof Dl) {
                try {
                    String collectorId = ((Dl) el).f6517a;
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(collectorId, "collectorId");
                    Vl.a(context).a(Vl.c(collectorId), j, false);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Exception e3) {
                    Intrinsics.checkNotNullExpressionValue("Ml", "TAG");
                    String str3 = "Failed to write lastRunAt for '" + ((Dl) el).f6517a + "': " + e3.getMessage();
                }
                try {
                    String collectorId2 = ((Dl) el).f6517a;
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(collectorId2, "collectorId");
                    Vl.a(context).a(Vl.b(collectorId2), 0, false);
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Exception e5) {
                    Intrinsics.checkNotNullExpressionValue("Ml", "TAG");
                    String str4 = "Failed to reset failureCount for '" + ((Dl) el).f6517a + "': " + e5.getMessage();
                }
                Dl dl = (Dl) el;
                Pair pair3 = (Pair) linkedHashMap2.get(dl.f6517a);
                if (pair3 != null) {
                    a(context, dl.f6517a, (InterfaceC4195wl) pair3.component1(), (SignalsConfig.SynapseCollectorConfig) pair3.component2());
                }
            } else {
                if (el instanceof Cl) {
                    Cl cl2 = (Cl) el;
                    Pair pair4 = (Pair) linkedHashMap2.get(cl2.f6498a);
                    SignalsConfig.SynapseCollectorConfig synapseCollectorConfig = pair4 != null ? (SignalsConfig.SynapseCollectorConfig) pair4.getSecond() : null;
                    int maxRetries = synapseCollectorConfig != null ? synapseCollectorConfig.getMaxRetries() : 0;
                    boolean disableOnMaxRetries = synapseCollectorConfig != null ? synapseCollectorConfig.getDisableOnMaxRetries() : false;
                    try {
                        try {
                            String collectorId3 = ((Cl) el).f6498a;
                            Intrinsics.checkNotNullParameter(context, "context");
                            Intrinsics.checkNotNullParameter(collectorId3, "collectorId");
                            a2 = Vl.a(context);
                            key = Vl.b(collectorId3);
                            it = it3;
                        } catch (Exception e6) {
                            e = e6;
                            it = it3;
                        }
                        try {
                            Intrinsics.checkNotNullParameter(key, "key");
                            cl = cl2;
                            try {
                                int i = ((int) a2.f6510a.getLong(key, 0L)) + 1;
                                String collectorId4 = ((Cl) el).f6498a;
                                Intrinsics.checkNotNullParameter(context, "context");
                                Intrinsics.checkNotNullParameter(collectorId4, "collectorId");
                                str = "': ";
                                linkedHashMap = linkedHashMap2;
                                try {
                                    Vl.a(context).a(Vl.b(collectorId4), i, false);
                                    if (maxRetries > 0 && i >= maxRetries && !disableOnMaxRetries) {
                                        String collectorId5 = ((Cl) el).f6498a;
                                        Intrinsics.checkNotNullParameter(context, "context");
                                        Intrinsics.checkNotNullParameter(collectorId5, "collectorId");
                                        Vl.a(context).a(Vl.c(collectorId5), j, false);
                                        String collectorId6 = ((Cl) el).f6498a;
                                        Intrinsics.checkNotNullParameter(context, "context");
                                        Intrinsics.checkNotNullParameter(collectorId6, "collectorId");
                                        Vl.a(context).a(Vl.b(collectorId6), 0, false);
                                        str2 = "TAG";
                                        try {
                                            Intrinsics.checkNotNullExpressionValue("Ml", str2);
                                            String str5 = "Collector '" + ((Cl) el).f6498a + "' hit max retries — rate-limited.";
                                        } catch (Exception e7) {
                                            e = e7;
                                            Intrinsics.checkNotNullExpressionValue("Ml", str2);
                                            String str6 = "Failed to update failureCount for '" + cl.f6498a + str + e.getMessage();
                                            it3 = it;
                                            linkedHashMap2 = linkedHashMap;
                                        }
                                    }
                                } catch (Exception e8) {
                                    e = e8;
                                    str2 = "TAG";
                                }
                            } catch (Exception e9) {
                                e = e9;
                                linkedHashMap = linkedHashMap2;
                                str = "': ";
                                str2 = "TAG";
                            }
                        } catch (Exception e10) {
                            e = e10;
                            linkedHashMap = linkedHashMap2;
                            str = "': ";
                            str2 = "TAG";
                            cl = cl2;
                            Intrinsics.checkNotNullExpressionValue("Ml", str2);
                            String str62 = "Failed to update failureCount for '" + cl.f6498a + str + e.getMessage();
                            it3 = it;
                            linkedHashMap2 = linkedHashMap;
                        }
                    } catch (CancellationException e11) {
                        throw e11;
                    }
                } else {
                    it = it3;
                    linkedHashMap = linkedHashMap2;
                    if (!(el instanceof Bl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                it3 = it;
                linkedHashMap2 = linkedHashMap;
            }
        }
    }
}
