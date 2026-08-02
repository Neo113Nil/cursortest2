package F3;

import F3.F;
import F3.InterfaceC3018x;
import io.sentry.C7125b;
import io.sentry.C7141f;
import io.sentry.I2;
import io.sentry.InterfaceC7217w1;
import io.sentry.W2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlin.jvm.internal.Intrinsics;
import m3.InterfaceC8068j;
import yg0.C10900c;

/* loaded from: classes8.dex */
public final /* synthetic */ class D implements InterfaceC8068j, InterfaceC7217w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f8400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8402c;

    public /* synthetic */ D(Object obj, Object obj2, Object obj3) {
        this.f8400a = obj;
        this.f8401b = obj2;
        this.f8402c = obj3;
    }

    @Override // m3.InterfaceC8068j
    public void accept(Object obj) {
        ((F) obj).M(((F.a) this.f8400a).f8405a, (InterfaceC3018x.b) this.f8401b, (C3016v) this.f8402c);
    }

    @Override // io.sentry.InterfaceC7217w1
    public void e(io.sentry.U scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        ((C10900c) this.f8400a).getClass();
        scope.clear();
        io.sentry.U u11 = (io.sentry.U) this.f8401b;
        io.sentry.protocol.E user = u11.getUser();
        if (user != null) {
            scope.d(user);
        }
        I2 level = u11.getLevel();
        if (level != null) {
            scope.k(level);
        }
        String a11 = u11.a();
        if (a11 != null) {
            scope.z(a11);
        }
        io.sentry.protocol.o request = u11.getRequest();
        if (request != null) {
            scope.j(request);
        }
        scope.o(u11.y());
        String G11 = u11.G();
        if (G11 != null && G11.length() != 0) {
            scope.p(G11);
        }
        List<String> F11 = u11.F();
        Intrinsics.checkNotNullExpressionValue(F11, "getFingerprint(...)");
        if (!F11.isEmpty()) {
            scope.u(new ArrayList(u11.F()));
        }
        Map<String, String> tags = u11.getTags();
        Intrinsics.checkNotNullExpressionValue(tags, "getTags(...)");
        for (Map.Entry<String, String> entry : tags.entrySet()) {
            scope.setTag(entry.getKey(), entry.getValue());
        }
        Map<String, Object> extras = u11.getExtras();
        Intrinsics.checkNotNullExpressionValue(extras, "getExtras(...)");
        for (Map.Entry<String, Object> entry2 : extras.entrySet()) {
            scope.c(entry2.getKey(), entry2.getValue().toString());
        }
        Queue<C7141f> q11 = u11.q();
        Intrinsics.checkNotNullExpressionValue(q11, "getBreadcrumbs(...)");
        Iterator<T> it = q11.iterator();
        while (it.hasNext()) {
            scope.f((C7141f) it.next());
        }
        scope.s().m(u11.s());
        List<C7125b> J11 = u11.J();
        Intrinsics.checkNotNullExpressionValue(J11, "getAttachments(...)");
        Iterator<T> it2 = J11.iterator();
        while (it2.hasNext()) {
            scope.I((C7125b) it2.next());
        }
        W2 options = scope.getOptions();
        options.setDsn((String) this.f8402c);
        scope.D(options);
    }
}
