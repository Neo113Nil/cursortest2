package bc0;

import Ae.x0;
import Sc.s;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.logout.presentation.viewModel.LogoutViewModel$loading$1", f = "LogoutViewModel.kt", l = {126, 127, UserVerificationMethods.USER_VERIFY_PATTERN}, m = "invokeSuspend")
/* renamed from: bc0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5644c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f55906d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C5643b f55907e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ j f55908f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C5644c(C5643b c5643b, Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super C5644c> dVar) {
        super(2, dVar);
        this.f55907e = c5643b;
        this.f55908f = (j) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C5644c(this.f55907e, this.f55908f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C5644c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r6.f55908f.invoke(r6) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L20;
     */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f55906d;
        C5643b c5643b = this.f55907e;
        if (i11 == 0) {
            s.b(obj);
            x0 x0Var = c5643b.f55892d;
            Boolean bool = Boolean.TRUE;
            this.f55906d = 1;
        } else if (i11 == 1) {
            s.b(obj);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
            x0 x0Var2 = c5643b.f55892d;
            Boolean bool2 = Boolean.FALSE;
            this.f55906d = 3;
        }
        this.f55906d = 2;
    }
}
