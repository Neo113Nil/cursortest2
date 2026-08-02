package com.amplitude.core.platform.intercept;

import androidx.core.app.NotificationCompat;
import com.amplitude.core.utilities.n;
import com.amplitude.core.utilities.x;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.K;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class a implements com.amplitude.core.platform.intercept.c {
    public final n a;
    public final com.amplitude.common.a b;
    public final com.amplitude.core.b c;

    @DebugMetadata(c = "com.amplitude.core.platform.intercept.IdentifyInterceptFileStorageHandler", f = "IdentifyInterceptFileStorageHandler.kt", i = {0}, l = {70}, m = "clearIdentifyIntercepts", n = {"this"}, s = {"L$0"})
    /* renamed from: com.amplitude.core.platform.intercept.a$a, reason: collision with other inner class name */
    public static final class C0042a extends ContinuationImpl {
        public a a;
        public /* synthetic */ Object b;
        public int d;

        public C0042a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return a.this.b(this);
        }
    }

    @DebugMetadata(c = "com.amplitude.core.platform.intercept.IdentifyInterceptFileStorageHandler", f = "IdentifyInterceptFileStorageHandler.kt", i = {0, 1, 1, 1, 1}, l = {21, 36}, m = "getTransferIdentifyEvent", n = {"this", "this", NotificationCompat.CATEGORY_EVENT, "identifyEventUserProperties", "eventPath"}, s = {"L$0", "L$0", "L$1", "L$2", "L$4"})
    public static final class b extends ContinuationImpl {
        public a a;
        public com.amplitude.core.events.a b;
        public Map c;
        public Iterator d;
        public Object e;
        public /* synthetic */ Object f;
        public int j;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.j |= Integer.MIN_VALUE;
            return a.this.a(this);
        }
    }

    @DebugMetadata(c = "com.amplitude.core.platform.intercept.IdentifyInterceptFileStorageHandler$removeFile$1", f = "IdentifyInterceptFileStorageHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new c(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k, Continuation<? super Unit> continuation) {
            return ((c) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            a.this.a.e(this.b);
            return Unit.INSTANCE;
        }
    }

    public a(n storage, com.amplitude.common.a logger, com.amplitude.core.b amplitude) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        this.a = storage;
        this.b = logger;
        this.c = amplitude;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:33|34|35|36|(2:86|87)(1:38)|39|(5:42|43|(5:45|46|47|48|50)(1:58)|51|40)|62|63|64|65|66|67|68|69) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:31|(15:33|34|35|36|(2:86|87)(1:38)|39|(5:42|43|(5:45|46|47|48|50)(1:58)|51|40)|62|63|64|65|66|67|68|69)(1:95)|70|71|(2:74|72)|75|(1:77)|78|57) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a4, code lost:
    
        if (r0 == r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0184, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0185, code lost:
    
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0141, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0144, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0079 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a4 -> B:13:0x00a7). Please report as a decompilation issue!!! */
    @Override // com.amplitude.core.platform.intercept.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation<? super com.amplitude.core.events.a> continuation) {
        b bVar;
        int i;
        Object obj;
        a aVar;
        String message;
        ArrayList arrayList;
        Iterator it;
        a aVar2;
        Map map;
        com.amplitude.core.events.a aVar3;
        String str;
        Map<String, Object> map2;
        Collection events;
        Object obj2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.j = i2 - Integer.MIN_VALUE;
                Object obj3 = bVar.f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.j;
                int i3 = 2;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    try {
                        n nVar = this.a;
                        bVar.a = this;
                        bVar.j = 1;
                        if (nVar.c(bVar) != coroutine_suspended) {
                            aVar = this;
                        }
                        return coroutine_suspended;
                    } catch (FileNotFoundException e) {
                        e = e;
                        obj = null;
                        aVar = this;
                        message = e.getMessage();
                        if (message != null) {
                            return obj;
                        }
                        aVar.b.d("Event storage file not found: ".concat(message));
                        return obj;
                    }
                }
                if (i == 1) {
                    aVar = bVar.a;
                    try {
                        ResultKt.throwOnFailure(obj3);
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        obj = null;
                        message = e.getMessage();
                        if (message != null) {
                        }
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str2 = bVar.e;
                    it = bVar.d;
                    map = bVar.c;
                    aVar3 = bVar.b;
                    aVar2 = bVar.a;
                    try {
                        ResultKt.throwOnFailure(obj3);
                        str2 = str2;
                    } catch (Exception e3) {
                        e = e3;
                        str = str2;
                        aVar2.b.d("Identify Merge error: " + e.getMessage());
                        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
                        aVar2.c(str);
                        i3 = 2;
                        if (it.hasNext()) {
                        }
                    }
                    String str3 = (String) obj3;
                    if (str3.length() == 0) {
                        Intrinsics.checkNotNull(str2, "null cannot be cast to non-null type kotlin.String");
                        aVar2.c(str2);
                    } else {
                        ArrayList g = x.g(new JSONArray(str3));
                        if (g.isEmpty()) {
                            Intrinsics.checkNotNull(str2, "null cannot be cast to non-null type kotlin.String");
                            aVar2.c(str2);
                        } else {
                            if (aVar3 == null) {
                                com.amplitude.core.events.a aVar4 = (com.amplitude.core.events.a) g.get(0);
                                Map<String, Object> map3 = aVar4.Q;
                                if (map3 != null) {
                                    try {
                                    } catch (Exception e4) {
                                        e = e4;
                                        aVar3 = aVar4;
                                        str = str2;
                                        aVar2.b.d("Identify Merge error: " + e.getMessage());
                                        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
                                        aVar2.c(str);
                                        i3 = 2;
                                        if (it.hasNext()) {
                                        }
                                    }
                                    com.amplitude.core.events.d[] dVarArr = com.amplitude.core.events.d.a;
                                    obj2 = map3.get("$set");
                                } else {
                                    obj2 = null;
                                }
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                                Map map4 = TypeIntrinsics.asMutableMap(obj2);
                                Intrinsics.checkNotNullParameter(map4, "map");
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                for (Map.Entry entry : map4.entrySet()) {
                                    try {
                                    } catch (Exception e5) {
                                        e = e5;
                                    }
                                    if (entry.getValue() != null) {
                                        try {
                                        } catch (Exception e6) {
                                            e = e6;
                                            aVar3 = aVar4;
                                            str = str2;
                                            aVar2.b.d("Identify Merge error: " + e.getMessage());
                                            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
                                            aVar2.c(str);
                                            i3 = 2;
                                            if (it.hasNext()) {
                                            }
                                        }
                                        linkedHashMap.put(entry.getKey(), entry.getValue());
                                    }
                                }
                                map = MapsKt.toMutableMap(linkedHashMap);
                                aVar3 = aVar4;
                                events = g.subList(1, g.size());
                            } else {
                                events = g;
                            }
                            Intrinsics.checkNotNullParameter(events, "events");
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            Iterator it2 = events.iterator();
                            while (it2.hasNext()) {
                                Map<String, Object> map5 = ((com.amplitude.core.events.a) it2.next()).Q;
                                Intrinsics.checkNotNull(map5);
                                com.amplitude.core.events.d[] dVarArr2 = com.amplitude.core.events.d.a;
                                Object obj4 = map5.get("$set");
                                Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                                linkedHashMap2.putAll(i.a(TypeIntrinsics.asMutableMap(obj4)));
                            }
                            if (map != null) {
                                map.putAll(linkedHashMap2);
                            }
                            Intrinsics.checkNotNull(str2, "null cannot be cast to non-null type kotlin.String");
                            aVar2.c(str2);
                            i3 = 2;
                        }
                    }
                    if (it.hasNext()) {
                        if (aVar3 != null && (map2 = aVar3.Q) != null) {
                            com.amplitude.core.events.d[] dVarArr3 = com.amplitude.core.events.d.a;
                            map2.put("$set", map);
                        }
                        return aVar3;
                    }
                    Object next = it.next();
                    n nVar2 = aVar2.a;
                    bVar.a = aVar2;
                    bVar.b = aVar3;
                    bVar.c = map;
                    bVar.d = it;
                    bVar.e = next;
                    bVar.j = i3;
                    obj3 = nVar2.b(next, bVar);
                    str2 = next;
                }
                arrayList = (ArrayList) aVar.a.a();
                if (!arrayList.isEmpty()) {
                    return null;
                }
                it = arrayList.iterator();
                aVar2 = aVar;
                map = null;
                aVar3 = null;
                if (it.hasNext()) {
                }
            }
        }
        bVar = new b((ContinuationImpl) continuation);
        Object obj32 = bVar.f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.j;
        int i32 = 2;
        if (i != 0) {
        }
        arrayList = (ArrayList) aVar.a.a();
        if (!arrayList.isEmpty()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.amplitude.core.platform.intercept.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Continuation<? super Unit> continuation) {
        C0042a c0042a;
        int i;
        a aVar;
        String message;
        ArrayList arrayList;
        if (continuation instanceof C0042a) {
            c0042a = (C0042a) continuation;
            int i2 = c0042a.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0042a.d = i2 - Integer.MIN_VALUE;
                Object obj = c0042a.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0042a.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        n nVar = this.a;
                        c0042a.a = this;
                        c0042a.d = 1;
                        if (nVar.c(c0042a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        aVar = this;
                    } catch (FileNotFoundException e) {
                        e = e;
                        aVar = this;
                        message = e.getMessage();
                        if (message != null) {
                            aVar.b.d("Event storage file not found: ".concat(message));
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = c0042a.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        message = e.getMessage();
                        if (message != null) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                arrayList = (ArrayList) aVar.a.a();
                if (!arrayList.isEmpty()) {
                    return Unit.INSTANCE;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlin.String");
                    aVar.c((String) next);
                }
                return Unit.INSTANCE;
            }
        }
        c0042a = new C0042a((ContinuationImpl) continuation);
        Object obj2 = c0042a.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0042a.d;
        if (i != 0) {
        }
        arrayList = (ArrayList) aVar.a.a();
        if (!arrayList.isEmpty()) {
        }
    }

    public final void c(String str) {
        com.amplitude.core.b bVar = this.c;
        C1082i.c(bVar.c, bVar.f, null, new c(str, null), 2);
    }
}
