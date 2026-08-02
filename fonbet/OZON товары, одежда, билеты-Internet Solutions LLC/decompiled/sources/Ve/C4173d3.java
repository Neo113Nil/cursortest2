package Ve;

import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.otp.OneTimePasswordStateBuilderKt;

/* renamed from: Ve.d3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4173d3 implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2397i f30847a;

    public C4173d3(InterfaceC2397i interfaceC2397i) {
        this.f30847a = interfaceC2397i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        C4803z2 c4803z2;
        int i11;
        Integer w02;
        if (dVar instanceof C4803z2) {
            c4803z2 = (C4803z2) dVar;
            int i12 = c4803z2.f32619e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4803z2.f32619e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = c4803z2.f32618d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4803z2.f32619e;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    ErrorEntity errorEntity = ((C4755xa) obj).f32475a;
                    ErrorEntity.ApiError apiError = errorEntity instanceof ErrorEntity.ApiError ? (ErrorEntity.ApiError) errorEntity : null;
                    String errorCode = apiError != null ? apiError.getErrorCode() : null;
                    AbstractC4663u3 abstractC4663u3 = OneTimePasswordStateBuilderKt.confirmationOneTimePasswordState$default("", (errorCode == null || (w02 = kotlin.text.h.w0(errorCode)) == null) ? 2 : w02.intValue(), null, 4, null) instanceof C4289h4 ? Q2.f29749c : (Intrinsics.d(errorCode, "300") || Intrinsics.d(errorCode, "301") || Intrinsics.d(errorCode, "307")) ? N.f29509c : Intrinsics.d(errorCode, "304") ? C4431m2.f31550c : (Intrinsics.d(errorCode, "302") || Intrinsics.d(errorCode, "303") || Intrinsics.d(errorCode, "305")) ? C4113b1.f30700c : Intrinsics.d(errorCode, "306") ? H1.f29101c : C4689v0.f32243c;
                    c4803z2.f32619e = 1;
                    if (this.f30847a.emit(abstractC4663u3, c4803z2) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj2);
                }
                return Unit.f71690a;
            }
        }
        c4803z2 = new C4803z2(this, dVar);
        Object obj22 = c4803z2.f32618d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4803z2.f32619e;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }
}
