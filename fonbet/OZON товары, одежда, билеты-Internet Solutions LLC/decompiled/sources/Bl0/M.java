package Bl0;

import Ve.C4180da;
import Ve.R7;
import java.net.URI;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10727i;

/* loaded from: classes8.dex */
public final class M extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3934b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3935c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(Object obj, int i11) {
        super(0);
        this.f3934b = i11;
        this.f3935c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3934b) {
            case 0:
                ((U) this.f3935c).f3948a.getClass();
                return new URI("https://stats.rustore.ru").resolve("/v1/send_custom_event_batch").toURL();
            default:
                C4180da c4180da = (C4180da) this.f3935c;
                return C10727i.a(c4180da.f30862b, null, null, new R7(c4180da, null), 3);
        }
    }
}
