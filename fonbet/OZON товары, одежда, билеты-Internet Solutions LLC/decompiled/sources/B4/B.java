package B4;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class B extends AbstractC7737t implements Function1<String, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f2489b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B(Bundle bundle) {
        super(1);
        this.f2489b = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        String argName = str;
        Intrinsics.checkNotNullParameter(argName, "argName");
        return Boolean.valueOf(!this.f2489b.containsKey(argName));
    }
}
