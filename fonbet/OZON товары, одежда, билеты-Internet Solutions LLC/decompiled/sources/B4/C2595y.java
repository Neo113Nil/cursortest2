package B4;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: B4.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2595y extends AbstractC7737t implements Function1<String, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f2721b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2595y(String str) {
        super(1);
        this.f2721b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        return Boolean.valueOf(Intrinsics.d(str, this.f2721b));
    }
}
