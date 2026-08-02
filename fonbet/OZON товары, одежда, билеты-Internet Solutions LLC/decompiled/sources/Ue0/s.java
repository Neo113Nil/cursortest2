package Ue0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class s extends AbstractC7737t implements Function0<x> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f27706b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(h hVar) {
        super(0);
        this.f27706b = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final x invoke() {
        return new x(this.f27706b.getContentView());
    }
}
