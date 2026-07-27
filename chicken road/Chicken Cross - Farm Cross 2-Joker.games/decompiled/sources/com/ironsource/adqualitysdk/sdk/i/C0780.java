package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒥ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0780 {

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static C0780 f2276;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Context f2282;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f2278 = StringFog.decrypt("fIXVI9adrXFRjtUjyauSf16L0SfI\n", "MOq2Qrrf3x4=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final Object f2277 = new Object();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public boolean f2283 = true;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final HashMap f2281 = new HashMap();

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final HashMap f2280 = new HashMap();

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final ArrayList f2279 = new ArrayList();

    public C0780(Context context) {
        this.f2282 = context;
        new HandlerC0785(this, context.getMainLooper());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static C0780 m5666(Context context) {
        C0780 c0780;
        synchronized (f2277) {
            if (f2276 == null) {
                f2276 = new C0780(context.getApplicationContext());
            }
            c0780 = f2276;
        }
        return c0780;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m5667() {
        synchronized (this.f2281) {
            Iterator it = new HashMap(this.f2281).keySet().iterator();
            while (it.hasNext()) {
                m5670((BroadcastReceiver) it.next());
            }
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m5668() {
        this.f2283 = false;
        m5667();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m5669() {
        this.f2283 = true;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5670(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f2281) {
            ArrayList arrayList = (ArrayList) this.f2281.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                IntentFilter intentFilter = (IntentFilter) arrayList.get(i);
                for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                    String action = intentFilter.getAction(i2);
                    ArrayList arrayList2 = (ArrayList) this.f2280.get(action);
                    if (arrayList2 != null) {
                        if (arrayList2.size() <= 0) {
                            if (arrayList2.size() <= 0) {
                                this.f2280.remove(action);
                            }
                        } else {
                            if (arrayList2.get(0) != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    }
                }
            }
        }
    }
}
