package kotlinx.coroutines.flow.internal;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.L;
import kotlinx.coroutines.flow.InterfaceC1060e;
import kotlinx.coroutines.flow.InterfaceC1061f;

@SourceDebugExtension({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,241:1\n1#2:242\n*E\n"})
/* loaded from: classes5.dex */
public abstract class g<T> implements q<T> {

    @JvmField
    public final CoroutineContext a;

    @JvmField
    public final int b;

    @JvmField
    public final kotlinx.coroutines.channels.a c;

    public g(CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.a aVar) {
        this.a = coroutineContext;
        this.b = i;
        this.c = aVar;
    }

    @Override // kotlinx.coroutines.flow.internal.q
    public final InterfaceC1060e<T> a(CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.a aVar) {
        CoroutineContext coroutineContext2 = this.a;
        CoroutineContext plus = coroutineContext.plus(coroutineContext2);
        kotlinx.coroutines.channels.a aVar2 = kotlinx.coroutines.channels.a.a;
        kotlinx.coroutines.channels.a aVar3 = this.c;
        int i2 = this.b;
        if (aVar == aVar2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            aVar = aVar3;
        }
        return (Intrinsics.areEqual(plus, coroutineContext2) && i == i2 && aVar == aVar3) ? this : d(plus, i, aVar);
    }

    public abstract Object b(kotlinx.coroutines.channels.t<? super T> tVar, Continuation<? super Unit> continuation);

    @Override // kotlinx.coroutines.flow.InterfaceC1060e
    public Object collect(InterfaceC1061f<? super T> interfaceC1061f, Continuation<? super Unit> continuation) {
        Object c = L.c(new e(interfaceC1061f, this, null), continuation);
        return c == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? c : Unit.INSTANCE;
    }

    public abstract g<T> d(CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.a aVar);

    public String toString() {
        String joinToString$default;
        ArrayList arrayList = new ArrayList(4);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext = this.a;
        if (coroutineContext != emptyCoroutineContext) {
            arrayList.add("context=" + coroutineContext);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        kotlinx.coroutines.channels.a aVar = kotlinx.coroutines.channels.a.a;
        kotlinx.coroutines.channels.a aVar2 = this.c;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
        return androidx.compose.runtime.t.b(']', joinToString$default, sb);
    }
}
