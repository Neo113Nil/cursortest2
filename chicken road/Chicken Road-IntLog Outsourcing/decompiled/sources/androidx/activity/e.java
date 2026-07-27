package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import e.AbstractC0407h;
import e.C0408i;
import f.AbstractC0413a;
import u.AbstractC1463d;

/* loaded from: classes.dex */
public final class e extends AbstractC0407h {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f4049h;

    public e(l lVar) {
        this.f4049h = lVar;
    }

    @Override // e.AbstractC0407h
    public final void b(int i2, AbstractC0413a abstractC0413a, C0408i c0408i) {
        Bundle bundle;
        l lVar = this.f4049h;
        abstractC0413a.getClass();
        Intent a6 = abstractC0413a.a(lVar, c0408i);
        if (a6.getExtras() != null && a6.getExtras().getClassLoader() == null) {
            a6.setExtrasClassLoader(lVar.getClassLoader());
        }
        if (a6.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = a6.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a6.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a6.getAction())) {
            String[] stringArrayExtra = a6.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            AbstractC1463d.b(lVar, stringArrayExtra, i2);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a6.getAction())) {
            lVar.startActivityForResult(a6, i2, bundle);
            return;
        }
        C0408i c0408i2 = (C0408i) a6.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            lVar.startIntentSenderForResult(c0408i2.f5514a, i2, c0408i2.f5515b, c0408i2.f5516c, c0408i2.f5517d, 0, bundle);
        } catch (IntentSender.SendIntentException e3) {
            new Handler(Looper.getMainLooper()).post(new A0.d(i2, 1, this, e3));
        }
    }
}
