package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import v5.C10234h;

/* renamed from: Ve.ek, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4218ek extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C10234h.b f30939b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4218ek(C10234h.b bVar) {
        super(1);
        this.f30939b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C10234h.a loadImage = (C10234h.a) obj;
        Intrinsics.checkNotNullParameter(loadImage, "$this$loadImage");
        loadImage.d(this.f30939b);
        return Unit.f71690a;
    }
}
