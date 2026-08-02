package androidx.compose.foundation;

import E.w0;
import P.e1;
import b0.m;
import b0.p;
import v.T;
import v.V;
import v.Y;
import y.C2654j;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e1 f6832a = new e1(V.f20183m);

    public static final p a(C2654j c2654j, T t5) {
        m mVar = m.f7161k;
        return t5 == null ? mVar : t5 instanceof Y ? new IndicationModifierElement(c2654j, (Y) t5) : b0.a.a(mVar, new w0(2, t5, c2654j));
    }
}
