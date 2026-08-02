package Bl0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
public final class E extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Al0.b f3916b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(Al0.b bVar) {
        super(0);
        this.f3916b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return "MetricsClient enqueue " + this.f3916b;
    }
}
