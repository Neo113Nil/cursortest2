package androidx.work.impl;

import g5.C6627B;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class H extends AbstractC7737t implements Function1<C6627B, String> {

    /* renamed from: b, reason: collision with root package name */
    public static final H f45317b = new H(1);

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(C6627B c6627b) {
        C6627B spec = c6627b;
        Intrinsics.checkNotNullParameter(spec, "spec");
        return spec.f() ? "Periodic" : "OneTime";
    }
}
