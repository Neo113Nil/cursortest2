package Uc0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<String, Unit> f27528a;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull Function1<? super String, Unit> onSmsReceived) {
        Intrinsics.checkNotNullParameter(onSmsReceived, "onSmsReceived");
        this.f27528a = onSmsReceived;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        Status status;
        if (intent == null || !SmsRetriever.SMS_RETRIEVED_ACTION.equals(intent.getAction()) || (extras = intent.getExtras()) == null || (status = (Status) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS")) == null || status.getStatusCode() != 0) {
            return;
        }
        String string = extras.getString(SmsRetriever.EXTRA_SMS_MESSAGE);
        if (string == null) {
            string = "";
        }
        this.f27528a.invoke(string);
    }
}
