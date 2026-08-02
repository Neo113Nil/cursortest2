package B0;

import S0.InterfaceC3967k;
import android.R;
import org.jetbrains.annotations.NotNull;

/* renamed from: B0.e1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC2468e1 {
    Cut(R.string.cut),
    Copy(R.string.copy),
    Paste(R.string.paste),
    SelectAll(R.string.selectAll);

    private final int stringId;

    EnumC2468e1(int i11) {
        this.stringId = i11;
    }

    @NotNull
    public final String a(InterfaceC3967k interfaceC3967k) {
        return G1.i.a(interfaceC3967k, this.stringId);
    }
}
