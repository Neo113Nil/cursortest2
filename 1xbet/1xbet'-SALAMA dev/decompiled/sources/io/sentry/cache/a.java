package io.sentry.cache;

import io.sentry.util.LazyEvaluator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements LazyEvaluator.Evaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14456b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f14455a = i7;
        this.f14456b = obj;
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public final Object evaluate() {
        switch (this.f14455a) {
            case 0:
                return ((CacheStrategy) this.f14456b).lambda$new$0();
            default:
                return ((PersistingScopeObserver) this.f14456b).lambda$new$0();
        }
    }
}
