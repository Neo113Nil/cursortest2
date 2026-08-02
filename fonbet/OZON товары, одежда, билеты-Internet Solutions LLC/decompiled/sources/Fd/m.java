package Fd;

import Gd.f0;
import Jd.x;
import Jd.y;
import ie.C7056e;
import ie.InterfaceC7060i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9846l;
import td.i0;

/* loaded from: classes.dex */
public final class m implements o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final k f9402a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC9846l f9403b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9404c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f9405d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC7060i<x, f0> f9406e;

    public m(@NotNull k c11, @NotNull InterfaceC9846l containingDeclaration, @NotNull y typeParameterOwner, int i11) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
        this.f9402a = c11;
        this.f9403b = containingDeclaration;
        this.f9404c = i11;
        ArrayList typeParameters = typeParameterOwner.getTypeParameters();
        Intrinsics.checkNotNullParameter(typeParameters, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i12));
            i12++;
        }
        this.f9405d = linkedHashMap;
        this.f9406e = ((C7056e) this.f9402a.e()).j(new l(this));
    }

    static f0 b(m typeParameterResolver, x typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Integer num = (Integer) typeParameterResolver.f9405d.get(typeParameter);
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        k kVar = typeParameterResolver.f9402a;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        k kVar2 = new k(kVar.a(), typeParameterResolver, kVar.c());
        InterfaceC9846l interfaceC9846l = typeParameterResolver.f9403b;
        return new f0(c.c(kVar2, interfaceC9846l.getAnnotations()), typeParameter, typeParameterResolver.f9404c + intValue, interfaceC9846l);
    }

    @Override // Fd.o
    public final i0 a(@NotNull x javaTypeParameter) {
        Intrinsics.checkNotNullParameter(javaTypeParameter, "javaTypeParameter");
        f0 invoke = this.f9406e.invoke(javaTypeParameter);
        return invoke != null ? invoke : this.f9402a.f().a(javaTypeParameter);
    }
}
