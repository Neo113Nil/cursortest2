package C7;

import android.app.Activity;
import android.content.IntentSender;

/* loaded from: classes9.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f4437a;

    j(Activity activity) {
        this.f4437a = activity;
    }

    public final void a(IntentSender intentSender) throws IntentSender.SendIntentException {
        this.f4437a.startIntentSenderForResult(intentSender, 1820, null, 0, 0, 0, null);
    }
}
