package B3;

import B3.C2571o;
import com.google.android.gms.internal.measurement.zzjj;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.Paddings;

/* loaded from: classes8.dex */
public final /* synthetic */ class p implements C2571o.b {
    public static int a(int i11, int i12, int i13) {
        return zzjj.zzA(i11) + i12 + i13;
    }

    public static StringBuilder b(String str, Paddings paddings, String str2, Paddings paddings2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(paddings);
        sb2.append(str2);
        sb2.append(paddings2);
        sb2.append(str3);
        return sb2;
    }

    public static void c(String str, String str2, String str3, StringBuilder sb2, AtomActionDTO atomActionDTO) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(atomActionDTO);
        sb2.append(str3);
    }

    public static void d(StringBuilder sb2, String str, WZ.t tVar, String str2, WZ.t tVar2) {
        sb2.append(str);
        sb2.append(tVar);
        sb2.append(str2);
        sb2.append(tVar2);
    }
}
