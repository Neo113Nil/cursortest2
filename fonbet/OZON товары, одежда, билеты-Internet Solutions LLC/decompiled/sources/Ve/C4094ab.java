package Ve;

import Ae.InterfaceC2397i;
import android.content.Intent;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import spay.sdk.RedirectActivity;
import spay.sdk.domain.model.FakeBankAuthData;

/* renamed from: Ve.ab, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4094ab implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30658b;

    public /* synthetic */ C4094ab(Object obj, int i11) {
        this.f30657a = i11;
        this.f30658b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        C4680uk c4680uk;
        int i11;
        switch (this.f30657a) {
            case 0:
                int i12 = !((Boolean) obj).booleanValue() ? 0 : 4;
                X4.a aVar = ((C4817zg) this.f30658b).f28693b;
                if (aVar == null) {
                    throw M7.f29463a;
                }
                ((Z4) aVar).f30563d.setVisibility(i12);
                return Unit.f71690a;
            case 1:
                Uh uh2 = (Uh) this.f30658b;
                uh2.requireActivity().startActivity(new Intent(uh2.getContext(), (Class<?>) RedirectActivity.class).putExtra("FAKE_BANK_AUTH_INTENT_KEY", (FakeBankAuthData) obj));
                return Unit.f71690a;
            default:
                if (dVar instanceof C4680uk) {
                    c4680uk = (C4680uk) dVar;
                    int i13 = c4680uk.f32226e;
                    if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c4680uk.f32226e = i13 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c4680uk.f32225d;
                        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c4680uk.f32226e;
                        if (i11 != 0) {
                            Sc.s.b(obj2);
                            if (obj instanceof Ij) {
                                c4680uk.f32226e = 1;
                                if (((InterfaceC2397i) this.f30658b).emit(obj, c4680uk) == aVar2) {
                                    return aVar2;
                                }
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
                c4680uk = new C4680uk(this, dVar);
                Object obj22 = c4680uk.f32225d;
                Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4680uk.f32226e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
        }
    }
}
