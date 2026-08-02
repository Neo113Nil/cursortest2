package R20;

import android.content.Context;
import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import r20.C9164a;

/* loaded from: classes3.dex */
final class a extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f24501b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(Context context) {
        super(0);
        this.f24501b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C9164a c9164a = C9164a.f82858a;
        Context context = this.f24501b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        context.startActivity(Intent.makeRestartActivityTask(launchIntentForPackage != null ? launchIntentForPackage.getComponent() : null));
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
