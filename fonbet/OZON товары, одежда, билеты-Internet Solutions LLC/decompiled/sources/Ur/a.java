package Ur;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.M;
import io.sentry.C7209u1;
import io.sentry.InterfaceC7142f0;
import io.sentry.U;
import io.sentry.android.core.ActivityLifecycleIntegration;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateExtKt;

/* loaded from: classes11.dex */
public final /* synthetic */ class a implements M, C7209u1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f27856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27858c;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3) {
        this.f27856a = obj;
        this.f27857b = obj2;
        this.f27858c = obj3;
    }

    @Override // io.sentry.C7209u1.c
    public void a(InterfaceC7142f0 interfaceC7142f0) {
        ActivityLifecycleIntegration.k((ActivityLifecycleIntegration) this.f27856a, (U) this.f27857b, (InterfaceC7142f0) this.f27858c, interfaceC7142f0);
    }

    @Override // androidx.fragment.app.M
    public void f(Bundle bundle, String str) {
        OnBoardingDelegateExtKt.setupFragmentResultListener$lambda$0((Function1) this.f27856a, (Function0) this.f27857b, (View) this.f27858c, str, bundle);
    }
}
