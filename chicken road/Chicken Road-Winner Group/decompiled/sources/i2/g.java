package i2;

import g2.InterfaceC0319c;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public abstract class g extends AbstractC0343b implements kotlin.jvm.internal.g {

    /* renamed from: d, reason: collision with root package name */
    public final int f5036d;

    public g(int i3, InterfaceC0319c interfaceC0319c) {
        super(interfaceC0319c);
        this.f5036d = i3;
    }

    @Override // kotlin.jvm.internal.g
    public final int getArity() {
        return this.f5036d;
    }

    @Override // i2.AbstractC0343b
    public final String toString() {
        if (this.f5028a != null) {
            return super.toString();
        }
        r.f9673a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        j.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
