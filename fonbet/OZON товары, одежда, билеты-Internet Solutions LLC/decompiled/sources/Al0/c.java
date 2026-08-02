package Al0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class c extends Exception {

    public static final class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable cause) {
            super("Interaction with database failed", cause);
            Intrinsics.checkNotNullParameter("Interaction with database failed", "message");
            Intrinsics.checkNotNullParameter(cause, "cause");
        }
    }

    public static final class b extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th2) {
            super("Http request was failed", th2);
            Intrinsics.checkNotNullParameter("Http request was failed", "message");
        }
    }

    /* renamed from: Al0.c$c, reason: collision with other inner class name */
    public static final class C0040c extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0040c(String message) {
            super(message, null);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }
}
