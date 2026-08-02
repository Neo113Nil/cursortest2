package M00;

import L00.f;
import L00.h;
import M00.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.net.Uri;
import com.squareup.moshi.D;
import d10.C6023a;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j<Type> f17222c = k.b(a.f17225b);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final U00.b f17223a;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f17224b;

    static final class a extends AbstractC7737t implements Function0<Type> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f17225b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Type invoke() {
            return D.e(Map.class, String.class, Object.class).getRawType();
        }
    }

    public b(@NotNull U00.b requestSerializer, boolean z11) {
        Intrinsics.checkNotNullParameter(requestSerializer, "requestSerializer");
        this.f17223a = requestSerializer;
        this.f17224b = Uri.parse(C6023a.a("composer-api.bx/widget/json/v2", z11)).getPathSegments();
    }

    @NotNull
    public final M00.a a(@NotNull M00.a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        f g10 = request.g();
        g10.getClass();
        f.a aVar = new f.a(g10);
        List<String> asyncWidgetsPathSegments = this.f17224b;
        Intrinsics.checkNotNullExpressionValue(asyncWidgetsPathSegments, "asyncWidgetsPathSegments");
        for (String str : asyncWidgetsPathSegments) {
            Intrinsics.f(str);
            aVar.a(str);
        }
        f b11 = aVar.b();
        a.C0334a c0334a = new a.C0334a(request);
        c0334a.e(b11);
        Map<String, Object> b12 = request.b();
        String a11 = request.a();
        LinkedHashMap u11 = U.u(b12);
        u11.put("asyncData", a11);
        Type value = f17222c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        String json = this.f17223a.toJson(u11, value);
        Intrinsics.checkNotNullParameter(json, "<this>");
        byte[] bytes = json.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        c0334a.c(new h("application/json; charset=utf-8", bytes));
        return c0334a.b();
    }
}
