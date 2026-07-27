package sg.bigo.ads.n;

import android.text.TextUtils;
import android.util.Pair;
import android.widget.TextView;
import sg.bigo.ads.h.E1;

/* renamed from: sg.bigo.ads.n.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5356B implements E1 {
    @Override // sg.bigo.ads.h.E1
    public final Pair a(TextView textView, String str, String str2) {
        if (textView.getTag() == 6 && TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            textView.setVisibility(8);
        }
        return Pair.create(str, str2);
    }
}
