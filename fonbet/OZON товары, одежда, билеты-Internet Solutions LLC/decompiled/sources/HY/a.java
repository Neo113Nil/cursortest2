package HY;

import android.view.View;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import r8.c;
import ru.ozon.app.android.web.TransparentNavbarWebFragment;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import u8.C9982a;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements D {
    public static StringBuilder a(String str, TextAtom textAtom, String str2, TextAtom textAtom2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(textAtom);
        sb2.append(str2);
        sb2.append(textAtom2);
        sb2.append(str3);
        return sb2;
    }

    public static r8.c b(int i11, c.a aVar) {
        C9982a b11 = C9982a.b();
        b11.c(i11);
        aVar.b(b11.a());
        return aVar.a();
    }

    public static void c(String str, String str2, String str3, StringBuilder sb2, OzonSpannableString ozonSpannableString) {
        sb2.append((Object) ozonSpannableString);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        return TransparentNavbarWebFragment.setupWindowInsets$lambda$2(view, c5353y0);
    }
}
