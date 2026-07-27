package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes6.dex */
public final class N1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6731a;
    public final /* synthetic */ P1 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ String d;
    public final /* synthetic */ List e;
    public final /* synthetic */ WeakReference f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N1(P1 p1, Context context, String str, List list, WeakReference weakReference, Continuation continuation) {
        super(2, continuation);
        this.b = p1;
        this.c = context;
        this.d = str;
        this.e = list;
        this.f = weakReference;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new N1(this.b, this.c, this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((N1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6731a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            P1 p1 = this.b;
            Context context = this.c;
            Intrinsics.checkNotNull(context);
            String str = this.d;
            Intrinsics.checkNotNull(str);
            List list = this.e;
            WeakReference weakReference = this.f;
            this.f6731a = 1;
            List list2 = (List) p1.d.get(str);
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (list2.contains((C1) obj3)) {
                    arrayList.add(obj3);
                }
            }
            if (arrayList.isEmpty()) {
                obj2 = BuildersKt.withContext(Dispatchers.getMain(), new O1(weakReference, p1, null), this);
                if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    obj2 = Unit.INSTANCE;
                }
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C1 c1 = (C1) it.next();
                    LinkedHashMap linkedHashMap = p1.b;
                    Integer num = (Integer) linkedHashMap.get(c1);
                    linkedHashMap.put(c1, Boxing.boxInt((num != null ? num.intValue() : 0) + 1));
                }
                B1.a(context, new LinkedHashMap(p1.b));
                obj2 = Unit.INSTANCE;
            }
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
