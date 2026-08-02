package R6;

import java.io.IOException;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import s8.InterfaceC9624a;
import s8.InterfaceC9625b;

/* loaded from: classes9.dex */
public final class b implements InterfaceC9624a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f24645a = new b();

    private static final class a implements r8.d<R6.a> {

        /* renamed from: a, reason: collision with root package name */
        static final a f24646a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final r8.c f24647b = r8.c.d("sdkVersion");

        /* renamed from: c, reason: collision with root package name */
        private static final r8.c f24648c = r8.c.d("model");

        /* renamed from: d, reason: collision with root package name */
        private static final r8.c f24649d = r8.c.d("hardware");

        /* renamed from: e, reason: collision with root package name */
        private static final r8.c f24650e = r8.c.d("device");

        /* renamed from: f, reason: collision with root package name */
        private static final r8.c f24651f = r8.c.d(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME);

        /* renamed from: g, reason: collision with root package name */
        private static final r8.c f24652g = r8.c.d("osBuild");

        /* renamed from: h, reason: collision with root package name */
        private static final r8.c f24653h = r8.c.d("manufacturer");

        /* renamed from: i, reason: collision with root package name */
        private static final r8.c f24654i = r8.c.d("fingerprint");

        /* renamed from: j, reason: collision with root package name */
        private static final r8.c f24655j = r8.c.d("locale");

        /* renamed from: k, reason: collision with root package name */
        private static final r8.c f24656k = r8.c.d("country");

        /* renamed from: l, reason: collision with root package name */
        private static final r8.c f24657l = r8.c.d("mccMnc");

        /* renamed from: m, reason: collision with root package name */
        private static final r8.c f24658m = r8.c.d("applicationBuild");

        @Override // r8.d
        public final void encode(Object obj, Object obj2) throws IOException {
            R6.a aVar = (R6.a) obj;
            r8.e eVar = (r8.e) obj2;
            eVar.add(f24647b, aVar.m());
            eVar.add(f24648c, aVar.j());
            eVar.add(f24649d, aVar.f());
            eVar.add(f24650e, aVar.d());
            eVar.add(f24651f, aVar.l());
            eVar.add(f24652g, aVar.k());
            eVar.add(f24653h, aVar.h());
            eVar.add(f24654i, aVar.e());
            eVar.add(f24655j, aVar.g());
            eVar.add(f24656k, aVar.c());
            eVar.add(f24657l, aVar.i());
            eVar.add(f24658m, aVar.b());
        }
    }

    /* renamed from: R6.b$b, reason: collision with other inner class name */
    private static final class C0491b implements r8.d<j> {

        /* renamed from: a, reason: collision with root package name */
        static final C0491b f24659a = new C0491b();

        /* renamed from: b, reason: collision with root package name */
        private static final r8.c f24660b = r8.c.d("logRequest");

        @Override // r8.d
        public final void encode(Object obj, Object obj2) throws IOException {
            ((r8.e) obj2).add(f24660b, ((j) obj).b());
        }
    }

    private static final class c implements r8.d<k> {

        /* renamed from: a, reason: collision with root package name */
        static final c f24661a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final r8.c f24662b = r8.c.d("clientType");

        /* renamed from: c, reason: collision with root package name */
        private static final r8.c f24663c = r8.c.d("androidClientInfo");

        @Override // r8.d
        public final void encode(Object obj, Object obj2) throws IOException {
            k kVar = (k) obj;
            r8.e eVar = (r8.e) obj2;
            eVar.add(f24662b, kVar.c());
            eVar.add(f24663c, kVar.b());
        }
    }

    private static final class d implements r8.d<l> {

        /* renamed from: a, reason: collision with root package name */
        static final d f24664a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final r8.c f24665b = r8.c.d("eventTimeMs");

        /* renamed from: c, reason: collision with root package name */
        private static final r8.c f24666c = r8.c.d("eventCode");

        /* renamed from: d, reason: collision with root package name */
        private static final r8.c f24667d = r8.c.d("eventUptimeMs");

        /* renamed from: e, reason: collision with root package name */
        private static final r8.c f24668e = r8.c.d("sourceExtension");

        /* renamed from: f, reason: collision with root package name */
        private static final r8.c f24669f = r8.c.d("sourceExtensionJsonProto3");

        /* renamed from: g, reason: collision with root package name */
        private static final r8.c f24670g = r8.c.d("timezoneOffsetSeconds");

        /* renamed from: h, reason: collision with root package name */
        private static final r8.c f24671h = r8.c.d("networkConnectionInfo");

        @Override // r8.d
        public final void encode(Object obj, Object obj2) throws IOException {
            l lVar = (l) obj;
            r8.e eVar = (r8.e) obj2;
            eVar.add(f24665b, lVar.b());
            eVar.add(f24666c, lVar.a());
            eVar.add(f24667d, lVar.c());
            eVar.add(f24668e, lVar.e());
            eVar.add(f24669f, lVar.f());
            eVar.add(f24670g, lVar.g());
            eVar.add(f24671h, lVar.d());
        }
    }

    private static final class e implements r8.d<m> {

        /* renamed from: a, reason: collision with root package name */
        static final e f24672a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final r8.c f24673b = r8.c.d("requestTimeMs");

        /* renamed from: c, reason: collision with root package name */
        private static final r8.c f24674c = r8.c.d("requestUptimeMs");

        /* renamed from: d, reason: collision with root package name */
        private static final r8.c f24675d = r8.c.d("clientInfo");

        /* renamed from: e, reason: collision with root package name */
        private static final r8.c f24676e = r8.c.d("logSource");

        /* renamed from: f, reason: collision with root package name */
        private static final r8.c f24677f = r8.c.d("logSourceName");

        /* renamed from: g, reason: collision with root package name */
        private static final r8.c f24678g = r8.c.d("logEvent");

        /* renamed from: h, reason: collision with root package name */
        private static final r8.c f24679h = r8.c.d("qosTier");

        @Override // r8.d
        public final void encode(Object obj, Object obj2) throws IOException {
            m mVar = (m) obj;
            r8.e eVar = (r8.e) obj2;
            eVar.add(f24673b, mVar.g());
            eVar.add(f24674c, mVar.h());
            eVar.add(f24675d, mVar.b());
            eVar.add(f24676e, mVar.d());
            eVar.add(f24677f, mVar.e());
            eVar.add(f24678g, mVar.c());
            eVar.add(f24679h, mVar.f());
        }
    }

    private static final class f implements r8.d<o> {

        /* renamed from: a, reason: collision with root package name */
        static final f f24680a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final r8.c f24681b = r8.c.d("networkType");

        /* renamed from: c, reason: collision with root package name */
        private static final r8.c f24682c = r8.c.d("mobileSubtype");

        @Override // r8.d
        public final void encode(Object obj, Object obj2) throws IOException {
            o oVar = (o) obj;
            r8.e eVar = (r8.e) obj2;
            eVar.add(f24681b, oVar.c());
            eVar.add(f24682c, oVar.b());
        }
    }

    @Override // s8.InterfaceC9624a
    public final void configure(InterfaceC9625b<?> interfaceC9625b) {
        C0491b c0491b = C0491b.f24659a;
        interfaceC9625b.registerEncoder(j.class, c0491b);
        interfaceC9625b.registerEncoder(R6.d.class, c0491b);
        e eVar = e.f24672a;
        interfaceC9625b.registerEncoder(m.class, eVar);
        interfaceC9625b.registerEncoder(g.class, eVar);
        c cVar = c.f24661a;
        interfaceC9625b.registerEncoder(k.class, cVar);
        interfaceC9625b.registerEncoder(R6.e.class, cVar);
        a aVar = a.f24646a;
        interfaceC9625b.registerEncoder(R6.a.class, aVar);
        interfaceC9625b.registerEncoder(R6.c.class, aVar);
        d dVar = d.f24664a;
        interfaceC9625b.registerEncoder(l.class, dVar);
        interfaceC9625b.registerEncoder(R6.f.class, dVar);
        f fVar = f.f24680a;
        interfaceC9625b.registerEncoder(o.class, fVar);
        interfaceC9625b.registerEncoder(i.class, fVar);
    }
}
