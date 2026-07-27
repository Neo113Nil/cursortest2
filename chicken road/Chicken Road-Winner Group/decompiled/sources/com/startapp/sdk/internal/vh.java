package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Build;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyDataConfig;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public final class vh {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4526a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f4527b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f4528c;

    /* renamed from: d, reason: collision with root package name */
    public final ib f4529d;

    /* renamed from: e, reason: collision with root package name */
    public final a6 f4530e;
    public sh f;

    /* renamed from: g, reason: collision with root package name */
    public final double f4531g = ((Random) si.f4346d.a()).nextDouble();

    /* renamed from: h, reason: collision with root package name */
    public volatile String f4532h = "e106";

    public vh(Context context, ib ibVar, ib ibVar2, ib ibVar3, a6 a6Var) {
        this.f4526a = context;
        this.f4527b = ibVar;
        this.f4528c = ibVar2;
        this.f4529d = ibVar3;
        this.f4530e = a6Var;
    }

    public final sh a(Class cls) {
        TelephonyManager telephonyManager = (TelephonyManager) this.f4526a.getSystemService("phone");
        if (telephonyManager != null) {
            return Build.VERSION.SDK_INT < 31 ? new uh(this, telephonyManager, cls) : new rh(this, telephonyManager, cls);
        }
        return null;
    }

    public final void b() {
        sh a3;
        try {
            if (a() == null || (a3 = a(SignalStrength.class)) == null) {
                return;
            }
            a3.a();
        } catch (Throwable th) {
            if (a(8)) {
                d9.a(th);
            }
        }
    }

    public final TelephonyMetadata a() {
        g6 g6Var = (g6) this.f4529d.a();
        Boolean valueOf = (g6Var.b() && ((sf) g6Var.f3751b.a()).contains("consentApc")) ? Boolean.valueOf(((sf) g6Var.f3751b.a()).getBoolean("consentApc", false)) : null;
        if (valueOf != null && valueOf.booleanValue()) {
            this.f4530e.getClass();
            TelephonyMetadata a02 = MetaData.E().a0();
            if (a02 != null && a02.c()) {
                return a02;
            }
        }
        return null;
    }

    public final boolean a(int i3) {
        TelephonyMetadata a3 = a();
        return a3 != null && this.f4531g < a3.b() && (a3.a() & i3) == i3;
    }

    public final void a(SignalStrength signalStrength) {
        if (signalStrength == null) {
            return;
        }
        try {
            this.f4532h = String.valueOf(signalStrength.getLevel());
        } catch (NoSuchMethodException unused) {
            this.f4532h = "e104";
        } catch (Throwable unused2) {
            this.f4532h = "e105";
        }
    }

    public final Map a(e9 e9Var) {
        List a3;
        TelephonyMetadata a4 = a();
        if (a4 == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = null;
        for (Map.Entry entry : ((sf) this.f4528c.a()).getAll().entrySet()) {
            Object value = entry.getValue();
            if (value instanceof String) {
                String str = (String) entry.getKey();
                TelephonyDataConfig a5 = a4.a(str);
                if (a5.c() && (a3 = a5.a()) != null && a3.contains(e9Var.f3629a)) {
                    String b3 = a5.b();
                    if (b3 != null) {
                        str = b3;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(str, (String) value);
                }
            }
        }
        return hashMap == null ? Collections.EMPTY_MAP : hashMap;
    }
}
