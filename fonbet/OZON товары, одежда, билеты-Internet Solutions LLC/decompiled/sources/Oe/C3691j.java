package Oe;

import kotlin.jvm.internal.C7725g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Oe.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3691j extends S<Character, char[], Object> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final C3691j f20302c;

    static {
        Intrinsics.checkNotNullParameter(C7725g.f71805a, "<this>");
        f20302c = new C3691j(C3692k.f20305a);
    }

    @Override // Oe.AbstractC3682a
    public final int e(Object obj) {
        char[] cArr = (char[]) obj;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length;
    }

    @Override // Oe.S
    public final void f(Ne.b encoder, char[] cArr, int i11) {
        char[] content = cArr;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.p(b(), i12, content[i12]);
        }
    }
}
