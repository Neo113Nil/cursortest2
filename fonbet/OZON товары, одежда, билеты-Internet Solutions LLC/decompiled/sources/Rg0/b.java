package Rg0;

import android.content.Intent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
final class b extends AbstractC7737t implements Function1<Intent, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f25079b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar) {
        super(1);
        this.f25079b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Intent intent) {
        Intent intent2 = intent;
        Intrinsics.checkNotNullParameter(intent2, "intent");
        return Boolean.valueOf(c.a(this.f25079b).a(intent2));
    }
}
