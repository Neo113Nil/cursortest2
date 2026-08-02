package K1;

import android.net.Uri;
import java.util.List;
import k1.C7460f;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnUnMuteAudioPlayerControllerListener;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes8.dex */
public final /* synthetic */ class G implements H, OnUnMuteAudioPlayerControllerListener {
    public static String b(Uri uri, String str) {
        return str + uri;
    }

    public static String c(StringBuilder sb2, AtomActionDTO atomActionDTO, String str) {
        sb2.append(atomActionDTO);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder d(String str, String str2, String str3, String str4, boolean z11) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(z11);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2;
    }

    public static StringBuilder e(String str, TextDTO textDTO, String str2, List list, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(textDTO);
        sb2.append(str2);
        sb2.append(list);
        sb2.append(str3);
        return sb2;
    }

    @Override // K1.H
    public boolean a(C7460f c7460f, C7460f c7460f2) {
        return c7460f2.f(c7460f.l());
    }
}
