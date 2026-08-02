package androidx.credentials.playservices;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.ResultReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class e extends AbstractC7737t implements Function1<PendingIntent, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ HiddenActivity f42454b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f42455c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(HiddenActivity hiddenActivity, int i11) {
        super(1);
        this.f42454b = hiddenActivity;
        this.f42455c = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PendingIntent pendingIntent) {
        ResultReceiver resultReceiver;
        PendingIntent pendingIntent2 = pendingIntent;
        HiddenActivity hiddenActivity = this.f42454b;
        try {
            hiddenActivity.f42445b = true;
            hiddenActivity.startIntentSenderForResult(pendingIntent2.getIntentSender(), this.f42455c, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e11) {
            resultReceiver = hiddenActivity.f42444a;
            Intrinsics.f(resultReceiver);
            hiddenActivity.h(resultReceiver, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e11.getMessage());
        }
        return Unit.f71690a;
    }
}
