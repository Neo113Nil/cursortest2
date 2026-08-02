package io.sentry.cache;

import io.sentry.ISerializer;
import io.sentry.cache.tape.ObjectQueue;
import io.sentry.util.LazyEvaluator;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements LazyEvaluator.Evaluator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14449a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14450b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f14449a = i7;
        this.f14450b = obj;
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public final Object evaluate() {
        ISerializer lambda$new$0;
        ObjectQueue lambda$new$02;
        switch (this.f14449a) {
            case 0:
                lambda$new$0 = ((CacheStrategy) this.f14450b).lambda$new$0();
                return lambda$new$0;
            default:
                lambda$new$02 = ((PersistingScopeObserver) this.f14450b).lambda$new$0();
                return lambda$new$02;
        }
    }
}
