package androidx.credentials.playservices;

import android.content.IntentSender;
import android.os.ResultReceiver;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class c extends AbstractC7737t implements Function1<SavePasswordResult, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ HiddenActivity f42450b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f42451c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(HiddenActivity hiddenActivity, int i11) {
        super(1);
        this.f42450b = hiddenActivity;
        this.f42451c = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SavePasswordResult savePasswordResult) {
        ResultReceiver resultReceiver;
        SavePasswordResult savePasswordResult2 = savePasswordResult;
        HiddenActivity hiddenActivity = this.f42450b;
        try {
            hiddenActivity.f42445b = true;
            hiddenActivity.startIntentSenderForResult(savePasswordResult2.getPendingIntent().getIntentSender(), this.f42451c, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e11) {
            resultReceiver = hiddenActivity.f42444a;
            Intrinsics.f(resultReceiver);
            hiddenActivity.h(resultReceiver, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e11.getMessage());
        }
        return Unit.f71690a;
    }
}
