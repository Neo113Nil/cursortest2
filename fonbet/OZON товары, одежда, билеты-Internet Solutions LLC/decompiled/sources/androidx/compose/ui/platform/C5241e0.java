package androidx.compose.ui.platform;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: androidx.compose.ui.platform.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5241e0 extends AbstractC7737t implements Function1<S0.N, S0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f40868b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacks2C5244f0 f40869c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5241e0(Context context, ComponentCallbacks2C5244f0 componentCallbacks2C5244f0) {
        super(1);
        this.f40868b = context;
        this.f40869c = componentCallbacks2C5244f0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final S0.M invoke(S0.N n11) {
        Context context = this.f40868b;
        Context applicationContext = context.getApplicationContext();
        ComponentCallbacks2C5244f0 componentCallbacks2C5244f0 = this.f40869c;
        applicationContext.registerComponentCallbacks(componentCallbacks2C5244f0);
        return new C5238d0(context, componentCallbacks2C5244f0);
    }
}
