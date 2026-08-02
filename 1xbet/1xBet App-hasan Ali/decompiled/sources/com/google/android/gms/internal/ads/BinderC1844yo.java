package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.yo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1844yo extends E5 implements InterfaceC1516rb {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f16476o = 0;

    /* renamed from: k, reason: collision with root package name */
    public final C0634Ld f16477k;

    /* renamed from: l, reason: collision with root package name */
    public final JSONObject f16478l;

    /* renamed from: m, reason: collision with root package name */
    public final long f16479m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f16480n;

    public BinderC1844yo(String str, InterfaceC1427pb interfaceC1427pb, C0634Ld c0634Ld, long j5) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
        JSONObject jSONObject = new JSONObject();
        this.f16478l = jSONObject;
        this.f16480n = false;
        this.f16477k = c0634Ld;
        this.f16479m = j5;
        try {
            jSONObject.put("adapter_version", interfaceC1427pb.c().toString());
            jSONObject.put("sdk_version", interfaceC1427pb.f().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public final synchronized void j() {
        if (this.f16480n) {
            return;
        }
        try {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8936z1)).booleanValue()) {
                this.f16478l.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f16477k.b(this.f16478l);
        this.f16480n = true;
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String readString = parcel.readString();
            F5.b(parcel);
            u3(readString);
        } else if (i == 2) {
            String readString2 = parcel.readString();
            F5.b(parcel);
            v3(readString2);
        } else {
            if (i != 3) {
                return false;
            }
            C0387u0 c0387u0 = (C0387u0) F5.a(parcel, C0387u0.CREATOR);
            F5.b(parcel);
            synchronized (this) {
                w3(c0387u0.f5059l, 2);
            }
        }
        parcel2.writeNoException();
        return true;
    }

    public final synchronized void u3(String str) {
        if (this.f16480n) {
            return;
        }
        if (str == null) {
            v3("Adapter returned null signals");
            return;
        }
        try {
            this.f16478l.put("signals", str);
            A7 a7 = F7.f8657A1;
            Q2.r rVar = Q2.r.f5053d;
            if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                JSONObject jSONObject = this.f16478l;
                P2.o.f4767B.f4776j.getClass();
                jSONObject.put("latency", SystemClock.elapsedRealtime() - this.f16479m);
            }
            if (((Boolean) rVar.f5056c.a(F7.f8936z1)).booleanValue()) {
                this.f16478l.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f16477k.b(this.f16478l);
        this.f16480n = true;
    }

    public final synchronized void v3(String str) {
        w3(str, 2);
    }

    public final synchronized void w3(String str, int i) {
        try {
            if (this.f16480n) {
                return;
            }
            try {
                this.f16478l.put("signal_error", str);
                A7 a7 = F7.f8657A1;
                Q2.r rVar = Q2.r.f5053d;
                if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                    JSONObject jSONObject = this.f16478l;
                    P2.o.f4767B.f4776j.getClass();
                    jSONObject.put("latency", SystemClock.elapsedRealtime() - this.f16479m);
                }
                if (((Boolean) rVar.f5056c.a(F7.f8936z1)).booleanValue()) {
                    this.f16478l.put("signal_error_code", i);
                }
            } catch (JSONException unused) {
            }
            this.f16477k.b(this.f16478l);
            this.f16480n = true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
