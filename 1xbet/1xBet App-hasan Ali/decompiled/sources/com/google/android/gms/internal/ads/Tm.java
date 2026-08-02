package com.google.android.gms.internal.ads;

import A0.AbstractC0015c;
import android.content.Context;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class Tm extends AbstractC0015c {

    /* renamed from: h, reason: collision with root package name */
    public static final SparseArray f11674h;

    /* renamed from: c, reason: collision with root package name */
    public final Context f11675c;

    /* renamed from: d, reason: collision with root package name */
    public final C0580Dh f11676d;

    /* renamed from: e, reason: collision with root package name */
    public final TelephonyManager f11677e;
    public final Qm f;

    /* renamed from: g, reason: collision with root package name */
    public int f11678g;

    static {
        SparseArray sparseArray = new SparseArray();
        f11674h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), H6.f9327n);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        H6 h6 = H6.f9326m;
        sparseArray.put(ordinal, h6);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), h6);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), h6);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), H6.f9328o);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        H6 h62 = H6.f9329p;
        sparseArray.put(ordinal2, h62);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), h62);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), h62);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), h62);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), h62);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), H6.f9330q);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), h6);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), h6);
    }

    public Tm(Context context, C0580Dh c0580Dh, Qm qm, C1390oj c1390oj, T2.I i) {
        super(c1390oj, i);
        this.f11675c = context;
        this.f11676d = c0580Dh;
        this.f = qm;
        this.f11677e = (TelephonyManager) context.getSystemService("phone");
    }
}
