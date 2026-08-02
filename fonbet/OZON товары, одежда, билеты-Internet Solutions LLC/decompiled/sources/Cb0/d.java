package Cb0;

import java.net.URI;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class d extends AbstractC7737t implements Function0<URI> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f4633b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar) {
        super(0);
        this.f4633b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final URI invoke() {
        Fb0.e eVar;
        eVar = this.f4633b.f4634b;
        return URI.create(eVar.i());
    }
}
