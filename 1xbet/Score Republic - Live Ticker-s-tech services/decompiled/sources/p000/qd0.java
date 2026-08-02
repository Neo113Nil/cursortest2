package p000;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.core.graphics.drawable.IconCompat;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.C0107a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.lang.ref.ReferenceQueue;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.Adler32;
import live.football.scorerepublic.R;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class qd0 implements InterfaceC0581ph, h21, kw0 {

    /* JADX INFO: renamed from: n */
    public static volatile qd0 f6468n;

    /* JADX INFO: renamed from: o */
    public static final Object f6469o = new Object();

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f6470j;

    /* JADX INFO: renamed from: k */
    public Object f6471k;

    /* JADX INFO: renamed from: l */
    public Object f6472l;

    /* JADX INFO: renamed from: m */
    public Object f6473m;

    public qd0(f71 f71Var, o31 o31Var, C0442lq c0442lq, Set set) {
        this.f6470j = 16;
        this.f6471k = o31Var;
        this.f6472l = f71Var;
        this.f6473m = c0442lq;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m4085w(str, 0, str.length(), 1, true, new C0059be(str, 1));
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m4069m(Editable editable, KeyEvent keyEvent, boolean z) {
        bf1[] bf1VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (bf1VarArr = (bf1[]) editable.getSpans(selectionStart, selectionEnd, bf1.class)) != null && bf1VarArr.length > 0) {
                for (bf1 bf1Var : bf1VarArr) {
                    int spanStart = editable.getSpanStart(bf1Var);
                    int spanEnd = editable.getSpanEnd(bf1Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static qd0 m4070r(Context context) {
        if (f6468n == null) {
            synchronized (f6469o) {
                try {
                    if (f6468n == null) {
                        f6468n = new qd0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6468n;
    }

    /* JADX INFO: renamed from: C */
    public void m4071C(C0179em c0179em) {
        ArrayList arrayList = (ArrayList) this.f6471k;
        arrayList.clear();
        int size = c0179em.f2132p0.size();
        for (int i = 0; i < size; i++) {
            C0143dm c0143dm = (C0143dm) c0179em.f2132p0.get(i);
            int[] iArr = c0143dm.f1736o0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c0143dm);
            }
        }
        c0179em.f2134r0.f6236b = true;
    }

    @Override // p000.kw0
    /* JADX INFO: renamed from: a */
    public boolean mo1366a(Object obj) {
        if (obj instanceof InterfaceC0079bz) {
            ((InterfaceC0079bz) obj).mo266b().f2679a = true;
        }
        ((InterfaceC0119cz) this.f6472l).mo1049i(obj);
        return ((C0163e6) this.f6473m).mo1366a(obj);
    }

    @Override // p000.kw0
    /* JADX INFO: renamed from: b */
    public Object mo1367b() {
        Object objMo1367b = ((C0163e6) this.f6473m).mo1367b();
        if (objMo1367b == null) {
            objMo1367b = ((InterfaceC0043az) this.f6471k).mo155c();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objMo1367b.getClass());
            }
        }
        if (objMo1367b instanceof InterfaceC0079bz) {
            ((InterfaceC0079bz) objMo1367b).mo266b().f2679a = false;
        }
        return objMo1367b;
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m4072c(xg0 xg0Var, C0153dx c0153dx) {
        C0899y2 c0899y2 = (C0899y2) ((HashMap) this.f6471k).put(xg0Var, new C0899y2(xg0Var, c0153dx, (ReferenceQueue) this.f6472l));
        if (c0899y2 != null) {
            c0899y2.f9134c = null;
            c0899y2.clear();
        }
    }

    @Override // p000.InterfaceC0581ph
    /* JADX INFO: renamed from: d */
    public void mo1033d() {
        C0062bh c0062bh = (C0062bh) this.f6473m;
        vp0 vp0Var = (vp0) c0062bh.f860e.f8620l;
        vp0Var.getClass();
        if (vp0Var == vp0.f8244j || vp0Var == vp0.f8245k) {
            return;
        }
        nv0.m3597c();
        try {
            nv0.m3595a();
            nv0.m3596b();
            c0062bh.f861f.execute(new C0950zg(this));
            nv0.f5555a.getClass();
        } catch (Throwable th) {
            try {
                nv0.f5555a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public C0648ra m4073e() {
        String strConcat = ((String) this.f6471k) == null ? " backendName" : "";
        if (((dx0) this.f6473m) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new C0648ra((String) this.f6471k, (byte[]) this.f6472l, (dx0) this.f6473m);
        }
        C0270h1.m2191g("Missing required properties:".concat(strConcat));
        return null;
    }

    @Override // p000.InterfaceC0581ph
    /* JADX INFO: renamed from: f */
    public void mo1034f(np0 np0Var) {
        C0062bh c0062bh = (C0062bh) this.f6473m;
        nv0.m3597c();
        try {
            nv0.m3595a();
            nv0.m3596b();
            c0062bh.f861f.execute(new C0876xg(this, np0Var));
            nv0.f5555a.getClass();
        } catch (Throwable th) {
            try {
                nv0.f5555a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p000.InterfaceC0581ph
    /* JADX INFO: renamed from: g */
    public void mo1035g(ja1 ja1Var, EnumC0544oh enumC0544oh, np0 np0Var) {
        nv0.m3597c();
        try {
            nv0.m3595a();
            m4076k(ja1Var, np0Var);
            nv0.f5555a.getClass();
        } catch (Throwable th) {
            try {
                nv0.f5555a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m4074h() {
        Set hashSet;
        if (((b10) this.f6471k) == null || TextUtils.isEmpty((String) this.f6472l)) {
            return;
        }
        synchronized (((C0784uz) this.f6473m).f7971b) {
            try {
                if (((C0784uz) this.f6473m).f7971b.containsKey((String) this.f6472l)) {
                    hashSet = (Set) ((C0784uz) this.f6473m).f7971b.get((String) this.f6472l);
                } else {
                    hashSet = new HashSet();
                    ((C0784uz) this.f6473m).f7971b.put((String) this.f6472l, hashSet);
                }
                if (!hashSet.contains((b10) this.f6471k)) {
                    hashSet.add((b10) this.f6471k);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC0581ph
    /* JADX INFO: renamed from: i */
    public void mo1036i(an0 an0Var) {
        C0062bh c0062bh = (C0062bh) this.f6473m;
        nv0.m3597c();
        try {
            nv0.m3595a();
            nv0.m3596b();
            c0062bh.f861f.execute(new C0876xg(this, an0Var));
            nv0.f5555a.getClass();
        } catch (Throwable th) {
            try {
                nv0.f5555a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m4075j(C0899y2 c0899y2) {
        v11 v11Var;
        synchronized (this) {
            ((HashMap) this.f6471k).remove(c0899y2.f9132a);
            if (c0899y2.f9133b && (v11Var = c0899y2.f9134c) != null) {
                ((C0892xw) this.f6473m).m5696e(c0899y2.f9132a, new C0153dx(v11Var, true, false, c0899y2.f9132a, (C0892xw) this.f6473m));
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m4076k(ja1 ja1Var, np0 np0Var) {
        C0062bh c0062bh = (C0062bh) this.f6473m;
        C0885xp c0885xp = c0062bh.f867l.f1225a;
        c0062bh.f864i.getClass();
        if (c0885xp == null) {
            c0885xp = null;
        }
        if (ja1Var.f3886a == ia1.f3507m && c0885xp != null && c0885xp.m5686a()) {
            xd0 xd0Var = new xd0(0);
            c0062bh.f868m.mo1327s(xd0Var);
            ja1Var = ja1.f3878h.m2837b("ClientCall was cancelled at or after deadline. " + xd0Var);
            np0Var = new np0();
        }
        nv0.m3596b();
        c0062bh.f861f.execute(new C0913yg(this, ja1Var, np0Var));
    }

    /* JADX INFO: renamed from: l */
    public Bitmap m4077l(BitmapFactory.Options options) throws Throwable {
        switch (this.f6470j) {
            case 22:
                return AbstractC0528o1.m3612a(new C0355jd(AbstractC0429ld.m3211c((ByteBuffer) this.f6471k)), options, this);
            case 23:
                h01 h01Var = (h01) ((b90) this.f6471k).f793k;
                h01Var.reset();
                return AbstractC0528o1.m3612a(h01Var, options, this);
            default:
                FileDescriptor fileDescriptor = ((C0107a) this.f6473m).m985a().getFileDescriptor();
                int i = Build.VERSION.SDK_INT;
                Bitmap bitmapM3621j = null;
                if (i == 34) {
                    if (((i == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) ? ((Boolean) oa2.f5684a.get()).booleanValue() : false) && AbstractC0528o1.m3620i(this)) {
                        Bitmap.Config config = options.inPreferredConfig;
                        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                        o80.m3645f("", config == config2);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        try {
                            Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                            if (bitmapDecodeFileDescriptor == null) {
                                if (bitmapDecodeFileDescriptor != null) {
                                }
                                options.inPreferredConfig = config2;
                                return bitmapM3621j;
                            }
                            try {
                                bitmapM3621j = AbstractC0528o1.m3621j(bitmapDecodeFileDescriptor);
                            } catch (Throwable th) {
                                th = th;
                                bitmapM3621j = bitmapDecodeFileDescriptor;
                                if (bitmapM3621j != null) {
                                    bitmapM3621j.recycle();
                                }
                                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                                throw th;
                            }
                            break;
                            bitmapDecodeFileDescriptor.recycle();
                            options.inPreferredConfig = config2;
                            return bitmapM3621j;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m4078n(Bundle bundle) {
        HashSet hashSet = (HashSet) this.f6472l;
        String string = ((Context) this.f6473m).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (td0.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    m4079p((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new C0694sj(e);
            }
        }
    }

    @Override // p000.h21
    /* JADX INFO: renamed from: o */
    public v11 mo1764o(v11 v11Var, uu0 uu0Var) {
        Drawable drawable = (Drawable) v11Var.get();
        if (drawable instanceof BitmapDrawable) {
            C0678s3 c0678s3 = (C0678s3) this.f6472l;
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            return c0678s3.mo1764o(bitmap != null ? new C0354jc((InterfaceC0318ic) this.f6471k, bitmap) : null, uu0Var);
        }
        if (drawable instanceof b80) {
            return ((wa0) this.f6473m).mo1764o(v11Var, uu0Var);
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public Object m4079p(Class cls, HashSet hashSet) {
        Object objMo414b;
        HashMap map = (HashMap) this.f6471k;
        if (fe1.m1774a()) {
            try {
                wo1.m5378a(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objMo414b = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                td0 td0Var = (td0) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo413a = td0Var.mo413a();
                if (!listMo413a.isEmpty()) {
                    for (Class cls2 : listMo413a) {
                        if (!map.containsKey(cls2)) {
                            m4079p(cls2, hashSet);
                        }
                    }
                }
                objMo414b = td0Var.mo414b((Context) this.f6473m);
                hashSet.remove(cls);
                map.put(cls, objMo414b);
            } catch (Throwable th2) {
                throw new C0694sj(th2);
            }
        }
        Trace.endSection();
        return objMo414b;
    }

    /* JADX INFO: renamed from: q */
    public ImageHeaderParser$ImageType m4080q() throws Throwable {
        switch (this.f6470j) {
            case 22:
                return yd0.m5771j((List) this.f6472l, AbstractC0429ld.m3211c((ByteBuffer) this.f6471k));
            case 23:
                List list = (List) this.f6473m;
                h01 h01Var = (h01) ((b90) this.f6471k).f793k;
                h01Var.reset();
                return yd0.m5770i(list, h01Var, (nk0) this.f6472l);
            default:
                List list2 = (List) this.f6472l;
                C0107a c0107a = (C0107a) this.f6473m;
                nk0 nk0Var = (nk0) this.f6471k;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    fc0 fc0Var = (fc0) list2.get(i);
                    h01 h01Var2 = null;
                    try {
                        h01 h01Var3 = new h01(new FileInputStream(c0107a.m985a().getFileDescriptor()), nk0Var);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo1770f = fc0Var.mo1770f(h01Var3);
                            h01Var3.m2184e();
                            c0107a.m985a();
                            if (imageHeaderParser$ImageTypeMo1770f != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeMo1770f;
                            }
                        } catch (Throwable th) {
                            th = th;
                            h01Var2 = h01Var3;
                            if (h01Var2 != null) {
                                h01Var2.m2184e();
                            }
                            c0107a.m985a();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0262  */
    /* JADX WARN: Code duplicated, block: B:101:0x027f  */
    /* JADX WARN: Code duplicated, block: B:104:0x028d  */
    /* JADX WARN: Code duplicated, block: B:105:0x029b  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:113:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:116:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:119:0x02da  */
    /* JADX WARN: Code duplicated, block: B:120:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:123:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:129:0x0318  */
    /* JADX WARN: Code duplicated, block: B:133:0x0327  */
    /* JADX WARN: Code duplicated, block: B:137:0x0340  */
    /* JADX WARN: Code duplicated, block: B:138:0x0342  */
    /* JADX WARN: Code duplicated, block: B:140:0x0370  */
    /* JADX WARN: Code duplicated, block: B:146:0x039f  */
    /* JADX WARN: Code duplicated, block: B:151:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:153:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:156:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:159:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:160:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:166:0x0412  */
    /* JADX WARN: Code duplicated, block: B:169:0x0420  */
    /* JADX WARN: Code duplicated, block: B:170:0x0422  */
    /* JADX WARN: Code duplicated, block: B:176:0x044c  */
    /* JADX WARN: Code duplicated, block: B:179:0x045a  */
    /* JADX WARN: Code duplicated, block: B:180:0x045c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0462  */
    /* JADX WARN: Code duplicated, block: B:184:0x047b  */
    /* JADX WARN: Code duplicated, block: B:187:0x0487  */
    /* JADX WARN: Code duplicated, block: B:190:0x0498  */
    /* JADX WARN: Code duplicated, block: B:193:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:197:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:201:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:204:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:207:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:211:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:216:0x0520  */
    /* JADX WARN: Code duplicated, block: B:217:0x0522 A[Catch: ExecutionException -> 0x054a, TimeoutException -> 0x054c, InterruptedException -> 0x0555, TryCatch #8 {InterruptedException -> 0x0555, ExecutionException -> 0x054a, TimeoutException -> 0x054c, blocks: (B:214:0x050f, B:218:0x052a, B:222:0x053e, B:221:0x0536, B:217:0x0522), top: B:247:0x050f }] */
    /* JADX WARN: Code duplicated, block: B:220:0x0533  */
    /* JADX WARN: Code duplicated, block: B:221:0x0536 A[Catch: ExecutionException -> 0x054a, TimeoutException -> 0x054c, InterruptedException -> 0x0555, TryCatch #8 {InterruptedException -> 0x0555, ExecutionException -> 0x054a, TimeoutException -> 0x054c, blocks: (B:214:0x050f, B:218:0x052a, B:222:0x053e, B:221:0x0536, B:217:0x0522), top: B:247:0x050f }] */
    /* JADX WARN: Code duplicated, block: B:231:0x0581  */
    /* JADX WARN: Code duplicated, block: B:241:0x03a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x0380 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x050f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    /* JADX WARN: Code duplicated, block: B:51:0x012f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0135  */
    /* JADX WARN: Code duplicated, block: B:55:0x0142  */
    /* JADX WARN: Code duplicated, block: B:57:0x0154  */
    /* JADX WARN: Code duplicated, block: B:58:0x015c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0220  */
    /* JADX WARN: Code duplicated, block: B:91:0x022d  */
    /* JADX WARN: Code duplicated, block: B:92:0x022f  */
    /* JADX WARN: Code duplicated, block: B:97:0x025a  */
    /* JADX WARN: Instruction removed from duplicated block: B:182:0x0462, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:211:0x04f9, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v168 */
    /* JADX WARN: Type inference failed for: r0v169 */
    /* JADX WARN: Type inference failed for: r0v170 */
    /* JADX WARN: Type inference failed for: r0v171 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88, types: [int] */
    /* JADX INFO: renamed from: s */
    public boolean m4081s() {
        dc0 dc0Var;
        Bundle bundle;
        int identifier;
        String strM321s;
        Uri defaultUri;
        String strM321s2;
        String strM321s3;
        Uri uri;
        Intent launchIntentForPackage;
        Bundle bundle2;
        PendingIntent activity;
        PendingIntent broadcast;
        String strM321s4;
        Integer numValueOf;
        String strM321s5;
        Integer numM312h;
        Integer numM312h2;
        Integer numM312h3;
        Long lM318p;
        long[] jArrM322t;
        int[] iArrM315m;
        boolean zM310f;
        ?? r0;
        ?? r1;
        Notification notification;
        String strM321s6;
        Bitmap bitmap;
        IconCompat iconCompat;
        IconCompat iconCompat2;
        boolean z;
        int i;
        int i2;
        int i3;
        int identifier2;
        String string;
        int i4 = 1;
        if (((an0) this.f6473m).m310f("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.f6472l;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strM321s7 = ((an0) this.f6473m).m321s("gcm.n.image");
        if (TextUtils.isEmpty(strM321s7)) {
            dc0Var = null;
        } else {
            try {
                dc0Var = new dc0(new URL(strM321s7));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + strM321s7);
                dc0Var = null;
            }
        }
        if (dc0Var != null) {
            ExecutorService executorService = (ExecutorService) this.f6471k;
            qc1 qc1Var = new qc1();
            dc0Var.f1621k = executorService.submit(new RunnableC0195f1(10, dc0Var, qc1Var));
            dc0Var.f1622l = qc1Var.f6465a;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.f6472l;
        an0 an0Var = (an0) this.f6473m;
        AtomicInteger atomicInteger = AbstractC0952zi.f9771a;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        Bundle bundle3 = bundle;
        String strM321s8 = an0Var.m321s("gcm.n.android_channel_id");
        try {
            if (firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 0).targetSdkVersion < 26) {
                strM321s8 = null;
            } else {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService2.getSystemService(NotificationManager.class);
                if (TextUtils.isEmpty(strM321s8)) {
                    strM321s8 = bundle3.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(strM321s8)) {
                        Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    } else if (notificationManager.getNotificationChannel(strM321s8) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    strM321s8 = "fcm_fallback_notification_channel";
                    if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                        identifier2 = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                        if (identifier2 == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService2.getString(identifier2);
                        }
                        notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                    }
                } else if (notificationManager.getNotificationChannel(strM321s8) == null) {
                    Log.w("FirebaseMessaging", "Notification Channel requested (" + strM321s8 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    strM321s8 = bundle3.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(strM321s8)) {
                        Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    } else if (notificationManager.getNotificationChannel(strM321s8) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    strM321s8 = "fcm_fallback_notification_channel";
                    if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                        identifier2 = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                        if (identifier2 == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService2.getString(identifier2);
                        }
                        notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        AtomicInteger atomicInteger2 = AbstractC0952zi.f9771a;
        String packageName = firebaseMessagingService2.getPackageName();
        Resources resources = firebaseMessagingService2.getResources();
        PackageManager packageManager = firebaseMessagingService2.getPackageManager();
        ns0 ns0Var = new ns0(firebaseMessagingService2, strM321s8);
        String strM319q = an0Var.m319q(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strM319q)) {
            ns0Var.f5514e = ns0.m3584b(strM319q);
        }
        String strM319q2 = an0Var.m319q(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strM319q2)) {
            ns0Var.f5515f = ns0.m3584b(strM319q2);
            ms0 ms0Var = new ms0();
            ms0Var.f5155k = ns0.m3584b(strM319q2);
            ns0Var.m3587d(ms0Var);
        }
        String strM321s9 = an0Var.m321s("gcm.n.icon");
        if (!TextUtils.isEmpty(strM321s9)) {
            identifier = resources.getIdentifier(strM321s9, "drawable", packageName);
            if (identifier == 0 && (identifier = resources.getIdentifier(strM321s9, "mipmap", packageName)) == 0) {
                Log.w("FirebaseMessaging", "Icon resource " + strM321s9 + " not found. Notification will use default icon.");
            } else {
                i4 = 1;
            }
            ns0Var.f5528s.icon = identifier;
            strM321s = an0Var.m321s("gcm.n.sound2");
            if (TextUtils.isEmpty(strM321s)) {
                strM321s = an0Var.m321s("gcm.n.sound");
            }
            if (TextUtils.isEmpty(strM321s)) {
                defaultUri = null;
            } else if (!"default".equals(strM321s) || resources.getIdentifier(strM321s, "raw", packageName) == 0) {
                defaultUri = RingtoneManager.getDefaultUri(2);
            } else {
                defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strM321s);
            }
            if (defaultUri != null) {
                Notification notification2 = ns0Var.f5528s;
                notification2.sound = defaultUri;
                notification2.audioStreamType = -1;
                notification2.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            strM321s2 = an0Var.m321s("gcm.n.click_action");
            if (TextUtils.isEmpty(strM321s2)) {
                strM321s3 = an0Var.m321s("gcm.n.link_android");
                if (TextUtils.isEmpty(strM321s3)) {
                    strM321s3 = an0Var.m321s("gcm.n.link");
                }
                if (TextUtils.isEmpty(strM321s3)) {
                    uri = null;
                } else {
                    uri = Uri.parse(strM321s3);
                }
                if (uri != null) {
                    launchIntentForPackage = new Intent("android.intent.action.VIEW");
                    launchIntentForPackage.setPackage(packageName);
                    launchIntentForPackage.setData(uri);
                } else {
                    launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                    if (launchIntentForPackage == null) {
                        Log.w("FirebaseMessaging", "No activity found to launch app");
                    }
                }
            } else {
                launchIntentForPackage = new Intent(strM321s2);
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setFlags(268435456);
            }
            if (launchIntentForPackage == null) {
                activity = null;
            } else {
                launchIntentForPackage.addFlags(67108864);
                Bundle bundle4 = (Bundle) an0Var.f254k;
                bundle2 = new Bundle(bundle4);
                for (String str : bundle4.keySet()) {
                    if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                        bundle2.remove(str);
                    }
                }
                launchIntentForPackage.putExtras(bundle2);
                if (an0Var.m310f("google.c.a.e")) {
                    launchIntentForPackage.putExtra("gcm.n.analytics_data", an0Var.m324w());
                }
                activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
            }
            ns0Var.f5516g = activity;
            if (an0Var.m310f("google.c.a.e")) {
                broadcast = PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(an0Var.m324w())), 1140850688);
            } else {
                broadcast = null;
            }
            if (broadcast != null) {
                ns0Var.f5528s.deleteIntent = broadcast;
            }
            strM321s4 = an0Var.m321s("gcm.n.color");
            if (TextUtils.isEmpty(strM321s4)) {
                i3 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i3 != 0) {
                    numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i3));
                } else {
                    numValueOf = null;
                }
            } else {
                try {
                    numValueOf = Integer.valueOf(Color.parseColor(strM321s4));
                } catch (IllegalArgumentException unused3) {
                    Log.w("FirebaseMessaging", "Color is invalid: " + strM321s4 + ". Notification will use default color.");
                    i3 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i3 != 0) {
                        try {
                            numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i3));
                        } catch (Resources.NotFoundException unused4) {
                            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                            numValueOf = null;
                        }
                    } else {
                        numValueOf = null;
                    }
                }
            }
            if (numValueOf != null) {
                ns0Var.f5524o = numValueOf.intValue();
            }
            ns0Var.m3586c(!an0Var.m310f("gcm.n.sticky"));
            ns0Var.f5522m = an0Var.m310f("gcm.n.local_only");
            strM321s5 = an0Var.m321s("gcm.n.ticker");
            if (strM321s5 != null) {
                ns0Var.f5528s.tickerText = ns0.m3584b(strM321s5);
            }
            numM312h = an0Var.m312h("gcm.n.notification_priority");
            if (numM312h == null) {
                numM312h = null;
            } else if (numM312h.intValue() >= -2 || numM312h.intValue() > 2) {
                Log.w("FirebaseMessaging", "notificationPriority is invalid " + numM312h + ". Skipping setting notificationPriority.");
                numM312h = null;
            }
            if (numM312h != null) {
                ns0Var.f5519j = numM312h.intValue();
            }
            numM312h2 = an0Var.m312h("gcm.n.visibility");
            if (numM312h2 == null) {
                numM312h2 = null;
            } else if (numM312h2.intValue() >= -1 || numM312h2.intValue() > i4) {
                Log.w("NotificationParams", "visibility is invalid: " + numM312h2 + ". Skipping setting visibility.");
                numM312h2 = null;
            }
            if (numM312h2 != null) {
                ns0Var.f5525p = numM312h2.intValue();
            }
            numM312h3 = an0Var.m312h("gcm.n.notification_count");
            if (numM312h3 != null) {
                numM312h3 = null;
            } else if (numM312h3.intValue() < 0) {
                Log.w("FirebaseMessaging", "notificationCount is invalid: " + numM312h3 + ". Skipping setting notificationCount.");
                numM312h3 = null;
            }
            if (numM312h3 != null) {
                ns0Var.f5518i = numM312h3.intValue();
            }
            lM318p = an0Var.m318p();
            if (lM318p != null) {
                ns0Var.f5520k = true;
                ns0Var.f5528s.when = lM318p.longValue();
            }
            jArrM322t = an0Var.m322t();
            if (jArrM322t != null) {
                ns0Var.f5528s.vibrate = jArrM322t;
            }
            iArrM315m = an0Var.m315m();
            if (iArrM315m != null) {
                int i5 = iArrM315m[0];
                i = iArrM315m[1];
                int i6 = iArrM315m[2];
                Notification notification3 = ns0Var.f5528s;
                notification3.ledARGB = i5;
                notification3.ledOnMS = i;
                notification3.ledOffMS = i6;
                if (i != 0 || i6 == 0) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                notification3.flags = i2 | ((-2) & notification3.flags);
            }
            zM310f = an0Var.m310f("gcm.n.default_sound");
            r0 = zM310f;
            if (an0Var.m310f("gcm.n.default_vibrate_timings")) {
                r0 = (zM310f ? 1 : 0) | 2;
            }
            r1 = r0;
            if (an0Var.m310f("gcm.n.default_light_settings")) {
                r1 = (r0 == true ? 1 : 0) | 4;
            }
            notification = ns0Var.f5528s;
            notification.defaults = r1;
            if ((r1 & 4) != 0) {
                notification.flags |= 1;
            }
            strM321s6 = an0Var.m321s("gcm.n.tag");
            if (TextUtils.isEmpty(strM321s6)) {
                strM321s6 = "FCM-Notification:" + SystemClock.uptimeMillis();
            }
            String str2 = strM321s6;
            if (dc0Var != null) {
                try {
                    v92 v92Var = dc0Var.f1622l;
                    p80.m3863h(v92Var);
                    bitmap = (Bitmap) hn0.m2311b(v92Var, 5L, TimeUnit.SECONDS);
                    if (bitmap == null) {
                        iconCompat = null;
                    } else {
                        iconCompat = new IconCompat(1);
                        iconCompat.f489b = bitmap;
                    }
                    ns0Var.f5517h = iconCompat;
                    ls0 ls0Var = new ls0();
                    if (bitmap == null) {
                        iconCompat2 = null;
                        z = true;
                    } else {
                        z = true;
                        iconCompat2 = new IconCompat(1);
                        iconCompat2.f489b = bitmap;
                    }
                    ls0Var.f4892k = iconCompat2;
                    ls0Var.f4893l = null;
                    ls0Var.f4894m = z;
                    ns0Var.m3587d(ls0Var);
                } catch (InterruptedException unused5) {
                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                    dc0Var.close();
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e2) {
                    Log.w("FirebaseMessaging", "Failed to download image: " + e2.getCause());
                } catch (TimeoutException unused6) {
                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                    dc0Var.close();
                }
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Showing notification");
            }
            ((NotificationManager) ((FirebaseMessagingService) this.f6472l).getSystemService("notification")).notify(str2, 0, ns0Var.m3585a());
            return true;
        }
        int i7 = bundle3.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i7 == 0) {
            try {
                i7 = packageManager.getApplicationInfo(packageName, 0).icon;
            } catch (PackageManager.NameNotFoundException e3) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e3);
            }
        }
        identifier = i7 != 0 ? i7 : 17301651;
        ns0Var.f5528s.icon = identifier;
        strM321s = an0Var.m321s("gcm.n.sound2");
        if (TextUtils.isEmpty(strM321s)) {
            strM321s = an0Var.m321s("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strM321s)) {
            defaultUri = null;
        } else if ("default".equals(strM321s)) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = RingtoneManager.getDefaultUri(2);
        }
        if (defaultUri != null) {
            Notification notification4 = ns0Var.f5528s;
            notification4.sound = defaultUri;
            notification4.audioStreamType = -1;
            notification4.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        }
        strM321s2 = an0Var.m321s("gcm.n.click_action");
        if (TextUtils.isEmpty(strM321s2)) {
            launchIntentForPackage = new Intent(strM321s2);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        } else {
            strM321s3 = an0Var.m321s("gcm.n.link_android");
            if (TextUtils.isEmpty(strM321s3)) {
                strM321s3 = an0Var.m321s("gcm.n.link");
            }
            if (TextUtils.isEmpty(strM321s3)) {
                uri = Uri.parse(strM321s3);
            } else {
                uri = null;
            }
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        }
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle5 = (Bundle) an0Var.f254k;
            bundle2 = new Bundle(bundle5);
            while (r14.hasNext()) {
                if (str.startsWith("google.c.")) {
                    bundle2.remove(str);
                } else {
                    bundle2.remove(str);
                }
            }
            launchIntentForPackage.putExtras(bundle2);
            if (an0Var.m310f("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", an0Var.m324w());
            }
            activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        ns0Var.f5516g = activity;
        if (an0Var.m310f("google.c.a.e")) {
            broadcast = null;
        } else {
            broadcast = PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(an0Var.m324w())), 1140850688);
        }
        if (broadcast != null) {
            ns0Var.f5528s.deleteIntent = broadcast;
        }
        strM321s4 = an0Var.m321s("gcm.n.color");
        if (TextUtils.isEmpty(strM321s4)) {
            numValueOf = Integer.valueOf(Color.parseColor(strM321s4));
        } else {
            i3 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i3 != 0) {
                numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i3));
            } else {
                numValueOf = null;
            }
        }
        if (numValueOf != null) {
            ns0Var.f5524o = numValueOf.intValue();
        }
        ns0Var.m3586c(!an0Var.m310f("gcm.n.sticky"));
        ns0Var.f5522m = an0Var.m310f("gcm.n.local_only");
        strM321s5 = an0Var.m321s("gcm.n.ticker");
        if (strM321s5 != null) {
            ns0Var.f5528s.tickerText = ns0.m3584b(strM321s5);
        }
        numM312h = an0Var.m312h("gcm.n.notification_priority");
        if (numM312h == null) {
            if (numM312h.intValue() >= -2) {
            }
            Log.w("FirebaseMessaging", "notificationPriority is invalid " + numM312h + ". Skipping setting notificationPriority.");
            numM312h = null;
        } else {
            numM312h = null;
        }
        if (numM312h != null) {
            ns0Var.f5519j = numM312h.intValue();
        }
        numM312h2 = an0Var.m312h("gcm.n.visibility");
        if (numM312h2 == null) {
            if (numM312h2.intValue() >= -1) {
            }
            Log.w("NotificationParams", "visibility is invalid: " + numM312h2 + ". Skipping setting visibility.");
            numM312h2 = null;
        } else {
            numM312h2 = null;
        }
        if (numM312h2 != null) {
            ns0Var.f5525p = numM312h2.intValue();
        }
        numM312h3 = an0Var.m312h("gcm.n.notification_count");
        if (numM312h3 != null) {
            numM312h3 = null;
        } else if (numM312h3.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + numM312h3 + ". Skipping setting notificationCount.");
            numM312h3 = null;
        }
        if (numM312h3 != null) {
            ns0Var.f5518i = numM312h3.intValue();
        }
        lM318p = an0Var.m318p();
        if (lM318p != null) {
            ns0Var.f5520k = true;
            ns0Var.f5528s.when = lM318p.longValue();
        }
        jArrM322t = an0Var.m322t();
        if (jArrM322t != null) {
            ns0Var.f5528s.vibrate = jArrM322t;
        }
        iArrM315m = an0Var.m315m();
        if (iArrM315m != null) {
            int i8 = iArrM315m[0];
            i = iArrM315m[1];
            int i9 = iArrM315m[2];
            Notification notification5 = ns0Var.f5528s;
            notification5.ledARGB = i8;
            notification5.ledOnMS = i;
            notification5.ledOffMS = i9;
            if (i != 0) {
                i2 = 0;
            } else {
                i2 = 0;
            }
            notification5.flags = i2 | ((-2) & notification5.flags);
        }
        zM310f = an0Var.m310f("gcm.n.default_sound");
        r0 = zM310f;
        if (an0Var.m310f("gcm.n.default_vibrate_timings")) {
            r0 = (zM310f ? 1 : 0) | 2;
        }
        r1 = r0;
        if (an0Var.m310f("gcm.n.default_light_settings")) {
            r1 = (r0 == true ? 1 : 0) | 4;
        }
        notification = ns0Var.f5528s;
        notification.defaults = r1;
        if ((r1 & 4) != 0) {
            notification.flags |= 1;
        }
        strM321s6 = an0Var.m321s("gcm.n.tag");
        if (TextUtils.isEmpty(strM321s6)) {
            strM321s6 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        String str3 = strM321s6;
        if (dc0Var != null) {
            v92 v92Var2 = dc0Var.f1622l;
            p80.m3863h(v92Var2);
            bitmap = (Bitmap) hn0.m2311b(v92Var2, 5L, TimeUnit.SECONDS);
            if (bitmap == null) {
                iconCompat = null;
            } else {
                iconCompat = new IconCompat(1);
                iconCompat.f489b = bitmap;
            }
            ns0Var.f5517h = iconCompat;
            ls0 ls0Var2 = new ls0();
            if (bitmap == null) {
                iconCompat2 = null;
                z = true;
            } else {
                z = true;
                iconCompat2 = new IconCompat(1);
                iconCompat2.f489b = bitmap;
            }
            ls0Var2.f4892k = iconCompat2;
            ls0Var2.f4893l = null;
            ls0Var2.f4894m = z;
            ns0Var.m3587d(ls0Var2);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) ((FirebaseMessagingService) this.f6472l).getSystemService("notification")).notify(str3, 0, ns0Var.m3585a());
        return true;
    }

    /* JADX INFO: renamed from: t */
    public boolean m4082t(CharSequence charSequence, int i, int i2, af1 af1Var) {
        if ((af1Var.f176c & 3) == 0) {
            C0442lq c0442lq = (C0442lq) this.f6473m;
            qp0 qp0VarM202b = af1Var.m202b();
            int iM3375a = qp0VarM202b.m3375a(8);
            if (iM3375a != 0) {
                qp0VarM202b.f5024b.getShort(iM3375a + qp0VarM202b.f5023a);
            }
            c0442lq.getClass();
            ThreadLocal threadLocal = C0442lq.f4880b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = c0442lq.f4881a.hasGlyph(sb.toString());
            int i3 = af1Var.f176c & 4;
            af1Var.f176c = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (af1Var.f176c & 3) == 2;
    }

    /* JADX INFO: renamed from: u */
    public boolean m4083u() {
        switch (this.f6470j) {
            case 22:
                List list = (List) this.f6472l;
                ByteBuffer byteBufferM3211c = AbstractC0429ld.m3211c((ByteBuffer) this.f6471k);
                nk0 nk0Var = (nk0) this.f6473m;
                if (byteBufferM3211c == null) {
                    return false;
                }
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        boolean zMo1767c = ((fc0) list.get(i)).mo1767c(byteBufferM3211c, nk0Var);
                        if (zMo1767c) {
                            return true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return false;
            case 23:
                List list2 = (List) this.f6473m;
                h01 h01Var = (h01) ((b90) this.f6471k).f793k;
                h01Var.reset();
                nk0 nk0Var2 = (nk0) this.f6472l;
                h01Var.mark(5242880);
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    try {
                        boolean zMo1769e = ((fc0) list2.get(i2)).mo1769e(h01Var, nk0Var2);
                        h01Var.reset();
                        if (zMo1769e) {
                            return true;
                        }
                    } catch (Throwable th2) {
                        h01Var.reset();
                        throw th2;
                    }
                }
                return false;
            default:
                List list3 = (List) this.f6472l;
                C0107a c0107a = (C0107a) this.f6473m;
                nk0 nk0Var3 = (nk0) this.f6471k;
                int size3 = list3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    fc0 fc0Var = (fc0) list3.get(i3);
                    h01 h01Var2 = null;
                    try {
                        h01 h01Var3 = new h01(new FileInputStream(c0107a.m985a().getFileDescriptor()), nk0Var3);
                        try {
                            boolean zMo1769e2 = fc0Var.mo1769e(h01Var3, nk0Var3);
                            h01Var3.m2184e();
                            c0107a.m985a();
                            if (zMo1769e2) {
                                return true;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            h01Var2 = h01Var3;
                            if (h01Var2 != null) {
                                h01Var2.m2184e();
                            }
                            c0107a.m985a();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                return false;
        }
    }

    /* JADX INFO: renamed from: v */
    public boolean m4084v(int i, C0770ul c0770ul, C0143dm c0143dm) {
        C0834wb c0834wb = (C0834wb) this.f6472l;
        int[] iArr = c0143dm.f1736o0;
        int[] iArr2 = c0143dm.f1741t;
        c0834wb.f8494a = iArr[0];
        c0834wb.f8495b = iArr[1];
        c0834wb.f8496c = c0143dm.m1260o();
        c0834wb.f8497d = c0143dm.m1256i();
        c0834wb.f8502i = false;
        c0834wb.f8503j = i;
        boolean z = c0834wb.f8494a == 3;
        boolean z2 = c0834wb.f8495b == 3;
        boolean z3 = z && c0143dm.f1702V > 0.0f;
        boolean z4 = z2 && c0143dm.f1702V > 0.0f;
        if (z3 && iArr2[0] == 4) {
            c0834wb.f8494a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            c0834wb.f8495b = 1;
        }
        c0770ul.m4934b(c0143dm, c0834wb);
        c0143dm.m1245K(c0834wb.f8498e);
        c0143dm.m1242H(c0834wb.f8499f);
        c0143dm.f1685E = c0834wb.f8501h;
        int i2 = c0834wb.f8500g;
        c0143dm.f1706Z = i2;
        c0143dm.f1685E = i2 > 0;
        c0834wb.f8503j = 0;
        return c0834wb.f8502i;
    }

    /* JADX INFO: renamed from: w */
    public Object m4085w(CharSequence charSequence, int i, int i2, int i3, boolean z, InterfaceC0891xv interfaceC0891xv) {
        int i4;
        char c;
        C0928yv c0928yv = new C0928yv((sp0) ((f71) this.f6472l).f2336m);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zMo642c = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (true) {
                if (iCharCount < i2 && i5 < i3 && zMo642c) {
                    SparseArray sparseArray = ((sp0) c0928yv.f9509f).f7184a;
                    sp0 sp0Var = sparseArray == null ? null : (sp0) sparseArray.get(iCodePointAt);
                    if (c0928yv.f9505b == 2) {
                        if (sp0Var != null) {
                            c0928yv.f9509f = sp0Var;
                            c0928yv.f9507d++;
                        } else {
                            if (iCodePointAt == 65038) {
                                c0928yv.m5840a();
                            } else if (iCodePointAt != 65039) {
                                sp0 sp0Var2 = (sp0) c0928yv.f9509f;
                                if (sp0Var2.f7185b != null) {
                                    if (c0928yv.f9507d != 1) {
                                        c0928yv.f9510g = sp0Var2;
                                        c0928yv.m5840a();
                                    } else if (c0928yv.m5841b()) {
                                        c0928yv.f9510g = (sp0) c0928yv.f9509f;
                                        c0928yv.m5840a();
                                    } else {
                                        c0928yv.m5840a();
                                    }
                                    c = 3;
                                } else {
                                    c0928yv.m5840a();
                                }
                            }
                            c = 1;
                        }
                        c = 2;
                    } else if (sp0Var == null) {
                        c0928yv.m5840a();
                        c = 1;
                    } else {
                        c0928yv.f9505b = 2;
                        c0928yv.f9509f = sp0Var;
                        c0928yv.f9507d = 1;
                        c = 2;
                    }
                    c0928yv.f9506c = iCodePointAt;
                    if (c == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                        if (iCharCount >= i2) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c == 3) {
                        if (!z && m4082t(charSequence, i4, iCharCount, ((sp0) c0928yv.f9510g).f7185b)) {
                            break;
                        }
                        zMo642c = interfaceC0891xv.mo642c(charSequence, i4, iCharCount, ((sp0) c0928yv.f9510g).f7185b);
                        i5++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (c0928yv.f9505b == 2 && ((sp0) c0928yv.f9509f).f7185b != null && ((c0928yv.f9507d > 1 || c0928yv.m5841b()) && i5 < i3 && zMo642c && (z || !m4082t(charSequence, i4, iCharCount, ((sp0) c0928yv.f9509f).f7185b)))) {
            interfaceC0891xv.mo642c(charSequence, i4, iCharCount, ((sp0) c0928yv.f9509f).f7185b);
        }
        return interfaceC0891xv.mo641b();
    }

    /* JADX INFO: renamed from: x */
    public void m4086x(C0648ra c0648ra, int i, boolean z) {
        C0500na c0500na = (C0500na) this.f6473m;
        Context context = (Context) this.f6471k;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = c0648ra.f6760a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        dx0 dx0Var = c0648ra.f6762c;
        adler32.update(byteBufferAllocate.putInt(gx0.m2162a(dx0Var)).array());
        byte[] bArr = c0648ra.f6761b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i2 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i2 < i) {
                        break;
                    }
                    o80.m3648j("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", c0648ra);
                    return;
                }
            }
        }
        Cursor cursorRawQuery = ((g41) this.f6472l).m1980a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(gx0.m2162a(dx0Var))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(c0500na.m3506a(dx0Var, jLongValue, i));
            Set set = ((C0537oa) c0500na.f5344b.get(dx0Var)).f5679c;
            if (set.contains(h51.f3064j)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(h51.f3066l)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(h51.f3065k)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", gx0.m2162a(dx0Var));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {c0648ra, Integer.valueOf(value), Long.valueOf(c0500na.m3506a(dx0Var, jLongValue, i)), lValueOf, Integer.valueOf(i)};
            String strConcat = "TRuntime.".concat("JobInfoScheduler");
            if (Log.isLoggable(strConcat, 3)) {
                Log.d(strConcat, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m4087y(String str) {
        if (str != null) {
            this.f6471k = str;
        } else {
            C0270h1.m2192h("Null backendName");
        }
    }

    /* JADX INFO: renamed from: z */
    public void m4088z(C0179em c0179em, int i, int i2, int i3) {
        c0179em.getClass();
        int i4 = c0179em.f1708a0;
        int i5 = c0179em.f1710b0;
        c0179em.f1708a0 = 0;
        c0179em.f1710b0 = 0;
        c0179em.m1245K(i2);
        c0179em.m1242H(i3);
        if (i4 < 0) {
            c0179em.f1708a0 = 0;
        } else {
            c0179em.f1708a0 = i4;
        }
        if (i5 < 0) {
            c0179em.f1710b0 = 0;
        } else {
            c0179em.f1710b0 = i5;
        }
        C0179em c0179em2 = (C0179em) this.f6473m;
        c0179em2.f2135s0 = i;
        c0179em2.m1462Q();
    }

    /* JADX INFO: renamed from: A */
    private final void m4067A() {
    }

    /* JADX INFO: renamed from: B */
    private final void m4068B() {
    }

    public /* synthetic */ qd0(Object obj, Object obj2, Object obj3, int i) {
        this.f6470j = i;
        this.f6471k = obj;
        this.f6472l = obj2;
        this.f6473m = obj3;
    }

    public /* synthetic */ qd0(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.f6470j = i;
        this.f6473m = obj;
        this.f6471k = obj2;
        this.f6472l = obj3;
    }

    public qd0() {
        this.f6470j = 2;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0862x2(0));
        this.f6471k = new HashMap();
        this.f6472l = new ReferenceQueue();
        executorServiceNewSingleThreadExecutor.execute(new RunnableC0897y0(1, this));
    }

    public qd0(FirebaseMessagingService firebaseMessagingService, an0 an0Var, ExecutorService executorService) {
        this.f6470j = 13;
        this.f6471k = executorService;
        this.f6472l = firebaseMessagingService;
        this.f6473m = an0Var;
    }

    public qd0(Runnable runnable) {
        this.f6470j = 28;
        this.f6472l = new CopyOnWriteArrayList();
        this.f6473m = new HashMap();
        this.f6471k = runnable;
    }

    public qd0(Context context) {
        this.f6470j = 1;
        this.f6473m = context.getApplicationContext();
        this.f6472l = new HashSet();
        this.f6471k = new HashMap();
    }

    public qd0(C0179em c0179em) {
        this.f6470j = 5;
        this.f6471k = new ArrayList();
        this.f6472l = new C0834wb();
        this.f6473m = c0179em;
    }

    public qd0(C0784uz c0784uz, i11 i11Var) {
        this.f6470j = 21;
        this.f6473m = c0784uz;
    }

    public /* synthetic */ qd0(int i) {
        this.f6470j = i;
    }

    public qd0(gm0 gm0Var, ArrayList arrayList, nk0 nk0Var) {
        this.f6470j = 23;
        o80.m3647h(nk0Var, "Argument must not be null");
        this.f6472l = nk0Var;
        o80.m3647h(arrayList, "Argument must not be null");
        this.f6473m = arrayList;
        this.f6471k = new b90(gm0Var, nk0Var);
    }

    public qd0(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, nk0 nk0Var) {
        this.f6470j = 24;
        o80.m3647h(nk0Var, "Argument must not be null");
        this.f6471k = nk0Var;
        o80.m3647h(arrayList, "Argument must not be null");
        this.f6472l = arrayList;
        this.f6473m = new C0107a(parcelFileDescriptor);
    }

    public qd0(C0892xw c0892xw, h81 h81Var, C0078bx c0078bx) {
        this.f6470j = 17;
        this.f6473m = c0892xw;
        this.f6472l = h81Var;
        this.f6471k = c0078bx;
    }

    public qd0(C0062bh c0062bh, d71 d71Var) {
        this.f6470j = 8;
        this.f6473m = c0062bh;
        this.f6471k = d71Var;
    }
}
