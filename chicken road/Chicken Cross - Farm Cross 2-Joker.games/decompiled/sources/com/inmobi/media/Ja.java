package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* loaded from: classes6.dex */
public final class Ja extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ka f6647a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ja(Ka ka, long j, String str, int i, String str2, Continuation continuation) {
        super(1, continuation);
        this.f6647a = ka;
        this.b = j;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Ja(this.f6647a, this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Ja) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [T, com.inmobi.media.j3] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.inmobi.media.j3] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3621ca.f7044a;
        ArrayList arrayList2 = new ArrayList();
        Ha ha = new Ha();
        ArrayList arrayList3 = new ArrayList();
        BuildersKt__BuildersKt.runBlocking$default(null, new Ga(ha, arrayList3, null), 1, null);
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList2.add(new Oa((Ia) it.next()));
        }
        arrayList.addAll(arrayList2);
        Iterator it2 = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
        while (it2.hasNext()) {
            Object next = it2.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            Ka ka = this.f6647a;
            long j = this.b;
            Oa oa = (Oa) ((La) next);
            long j2 = oa.f6760a.c.b;
            if (j >= j2 && j - j2 <= ka.f6668a) {
                String str = this.c;
                int i = this.d;
                oa.a("Message - " + str + ", Reason - " + i + ", Timestamp - " + j + ", Data - " + this.e);
                oa.b(String.valueOf(i));
                Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(oa.b());
                if (m8082exceptionOrNullimpl != null) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        ?? c3810j3 = new C3810j3(m8082exceptionOrNullimpl);
                        objectRef.element = c3810j3;
                        Ba.a(c3810j3);
                        Object a2 = oa.a();
                        Throwable m8082exceptionOrNullimpl2 = Result.m8082exceptionOrNullimpl(a2);
                        if (m8082exceptionOrNullimpl2 != null) {
                            try {
                                ?? c3810j32 = new C3810j3(m8082exceptionOrNullimpl2);
                                objectRef.element = c3810j32;
                                Ba.a(c3810j32);
                                a2 = Result.m8079constructorimpl(Unit.INSTANCE);
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.INSTANCE;
                                a2 = Result.m8079constructorimpl(ResultKt.createFailure(th));
                            }
                        }
                        Result.m8079constructorimpl(Result.m8078boximpl(a2));
                    } catch (Throwable th2) {
                        Result.Companion companion3 = Result.INSTANCE;
                        Result.m8079constructorimpl(ResultKt.createFailure(th2));
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
