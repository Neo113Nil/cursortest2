package androidx.compose.material;

import J0.C3326o1;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$1$1", f = "ModalBottomSheet.kt", l = {WalletConstants.ERROR_CODE_INVALID_TRANSACTION}, m = "invokeSuspend")
/* renamed from: androidx.compose.material.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5227z extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f40156d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C3326o1 f40157e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5227z(C3326o1 c3326o1, kotlin.coroutines.d<? super C5227z> dVar) {
        super(2, dVar);
        this.f40157e = c3326o1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C5227z(this.f40157e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C5227z) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f40156d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f40156d = 1;
            if (this.f40157e.g(this) == aVar) {
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
