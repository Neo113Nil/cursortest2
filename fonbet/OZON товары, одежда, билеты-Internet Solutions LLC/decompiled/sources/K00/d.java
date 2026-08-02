package K00;

import O00.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.domain.api.ComposerJsonDeserializer;

/* loaded from: classes7.dex */
final class d extends AbstractC7737t implements Function0<O00.b> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y00.a f14875b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ComposerJsonDeserializer f14876c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ U00.b f14877d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ a f14878e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f14879f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Y00.a aVar, ComposerJsonDeserializer composerJsonDeserializer, U00.b bVar, a aVar2, boolean z11) {
        super(0);
        this.f14875b = aVar;
        this.f14876c = composerJsonDeserializer;
        this.f14877d = bVar;
        this.f14878e = aVar2;
        this.f14879f = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final O00.b invoke() {
        ComposerJsonDeserializer composerJsonDeserializer;
        Y00.a aVar = this.f14875b;
        if (aVar == null || (composerJsonDeserializer = this.f14876c) == null) {
            return b.a.a();
        }
        Q00.b bVar = new Q00.b(composerJsonDeserializer);
        U00.b bVar2 = this.f14877d;
        if (bVar2 == null) {
            bVar2 = a.a(this.f14878e);
        }
        return new O00.c(aVar, bVar, new M00.b(bVar2, this.f14879f));
    }
}
