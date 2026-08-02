package Og0;

import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
final class h extends AbstractC7737t implements Function1<Intent, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f20388b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(String str) {
        super(1);
        this.f20388b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Intent intent) {
        Intent intentOf = intent;
        Intrinsics.checkNotNullParameter(intentOf, "$this$intentOf");
        intentOf.setAction("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        intentOf.setData(Uri.parse("package:" + this.f20388b));
        return Unit.f71690a;
    }
}
