package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* loaded from: classes6.dex */
public final class Io extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6635a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ double d;
    public final /* synthetic */ AdConfig.VastVideoConfig e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Io(ArrayList arrayList, double d, AdConfig.VastVideoConfig vastVideoConfig, Continuation continuation) {
        super(2, continuation);
        this.c = arrayList;
        this.d = d;
        this.e = vastVideoConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Io io2 = new Io(this.c, this.d, this.e, continuation);
        io2.b = obj;
        return io2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Io) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object awaitAll;
        Deferred async$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6635a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            if (this.c.isEmpty()) {
                return CollectionsKt.emptyList();
            }
            int a2 = Z5.a();
            Qf a3 = Z4.a();
            ArrayList arrayList = this.c;
            double d = this.d;
            AdConfig.VastVideoConfig vastVideoConfig = this.e;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ArrayList arrayList3 = arrayList2;
                async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new Go((Bn) it.next(), d, a3, a2, vastVideoConfig, null), 3, null);
                arrayList3.add(async$default);
                arrayList2 = arrayList3;
                d = d;
            }
            this.f6635a = 1;
            awaitAll = AwaitKt.awaitAll(arrayList2, this);
            if (awaitAll == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            awaitAll = obj;
        }
        List sortedWith = CollectionsKt.sortedWith((Iterable) awaitAll, new Ho());
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(sortedWith, 10));
        Iterator it2 = sortedWith.iterator();
        while (it2.hasNext()) {
            arrayList4.add((Bn) ((Pair) it2.next()).getFirst());
        }
        return arrayList4;
    }
}
