package androidx.activity;

import F.AbstractC0210f;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import androidx.activity.result.IntentSenderRequest;
import f.AbstractC1062h;
import g.AbstractC1118a;

/* loaded from: classes.dex */
public final class h extends AbstractC1062h {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.A f8101h;

    public h(androidx.fragment.app.A a2) {
        this.f8101h = a2;
    }

    @Override // f.AbstractC1062h
    public final void b(int i7, AbstractC1118a abstractC1118a, Parcelable parcelable) {
        Bundle bundle;
        androidx.fragment.app.A a2 = this.f8101h;
        E1.b b7 = abstractC1118a.b(a2, parcelable);
        if (b7 != null) {
            new Handler(Looper.getMainLooper()).post(new g(this, i7, b7, 0));
            return;
        }
        Intent a4 = abstractC1118a.a(a2, parcelable);
        if (a4.getExtras() != null && a4.getExtras().getClassLoader() == null) {
            a4.setExtrasClassLoader(a2.getClassLoader());
        }
        if (a4.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = a4.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a4.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a4.getAction())) {
            String[] stringArrayExtra = a4.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            AbstractC0210f.a(a2, stringArrayExtra, i7);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a4.getAction())) {
            a2.startActivityForResult(a4, i7, bundle);
            return;
        }
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a4.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            a2.startIntentSenderForResult(intentSenderRequest.f8121a, i7, intentSenderRequest.f8122b, intentSenderRequest.f8123c, intentSenderRequest.f8124d, 0, bundle);
        } catch (IntentSender.SendIntentException e7) {
            new Handler(Looper.getMainLooper()).post(new g(this, i7, e7, 1));
        }
    }
}
