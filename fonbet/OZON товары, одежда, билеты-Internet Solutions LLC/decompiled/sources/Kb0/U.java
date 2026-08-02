package Kb0;

import android.app.KeyguardManager;
import gc0.C6708a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
final class U extends AbstractC7737t implements Function0<C6708a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f15557b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U(K k11) {
        super(0);
        this.f15557b = k11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C6708a invoke() {
        K k11 = this.f15557b;
        KeyguardManager keyguardManager = (KeyguardManager) androidx.core.content.a.getSystemService(k11.m(), KeyguardManager.class);
        r.n c11 = r.n.c(k11.m());
        Intrinsics.checkNotNullExpressionValue(c11, "from(...)");
        return new C6708a(k11.m(), keyguardManager, c11, k11.W().g(), k11.F());
    }
}
