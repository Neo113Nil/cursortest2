package com.inmobi.media;

/* renamed from: com.inmobi.media.ea, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2376ea extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2403fa f5175a;
    public final /* synthetic */ long b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2376ea(com.inmobi.media.C2403fa c2403fa, long j, java.lang.String str, int i, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f5175a = c2403fa;
        this.b = j;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2376ea(this.f5175a, this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return ((com.inmobi.media.C2376ea) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [T, com.inmobi.media.M2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.inmobi.media.M2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = com.inmobi.media.AbstractC2877x9.f5546a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.inmobi.media.C2324ca c2324ca = new com.inmobi.media.C2324ca();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.C2297ba(c2324ca, arrayList3, null), 1, null);
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.inmobi.media.C2507ja((com.inmobi.media.C2351da) it.next()));
        }
        arrayList.addAll(arrayList2);
        java.util.Iterator it2 = arrayList.iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
        while (it2.hasNext()) {
            java.lang.Object next = it2.next();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            com.inmobi.media.C2403fa c2403fa = this.f5175a;
            long j = this.b;
            com.inmobi.media.C2507ja c2507ja = (com.inmobi.media.C2507ja) ((com.inmobi.media.InterfaceC2430ga) next);
            long j2 = c2507ja.f5276a.c.b;
            if (j >= j2 && j - j2 <= c2403fa.f5197a) {
                java.lang.String str = this.c;
                int i = this.d;
                c2507ja.a("Message - " + str + ", Reason - " + i + ", Timestamp - " + j + ", Data - " + this.e);
                c2507ja.b(java.lang.String.valueOf(i));
                java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(c2507ja.b());
                if (m10801exceptionOrNullimpl != null) {
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                        ?? m2 = new com.inmobi.media.M2(m10801exceptionOrNullimpl);
                        objectRef.element = m2;
                        com.inmobi.media.W9.a(m2);
                        java.lang.Object a2 = c2507ja.a();
                        java.lang.Throwable m10801exceptionOrNullimpl2 = kotlin.Result.m10801exceptionOrNullimpl(a2);
                        if (m10801exceptionOrNullimpl2 != null) {
                            try {
                                ?? m22 = new com.inmobi.media.M2(m10801exceptionOrNullimpl2);
                                objectRef.element = m22;
                                com.inmobi.media.W9.a(m22);
                                a2 = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                            } catch (java.lang.Throwable th) {
                                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                a2 = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                            }
                        }
                        kotlin.Result.m10798constructorimpl(kotlin.Result.m10797boximpl(a2));
                    } catch (java.lang.Throwable th2) {
                        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                        kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th2));
                    }
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
