package androidx.credentials.playservices;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.ResultReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class d extends AbstractC7737t implements Function1<PendingIntent, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ HiddenActivity f42452b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f42453c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(HiddenActivity hiddenActivity, int i11) {
        super(1);
        this.f42452b = hiddenActivity;
        this.f42453c = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PendingIntent pendingIntent) {
        ResultReceiver resultReceiver;
        PendingIntent result = pendingIntent;
        HiddenActivity hiddenActivity = this.f42452b;
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            hiddenActivity.f42445b = true;
            hiddenActivity.startIntentSenderForResult(result.getIntentSender(), this.f42453c, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e11) {
            resultReceiver = hiddenActivity.f42444a;
            Intrinsics.f(resultReceiver);
            hiddenActivity.h(resultReceiver, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e11.getMessage());
        }
        return Unit.f71690a;
    }
}
