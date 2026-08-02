package U50;

import kotlin.jvm.functions.Function1;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NativeBridgeConfigurator f27351b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27352c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f27353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f27354e;

    public /* synthetic */ j(int i11, NativeBridgeConfigurator nativeBridgeConfigurator, String str, String str2, String str3) {
        this.f27350a = i11;
        this.f27351b = nativeBridgeConfigurator;
        this.f27352c = str;
        this.f27353d = str2;
        this.f27354e = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = this.f27352c;
        String str2 = this.f27353d;
        return NativeBridgeConfigurator.n(this.f27350a, this.f27351b, str, str2, this.f27354e, (NativeResult) obj);
    }
}
