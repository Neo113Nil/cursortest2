package Ve;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import m3.r;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import u3.InterfaceC9928b;

/* renamed from: Ve.t5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C4636t5 implements r.a {
    public /* synthetic */ C4636t5(InterfaceC9928b.a aVar, int i11, long j11, long j12) {
    }

    public static LayoutInflater a(ViewGroup viewGroup, String str) {
        Intrinsics.checkNotNullParameter(viewGroup, str);
        return LayoutInflater.from(viewGroup.getContext());
    }

    public static StringBuilder b(String str, String str2, String str3, String str4, boolean z11) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(z11);
        sb2.append(str4);
        return sb2;
    }

    public static void c(String str, String str2, StringBuilder sb2, TextAtom textAtom, TextAtom textAtom2) {
        sb2.append(textAtom);
        sb2.append(str);
        sb2.append(textAtom2);
        sb2.append(str2);
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }
}
