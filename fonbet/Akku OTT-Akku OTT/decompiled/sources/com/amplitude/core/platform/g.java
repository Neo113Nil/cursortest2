package com.amplitude.core.platform;

import com.amplitude.core.utilities.y;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.K;
import kotlinx.coroutines.channels.b;

@DebugMetadata(c = "com.amplitude.core.platform.EventPipeline$write$1", f = "EventPipeline.kt", i = {1}, l = {86, 91}, m = "invokeSuspend", n = {"triggerFlush"}, s = {"I$0"})
/* loaded from: classes3.dex */
public final class g extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
    public kotlinx.coroutines.channels.i a;
    public int b;
    public int c;
    public final /* synthetic */ b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.d = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new g(this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super Unit> continuation) {
        return ((g) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r13 == r3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        if (r9.h(r13, r12) == r3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
    
        if (0 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0071, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x008a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0061 -> B:8:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x006f -> B:8:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0072 -> B:8:0x007b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.channels.i aVar;
        kotlinx.coroutines.channels.i iVar;
        int i;
        b bVar = this.d;
        AtomicInteger atomicInteger = bVar.b;
        com.amplitude.core.b bVar2 = bVar.a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.b bVar3 = bVar.g;
            bVar3.getClass();
            aVar = new b.a();
            this.a = aVar;
            this.c = 1;
            obj = aVar.b(this);
        } else if (i2 == 1) {
            aVar = this.a;
            ResultKt.throwOnFailure(obj);
            iVar = aVar;
            if (!((Boolean) obj).booleanValue()) {
                return Unit.INSTANCE;
            }
            n nVar = (n) iVar.next();
            if (nVar.a == o.b) {
                i = 1;
                if (1 == 0 && (r13 = nVar.b) != null) {
                    com.amplitude.core.k kVar = bVar.e;
                    this.a = iVar;
                    this.b = 1;
                    this.c = 2;
                }
            } else {
                i = 0;
            }
            if (!Intrinsics.areEqual(bVar2.a.z, Boxing.boxBoolean(true))) {
            }
            aVar = iVar;
            this.a = aVar;
            this.c = 1;
            obj = aVar.b(this);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.b;
            iVar = this.a;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e) {
                y.d(e, bVar2.i(), "Error when writing event to pipeline");
            }
            if (!Intrinsics.areEqual(bVar2.a.z, Boxing.boxBoolean(true))) {
                int incrementAndGet = atomicInteger.incrementAndGet();
                int i3 = bVar2.a.c / bVar.k.get();
                Integer valueOf = Integer.valueOf(i3);
                if (i3 == 0) {
                    valueOf = null;
                }
                if (incrementAndGet >= (valueOf != null ? valueOf.intValue() : 1) || i != 0) {
                    atomicInteger.set(0);
                    bVar.h.c("#!upload");
                } else {
                    C1082i.c(bVar.f, bVar2.f, null, new e(bVar, null), 2);
                }
            }
            aVar = iVar;
            this.a = aVar;
            this.c = 1;
            obj = aVar.b(this);
        }
    }
}
