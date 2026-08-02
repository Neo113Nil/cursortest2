package F3;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.mlkit_vision_text_common.zzct;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ClassHandler;
import java.util.List;
import m3.r;
import r8.c;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import u3.InterfaceC9928b;

/* loaded from: classes8.dex */
public final /* synthetic */ class G implements O7.e, r.a {
    public /* synthetic */ G(InterfaceC9928b.a aVar) {
    }

    public static String a(StringBuilder sb2, float f7, char c11) {
        sb2.append(f7);
        sb2.append(c11);
        return sb2.toString();
    }

    public static String b(ButtonV3DTO buttonV3DTO, String str, String str2) {
        return str + buttonV3DTO + str2;
    }

    public static StringBuilder c(String str, long j11, String str2, ButtonV3DTO buttonV3DTO) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j11);
        sb2.append(str2);
        sb2.append(buttonV3DTO);
        return sb2;
    }

    public static List d(Class cls, Archive archive, List list, boolean z11) {
        return archive.add(list, z11, new ClassHandler(cls));
    }

    public static r8.c e(int i11, c.a aVar) {
        zzct zzctVar = new zzct();
        zzctVar.zza(i11);
        aVar.b(zzctVar.zzb());
        return aVar.a();
    }

    public static void f(StringBuilder sb2, TextDTO textDTO, String str, IconDTO iconDTO, String str2) {
        sb2.append(textDTO);
        sb2.append(str);
        sb2.append(iconDTO);
        sb2.append(str2);
    }

    public static void g(TextAtomV2View textAtomV2View, int i11, int i12, int i13) {
        textAtomV2View.setId(i11);
        textAtomV2View.setLayoutParams(new ConstraintLayout.b(i12, i13));
    }

    @Override // O7.e
    public Object apply(Object obj) {
        return ((InterfaceC3017w) obj).getTrackGroups().b();
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }
}
