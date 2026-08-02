package kotlinx.coroutines;

import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes5.dex */
public final class X0 {

    @DebugMetadata(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", i = {0, 0, 0}, l = {ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE}, m = "withTimeoutOrNull", n = {"block", "coroutine", "timeMillis"}, s = {"L$0", "L$1", "J$0"})
    public static final class a<T> extends ContinuationImpl {
        public Object a;
        public Ref.ObjectRef b;
        public /* synthetic */ Object c;
        public int d;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return X0.c(0L, null, this);
        }
    }

    public static final <U, T extends U> Object a(W0<U, ? super T> w0, Function2<? super K, ? super Continuation<? super T>, ? extends Object> function2) {
        Object a2;
        com.google.common.base.r.f(w0, true, new C1079g0(W.c(w0.d.get$context()).d(w0.e, w0, w0.c)));
        try {
            a2 = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(function2, w0, w0) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(w0, w0);
        } catch (Throwable th) {
            a2 = new A(th, false);
        }
        if (a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        Object N = w0.N(a2);
        if (N == F0.b) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (N instanceof A) {
            Throwable th2 = ((A) N).a;
            if (!(th2 instanceof V0)) {
                throw th2;
            }
            if (((V0) th2).a != w0) {
                throw th2;
            }
            if (a2 instanceof A) {
                throw ((A) a2).a;
            }
        } else {
            a2 = F0.a(N);
        }
        return a2;
    }

    public static final Object b(long j, Function2 function2, ContinuationImpl continuationImpl) {
        if (j <= 0) {
            throw new V0("Timed out immediately", null);
        }
        Object a2 = a(new W0(j, continuationImpl), function2);
        if (a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.W0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object c(long j, Function2<? super K, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        a aVar;
        int i;
        Ref.ObjectRef objectRef;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.d = i2 - Integer.MIN_VALUE;
                Object obj = aVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (j <= 0) {
                        return null;
                    }
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    try {
                        aVar.a = function2;
                        aVar.b = objectRef2;
                        aVar.d = 1;
                        ?? r2 = (T) new W0(j, aVar);
                        objectRef2.element = r2;
                        Object a2 = a(r2, function2);
                        if (a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(aVar);
                        }
                        return a2 == coroutine_suspended ? coroutine_suspended : a2;
                    } catch (V0 e) {
                        e = e;
                        objectRef = objectRef2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = aVar.b;
                    try {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    } catch (V0 e2) {
                        e = e2;
                    }
                }
                if (e.a != objectRef.element) {
                    return null;
                }
                throw e;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.d;
        if (i != 0) {
        }
        if (e.a != objectRef.element) {
        }
    }
}
