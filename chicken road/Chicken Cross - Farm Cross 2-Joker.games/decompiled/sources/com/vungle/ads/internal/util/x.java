package com.vungle.ads.internal.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class x extends ObjectInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final List f12192a;

    public x(InputStream inputStream, List list) {
        super(inputStream);
        this.f12192a = list;
    }

    @Override // java.io.ObjectInputStream
    public final Class resolveClass(ObjectStreamClass desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Class<?> c = super.resolveClass(desc);
        if (this.f12192a != null && !Number.class.isAssignableFrom(c) && !Intrinsics.areEqual(String.class, c) && !Intrinsics.areEqual(Boolean.class, c) && !c.isArray() && !this.f12192a.contains(c)) {
            throw new IOException(com.iab.omid.library.vungle.internal.l.a("Deserialization is not allowed for ").append(desc.getName()).toString());
        }
        Intrinsics.checkNotNullExpressionValue(c, "c");
        return c;
    }
}
