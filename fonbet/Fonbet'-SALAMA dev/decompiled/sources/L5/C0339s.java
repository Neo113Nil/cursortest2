package L5;

import android.content.Context;
import w1.C1718l0;

/* renamed from: L5.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0339s extends C0343w {

    /* renamed from: d, reason: collision with root package name */
    public final String f4505d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0339s(Context context, C1718l0 c1718l0, String str, int i7) {
        super(r2);
        y2.j h6;
        if (str == null) {
            y2.j jVar = y2.j.f18155i;
            h6 = J2.d.h(i7, context, 0);
            h6.f18167d = true;
        } else if (str.equals("portrait")) {
            y2.j jVar2 = y2.j.f18155i;
            h6 = J2.d.h(i7, context, 1);
            h6.f18167d = true;
        } else {
            if (!str.equals("landscape")) {
                throw new IllegalArgumentException("Unexpected value for orientation: ".concat(str));
            }
            y2.j jVar3 = y2.j.f18155i;
            h6 = J2.d.h(i7, context, 2);
            h6.f18167d = true;
        }
        this.f4505d = str;
    }
}
