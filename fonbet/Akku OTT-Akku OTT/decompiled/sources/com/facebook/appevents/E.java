package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.internal.h;
import com.facebook.internal.C0705a;
import com.facebook.internal.C0715k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class E {
    public static final a Companion = new a();
    public final C0705a a;
    public final String b;
    public ArrayList c;
    public final ArrayList d;
    public int e;

    public static final class a {
    }

    public E(C0705a attributionIdentifiers, String anonymousAppDeviceGUID) {
        Intrinsics.checkNotNullParameter(attributionIdentifiers, "attributionIdentifiers");
        Intrinsics.checkNotNullParameter(anonymousAppDeviceGUID, "anonymousAppDeviceGUID");
        this.a = attributionIdentifiers;
        this.b = anonymousAppDeviceGUID;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public final synchronized void a(C0692d event) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            if (this.c.size() + this.d.size() >= 1000) {
                this.e++;
            } else {
                this.c.add(event);
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }

    public final synchronized List<C0692d> b() {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = this.c;
            this.c = new ArrayList();
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return null;
        }
    }

    public final int c(com.facebook.z request, Context applicationContext, boolean z, boolean z2) {
        Throwable th;
        Throwable th2;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            try {
                synchronized (this) {
                    try {
                        int i = this.e;
                        com.facebook.appevents.eventdeactivation.a.b(this.c);
                        this.d.addAll(this.c);
                        this.c.clear();
                        JSONArray jSONArray = new JSONArray();
                        JSONArray jSONArray2 = new JSONArray();
                        Iterator it = this.d.iterator();
                        while (it.hasNext()) {
                            try {
                                C0692d c0692d = (C0692d) it.next();
                                if (!z && c0692d.c) {
                                }
                                jSONArray.put(c0692d.a);
                                jSONArray2.put(c0692d.b);
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        }
                        if (jSONArray.length() != 0) {
                            Unit unit = Unit.INSTANCE;
                            d(request, applicationContext, i, jSONArray, jSONArray2, z2);
                            return jSONArray.length();
                        }
                        try {
                            return 0;
                        } catch (Throwable th4) {
                            th = th4;
                            com.facebook.internal.instrument.crashshield.a.a(th, this);
                            return 0;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                th = th;
                com.facebook.internal.instrument.crashshield.a.a(th, this);
                return 0;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public final void d(com.facebook.z zVar, Context context, int i, JSONArray jSONArray, JSONArray jSONArray2, boolean z) {
        JSONObject jSONObject;
        try {
            if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                return;
            }
            try {
                jSONObject = com.facebook.appevents.internal.h.a(h.a.b, this.a, this.b, z, context);
                if (this.e > 0) {
                    jSONObject.put("num_skipped_events", i);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            zVar.c = jSONObject;
            Bundle bundle = zVar.d;
            String jSONArray3 = jSONArray.toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray3, "events.toString()");
            bundle.putString("custom_events", jSONArray3);
            if (C0715k.b(C0715k.b.IapLoggingLib5To7)) {
                bundle.putString("operational_parameters", jSONArray2.toString());
            }
            zVar.e = jSONArray3;
            Intrinsics.checkNotNullParameter(bundle, "<set-?>");
            zVar.d = bundle;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }
}
