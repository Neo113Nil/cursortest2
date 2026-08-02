package N0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class t extends AbstractC7737t implements Function0<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f18342b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(s sVar) {
        super(0);
        this.f18342b = sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        s sVar = this.f18342b;
        return Boolean.valueOf((sVar.c() == null || sVar.d() == null) ? false : true);
    }
}
