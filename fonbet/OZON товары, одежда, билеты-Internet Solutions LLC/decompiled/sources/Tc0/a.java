package Tc0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<String, Unit> f27041a;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull Function1<? super String, Unit> onFlashCall) {
        Intrinsics.checkNotNullParameter(onFlashCall, "onFlashCall");
        this.f27041a = onFlashCall;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NotNull Context context, @NotNull Intent intent) {
        String stringExtra;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        String stringExtra2 = intent.getStringExtra("state");
        if (stringExtra2 == null || !stringExtra2.equals(TelephonyManager.EXTRA_STATE_RINGING) || (stringExtra = intent.getStringExtra("incoming_number")) == null || stringExtra.length() == 0) {
            return;
        }
        this.f27041a.invoke(stringExtra);
    }
}
