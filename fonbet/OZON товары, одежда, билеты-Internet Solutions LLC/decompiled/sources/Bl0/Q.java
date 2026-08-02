package Bl0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes4.dex */
public final class Q extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f3944b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(Throwable th2) {
        super(0);
        this.f3944b = th2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return "Http request was failed with: " + this.f3944b;
    }
}
