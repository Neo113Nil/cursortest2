package E0;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import o0.C8621a;
import p0.C8824b;

/* loaded from: classes8.dex */
final class G0 extends AbstractC7737t implements Function0<Set<? extends C8621a>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ F0 f7034b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G0(F0 f02) {
        super(0);
        this.f7034b = f02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<? extends C8621a> invoke() {
        Set<? extends C8621a> set;
        Set<? extends C8621a> set2;
        if (C8824b.a(this.f7034b) != null) {
            set2 = E0.f6985b;
            return set2;
        }
        set = E0.f6984a;
        return set;
    }
}
