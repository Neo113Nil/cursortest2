package com.startapp.sdk.internal;

import android.content.Context;
import android.net.Uri;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.ImpressionsTrackingMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.common.utils.Pair;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class b9 implements h7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3491a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3492b;

    /* renamed from: c, reason: collision with root package name */
    public final TrackingParams f3493c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f3494d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f3495e;
    public AtomicReference f;

    /* renamed from: g, reason: collision with root package name */
    public String f3496g;

    public b9(Context context, List list, TrackingParams trackingParams, f5 f5Var) {
        this.f3491a = context;
        this.f3492b = list;
        this.f3493c = trackingParams;
        this.f3494d = Collections.synchronizedMap(new LinkedHashMap(list.size()));
        this.f3495e = new AtomicInteger(list.size());
    }

    @Override // com.startapp.sdk.internal.h7
    public final Object a(Object obj, Object obj2, Object obj3) {
        Pair pair;
        String str = (String) obj;
        Throwable th = (Throwable) obj3;
        if (((r8) obj2) != null) {
            pair = new Pair(4, String.valueOf(200));
        } else {
            if (th instanceof SDKException) {
                SDKException sDKException = (SDKException) th;
                if (sDKException.a() > 0) {
                    pair = new Pair(1, String.valueOf(sDKException.a()));
                } else {
                    th = th.getCause();
                }
            }
            pair = null;
        }
        if (pair == null) {
            pair = th != null ? new Pair(2, th.getClass().getName()) : new Pair(2, String.valueOf(-1));
        }
        this.f3494d.put(str, pair);
        a();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Context context, List list, TrackingParams trackingParams) {
        b9 b9Var = (b9) ((h7) com.startapp.sdk.components.a.a(context).f3348O.a()).a(context, list, trackingParams);
        if (b9Var != null) {
            si.a(4, b9Var.f3491a, "Sending impression");
            for (String str : b9Var.f3492b) {
                if (str != null && str.length() > 0) {
                    if (b9Var.f3496g == null) {
                        b9Var.f3496g = g0.a(str, (String) null);
                    }
                    Context context2 = b9Var.f3491a;
                    TrackingParams trackingParams2 = b9Var.f3493c;
                    if (si.e(str)) {
                        StringBuilder sb = new StringBuilder(str);
                        String a3 = g0.a(str, (String) null);
                        if (a3 != null) {
                            sb.append(AbstractC0253g.a(AbstractC0253g.c(a3)));
                        }
                        if (trackingParams2 != null) {
                            sb.append(trackingParams2.e());
                        }
                        str = sb.toString();
                    }
                    Pair pair = new Pair(str, Boolean.valueOf(gi.a(context2, str, b9Var)));
                    String str2 = (String) pair.first;
                    boolean equals = Boolean.TRUE.equals(pair.second);
                    b9Var.f3494d.put(str2, null);
                    if (!equals) {
                        b9Var.a();
                    }
                } else {
                    b9Var.f3494d.put(str, null);
                    b9Var.a();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        String name;
        if (this.f3495e.decrementAndGet() == 0) {
            AtomicReference atomicReference = this.f;
            if (atomicReference == null) {
                ImpressionsTrackingMetadata C2 = MetaData.E().C();
                if (C2 == null || C2.a() <= ((Random) si.f4346d.a()).nextDouble()) {
                    C2 = null;
                }
                AtomicReference atomicReference2 = new AtomicReference(C2);
                this.f = atomicReference2;
                atomicReference = atomicReference2;
            }
            ImpressionsTrackingMetadata impressionsTrackingMetadata = (ImpressionsTrackingMetadata) atomicReference.get();
            if (impressionsTrackingMetadata != null) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                String str = "";
                boolean z3 = false;
                for (Map.Entry entry : this.f3494d.entrySet()) {
                    Integer num = entry.getValue() != null ? (Integer) ((Pair) entry.getValue()).first : 2;
                    if (num != null && (impressionsTrackingMetadata.b() & num.intValue()) == num.intValue()) {
                        String valueOf = entry.getValue() != null ? (String) ((Pair) entry.getValue()).second : String.valueOf(-2);
                        String str2 = (String) entry.getKey();
                        sb.append(str);
                        sb.append(valueOf);
                        sb2.append(str);
                        if (str2 != null) {
                            try {
                                Uri parse = Uri.parse(str2);
                                name = parse.getAuthority() + parse.getPath();
                            } catch (Throwable th) {
                                name = th.getClass().getName();
                            }
                        } else {
                            name = String.valueOf((char[]) null);
                        }
                        sb2.append(name);
                        str = StringUtils.COMMA;
                        z3 = true;
                    }
                }
                if (z3) {
                    d9 d9Var = new d9(e9.f3623k);
                    d9Var.f3575e = ((Object) sb) + ";" + ((Object) sb2);
                    d9Var.f3576g = this.f3496g;
                    StringBuilder sb3 = new StringBuilder("adTag: ");
                    TrackingParams trackingParams = this.f3493c;
                    sb3.append(trackingParams != null ? trackingParams.a() : null);
                    d9Var.f3574d = sb3.toString();
                    d9Var.a();
                }
            }
        }
    }
}
