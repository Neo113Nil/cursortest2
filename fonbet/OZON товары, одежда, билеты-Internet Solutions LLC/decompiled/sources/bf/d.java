package bf;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class d extends AbstractC5657a {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function0 f55975e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Function0 function0, String str) {
        super(str, true);
        this.f55975e = function0;
    }

    @Override // bf.AbstractC5657a
    public final long f() {
        this.f55975e.invoke();
        return -1L;
    }
}
