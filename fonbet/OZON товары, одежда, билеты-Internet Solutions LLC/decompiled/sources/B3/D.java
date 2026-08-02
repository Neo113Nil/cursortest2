package B3;

import android.graphics.drawable.GradientDrawable;
import c8.C5767f;
import com.google.crypto.tink.internal.AbstractC5887f;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class D implements E, AbstractC5887f.a, O7.e {
    public static GradientDrawable b(int i11) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i11);
        return gradientDrawable;
    }

    public static String c(StringBuilder sb2, String str, char c11) {
        sb2.append(str);
        sb2.append(c11);
        return sb2.toString();
    }

    @Override // B3.E
    public List a(String str, boolean z11, boolean z12) {
        return M.d(str, z11, z12);
    }

    @Override // O7.e
    public Object apply(Object obj) {
        return (h4.o) obj;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5887f.a
    public He.g d(com.google.crypto.tink.internal.F f7, S7.r rVar) {
        return C5767f.c(f7, rVar);
    }
}
