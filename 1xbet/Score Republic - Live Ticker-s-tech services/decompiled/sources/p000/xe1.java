package p000;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.SavedStateHandleAttacher;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xe1 {

    /* JADX INFO: renamed from: a */
    public static final g72 f8935a = new g72("CLOSED_EMPTY", 3);

    /* JADX INFO: renamed from: b */
    public static final aa0 f8936b = new aa0(13);

    /* JADX INFO: renamed from: c */
    public static final x80 f8937c = new x80(14);

    /* JADX INFO: renamed from: d */
    public static final u90 f8938d = new u90(13);

    /* JADX INFO: renamed from: a */
    public static void m5634a(int i, Object obj) {
        int iMo667b;
        if (obj != null) {
            if (obj instanceof w60) {
                if (obj instanceof f70) {
                    iMo667b = ((f70) obj).mo667b();
                } else if (obj instanceof f60) {
                    iMo667b = 0;
                } else if (obj instanceof h60) {
                    iMo667b = 1;
                } else if (obj instanceof v60) {
                    iMo667b = 2;
                } else {
                    iMo667b = obj instanceof x60 ? 3 : -1;
                }
                if (iMo667b == i) {
                    return;
                }
            }
            m5644p(obj, "kotlin.jvm.functions.Function" + i);
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m5635c(Context context, String str) {
        if (str == null) {
            C0270h1.m2192h("permission must be non-null");
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new qs0(context).f6584a.areNotificationsEnabled() ? 0 : -1;
    }

    /* JADX INFO: renamed from: d */
    public static final void m5636d(x41 x41Var) {
        w41 w41Var;
        String str;
        qh0 qh0Var = x41Var.mo862d().f551c;
        if (qh0Var != qh0.f6498k && qh0Var != qh0.f6499l) {
            C0270h1.m2190f("Failed requirement.");
            return;
        }
        Iterator it = ((p41) x41Var.mo859a().f1095f).iterator();
        do {
            l41 l41Var = (l41) it;
            if (!l41Var.hasNext()) {
                w41Var = null;
                break;
            }
            Map.Entry entry = (Map.Entry) l41Var.next();
            entry.getClass();
            str = (String) entry.getKey();
            w41Var = (w41) entry.getValue();
        } while (!af0.m187a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        if (w41Var == null) {
            t41 t41Var = new t41(x41Var.mo859a(), (hi1) x41Var);
            x41Var.mo859a().m851e("androidx.lifecycle.internal.SavedStateHandlesProvider", t41Var);
            x41Var.mo862d().m437a(new SavedStateHandleAttacher(t41Var));
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m5637e(C0799vd c0799vd) {
        StringBuilder sb = new StringBuilder(c0799vd.size());
        for (int i = 0; i < c0799vd.size(); i++) {
            byte bMo4338b = c0799vd.mo4338b(i);
            if (bMo4338b == 34) {
                sb.append("\\\"");
            } else if (bMo4338b == 39) {
                sb.append("\\'");
            } else if (bMo4338b != 92) {
                switch (bMo4338b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        sb.append("\\v");
                        break;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        sb.append("\\f");
                        break;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo4338b < 32 || bMo4338b > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo4338b >>> 6) & 3) + 48));
                            sb.append((char) (((bMo4338b >>> 3) & 7) + 48));
                            sb.append((char) ((bMo4338b & 7) + 48));
                        } else {
                            sb.append((char) bMo4338b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public static Set m5638f() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX INFO: renamed from: g */
    public static Object m5639g(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException();
        }
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: h */
    public static final u41 m5640h(hi1 hi1Var) {
        ArrayList arrayList = new ArrayList();
        l01.f4622a.getClass();
        arrayList.add(new ei1(u41.class));
        ei1[] ei1VarArr = (ei1[]) arrayList.toArray(new ei1[0]);
        return (u41) new oq0(hi1Var.mo861c(), new nu1(25, (ei1[]) Arrays.copyOf(ei1VarArr, ei1VarArr.length)), hi1Var instanceof oa0 ? ((oa0) hi1Var).mo860b() : C0772un.f7861k).m3733c(u41.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    /* JADX INFO: renamed from: j */
    public static void m5641j(final Context context) {
        final boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (vk1.m5168d(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            z = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
        }
        final qc1 qc1Var = new qc1();
        new Runnable() { // from class: ty0
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                qc1 qc1Var2 = qc1Var;
                try {
                    if (!(Binder.getCallingUid() == context2.getApplicationInfo().uid)) {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context2.getPackageName());
                        return;
                    }
                    SharedPreferences.Editor editorEdit = vk1.m5168d(context2).edit();
                    editorEdit.putBoolean("proxy_notification_initialized", true);
                    editorEdit.apply();
                    NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                    if (z) {
                        notificationManager.setNotificationDelegate("com.google.android.gms");
                    } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                        notificationManager.setNotificationDelegate(null);
                    }
                } finally {
                    qc1Var2.m4063d(null);
                }
            }
        }.run();
    }

    /* JADX INFO: renamed from: k */
    public static rp0 m5642k(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            C0270h1.m2187c("Cannot read metadata.");
            return null;
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    rp0 rp0Var = new rp0();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    rp0Var.f5024b = byteBufferDuplicate;
                    rp0Var.f5023a = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    rp0Var.f5025c = i6;
                    rp0Var.f5026d = rp0Var.f5024b.getShort(i6);
                    return rp0Var;
                }
            }
        }
        C0270h1.m2187c("Cannot read metadata.");
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static void m5643l(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(broadcastReceiver, intentFilter, null, null, 2);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, null, null, 0);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m5644p(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        af0.m196k(classCastException, xe1.class.getName());
        throw classCastException;
    }

    /* JADX INFO: renamed from: q */
    public static int m5645q(int i) {
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo272b(String str, Throwable th);

    /* JADX INFO: renamed from: i */
    public abstract void mo660i();

    /* JADX INFO: renamed from: m */
    public abstract void mo661m();

    /* JADX INFO: renamed from: n */
    public abstract void mo662n(C0525nz c0525nz);

    /* JADX INFO: renamed from: o */
    public abstract void mo273o(d71 d71Var, np0 np0Var);
}
