package Ml0;

import Pl0.q;
import kb.C7625a;
import kotlin.jvm.internal.Intrinsics;
import mb.C8122a;
import org.jetbrains.annotations.NotNull;
import ub.RemoteExceptionC10012s;

/* loaded from: classes4.dex */
public final class h extends Db.a {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final Za.d f18170e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull C7625a backOff) {
        super(backOff);
        Za.d logger = q.f22702a;
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(backOff, "backOff");
        this.f18170e = logger.c("IPCClientRetryComponent");
    }

    @Override // Db.a
    @NotNull
    public final Za.d c() {
        return this.f18170e;
    }

    @Override // Db.a
    public final boolean e(@NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (exception instanceof C8122a) {
            return true;
        }
        return exception instanceof RemoteExceptionC10012s;
    }
}
