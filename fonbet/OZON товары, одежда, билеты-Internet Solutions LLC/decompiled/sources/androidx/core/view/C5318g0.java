package androidx.core.view;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR, WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE}, m = "invokeSuspend")
/* renamed from: androidx.core.view.g0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5318g0 extends kotlin.coroutines.jvm.internal.i implements Function2<kotlin.sequences.k<? super View>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f42293d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f42294e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ConstraintLayout f42295f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5318g0(ConstraintLayout constraintLayout, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f42295f = constraintLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C5318g0 c5318g0 = new C5318g0(this.f42295f, dVar);
        c5318g0.f42294e = obj;
        return c5318g0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlin.sequences.k<? super View> kVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C5318g0) create(kVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (r6 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        if (r1.b(r2, r5) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        kotlin.sequences.k kVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f42293d;
        ConstraintLayout constraintLayout = this.f42295f;
        if (i11 == 0) {
            Sc.s.b(obj);
            kVar = (kotlin.sequences.k) this.f42294e;
            this.f42294e = kVar;
            this.f42293d = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            kVar = (kotlin.sequences.k) this.f42294e;
            Sc.s.b(obj);
        }
        if (constraintLayout != null) {
            this.f42294e = null;
            this.f42293d = 2;
            kVar.getClass();
            Object c11 = kVar.c(new P(new C5314e0(constraintLayout), C5312d0.f42290b), this);
            if (c11 != aVar) {
                c11 = Unit.f71690a;
            }
        }
        return Unit.f71690a;
    }
}
