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
import p028d6.k;
import p033e3.h;
import p145u1.i;
import p155w1.A1;
import p155w1.AbstractC0997i0;
import p155w1.AbstractC0998i1;
import p155w1.AbstractC1006k1;
import p155w1.AbstractRunnableC0978d1;
import p155w1.B;
import p155w1.B1;
import p155w1.C0973c0;
import p155w1.C0977d0;
import p155w1.C1001j0;
import p155w1.C1005k0;
import p155w1.C1008l;
import p155w1.C1029q0;
import p155w1.C1031r0;
import p155w1.C1034s0;
import p155w1.C1039u;
import p155w1.C1042v;
import p155w1.C1047w1;
import p155w1.C1049x0;
import p155w1.C1050x1;
import p155w1.C2;
import p155w1.D1;
import p155w1.D2;
import p155w1.E1;
import p155w1.E2;
import p155w1.F2;
import p155w1.G2;
import p155w1.I;
import p155w1.I2;
import p155w1.J0;
import p155w1.K;
import p155w1.K0;
import p155w1.K1;
import p155w1.K2;
import p155w1.L0;
import p155w1.M;
import p155w1.N;
import p155w1.R1;
import p155w1.S;
import p155w1.T;
import p155w1.W;
import p155w1.W1;
import p155w1.Y;
import p155w1.Y1;
import p155w1.Z;
import p155w1.Z1;
import p155w1.r2;
import p155w1.s2;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10499c;

    public /* synthetic */ b(int i7, Object obj, Object obj2) {
        this.f10497a = i7;
        this.f10499c = obj;
        this.f10498b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0396  */
    /* JADX WARN: Code duplicated, block: B:155:0x0429  */
    /* JADX WARN: Code duplicated, block: B:384:0x0988  */
    /* JADX WARN: Code duplicated, block: B:387:0x098c  */
    /* JADX WARN: Code duplicated, block: B:405:0x09dc A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:420:0x0a0d  */
    /* JADX WARN: Code duplicated, block: B:429:0x0a45 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:431:0x0a47 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:432:0x0a49 A[Catch: all -> 0x0a5f, TRY_ENTER, TryCatch #15 {all -> 0x0a5f, blocks: (B:427:0x0a41, B:432:0x0a49, B:433:0x0a4d, B:435:0x0a53, B:438:0x0a61), top: B:495:0x0a41 }] */
    /* JADX WARN: Code duplicated, block: B:435:0x0a53 A[Catch: all -> 0x0a5f, LOOP:19: B:433:0x0a4d->B:435:0x0a53, LOOP_END, TryCatch #15 {all -> 0x0a5f, blocks: (B:427:0x0a41, B:432:0x0a49, B:433:0x0a4d, B:435:0x0a53, B:438:0x0a61), top: B:495:0x0a41 }] */
    /* JADX WARN: Code duplicated, block: B:472:0x09d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x0a6c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:0x09de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:488:0x09f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:492:0x0621 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:0x0a41 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        C1047w1 c1047w1;
        File[] fileArrListFiles;
        List listAsList;
        Context context;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        Iterator it;
        Context context2;
        int i7;
        List listEmptyList;
        DataInputStream dataInputStream;
        byte[] bArr;
        int evdoDbm;
        int iJ;
        ArrayList<C2> arrayList2;
        C2 c3;
        HashMap map;
        int i8 = 22;
        int i9 = 3;
        int i10 = 4;
        Intent intent = null;
        int networkType = 0;
        networkType = 0;
        switch (this.f10497a) {
            case 0:
                Iterator it2 = ((FlurryNotification) this.f10499c).f10487b.entrySet().iterator();
                while (it2.hasNext()) {
                    ((FlurryNotificationListener) ((Map.Entry) it2.next()).getValue()).onTokenRefresh((String) this.f10498b);
                }
                return;
            case 1:
                ((FlurryNotificationFilter) this.f10498b).getFilterListener().onNotificationReceived(this.f10499c);
                return;
            case 2:
                C1050x1 c1050x1Z = C1050x1.z();
                C1034s0 c1034s0 = (C1034s0) ((C1047w1) c1050x1Z.f17933d).f17918A;
                w wVar = c1034s0.f17861D;
                String str = (String) wVar.f11335b;
                ArrayList<String> arrayList3 = new ArrayList();
                File fileStreamPath = AbstractC0998i1.f17749c.getFileStreamPath(".FlurrySenderIndex.info.".concat(String.valueOf(str)));
                fileStreamPath.exists();
                if (!fileStreamPath.exists()) {
                    List list = (List) new k(AbstractC0998i1.f17749c.getFileStreamPath(w.z((String) wVar.f11335b)), str, 1, new e()).e();
                    if (list == null) {
                        AbstractC0997i0.o(4, "New main file also not found. returning..");
                    } else {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(((C1031r0) it3.next()).f17847a);
                        }
                    }
                    c1034s0.d(new C1008l(c1034s0, 4));
                    ((A1) ((p096n1.e) ((x0) c1050x1Z.f17931b).f613b).f15314b).h(null);
                    c1047w1 = (C1047w1) c1050x1Z.f17932c;
                    fileArrListFiles = new File(AbstractC1006k1.h()).listFiles();
                    if (fileArrListFiles != null) {
                        i7 = 0;
                        while (i7 < fileArrListFiles.length) {
                            if (fileArrListFiles[i7].isFile() || fileArrListFiles[i7].isDirectory()) {
                                fileArrListFiles[i7].getName();
                            }
                            i7++;
                        }
                    }
                    System.out.println();
                    int length = fileArrListFiles.length;
                    listAsList = Arrays.asList(fileArrListFiles);
                    c1047w1.getClass();
                    if (listAsList != null && listAsList.size() != 0) {
                        c1047w1.d(new b(22, c1047w1, listAsList));
                    }
                    c1047w1.d(new b(21, c1047w1, c1047w1));
                    synchronized (AbstractC0998i1.class) {
                        if (AbstractC0998i1.f17747a) {
                            try {
                                K0.a(Class.forName("com.flurry.android.bridge.FlurryBridgeModule"));
                                break;
                            } catch (ClassNotFoundException | NoClassDefFoundError unused) {
                            }
                            AbstractC0998i1.f17747a = true;
                        }
                    }
                    context = (Context) this.f10498b;
                    linkedHashMap = K0.f17435b;
                    synchronized (linkedHashMap) {
                        ArrayList<J0> arrayList4 = new ArrayList(linkedHashMap.values());
                        ArrayList arrayList5 = K0.f17434a;
                        break;
                    }
                    for (J0 j3 : arrayList4) {
                        "registration ".concat(String.valueOf(j3));
                        try {
                            L0 l7 = (L0) j3.f17423a.newInstance();
                            l7.init(context);
                            K0.f17436c.put(j3.f17423a, l7);
                        } catch (Exception e7) {
                            Objects.toString(j3.f17423a);
                            Log.getStackTraceString(e7);
                        }
                    }
                    arrayList = (ArrayList) this.f10499c;
                    synchronized (AbstractC0998i1.class) {
                        try {
                            if (AbstractC0998i1.f17748b) {
                                if (arrayList != null) {
                                    it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        K0.b((L0) ((i) it.next()));
                                    }
                                }
                                AbstractC0998i1.f17748b = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    context2 = (Context) this.f10498b;
                    synchronized (AbstractC0998i1.class) {
                        K0.c(context2);
                    }
                    return;
                }
                ArrayList arrayListN = wVar.n(str);
                if (arrayListN != null && arrayListN.size() > 0) {
                    arrayList3.addAll(arrayListN);
                    for (String str2 : arrayList3) {
                        ArrayList<String> arrayListN2 = wVar.n(str2);
                        if (arrayListN2 == null) {
                            AbstractC0997i0.o(i10, "No old file to replace");
                        } else {
                            for (String str3 : arrayListN2) {
                                AbstractC0997i0.m();
                                Objects.toString(AbstractC0998i1.f17749c.getFileStreamPath(".flurrydatasenderblock.".concat(String.valueOf(str3))));
                                File fileStreamPath2 = AbstractC0998i1.f17749c.getFileStreamPath(".flurrydatasenderblock.".concat(String.valueOf(str3)));
                                if (fileStreamPath2.exists()) {
                                    try {
                                        dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath2));
                                        try {
                                            int unsignedShort = dataInputStream.readUnsignedShort();
                                            try {
                                                if (unsignedShort == 0) {
                                                    AbstractC0997i0.h(dataInputStream);
                                                    bArr = null;
                                                } else {
                                                    bArr = new byte[unsignedShort];
                                                    try {
                                                        dataInputStream.readFully(bArr);
                                                        dataInputStream.readUnsignedShort();
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        Log.getStackTraceString(th);
                                                    }
                                                    AbstractC0997i0.h(dataInputStream);
                                                }
                                                Log.getStackTraceString(th);
                                                AbstractC0997i0.h(dataInputStream);
                                            } catch (Throwable th3) {
                                                AbstractC0997i0.h(dataInputStream);
                                                throw th3;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            bArr = null;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        dataInputStream = null;
                                    }
                                } else {
                                    bArr = null;
                                }
                                if (bArr != null) {
                                    AbstractC0997i0.m();
                                    Objects.toString(AbstractC0998i1.f17749c.getFileStreamPath(".yflurrydatasenderblock.".concat(String.valueOf(str3))));
                                    C1029q0.a(str3).g(new C1029q0(bArr));
                                    AbstractC0997i0.m();
                                    Objects.toString(AbstractC0998i1.f17749c.getFileStreamPath(".flurrydatasenderblock.".concat(String.valueOf(str3))));
                                    File fileStreamPath3 = AbstractC0998i1.f17749c.getFileStreamPath(".flurrydatasenderblock.".concat(String.valueOf(str3)));
                                    if (fileStreamPath3.exists()) {
                                        fileStreamPath3.delete();
                                    }
                                }
                                break;
                            }
                            wVar.q(str2, ".YFlurrySenderIndex.info.", arrayListN2);
                            w.v(str2);
                        }
                        i10 = 4;
                    }
                }
                w.v(str);
                for (String str4 : arrayList3) {
                    synchronized (wVar) {
                        AbstractC0997i0.m();
                        Objects.toString(AbstractC0998i1.f17749c.getFileStreamPath(w.z(str4)));
                        List list2 = (List) new k(AbstractC0998i1.f17749c.getFileStreamPath(w.z(str4)), ".YFlurrySenderIndex.info.", 1, new p036e6.c(27)).e();
                        if (list2 == null) {
                            listEmptyList = Collections.emptyList();
                        } else {
                            ArrayList arrayList6 = new ArrayList();
                            Iterator it4 = list2.iterator();
                            while (it4.hasNext()) {
                                arrayList6.add(((C1031r0) it4.next()).f17847a);
                            }
                            listEmptyList = arrayList6;
                        }
                    }
                    if (listEmptyList != null && !listEmptyList.isEmpty()) {
                        ((LinkedHashMap) wVar.f11336c).put(str4, listEmptyList);
                    }
                }
                c1034s0.d(new C1008l(c1034s0, 4));
                ((A1) ((p096n1.e) ((x0) c1050x1Z.f17931b).f613b).f15314b).h(null);
                c1047w1 = (C1047w1) c1050x1Z.f17932c;
                fileArrListFiles = new File(AbstractC1006k1.h()).listFiles();
                if (fileArrListFiles != null) {
                    i7 = 0;
                    while (i7 < fileArrListFiles.length) {
                        if (fileArrListFiles[i7].isFile()) {
                            fileArrListFiles[i7].getName();
                        } else {
                            fileArrListFiles[i7].getName();
                        }
                        i7++;
                    }
                }
                System.out.println();
                int length2 = fileArrListFiles.length;
                listAsList = Arrays.asList(fileArrListFiles);
                c1047w1.getClass();
                if (listAsList != null) {
                    c1047w1.d(new b(22, c1047w1, listAsList));
                }
                c1047w1.d(new b(21, c1047w1, c1047w1));
                synchronized (AbstractC0998i1.class) {
                    if (AbstractC0998i1.f17747a) {
                        K0.a(Class.forName("com.flurry.android.bridge.FlurryBridgeModule"));
                        AbstractC0998i1.f17747a = true;
                    }
                    context = (Context) this.f10498b;
                    linkedHashMap = K0.f17435b;
                    synchronized (linkedHashMap) {
                        ArrayList<J0> arrayList7 = new ArrayList(linkedHashMap.values());
                        ArrayList arrayList8 = K0.f17434a;
                        while (r3.hasNext()) {
                            "registration ".concat(String.valueOf(j3));
                            L0 l8 = (L0) j3.f17423a.newInstance();
                            l8.init(context);
                            K0.f17436c.put(j3.f17423a, l8);
                        }
                        arrayList = (ArrayList) this.f10499c;
                        synchronized (AbstractC0998i1.class) {
                            if (AbstractC0998i1.f17748b) {
                                if (arrayList != null) {
                                    it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        K0.b((L0) ((i) it.next()));
                                    }
                                }
                                AbstractC0998i1.f17748b = true;
                            }
                            context2 = (Context) this.f10498b;
                            synchronized (AbstractC0998i1.class) {
                                K0.c(context2);
                                return;
                            }
                        }
                    }
                }
            case 3:
                I i11 = (I) this.f10498b;
                boolean z4 = i11.f17418a;
                C1039u c1039u = (C1039u) this.f10499c;
                C1042v c1042v = c1039u.f17881b;
                c1042v.f17893E = i11;
                c1042v.j();
                C1042v c1042v2 = c1039u.f17881b;
                K k7 = c1042v2.f17895G;
                C1039u c1039u2 = c1042v2.f17894F;
                k7.getClass();
                k7.d(new F2(k7, c1039u2, 1));
                return;
            case 4:
                B b7 = (B) this.f10499c;
                if (((K) b7.f17288b).f17432C == null) {
                    M m7 = (M) this.f10498b;
                    if (p136t.e.b(m7.f17453a, 1)) {
                        K k8 = (K) b7.f17288b;
                        k8.f17432C = m7.f17454b.getString("activity_name");
                        K.k(k8);
                        N n2 = k8.f17430A;
                        B b8 = k8.f17433D;
                        n2.getClass();
                        n2.d(new F2(n2, b8, 1));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                T t7 = (T) this.f10499c;
                Location locationJ = t7.j();
                if (locationJ != null) {
                    t7.f17541D = locationJ;
                }
                ((I2) this.f10498b).a(new S(t7.f17538A, t7.f17539B, t7.f17541D));
                return;
            case 6:
                Y y4 = (Y) this.f10499c;
                y4.getClass();
                TelephonyManager telephonyManager = (TelephonyManager) AbstractC0998i1.f17749c.getSystemService("phone");
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                String networkOperator = telephonyManager.getNetworkOperator();
                String simOperator = telephonyManager.getSimOperator();
                String simOperatorName = telephonyManager.getSimOperatorName();
                String string = "";
                if (Build.VERSION.SDK_INT >= 28) {
                    try {
                        CharSequence simCarrierIdName = telephonyManager.getSimCarrierIdName();
                        if (simCarrierIdName != null) {
                            string = simCarrierIdName.toString();
                        }
                        break;
                    } catch (NoSuchMethodError unused2) {
                    }
                }
                try {
                    int i12 = Build.VERSION.SDK_INT;
                    if (AbstractC0997i0.l("android.permission.READ_PHONE_STATE")) {
                        networkType = telephonyManager.getDataNetworkType();
                    } else if (i12 < 30) {
                        networkType = telephonyManager.getNetworkType();
                    }
                } catch (SecurityException unused3) {
                }
                String string2 = Integer.toString(networkType);
                SignalStrength signalStrength = (SignalStrength) this.f10498b;
                if (signalStrength == null) {
                    iJ = y4.f17615K;
                } else if (Build.VERSION.SDK_INT < 29) {
                    iJ = ((Integer) signalStrength.getClass().getMethod("getDbm", null).invoke(signalStrength, null)).intValue();
                    break;
                } else {
                    try {
                        Iterator it5 = signalStrength.getCellSignalStrengths().iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                try {
                                    iJ = ((Integer) signalStrength.getClass().getMethod("getDbm", null).invoke(signalStrength, null)).intValue();
                                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused4) {
                                    if (signalStrength.isGsm()) {
                                        iJ = Y.j(signalStrength, "getLteDbm", "rsrp", 9);
                                        if (iJ == Integer.MAX_VALUE && (((iJ = Y.j(signalStrength, "getTdScdmaDbm", "mTdscdma", 14)) > -25 || iJ == Integer.MAX_VALUE || (iJ < -49 && iJ < -73 && iJ < -97 && iJ < -110)) && (iJ = Y.j(signalStrength, "getWcdmaDbm", "mWcdma", 17)) == Integer.MAX_VALUE)) {
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
                                    iJ = evdoDbm;
                                }
                                break;
                            } else {
                                int dbm = ((CellSignalStrength) it5.next()).getDbm();
                                if (dbm != Integer.MAX_VALUE) {
                                    iJ = dbm;
                                }
                            }
                        }
                    } catch (NoSuchMethodError unused5) {
                    }
                }
                if (!TextUtils.equals(y4.f17609E, networkOperatorName) || !TextUtils.equals(y4.f17610F, networkOperator) || !TextUtils.equals(y4.f17611G, simOperator) || !TextUtils.equals(y4.f17612H, string) || !TextUtils.equals(y4.f17613I, simOperatorName) || !TextUtils.equals(y4.f17614J, string2) || y4.f17615K != iJ) {
                    y4.f17607C = true;
                    y4.f17609E = networkOperatorName;
                    y4.f17610F = networkOperator;
                    y4.f17611G = simOperator;
                    y4.f17612H = string;
                    y4.f17613I = simOperatorName;
                    y4.f17614J = string2;
                    y4.f17615K = iJ;
                }
                y4.d(new W(y4, i9));
                return;
            case 7:
                ((I2) this.f10498b).a((Z) this.f10499c);
                return;
            case 8:
                boolean zB = p136t.e.b(((C0977d0) this.f10498b).f17680e, 1);
                C1005k0 c1005k0 = (C1005k0) this.f10499c;
                C1001j0 c1001j0 = zB ? new C1001j0(true, (I) c1005k0.f17763b.f17662B) : new C1001j0(false, (I) c1005k0.f17763b.f17662B);
                C0973c0 c0973c0 = c1005k0.f17763b;
                int i13 = C0973c0.f17660C;
                c0973c0.h(c1001j0);
                return;
            case 9:
                ((C1005k0) this.f10499c).f17763b.f17662B = (I) this.f10498b;
                return;
            case 10:
                C1034s0 c1034s1 = (C1034s0) this.f10499c;
                if (c1034s1.f17859B != null) {
                    C1047w1.j(false);
                }
                c1034s1.f17860C.remove((String) this.f10498b);
                return;
            case 11:
                FlurryMessagingListener flurryMessagingListener = AbstractC1006k1.f17764a;
                FlurryMessage flurryMessage = (FlurryMessage) this.f10498b;
                if (flurryMessagingListener != null ? flurryMessagingListener.onNotificationClicked(flurryMessage) : false) {
                    return;
                }
                Context context3 = (Context) this.f10499c;
                PackageManager packageManager = context3.getPackageManager();
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(context3.getPackageName());
                String clickAction = flurryMessage.getClickAction();
                if (TextUtils.isEmpty(clickAction)) {
                    AbstractC0997i0.o(3, "No click action specified, opening default launcher intent.");
                } else {
                    Intent intent2 = new Intent(clickAction);
                    if (intent2.resolveActivity(packageManager) != null) {
                        intent = intent2;
                    } else {
                        Locale.getDefault();
                        AbstractC0997i0.q("The specified 'click_action'," + clickAction + ", does resolve to an intent'");
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
                C1047w1 c1047w2 = (C1047w1) this.f10499c;
                ((PriorityQueue) c1047w2.f17919z).addAll((ArrayList) this.f10498b);
                c1047w2.n();
                return;
            case 14:
                ((A1) this.f10499c).l((C2) this.f10498b);
                return;
            case 15:
                C2 c4 = (C2) this.f10498b;
                boolean zEquals = c4.a().equals(D2.ANALYTICS_EVENT);
                D2 d7 = D2.FLUSH_FRAME;
                E1 e8 = (E1) this.f10499c;
                if (zEquals) {
                    Z1 z7 = (Z1) c4.f17322c;
                    if (z7.f17631y) {
                        arrayList2 = new ArrayList();
                        HashMap map2 = (HashMap) e8.f17370F;
                        String str5 = z7.f17626c;
                        List arrayList9 = (List) map2.get(str5);
                        if (z7.f17632z) {
                            if (arrayList9 == null) {
                                arrayList9 = new ArrayList();
                            }
                            arrayList9.add(c4);
                            ((HashMap) e8.f17370F).put(str5, arrayList9);
                            arrayList2.add(c4);
                        } else if (arrayList9 == null || arrayList9.isEmpty()) {
                            E1.m(K1.f17443f, c4);
                        } else {
                            String str6 = z7.f17622A;
                            if (str6 != null) {
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= arrayList9.size()) {
                                        c3 = (C2) arrayList9.remove(0);
                                    } else if (str6.equals(((Z1) ((C2) arrayList9.get(i14)).f17322c).f17622A)) {
                                        c3 = (C2) arrayList9.remove(i14);
                                    } else {
                                        i14++;
                                    }
                                }
                            } else {
                                c3 = (C2) arrayList9.remove(0);
                            }
                            Z1 z8 = (Z1) c3.f17322c;
                            z7.f17627d = z8.f17627d;
                            z7.f17625D = z7.f17623B - z8.f17623B;
                            HashMap map3 = z8.f17629f;
                            if (map3 != null && (map = z7.f17629f) != null) {
                                String strN = AbstractC0997i0.n("fl.parameter.limit.exceeded");
                                HashMap map4 = z8.f17630x;
                                String str7 = (String) map4.get(strN);
                                HashMap map5 = z7.f17630x;
                                if (str7 != null) {
                                    map5.putAll(map4);
                                    map.clear();
                                } else {
                                    if (!map3.isEmpty()) {
                                        for (Map.Entry entry : map3.entrySet()) {
                                            if (!map.containsKey(entry.getKey())) {
                                                map.put((String) entry.getKey(), (String) entry.getValue());
                                            }
                                        }
                                    }
                                    if (map.size() > 10) {
                                        map5.put(AbstractC0997i0.n("fl.parameter.limit.exceeded.on.endevent"), AbstractC0997i0.n(String.valueOf(map.size())));
                                        map.clear();
                                        map.putAll(map3);
                                    }
                                }
                            }
                            arrayList2.add(c4);
                        }
                    } else if (c4.a().equals(d7) || !((r2) c4.f17322c).f17849d.equals("Session Finalized")) {
                        arrayList2 = new ArrayList();
                        arrayList2.add(c4);
                    } else {
                        e8.getClass();
                        arrayList2 = new ArrayList();
                        Iterator it6 = ((HashMap) e8.f17370F).entrySet().iterator();
                        while (it6.hasNext()) {
                            Iterator it7 = ((List) ((Map.Entry) it6.next()).getValue()).iterator();
                            while (it7.hasNext()) {
                                Z1 z9 = (Z1) ((C2) it7.next()).f17322c;
                                String str8 = z9.f17626c;
                                int i15 = z9.f17627d;
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                long j = jCurrentTimeMillis - z9.f17623B;
                                AtomicInteger atomicInteger = Y1.f17619e;
                                arrayList2.add(new Y1(new Z1(str8, i15, 2, z9.f17629f, z9.f17630x, true, false, z9.f17622A, jCurrentTimeMillis, SystemClock.elapsedRealtime(), j)));
                            }
                        }
                        arrayList2.add(c4);
                    }
                } else if (c4.a().equals(d7)) {
                    arrayList2 = new ArrayList();
                    arrayList2.add(c4);
                } else {
                    arrayList2 = new ArrayList();
                    arrayList2.add(c4);
                }
                for (C2 c7 : arrayList2) {
                    Iterator it8 = ((ArrayList) e8.f17369E).iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            c7.b();
                            e8.l(c7);
                        }
                        C1049x0 c1049x0A = ((K1) it8.next()).a(c7);
                        if (!p136t.e.b(c1049x0A.f17927b, 1)) {
                            E1.m(c1049x0A, c7);
                            Objects.toString(c7.a());
                            c7.b();
                            break;
                        } else {
                            C2 c8 = (C2) c1049x0A.f17928c;
                            if (c8 != null) {
                                e8.l(c8);
                            }
                        }
                        break;
                    }
                }
                if (c4.a().equals(d7) && ((r2) c4.f17322c).f17849d.equals("Session Finalized")) {
                    Iterator it9 = ((ArrayList) e8.f17369E).iterator();
                    while (it9.hasNext()) {
                        ((K1) it9.next()).a();
                    }
                    ((HashMap) e8.f17370F).clear();
                    return;
                }
                return;
            case 16:
                if ((C1047w1.f17917B != null) == false) {
                    B1 b9 = (B1) this.f10499c;
                    b9.getClass();
                    Object[] objArr = C1047w1.f17917B != null ? 1 : 0;
                    C1047w1 c1047w3 = b9.f17297G;
                    if (objArr != 0) {
                        c1047w3.m();
                    }
                    if (c1047w3.k(AbstractC1006k1.l(), "currentFile")) {
                        C1047w1 c1047w4 = ((B1) this.f10499c).f17297G;
                        long jI = AbstractC0998i1.i("frame.counter", 0L) + 1;
                        AbstractC0998i1.f("frame.counter", jI);
                        c1047w4.i(new R1(new s2(jI), i8), null);
                    }
                }
                if (((C2) this.f10498b).a().equals(D2.FLUSH_FRAME)) {
                    ((B1) this.f10499c).f17398A = 3;
                    ((C2) this.f10498b).b();
                    ((B1) this.f10499c).f17297G.i((C2) this.f10498b, new h(this));
                    return;
                }
                D2 d2A = ((C2) this.f10498b).a();
                Objects.toString(d2A);
                ((C2) this.f10498b).b();
                ((B1) this.f10499c).f17297G.i((C2) this.f10498b, null);
                if (d2A == D2.ANALYTICS_EVENT) {
                    if (((Z1) ((C2) this.f10498b).f17322c).f17628e != 7) {
                        ((B1) this.f10499c).f17296F = true;
                        return;
                    }
                    return;
                } else {
                    if (d2A == D2.ANALYTICS_ERROR || d2A == D2.USER_PROPERTY) {
                        ((B1) this.f10499c).f17296F = true;
                        return;
                    }
                    return;
                }
            case 17:
                D1 d8 = (D1) this.f10499c;
                C2 c9 = (C2) this.f10498b;
                D1.m(d8, c9);
                d8.l(c9);
                return;
            case 18:
                D1.m((D1) this.f10499c, (W1) this.f10498b);
                return;
            case 19:
                E1 e9 = (E1) this.f10499c;
                C2 c10 = (C2) this.f10498b;
                e9.l(c10);
                D2 d2A2 = c10.a();
                List arrayList10 = new ArrayList();
                if (((EnumMap) e9.f17369E).containsKey(d2A2)) {
                    ((EnumMap) e9.f17369E).put(d2A2, c10);
                }
                EnumMap enumMap = (EnumMap) e9.f17370F;
                if (enumMap.containsKey(d2A2)) {
                    if (enumMap.get(d2A2) != null) {
                        arrayList10 = (List) enumMap.get(d2A2);
                    }
                    arrayList10.add(c10);
                    enumMap.put(d2A2, arrayList10);
                }
                if (D2.FLUSH_FRAME.equals(c10.a())) {
                    Iterator it10 = ((EnumMap) e9.f17369E).entrySet().iterator();
                    while (it10.hasNext()) {
                        C2 c11 = (C2) ((Map.Entry) it10.next()).getValue();
                        if (c11 != null) {
                            e9.l(c11);
                        }
                    }
                    Iterator it11 = ((EnumMap) e9.f17370F).entrySet().iterator();
                    while (it11.hasNext()) {
                        List list3 = (List) ((Map.Entry) it11.next()).getValue();
                        if (list3 != null && list3.size() != 0) {
                            for (int i16 = 0; i16 < list3.size(); i16++) {
                                e9.l((C2) list3.get(i16));
                            }
                        }
                    }
                    return;
                }
                return;
            case 20:
                C1047w1 c1047w5 = (C1047w1) this.f10499c;
                ((ReentrantLock) c1047w5.f17918A).lock();
                try {
                    C1047w1.h(c1047w5, (W1) this.f10498b);
                    return;
                } finally {
                    ((ReentrantLock) c1047w5.f17918A).unlock();
                }
            case zzbbd.zzt.zzm /* 21 */:
                int i17 = Build.VERSION.SDK_INT;
                C1047w1 c1047w6 = (C1047w1) this.f10498b;
                C1047w1 c1047w7 = (C1047w1) this.f10499c;
                if (i17 >= 29) {
                    c1047w7.f17919z = new E2(new File(AbstractC1006k1.h()), c1047w6);
                } else {
                    String strH = AbstractC1006k1.h();
                    E2 e10 = new E2(strH);
                    e10.f17372b = strH;
                    e10.f17371a = c1047w6;
                    c1047w7.f17919z = e10;
                }
                ((E2) c1047w7.f17919z).startWatching();
                return;
            case 22:
                List<File> list4 = (List) this.f10498b;
                list4.size();
                ArrayList arrayList11 = new ArrayList();
                for (File file : list4) {
                    if (file.exists()) {
                        arrayList11.add(file.getAbsolutePath());
                    }
                }
                C1047w1 c1047w8 = (C1047w1) ((C1047w1) this.f10499c).f17918A;
                if (c1047w8 == null || arrayList11.size() == 0) {
                    return;
                }
                AbstractC0997i0.o(4, "Number of files being added:" + arrayList11.toString());
                c1047w8.d(new b(13, c1047w8, arrayList11));
                return;
            case 23:
                ((I2) this.f10498b).a(((b) this.f10499c).f10498b);
                return;
            case 24:
                G2 g3 = (G2) this.f10499c;
                Iterator it12 = g3.f17391z.iterator();
                while (it12.hasNext()) {
                    g3.d(new b(23, this, (I2) it12.next()));
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
