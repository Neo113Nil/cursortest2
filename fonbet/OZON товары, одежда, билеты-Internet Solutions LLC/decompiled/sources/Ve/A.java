package Ve;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
public final class A extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28568b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Cloneable f28569c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(Cloneable cloneable, int i11) {
        super(0);
        this.f28568b = i11;
        this.f28569c = cloneable;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28568b) {
            case 0:
                ((Intent) this.f28569c).setFlags(268435456);
                return Unit.f71690a;
            default:
                return (We.E) this.f28569c;
        }
    }
}
