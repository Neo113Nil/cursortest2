package c4;

import kotlin.jvm.internal.l;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.y;

/* renamed from: c4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0547h extends AbstractC0546g implements kotlin.jvm.internal.h {

    /* renamed from: k, reason: collision with root package name */
    public final int f7409k;

    public AbstractC0547h(a4.c cVar) {
        super(cVar);
        this.f7409k = 2;
    }

    @Override // kotlin.jvm.internal.h
    public final int getArity() {
        return this.f7409k;
    }

    @Override // c4.AbstractC0540a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        x.f17625a.getClass();
        String a5 = y.a(this);
        l.e("renderLambdaToString(...)", a5);
        return a5;
    }
}
