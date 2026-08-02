package D00;

import i10.h;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import y00.AbstractC10819a;

/* loaded from: classes7.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f5203a = true;

    @Override // D00.a
    public final void a() {
        this.f5203a = true;
    }

    @Override // D00.a
    public final AbstractC10819a.b b(h.c cVar, long j11) {
        if (!this.f5203a || !(cVar instanceof h.c.a)) {
            return null;
        }
        h.c.a aVar = (h.c.a) cVar;
        String c11 = aVar.c();
        if (c11 == null) {
            c11 = aVar.e();
        }
        if (System.currentTimeMillis() - j11 > 400) {
            return null;
        }
        b bVar = new b(Nk.a.b("Freq load url=", c11));
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        return new AbstractC10819a.b(c11, C7705l.P(stackTrace, "\n", null, null, null, 62), bVar);
    }

    @Override // D00.a
    public final void disable() {
        this.f5203a = false;
    }
}
