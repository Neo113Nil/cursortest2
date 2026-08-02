package Pl0;

import Db.a;
import Ol0.w;
import Sc.InterfaceC4008j;
import bm0.InterfaceC5683a;
import fm0.InterfaceC6586g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Za.d f22647a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final InterfaceC4008j f22648b;

    public static final class a extends AbstractC7737t implements Function0<El0.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f22649b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final El0.a invoke() {
            h.f22655a.getClass();
            InterfaceC5683a pushTokenRepository = h.c();
            InterfaceC4008j interfaceC4008j = h.f22659e;
            InterfaceC6586g interfaceC6586g = (InterfaceC6586g) interfaceC4008j.getValue();
            Za.d dVar = q.f22702a;
            Za.d logger = d.f22647a;
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(pushTokenRepository, "pushTokenRepository");
            Yl0.c cVar = new Yl0.c(pushTokenRepository, (InterfaceC6586g) interfaceC4008j.getValue(), logger);
            Yl0.d dVar2 = new Yl0.d((Nl0.h) h.f22667m.getValue());
            Nl0.n nVar = new Nl0.n(new w(new n()));
            Nl0.j jVar = (Nl0.j) h.f22672r.getValue();
            int i11 = Db.a.f6289d;
            return new El0.a(new c(), pushTokenRepository, interfaceC6586g, cVar, dVar2, new Yl0.l(nVar, new Ml0.h(a.C0133a.a()), jVar), new Yl0.n((Zl0.f) h.f22663i.getValue(), (InterfaceC6586g) interfaceC4008j.getValue(), (Ll0.a) Pl0.a.f22642b.getValue()));
        }
    }

    static {
        El0.n nVar = e.f22651b;
        f22647a = nVar != null ? nVar.f8117c : new Za.b("VkpnsClientSdk");
        f22648b = Sc.k.b(a.f22649b);
    }
}
