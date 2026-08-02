package K00;

import a10.C4917e;
import a10.InterfaceC4918f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.network.redirect.ComposerRedirectListener;

/* loaded from: classes7.dex */
final class g extends AbstractC7737t implements Function0<C4917e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ComposerRedirectListener f14881b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(ComposerRedirectListener composerRedirectListener) {
        super(0);
        this.f14881b = composerRedirectListener;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C4917e invoke() {
        InterfaceC4918f interfaceC4918f = this.f14881b;
        if (interfaceC4918f == null) {
            interfaceC4918f = new f();
        }
        return new C4917e(interfaceC4918f);
    }
}
