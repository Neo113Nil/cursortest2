package Cm0;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class c implements b {
    @NonNull
    protected Dm0.b a(char c11) {
        return Dm0.a.b(c11);
    }

    @Override // Cm0.b
    @NonNull
    public Dm0.b[] parseSlots(@NonNull CharSequence charSequence) {
        if (charSequence == null || ((String) charSequence).length() == 0) {
            throw new IllegalArgumentException("String representation of the mask's slots is empty");
        }
        String str = (String) charSequence;
        Dm0.b[] bVarArr = new Dm0.b[str.length()];
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            bVarArr[i11] = charAt == '_' ? Dm0.a.a() : a(charAt);
        }
        return bVarArr;
    }
}
