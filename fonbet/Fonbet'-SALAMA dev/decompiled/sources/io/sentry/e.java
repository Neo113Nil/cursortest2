package io.sentry;

import io.sentry.JsonObjectDeserializer;
import io.sentry.Scope;
import io.sentry.hints.Retryable;
import io.sentry.util.HintUtils;
import java.io.File;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements JsonObjectDeserializer.NextValue, HintUtils.SentryConsumer, Scope.IWithPropagationContext, Scope.IWithTransaction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14462c;

    public /* synthetic */ e(int i7, Object obj, Object obj2) {
        this.f14460a = i7;
        this.f14461b = obj;
        this.f14462c = obj2;
    }

    @Override // io.sentry.Scope.IWithTransaction
    public void accept(ITransaction iTransaction) {
        ((SentryTracer) this.f14461b).lambda$finish$1((IScope) this.f14462c, iTransaction);
    }

    @Override // io.sentry.JsonObjectDeserializer.NextValue
    public Object nextValue() {
        Object lambda$parse$1;
        lambda$parse$1 = ((JsonObjectDeserializer) this.f14461b).lambda$parse$1((JsonObjectReader) this.f14462c);
        return lambda$parse$1;
    }

    @Override // io.sentry.Scope.IWithPropagationContext
    public void accept(PropagationContext propagationContext) {
        ((IScope) this.f14461b).setPropagationContext((PropagationContext) this.f14462c);
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public void accept(Object obj) {
        switch (this.f14460a) {
            case 1:
                ((EnvelopeSender) this.f14461b).lambda$processFile$2((File) this.f14462c, (Retryable) obj);
                break;
            default:
                ((OutboxSender) this.f14461b).lambda$processFile$0((File) this.f14462c, (Retryable) obj);
                break;
        }
    }
}
