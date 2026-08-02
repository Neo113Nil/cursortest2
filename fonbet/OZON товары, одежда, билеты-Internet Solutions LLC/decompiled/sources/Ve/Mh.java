package Ve;

import Sc.r;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import java.io.File;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Mh extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Mq f29476b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mh(Mq mq) {
        super(0);
        this.f29476b = mq;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object a11;
        Mq mq = this.f29476b;
        try {
            r.Companion companion = Sc.r.INSTANCE;
            Object systemService = mq.requireContext().getSystemService("clipboard");
            Intrinsics.g(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ClipboardManager clipboardManager = (ClipboardManager) systemService;
            Context context = mq.requireContext();
            Intrinsics.checkNotNullExpressionValue(context, "requireContext()");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter("SDK_logs", "directory");
            File[] externalFilesDirs = androidx.core.content.a.getExternalFilesDirs(context, null);
            Intrinsics.checkNotNullExpressionValue(externalFilesDirs, "getExternalFilesDirs(context, null)");
            File file = new File((File) C7705l.F(externalFilesDirs), "SDK_logs");
            if (!file.exists()) {
                file.mkdir();
            }
            File file2 = new File(file, "");
            if (file2.exists()) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText("Log", Mq.y(file2)));
            }
            a11 = Unit.f71690a;
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        boolean z11 = a11 instanceof r.b;
        return Unit.f71690a;
    }
}
