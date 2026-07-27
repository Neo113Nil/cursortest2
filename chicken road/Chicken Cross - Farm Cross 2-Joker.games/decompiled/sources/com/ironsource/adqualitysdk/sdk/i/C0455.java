package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˠ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0455 extends BroadcastReceiver {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f844 = StringFog.decrypt("BWmbGE701JI/bZsKc+PcpCJ6ih0=\n", "SwzvbyGGv8E=\n");

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Context f847;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public boolean f846 = false;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final HashSet f845 = new HashSet();

    public C0455(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f847 = applicationContext;
        AbstractC0544.m5503(f844, StringFog.decrypt("vZ/ts0R7/GGbirmlX3r6JY2b6rMNZ/4ii5Pvol87\n", "7vqZxy0Vm0E=\n"));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(StringFog.decrypt("mt5KJd4CDDKV1Vp50gQGctXzYRn/LitIsuZnA+g0K1S6/mkS\n", "+7AuV7FraBw=\n"));
        applicationContext.registerReceiver(this, intentFilter);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5446(C0455 c0455, boolean z) {
        synchronized (c0455) {
            c0455.f846 = z;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        AbstractC1145.m5895(new C0462(this, intent, context));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m5448() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f845);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC0919) it.next()).getClass();
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m5447(C0455 c0455, Context context) {
        c0455.getClass();
        NetworkInfo activeNetworkInfo = context != null ? ((ConnectivityManager) context.getSystemService(StringFog.decrypt("4ydKAJT+Emv2IVAX\n", "gEgkbvGdZgI=\n"))).getActiveNetworkInfo() : null;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        AbstractC0544.m5509(f844, StringFog.decrypt("z2MO+g6Y5C8=\n", "gQZ6jWHqjw8=\n") + activeNetworkInfo.getTypeName() + StringFog.decrypt("wfnAOak6fYuE/oE=\n", "4ZqvV8dfHv8=\n"));
        return true;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized boolean m5449() {
        return this.f846;
    }
}
