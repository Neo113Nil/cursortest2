package H3;

import O4.A;
import O4.C0263i;
import O4.C0264j;
import O4.InterfaceC0261g;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;

/* loaded from: classes.dex */
public final class f implements q, InterfaceC0261g {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2318k;

    /* renamed from: l, reason: collision with root package name */
    public final Type f2319l;

    public /* synthetic */ f(int i, Type type) {
        this.f2318k = i;
        this.f2319l = type;
    }

    @Override // O4.InterfaceC0261g
    public Type j() {
        switch (this.f2318k) {
        }
        return this.f2319l;
    }

    @Override // H3.q
    public Object k() {
        Type type = this.f2319l;
        if (!(type instanceof ParameterizedType)) {
            throw new F3.p("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new F3.p("Invalid EnumMap type: " + type.toString());
    }

    @Override // O4.InterfaceC0261g
    public Object o(A a5) {
        switch (this.f2318k) {
            case 1:
                C0264j c0264j = new C0264j(a5);
                a5.d(new C0263i(c0264j, 0));
                return c0264j;
            default:
                C0264j c0264j2 = new C0264j(a5);
                a5.d(new C0263i(c0264j2, 1));
                return c0264j2;
        }
    }
}
