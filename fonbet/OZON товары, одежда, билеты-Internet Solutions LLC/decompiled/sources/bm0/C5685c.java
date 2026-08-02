package bm0;

import java.io.IOException;
import kb.C7625a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yb.C10878a;

/* renamed from: bm0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5685c extends Db.a {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final Za.d f56109e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5685c(Za.d logger) {
        super(backOff);
        C7625a.C1162a c1162a = new C7625a.C1162a();
        c1162a.b(Db.a.f6287b);
        c1162a.c(Db.a.f6288c);
        C7625a backOff = c1162a.a();
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(backOff, "backOff");
        this.f56109e = logger.c("PushTokenRequestRetryComponent");
    }

    @Override // Db.a
    @NotNull
    public final Za.d c() {
        return this.f56109e;
    }

    @Override // Db.a
    public final boolean e(@NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (exception instanceof IOException) {
            return true;
        }
        if (!(exception instanceof C10878a)) {
            return false;
        }
        C10878a c10878a = (C10878a) exception;
        if (c10878a.a() == 429) {
            return true;
        }
        int a11 = c10878a.a();
        return 500 <= a11 && a11 < 600;
    }
}
