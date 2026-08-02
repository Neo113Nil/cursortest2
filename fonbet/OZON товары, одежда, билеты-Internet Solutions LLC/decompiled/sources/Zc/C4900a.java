package Zc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LZc/a;", "LYc/a;", "<init>", "()V", "a", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zc.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4900a extends Yc.a {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZc/a$a;", "", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zc.a$a, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    private static final class C0676a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0676a f35813a = new C0676a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f35814b;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                f35814b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f35814b = num2;
        }
    }

    @Override // Yc.a
    public final void a(@NotNull Throwable cause, @NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Integer num = C0676a.f35814b;
        if (num == null || num.intValue() >= 19) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
