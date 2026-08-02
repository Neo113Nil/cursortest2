package financial.atomic.a;

/* loaded from: classes17.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final financial.atomic.transact.Transact f6732a;
    public final kotlinx.coroutines.CompletableDeferred b;

    public e(financial.atomic.transact.Transact transact) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transact, "");
        this.f6732a = transact;
        this.b = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(transact.get_scope(), kotlinx.coroutines.Dispatchers.getIO(), null, new financial.atomic.a.b(this, null), 2, null);
    }

    public static /* synthetic */ java.lang.Object get$default(financial.atomic.a.e eVar, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return eVar.get(str, str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object get(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        financial.atomic.a.c cVar;
        int i;
        if (continuation instanceof financial.atomic.a.c) {
            cVar = (financial.atomic.a.c) continuation;
            int i2 = cVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.e = i2 - 2147483648;
                java.lang.Object obj = cVar.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cVar.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CompletableDeferred completableDeferred = this.b;
                    cVar.f6730a = str;
                    cVar.b = str2;
                    cVar.e = 1;
                    obj = completableDeferred.await(cVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = cVar.b;
                    str = cVar.f6730a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return ((android.content.SharedPreferences) obj).getString(str, str2);
            }
        }
        cVar = new financial.atomic.a.c(this, continuation);
        java.lang.Object obj2 = cVar.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.e;
        if (i != 0) {
        }
        return ((android.content.SharedPreferences) obj2).getString(str, str2);
    }

    public final financial.atomic.transact.Transact getTransact() {
        return this.f6732a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object set(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        financial.atomic.a.d dVar;
        int i;
        android.content.SharedPreferences sharedPreferences;
        kotlin.Unit unit;
        if (continuation instanceof financial.atomic.a.d) {
            dVar = (financial.atomic.a.d) continuation;
            int i2 = dVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.e = i2 - 2147483648;
                java.lang.Object obj = dVar.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dVar.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CompletableDeferred completableDeferred = this.b;
                    dVar.f6731a = str;
                    dVar.b = str2;
                    dVar.e = 1;
                    obj = completableDeferred.await(dVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = dVar.b;
                    str = dVar.f6731a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                sharedPreferences = (android.content.SharedPreferences) obj;
                synchronized (sharedPreferences) {
                    android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (str2 != null) {
                        edit.putString(str, str2);
                    } else {
                        edit.remove(str);
                    }
                    edit.apply();
                    unit = kotlin.Unit.INSTANCE;
                }
                return unit;
            }
        }
        dVar = new financial.atomic.a.d(this, continuation);
        java.lang.Object obj2 = dVar.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dVar.e;
        if (i != 0) {
        }
        sharedPreferences = (android.content.SharedPreferences) obj2;
        synchronized (sharedPreferences) {
        }
    }
}
