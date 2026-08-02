package Kd;

import Kd.AbstractC3507d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Kd.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C3504a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3507d f15876a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3507d.a f15877b;

    public C3504a(AbstractC3507d abstractC3507d, AbstractC3507d.a aVar) {
        this.f15876a = abstractC3507d;
        this.f15877b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object extractNullability) {
        Intrinsics.checkNotNullParameter(extractNullability, "$this$extractNullability");
        return Boolean.valueOf(this.f15876a.c(extractNullability, this.f15877b.b()));
    }
}
