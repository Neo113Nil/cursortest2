package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p074k3.c;

/* JADX INFO: loaded from: classes.dex */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new c(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f11401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11402c;

    public zan(int i7, String str, ArrayList arrayList) {
        this.f11400a = i7;
        HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            zal zalVar = (zal) arrayList.get(i8);
            String str2 = zalVar.f11395b;
            HashMap map2 = new HashMap();
            ArrayList arrayList2 = zalVar.f11396c;
            D.i(arrayList2);
            int size2 = arrayList2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                zam zamVar = (zam) arrayList2.get(i9);
                map2.put(zamVar.f11398b, zamVar.f11399c);
            }
            map.put(str2, map2);
        }
        this.f11401b = map;
        D.i(str);
        this.f11402c = str;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Map map3 = (Map) map.get((String) it.next());
            Iterator it2 = map3.keySet().iterator();
            while (it2.hasNext()) {
                ((FastJsonResponse$Field) map3.get((String) it2.next())).f11376A = this;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        HashMap map = this.f11401b;
        for (String str : map.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map2 = (Map) map.get(str);
            for (String str2 : map2.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map2.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11400a);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.f11401b;
        for (String str : map.keySet()) {
            arrayList.add(new zal(str, (Map) map.get(str)));
        }
        Y4.D.w0(parcel, 2, arrayList, false);
        Y4.D.s0(parcel, 3, this.f11402c, false);
        Y4.D.z0(iX0, parcel);
    }
}
