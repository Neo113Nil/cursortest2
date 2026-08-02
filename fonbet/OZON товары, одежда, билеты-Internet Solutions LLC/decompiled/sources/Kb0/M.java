package Kb0;

import android.accounts.AccountManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class M extends AbstractC7737t implements Function0<AccountManager> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f15550b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    M(K k11) {
        super(0);
        this.f15550b = k11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AccountManager invoke() {
        return AccountManager.get(this.f15550b.m());
    }
}
