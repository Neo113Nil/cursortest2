package Tz;

import He.g;
import com.google.crypto.tink.internal.AbstractC5887f;
import com.google.crypto.tink.internal.F;
import h8.C6874b;
import java.util.List;
import m3.r;
import ru.ozon.uni.atoms.data.text.TextDTO;
import u3.InterfaceC9928b;

/* renamed from: Tz.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C4055a implements AbstractC5887f.a, r.a {
    public /* synthetic */ C4055a(InterfaceC9928b.a aVar, int i11) {
    }

    public static StringBuilder a(String str, String str2, String str3, String str4, List list) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(list);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2;
    }

    public static StringBuilder b(TextDTO textDTO, String str, String str2, String str3, int i11) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i11);
        sb2.append(str2);
        sb2.append(textDTO);
        sb2.append(str3);
        return sb2;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5887f.a
    public g d(F f7, S7.r rVar) {
        return C6874b.a(f7, rVar);
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }
}
