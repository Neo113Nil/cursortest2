package bc0;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import ru.ozon.id.logout.data.ConfirmTrustedDeviceDTO;
import ru.ozon.id.logout.data.api.ConfirmTrustedDeviceActionResponse;
import ru.ozon.id.nativeauth.data.models.AuthTokenDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.logout.presentation.viewModel.LogoutViewModel$onActionButtonClicked$1", f = "LogoutViewModel.kt", l = {116, 117}, m = "invokeSuspend")
/* renamed from: bc0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5645d extends j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f55909d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C5643b f55910e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ConfirmTrustedDeviceDTO.Button f55911f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5645d(C5643b c5643b, ConfirmTrustedDeviceDTO.Button button, kotlin.coroutines.d<? super C5645d> dVar) {
        super(1, dVar);
        this.f55910e = c5643b;
        this.f55911f = button;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new C5645d(this.f55910e, this.f55911f, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((C5645d) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (bc0.C5643b.g0(r2, r6, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r6 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f55909d;
        C5643b c5643b = this.f55910e;
        if (i11 == 0) {
            s.b(obj);
            ru.ozon.id.logout.data.d dVar = (ru.ozon.id.logout.data.d) c5643b.f55890b.getValue();
            ConfirmTrustedDeviceDTO.Button.Action action = this.f55911f.getAction();
            this.f55909d = 1;
            obj = dVar.g(action, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        AuthTokenDTO authToken = ((ConfirmTrustedDeviceActionResponse) obj).getAuthToken();
        this.f55909d = 2;
    }
}
