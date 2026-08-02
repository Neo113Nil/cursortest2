package kotlinx.coroutines.flow;

import com.amplitude.android.o;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", i = {}, l = {213, 213}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class w extends SuspendLambda implements Function3<InterfaceC1061f<Object>, Object, Continuation<? super Unit>, Object> {
    public int a;
    public /* synthetic */ InterfaceC1061f b;
    public /* synthetic */ Object c;
    public final /* synthetic */ o.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(o.a aVar, Continuation continuation) {
        super(3, continuation);
        this.d = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(InterfaceC1061f<Object> interfaceC1061f, Object obj, Continuation<? super Unit> continuation) {
        w wVar = new w(this.d, continuation);
        wVar.b = interfaceC1061f;
        wVar.c = obj;
        return wVar.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r1.emit(r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r5 == r0) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC1061f interfaceC1061f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            interfaceC1061f = this.b;
            Object obj2 = this.c;
            this.b = interfaceC1061f;
            this.a = 1;
            obj = this.d.invoke(obj2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            interfaceC1061f = this.b;
            ResultKt.throwOnFailure(obj);
        }
        this.b = null;
        this.a = 2;
    }
}
