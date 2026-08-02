package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.zd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1878zd {

    /* renamed from: a, reason: collision with root package name */
    public final C2308a f16610a;

    /* renamed from: b, reason: collision with root package name */
    public final C0584Ed f16611b;

    /* renamed from: e, reason: collision with root package name */
    public final String f16614e;
    public final String f;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16613d = new Object();

    /* renamed from: g, reason: collision with root package name */
    public long f16615g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f16616h = -1;
    public long i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f16617j = -1;

    /* renamed from: k, reason: collision with root package name */
    public long f16618k = -1;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedList f16612c = new LinkedList();

    public C1878zd(C2308a c2308a, C0584Ed c0584Ed, String str, String str2) {
        this.f16610a = c2308a;
        this.f16611b = c0584Ed;
        this.f16614e = str;
        this.f = str2;
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.f16613d) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.f16614e);
                bundle.putString("slotid", this.f);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.f16617j);
                bundle.putLong("tresponse", this.f16618k);
                bundle.putLong("timp", this.f16615g);
                bundle.putLong("tload", this.f16616h);
                bundle.putLong("pcc", this.i);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = this.f16612c.iterator();
                while (it.hasNext()) {
                    C1833yd c1833yd = (C1833yd) it.next();
                    c1833yd.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("topen", c1833yd.f16438a);
                    bundle2.putLong("tclose", c1833yd.f16439b);
                    arrayList.add(bundle2);
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }
}
