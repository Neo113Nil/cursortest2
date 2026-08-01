package com.apm.insight;

import android.text.TextUtils;
import com.ironsource.C4658ta;
import org.json.JSONArray;

/* compiled from: CrashCallbackWrapper.java */
/* loaded from: classes5.dex */
public final class b implements ICrashCallback, IOOMCallback {

    /* renamed from: a, reason: collision with root package name */
    private IOOMCallback f3947a;
    private ICrashCallback b;
    private String c;

    @Override // com.apm.insight.ICrashCallback
    public final void onCrash(CrashType crashType, String str, Thread thread) {
    }

    @Override // com.apm.insight.IOOMCallback
    public final void onCrash(CrashType crashType, Throwable th, Thread thread, long j) {
    }

    public b(String str, ICrashCallback iCrashCallback) {
        this.c = str;
        this.b = iCrashCallback;
    }

    public b(String str, IOOMCallback iOOMCallback) {
        this.c = str;
        this.f3947a = iOOMCallback;
    }

    public final void a(CrashType crashType, Throwable th, Thread thread, long j, JSONArray jSONArray) {
        if (this.f3947a == null || jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i), "header", C4658ta.b), this.c)) {
                this.f3947a.onCrash(crashType, th, thread, j);
            }
        }
    }

    public final void a(CrashType crashType, String str, Thread thread, JSONArray jSONArray) {
        if (this.b == null || jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i), "header", C4658ta.b), this.c)) {
                this.b.onCrash(crashType, str, thread);
            }
        }
    }

    public final void a(CrashType crashType, String str, String str2, String str3) {
        d a2;
        if (this.b == null || (a2 = d.a(this.c)) == null || !a2.a(str3, str2)) {
            return;
        }
        this.b.onCrash(crashType, str, null);
    }
}
