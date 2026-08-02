package bj0;

import I1.A;
import I1.D;
import I1.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: bj0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5679a extends AbstractC7737t implements Function1<D, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f56084b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f56085c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5679a(String str, String str2) {
        super(1);
        this.f56084b = str;
        this.f56085c = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(D d11) {
        D semantics = d11;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        z.t(semantics, this.f56084b + this.f56085c);
        A.a(semantics, true);
        return Unit.f71690a;
    }
}
