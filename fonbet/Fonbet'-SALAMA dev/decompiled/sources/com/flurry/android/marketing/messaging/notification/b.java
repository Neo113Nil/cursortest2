package com.flurry.android.marketing.messaging.notification;

import A1.x0;
import M4.e;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.CellSignalStrength;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.flurry.android.marketing.messaging.FlurryMessagingListener;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.ads.zzbbd;
import d6.C0977k;
import e3.C1023h;
import e6.C1054c;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import n1.C1450e;
import u1.i;
import w1.A1;
import w1.AbstractC1706i0;
import w1.AbstractC1707i1;
import w1.AbstractC1715k1;
import w1.AbstractRunnableC1687d1;
import w1.B;
import w1.B1;
import w1.C1682c0;
import w1.C1686d0;
import w1.C1710j0;
import w1.C1714k0;
import w1.C1717l;
import w1.C1738q0;
import w1.C1740r0;
import w1.C1743s0;
import w1.C1748u;
import w1.C1751v;
import w1.C1756w1;
import w1.C1758x0;
import w1.C1759x1;
import w1.C2;
import w1.D1;
import w1.D2;
import w1.E1;
import w1.E2;
import w1.F2;
import w1.G2;
import w1.I;
import w1.I2;
import w1.J0;
import w1.K;
import w1.K0;
import w1.K1;
import w1.K2;
import w1.L0;
import w1.M;
import w1.N;
import w1.R1;
import w1.S;
import w1.T;
import w1.W;
import w1.W1;
import w1.Y;
import w1.Y1;
import w1.Z;
import w1.Z1;
import w1.r2;
import w1.s2;

/* loaded from: classes.dex */
public final class b extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10498b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10499c;

    public /* synthetic */ b(int i7, Object obj, Object obj2) {
        this.f10497a = i7;
        this.f10499c = obj;
        this.f10498b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0988  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x09d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // w1.AbstractRunnableC1687d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        C1756w1 c1756w1;
        File[] listFiles;
        List asList;
        ArrayList arrayList;
        List list;
        DataInputStream dataInputStream;
        byte[] bArr;
        int readUnsignedShort;
        int evdoDbm;
        int i7;
        List cellSignalStrengths;
        CharSequence simCarrierIdName;
        ArrayList<C2> arrayList2;
        C2 c22;
        Z1 z12;
        HashMap hashMap;
        HashMap hashMap2;
        String str;
        int i8 = 22;
        int i9 = 3;
        int i10 = 4;
        Intent intent = null;
        int i11 = 0;
        i11 = 0;
        switch (this.f10497a) {
            case 0:
                Iterator it = ((FlurryNotification) this.f10499c).f10487b.entrySet().iterator();
                while (it.hasNext()) {
                    ((FlurryNotificationListener) ((Map.Entry) it.next()).getValue()).onTokenRefresh((String) this.f10498b);
                }
                return;
            case 1:
                ((FlurryNotificationFilter) this.f10498b).getFilterListener().onNotificationReceived(this.f10499c);
                return;
            case 2:
                C1759x1 z4 = C1759x1.z();
                C1743s0 c1743s0 = (C1743s0) ((C1756w1) z4.f17927d).f17912A;
                w wVar = c1743s0.f17855D;
                String str2 = (String) wVar.f11335b;
                ArrayList arrayList3 = new ArrayList();
                File fileStreamPath = AbstractC1707i1.f17743c.getFileStreamPath(".FlurrySenderIndex.info.".concat(String.valueOf(str2)));
                fileStreamPath.exists();
                if (fileStreamPath.exists()) {
                    ArrayList n2 = wVar.n(str2);
                    if (n2 != null && n2.size() > 0) {
                        arrayList3.addAll(n2);
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            String str3 = (String) it2.next();
                            ArrayList<String> n7 = wVar.n(str3);
                            if (n7 == null) {
                                AbstractC1706i0.o(i10, "No old file to replace");
                            } else {
                                for (String str4 : n7) {
                                    AbstractC1706i0.m();
                                    Objects.toString(AbstractC1707i1.f17743c.getFileStreamPath(".flurrydatasenderblock.".concat(String.valueOf(str4))));
                                    File fileStreamPath2 = AbstractC1707i1.f17743c.getFileStreamPath(".flurrydatasenderblock.".concat(String.valueOf(str4)));
                                    if (fileStreamPath2.exists()) {
                                        try {
                                            dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath2));
                                            try {
                                                readUnsignedShort = dataInputStream.readUnsignedShort();
                                            } catch (Throwable th) {
                                                th = th;
                                                bArr = null;
                                                try {
                                                    Log.getStackTraceString(th);
                                                    if (bArr == null) {
                                                    }
                                                } finally {
                                                    AbstractC1706i0.h(dataInputStream);
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            dataInputStream = null;
                                        }
                                        if (readUnsignedShort != 0) {
                                            bArr = new byte[readUnsignedShort];
                                            try {
                                                dataInputStream.readFully(bArr);
                                                dataInputStream.readUnsignedShort();
                                            } catch (Throwable th3) {
                                                th = th3;
                                                Log.getStackTraceString(th);
                                                if (bArr == null) {
                                                }
                                            }
                                            if (bArr == null) {
                                                AbstractC1706i0.m();
                                                Objects.toString(AbstractC1707i1.f17743c.getFileStreamPath(".yflurrydatasenderblock.".concat(String.valueOf(str4))));
                                                C1738q0.a(str4).g(new C1738q0(bArr));
                                                AbstractC1706i0.m();
                                                Objects.toString(AbstractC1707i1.f17743c.getFileStreamPath(".flurrydatasenderblock.".concat(String.valueOf(str4))));
                                                File fileStreamPath3 = AbstractC1707i1.f17743c.getFileStreamPath(".flurrydatasenderblock.".concat(String.valueOf(str4)));
                                                if (fileStreamPath3.exists()) {
                                                    fileStreamPath3.delete();
                                                }
                                            }
                                        }
                                    }
                                    bArr = null;
                                    if (bArr == null) {
                                    }
                                }
                                wVar.q(str3, ".YFlurrySenderIndex.info.", n7);
                                w.v(str3);
                            }
                            i10 = 4;
                        }
                    }
                    w.v(str2);
                } else {
                    List list2 = (List) new C0977k(AbstractC1707i1.f17743c.getFileStreamPath(w.z((String) wVar.f11335b)), str2, 1, new e()).e();
                    if (list2 == null) {
                        AbstractC1706i0.o(4, "New main file also not found. returning..");
                        c1743s0.d(new C1717l(c1743s0, 4));
                        ((A1) ((C1450e) ((x0) z4.f17925b).f613b).f15308b).h(null);
                        c1756w1 = (C1756w1) z4.f17926c;
                        listFiles = new File(AbstractC1715k1.h()).listFiles();
                        if (listFiles != null) {
                            for (int i12 = 0; i12 < listFiles.length; i12++) {
                                if (listFiles[i12].isFile()) {
                                    listFiles[i12].getName();
                                } else if (listFiles[i12].isDirectory()) {
                                    listFiles[i12].getName();
                                }
                            }
                        }
                        System.out.println();
                        int length = listFiles.length;
                        asList = Arrays.asList(listFiles);
                        c1756w1.getClass();
                        if (asList != null && asList.size() != 0) {
                            c1756w1.d(new b(22, c1756w1, asList));
                        }
                        c1756w1.d(new b(21, c1756w1, c1756w1));
                        synchronized (AbstractC1707i1.class) {
                            if (!AbstractC1707i1.f17741a) {
                                try {
                                    K0.a(Class.forName("com.flurry.android.bridge.FlurryBridgeModule"));
                                } catch (ClassNotFoundException | NoClassDefFoundError unused) {
                                }
                                AbstractC1707i1.f17741a = true;
                            }
                        }
                        Context context = (Context) this.f10498b;
                        LinkedHashMap linkedHashMap = K0.f17429b;
                        synchronized (linkedHashMap) {
                            arrayList = new ArrayList(linkedHashMap.values());
                            ArrayList arrayList4 = K0.f17428a;
                        }
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            J0 j02 = (J0) it3.next();
                            "registration ".concat(String.valueOf(j02));
                            try {
                                L0 l02 = (L0) j02.f17417a.newInstance();
                                l02.init(context);
                                K0.f17430c.put(j02.f17417a, l02);
                            } catch (Exception e7) {
                                Objects.toString(j02.f17417a);
                                Log.getStackTraceString(e7);
                            }
                        }
                        ArrayList arrayList5 = (ArrayList) this.f10499c;
                        synchronized (AbstractC1707i1.class) {
                            try {
                                if (!AbstractC1707i1.f17742b) {
                                    if (arrayList5 != null) {
                                        Iterator it4 = arrayList5.iterator();
                                        while (it4.hasNext()) {
                                            K0.b((L0) ((i) it4.next()));
                                        }
                                    }
                                    AbstractC1707i1.f17742b = true;
                                }
                            } finally {
                            }
                        }
                        Context context2 = (Context) this.f10498b;
                        synchronized (AbstractC1707i1.class) {
                            K0.c(context2);
                        }
                        return;
                    }
                    Iterator it5 = list2.iterator();
                    while (it5.hasNext()) {
                        arrayList3.add(((C1740r0) it5.next()).f17841a);
                    }
                }
                Iterator it6 = arrayList3.iterator();
                while (it6.hasNext()) {
                    String str5 = (String) it6.next();
                    synchronized (wVar) {
                        AbstractC1706i0.m();
                        Objects.toString(AbstractC1707i1.f17743c.getFileStreamPath(w.z(str5)));
                        List list3 = (List) new C0977k(AbstractC1707i1.f17743c.getFileStreamPath(w.z(str5)), ".YFlurrySenderIndex.info.", 1, new C1054c(27)).e();
                        if (list3 == null) {
                            list = Collections.emptyList();
                        } else {
                            ArrayList arrayList6 = new ArrayList();
                            Iterator it7 = list3.iterator();
                            while (it7.hasNext()) {
                                arrayList6.add(((C1740r0) it7.next()).f17841a);
                            }
                            list = arrayList6;
                        }
                    }
                    if (list != null && !list.isEmpty()) {
                        ((LinkedHashMap) wVar.f11336c).put(str5, list);
                    }
                }
                c1743s0.d(new C1717l(c1743s0, 4));
                ((A1) ((C1450e) ((x0) z4.f17925b).f613b).f15308b).h(null);
                c1756w1 = (C1756w1) z4.f17926c;
                listFiles = new File(AbstractC1715k1.h()).listFiles();
                if (listFiles != null) {
                }
                System.out.println();
                int length2 = listFiles.length;
                asList = Arrays.asList(listFiles);
                c1756w1.getClass();
                if (asList != null) {
                    c1756w1.d(new b(22, c1756w1, asList));
                }
                c1756w1.d(new b(21, c1756w1, c1756w1));
                synchronized (AbstractC1707i1.class) {
                }
                break;
            case 3:
                I i13 = (I) this.f10498b;
                boolean z7 = i13.f17412a;
                C1748u c1748u = (C1748u) this.f10499c;
                C1751v c1751v = c1748u.f17875b;
                c1751v.f17887E = i13;
                c1751v.j();
                C1751v c1751v2 = c1748u.f17875b;
                K k7 = c1751v2.f17889G;
                C1748u c1748u2 = c1751v2.f17888F;
                k7.getClass();
                k7.d(new F2(k7, c1748u2, 1));
                return;
            case 4:
                B b7 = (B) this.f10499c;
                if (((K) b7.f17282b).f17426C == null) {
                    M m7 = (M) this.f10498b;
                    if (t.e.b(m7.f17447a, 1)) {
                        K k8 = (K) b7.f17282b;
                        k8.f17426C = m7.f17448b.getString("activity_name");
                        K.k(k8);
                        N n8 = k8.f17424A;
                        B b8 = k8.f17427D;
                        n8.getClass();
                        n8.d(new F2(n8, b8, 1));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                T t7 = (T) this.f10499c;
                Location j = t7.j();
                if (j != null) {
                    t7.f17535D = j;
                }
                ((I2) this.f10498b).a(new S(t7.f17532A, t7.f17533B, t7.f17535D));
                return;
            case 6:
                Y y4 = (Y) this.f10499c;
                y4.getClass();
                TelephonyManager telephonyManager = (TelephonyManager) AbstractC1707i1.f17743c.getSystemService("phone");
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                String networkOperator = telephonyManager.getNetworkOperator();
                String simOperator = telephonyManager.getSimOperator();
                String simOperatorName = telephonyManager.getSimOperatorName();
                String str6 = "";
                if (Build.VERSION.SDK_INT >= 28) {
                    try {
                        simCarrierIdName = telephonyManager.getSimCarrierIdName();
                        if (simCarrierIdName != null) {
                            str6 = simCarrierIdName.toString();
                        }
                    } catch (NoSuchMethodError unused2) {
                    }
                }
                try {
                    int i14 = Build.VERSION.SDK_INT;
                    if (AbstractC1706i0.l("android.permission.READ_PHONE_STATE")) {
                        i11 = telephonyManager.getDataNetworkType();
                    } else if (i14 < 30) {
                        i11 = telephonyManager.getNetworkType();
                    }
                } catch (SecurityException unused3) {
                }
                String num = Integer.toString(i11);
                SignalStrength signalStrength = (SignalStrength) this.f10498b;
                if (signalStrength == null) {
                    i7 = y4.f17609K;
                } else {
                    if (Build.VERSION.SDK_INT >= 29) {
                        try {
                            cellSignalStrengths = signalStrength.getCellSignalStrengths();
                            Iterator it8 = cellSignalStrengths.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    int dbm = ((CellSignalStrength) it8.next()).getDbm();
                                    if (dbm != Integer.MAX_VALUE) {
                                        i7 = dbm;
                                    }
                                }
                            }
                        } catch (NoSuchMethodError unused4) {
                        }
                    }
                    try {
                        i7 = ((Integer) signalStrength.getClass().getMethod("getDbm", null).invoke(signalStrength, null)).intValue();
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused5) {
                        if (signalStrength.isGsm()) {
                            i7 = Y.j(signalStrength, "getLteDbm", "rsrp", 9);
                            if (i7 == Integer.MAX_VALUE && (((i7 = Y.j(signalStrength, "getTdScdmaDbm", "mTdscdma", 14)) > -25 || i7 == Integer.MAX_VALUE || (i7 < -49 && i7 < -73 && i7 < -97 && i7 < -110)) && (i7 = Y.j(signalStrength, "getWcdmaDbm", "mWcdma", 17)) == Integer.MAX_VALUE)) {
                                int gsmSignalStrength = signalStrength.getGsmSignalStrength();
                                evdoDbm = -1;
                                if ((gsmSignalStrength == 99 ? -1 : gsmSignalStrength) != -1) {
                                    evdoDbm = (gsmSignalStrength * 2) - 113;
                                }
                            }
                        } else {
                            int cdmaDbm = signalStrength.getCdmaDbm();
                            evdoDbm = signalStrength.getEvdoDbm();
                            if (evdoDbm == -120 || (cdmaDbm != -120 && cdmaDbm < evdoDbm)) {
                                evdoDbm = cdmaDbm;
                            }
                        }
                        i7 = evdoDbm;
                    }
                }
                if (!TextUtils.equals(y4.f17603E, networkOperatorName) || !TextUtils.equals(y4.f17604F, networkOperator) || !TextUtils.equals(y4.f17605G, simOperator) || !TextUtils.equals(y4.f17606H, str6) || !TextUtils.equals(y4.f17607I, simOperatorName) || !TextUtils.equals(y4.f17608J, num) || y4.f17609K != i7) {
                    y4.f17601C = true;
                    y4.f17603E = networkOperatorName;
                    y4.f17604F = networkOperator;
                    y4.f17605G = simOperator;
                    y4.f17606H = str6;
                    y4.f17607I = simOperatorName;
                    y4.f17608J = num;
                    y4.f17609K = i7;
                }
                y4.d(new W(y4, i9));
                return;
            case 7:
                ((I2) this.f10498b).a((Z) this.f10499c);
                return;
            case 8:
                boolean b9 = t.e.b(((C1686d0) this.f10498b).f17674e, 1);
                C1714k0 c1714k0 = (C1714k0) this.f10499c;
                C1710j0 c1710j0 = b9 ? new C1710j0(true, (I) c1714k0.f17757b.f17656B) : new C1710j0(false, (I) c1714k0.f17757b.f17656B);
                C1682c0 c1682c0 = c1714k0.f17757b;
                int i15 = C1682c0.f17654C;
                c1682c0.h(c1710j0);
                return;
            case 9:
                ((C1714k0) this.f10499c).f17757b.f17656B = (I) this.f10498b;
                return;
            case 10:
                C1743s0 c1743s02 = (C1743s0) this.f10499c;
                if (c1743s02.f17853B != null) {
                    C1756w1.j(false);
                }
                c1743s02.f17854C.remove((String) this.f10498b);
                return;
            case 11:
                FlurryMessagingListener flurryMessagingListener = AbstractC1715k1.f17758a;
                FlurryMessage flurryMessage = (FlurryMessage) this.f10498b;
                if (flurryMessagingListener != null ? flurryMessagingListener.onNotificationClicked(flurryMessage) : false) {
                    return;
                }
                Context context3 = (Context) this.f10499c;
                PackageManager packageManager = context3.getPackageManager();
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(context3.getPackageName());
                String clickAction = flurryMessage.getClickAction();
                if (TextUtils.isEmpty(clickAction)) {
                    AbstractC1706i0.o(3, "No click action specified, opening default launcher intent.");
                } else {
                    Intent intent2 = new Intent(clickAction);
                    if (intent2.resolveActivity(packageManager) != null) {
                        intent = intent2;
                    } else {
                        Locale.getDefault();
                        AbstractC1706i0.q("The specified 'click_action'," + clickAction + ", does resolve to an intent'");
                    }
                }
                if (intent != null) {
                    launchIntentForPackage = intent;
                }
                launchIntentForPackage.putExtra("flurryMessage", flurryMessage);
                launchIntentForPackage.setFlags(268435456);
                context3.startActivity(launchIntentForPackage);
                return;
            case 12:
                ((FlurryMessagingListener) this.f10498b).onNotificationCancelled((FlurryMessage) this.f10499c);
                return;
            case 13:
                C1756w1 c1756w12 = (C1756w1) this.f10499c;
                ((PriorityQueue) c1756w12.f17913z).addAll((ArrayList) this.f10498b);
                c1756w12.n();
                return;
            case 14:
                ((A1) this.f10499c).l((C2) this.f10498b);
                return;
            case 15:
                C2 c23 = (C2) this.f10498b;
                boolean equals = c23.a().equals(D2.ANALYTICS_EVENT);
                D2 d22 = D2.FLUSH_FRAME;
                E1 e12 = (E1) this.f10499c;
                if (equals) {
                    Z1 z13 = (Z1) c23.f17316c;
                    if (z13.f17625y) {
                        arrayList2 = new ArrayList();
                        HashMap hashMap3 = (HashMap) e12.f17364F;
                        String str7 = z13.f17620c;
                        List list4 = (List) hashMap3.get(str7);
                        if (z13.f17626z) {
                            if (list4 == null) {
                                list4 = new ArrayList();
                            }
                            list4.add(c23);
                            ((HashMap) e12.f17364F).put(str7, list4);
                            arrayList2.add(c23);
                        } else if (list4 == null || list4.isEmpty()) {
                            E1.m(K1.f17437f, c23);
                        } else {
                            String str8 = z13.f17616A;
                            if (str8 != null) {
                                for (int i16 = 0; i16 < list4.size(); i16++) {
                                    if (str8.equals(((Z1) ((C2) list4.get(i16)).f17316c).f17616A)) {
                                        c22 = (C2) list4.remove(i16);
                                        z12 = (Z1) c22.f17316c;
                                        z13.f17621d = z12.f17621d;
                                        z13.f17619D = z13.f17617B - z12.f17617B;
                                        hashMap = z12.f17623f;
                                        if (hashMap != null && (hashMap2 = z13.f17623f) != null) {
                                            String n9 = AbstractC1706i0.n("fl.parameter.limit.exceeded");
                                            HashMap hashMap4 = z12.f17624x;
                                            str = (String) hashMap4.get(n9);
                                            HashMap hashMap5 = z13.f17624x;
                                            if (str == null) {
                                                hashMap5.putAll(hashMap4);
                                                hashMap2.clear();
                                            } else {
                                                if (!hashMap.isEmpty()) {
                                                    for (Map.Entry entry : hashMap.entrySet()) {
                                                        if (!hashMap2.containsKey(entry.getKey())) {
                                                            hashMap2.put((String) entry.getKey(), (String) entry.getValue());
                                                        }
                                                    }
                                                }
                                                if (hashMap2.size() > 10) {
                                                    hashMap5.put(AbstractC1706i0.n("fl.parameter.limit.exceeded.on.endevent"), AbstractC1706i0.n(String.valueOf(hashMap2.size())));
                                                    hashMap2.clear();
                                                    hashMap2.putAll(hashMap);
                                                }
                                            }
                                        }
                                        arrayList2.add(c23);
                                    }
                                }
                            }
                            c22 = (C2) list4.remove(0);
                            z12 = (Z1) c22.f17316c;
                            z13.f17621d = z12.f17621d;
                            z13.f17619D = z13.f17617B - z12.f17617B;
                            hashMap = z12.f17623f;
                            if (hashMap != null) {
                                String n92 = AbstractC1706i0.n("fl.parameter.limit.exceeded");
                                HashMap hashMap42 = z12.f17624x;
                                str = (String) hashMap42.get(n92);
                                HashMap hashMap52 = z13.f17624x;
                                if (str == null) {
                                }
                            }
                            arrayList2.add(c23);
                        }
                        for (C2 c24 : arrayList2) {
                            Iterator it9 = ((ArrayList) e12.f17363E).iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    C1758x0 a2 = ((K1) it9.next()).a(c24);
                                    if (t.e.b(a2.f17921b, 1)) {
                                        C2 c25 = (C2) a2.f17922c;
                                        if (c25 != null) {
                                            e12.l(c25);
                                        }
                                    } else {
                                        E1.m(a2, c24);
                                        Objects.toString(c24.a());
                                        c24.b();
                                    }
                                } else {
                                    c24.b();
                                    e12.l(c24);
                                }
                            }
                        }
                        if (c23.a().equals(d22) || !((r2) c23.f17316c).f17843d.equals("Session Finalized")) {
                            return;
                        }
                        Iterator it10 = ((ArrayList) e12.f17363E).iterator();
                        while (it10.hasNext()) {
                            ((K1) it10.next()).a();
                        }
                        ((HashMap) e12.f17364F).clear();
                        return;
                    }
                }
                if (c23.a().equals(d22) && ((r2) c23.f17316c).f17843d.equals("Session Finalized")) {
                    e12.getClass();
                    arrayList2 = new ArrayList();
                    Iterator it11 = ((HashMap) e12.f17364F).entrySet().iterator();
                    while (it11.hasNext()) {
                        Iterator it12 = ((List) ((Map.Entry) it11.next()).getValue()).iterator();
                        while (it12.hasNext()) {
                            Z1 z14 = (Z1) ((C2) it12.next()).f17316c;
                            String str9 = z14.f17620c;
                            int i17 = z14.f17621d;
                            long currentTimeMillis = System.currentTimeMillis();
                            long j3 = currentTimeMillis - z14.f17617B;
                            AtomicInteger atomicInteger = Y1.f17613e;
                            arrayList2.add(new Y1(new Z1(str9, i17, 2, z14.f17623f, z14.f17624x, true, false, z14.f17616A, currentTimeMillis, SystemClock.elapsedRealtime(), j3)));
                        }
                    }
                    arrayList2.add(c23);
                } else {
                    arrayList2 = new ArrayList();
                    arrayList2.add(c23);
                }
                while (r2.hasNext()) {
                }
                if (c23.a().equals(d22)) {
                    return;
                } else {
                    return;
                }
            case 16:
                if ((C1756w1.f17911B != null) == false) {
                    B1 b12 = (B1) this.f10499c;
                    b12.getClass();
                    Object[] objArr = C1756w1.f17911B != null ? 1 : null;
                    C1756w1 c1756w13 = b12.f17291G;
                    if (objArr != null) {
                        c1756w13.m();
                    }
                    if (c1756w13.k(AbstractC1715k1.l(), "currentFile")) {
                        C1756w1 c1756w14 = ((B1) this.f10499c).f17291G;
                        long i18 = AbstractC1707i1.i("frame.counter", 0L) + 1;
                        AbstractC1707i1.f("frame.counter", i18);
                        c1756w14.i(new R1(new s2(i18), i8), null);
                    }
                }
                if (((C2) this.f10498b).a().equals(D2.FLUSH_FRAME)) {
                    ((B1) this.f10499c).f17392A = 3;
                    ((C2) this.f10498b).b();
                    ((B1) this.f10499c).f17291G.i((C2) this.f10498b, new C1023h(this));
                    return;
                }
                D2 a4 = ((C2) this.f10498b).a();
                Objects.toString(a4);
                ((C2) this.f10498b).b();
                ((B1) this.f10499c).f17291G.i((C2) this.f10498b, null);
                if (a4 == D2.ANALYTICS_EVENT) {
                    if (((Z1) ((C2) this.f10498b).f17316c).f17622e != 7) {
                        ((B1) this.f10499c).f17290F = true;
                        return;
                    }
                    return;
                } else {
                    if (a4 == D2.ANALYTICS_ERROR || a4 == D2.USER_PROPERTY) {
                        ((B1) this.f10499c).f17290F = true;
                        return;
                    }
                    return;
                }
            case 17:
                D1 d12 = (D1) this.f10499c;
                C2 c26 = (C2) this.f10498b;
                D1.m(d12, c26);
                d12.l(c26);
                return;
            case 18:
                D1.m((D1) this.f10499c, (W1) this.f10498b);
                return;
            case 19:
                E1 e13 = (E1) this.f10499c;
                C2 c27 = (C2) this.f10498b;
                e13.l(c27);
                D2 a7 = c27.a();
                List arrayList7 = new ArrayList();
                if (((EnumMap) e13.f17363E).containsKey(a7)) {
                    ((EnumMap) e13.f17363E).put((EnumMap) a7, (D2) c27);
                }
                EnumMap enumMap = (EnumMap) e13.f17364F;
                if (enumMap.containsKey(a7)) {
                    if (enumMap.get(a7) != null) {
                        arrayList7 = (List) enumMap.get(a7);
                    }
                    arrayList7.add(c27);
                    enumMap.put((EnumMap) a7, (D2) arrayList7);
                }
                if (D2.FLUSH_FRAME.equals(c27.a())) {
                    Iterator it13 = ((EnumMap) e13.f17363E).entrySet().iterator();
                    while (it13.hasNext()) {
                        C2 c28 = (C2) ((Map.Entry) it13.next()).getValue();
                        if (c28 != null) {
                            e13.l(c28);
                        }
                    }
                    Iterator it14 = ((EnumMap) e13.f17364F).entrySet().iterator();
                    while (it14.hasNext()) {
                        List list5 = (List) ((Map.Entry) it14.next()).getValue();
                        if (list5 != null && list5.size() != 0) {
                            for (int i19 = 0; i19 < list5.size(); i19++) {
                                e13.l((C2) list5.get(i19));
                            }
                        }
                    }
                    return;
                }
                return;
            case 20:
                C1756w1 c1756w15 = (C1756w1) this.f10499c;
                ((ReentrantLock) c1756w15.f17912A).lock();
                try {
                    C1756w1.h(c1756w15, (W1) this.f10498b);
                    return;
                } finally {
                    ((ReentrantLock) c1756w15.f17912A).unlock();
                }
            case zzbbd.zzt.zzm /* 21 */:
                int i20 = Build.VERSION.SDK_INT;
                C1756w1 c1756w16 = (C1756w1) this.f10498b;
                C1756w1 c1756w17 = (C1756w1) this.f10499c;
                if (i20 >= 29) {
                    c1756w17.f17913z = new E2(new File(AbstractC1715k1.h()), c1756w16);
                } else {
                    String h6 = AbstractC1715k1.h();
                    E2 e22 = new E2(h6);
                    e22.f17366b = h6;
                    e22.f17365a = c1756w16;
                    c1756w17.f17913z = e22;
                }
                ((E2) c1756w17.f17913z).startWatching();
                return;
            case 22:
                List<File> list6 = (List) this.f10498b;
                list6.size();
                ArrayList arrayList8 = new ArrayList();
                for (File file : list6) {
                    if (file.exists()) {
                        arrayList8.add(file.getAbsolutePath());
                    }
                }
                C1756w1 c1756w18 = (C1756w1) ((C1756w1) this.f10499c).f17912A;
                if (c1756w18 == null || arrayList8.size() == 0) {
                    return;
                }
                AbstractC1706i0.o(4, "Number of files being added:" + arrayList8.toString());
                c1756w18.d(new b(13, c1756w18, arrayList8));
                return;
            case 23:
                ((I2) this.f10498b).a(((b) this.f10499c).f10498b);
                return;
            case 24:
                G2 g22 = (G2) this.f10499c;
                Iterator it15 = g22.f17385z.iterator();
                while (it15.hasNext()) {
                    g22.d(new b(23, this, (I2) it15.next()));
                }
                return;
            default:
                ((I2) this.f10498b).a((K2) this.f10499c);
                return;
        }
    }

    public /* synthetic */ b(int i7, Object obj, Object obj2, boolean z4) {
        this.f10497a = i7;
        this.f10498b = obj;
        this.f10499c = obj2;
    }
}
