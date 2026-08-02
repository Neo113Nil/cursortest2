package Ud;

import java.lang.reflect.Field;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7721c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;

/* loaded from: classes.dex */
final class o implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final u f27607a;

    public o(u uVar) {
        this.f27607a = uVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        t changeOptions = t.f27612a;
        u uVar = this.f27607a;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(changeOptions, "changeOptions");
        A B11 = uVar.B();
        B11.getClass();
        A a11 = new A();
        Iterator a12 = C7721c.a(A.class.getDeclaredFields());
        while (a12.hasNext()) {
            Field field = (Field) a12.next();
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(B11);
                id.c cVar = obj instanceof id.c ? (id.c) obj : null;
                if (cVar != null) {
                    String name = field.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    kotlin.text.h.e0(name, "is", false);
                    kotlin.reflect.d b11 = N.b(A.class);
                    String name2 = field.getName();
                    StringBuilder sb2 = new StringBuilder("get");
                    String name3 = field.getName();
                    Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String substring = name3.substring(1);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        name3 = upperCase + substring;
                    }
                    sb2.append(name3);
                    field.set(a11, new z(cVar.getValue(B11, new kotlin.jvm.internal.E(b11, name2, sb2.toString())), a11));
                }
            }
        }
        changeOptions.invoke(a11);
        a11.k0();
        return new u(a11);
    }
}
