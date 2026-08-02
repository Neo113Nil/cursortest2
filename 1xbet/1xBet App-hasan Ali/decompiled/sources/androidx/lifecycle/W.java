package androidx.lifecycle;

import com.google.android.gms.internal.ads.C1071hd;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: b, reason: collision with root package name */
    public static final Q1.j f7041b = new Q1.j(24);

    /* renamed from: a, reason: collision with root package name */
    public final Object f7042a;

    public /* synthetic */ W(X x5, U u5, int i) {
        this(x5, u5, D1.a.f923b);
    }

    public S a(kotlin.jvm.internal.e eVar) {
        String str;
        Class cls = eVar.f17615k;
        kotlin.jvm.internal.l.f("jClass", cls);
        String str2 = null;
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            boolean isArray = cls.isArray();
            HashMap hashMap = kotlin.jvm.internal.e.f17613m;
            if (isArray) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) hashMap.get(componentType.getName())) != null) {
                    str2 = str.concat("Array");
                }
                if (str2 == null) {
                    str2 = "kotlin.Array";
                }
            } else {
                str2 = (String) hashMap.get(cls.getName());
                if (str2 == null) {
                    str2 = cls.getCanonicalName();
                }
            }
        }
        if (str2 != null) {
            return ((C1071hd) this.f7042a).h(eVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public W(X x5, U u5, D1.b bVar) {
        kotlin.jvm.internal.l.f("store", x5);
        kotlin.jvm.internal.l.f("defaultCreationExtras", bVar);
        this.f7042a = new C1071hd(x5, u5, bVar);
    }

    public W(F f) {
        this.f7042a = f;
    }
}
