package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import k3.C1338c;

/* loaded from: classes.dex */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new C1338c(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f11400a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f11401b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11402c;

    public zan(int i7, String str, ArrayList arrayList) {
        this.f11400a = i7;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            zal zalVar = (zal) arrayList.get(i8);
            String str2 = zalVar.f11395b;
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList2 = zalVar.f11396c;
            D.i(arrayList2);
            int size2 = arrayList2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                zam zamVar = (zam) arrayList2.get(i9);
                hashMap2.put(zamVar.f11398b, zamVar.f11399c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f11401b = hashMap;
        D.i(str);
        this.f11402c = str;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) hashMap.get((String) it.next());
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                ((FastJsonResponse$Field) map.get((String) it2.next())).f11376A = this;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = this.f11401b;
        for (String str : hashMap.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) hashMap.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11400a);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.f11401b;
        for (String str : hashMap.keySet()) {
            arrayList.add(new zal(str, (Map) hashMap.get(str)));
        }
        Y4.D.w0(parcel, 2, arrayList, false);
        Y4.D.s0(parcel, 3, this.f11402c, false);
        Y4.D.z0(x02, parcel);
    }
}
