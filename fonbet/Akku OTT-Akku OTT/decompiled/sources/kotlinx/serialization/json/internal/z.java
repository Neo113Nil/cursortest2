package kotlinx.serialization.json.internal;

import java.util.LinkedHashMap;
import kotlin.DeepRecursiveScope;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", i = {0, 0, 0, 0}, l = {24}, m = "readObject", n = {"$this$readObject", "this_$iv", "result$iv", "key$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes5.dex */
public final class z extends ContinuationImpl {
    public DeepRecursiveScope a;
    public A b;
    public LinkedHashMap c;
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ A f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(A a, BaseContinuationImpl baseContinuationImpl) {
        super(baseContinuationImpl);
        this.f = a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return A.a(this.f, null, this);
    }
}
