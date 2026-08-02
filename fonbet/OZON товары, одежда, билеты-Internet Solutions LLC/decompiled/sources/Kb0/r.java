package Kb0;

import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
final class r extends AbstractC7737t implements Function0<SharedPreferences> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3483u f15727b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(C3483u c3483u) {
        super(0);
        this.f15727b = c3483u;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SharedPreferences invoke() {
        SharedPreferences sharedPreferences = this.f15727b.f15733a.m().getSharedPreferences("instant_login_prefs", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }
}
