package H6;

import android.text.TextUtils;
import java.io.IOException;

/* loaded from: classes8.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    int f10670a;

    /* renamed from: b, reason: collision with root package name */
    int f10671b;

    e() {
    }

    static int a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            return -1159790593;
        }
        return ((str.charAt(3) & 255) << 24) | (str.charAt(0) & 255) | ((str.charAt(1) & 255) << 8) | ((str.charAt(2) & 255) << 16);
    }

    void b(I6.a aVar) throws IOException {
    }
}
