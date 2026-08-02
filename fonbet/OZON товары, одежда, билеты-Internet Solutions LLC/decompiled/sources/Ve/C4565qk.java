package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.SPaySdkApp;
import spay.sdk.api.SPaySdkInitConfig;

/* renamed from: Ve.qk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4565qk extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SPaySdkApp f31880e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SPaySdkInitConfig f31881f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4565qk(SPaySdkApp sPaySdkApp, SPaySdkInitConfig sPaySdkInitConfig, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f31880e = sPaySdkApp;
        this.f31881f = sPaySdkInitConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4565qk(this.f31880e, this.f31881f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4565qk(this.f31880e, this.f31881f, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31879d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f31879d = 1;
            if (SPaySdkApp.access$cacheConfigToPreferences(this.f31880e, this.f31881f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
