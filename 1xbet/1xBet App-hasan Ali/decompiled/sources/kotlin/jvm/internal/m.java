package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class m implements h, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final int f17617k;

    public m(int i) {
        this.f17617k = i;
    }

    @Override // kotlin.jvm.internal.h
    public final int getArity() {
        return this.f17617k;
    }

    public final String toString() {
        x.f17625a.getClass();
        String a5 = y.a(this);
        l.e("renderLambdaToString(...)", a5);
        return a5;
    }
}
