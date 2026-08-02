package Ih0;

import Wh0.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class h extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f12537b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d.b f12538c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(n nVar, d.b bVar) {
        super(0);
        this.f12537b = nVar;
        this.f12538c = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return "Successfully sent events from " + this.f12537b.name() + " with code " + this.f12538c.a();
    }
}
