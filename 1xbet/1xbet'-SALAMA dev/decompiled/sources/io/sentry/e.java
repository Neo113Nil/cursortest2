package io.sentry;

import io.sentry.hints.Retryable;
import io.sentry.util.HintUtils;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements JsonObjectDeserializer.NextValue, HintUtils.SentryConsumer, Scope.IWithPropagationContext, Scope.IWithTransaction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14468c;

    public /* synthetic */ e(int i7, Object obj, Object obj2) {
        this.f14466a = i7;
        this.f14467b = obj;
        this.f14468c = obj2;
    }

    @Override // io.sentry.Scope.IWithTransaction
    public void accept(ITransaction iTransaction) {
        ((SentryTracer) this.f14467b).lambda$finish$1((IScope) this.f14468c, iTransaction);
    }

    @Override // io.sentry.JsonObjectDeserializer.NextValue
    public Object nextValue() {
        return ((JsonObjectDeserializer) this.f14467b).lambda$parse$1((JsonObjectReader) this.f14468c);
    }

    @Override // io.sentry.Scope.IWithPropagationContext
    public void accept(PropagationContext propagationContext) {
        ((IScope) this.f14467b).setPropagationContext((PropagationContext) this.f14468c);
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public void accept(Object obj) {
        switch (this.f14466a) {
            case 1:
                ((EnvelopeSender) this.f14467b).lambda$processFile$2((File) this.f14468c, (Retryable) obj);
                break;
            default:
                ((OutboxSender) this.f14467b).lambda$processFile$0((File) this.f14468c, (Retryable) obj);
                break;
        }
    }
}
