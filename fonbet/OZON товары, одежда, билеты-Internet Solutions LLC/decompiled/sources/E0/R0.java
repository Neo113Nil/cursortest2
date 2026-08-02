package E0;

import android.content.ClipDescription;
import h1.C6769b;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import o0.C8621a;

/* loaded from: classes8.dex */
final class R0 extends AbstractC7737t implements Function1<C6769b, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Set<C8621a>> f7078b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    R0(Function0<? extends Set<C8621a>> function0) {
        super(1);
        this.f7078b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C6769b c6769b) {
        C8621a c8621a;
        ClipDescription clipDescription = c6769b.a().getClipDescription();
        Set<? extends C8621a> invoke = ((G0) this.f7078b).invoke();
        boolean z11 = false;
        if (!(invoke instanceof Collection) || !invoke.isEmpty()) {
            for (C8621a c8621a2 : invoke) {
                c8621a = C8621a.f77451c;
                if (Intrinsics.d(c8621a2, c8621a) || clipDescription.hasMimeType(c8621a2.c())) {
                    z11 = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z11);
    }
}
