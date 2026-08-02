package Bl0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
public final class F extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Al0.b f3917b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Al0.b bVar) {
        super(0);
        this.f3917b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return "Insert new event with name: " + this.f3917b.b();
    }
}
