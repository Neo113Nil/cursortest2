package Bl0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Bl0.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2661w extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2664z f3996b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2661w(C2664z c2664z) {
        super(0);
        this.f3996b = c2664z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder("Create row in storage ");
        sb2.append((Object) ("MetricsEventUuid(value=" + this.f3996b.f4000a + ')'));
        return sb2.toString();
    }
}
