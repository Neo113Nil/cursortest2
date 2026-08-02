package Ih;

import Ih.b;
import ru.ozon.uni.atoms.data.AtomActionDTO;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements b.a.InterfaceC0251b {
    public static int a(String str, String str2) {
        return (str + str2).hashCode();
    }

    public static int b(AtomActionDTO atomActionDTO, int i11, int i12) {
        return (atomActionDTO.hashCode() + i11) * i12;
    }

    @Override // Ih.b.a.InterfaceC0251b
    public Boolean getValue() {
        return Boolean.FALSE;
    }
}
