package B4;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: B4.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2589s extends AbstractC7737t implements Function1<H, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2584m f2708b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2589s(C2584m c2584m) {
        super(1);
        this.f2708b = c2584m;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(H h11) {
        LinkedHashMap linkedHashMap;
        H destination = h11;
        Intrinsics.checkNotNullParameter(destination, "destination");
        linkedHashMap = this.f2708b.f2676n;
        return Boolean.valueOf(!linkedHashMap.containsKey(Integer.valueOf(destination.m())));
    }
}
