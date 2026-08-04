package androidx.activity;

import F.AbstractC0210f;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import androidx.activity.result.IntentSenderRequest;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p037f.h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.A f8101h;

    public h(androidx.fragment.app.A a2) {
        this.f8101h = a2;
    }

    @Override // p037f.h
    public final void b(int i7, p045g.a aVar, Parcelable parcelable) {
        Bundle bundle;
        androidx.fragment.app.A a2 = this.f8101h;
        E1.b bVarB = aVar.b(a2, parcelable);
        if (bVarB != null) {
            new Handler(Looper.getMainLooper()).post(new g(this, i7, bVarB, 0));
            return;
        }
        Intent intentA = aVar.a(a2, parcelable);
        if (intentA.getExtras() != null && intentA.getExtras().getClassLoader() == null) {
            intentA.setExtrasClassLoader(a2.getClassLoader());
        }
        if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
            String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            AbstractC0210f.a(a2, stringArrayExtra, i7);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
            a2.startActivityForResult(intentA, i7, bundle);
            return;
        }
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            a2.startIntentSenderForResult(intentSenderRequest.f8121a, i7, intentSenderRequest.f8122b, intentSenderRequest.f8123c, intentSenderRequest.f8124d, 0, bundle);
        } catch (IntentSender.SendIntentException e7) {
            new Handler(Looper.getMainLooper()).post(new g(this, i7, e7, 1));
        }
    }
}
