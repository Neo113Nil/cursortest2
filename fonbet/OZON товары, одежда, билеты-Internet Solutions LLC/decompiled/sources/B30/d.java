package B30;

import B30.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r.o;

/* loaded from: classes3.dex */
public final class d extends o.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function1<a.EnumC0054a, Unit> f2387a;

    d(Function1 function1) {
        this.f2387a = function1;
    }

    @Override // r.o.a
    public final void onAuthenticationError(int i11, CharSequence errString) {
        Intrinsics.checkNotNullParameter(errString, "errString");
        super.onAuthenticationError(i11, errString);
        Function1<a.EnumC0054a, Unit> function1 = this.f2387a;
        if (i11 == 7 || i11 == 10 || i11 == 13) {
            function1.invoke(a.EnumC0054a.CANCELED);
        } else {
            function1.invoke(a.EnumC0054a.FAILED);
        }
        L80.a.a("BiometricAuthManagerImpl", "onAuthenticationError: errorCode: " + i11);
    }

    @Override // r.o.a
    public final void onAuthenticationFailed() {
        super.onAuthenticationFailed();
        L80.a.a("BiometricAuthManagerImpl", "onAuthenticationFailed");
        this.f2387a.invoke(a.EnumC0054a.FAILED);
    }

    @Override // r.o.a
    public final void onAuthenticationSucceeded(o.b result) {
        Intrinsics.checkNotNullParameter(result, "result");
        super.onAuthenticationSucceeded(result);
        L80.a.a("BiometricAuthManagerImpl", "onAuthenticationSucceeded: authType: " + result.a());
        this.f2387a.invoke(a.EnumC0054a.SUCCESS);
    }
}
