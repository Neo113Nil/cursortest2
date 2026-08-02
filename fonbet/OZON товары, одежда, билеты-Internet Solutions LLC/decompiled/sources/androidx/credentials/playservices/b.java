package androidx.credentials.playservices;

import android.content.IntentSender;
import android.os.ResultReceiver;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class b extends AbstractC7737t implements Function1<BeginSignInResult, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ HiddenActivity f42448b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f42449c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(HiddenActivity hiddenActivity, int i11) {
        super(1);
        this.f42448b = hiddenActivity;
        this.f42449c = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(BeginSignInResult beginSignInResult) {
        ResultReceiver resultReceiver;
        BeginSignInResult beginSignInResult2 = beginSignInResult;
        HiddenActivity hiddenActivity = this.f42448b;
        try {
            hiddenActivity.f42445b = true;
            hiddenActivity.startIntentSenderForResult(beginSignInResult2.getPendingIntent().getIntentSender(), this.f42449c, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e11) {
            resultReceiver = hiddenActivity.f42444a;
            Intrinsics.f(resultReceiver);
            hiddenActivity.h(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e11.getMessage());
        }
        return Unit.f71690a;
    }
}
