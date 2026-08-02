package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import s0.InterfaceC2352a;
import x.C2571b0;
import x.C2604s0;

/* loaded from: classes.dex */
public final class Sm implements Jw, Ar, InterfaceC2352a {

    /* renamed from: k, reason: collision with root package name */
    public boolean f11583k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f11584l;

    public /* synthetic */ Sm(Object obj, boolean z3) {
        this.f11583k = z3;
        this.f11584l = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // s0.InterfaceC2352a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object G(long j5, long j6, a4.c cVar) {
        C2571b0 c2571b0;
        int i;
        long j7;
        if (cVar instanceof C2571b0) {
            c2571b0 = (C2571b0) cVar;
            int i5 = c2571b0.f20742n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2571b0.f20742n = i5 - Integer.MIN_VALUE;
                Object obj = c2571b0.f20740l;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = c2571b0.f20742n;
                if (i != 0) {
                    G4.l.N(obj);
                    if (!this.f11583k) {
                        j7 = 0;
                        return new W0.q(j7);
                    }
                    c2571b0.f20739k = j6;
                    c2571b0.f20742n = 1;
                    obj = ((C2604s0) this.f11584l).b(j6, c2571b0);
                    if (obj == enumC0510a) {
                        return enumC0510a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j6 = c2571b0.f20739k;
                    G4.l.N(obj);
                }
                j7 = W0.q.d(j6, ((W0.q) obj).f6024a);
                return new W0.q(j7);
            }
        }
        c2571b0 = new C2571b0(this, (AbstractC0542c) cVar);
        Object obj2 = c2571b0.f20740l;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = c2571b0.f20742n;
        if (i != 0) {
        }
        j7 = W0.q.d(j6, ((W0.q) obj2).f6024a);
        return new W0.q(j7);
    }

    @Override // s0.InterfaceC2352a
    public long I(int i, long j5, long j6) {
        if (!this.f11583k) {
            return 0L;
        }
        C2604s0 c2604s0 = (C2604s0) this.f11584l;
        if (c2604s0.f20863a.b()) {
            return 0L;
        }
        return c2604s0.g(c2604s0.c(c2604s0.f20863a.d(c2604s0.c(c2604s0.f(j6)))));
    }

    @Override // s0.InterfaceC2352a
    public Object L(long j5, a4.c cVar) {
        return new W0.q(0L);
    }

    public void a(int i) {
        AbstractC1668us.a0(!this.f11583k);
        ((SparseBooleanArray) this.f11584l).append(i, true);
    }

    public WG b() {
        AbstractC1668us.a0(!this.f11583k);
        this.f11583k = true;
        return new WG((SparseBooleanArray) this.f11584l);
    }

    @Override // s0.InterfaceC2352a
    public /* synthetic */ long c0(int i, long j5) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.Ar
    public Object k(Object obj) {
        long j5;
        C0905dr c0905dr = (C0905dr) this.f11584l;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (this.f11583k) {
            ((Context) c0905dr.f13186l).deleteDatabase("OfflineUpload.db");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(F6.M(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (XB e3) {
                U2.j.f("Unable to deserialize proto from offline signals database:");
                U2.j.f(e3.getMessage());
            }
        }
        query.close();
        Context context = (Context) c0905dr.f13186l;
        G6 E5 = I6.E();
        String packageName = context.getPackageName();
        E5.e();
        I6.x((I6) E5.f10141l, packageName);
        String str = Build.MODEL;
        E5.e();
        I6.z((I6) E5.f10141l);
        int c5 = AbstractC1668us.c(sQLiteDatabase, 0);
        E5.e();
        I6.A((I6) E5.f10141l, c5);
        E5.e();
        I6.w((I6) E5.f10141l, arrayList);
        int c6 = AbstractC1668us.c(sQLiteDatabase, 1);
        E5.e();
        I6.C((I6) E5.f10141l, c6);
        int c7 = AbstractC1668us.c(sQLiteDatabase, 3);
        E5.e();
        I6.y((I6) E5.f10141l, c7);
        P2.o.f4767B.f4776j.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        E5.e();
        I6.D((I6) E5.f10141l, currentTimeMillis);
        Cursor b02 = AbstractC1668us.b0(sQLiteDatabase, 2);
        if (b02.getCount() > 0) {
            b02.moveToNext();
            j5 = b02.getLong(b02.getColumnIndexOrThrow("value"));
        } else {
            j5 = 0;
        }
        b02.close();
        E5.e();
        I6.B((I6) E5.f10141l, j5);
        I6 i6 = (I6) E5.b();
        int size = arrayList.size();
        long j6 = 0;
        for (int i = 0; i < size; i++) {
            F6 f6 = (F6) arrayList.get(i);
            if (f6.K() == 2 && f6.J() > j6) {
                j6 = f6.J();
            }
        }
        if (j6 != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j6));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
        C1773x6 c1773x6 = (C1773x6) c0905dr.f13187m;
        synchronized (c1773x6) {
            if (c1773x6.f16228c) {
                try {
                    C1594t7 c1594t7 = c1773x6.f16227b;
                    c1594t7.e();
                    C1639u7.B((C1639u7) c1594t7.f10141l, i6);
                } catch (NullPointerException e5) {
                    P2.o.f4767B.f4774g.i("AdMobClearcutLogger.modify", e5);
                }
            }
        }
        U2.a aVar = (U2.a) c0905dr.f13188n;
        O6 z3 = P6.z();
        int i5 = aVar.f5853l;
        z3.e();
        P6.w((P6) z3.f10141l, i5);
        int i7 = ((U2.a) c0905dr.f13188n).f5854m;
        z3.e();
        P6.y((P6) z3.f10141l, i7);
        int i8 = true != ((U2.a) c0905dr.f13188n).f5855n ? 2 : 0;
        z3.e();
        P6.x((P6) z3.f10141l, i8);
        ((C1773x6) c0905dr.f13187m).a(new U4(21, (P6) z3.b()));
        ((C1773x6) c0905dr.f13187m).b(10004);
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        AbstractC1668us.g0(sQLiteDatabase, "failed_requests");
        AbstractC1668us.g0(sQLiteDatabase, "total_requests");
        AbstractC1668us.g0(sQLiteDatabase, "completed_requests");
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0098, code lost:
    
        if (r2.equals("banner") != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b6 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo14o(Object obj) {
        List list;
        List asList;
        ArrayList arrayList;
        Iterator it;
        char c5;
        C0572Ch c0572Ch = (C0572Ch) obj;
        Tm tm = (Tm) this.f11584l;
        if (((T2.I) tm.f474a).n()) {
            return;
        }
        Bundle bundle = c0572Ch.f8049a;
        Object obj2 = bundle.get("ad_types");
        if (obj2 instanceof List) {
            asList = (List) obj2;
        } else if (obj2 instanceof String[]) {
            asList = Arrays.asList((String[]) obj2);
        } else {
            list = Collections.EMPTY_LIST;
            arrayList = new ArrayList();
            it = list.iterator();
            while (true) {
                int i = 3;
                c5 = 0;
                if (it.hasNext()) {
                    H6 h6 = (H6) Tm.f11674h.get(AbstractC1803xs.e("network", AbstractC1803xs.e("device", bundle)).getInt("active_network_state", -1), H6.f9325l);
                    B6 w5 = C6.w();
                    int i5 = bundle.getInt("cnt", -2);
                    int i6 = bundle.getInt("gnt", 0);
                    if (i5 == -1) {
                        tm.f11678g = 2;
                    } else {
                        tm.f11678g = 1;
                        if (i5 == 0) {
                            w5.e();
                            C6.y((C6) w5.f10141l, 2);
                        } else if (i5 != 1) {
                            w5.e();
                            C6.y((C6) w5.f10141l, 1);
                        } else {
                            w5.e();
                            C6.y((C6) w5.f10141l, 3);
                        }
                        switch (i6) {
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                            case 11:
                            case 16:
                                i = 2;
                                break;
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                break;
                            case 13:
                                i = 4;
                                break;
                            default:
                                i = 1;
                                break;
                        }
                        w5.e();
                        C6.x((C6) w5.f10141l, i);
                    }
                    ((C1390oj) tm.f475b).g(new C1894zt(this, this.f11583k, arrayList, (C6) w5.b(), h6));
                    return;
                }
                String str = (String) it.next();
                switch (str.hashCode()) {
                    case -1396342996:
                        break;
                    case -1052618729:
                        if (str.equals("native")) {
                            c5 = 2;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            c5 = 3;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 604727084:
                        if (str.equals("interstitial")) {
                            c5 = 1;
                            break;
                        }
                        c5 = 65535;
                        break;
                    default:
                        c5 = 65535;
                        break;
                }
                arrayList.add(c5 != 0 ? c5 != 1 ? c5 != 2 ? c5 != 3 ? EnumC1145j7.f14074l : EnumC1145j7.f14083u : EnumC1145j7.f14079q : EnumC1145j7.f14076n : EnumC1145j7.f14075m);
            }
        }
        ArrayList arrayList2 = new ArrayList(asList.size());
        for (Object obj3 : asList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        list = Collections.unmodifiableList(arrayList2);
        arrayList = new ArrayList();
        it = list.iterator();
        while (true) {
            int i7 = 3;
            c5 = 0;
            if (it.hasNext()) {
            }
            arrayList.add(c5 != 0 ? c5 != 1 ? c5 != 2 ? c5 != 3 ? EnumC1145j7.f14074l : EnumC1145j7.f14083u : EnumC1145j7.f14079q : EnumC1145j7.f14076n : EnumC1145j7.f14075m);
        }
    }

    @Override // com.google.android.gms.internal.ads.Jw
    public void u(Throwable th) {
        U2.j.f("Failed to get signals bundle");
    }

    public Sm() {
        this.f11584l = new SparseBooleanArray();
    }
}
