package I3;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* renamed from: I3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0174d implements F3.z {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2644k;

    /* renamed from: l, reason: collision with root package name */
    public final j3.i f2645l;

    public /* synthetic */ C0174d(j3.i iVar, int i) {
        this.f2644k = i;
        this.f2645l = iVar;
    }

    @Override // F3.z
    public final F3.y a(F3.m mVar, M3.a aVar) {
        Class cls;
        Type[] actualTypeArguments;
        j3.i iVar = this.f2645l;
        cls = Object.class;
        switch (this.f2644k) {
            case 0:
                Class cls2 = aVar.f3616a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                Type type = aVar.f3617b;
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                H3.d.b(Collection.class.isAssignableFrom(cls2));
                Type j5 = H3.d.j(type, cls2, H3.d.g(type, cls2, Collection.class), new HashMap());
                cls = j5 instanceof ParameterizedType ? ((ParameterizedType) j5).getActualTypeArguments()[0] : Object.class;
                return new C0173c(mVar, cls, mVar.b(new M3.a(cls)), iVar.r(aVar));
            default:
                Class cls3 = aVar.f3616a;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                Type type2 = aVar.f3617b;
                if (type2 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    H3.d.b(Map.class.isAssignableFrom(cls3));
                    Type j6 = H3.d.j(type2, cls3, H3.d.g(type2, cls3, Map.class), new HashMap());
                    actualTypeArguments = j6 instanceof ParameterizedType ? ((ParameterizedType) j6).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                return new C0180j(this, mVar, actualTypeArguments[0], (type3 == Boolean.TYPE || type3 == Boolean.class) ? c0.f2622c : mVar.b(new M3.a(type3)), actualTypeArguments[1], mVar.b(new M3.a(actualTypeArguments[1])), iVar.r(aVar));
        }
    }
}
