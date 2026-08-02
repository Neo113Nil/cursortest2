package Xc;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class d<E extends Enum<E>> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<E> f34278a;

    public d(@NotNull E[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Class<E> cls = (Class<E>) entries.getClass().getComponentType();
        Intrinsics.f(cls);
        this.f34278a = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.f34278a.getEnumConstants();
        Intrinsics.checkNotNullExpressionValue(enumConstants, "getEnumConstants(...)");
        return b.a(enumConstants);
    }
}
