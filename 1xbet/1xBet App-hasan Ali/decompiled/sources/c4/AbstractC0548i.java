package c4;

import kotlin.jvm.internal.l;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.y;

/* renamed from: c4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0548i extends AbstractC0542c implements kotlin.jvm.internal.h {
    private final int arity;

    public AbstractC0548i(int i, a4.c cVar) {
        super(cVar);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    @Override // c4.AbstractC0540a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        x.f17625a.getClass();
        String a5 = y.a(this);
        l.e("renderLambdaToString(...)", a5);
        return a5;
    }
}
