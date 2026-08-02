package F30;

import U50.f;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f8762a;

    public a(@NotNull f activityToShowConsentDialogListener) {
        Intrinsics.checkNotNullParameter(activityToShowConsentDialogListener, "activityToShowConsentDialogListener");
        this.f8762a = activityToShowConsentDialogListener;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        L80.a.a("SmsVerificationBroadcastReceiver", "onReceive");
        this.f8762a.invoke(intent);
    }
}
