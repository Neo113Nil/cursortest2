package P3;

import java.nio.charset.StandardCharsets;
import m3.C8050C;

/* loaded from: classes8.dex */
final class h implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f21784a;

    private h(String str) {
        this.f21784a = str;
    }

    public static h a(C8050C c8050c) {
        return new h(c8050c.C(c8050c.a(), StandardCharsets.UTF_8));
    }

    @Override // P3.a
    public final int getType() {
        return 1852994675;
    }
}
