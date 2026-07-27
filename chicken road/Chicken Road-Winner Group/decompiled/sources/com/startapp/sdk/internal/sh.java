package com.startapp.sdk.internal;

import android.os.Parcelable;
import android.telephony.TelephonyManager;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class sh {

    /* renamed from: a, reason: collision with root package name */
    public final TelephonyManager f4340a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f4341b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vh f4342c;

    public sh(vh vhVar, TelephonyManager telephonyManager, Class cls) {
        this.f4342c = vhVar;
        this.f4340a = telephonyManager;
        this.f4341b = cls;
    }

    public abstract void a();

    public final void a(Class cls, Parcelable parcelable) {
        vh vhVar = this.f4342c;
        vhVar.getClass();
        try {
            TelephonyMetadata a3 = vhVar.a();
            if (a3 != null && parcelable != null) {
                long currentTimeMillis = System.currentTimeMillis();
                String simpleName = cls.getSimpleName();
                if (a3.a(simpleName).c()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("timestamp", currentTimeMillis);
                    jSONObject.put("type", simpleName);
                    jSONObject.put("data", parcelable.toString());
                    String b3 = si.b(jSONObject.toString());
                    rf edit = ((sf) vhVar.f4528c.a()).edit();
                    edit.a(simpleName, b3);
                    edit.f4299a.putString(simpleName, b3);
                    edit.apply();
                }
            }
        } catch (Throwable th) {
            if (vhVar.a(2)) {
                d9.a(th);
            }
        }
        if (cls.equals(this.f4341b)) {
            try {
                b();
            } catch (Throwable th2) {
                if (this.f4342c.a(16)) {
                    d9.a(th2);
                }
            }
        }
    }

    public abstract void b();
}
