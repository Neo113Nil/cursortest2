package I3;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: I3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0171a implements F3.z {
    @Override // F3.z
    public final F3.y a(F3.m mVar, M3.a aVar) {
        Type type = aVar.f3617b;
        boolean z3 = type instanceof GenericArrayType;
        if (!z3 && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z3 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        return new C0172b(mVar, mVar.b(new M3.a(genericComponentType)), H3.d.h(genericComponentType));
    }
}
