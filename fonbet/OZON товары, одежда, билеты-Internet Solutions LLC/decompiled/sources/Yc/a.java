package Yc;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LYc/a;", "", "<init>", "()V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class a {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYc/a$a;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Yc.a$a, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    private static final class C0647a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0647a f34890a = new C0647a();

        /* renamed from: b, reason: collision with root package name */
        public static final Method f34891b;

        static {
            Method method;
            Method[] methods = Throwable.class.getMethods();
            Intrinsics.f(methods);
            int length = methods.length;
            int i11 = 0;
            while (true) {
                method = null;
                if (i11 >= length) {
                    break;
                }
                Method method2 = methods[i11];
                if (Intrinsics.d(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                    Intrinsics.checkNotNullParameter(parameterTypes, "<this>");
                    if (Intrinsics.d(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                        method = method2;
                        break;
                    }
                }
                i11++;
            }
            f34891b = method;
            int length2 = methods.length;
            for (int i12 = 0; i12 < length2 && !Intrinsics.d(methods[i12].getName(), "getSuppressed"); i12++) {
            }
        }
    }

    public void a(@NotNull Throwable cause, @NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method method = C0647a.f34891b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }
}
