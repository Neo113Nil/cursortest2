package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Uf extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public kotlinx.coroutines.sync.Mutex f4997a;
    public android.content.Context b;
    public int c;
    public /* synthetic */ java.lang.Object d;
    public final /* synthetic */ android.content.Context e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uf(android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.e = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.Uf uf = new com.inmobi.media.Uf(this.e, continuation);
        uf.d = obj;
        return uf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.inmobi.media.Uf uf = new com.inmobi.media.Uf(this.e, (kotlin.coroutines.Continuation) obj2);
        uf.d = (kotlinx.coroutines.CoroutineScope) obj;
        return uf.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.sync.Mutex mutex;
        android.content.Context context;
        java.lang.ref.WeakReference weakReference;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.d;
            mutex = com.inmobi.media.Yf.b;
            android.content.Context context2 = this.e;
            this.d = coroutineScope;
            this.f4997a = mutex;
            this.b = context2;
            this.c = 1;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            context = context2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = this.b;
            mutex = this.f4997a;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        try {
            int size = com.inmobi.media.Yf.c.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    weakReference = null;
                    break;
                }
                java.util.ArrayList arrayList = com.inmobi.media.Yf.c;
                if (kotlin.jvm.internal.Intrinsics.areEqual((android.content.Context) ((java.lang.ref.WeakReference) arrayList.get(i2)).get(), context)) {
                    weakReference = (java.lang.ref.WeakReference) arrayList.get(i2);
                    break;
                }
                i2++;
            }
            if (weakReference == null) {
                com.inmobi.media.Yf.c.add(new java.lang.ref.WeakReference(context));
            }
            com.squareup.picasso.Picasso picasso = com.inmobi.media.Yf.f5066a;
            if (picasso == null) {
                com.inmobi.media.Xi.a(context, com.inmobi.media.Yf.d);
                picasso = com.inmobi.media.Yf.a(context);
                com.inmobi.media.Yf.f5066a = picasso;
            }
            return picasso;
        } finally {
            mutex.unlock(null);
        }
    }
}
