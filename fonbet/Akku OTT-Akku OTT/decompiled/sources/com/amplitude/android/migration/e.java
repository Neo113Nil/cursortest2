package com.amplitude.android.migration;

import android.content.SharedPreferences;
import com.amplitude.core.k;
import com.amplitude.core.utilities.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class e {
    public final com.amplitude.android.storage.i a;
    public final com.amplitude.android.storage.i b;
    public final com.amplitude.common.a c;

    public e(com.amplitude.android.storage.i source, com.amplitude.android.storage.i destination, com.amplitude.common.a logger) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.a = source;
        this.b = destination;
        this.c = logger;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r2.d(r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        a aVar;
        int i;
        e eVar;
        if (continuationImpl instanceof a) {
            aVar = (a) continuationImpl;
            int i2 = aVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.d = i2 - Integer.MIN_VALUE;
                Object obj = aVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    aVar.a = this;
                    aVar.d = 1;
                    if (b(aVar) != coroutine_suspended) {
                        eVar = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                eVar = aVar.a;
                ResultKt.throwOnFailure(obj);
                aVar.a = null;
                aVar.d = 2;
            }
        }
        aVar = new a(this, continuationImpl);
        Object obj2 = aVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.d;
        if (i != 0) {
        }
        aVar.a = null;
        aVar.d = 2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(4:(1:(1:(1:(4:13|14|15|16)(2:18|19))(11:20|21|22|23|24|(7:27|28|29|30|32|(1:34)(2:36|37)|25)|42|43|44|(2:46|(1:48)(9:49|50|51|24|(1:25)|42|43|44|(1:52)(0)))(0)|35))(13:58|59|60|61|50|51|24|(1:25)|42|43|44|(0)(0)|35))(3:66|67|68)|65|15|16)(5:77|78|79|(1:81)(0)|35)|69|(2:71|72)(5:73|74|44|(0)(0)|35)))|86|6|7|(0)(0)|69|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01b8, code lost:
    
        if (r4.c(r0) == r3) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0039, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0109 A[Catch: Exception -> 0x0039, TRY_LEAVE, TryCatch #3 {Exception -> 0x0039, blocks: (B:14:0x0034, B:25:0x0103, B:27:0x0109, B:40:0x0133, B:43:0x0161, B:44:0x00c5, B:46:0x00cc, B:51:0x00ef, B:52:0x0194), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc A[Catch: Exception -> 0x0039, TryCatch #3 {Exception -> 0x0039, blocks: (B:14:0x0034, B:25:0x0103, B:27:0x0109, B:40:0x0133, B:43:0x0161, B:44:0x00c5, B:46:0x00cc, B:51:0x00ef, B:52:0x0194), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0194 A[Catch: Exception -> 0x0039, TRY_LEAVE, TryCatch #3 {Exception -> 0x0039, blocks: (B:14:0x0034, B:25:0x0103, B:27:0x0109, B:40:0x0133, B:43:0x0161, B:44:0x00c5, B:46:0x00cc, B:51:0x00ef, B:52:0x0194), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ab A[Catch: Exception -> 0x0082, TryCatch #5 {Exception -> 0x0082, blocks: (B:68:0x007e, B:69:0x0098, B:71:0x00ab, B:73:0x00be), top: B:67:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00be A[Catch: Exception -> 0x0082, TRY_LEAVE, TryCatch #5 {Exception -> 0x0082, blocks: (B:68:0x007e, B:69:0x0098, B:71:0x00ab, B:73:0x00be), top: B:67:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.amplitude.android.migration.b, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ef -> B:24:0x0103). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        e eVar;
        int i;
        e eVar2;
        ArrayList arrayList;
        Iterator it;
        b bVar;
        e eVar3;
        String str;
        b bVar2;
        int i2;
        String str2;
        Iterator it2;
        List list;
        com.amplitude.android.storage.i iVar;
        if (continuationImpl instanceof b) {
            b bVar3 = (b) continuationImpl;
            int i3 = bVar3.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar3.l = i3 - Integer.MIN_VALUE;
                eVar = bVar3;
                Object obj = eVar.j;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = eVar.l;
                int i4 = 3;
                if (i == 0) {
                    if (i == 1) {
                        eVar2 = eVar.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Exception e) {
                            e = e;
                            eVar = eVar2;
                        }
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                e eVar4 = eVar.a;
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            int i5 = eVar.i;
                            com.amplitude.core.events.a aVar = eVar.f;
                            it2 = eVar.e;
                            list = eVar.d;
                            String str3 = eVar.c;
                            Iterator it3 = eVar.b;
                            e eVar5 = eVar.a;
                            try {
                                ResultKt.throwOnFailure(obj);
                                it = it3;
                                str2 = str3;
                                i2 = i5;
                                bVar2 = eVar;
                                eVar3 = eVar5;
                            } catch (Exception e2) {
                                bVar2 = eVar;
                                eVar3 = eVar5;
                                i2 = i5;
                                eVar3.c.b("can't move event (" + aVar + ") from file " + str3 + ": " + e2.getMessage());
                                it = it3;
                                str2 = str3;
                                i4 = 3;
                            }
                            while (it2.hasNext()) {
                                com.amplitude.core.events.a aVar2 = (com.amplitude.core.events.a) it2.next();
                                i2++;
                                try {
                                    iVar = eVar3.b;
                                    bVar2.a = eVar3;
                                    bVar2.b = it;
                                    bVar2.c = str2;
                                    bVar2.d = list;
                                    bVar2.e = it2;
                                    bVar2.f = aVar2;
                                    bVar2.i = i2;
                                    bVar2.l = i4;
                                } catch (Exception e3) {
                                    String str4 = str2;
                                    Iterator it4 = it;
                                    eVar3.c.b("can't move event (" + aVar2 + ") from file " + str4 + ": " + e3.getMessage());
                                    it = it4;
                                    str2 = str4;
                                    i4 = 3;
                                }
                                if (iVar.h(aVar2, bVar2) == coroutine_suspended) {
                                    break;
                                }
                            }
                            eVar3.c.c("Migrated " + i2 + '/' + list.size() + " events from " + str2);
                            eVar3.a.e(str2);
                            bVar = bVar2;
                            i4 = 3;
                            if (!it.hasNext()) {
                                String str5 = (String) it.next();
                                com.amplitude.android.storage.i iVar2 = eVar3.a;
                                bVar.a = eVar3;
                                bVar.b = it;
                                bVar.c = str5;
                                bVar.d = null;
                                bVar.e = null;
                                bVar.f = null;
                                bVar.l = 2;
                                Object b = iVar2.b(str5, bVar);
                                if (b != coroutine_suspended) {
                                    str = str5;
                                    bVar2 = bVar;
                                    obj = b;
                                    Iterator it5 = it;
                                    String str6 = str;
                                    ArrayList g = x.g(new JSONArray((String) obj));
                                    i2 = 0;
                                    str2 = str6;
                                    it = it5;
                                    it2 = g.iterator();
                                    list = g;
                                    while (it2.hasNext()) {
                                    }
                                    eVar3.c.c("Migrated " + i2 + '/' + list.size() + " events from " + str2);
                                    eVar3.a.e(str2);
                                    bVar = bVar2;
                                    i4 = 3;
                                    if (!it.hasNext()) {
                                        com.amplitude.core.utilities.h hVar = eVar3.a.c;
                                        com.amplitude.android.utilities.d dVar = hVar.c;
                                        dVar.a(hVar.f);
                                        dVar.a(hVar.g);
                                        com.amplitude.android.storage.i iVar3 = eVar3.b;
                                        bVar.a = eVar3;
                                        bVar.b = null;
                                        bVar.c = null;
                                        bVar.d = null;
                                        bVar.e = null;
                                        bVar.f = null;
                                        bVar.l = 4;
                                    }
                                }
                            }
                            return coroutine_suspended;
                        }
                        String str7 = eVar.c;
                        it = eVar.b;
                        e eVar6 = eVar.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                            str = str7;
                            bVar2 = eVar;
                            eVar3 = eVar6;
                            Iterator it52 = it;
                            String str62 = str;
                            ArrayList g2 = x.g(new JSONArray((String) obj));
                            i2 = 0;
                            str2 = str62;
                            it = it52;
                            it2 = g2.iterator();
                            list = g2;
                            while (it2.hasNext()) {
                            }
                            eVar3.c.c("Migrated " + i2 + '/' + list.size() + " events from " + str2);
                            eVar3.a.e(str2);
                            bVar = bVar2;
                            i4 = 3;
                            if (!it.hasNext()) {
                            }
                            return coroutine_suspended;
                        } catch (Exception e4) {
                            e = e4;
                            eVar = eVar6;
                        }
                    }
                    eVar.c.b("can't move event files: " + e.getMessage());
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                try {
                    com.amplitude.android.storage.i iVar4 = this.a;
                    eVar.a = this;
                    eVar.l = 1;
                    if (iVar4.c(eVar) != coroutine_suspended) {
                        eVar2 = this;
                    }
                    return coroutine_suspended;
                } catch (Exception e5) {
                    e = e5;
                    eVar = this;
                }
                List<Object> a = eVar2.a.a();
                Intrinsics.checkNotNull(a, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                arrayList = (ArrayList) a;
                if (arrayList.isEmpty()) {
                    it = arrayList.iterator();
                    bVar = eVar;
                    eVar3 = eVar2;
                    if (!it.hasNext()) {
                    }
                    return coroutine_suspended;
                }
                com.amplitude.core.utilities.h hVar2 = eVar2.a.c;
                com.amplitude.android.utilities.d dVar2 = hVar2.c;
                dVar2.a(hVar2.f);
                dVar2.a(hVar2.g);
                return Unit.INSTANCE;
            }
        }
        eVar = new b(this, continuationImpl);
        Object obj2 = eVar.j;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = eVar.l;
        int i42 = 3;
        if (i == 0) {
        }
        List<Object> a2 = eVar2.a.a();
        Intrinsics.checkNotNull(a2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        arrayList = (ArrayList) a2;
        if (arrayList.isEmpty()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(3:18|19|20))(4:28|29|30|(2:32|33)(3:34|(2:37|38)|36))|21))|47|6|7|(0)(0)|21|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c4, code lost:
    
        if (kotlin.Unit.INSTANCE != r4) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c6, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r0.d(r11, r12) == r4) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0039, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.amplitude.android.storage.i] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(k.a aVar, ContinuationImpl continuationImpl) {
        c cVar;
        int i;
        e eVar;
        e eVar2 = this.b;
        if (continuationImpl instanceof c) {
            cVar = (c) continuationImpl;
            int i2 = cVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.e = i2 - Integer.MIN_VALUE;
                Object obj = cVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cVar.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        String f = this.a.f(aVar);
                        if (f == null) {
                            return Unit.INSTANCE;
                        }
                        if (eVar2.f(aVar) == null) {
                            try {
                                this.c.c("Migrating " + aVar + " with value " + f);
                                cVar.a = this;
                                cVar.b = aVar;
                                cVar.e = 1;
                            } catch (Exception e) {
                                e = e;
                                eVar = this;
                                eVar.c.b("can't write destination " + aVar + ": " + e.getMessage());
                                return Unit.INSTANCE;
                            }
                        }
                        eVar = this;
                    } catch (Exception e2) {
                        e = e2;
                        eVar2 = this;
                        eVar2.c.b("can't move " + aVar + ": " + e.getMessage());
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        k.a aVar2 = cVar.b;
                        e eVar3 = cVar.a;
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    aVar = cVar.b;
                    eVar = cVar.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e3) {
                        e = e3;
                        eVar.c.b("can't write destination " + aVar + ": " + e.getMessage());
                        return Unit.INSTANCE;
                    }
                }
                com.amplitude.android.storage.i iVar = eVar.a;
                cVar.a = eVar;
                cVar.b = aVar;
                cVar.e = 2;
                SharedPreferences.Editor edit = iVar.b.edit();
                edit.remove(aVar.a);
                edit.apply();
            }
        }
        cVar = new c(this, continuationImpl);
        Object obj2 = cVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.e;
        if (i != 0) {
        }
        com.amplitude.android.storage.i iVar2 = eVar.a;
        cVar.a = eVar;
        cVar.b = aVar;
        cVar.e = 2;
        SharedPreferences.Editor edit2 = iVar2.b.edit();
        edit2.remove(aVar.a);
        edit2.apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b9, code lost:
    
        if (r2.c(r5, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00aa, code lost:
    
        if (r2.c(r5, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        if (r2.c(r5, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        if (r2.c(r5, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        if (r2.c(r5, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        if (r2.c(r5, r0) != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        d dVar;
        e eVar;
        if (continuationImpl instanceof d) {
            dVar = (d) continuationImpl;
            int i = dVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.d = i - Integer.MIN_VALUE;
                Object obj = dVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (dVar.d) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        k.a aVar = k.a.c;
                        dVar.a = this;
                        dVar.d = 1;
                        if (c(aVar, dVar) != coroutine_suspended) {
                            eVar = this;
                            k.a aVar2 = k.a.d;
                            dVar.a = eVar;
                            dVar.d = 2;
                            break;
                        }
                        return coroutine_suspended;
                    case 1:
                        eVar = dVar.a;
                        ResultKt.throwOnFailure(obj);
                        k.a aVar22 = k.a.d;
                        dVar.a = eVar;
                        dVar.d = 2;
                        break;
                    case 2:
                        eVar = dVar.a;
                        ResultKt.throwOnFailure(obj);
                        k.a aVar3 = k.a.b;
                        dVar.a = eVar;
                        dVar.d = 3;
                        break;
                    case 3:
                        eVar = dVar.a;
                        ResultKt.throwOnFailure(obj);
                        k.a aVar4 = k.a.e;
                        dVar.a = eVar;
                        dVar.d = 4;
                        break;
                    case 4:
                        eVar = dVar.a;
                        ResultKt.throwOnFailure(obj);
                        k.a aVar5 = k.a.f;
                        dVar.a = eVar;
                        dVar.d = 5;
                        break;
                    case 5:
                        eVar = dVar.a;
                        ResultKt.throwOnFailure(obj);
                        k.a aVar6 = k.a.i;
                        dVar.a = eVar;
                        dVar.d = 6;
                        break;
                    case 6:
                        eVar = dVar.a;
                        ResultKt.throwOnFailure(obj);
                        k.a aVar7 = k.a.j;
                        dVar.a = null;
                        dVar.d = 7;
                        break;
                    case 7:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        dVar = new d(this, continuationImpl);
        Object obj2 = dVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (dVar.d) {
        }
    }
}
