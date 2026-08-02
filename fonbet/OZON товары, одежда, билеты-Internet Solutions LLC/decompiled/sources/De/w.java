package De;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import xe.AbstractC10711a;
import xe.C10710B;

/* loaded from: classes.dex */
public class w<T> extends AbstractC10711a<T> implements kotlin.coroutines.jvm.internal.d {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.d<T> f6652d;

    public w(@NotNull kotlin.coroutines.d dVar, @NotNull CoroutineContext coroutineContext) {
        super(coroutineContext, true, true);
        this.f6652d = dVar;
    }

    @Override // xe.H0
    protected final boolean c0() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.d
    public final kotlin.coroutines.jvm.internal.d getCallerFrame() {
        kotlin.coroutines.d<T> dVar = this.f6652d;
        if (dVar instanceof kotlin.coroutines.jvm.internal.d) {
            return (kotlin.coroutines.jvm.internal.d) dVar;
        }
        return null;
    }

    @Override // xe.H0
    protected void r(Object obj) {
        C2867j.b(C10710B.a(obj), Wc.b.b(this.f6652d));
    }

    @Override // xe.H0
    protected void t(Object obj) {
        this.f6652d.resumeWith(C10710B.a(obj));
    }
}
