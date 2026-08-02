package K00;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.tracker.ComposerNetworkMetricsProvider;

/* loaded from: classes7.dex */
final class c extends AbstractC7737t implements Function0<L00.e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f14868b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ L00.b f14869c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ L00.a f14870d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ U00.b f14871e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ a f14872f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ComposerNetworkMetricsProvider f14873g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f14874h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(String str, L00.b bVar, L00.a aVar, U00.b bVar2, a aVar2, ComposerNetworkMetricsProvider composerNetworkMetricsProvider, boolean z11) {
        super(0);
        this.f14868b = str;
        this.f14869c = bVar;
        this.f14870d = aVar;
        this.f14871e = bVar2;
        this.f14872f = aVar2;
        this.f14873g = composerNetworkMetricsProvider;
        this.f14874h = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final L00.e invoke() {
        U00.b bVar = this.f14871e;
        if (bVar == null) {
            bVar = a.a(this.f14872f);
        }
        U00.b bVar2 = bVar;
        N00.b bVar3 = this.f14873g;
        if (bVar3 == null) {
            bVar3 = new b();
        }
        N00.b bVar4 = bVar3;
        return new L00.e(this.f14868b, this.f14869c, this.f14870d, bVar2, bVar4, this.f14874h);
    }
}
