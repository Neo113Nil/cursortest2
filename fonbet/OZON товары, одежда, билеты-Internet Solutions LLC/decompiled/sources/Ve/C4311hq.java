package Ve;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.api.InitializationResult;
import spay.sdk.api.SdkReadyCheckResult;

/* renamed from: Ve.hq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4311hq extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f31214b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ spay.sdk.d f31215c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f31216d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4311hq(Function1 function1, spay.sdk.d dVar, Context context) {
        super(1);
        this.f31214b = function1;
        this.f31215c = dVar;
        this.f31216d = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InitializationResult initializationResult = (InitializationResult) obj;
        Intrinsics.checkNotNullParameter(initializationResult, "initializationResult");
        boolean z11 = initializationResult instanceof InitializationResult.ConfigError;
        Function1 function1 = this.f31214b;
        if (z11) {
            function1.invoke(new SdkReadyCheckResult.NotReady(((InitializationResult.ConfigError) initializationResult).getMessage()));
        } else if (Intrinsics.d(initializationResult, InitializationResult.Success.INSTANCE)) {
            function1.invoke(this.f31215c.b(this.f31216d));
        }
        return Unit.f71690a;
    }
}
