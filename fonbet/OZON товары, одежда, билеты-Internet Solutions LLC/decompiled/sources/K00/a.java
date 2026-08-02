package K00;

import L00.f;
import Sc.InterfaceC4008j;
import Sc.k;
import a10.C4917e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.domain.api.ComposerJsonDeserializer;
import ru.ozon.app.android.composer.network.redirect.ComposerRedirectListener;
import ru.ozon.app.android.composer.tracker.ComposerNetworkMetricsProvider;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    private static volatile boolean f14851h;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f14852a = k.b(e.f14880b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f14853b = k.b(h.f14882b);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Jb.j f14854c = new Jb.j();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f14855d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final L00.f f14856e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f14857f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f14858g;

    /* renamed from: K00.a$a, reason: collision with other inner class name */
    public static final class C0284a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final L00.b f14859a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final L00.a f14860b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private String f14861c;

        /* renamed from: d, reason: collision with root package name */
        private U00.b f14862d;

        /* renamed from: e, reason: collision with root package name */
        private ComposerNetworkMetricsProvider f14863e;

        /* renamed from: f, reason: collision with root package name */
        private ComposerRedirectListener f14864f;

        /* renamed from: g, reason: collision with root package name */
        private Y00.a f14865g;

        /* renamed from: h, reason: collision with root package name */
        private ComposerJsonDeserializer f14866h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f14867i;

        public C0284a(@NotNull L00.b api, @NotNull L00.a apiConfig) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(apiConfig, "apiConfig");
            this.f14859a = api;
            this.f14860b = apiConfig;
            this.f14861c = "https://api.ozon.ru/";
        }

        @NotNull
        public final void a(@NotNull String baseUrl) {
            Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
            int I11 = kotlin.text.h.I(':', 0, 6, baseUrl);
            if (I11 == -1) {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but scheme was not found");
            }
            if (kotlin.text.h.e0(baseUrl, "https:", true) || kotlin.text.h.e0(baseUrl, "http:", true)) {
                this.f14861c = baseUrl;
                return;
            }
            String substring = baseUrl.substring(0, I11);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + substring + "'");
        }

        @NotNull
        public final void b(@NotNull ComposerJsonDeserializer deserializer, @NotNull Y00.a api) {
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            Intrinsics.checkNotNullParameter(api, "api");
            this.f14866h = deserializer;
            this.f14865g = api;
        }

        @NotNull
        public final a c() {
            return new a(this.f14859a, this.f14860b, this.f14861c, this.f14862d, this.f14863e, this.f14864f, this.f14865g, this.f14866h, this.f14867i);
        }

        @NotNull
        public final void d(boolean z11) {
            this.f14867i = z11;
        }

        @NotNull
        public final void e(@NotNull ComposerNetworkMetricsProvider networkMetricsProvider) {
            Intrinsics.checkNotNullParameter(networkMetricsProvider, "networkMetricsProvider");
            this.f14863e = networkMetricsProvider;
        }

        @NotNull
        public final void f(@NotNull ComposerRedirectListener redirectListener) {
            Intrinsics.checkNotNullParameter(redirectListener, "redirectListener");
            this.f14864f = redirectListener;
        }

        @NotNull
        public final void g(@NotNull U00.b requestSerializer) {
            Intrinsics.checkNotNullParameter(requestSerializer, "requestSerializer");
            this.f14862d = requestSerializer;
        }
    }

    public a(L00.b bVar, L00.a aVar, String str, U00.b bVar2, ComposerNetworkMetricsProvider composerNetworkMetricsProvider, ComposerRedirectListener composerRedirectListener, Y00.a aVar2, ComposerJsonDeserializer composerJsonDeserializer, boolean z11) {
        this.f14855d = k.b(new c(str, bVar, aVar, bVar2, this, composerNetworkMetricsProvider, z11));
        this.f14856e = new f.a(str).b();
        this.f14857f = k.b(new g(composerRedirectListener));
        this.f14858g = k.b(new d(aVar2, composerJsonDeserializer, bVar2, this, z11));
    }

    public static final U00.c a(a aVar) {
        return (U00.c) aVar.f14853b.getValue();
    }

    public static j d(a aVar, n20.k widgetStore, f10.b composerViewItemProcessorFactory) {
        P00.d decoder = aVar.c(widgetStore);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
        Intrinsics.checkNotNullParameter(composerViewItemProcessorFactory, "composerViewItemProcessorFactory");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new j(aVar.f(), decoder, (C4917e) aVar.f14857f.getValue(), composerViewItemProcessorFactory);
    }

    @NotNull
    public final P00.d c(@NotNull n20.k widgetStore) {
        Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
        U00.c cVar = (U00.c) this.f14853b.getValue();
        InterfaceC4008j interfaceC4008j = this.f14852a;
        return new P00.d(new P00.j(widgetStore, cVar, (P00.e) interfaceC4008j.getValue()), new P00.h(widgetStore, (P00.e) interfaceC4008j.getValue()), (P00.e) interfaceC4008j.getValue(), this.f14854c);
    }

    @NotNull
    public final L00.f e() {
        return this.f14856e;
    }

    @NotNull
    public final L00.d f() {
        return (L00.d) this.f14855d.getValue();
    }

    @NotNull
    public final O00.b g() {
        return (O00.b) this.f14858g.getValue();
    }

    @NotNull
    public final void h(boolean z11) {
        f14851h = z11;
    }
}
