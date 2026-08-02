package androidx.compose.ui.platform;

import S0.InterfaceC3978p0;
import android.content.res.Configuration;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class V extends AbstractC7737t implements Function1<Configuration, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Configuration> f40745b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    V(InterfaceC3978p0<Configuration> interfaceC3978p0) {
        super(1);
        this.f40745b = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Configuration configuration) {
        Configuration configuration2 = new Configuration(configuration);
        int i11 = AndroidCompositionLocals_androidKt.f40599g;
        this.f40745b.setValue(configuration2);
        return Unit.f71690a;
    }
}
