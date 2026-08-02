package I3;

import I3.B;
import j3.C7256L;
import java.util.Objects;
import t3.C9734F;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final int f11822a;

    /* renamed from: b, reason: collision with root package name */
    public final C9734F[] f11823b;

    /* renamed from: c, reason: collision with root package name */
    public final y[] f11824c;

    /* renamed from: d, reason: collision with root package name */
    public final C7256L f11825d;

    /* renamed from: e, reason: collision with root package name */
    public final B.a f11826e;

    public F(C9734F[] c9734fArr, y[] yVarArr, C7256L c7256l, B.a aVar) {
        G10.a.c(c9734fArr.length == yVarArr.length);
        this.f11823b = c9734fArr;
        this.f11824c = (y[]) yVarArr.clone();
        this.f11825d = c7256l;
        this.f11826e = aVar;
        this.f11822a = c9734fArr.length;
    }

    public final boolean a(F f7, int i11) {
        return f7 != null && Objects.equals(this.f11823b[i11], f7.f11823b[i11]) && Objects.equals(this.f11824c[i11], f7.f11824c[i11]);
    }

    public final boolean b(int i11) {
        return this.f11823b[i11] != null;
    }
}
