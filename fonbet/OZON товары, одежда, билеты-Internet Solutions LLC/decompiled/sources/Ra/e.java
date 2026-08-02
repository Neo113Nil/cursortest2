package Ra;

import android.util.Pair;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.A;
import org.chromium.net.C;
import org.chromium.net.i;
import org.chromium.net.impl.b0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final i f24941a;

    public e(@NotNull i engine) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        this.f24941a = engine;
    }

    @NotNull
    public final b0 a(@NotNull Ja.i request, @NotNull Va.a executor, @NotNull C.b callback, A a11) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C.a a12 = this.f24941a.a(request.k(), callback, executor);
        a12.c(request.g().b());
        Intrinsics.checkNotNullExpressionValue(a12, "setHttpMethod(...)");
        Map<String, List<String>> headers = request.e();
        Intrinsics.checkNotNullParameter(a12, "<this>");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (!headers.isEmpty()) {
            for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (kotlin.text.h.D(key, "Accept-Encoding", true)) {
                    try {
                        Field declaredField = a12.getClass().getDeclaredField("mRequestHeaders");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(a12);
                        ArrayList arrayList = obj instanceof ArrayList ? (ArrayList) obj : null;
                        if (arrayList != null) {
                            arrayList.add(Pair.create(key, Ia.a.a(value)));
                        }
                    } catch (Throwable unused) {
                    }
                } else if (!value.isEmpty()) {
                    a12.a(key, Ia.a.a(value));
                }
            }
        }
        Ka.b a13 = request.a();
        if (a13 != null && a11 != null) {
            if (request.d("Content-Type") == null) {
                String c11 = a13.c();
                if (c11 == null) {
                    c11 = "application/json";
                }
                a12.a("Content-Type", c11);
            }
            if (request.d("Content-Length") == null) {
                a12.a("Content-Length", String.valueOf(a13.b()));
            }
            a12.d(a11, executor);
        }
        if (request.b()) {
            a12.b();
        }
        return (b0) a12;
    }
}
