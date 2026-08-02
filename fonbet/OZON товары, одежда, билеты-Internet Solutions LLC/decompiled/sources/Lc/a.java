package Lc;

import F3.C3016v;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfa;
import java.util.concurrent.atomic.AtomicReference;
import m3.r;
import r8.c;
import ru.ozon.app.android.partpayment.presentation.HomeCreditNavigator;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;
import u3.InterfaceC9928b;
import xZ.i;

/* loaded from: classes9.dex */
public final /* synthetic */ class a implements i, r.a {
    public /* synthetic */ a(InterfaceC9928b.a aVar, C3016v c3016v) {
    }

    public static int a(Icon icon, int i11, int i12) {
        return (icon.hashCode() + i11) * i12;
    }

    public static String b(String str, TextDTO textDTO, String str2, TextDTO textDTO2, String str3) {
        return str + textDTO + str2 + textDTO2 + str3;
    }

    public static c.a c(int i11, c.a aVar, String str) {
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(i11);
        aVar.b(zzfaVar.zzb());
        aVar.a();
        return r8.c.a(str);
    }

    public static void d(TextAtomV2View textAtomV2View, int i11, int i12, int i13, boolean z11) {
        textAtomV2View.setId(i11);
        textAtomV2View.setLayoutParams(new ConstraintLayout.b(i12, i13));
        textAtomV2View.setTextIsSelectable(z11);
    }

    public static /* synthetic */ boolean e(AtomicReference atomicReference, Throwable th2) {
        while (!atomicReference.compareAndSet(null, th2)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // xZ.i
    public ComponentCallbacksC5392m create() {
        ComponentCallbacksC5392m _init_$lambda$0;
        _init_$lambda$0 = HomeCreditNavigator._init_$lambda$0();
        return _init_$lambda$0;
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }
}
