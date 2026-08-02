package androidx.work.impl;

import h5.RunnableC6807e;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class G extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.work.t f45314b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C f45315c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ n f45316d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G(androidx.work.t tVar, C c11, n nVar) {
        super(0);
        this.f45314b = tVar;
        this.f45315c = c11;
        this.f45316d = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List a02 = C7714v.a0(this.f45314b);
        new RunnableC6807e(new v(this.f45315c, "NotificationChannelStateWorker", androidx.work.g.KEEP, a02), this.f45316d).run();
        return Unit.f71690a;
    }
}
