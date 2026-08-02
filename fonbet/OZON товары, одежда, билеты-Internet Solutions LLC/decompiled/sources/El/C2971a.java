package El;

import H3.g;
import WZ.t;
import android.view.ViewGroup;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfa;
import l3.C7856b;
import m3.r;
import r8.c;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import u3.InterfaceC9928b;

/* renamed from: El.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C2971a implements g, r.a {
    public /* synthetic */ C2971a(InterfaceC9928b.a aVar) {
    }

    public static int a(IconDTO iconDTO, int i11, int i12) {
        return (iconDTO.hashCode() + i11) * i12;
    }

    public static ViewGroup b(ComposerReferences composerReferences) {
        return ContextExtKt.getRootView(composerReferences.getContainer().c());
    }

    public static void c(int i11, c.a aVar) {
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(i11);
        aVar.b(zzfaVar.zzb());
        aVar.a();
    }

    public static void d(StringBuilder sb2, String str, boolean z11, String str2, t tVar) {
        sb2.append(str);
        sb2.append(z11);
        sb2.append(str2);
        sb2.append(tVar);
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }

    @Override // H3.g
    public void x(C7856b c7856b) {
    }
}
