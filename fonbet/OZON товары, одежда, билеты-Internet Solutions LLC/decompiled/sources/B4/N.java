package B4;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class N extends AbstractC7737t implements Function1<String, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<Bundle> f2546b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N(kotlin.jvm.internal.M<Bundle> m11) {
        super(1);
        this.f2546b = m11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        String key = str;
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundle = this.f2546b.f71787a;
        boolean z11 = true;
        if (bundle != null && bundle.containsKey(key)) {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
