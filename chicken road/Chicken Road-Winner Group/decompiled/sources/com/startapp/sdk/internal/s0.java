package com.startapp.sdk.internal;

import android.content.Context;
import android.net.Uri;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4310a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4311b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f4312c = new r0(this);

    public s0(Context context, ArrayList arrayList) {
        this.f4311b = arrayList;
        this.f4310a = context;
    }

    public static ArrayList a(ArrayList arrayList) {
        String c3;
        String str;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AppPresenceDetails appPresenceDetails = (AppPresenceDetails) it.next();
            if (!appPresenceDetails.e() && (c3 = appPresenceDetails.c()) != null) {
                try {
                    str = Uri.parse(c3).getQueryParameter("d");
                } catch (Throwable th) {
                    d9.a(th);
                    str = null;
                }
                if (str != null) {
                    if (appPresenceDetails.d()) {
                        arrayList3.add("d=".concat(str));
                    } else {
                        arrayList4.add("d=".concat(str));
                    }
                }
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.addAll(g0.a(arrayList3, "true"));
        }
        if (!arrayList4.isEmpty()) {
            arrayList2.addAll(g0.a(arrayList4, "false"));
        }
        return arrayList2;
    }
}
