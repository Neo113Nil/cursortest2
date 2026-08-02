package Bl;

import O7.e;
import android.view.View;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import java.util.Map;
import k4.c;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

/* renamed from: Bl.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C2639a implements e, D {
    public static String a(String str, String str2, StringBuilder sb2, Map map, TestInfo testInfo) {
        sb2.append(testInfo);
        sb2.append(str);
        sb2.append(map);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String b(StringBuilder sb2, String str, Map map, String str2) {
        sb2.append(str);
        sb2.append(map);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder c(String str, long j11, String str2, TextAtom textAtom) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j11);
        sb2.append(str2);
        sb2.append(textAtom);
        return sb2;
    }

    public static StringBuilder d(String str, String str2, String str3, IconDTO iconDTO, TextDTO textDTO) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(textDTO);
        sb2.append(str2);
        sb2.append(iconDTO);
        sb2.append(str3);
        return sb2;
    }

    public static void e(String str, String str2, StringBuilder sb2, TextAtom textAtom, TextAtom textAtom2) {
        sb2.append(str);
        sb2.append(textAtom);
        sb2.append(str2);
        sb2.append(textAtom2);
    }

    @Override // O7.e
    public Object apply(Object obj) {
        long j11 = ((c) obj).f70452b;
        if (j11 == -9223372036854775807L) {
            j11 = 0;
        }
        return Long.valueOf(j11);
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 onViewCreated$lambda$27$lambda$26;
        onViewCreated$lambda$27$lambda$26 = CameraFragment.onViewCreated$lambda$27$lambda$26(view, c5353y0);
        return onViewCreated$lambda$27$lambda$26;
    }
}
