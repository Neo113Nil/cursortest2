package c;

import android.content.Intent;
import android.content.IntentSender;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntentSender.SendIntentException f2486b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f2487c;

    public e(f fVar, int i3, IntentSender.SendIntentException sendIntentException) {
        this.f2487c = fVar;
        this.f2485a = i3;
        this.f2486b = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2487c.a(this.f2485a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f2486b));
    }
}
