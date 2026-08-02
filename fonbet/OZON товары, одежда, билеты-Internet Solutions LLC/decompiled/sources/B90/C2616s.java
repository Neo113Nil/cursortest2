package B90;

import androidx.preference.Preference;
import com.google.android.gms.internal.mlkit_vision_text_common.zzct;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ClassHandler;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import r8.c;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* renamed from: B90.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2616s implements Preference.c, O7.e {
    public static int a(int i11, int i12, K1.T t2) {
        return (t2.hashCode() + i11) * i12;
    }

    public static String c(String str, L4.e eVar, String str2, L4.e eVar2) {
        return str + eVar + str2 + eVar2;
    }

    public static StringBuilder d(String str, ImageDTO imageDTO, String str2, TextDTO textDTO, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(imageDTO);
        sb2.append(str2);
        sb2.append(textDTO);
        sb2.append(str3);
        return sb2;
    }

    public static c.a e(int i11, c.a aVar, String str) {
        zzct zzctVar = new zzct();
        zzctVar.zza(i11);
        aVar.b(zzctVar.zzb());
        aVar.a();
        return r8.c.a(str);
    }

    public static void f(Class cls, Archive archive, List list, boolean z11) {
        archive.add(list, z11, new ClassHandler(cls));
    }

    public static void g(String str, String str2, StringBuilder sb2, List list, List list2) {
        sb2.append(list);
        sb2.append(str);
        sb2.append(list2);
        sb2.append(str2);
    }

    @Override // O7.e
    public Object apply(Object obj) {
        return Long.valueOf(((k4.c) obj).f70452b);
    }

    @Override // androidx.preference.Preference.c
    public void b(Preference preference, Serializable serializable) {
        Intrinsics.g(serializable, "null cannot be cast to non-null type kotlin.Boolean");
        L80.a.h(((Boolean) serializable).booleanValue());
    }
}
