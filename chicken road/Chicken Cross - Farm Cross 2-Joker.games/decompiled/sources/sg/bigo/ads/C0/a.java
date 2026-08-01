package sg.bigo.ads.C0;

import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import sg.bigo.ads.K0.C4966x;

/* loaded from: classes3.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final int f12244a;
    public final InputStream b;
    public final C4966x c;

    public a(int i, ByteArrayInputStream byteArrayInputStream, C4966x c4966x) {
        this.f12244a = i;
        this.b = byteArrayInputStream;
        this.c = c4966x;
    }

    public final String a(String str) {
        List<String> list;
        if (!TextUtils.isEmpty(str) && (list = (List) this.c.f12365a.get(str.toLowerCase())) != null && !list.isEmpty()) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
            }
        }
        return "";
    }

    public a(int i, InputStream inputStream, C4966x c4966x) {
        this.f12244a = i;
        this.b = inputStream;
        this.c = c4966x;
    }
}
