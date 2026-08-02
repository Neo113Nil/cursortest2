package kotlinx.coroutines.flow;

import androidx.appcompat.app.AppCompatDelegate;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n1#1,108:1\n55#2,3:109\n*E\n"})
/* renamed from: kotlinx.coroutines.flow.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1071o implements InterfaceC1060e<Object> {
    public final /* synthetic */ InterfaceC1060e a;
    public final /* synthetic */ Function3 b;

    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0}, l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 110}, m = "collect", n = {"this", "$this$catch_u24lambda_u240"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.o$a */
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public C1071o d;
        public InterfaceC1061f e;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return C1071o.this.collect(null, this);
        }
    }

    public C1071o(InterfaceC1060e interfaceC1060e, Function3 function3) {
        this.a = interfaceC1060e;
        this.b = function3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.InterfaceC1060e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC1061f<? super Object> interfaceC1061f, Continuation<? super Unit> continuation) {
        a aVar;
        int i;
        C1071o c1071o;
        Throwable th;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.b = i2 - Integer.MIN_VALUE;
                Object obj = aVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    aVar.d = this;
                    aVar.e = interfaceC1061f;
                    aVar.b = 1;
                    obj = C1062g.c(this.a, interfaceC1061f, aVar);
                    if (obj != coroutine_suspended) {
                        c1071o = this;
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
                interfaceC1061f = aVar.e;
                c1071o = aVar.d;
                ResultKt.throwOnFailure(obj);
                th = (Throwable) obj;
                if (th != null) {
                    Function3 function3 = c1071o.b;
                    aVar.d = null;
                    aVar.e = null;
                    aVar.b = 2;
                    InlineMarker.mark(6);
                    Object invoke = function3.invoke(interfaceC1061f, th, aVar);
                    InlineMarker.mark(7);
                }
                return Unit.INSTANCE;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.b;
        if (i != 0) {
        }
        th = (Throwable) obj2;
        if (th != null) {
        }
        return Unit.INSTANCE;
    }
}
