package B4;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class I extends AbstractC7737t implements Function1<String, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f2527b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I(Bundle bundle) {
        super(1);
        this.f2527b = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        String key = str;
        Intrinsics.checkNotNullParameter(key, "key");
        return Boolean.valueOf(!this.f2527b.containsKey(key));
    }
}
