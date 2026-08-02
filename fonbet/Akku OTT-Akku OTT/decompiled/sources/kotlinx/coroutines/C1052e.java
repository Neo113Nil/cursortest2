package kotlinx.coroutines;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {58}, m = "joinAll", n = {}, s = {})
/* renamed from: kotlinx.coroutines.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1052e extends ContinuationImpl {
    public Iterator a;
    public /* synthetic */ Object b;
    public int c;

    public C1052e() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return C1054f.a(null, this);
    }
}
