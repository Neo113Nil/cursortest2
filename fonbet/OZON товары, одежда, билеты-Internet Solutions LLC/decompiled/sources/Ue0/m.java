package Ue0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class m extends AbstractC7737t implements Function0<d> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f27700b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(h hVar) {
        super(0);
        this.f27700b = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final d invoke() {
        return new d(this.f27700b.getContentView());
    }
}
