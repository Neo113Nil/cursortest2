package Og0;

import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
final class f extends AbstractC7737t implements Function1<Intent, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public static final f f20386b = new f(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Intent intent) {
        Intent intentOf = intent;
        Intrinsics.checkNotNullParameter(intentOf, "$this$intentOf");
        intentOf.setData(Uri.parse("mobilemanager://function/entry/AutoStart"));
        return Unit.f71690a;
    }
}
