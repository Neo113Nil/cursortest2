package c6;

import java.util.logging.Logger;

/* renamed from: c6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0823b {

    /* renamed from: a, reason: collision with root package name */
    public static final J0.a f10450a;

    static {
        Logger.getLogger(AbstractC0823b.class.getName());
        if (!P6.b.x(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        }
        f10450a = new J0.a("internal-stub-type", 1);
    }
}
