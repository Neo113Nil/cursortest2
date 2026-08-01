package com.chartboost.sdk.impl;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.chartboost.sdk.impl.c;
import com.chartboost.sdk.impl.l5;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public final class oj {
    public static final a d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final jj f4946a;
    public final int b;
    public List c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4947a = new b();

        public final void a(String str, int i, pj context) {
            Intrinsics.checkNotNullParameter(context, "context");
            List<ii> b = context.b();
            if (!(b instanceof Collection) || !b.isEmpty()) {
                for (ii iiVar : b) {
                    if (Intrinsics.areEqual(iiVar.b(), "error") && iiVar.d() == context.c()) {
                        if (Intrinsics.areEqual(iiVar.f(), str) && Intrinsics.areEqual(iiVar.c().get("VAST_ERROR_CODE"), Integer.valueOf(i))) {
                            return;
                        }
                    }
                }
            }
            context.b().add(new ii("error", str, context.c(), null, MapsKt.mapOf(TuplesKt.to("VAST_ERROR_CODE", Integer.valueOf(i))), 0L, 40, null));
        }
    }

    public static final class c extends ContinuationImpl {
        public /* synthetic */ Object b;
        public int d;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            Object a2 = oj.this.a(null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    public static final class d extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public Object i;
        public Object j;
        public Object k;
        public Object l;
        public /* synthetic */ Object m;
        public int o;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.m = obj;
            this.o |= Integer.MIN_VALUE;
            Object a2 = oj.this.a(null, null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    public static final class e extends ContinuationImpl {
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object b = oj.this.b(null, null, this);
            return b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b : Result.m8078boximpl(b);
        }
    }

    public oj(jj vastFetcher, int i) {
        Intrinsics.checkNotNullParameter(vastFetcher, "vastFetcher");
        this.f4946a = vastFetcher;
        this.b = i;
        this.c = CollectionsKt.emptyList();
    }

    public final List a() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, pj pjVar, Continuation continuation) {
        e eVar;
        int i;
        Object a2;
        oj ojVar;
        List emptyList;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.f = i2 - Integer.MIN_VALUE;
                Object obj = eVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = eVar.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    eVar.b = this;
                    eVar.c = pjVar;
                    eVar.f = 1;
                    a2 = a(str, pjVar, eVar);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ojVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pjVar = (pj) eVar.c;
                    ojVar = (oj) eVar.b;
                    ResultKt.throwOnFailure(obj);
                    a2 = ((Result) obj).getValue();
                }
                if (Result.m8085isFailureimpl(a2)) {
                    emptyList = CollectionsKt.emptyList();
                } else {
                    List b2 = pjVar.b();
                    emptyList = new ArrayList();
                    for (Object obj2 : b2) {
                        if (Intrinsics.areEqual(((ii) obj2).b(), "error")) {
                            emptyList.add(obj2);
                        }
                    }
                }
                ojVar.c = emptyList;
                return a2;
            }
        }
        eVar = new e(continuation);
        Object obj3 = eVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = eVar.f;
        if (i != 0) {
        }
        if (Result.m8085isFailureimpl(a2)) {
        }
        ojVar.c = emptyList;
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Continuation continuation) {
        c cVar;
        int i;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.d = i2 - Integer.MIN_VALUE;
                Object obj = cVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cVar.d;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((Result) obj).getValue();
                }
                ResultKt.throwOnFailure(obj);
                pj pjVar = new pj(this.f4946a, this.b, 0, null, null, null, 56, null);
                cVar.d = 1;
                Object b2 = b(str, pjVar, cVar);
                return b2 == coroutine_suspended ? coroutine_suspended : b2;
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.d;
        if (i == 0) {
        }
    }

    public /* synthetic */ oj(jj jjVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(jjVar, (i2 & 2) != 0 ? 10 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0982  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0947  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33, types: [T] */
    /* JADX WARN: Type inference failed for: r12v54, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v20, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:193:0x05f7 -> B:11:0x0601). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, pj pjVar, Continuation continuation) {
        d dVar;
        int i;
        String a2;
        oj ojVar;
        ArrayList arrayList;
        String str2;
        List list;
        ArrayList arrayList2;
        d dVar2;
        Iterator it;
        pj pjVar2;
        String str3;
        Ref.ObjectRef objectRef;
        Object obj;
        List list2;
        ArrayList arrayList3;
        ?? r13;
        String str4;
        String str5;
        Iterator it2;
        com.chartboost.sdk.impl.c cVar;
        pj pjVar3;
        oj ojVar2;
        List list3;
        Object obj2;
        Integer a3;
        Iterator it3;
        d dVar3;
        Object obj3;
        String str6;
        String str7;
        oj ojVar3;
        String str8;
        List b2;
        int i2;
        int i3;
        ArrayList arrayList4;
        boolean z;
        d dVar4;
        pj pjVar4;
        Object obj4;
        String str9;
        String str10;
        List plus;
        Iterator it4;
        String str11;
        String str12;
        l5 l5Var;
        v4 a4;
        Iterator it5;
        String str13;
        la a5;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i4 = dVar.o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dVar.o = i4 - Integer.MIN_VALUE;
                Object obj5 = dVar.m;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dVar.o;
                String str14 = ", message=";
                String str15 = ", errorType=";
                String str16 = ", vastErrorCode=";
                String str17 = "VAST_ERROR_CODE";
                if (i != 0) {
                    ResultKt.throwOnFailure(obj5);
                    ql qlVar = ql.f4988a;
                    Object a6 = qlVar.a(str);
                    if (Result.m8085isFailureimpl(a6)) {
                        Result.Companion companion = Result.INSTANCE;
                        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(a6);
                        Intrinsics.checkNotNull(m8082exceptionOrNullimpl);
                        return Result.m8079constructorimpl(ResultKt.createFailure(m8082exceptionOrNullimpl));
                    }
                    ResultKt.throwOnFailure(a6);
                    Element documentElement = ((Document) a6).getDocumentElement();
                    if (!Intrinsics.areEqual(documentElement.getNodeName(), "VAST")) {
                        Result.Companion companion2 = Result.INSTANCE;
                        return Result.m8079constructorimpl(ResultKt.createFailure(new ab("Root element is not VAST.", Boxing.boxInt(101))));
                    }
                    Intrinsics.checkNotNull(documentElement);
                    a2 = qlVar.a(documentElement, "version");
                    List e2 = qlVar.e(documentElement, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c);
                    List c2 = qlVar.c(documentElement, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.d);
                    if (c2.isEmpty()) {
                        Iterator it6 = e2.iterator();
                        while (it6.hasNext()) {
                            pjVar.b().add(new ii("error", (String) it6.next(), pjVar.c(), null, MapsKt.mapOf(TuplesKt.to("VAST_ERROR_CODE", Boxing.boxInt(303))), 0L, 40, null));
                        }
                        Result.Companion companion3 = Result.INSTANCE;
                        return Result.m8079constructorimpl(new gj(a2, CollectionsKt.emptyList(), CollectionsKt.toMutableList((Collection) CollectionsKt.distinct(pjVar.b())), CollectionsKt.toMutableList((Collection) CollectionsKt.distinct(pjVar.a())), null, 16, null));
                    }
                    ArrayList arrayList5 = new ArrayList();
                    ojVar = this;
                    arrayList = new ArrayList();
                    str2 = a2;
                    list = e2;
                    arrayList2 = arrayList5;
                    dVar2 = dVar;
                    it = c2.iterator();
                    pjVar2 = pjVar;
                    while (it.hasNext()) {
                    }
                    if (!arrayList2.isEmpty()) {
                    }
                    if (pjVar2.c() == 0) {
                    }
                    List distinct = CollectionsKt.distinct(pjVar2.b());
                    List distinct2 = CollectionsKt.distinct(pjVar2.a());
                    Result.Companion companion4 = Result.INSTANCE;
                    return Result.m8079constructorimpl(new gj(str2, arrayList2, distinct, distinct2, null, 16, null));
                }
                if (i == 1) {
                    Ref.ObjectRef objectRef2 = (Ref.ObjectRef) dVar.l;
                    List list4 = (List) dVar.k;
                    String str18 = (String) dVar.j;
                    com.chartboost.sdk.impl.c cVar2 = (com.chartboost.sdk.impl.c) dVar.i;
                    Iterator it7 = (Iterator) dVar.h;
                    r13 = (List) dVar.g;
                    ?? r14 = (List) dVar.f;
                    list2 = (List) dVar.e;
                    String str19 = (String) dVar.d;
                    pj pjVar5 = (pj) dVar.c;
                    oj ojVar4 = (oj) dVar.b;
                    ResultKt.throwOnFailure(obj5);
                    obj2 = ((Result) obj5).getValue();
                    objectRef = objectRef2;
                    obj = coroutine_suspended;
                    str3 = "VAST_ERROR_CODE";
                    cVar = cVar2;
                    ojVar2 = ojVar4;
                    list3 = list4;
                    str5 = str18;
                    it2 = it7;
                    pjVar3 = pjVar5;
                    str4 = str19;
                    arrayList3 = r14;
                    if (!Result.m8085isFailureimpl(obj2)) {
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ref.ObjectRef objectRef3 = (Ref.ObjectRef) dVar.k;
                    List list5 = (List) dVar.j;
                    com.chartboost.sdk.impl.c cVar3 = (com.chartboost.sdk.impl.c) dVar.i;
                    Iterator it8 = (Iterator) dVar.h;
                    ?? r12 = (List) dVar.g;
                    ?? r11 = (List) dVar.f;
                    List list6 = (List) dVar.e;
                    String str20 = (String) dVar.d;
                    pj pjVar6 = (pj) dVar.c;
                    oj ojVar5 = (oj) dVar.b;
                    ResultKt.throwOnFailure(obj5);
                    Object a7 = ((Result) obj5).getValue();
                    String str21 = ", message=";
                    str3 = "VAST_ERROR_CODE";
                    List list7 = list5;
                    String str22 = str20;
                    Object obj6 = coroutine_suspended;
                    ArrayList arrayList6 = r11;
                    d dVar5 = dVar;
                    Ref.ObjectRef objectRef4 = objectRef3;
                    Iterator it9 = it8;
                    list = list6;
                    pjVar3 = pjVar6;
                    ojVar = ojVar5;
                    ArrayList arrayList7 = r12;
                    if (!Result.m8086isSuccessimpl(a7)) {
                        ResultKt.throwOnFailure(a7);
                        List a8 = ((gj) a7).a();
                        ArrayList arrayList8 = new ArrayList();
                        Iterator it10 = a8.iterator();
                        while (it10.hasNext()) {
                            Iterator it11 = it9;
                            Object next = it10.next();
                            Iterator it12 = it10;
                            if (next instanceof c.a) {
                                arrayList8.add(next);
                            }
                            it9 = it11;
                            it10 = it12;
                        }
                        Iterator it13 = it9;
                        int size = arrayList8.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj7 = arrayList8.get(i5);
                            int i6 = i5 + 1;
                            int i7 = size;
                            c.a aVar = (c.a) obj7;
                            if (list7.isEmpty()) {
                                i3 = i6;
                                if (objectRef4.element == null) {
                                    plus = aVar.a().b();
                                    arrayList4 = arrayList8;
                                    dVar4 = dVar5;
                                    pjVar4 = pjVar3;
                                    obj4 = obj6;
                                    str9 = str15;
                                    str10 = str16;
                                    c.b bVar = (c.b) cVar3;
                                    a5 = r35.a((r20 & 1) != 0 ? r35.f4859a : null, (r20 & 2) != 0 ? r35.b : null, (r20 & 4) != 0 ? r35.c : null, (r20 & 8) != 0 ? r35.d : null, (r20 & 16) != 0 ? r35.e : CollectionsKt.distinct(CollectionsKt.plus((Collection) bVar.a().e(), (Iterable) aVar.a().d())), (r20 & 32) != 0 ? r35.f : plus, (r20 & 64) != 0 ? r35.g : CollectionsKt.distinct(CollectionsKt.plus((Collection) bVar.a().d(), (Iterable) aVar.a().c())), (r20 & 128) != 0 ? r35.h : CollectionsKt.distinct(CollectionsKt.plus((Collection) bVar.a().a(), (Iterable) aVar.a().a())), (r20 & 256) != 0 ? aVar.a().i : CollectionsKt.distinct(CollectionsKt.plus((Collection) bVar.a().g(), (Iterable) aVar.a().e())));
                                    arrayList6.add(c.a.a(aVar, null, a5, 1, null));
                                    i5 = i3;
                                    size = i7;
                                    arrayList8 = arrayList4;
                                    dVar5 = dVar4;
                                    pjVar3 = pjVar4;
                                    str15 = str9;
                                    obj6 = obj4;
                                    str16 = str10;
                                }
                            } else {
                                i3 = i6;
                            }
                            List b3 = aVar.a().b();
                            arrayList4 = arrayList8;
                            if (!(b3 instanceof Collection) || !b3.isEmpty()) {
                                Iterator it14 = b3.iterator();
                                while (it14.hasNext()) {
                                    if (((l5) it14.next()) instanceof l5.a) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                            z = false;
                            List b4 = aVar.a().b();
                            dVar4 = dVar5;
                            pjVar4 = pjVar3;
                            obj4 = obj6;
                            ArrayList arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(b4, 10));
                            Iterator it15 = b4.iterator();
                            while (it15.hasNext()) {
                                l5 l5Var2 = (l5) it15.next();
                                if (l5Var2 instanceof l5.a) {
                                    l5.a aVar2 = (l5.a) l5Var2;
                                    List a9 = aVar2.a().a();
                                    it4 = it15;
                                    str11 = str15;
                                    ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(a9, 10));
                                    Iterator it16 = a9.iterator();
                                    while (it16.hasNext()) {
                                        v4 v4Var = (v4) it16.next();
                                        ArrayList arrayList11 = new ArrayList();
                                        for (Object obj8 : list7) {
                                            v4 v4Var2 = (v4) obj8;
                                            if (v4Var2.g() != null) {
                                                it5 = it16;
                                                String g = v4Var2.g();
                                                str13 = str16;
                                                if (!Intrinsics.areEqual(g, v4Var.g())) {
                                                    str16 = str13;
                                                    it16 = it5;
                                                }
                                            } else {
                                                it5 = it16;
                                                str13 = str16;
                                            }
                                            arrayList11.add(obj8);
                                            str16 = str13;
                                            it16 = it5;
                                        }
                                        Iterator it17 = it16;
                                        String str23 = str16;
                                        ArrayList arrayList12 = new ArrayList();
                                        int i8 = 0;
                                        for (int size2 = arrayList11.size(); i8 < size2; size2 = size2) {
                                            Object obj9 = arrayList11.get(i8);
                                            i8++;
                                            CollectionsKt.addAll(arrayList12, ((v4) obj9).i());
                                        }
                                        List distinct3 = CollectionsKt.distinct(CollectionsKt.plus((Collection) arrayList12, (Iterable) v4Var.i()));
                                        ArrayList arrayList13 = new ArrayList();
                                        int i9 = 0;
                                        for (int size3 = arrayList11.size(); i9 < size3; size3 = size3) {
                                            Object obj10 = arrayList11.get(i9);
                                            i9++;
                                            CollectionsKt.addAll(arrayList13, ((v4) obj10).c());
                                        }
                                        a4 = v4Var.a((r37 & 1) != 0 ? v4Var.f5038a : null, (r37 & 2) != 0 ? v4Var.b : null, (r37 & 4) != 0 ? v4Var.c : null, (r37 & 8) != 0 ? v4Var.d : null, (r37 & 16) != 0 ? v4Var.e : null, (r37 & 32) != 0 ? v4Var.f : null, (r37 & 64) != 0 ? v4Var.g : null, (r37 & 128) != 0 ? v4Var.h : null, (r37 & 256) != 0 ? v4Var.i : null, (r37 & 512) != 0 ? v4Var.j : null, (r37 & 1024) != 0 ? v4Var.k : null, (r37 & 2048) != 0 ? v4Var.l : null, (r37 & 4096) != 0 ? v4Var.m : null, (r37 & 8192) != 0 ? v4Var.n : null, (r37 & 16384) != 0 ? v4Var.o : null, (r37 & 32768) != 0 ? v4Var.p : distinct3, (r37 & 65536) != 0 ? v4Var.q : null, (r37 & 131072) != 0 ? v4Var.r : CollectionsKt.distinct(CollectionsKt.plus((Collection) arrayList13, (Iterable) v4Var.c())), (r37 & 262144) != 0 ? v4Var.s : null);
                                        arrayList10.add(a4);
                                        str16 = str23;
                                        it16 = it17;
                                    }
                                    str12 = str16;
                                    l5Var = l5.a.a(aVar2, null, null, null, null, y4.a(aVar2.a(), null, arrayList10, 1, null), null, 47, null);
                                } else {
                                    it4 = it15;
                                    str11 = str15;
                                    str12 = str16;
                                    if (l5Var2 instanceof l5.b) {
                                        if (objectRef4.element != null) {
                                            l5.b bVar2 = (l5.b) l5Var2;
                                            bk c3 = bVar2.a().c();
                                            if ((c3 != null ? c3.a() : null) == null) {
                                                String str24 = (String) objectRef4.element;
                                                bk c4 = bVar2.a().c();
                                                List b5 = c4 != null ? c4.b() : null;
                                                if (b5 == null) {
                                                    b5 = CollectionsKt.emptyList();
                                                }
                                                l5Var = l5.b.a(bVar2, null, null, null, null, db.a(bVar2.a(), null, null, new bk(str24, b5), null, null, 27, null), null, 47, null);
                                            }
                                        }
                                        l5Var = (l5.b) l5Var2;
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                                arrayList9.add(l5Var);
                                str15 = str11;
                                it15 = it4;
                                str16 = str12;
                            }
                            str9 = str15;
                            str10 = str16;
                            plus = (z || list7.isEmpty()) ? arrayList9 : CollectionsKt.plus((Collection<? extends l5.a>) arrayList9, new l5.a(null, null, null, CollectionsKt.emptyList(), new y4(null, CollectionsKt.toList(list7)), null, 32, null));
                            c.b bVar3 = (c.b) cVar3;
                            a5 = r35.a((r20 & 1) != 0 ? r35.f4859a : null, (r20 & 2) != 0 ? r35.b : null, (r20 & 4) != 0 ? r35.c : null, (r20 & 8) != 0 ? r35.d : null, (r20 & 16) != 0 ? r35.e : CollectionsKt.distinct(CollectionsKt.plus((Collection) bVar3.a().e(), (Iterable) aVar.a().d())), (r20 & 32) != 0 ? r35.f : plus, (r20 & 64) != 0 ? r35.g : CollectionsKt.distinct(CollectionsKt.plus((Collection) bVar3.a().d(), (Iterable) aVar.a().c())), (r20 & 128) != 0 ? r35.h : CollectionsKt.distinct(CollectionsKt.plus((Collection) bVar3.a().a(), (Iterable) aVar.a().a())), (r20 & 256) != 0 ? aVar.a().i : CollectionsKt.distinct(CollectionsKt.plus((Collection) bVar3.a().g(), (Iterable) aVar.a().e())));
                            arrayList6.add(c.a.a(aVar, null, a5, 1, null));
                            i5 = i3;
                            size = i7;
                            arrayList8 = arrayList4;
                            dVar5 = dVar4;
                            pjVar3 = pjVar4;
                            str15 = str9;
                            obj6 = obj4;
                            str16 = str10;
                        }
                        pj pjVar7 = pjVar3;
                        Unit unit = Unit.INSTANCE;
                        it = it13;
                        arrayList = arrayList7;
                        arrayList2 = arrayList6;
                        dVar2 = dVar5;
                        pjVar2 = pjVar7;
                        coroutine_suspended = obj6;
                        str14 = str21;
                        str2 = str22;
                        str17 = str3;
                        while (it.hasNext()) {
                            Element element = (Element) it.next();
                            Object a10 = p.f4949a.a(element, pjVar2);
                            if (Result.m8085isFailureimpl(a10)) {
                                Throwable m8082exceptionOrNullimpl2 = Result.m8082exceptionOrNullimpl(a10);
                                Intrinsics.checkNotNull(m8082exceptionOrNullimpl2);
                                if (pjVar2.c() > 0) {
                                    obj3 = coroutine_suspended;
                                    i2 = 300;
                                } else {
                                    i2 = DescriptorProtos.Edition.EDITION_LEGACY_VALUE;
                                    obj3 = coroutine_suspended;
                                }
                                if (m8082exceptionOrNullimpl2 instanceof hj) {
                                    hj hjVar = (hj) m8082exceptionOrNullimpl2;
                                    if (hjVar.a() != null) {
                                        i2 = hjVar.a().intValue();
                                    }
                                }
                                it3 = it;
                                int i10 = i2;
                                str7 = str2;
                                dVar3 = dVar2;
                                ojVar3 = ojVar;
                                str6 = str17;
                                mb.b("VAST Ad parse failed: adId=" + ql.f4988a.a(element, "id") + ", wrapperDepth=" + pjVar2.c() + str16 + i10 + str15 + m8082exceptionOrNullimpl2.getClass().getSimpleName() + str14 + m8082exceptionOrNullimpl2.getMessage(), (Throwable) null, 2, (Object) null);
                                Iterator it18 = list.iterator();
                                while (it18.hasNext()) {
                                    b.f4947a.a((String) it18.next(), i10, pjVar2);
                                }
                                arrayList.add(m8082exceptionOrNullimpl2);
                            } else {
                                it3 = it;
                                dVar3 = dVar2;
                                obj3 = coroutine_suspended;
                                str6 = str17;
                                str7 = str2;
                                ojVar3 = ojVar;
                                ResultKt.throwOnFailure(a10);
                                com.chartboost.sdk.impl.c cVar4 = (com.chartboost.sdk.impl.c) a10;
                                if (cVar4 instanceof c.a) {
                                    Boxing.boxBoolean(arrayList2.add(cVar4));
                                } else if (cVar4 instanceof c.b) {
                                    c.b bVar4 = (c.b) cVar4;
                                    String f = bVar4.a().f();
                                    if (pjVar2.e().contains(f)) {
                                        mb.b("VAST wrapper loop detected: uri=" + f + ", visitedUris=" + pjVar2.e(), (Throwable) null, 2, (Object) null);
                                        b.f4947a.a(f, Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE, pjVar2);
                                        Result.Companion companion5 = Result.INSTANCE;
                                        return Result.m8079constructorimpl(ResultKt.createFailure(new pl(f, null, 2, null)));
                                    }
                                    if (pjVar2.c() >= pjVar2.d()) {
                                        mb.b("VAST max wrapper depth exceeded: currentDepth=" + pjVar2.c() + ", maxDepth=" + pjVar2.d() + ", wrapperUri=" + f, (Throwable) null, 2, (Object) null);
                                        tb tbVar = new tb(null, 1, null);
                                        b.f4947a.a(f, Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE, pjVar2);
                                        Result.Companion companion6 = Result.INSTANCE;
                                        return Result.m8079constructorimpl(ResultKt.createFailure(tbVar));
                                    }
                                    Iterator it19 = bVar4.a().e().iterator();
                                    while (it19.hasNext()) {
                                        pjVar2.b().add(new ii("impression", (String) it19.next(), pjVar2.c(), null, null, 0L, 56, null));
                                    }
                                    Iterator it20 = bVar4.a().c().iterator();
                                    while (it20.hasNext()) {
                                        pjVar2.b().add(new ii("error", (String) it20.next(), pjVar2.c(), null, MapsKt.mapOf(TuplesKt.to(str6, Boxing.boxInt(300))), 0L, 40, null));
                                    }
                                    String str25 = str6;
                                    pjVar2.a().addAll(bVar4.a().a());
                                    ArrayList arrayList14 = new ArrayList();
                                    Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                                    Iterator it21 = bVar4.a().b().iterator();
                                    while (it21.hasNext()) {
                                        l5 l5Var3 = (l5) it21.next();
                                        Iterator it22 = it21;
                                        if (l5Var3 instanceof l5.b) {
                                            l5.b bVar5 = (l5.b) l5Var3;
                                            Iterator it23 = bVar5.a().b().iterator();
                                            while (it23.hasNext()) {
                                                pjVar2.b().add(ii.a((ii) it23.next(), null, null, pjVar2.c(), null, null, 0L, 59, null));
                                                it23 = it23;
                                                str25 = str25;
                                            }
                                            str8 = str25;
                                            bk c5 = bVar5.a().c();
                                            if (c5 != null && (b2 = c5.b()) != null) {
                                                for (Iterator it24 = b2.iterator(); it24.hasNext(); it24 = it24) {
                                                    pjVar2.b().add(new ii("click", (String) it24.next(), pjVar2.c(), null, null, 0L, 56, null));
                                                }
                                                Unit unit2 = Unit.INSTANCE;
                                            }
                                            if (objectRef5.element == null) {
                                                bk c6 = bVar5.a().c();
                                                objectRef5.element = c6 != null ? c6.a() : 0;
                                            }
                                            Unit unit3 = Unit.INSTANCE;
                                        } else {
                                            str8 = str25;
                                            if (l5Var3 instanceof l5.a) {
                                                Boxing.boxBoolean(arrayList14.addAll(((l5.a) l5Var3).a().a()));
                                            } else {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                        }
                                        it21 = it22;
                                        str25 = str8;
                                    }
                                    str3 = str25;
                                    jj jjVar = ojVar3.f4946a;
                                    String f2 = bVar4.a().f();
                                    dVar3.b = ojVar3;
                                    dVar3.c = pjVar2;
                                    str4 = str7;
                                    dVar3.d = str4;
                                    dVar3.e = list;
                                    dVar3.f = arrayList2;
                                    dVar3.g = arrayList;
                                    List list8 = list;
                                    it2 = it3;
                                    dVar3.h = it2;
                                    dVar3.i = cVar4;
                                    dVar3.j = f;
                                    dVar3.k = arrayList14;
                                    dVar3.l = objectRef5;
                                    dVar3.o = 1;
                                    Object a11 = jjVar.a(f2, dVar3);
                                    if (a11 == obj3) {
                                        return obj3;
                                    }
                                    obj = obj3;
                                    list3 = arrayList14;
                                    objectRef = objectRef5;
                                    r13 = arrayList;
                                    cVar = cVar4;
                                    ojVar2 = ojVar3;
                                    str5 = f;
                                    list2 = list8;
                                    ArrayList arrayList15 = arrayList2;
                                    pjVar3 = pjVar2;
                                    obj2 = a11;
                                    dVar = dVar3;
                                    arrayList3 = arrayList15;
                                    if (!Result.m8085isFailureimpl(obj2)) {
                                        Throwable m8082exceptionOrNullimpl3 = Result.m8082exceptionOrNullimpl(obj2);
                                        ij ijVar = m8082exceptionOrNullimpl3 instanceof ij ? (ij) m8082exceptionOrNullimpl3 : null;
                                        int intValue = (ijVar == null || (a3 = ijVar.a()) == null) ? 300 : a3.intValue();
                                        c.b bVar6 = (c.b) cVar;
                                        mb.b("VAST wrapper fetch failed: wrapperUri=" + bVar6.a().f() + ", wrapperDepth=" + pjVar3.c() + str16 + intValue + str15 + (m8082exceptionOrNullimpl3 != null ? m8082exceptionOrNullimpl3.getClass().getSimpleName() : null) + str14 + (m8082exceptionOrNullimpl3 != null ? m8082exceptionOrNullimpl3.getMessage() : null), (Throwable) null, 2, (Object) null);
                                        b.f4947a.a(bVar6.a().f(), intValue, pjVar3);
                                        Result.Companion companion7 = Result.INSTANCE;
                                        Intrinsics.checkNotNull(m8082exceptionOrNullimpl3);
                                        return Result.m8079constructorimpl(ResultKt.createFailure(m8082exceptionOrNullimpl3));
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                    str21 = str14;
                                    pj a12 = pj.a(pjVar3, null, 0, pjVar3.c() + 1, SetsKt.plus((Set<? extends String>) pjVar3.e(), str5), null, null, 51, null);
                                    dVar.b = ojVar2;
                                    dVar.c = pjVar3;
                                    dVar.d = str4;
                                    dVar.e = list2;
                                    dVar.f = arrayList3;
                                    dVar.g = r13;
                                    dVar.h = it2;
                                    dVar.i = cVar;
                                    dVar.j = list3;
                                    objectRef4 = objectRef;
                                    dVar.k = objectRef4;
                                    list7 = list3;
                                    dVar.l = null;
                                    dVar.o = 2;
                                    a7 = ojVar2.a((String) obj2, a12, dVar);
                                    obj6 = obj;
                                    if (a7 == obj6) {
                                        return obj6;
                                    }
                                    oj ojVar6 = ojVar2;
                                    dVar5 = dVar;
                                    it9 = it2;
                                    list = list2;
                                    cVar3 = cVar;
                                    str22 = str4;
                                    arrayList7 = r13;
                                    ojVar = ojVar6;
                                    arrayList6 = arrayList3;
                                    if (!Result.m8086isSuccessimpl(a7)) {
                                        Result.Companion companion8 = Result.INSTANCE;
                                        Throwable m8082exceptionOrNullimpl4 = Result.m8082exceptionOrNullimpl(a7);
                                        Intrinsics.checkNotNull(m8082exceptionOrNullimpl4);
                                        return Result.m8079constructorimpl(ResultKt.createFailure(m8082exceptionOrNullimpl4));
                                    }
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            it = it3;
                            dVar2 = dVar3;
                            coroutine_suspended = obj3;
                            str2 = str7;
                            ojVar = ojVar3;
                            str17 = str6;
                        }
                        if (!arrayList2.isEmpty() && !arrayList.isEmpty()) {
                            Result.Companion companion9 = Result.INSTANCE;
                            return Result.m8079constructorimpl(ResultKt.createFailure((Throwable) CollectionsKt.first((List) arrayList)));
                        }
                        if (pjVar2.c() == 0) {
                            Iterator it25 = arrayList2.iterator();
                            while (it25.hasNext()) {
                                for (bl blVar : ((c.a) it25.next()).a().e()) {
                                    Iterator it26 = blVar.b().iterator();
                                    while (it26.hasNext()) {
                                        pjVar2.b().add(new ii("viewable", (String) it26.next(), pjVar2.c(), null, null, 0L, 56, null));
                                    }
                                    Iterator it27 = blVar.a().iterator();
                                    while (it27.hasNext()) {
                                        pjVar2.b().add(new ii("notViewable", (String) it27.next(), pjVar2.c(), null, null, 0L, 56, null));
                                    }
                                }
                            }
                        }
                        List distinct4 = CollectionsKt.distinct(pjVar2.b());
                        List distinct22 = CollectionsKt.distinct(pjVar2.a());
                        Result.Companion companion42 = Result.INSTANCE;
                        return Result.m8079constructorimpl(new gj(str2, arrayList2, distinct4, distinct22, null, 16, null));
                    }
                }
            }
        }
        dVar = new d(continuation);
        Object obj52 = dVar.m;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dVar.o;
        String str142 = ", message=";
        String str152 = ", errorType=";
        String str162 = ", vastErrorCode=";
        String str172 = "VAST_ERROR_CODE";
        if (i != 0) {
        }
    }
}
