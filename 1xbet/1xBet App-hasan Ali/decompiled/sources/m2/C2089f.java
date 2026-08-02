package m2;

import android.content.Intent;
import android.content.IntentFilter;
import f2.m;

/* renamed from: m2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2089f extends AbstractC2086c {
    public static final String i = m.f("StorageNotLowTracker");

    @Override // m2.AbstractC2087d
    public final Object a() {
        Intent registerReceiver = this.f17985b.registerReceiver(null, f());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // m2.AbstractC2086c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // m2.AbstractC2086c
    public final void g(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        m.d().a(i, L1.a.m("Received ", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            c(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            c(Boolean.TRUE);
        }
    }
}
