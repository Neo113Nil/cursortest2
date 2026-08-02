package Kb0;

import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Kb0.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C3476q extends AbstractC7737t implements Function0<SharedPreferences> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3483u f15725b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3476q(C3483u c3483u) {
        super(0);
        this.f15725b = c3483u;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SharedPreferences invoke() {
        return this.f15725b.d().getValue();
    }
}
