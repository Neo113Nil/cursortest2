package x6;

import java.util.Random;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L3.b f18099c = new L3.b(10);

    @Override // x6.a
    public final Random a() {
        Object obj = this.f18099c.get();
        h.d(obj, "get(...)");
        return (Random) obj;
    }
}
