package com.inmobi.media;

import android.content.Context;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes6.dex */
public final class Qg extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Mutex f6804a;
    public Context b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Context e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qg(Context context, Continuation continuation) {
        super(2, continuation);
        this.e = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Qg qg = new Qg(this.e, continuation);
        qg.d = obj;
        return qg;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Qg qg = new Qg(this.e, (Continuation) obj2);
        qg.d = (CoroutineScope) obj;
        return qg.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        Context context;
        WeakReference weakReference;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.d;
            mutex = Ug.b;
            Context context2 = this.e;
            this.d = coroutineScope;
            this.f6804a = mutex;
            this.b = context2;
            this.c = 1;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            context = context2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = this.b;
            mutex = this.f6804a;
            ResultKt.throwOnFailure(obj);
        }
        try {
            int size = Ug.c.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    weakReference = null;
                    break;
                }
                ArrayList arrayList = Ug.c;
                if (Intrinsics.areEqual((Context) ((WeakReference) arrayList.get(i2)).get(), context)) {
                    weakReference = (WeakReference) arrayList.get(i2);
                    break;
                }
                i2++;
            }
            if (weakReference == null) {
                Ug.c.add(new WeakReference(context));
            }
            Picasso picasso = Ug.f6893a;
            if (picasso == null) {
                AbstractC3914mk.a(context, Ug.d);
                picasso = Ug.a(context);
                Ug.f6893a = picasso;
            }
            return picasso;
        } finally {
            mutex.unlock(null);
        }
    }
}
