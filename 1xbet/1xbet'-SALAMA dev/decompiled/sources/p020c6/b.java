package p020c6;

import J0.a;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10450a;

    static {
        Logger.getLogger(b.class.getName());
        if (!P6.b.x(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        }
        f10450a = new a("internal-stub-type", 1);
    }
}
