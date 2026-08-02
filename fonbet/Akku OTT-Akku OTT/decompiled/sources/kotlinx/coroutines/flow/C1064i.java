package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", i = {0, 0, 0, 1, 1, 1}, l = {32, 33}, m = "emitAllImpl$FlowKt__ChannelsKt", n = {"$this$emitAllImpl", "channel", "consume", "$this$emitAllImpl", "channel", "consume"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
/* renamed from: kotlinx.coroutines.flow.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1064i<T> extends ContinuationImpl {
    public InterfaceC1061f a;
    public kotlinx.coroutines.channels.v b;
    public kotlinx.coroutines.channels.i c;
    public boolean d;
    public /* synthetic */ Object e;
    public int f;

    public C1064i() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return com.amplitude.android.storage.b.a(null, null, false, this);
    }
}
