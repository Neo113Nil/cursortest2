package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import s3.BinderC2361b;
import s3.InterfaceC2360a;
import y3.BinderC2666b;
import y3.C2672h;

/* loaded from: classes.dex */
public final class M9 extends E5 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10605k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final Object f10606l;

    public M9(A0.J0 j02) {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
        this.f10606l = j02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.os.Parcel] */
    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        ?? r14;
        long longValue;
        Object obj = this.f10606l;
        switch (this.f10605k) {
            case 0:
                if (i != 1) {
                    return false;
                }
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) F5.a(parcel, ParcelFileDescriptor.CREATOR);
                F5.b(parcel);
                ((C0634Ld) obj).b(parcelFileDescriptor);
                return true;
            default:
                A0.J0 j02 = (A0.J0) obj;
                switch (i) {
                    case 1:
                        Bundle bundle = (Bundle) F5.a(parcel, Bundle.CREATOR);
                        F5.b(parcel);
                        y3.r rVar = (y3.r) j02.f304k;
                        rVar.getClass();
                        rVar.b(new y3.n(rVar, bundle, new BinderC2666b(), 0));
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        Bundle bundle2 = (Bundle) F5.a(parcel, Bundle.CREATOR);
                        F5.b(parcel);
                        y3.r rVar2 = (y3.r) j02.f304k;
                        rVar2.getClass();
                        BinderC2666b binderC2666b = new BinderC2666b();
                        rVar2.b(new y3.n(rVar2, bundle2, binderC2666b, 0));
                        Bundle h1 = binderC2666b.h1(5000L);
                        parcel2.writeNoException();
                        F5.d(parcel2, h1);
                        return true;
                    case 3:
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        Bundle bundle3 = (Bundle) F5.a(parcel, Bundle.CREATOR);
                        F5.b(parcel);
                        y3.r rVar3 = (y3.r) j02.f304k;
                        rVar3.getClass();
                        rVar3.b(new y3.i(rVar3, readString, readString2, bundle3, 1));
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        String readString3 = parcel.readString();
                        String readString4 = parcel.readString();
                        InterfaceC2360a h12 = BinderC2361b.h1(parcel.readStrongBinder());
                        F5.b(parcel);
                        Object t12 = h12 != null ? BinderC2361b.t1(h12) : null;
                        y3.r rVar4 = (y3.r) j02.f304k;
                        rVar4.getClass();
                        rVar4.b(new y3.j(rVar4, readString3, readString4, t12, 3));
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        String readString5 = parcel.readString();
                        String readString6 = parcel.readString();
                        ClassLoader classLoader = F5.f8654a;
                        boolean z3 = parcel.readInt() != 0;
                        F5.b(parcel);
                        y3.r rVar5 = (y3.r) j02.f304k;
                        rVar5.getClass();
                        BinderC2666b binderC2666b2 = new BinderC2666b();
                        rVar5.b(new y3.m(rVar5, readString5, readString6, z3, binderC2666b2));
                        Bundle h13 = binderC2666b2.h1(5000L);
                        if (h13 == null || h13.size() == 0) {
                            r14 = Collections.EMPTY_MAP;
                        } else {
                            r14 = new HashMap(h13.size());
                            for (String str : h13.keySet()) {
                                Object obj2 = h13.get(str);
                                if ((obj2 instanceof Double) || (obj2 instanceof Long) || (obj2 instanceof String)) {
                                    r14.put(str, obj2);
                                }
                            }
                        }
                        parcel2.writeNoException();
                        parcel2.writeMap(r14);
                        return true;
                    case 6:
                        String readString7 = parcel.readString();
                        F5.b(parcel);
                        y3.r rVar6 = (y3.r) j02.f304k;
                        rVar6.getClass();
                        BinderC2666b binderC2666b3 = new BinderC2666b();
                        rVar6.b(new y3.n(rVar6, readString7, binderC2666b3, 1));
                        Integer num = (Integer) BinderC2666b.Q1(binderC2666b3.h1(10000L), Integer.class);
                        int intValue = num == null ? 25 : num.intValue();
                        parcel2.writeNoException();
                        parcel2.writeInt(intValue);
                        return true;
                    case 7:
                        Bundle bundle4 = (Bundle) F5.a(parcel, Bundle.CREATOR);
                        F5.b(parcel);
                        y3.r rVar7 = (y3.r) j02.f304k;
                        rVar7.getClass();
                        rVar7.b(new C2672h(rVar7, bundle4, 0));
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        String readString8 = parcel.readString();
                        String readString9 = parcel.readString();
                        Bundle bundle5 = (Bundle) F5.a(parcel, Bundle.CREATOR);
                        F5.b(parcel);
                        y3.r rVar8 = (y3.r) j02.f304k;
                        rVar8.getClass();
                        rVar8.b(new y3.i(rVar8, readString8, readString9, bundle5, 0));
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        String readString10 = parcel.readString();
                        String readString11 = parcel.readString();
                        F5.b(parcel);
                        y3.r rVar9 = (y3.r) j02.f304k;
                        rVar9.getClass();
                        BinderC2666b binderC2666b4 = new BinderC2666b();
                        rVar9.b(new y3.j(rVar9, readString10, readString11, binderC2666b4, 0));
                        List list = (List) BinderC2666b.Q1(binderC2666b4.h1(5000L), List.class);
                        if (list == null) {
                            list = Collections.EMPTY_LIST;
                        }
                        parcel2.writeNoException();
                        parcel2.writeList(list);
                        return true;
                    case 10:
                        y3.r rVar10 = (y3.r) j02.f304k;
                        rVar10.getClass();
                        BinderC2666b binderC2666b5 = new BinderC2666b();
                        rVar10.b(new y3.l(rVar10, binderC2666b5, 1));
                        String str2 = (String) BinderC2666b.Q1(binderC2666b5.h1(50L), String.class);
                        parcel2.writeNoException();
                        parcel2.writeString(str2);
                        return true;
                    case 11:
                        y3.r rVar11 = (y3.r) j02.f304k;
                        rVar11.getClass();
                        BinderC2666b binderC2666b6 = new BinderC2666b();
                        rVar11.b(new y3.l(rVar11, binderC2666b6, 0));
                        String str3 = (String) BinderC2666b.Q1(binderC2666b6.h1(500L), String.class);
                        parcel2.writeNoException();
                        parcel2.writeString(str3);
                        return true;
                    case 12:
                        y3.r rVar12 = (y3.r) j02.f304k;
                        rVar12.getClass();
                        BinderC2666b binderC2666b7 = new BinderC2666b();
                        rVar12.b(new y3.l(rVar12, binderC2666b7, 2));
                        Long l5 = (Long) BinderC2666b.Q1(binderC2666b7.h1(500L), Long.class);
                        if (l5 == null) {
                            long nanoTime = System.nanoTime();
                            rVar12.f21271b.getClass();
                            long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                            int i5 = rVar12.f21274e + 1;
                            rVar12.f21274e = i5;
                            longValue = nextLong + i5;
                        } else {
                            longValue = l5.longValue();
                        }
                        parcel2.writeNoException();
                        parcel2.writeLong(longValue);
                        return true;
                    case 13:
                        String readString12 = parcel.readString();
                        F5.b(parcel);
                        y3.r rVar13 = (y3.r) j02.f304k;
                        rVar13.getClass();
                        rVar13.b(new y3.k(rVar13, readString12, 0));
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        String readString13 = parcel.readString();
                        F5.b(parcel);
                        y3.r rVar14 = (y3.r) j02.f304k;
                        rVar14.getClass();
                        rVar14.b(new y3.k(rVar14, readString13, 1));
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        InterfaceC2360a h14 = BinderC2361b.h1(parcel.readStrongBinder());
                        String readString14 = parcel.readString();
                        String readString15 = parcel.readString();
                        F5.b(parcel);
                        Activity activity = h14 != null ? (Activity) BinderC2361b.t1(h14) : null;
                        y3.r rVar15 = (y3.r) j02.f304k;
                        rVar15.getClass();
                        rVar15.b(new y3.j(rVar15, activity, readString14, readString15));
                        parcel2.writeNoException();
                        return true;
                    case 16:
                        y3.r rVar16 = (y3.r) j02.f304k;
                        rVar16.getClass();
                        BinderC2666b binderC2666b8 = new BinderC2666b();
                        rVar16.b(new y3.l(rVar16, binderC2666b8, 3));
                        String str4 = (String) BinderC2666b.Q1(binderC2666b8.h1(500L), String.class);
                        parcel2.writeNoException();
                        parcel2.writeString(str4);
                        return true;
                    case 17:
                        y3.r rVar17 = (y3.r) j02.f304k;
                        rVar17.getClass();
                        BinderC2666b binderC2666b9 = new BinderC2666b();
                        rVar17.b(new y3.l(rVar17, binderC2666b9, 4));
                        String str5 = (String) BinderC2666b.Q1(binderC2666b9.h1(500L), String.class);
                        parcel2.writeNoException();
                        parcel2.writeString(str5);
                        return true;
                    case 18:
                        String str6 = ((y3.r) j02.f304k).f21275g;
                        parcel2.writeNoException();
                        parcel2.writeString(str6);
                        return true;
                    case 19:
                        Bundle bundle6 = (Bundle) F5.a(parcel, Bundle.CREATOR);
                        F5.b(parcel);
                        y3.r rVar18 = (y3.r) j02.f304k;
                        rVar18.getClass();
                        rVar18.b(new C2672h(rVar18, bundle6, 1));
                        parcel2.writeNoException();
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M9(C0634Ld c0634Ld) {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
        this.f10606l = c0634Ld;
    }
}
