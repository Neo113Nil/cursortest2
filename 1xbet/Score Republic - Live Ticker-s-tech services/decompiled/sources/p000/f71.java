package p000;

import android.app.Notification;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.C0028a;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class f71 implements InterfaceC0350j8 {

    /* JADX INFO: renamed from: o */
    public static f71 f2330o;

    /* JADX INFO: renamed from: p */
    public static final u90 f2331p = new u90(7);

    /* JADX INFO: renamed from: q */
    public static final lf1 f2332q = new lf1(2);

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2333j;

    /* JADX INFO: renamed from: k */
    public Object f2334k;

    /* JADX INFO: renamed from: l */
    public Object f2335l;

    /* JADX INFO: renamed from: m */
    public Object f2336m;

    /* JADX INFO: renamed from: n */
    public Object f2337n;

    /* JADX WARN: Multi-variable type inference failed */
    public f71(ns0 ns0Var) {
        int i;
        int i2;
        this.f2333j = 11;
        this.f2337n = new Bundle();
        this.f2336m = ns0Var;
        Context context = ns0Var.f5510a;
        ArrayList arrayList = ns0Var.f5513d;
        this.f2334k = context;
        Notification.Builder builder = new Notification.Builder(context, ns0Var.f5526q);
        this.f2335l = builder;
        Notification notification = ns0Var.f5528s;
        Context context2 = null;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(ns0Var.f5514e).setContentText(ns0Var.f5515f).setContentInfo(null).setContentIntent(ns0Var.f5516g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(ns0Var.f5518i).setProgress(0, 0, false);
        IconCompat iconCompat = ns0Var.f5517h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.m393d(context));
        builder.setSubText(null).setUsesChronometer(false).setPriority(ns0Var.f5519j);
        ArrayList arrayList2 = ns0Var.f5511b;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            js0 js0Var = (js0) obj;
            if (js0Var.f4080b == null && (i2 = js0Var.f4083e) != 0) {
                js0Var.f4080b = IconCompat.m390a(i2);
            }
            IconCompat iconCompat2 = js0Var.f4080b;
            boolean z = js0Var.f4081c;
            Bundle bundle = js0Var.f4079a;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.m393d(context2) : context2, js0Var.f4084f, js0Var.f4085g);
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            builder2.setAllowGeneratedReplies(z);
            bundle2.putInt("android.support.action.semanticAction", 0);
            builder2.setSemanticAction(0);
            builder2.setContextual(false);
            if (Build.VERSION.SDK_INT >= 31) {
                AbstractC0038au.m483b(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", js0Var.f4082d);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.f2335l).addAction(builder2.build());
            context2 = null;
        }
        Bundle bundle3 = ns0Var.f5523n;
        if (bundle3 != null) {
            ((Bundle) this.f2337n).putAll(bundle3);
        }
        ((Notification.Builder) this.f2335l).setShowWhen(ns0Var.f5520k);
        ((Notification.Builder) this.f2335l).setLocalOnly(ns0Var.f5522m);
        ((Notification.Builder) this.f2335l).setGroup(null);
        ((Notification.Builder) this.f2335l).setSortKey(null);
        ((Notification.Builder) this.f2335l).setGroupSummary(false);
        ((Notification.Builder) this.f2335l).setCategory(null);
        ((Notification.Builder) this.f2335l).setColor(ns0Var.f5524o);
        ((Notification.Builder) this.f2335l).setVisibility(ns0Var.f5525p);
        ((Notification.Builder) this.f2335l).setPublicVersion(null);
        ((Notification.Builder) this.f2335l).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList3 = ns0Var.f5529t;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                ((Notification.Builder) this.f2335l).addPerson((String) obj2);
            }
        }
        if (arrayList.size() > 0) {
            if (ns0Var.f5523n == null) {
                ns0Var.f5523n = new Bundle();
            }
            Bundle bundle4 = ns0Var.f5523n.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                String string = Integer.toString(i5);
                js0 js0Var2 = (js0) arrayList.get(i5);
                Bundle bundle7 = new Bundle();
                if (js0Var2.f4080b == null && (i = js0Var2.f4083e) != 0) {
                    js0Var2.f4080b = IconCompat.m390a(i);
                }
                IconCompat iconCompat3 = js0Var2.f4080b;
                Bundle bundle8 = js0Var2.f4079a;
                bundle7.putInt("icon", iconCompat3 != null ? iconCompat3.m391b() : 0);
                bundle7.putCharSequence("title", js0Var2.f4084f);
                bundle7.putParcelable("actionIntent", js0Var2.f4085g);
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", js0Var2.f4081c);
                bundle7.putBundle("extras", bundle9);
                bundle7.putParcelableArray("remoteInputs", null);
                bundle7.putBoolean("showsUserInterface", js0Var2.f4082d);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(string, bundle7);
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (ns0Var.f5523n == null) {
                ns0Var.f5523n = new Bundle();
            }
            ns0Var.f5523n.putBundle("android.car.EXTENSIONS", bundle4);
            ((Bundle) this.f2337n).putBundle("android.car.EXTENSIONS", bundle5);
        }
        ((Notification.Builder) this.f2335l).setExtras(ns0Var.f5523n);
        ((Notification.Builder) this.f2335l).setRemoteInputHistory(null);
        ((Notification.Builder) this.f2335l).setBadgeIconType(0);
        ((Notification.Builder) this.f2335l).setSettingsText(null);
        ((Notification.Builder) this.f2335l).setShortcutId(null);
        ((Notification.Builder) this.f2335l).setTimeoutAfter(0L);
        ((Notification.Builder) this.f2335l).setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(ns0Var.f5526q)) {
            ((Notification.Builder) this.f2335l).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it = ns0Var.f5512c.iterator();
        if (it.hasNext()) {
            throw AbstractC0024an.m280c(it);
        }
        ((Notification.Builder) this.f2335l).setAllowSystemGeneratedContextualActions(ns0Var.f5527r);
        ((Notification.Builder) this.f2335l).setBubbleMetadata(null);
        if (Build.VERSION.SDK_INT >= 36) {
            AbstractC0565p1.m3840j((Notification.Builder) this.f2335l);
        }
    }

    /* JADX INFO: renamed from: o */
    public static synchronized f71 m1647o() {
        try {
            if (f2330o == null) {
                f2330o = new f71(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2330o;
    }

    /* JADX INFO: renamed from: A */
    public ht1 m1648A(dp1 dp1Var) {
        ht1 ht1VarM96t = ht1.f3330b;
        Iterator itM1281r = dp1Var.m1281r();
        while (itM1281r.hasNext()) {
            ht1VarM96t = ((a81) this.f2335l).m96t(this, dp1Var.m1283t(((Integer) itM1281r.next()).intValue()));
            if (ht1VarM96t instanceof nq1) {
                break;
            }
        }
        return ht1VarM96t;
    }

    /* JADX INFO: renamed from: B */
    public void m1649B(Bundle bundle) {
        fz1 fz1Var = (fz1) this.f2337n;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences sharedPreferencesM1908E = fz1Var.m1908E();
        f02 f02Var = (f02) fz1Var.f7192j;
        SharedPreferences.Editor editorEdit = sharedPreferencesM1908E.edit();
        int size = bundle2.size();
        String str = (String) this.f2334k;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        fs1.m1890a();
                        if (f02Var.f2245m.m770L(null, jx1.f4143P0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                ky1 ky1Var = f02Var.f2247o;
                                f02.m1560m(ky1Var);
                                ky1Var.f4600o.m5313b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                ky1 ky1Var2 = f02Var.f2247o;
                                f02.m1560m(ky1Var2);
                                ky1Var2.f4600o.m5313b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e) {
                        ky1 ky1Var3 = f02Var.f2247o;
                        f02.m1560m(ky1Var3);
                        ky1Var3.f4600o.m5313b(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f2336m = bundle2;
    }

    /* JADX INFO: renamed from: C */
    public f71 m1650C() {
        return new f71(this, (a81) this.f2335l);
    }

    /* JADX INFO: renamed from: D */
    public boolean m1651D(String str) {
        if (((HashMap) this.f2336m).containsKey(str)) {
            return true;
        }
        f71 f71Var = (f71) this.f2334k;
        if (f71Var != null) {
            return f71Var.m1651D(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public void m1652E(String str, ht1 ht1Var) {
        f71 f71Var;
        HashMap map = (HashMap) this.f2336m;
        if (!map.containsKey(str) && (f71Var = (f71) this.f2334k) != null && f71Var.m1651D(str)) {
            f71Var.m1652E(str, ht1Var);
        } else {
            if (((HashMap) this.f2337n).containsKey(str)) {
                return;
            }
            if (ht1Var == null) {
                map.remove(str);
            } else {
                map.put(str, ht1Var);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m1653F(String str, ht1 ht1Var) {
        if (((HashMap) this.f2337n).containsKey(str)) {
            return;
        }
        HashMap map = (HashMap) this.f2336m;
        if (ht1Var == null) {
            map.remove(str);
        } else {
            map.put(str, ht1Var);
        }
    }

    /* JADX INFO: renamed from: G */
    public ht1 m1654G(String str) {
        HashMap map = (HashMap) this.f2336m;
        if (map.containsKey(str)) {
            return (ht1) map.get(str);
        }
        f71 f71Var = (f71) this.f2334k;
        if (f71Var != null) {
            return f71Var.m1654G(str);
        }
        throw new IllegalArgumentException(str + " is not defined");
    }

    /* JADX INFO: renamed from: a */
    public void m1655a(c50 c50Var) {
        if (((ArrayList) this.f2334k).contains(c50Var)) {
            C0042ay.m531h(c50Var, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.f2334k)) {
            ((ArrayList) this.f2334k).add(c50Var);
        }
        c50Var.f1137t = true;
    }

    /* JADX INFO: renamed from: b */
    public void m1656b(lr0 lr0Var) {
        if (((LinkedHashSet) this.f2337n).add(lr0Var)) {
            ((mr0) this.f2335l).m3426a(this, lr0Var, -1);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m1657c(au0 au0Var, int i) {
        if (i != 1 && i != 0) {
            C0270h1.m2186b(j11.m2773h("Unsupported priority value: ", i));
        } else if (((LinkedHashSet) this.f2337n).add(au0Var)) {
            ((mr0) this.f2335l).m3426a(this, au0Var, i);
        }
    }

    @Override // p000.InterfaceC0350j8
    public ListenableFuture call() {
        int i = this.f2333j;
        EnumC0113ct enumC0113ct = EnumC0113ct.f1449j;
        int i2 = 4;
        switch (i) {
            case 18:
                final e92 e92Var = (e92) this.f2334k;
                final int i3 = 0;
                final C0934z0 c0934z0M2996g = k70.m2996g((ListenableFuture) this.f2335l, new c92(e92Var, i3), enumC0113ct);
                final C0934z0 c0934z0M2996g2 = k70.m2996g(c0934z0M2996g, (n72) this.f2336m, (Executor) this.f2337n);
                InterfaceC0387k8 interfaceC0387k8 = new InterfaceC0387k8() { // from class: d92
                    @Override // p000.InterfaceC0387k8
                    public final ListenableFuture apply(Object obj) {
                        switch (i3) {
                            case 0:
                                e92 e92Var2 = (e92) e92Var;
                                C0934z0 c0934z0 = (C0934z0) c0934z0M2996g;
                                C0934z0 c0934z1 = (C0934z0) c0934z0M2996g2;
                                if (k70.m2991b(c0934z0).equals(k70.m2991b(c0934z1))) {
                                    return k70.m2993d(obj);
                                }
                                n72 n72Var = new n72(2, e92Var2, c0934z1);
                                int i4 = ja2.f3889a;
                                C0934z0 c0934z0M2996g3 = k70.m2996g(c0934z1, new n72(4, s92.m4509a(), n72Var), e92Var2.f2023d);
                                synchronized (e92Var2.f2027h) {
                                    break;
                                }
                                return c0934z0M2996g3;
                            default:
                                a92 a92Var = (a92) e92Var;
                                return a92Var.f98c.m1394a((n72) c0934z0M2996g, (Executor) c0934z0M2996g2);
                        }
                    }
                };
                int i4 = ja2.f3889a;
                return k70.m2996g(c0934z0M2996g2, new n72(i2, s92.m4509a(), interfaceC0387k8), enumC0113ct);
            default:
                final a92 a92Var = (a92) this.f2334k;
                final n72 n72Var = (n72) this.f2336m;
                final Executor executor = (Executor) this.f2337n;
                final int i5 = 1;
                InterfaceC0387k8 interfaceC0387k9 = new InterfaceC0387k8() { // from class: d92
                    @Override // p000.InterfaceC0387k8
                    public final ListenableFuture apply(Object obj) {
                        switch (i5) {
                            case 0:
                                e92 e92Var2 = (e92) a92Var;
                                C0934z0 c0934z0 = (C0934z0) n72Var;
                                C0934z0 c0934z1 = (C0934z0) executor;
                                if (k70.m2991b(c0934z0).equals(k70.m2991b(c0934z1))) {
                                    return k70.m2993d(obj);
                                }
                                n72 n72Var2 = new n72(2, e92Var2, c0934z1);
                                int i6 = ja2.f3889a;
                                C0934z0 c0934z0M2996g3 = k70.m2996g(c0934z1, new n72(4, s92.m4509a(), n72Var2), e92Var2.f2023d);
                                synchronized (e92Var2.f2027h) {
                                    break;
                                }
                                return c0934z0M2996g3;
                            default:
                                a92 a92Var2 = (a92) a92Var;
                                return a92Var2.f98c.m1394a((n72) n72Var, (Executor) executor);
                        }
                    }
                };
                int i6 = ja2.f3889a;
                return k70.m2996g((AbstractC0269h0) this.f2335l, new n72(i2, s92.m4509a(), interfaceC0387k9), enumC0113ct);
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized hq0 m1658d(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) this.f2334k;
            int size = arrayList2.size();
            boolean z = false;
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                uq0 uq0Var = (uq0) obj;
                if (((HashSet) this.f2336m).contains(uq0Var)) {
                    z = true;
                } else if (uq0Var.f7886a.isAssignableFrom(cls) && uq0Var.f7887b.isAssignableFrom(cls2)) {
                    ((HashSet) this.f2336m).add(uq0Var);
                    arrayList.add(uq0Var.f7888c.mo167t(this));
                    ((HashSet) this.f2336m).remove(uq0Var);
                }
            }
            if (arrayList.size() > 1) {
                u90 u90Var = (u90) this.f2335l;
                qd0 qd0Var = (qd0) this.f2337n;
                u90Var.getClass();
                return new C0314i8(2, arrayList, qd0Var);
            }
            if (arrayList.size() == 1) {
                return (hq0) arrayList.get(0);
            }
            if (z) {
                return f2332q;
            }
            throw new o01("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            ((HashSet) this.f2336m).clear();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public synchronized ArrayList m1659e(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) this.f2334k;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                uq0 uq0Var = (uq0) obj;
                if (!((HashSet) this.f2336m).contains(uq0Var) && uq0Var.f7886a.isAssignableFrom(cls)) {
                    ((HashSet) this.f2336m).add(uq0Var);
                    arrayList.add(uq0Var.f7888c.mo167t(this));
                    ((HashSet) this.f2336m).remove(uq0Var);
                }
            }
        } catch (Throwable th) {
            ((HashSet) this.f2336m).clear();
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public void m1660f(lr0 lr0Var, jr0 jr0Var) {
        mr0 mr0Var = (mr0) this.f2335l;
        mr0Var.getClass();
        if (mr0Var.f5142g != 0) {
            return;
        }
        bu0 bu0VarM3428c = mr0Var.m3428c(-1);
        mr0Var.f5141f = bu0VarM3428c;
        mr0Var.f5142g = -1;
        mr0Var.f5143h = lr0Var;
        if (jr0Var != null) {
            if (bu0VarM3428c != null) {
                l50 l50Var = bu0VarM3428c.f990d;
                new C0685sa(jr0Var);
                switch (l50Var.f4682d) {
                    case 0:
                        t50 t50Var = (t50) l50Var.f4683e;
                        if (t50.m4691J(3)) {
                            Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + t50Var);
                        }
                        t50Var.m4744x();
                        t50Var.m4745y(new s50(t50Var), false);
                        break;
                }
            }
            da1 da1Var = mr0Var.f5136a;
            or0 or0Var = new or0(jr0Var);
            da1Var.getClass();
            da1Var.m1143m0(null, or0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m1661g(AbstractC0882xm abstractC0882xm) {
        C0958zo c0958zo;
        C0329io c0329io;
        C0848wp c0848wp = (C0848wp) this.f2337n;
        if (abstractC0882xm instanceof C0958zo) {
            c0958zo = (C0958zo) abstractC0882xm;
            int i = c0958zo.f9878p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0958zo.f9878p = i - Integer.MIN_VALUE;
            } else {
                c0958zo = new C0958zo(this, abstractC0882xm);
            }
        } else {
            c0958zo = new C0958zo(this, abstractC0882xm);
        }
        Object objM5404g = c0958zo.f9876n;
        int i2 = c0958zo.f9878p;
        if (i2 == 0) {
            wo1.m5395v(objM5404g);
            List list = (List) this.f2336m;
            EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
            if (list == null || list.isEmpty()) {
                c0958zo.f9875m = this;
                c0958zo.f9878p = 1;
                objM5404g = C0848wp.m5404g(c0848wp, false, c0958zo);
            } else {
                g81 g81VarM5405h = c0848wp.m5405h();
                C0109cp c0109cp = new C0109cp(c0848wp, this, null);
                c0958zo.f9875m = this;
                c0958zo.f9878p = 2;
                objM5404g = g81VarM5405h.m1997b(c0109cp, c0958zo);
            }
            return enumC0513nn;
        }
        if (i2 == 1) {
            this = c0958zo.f9875m;
            wo1.m5395v(objM5404g);
            c0329io = (C0329io) objM5404g;
        } else {
            if (i2 != 2) {
                C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = c0958zo.f9875m;
            wo1.m5395v(objM5404g);
            c0329io = (C0329io) objM5404g;
        }
        ((C0848wp) this.f2337n).f8613q.m3593q(c0329io);
        return kf1.f4365a;
    }

    /* JADX INFO: renamed from: h */
    public c50 m1662h(String str) {
        C0028a c0028a = (C0028a) ((HashMap) this.f2335l).get(str);
        if (c0028a != null) {
            return c0028a.f537c;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public c50 m1663i(String str) {
        for (C0028a c0028a : ((HashMap) this.f2335l).values()) {
            if (c0028a != null) {
                c50 c50VarM1663i = c0028a.f537c;
                if (!str.equals(c50VarM1663i.f1131n)) {
                    c50VarM1663i = c50VarM1663i.f1101E.f7299c.m1663i(str);
                }
                if (c50VarM1663i != null) {
                    return c50VarM1663i;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public rb1 m1664j(AbstractC0751u2 abstractC0751u2) {
        ArrayList arrayList = (ArrayList) this.f2336m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            rb1 rb1Var = (rb1) arrayList.get(i);
            if (rb1Var != null && rb1Var.f6800b == abstractC0751u2) {
                return rb1Var;
            }
        }
        rb1 rb1Var2 = new rb1((Context) this.f2335l, abstractC0751u2);
        arrayList.add(rb1Var2);
        return rb1Var2;
    }

    /* JADX INFO: renamed from: k */
    public ArrayList m1665k() {
        ArrayList arrayList = new ArrayList();
        for (C0028a c0028a : ((HashMap) this.f2335l).values()) {
            if (c0028a != null) {
                arrayList.add(c0028a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public ArrayList m1666l() {
        ArrayList arrayList = new ArrayList();
        for (C0028a c0028a : ((HashMap) this.f2335l).values()) {
            if (c0028a != null) {
                arrayList.add(c0028a.f537c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public synchronized ArrayList m1667m(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.f2334k;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            uq0 uq0Var = (uq0) obj;
            if (!arrayList.contains(uq0Var.f7887b) && uq0Var.f7886a.isAssignableFrom(cls)) {
                arrayList.add(uq0Var.f7887b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public List m1668n() {
        ArrayList arrayList;
        if (((ArrayList) this.f2334k).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f2334k)) {
            arrayList = new ArrayList((ArrayList) this.f2334k);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public boolean m1669p(Context context) {
        if (((Boolean) this.f2336m) == null) {
            this.f2336m = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f2335l).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f2336m).booleanValue();
    }

    /* JADX INFO: renamed from: q */
    public boolean m1670q(Context context) {
        if (((Boolean) this.f2335l) == null) {
            this.f2335l = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f2335l).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f2335l).booleanValue();
    }

    /* JADX INFO: renamed from: r */
    public void m1671r(C0028a c0028a) {
        c50 c50Var = c0028a.f537c;
        String str = c50Var.f1131n;
        HashMap map = (HashMap) this.f2335l;
        if (map.get(str) != null) {
            return;
        }
        map.put(c50Var.f1131n, c0028a);
        if (t50.m4691J(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + c50Var);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m1672s(C0028a c0028a) {
        HashMap map = (HashMap) this.f2335l;
        c50 c50Var = c0028a.f537c;
        if (c50Var.f1108L) {
            ((v50) this.f2337n).m5076f(c50Var);
        }
        if (map.get(c50Var.f1131n) == c0028a && ((C0028a) map.put(c50Var.f1131n, null)) != null && t50.m4691J(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + c50Var);
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m1673t(AbstractC0751u2 abstractC0751u2, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f2334k).onActionItemClicked(m1664j(abstractC0751u2), new vn0((Context) this.f2335l, (wb1) menuItem));
    }

    /* JADX INFO: renamed from: u */
    public boolean m1674u(AbstractC0751u2 abstractC0751u2, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f2334k;
        rb1 rb1VarM1664j = m1664j(abstractC0751u2);
        w71 w71Var = (w71) this.f2337n;
        Menu ho0Var = (Menu) w71Var.get(menu);
        if (ho0Var == null) {
            ho0Var = new ho0((Context) this.f2335l, (on0) menu);
            w71Var.put(menu, ho0Var);
        }
        return callback.onCreateActionMode(rb1VarM1664j, ho0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: v */
    public Object m1675v(AbstractC0882xm abstractC0882xm) throws Throwable {
        z31 z31Var;
        br0 br0Var;
        Throwable th;
        br0 br0Var2;
        f71 f71Var;
        if (abstractC0882xm instanceof z31) {
            z31Var = (z31) abstractC0882xm;
            int i = z31Var.f9596q;
            if ((i & Integer.MIN_VALUE) != 0) {
                z31Var.f9596q = i - Integer.MIN_VALUE;
            } else {
                z31Var = new z31(this, abstractC0882xm);
            }
        } else {
            z31Var = new z31(this, abstractC0882xm);
        }
        Object obj = z31Var.f9594o;
        int i2 = z31Var.f9596q;
        kf1 kf1Var = kf1.f4365a;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        try {
            if (i2 == 0) {
                wo1.m5395v(obj);
                if (!(((C0324ij) this.f2335l).m2605E() instanceof md0)) {
                    return kf1Var;
                }
                br0Var = (br0) this.f2334k;
                z31Var.f9592m = this;
                z31Var.f9593n = br0Var;
                z31Var.f9596q = 1;
                if (br0Var.m745d(z31Var) != enumC0513nn) {
                }
                return enumC0513nn;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                br0Var2 = z31Var.f9593n;
                f71Var = z31Var.f9592m;
                try {
                    wo1.m5395v(obj);
                    ((C0324ij) f71Var.f2335l).m2611K(kf1Var);
                    br0Var2.m748g(null);
                    return kf1Var;
                } catch (Throwable th2) {
                    th = th2;
                    br0Var2.m748g(null);
                    throw th;
                }
            }
            br0 br0Var3 = z31Var.f9593n;
            f71 f71Var2 = z31Var.f9592m;
            wo1.m5395v(obj);
            br0Var = br0Var3;
            this = f71Var2;
            if (!(((C0324ij) this.f2335l).m2605E() instanceof md0)) {
                br0Var.m748g(null);
                return kf1Var;
            }
            z31Var.f9592m = this;
            z31Var.f9593n = br0Var;
            z31Var.f9596q = 2;
            if (this.m1661g(z31Var) != enumC0513nn) {
                f71Var = this;
                br0Var2 = br0Var;
                ((C0324ij) f71Var.f2335l).m2611K(kf1Var);
                br0Var2.m748g(null);
                return kf1Var;
            }
            return enumC0513nn;
        } catch (Throwable th3) {
            br0 br0Var4 = br0Var;
            th = th3;
            br0Var2 = br0Var4;
            br0Var2.m748g(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: w */
    public Bundle m1676w(Bundle bundle, String str) {
        HashMap map = (HashMap) this.f2336m;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fe A[Catch: NumberFormatException | JSONException -> 0x010b, NumberFormatException | JSONException -> 0x010b, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x010b, blocks: (B:10:0x0031, B:24:0x0065, B:24:0x0065, B:26:0x0072, B:26:0x0072, B:28:0x0084, B:28:0x0084, B:29:0x008d, B:29:0x008d, B:51:0x00fe, B:51:0x00fe, B:33:0x009a, B:33:0x009a, B:35:0x00a7, B:35:0x00a7, B:37:0x00b9, B:37:0x00b9, B:38:0x00c2, B:38:0x00c2, B:42:0x00ce, B:42:0x00ce, B:46:0x00de, B:46:0x00de, B:50:0x00f2, B:50:0x00f2), top: B:63:0x0031, outer: #1 }] */
    /* JADX INFO: renamed from: x */
    public Bundle m1677x() {
        fz1 fz1Var = (fz1) this.f2337n;
        if (((Bundle) this.f2336m) == null) {
            String str = (String) this.f2334k;
            SharedPreferences sharedPreferencesM1908E = fz1Var.m1908E();
            f02 f02Var = (f02) fz1Var.f7192j;
            String string = sharedPreferencesM1908E.getString(str, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                fs1.m1890a();
                                                if (f02Var.f2245m.m770L(null, jx1.f4143P0)) {
                                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                    int length = jSONArray2.length();
                                                    long[] jArr = new long[length];
                                                    for (int i2 = 0; i2 < length; i2++) {
                                                        jArr[i2] = jSONArray2.optLong(i2);
                                                    }
                                                    bundle.putLongArray(string2, jArr);
                                                }
                                            } else {
                                                ky1 ky1Var = f02Var.f2247o;
                                                f02.m1560m(ky1Var);
                                                ky1Var.f4600o.m5313b(string3, "Unrecognized persisted bundle type. Type");
                                            }
                                        } else if (string3.equals("ia")) {
                                            fs1.m1890a();
                                            if (f02Var.f2245m.m770L(null, jx1.f4143P0)) {
                                                JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                                int length2 = jSONArray3.length();
                                                int[] iArr = new int[length2];
                                                for (int i3 = 0; i3 < length2; i3++) {
                                                    iArr[i3] = jSONArray3.optInt(i3);
                                                }
                                                bundle.putIntArray(string2, iArr);
                                            }
                                        } else {
                                            ky1 ky1Var2 = f02Var.f2247o;
                                            f02.m1560m(ky1Var2);
                                            ky1Var2.f4600o.m5313b(string3, "Unrecognized persisted bundle type. Type");
                                        }
                                    } else if (string3.equals("s")) {
                                        bundle.putString(string2, jSONObject.getString("v"));
                                    } else {
                                        ky1 ky1Var3 = f02Var.f2247o;
                                        f02.m1560m(ky1Var3);
                                        ky1Var3.f4600o.m5313b(string3, "Unrecognized persisted bundle type. Type");
                                    }
                                } else if (string3.equals("l")) {
                                    bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                } else {
                                    ky1 ky1Var4 = f02Var.f2247o;
                                    f02.m1560m(ky1Var4);
                                    ky1Var4.f4600o.m5313b(string3, "Unrecognized persisted bundle type. Type");
                                }
                            } else if (string3.equals("d")) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else {
                                ky1 ky1Var5 = f02Var.f2247o;
                                f02.m1560m(ky1Var5);
                                ky1Var5.f4600o.m5313b(string3, "Unrecognized persisted bundle type. Type");
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            ky1 ky1Var6 = f02Var.f2247o;
                            f02.m1560m(ky1Var6);
                            ky1Var6.f4600o.m5312a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f2336m = bundle;
                } catch (JSONException unused2) {
                    ky1 ky1Var7 = f02Var.f2247o;
                    f02.m1560m(ky1Var7);
                    ky1Var7.f4600o.m5312a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.f2336m) == null) {
                this.f2336m = (Bundle) this.f2335l;
            }
        }
        Bundle bundle2 = (Bundle) this.f2336m;
        p80.m3863h(bundle2);
        return new Bundle(bundle2);
    }

    /* JADX INFO: renamed from: y */
    public ht1 m1678y(f71 f71Var, c12... c12VarArr) {
        ht1 ht1VarM2788G = ht1.f3330b;
        for (c12 c12Var : c12VarArr) {
            ht1VarM2788G = j22.m2788G(c12Var);
            wo1.m5377H((f71) this.f2336m);
            if ((ht1VarM2788G instanceof it1) || (ht1VarM2788G instanceof ft1)) {
                ht1VarM2788G = ((a81) this.f2334k).m96t(f71Var, ht1VarM2788G);
            }
        }
        return ht1VarM2788G;
    }

    /* JADX INFO: renamed from: z */
    public ht1 m1679z(ht1 ht1Var) {
        return ((a81) this.f2335l).m96t(this, ht1Var);
    }

    public f71(f71 f71Var, a81 a81Var) {
        this.f2333j = 16;
        this.f2336m = new HashMap();
        this.f2337n = new HashMap();
        this.f2334k = f71Var;
        this.f2335l = a81Var;
    }

    public f71(fz1 fz1Var, String str) {
        this.f2333j = 17;
        this.f2337n = fz1Var;
        p80.m3860e(str);
        this.f2334k = str;
        this.f2335l = new Bundle();
    }

    public f71(InterfaceC0476mn interfaceC0476mn, C0737tp c0737tp, C0662ro c0662ro) {
        this.f2333j = 12;
        this.f2334k = interfaceC0476mn;
        this.f2335l = c0662ro;
        this.f2336m = yd0.m5762a(Integer.MAX_VALUE, null, 6);
        this.f2337n = new nu1(8);
        ag0 ag0Var = (ag0) interfaceC0476mn.mo434b().mo1466j(wa0.f8474n);
        if (ag0Var != null) {
            ((ig0) ag0Var).m2609I(true, new lf0(new C0068bn(1, c0737tp, this)));
        }
    }

    public f71(qd0 qd0Var) {
        this.f2333j = 1;
        this.f2334k = new ArrayList();
        this.f2336m = new HashSet();
        this.f2337n = qd0Var;
        this.f2335l = f2331p;
    }

    public f71(ArrayList arrayList, hd1 hd1Var, nk0 nk0Var, ContentResolver contentResolver) {
        this.f2333j = 2;
        this.f2334k = hd1Var;
        this.f2335l = nk0Var;
        this.f2336m = contentResolver;
        this.f2337n = arrayList;
    }

    public f71(C0468mf c0468mf) {
        this.f2333j = 10;
        this.f2334k = c0468mf;
        this.f2335l = new mr0();
        new LinkedHashSet();
        this.f2336m = new LinkedHashSet();
        this.f2337n = new LinkedHashSet();
    }

    public /* synthetic */ f71(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f2333j = i;
        this.f2334k = obj;
        this.f2335l = obj2;
        this.f2336m = obj3;
        this.f2337n = obj4;
    }

    public f71(Typeface typeface, rp0 rp0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f2333j = 9;
        this.f2337n = typeface;
        this.f2334k = rp0Var;
        this.f2336m = new sp0(1024);
        int iM3375a = rp0Var.m3375a(6);
        if (iM3375a != 0) {
            int i5 = iM3375a + rp0Var.f5023a;
            i = rp0Var.f5024b.getInt(rp0Var.f5024b.getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.f2335l = new char[i * 2];
        int iM3375a2 = rp0Var.m3375a(6);
        if (iM3375a2 != 0) {
            int i6 = iM3375a2 + rp0Var.f5023a;
            i2 = rp0Var.f5024b.getInt(rp0Var.f5024b.getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            af1 af1Var = new af1(this, i7);
            qp0 qp0VarM202b = af1Var.m202b();
            int iM3375a3 = qp0VarM202b.m3375a(4);
            Character.toChars(iM3375a3 != 0 ? qp0VarM202b.f5024b.getInt(iM3375a3 + qp0VarM202b.f5023a) : 0, (char[]) this.f2335l, i7 * 2);
            qp0 qp0VarM202b2 = af1Var.m202b();
            int iM3375a4 = qp0VarM202b2.m3375a(16);
            if (iM3375a4 != 0) {
                int i8 = iM3375a4 + qp0VarM202b2.f5023a;
                i3 = qp0VarM202b2.f5024b.getInt(qp0VarM202b2.f5024b.getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (i3 > 0) {
                sp0 sp0Var = (sp0) this.f2336m;
                qp0 qp0VarM202b3 = af1Var.m202b();
                int iM3375a5 = qp0VarM202b3.m3375a(16);
                if (iM3375a5 != 0) {
                    int i9 = iM3375a5 + qp0VarM202b3.f5023a;
                    i4 = qp0VarM202b3.f5024b.getInt(qp0VarM202b3.f5024b.getInt(i9) + i9);
                } else {
                    i4 = 0;
                }
                sp0Var.m4574a(af1Var, 0, i4 - 1);
            } else {
                C0270h1.m2190f("invalid metadata codepoint length");
                throw null;
            }
        }
    }

    public f71(C0312i6 c0312i6, cl0 cl0Var) {
        this.f2333j = 3;
        this.f2337n = c0312i6;
        this.f2334k = cl0Var;
        oj0 oj0Var = (oj0) c0312i6.f3447k;
        String str = (String) c0312i6.f3448l;
        nj0 nj0VarM3694b = oj0Var.m3694b(str);
        this.f2336m = nj0VarM3694b;
        if (nj0VarM3694b != null) {
            this.f2335l = nj0VarM3694b.mo1103b(cl0Var);
        } else {
            C0270h1.m2191g(AbstractC0024an.m284g("Could not find policy '", str, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
            throw null;
        }
    }

    public f71(int i) {
        this.f2333j = i;
        switch (i) {
            case 4:
                nc1 nc1Var = nc1.f5376o;
                this.f2335l = p80.m3867l();
                this.f2336m = p80.m3867l();
                this.f2337n = p80.m3867l();
                this.f2334k = nc1Var;
                break;
            case 5:
                break;
            case 7:
                this.f2334k = new ArrayList();
                this.f2335l = new HashMap();
                this.f2336m = new HashMap();
                break;
            case 15:
                a81 a81Var = new a81(10);
                this.f2334k = a81Var;
                f71 f71Var = new f71((f71) null, a81Var);
                this.f2336m = f71Var;
                this.f2335l = f71Var.m1650C();
                C0884xo c0884xo = new C0884xo(3);
                this.f2337n = c0884xo;
                f71Var.m1652E("require", new u92(c0884xo));
                c0884xo.f9009a.put("internal.platform", k51.f4288k);
                f71Var.m1652E("runtime.counter", new gr1(Double.valueOf(0.0d)));
                break;
            default:
                this.f2334k = null;
                this.f2335l = null;
                this.f2336m = null;
                this.f2337n = new ArrayDeque();
                break;
        }
    }

    public f71(Context context, ActionMode.Callback callback) {
        this.f2333j = 13;
        this.f2335l = context;
        this.f2334k = callback;
        this.f2336m = new ArrayList();
        this.f2337n = new w71(0);
    }

    public f71(C0848wp c0848wp, List list) {
        this.f2333j = 6;
        this.f2337n = c0848wp;
        this.f2334k = new br0();
        C0324ij c0324ij = new C0324ij(true);
        c0324ij.m2608H(null);
        this.f2335l = c0324ij;
        this.f2336m = AbstractC0471mi.m3389w(list);
    }

    public f71(jl0 jl0Var) {
        this.f2333j = 8;
        this.f2337n = jl0Var;
        this.f2334k = new Object();
        this.f2335l = new HashSet();
    }
}
