package Tl;

import WZ.t;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import m3.r;
import ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.text.TextDTO;
import u3.InterfaceC9928b;

/* loaded from: classes11.dex */
public final /* synthetic */ class b implements r.a {
    public /* synthetic */ b(InterfaceC9928b.a aVar, int i11) {
    }

    public static int a(ButtonV3Atom.LargeButton largeButton, int i11, int i12) {
        return (largeButton.hashCode() + i11) * i12;
    }

    public static int b(CornerRadius cornerRadius, int i11, int i12) {
        return (cornerRadius.hashCode() + i11) * i12;
    }

    public static LayoutInflater c(ViewGroup viewGroup, String str, String str2) {
        Intrinsics.checkNotNullParameter(viewGroup, str);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        Intrinsics.checkNotNullExpressionValue(from, str2);
        return from;
    }

    public static String d(StringBuilder sb2, t tVar, String str) {
        sb2.append(tVar);
        sb2.append(str);
        return sb2.toString();
    }

    public static String e(StringBuilder sb2, TextDTO textDTO, String str) {
        sb2.append(textDTO);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder f(String str, String str2, String str3, String str4, List list) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(list);
        sb2.append(str4);
        return sb2;
    }

    public static void g(StringBuilder sb2, Map map, String str, Map map2, String str2) {
        sb2.append(map);
        sb2.append(str);
        sb2.append(map2);
        sb2.append(str2);
    }

    public static void h(StringBuilder sb2, CommonAtomLabelDTO commonAtomLabelDTO, String str, CommonAtomLabelDTO commonAtomLabelDTO2, String str2) {
        sb2.append(commonAtomLabelDTO);
        sb2.append(str);
        sb2.append(commonAtomLabelDTO2);
        sb2.append(str2);
    }

    public static boolean i(AtomAction.Click click, String str, String str2) {
        Intrinsics.checkNotNullParameter(click, str);
        return Intrinsics.d(click.getId(), str2);
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }
}
