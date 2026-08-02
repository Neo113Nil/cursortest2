package w1;

import android.text.TextUtils;
import io.sentry.SentryOptions;
import io.sentry.protocol.SentryStackFrame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Timer;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class B1 extends H1 {

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f17287H = 0;

    /* renamed from: D, reason: collision with root package name */
    public Timer f17288D;

    /* renamed from: E, reason: collision with root package name */
    public C1746t0 f17289E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f17290F;

    /* renamed from: G, reason: collision with root package name */
    public C1756w1 f17291G;

    @Override // w1.H1, w1.C1
    public final int a(W1 w12) {
        C1756w1 c1756w1 = new C1756w1();
        if (!c1756w1.k(AbstractC1715k1.l(), "crashFile")) {
            return 1;
        }
        Objects.toString(D2.ANALYTICS_ERROR);
        c1756w1.e(new com.flurry.android.marketing.messaging.notification.b(20, c1756w1, w12));
        c1756w1.m();
        return 1;
    }

    @Override // w1.H1
    public final void i(C2 c22) {
        if (this.f17392A != 3) {
            d(new com.flurry.android.marketing.messaging.notification.b(16, this, c22));
        } else {
            this.f17393B.add(c22);
            Objects.toString(c22.a());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:94|(1:96)(2:182|(1:184))|97|(1:99)(1:181)|100|(2:178|(15:180|103|(2:175|(12:177|106|(1:108)|109|110|111|112|113|(4:115|(1:117)(7:146|147|148|149|150|151|(1:153)(3:154|(1:156)(2:157|(2:166|167)(3:161|(1:163)(1:165)|164))|119))|118|119)(1:172)|120|(1:145)(1:(2:123|124)(8:126|127|128|(2:129|(1:1)(1:135))|137|138|139|140))|125))|105|106|(0)|109|110|111|112|113|(0)(0)|120|(0)(0)|125))|102|103|(0)|105|106|(0)|109|110|111|112|113|(0)(0)|120|(0)(0)|125) */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x013b, code lost:
    
        "Issue parsing session id into start time: ".concat(java.lang.String.valueOf(r0));
        r19 = r14;
        r13 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x028f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0393  */
    @Override // w1.H1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        String[] list;
        X1 x1;
        int i7;
        String[] list2;
        String str;
        String str2;
        File file;
        int i8;
        int i9;
        ArrayList arrayList;
        File file2;
        String str3;
        int i10;
        int i11;
        int i12;
        C1756w1 c1756w1;
        FileChannel fileChannel;
        FileChannel fileChannel2;
        FileChannel fileChannel3;
        FileChannel fileChannel4;
        int i13 = 0;
        File file3 = new File(AbstractC1715k1.m());
        if (!file3.exists()) {
            file3.mkdirs();
        }
        File file4 = new File(AbstractC1715k1.l());
        if (!file4.exists()) {
            file4.mkdirs();
        }
        File file5 = new File(AbstractC1715k1.m());
        if (!file5.exists()) {
            file5.mkdirs();
        }
        File file6 = new File(AbstractC1715k1.h());
        if (!file6.exists()) {
            file6.mkdirs();
        }
        File fileStreamPath = AbstractC1707i1.f17743c.getFileStreamPath(".yflurrynativecrash");
        Pattern compile = Pattern.compile(SentryOptions.DEFAULT_PROPAGATION_TARGETS + Pattern.quote(".dmp") + "$");
        if (fileStreamPath.exists()) {
            list = fileStreamPath.list(new C1679b1(1, compile));
            if (list == null) {
                list = new String[0];
            }
        } else {
            list = new String[0];
        }
        int i14 = 4;
        if (list.length == 0) {
            i7 = 0;
            x1 = null;
        } else {
            int length = list.length;
            int i15 = 0;
            x1 = null;
            while (i15 < length) {
                String str4 = list[i15];
                AbstractC1706i0.o(i14, "Native crash occurred in previous session! Found minidump file - ".concat(String.valueOf(str4)));
                Pattern compile2 = Pattern.compile(SentryOptions.DEFAULT_PROPAGATION_TARGETS + Pattern.quote(str4 + ".fcb") + SentryOptions.DEFAULT_PROPAGATION_TARGETS);
                if (fileStreamPath.exists()) {
                    list2 = fileStreamPath.list(new C1679b1(i13, compile2));
                    if (list2 == null) {
                        list2 = new String[i13];
                    }
                } else {
                    list2 = new String[i13];
                }
                String str5 = list2.length > 0 ? list2[i13] : null;
                boolean isEmpty = TextUtils.isEmpty(str5);
                "Breadcrumbs file associated with minidump file - ".concat(String.valueOf(str5));
                if (!TextUtils.isEmpty(str5)) {
                    String[] split = str5.split("\\.");
                    if (split.length == 5) {
                        str = split[3];
                        if (!TextUtils.isEmpty(str5)) {
                            String[] split2 = str5.split("\\.");
                            if (split2.length == 5) {
                                str2 = split2[i14];
                                if (TextUtils.isEmpty(str)) {
                                    "There is no session id specified with crash breadcrumbs file: ".concat(String.valueOf(str5));
                                    isEmpty = true;
                                }
                                long currentTimeMillis = System.currentTimeMillis();
                                Long.parseLong(str);
                                long j = Long.parseLong(str2);
                                file = new File(fileStreamPath, str5);
                                if (file.exists()) {
                                    O2 o22 = new O2();
                                    file.getAbsolutePath();
                                    ByteBuffer allocate = ByteBuffer.allocate(O2.f17485f);
                                    o22.f17491c = allocate;
                                    i8 = i15;
                                    if (file.length() != allocate.capacity()) {
                                        file.length();
                                        allocate.capacity();
                                        o22.f17491c = null;
                                    } else {
                                        try {
                                            FileInputStream fileInputStream = new FileInputStream(file);
                                            FileChannel channel = fileInputStream.getChannel();
                                            try {
                                                i10 = channel.read(allocate);
                                            } catch (IOException unused) {
                                                i10 = 0;
                                            }
                                            AbstractC1706i0.h(channel);
                                            AbstractC1706i0.h(fileInputStream);
                                        } catch (FileNotFoundException unused2) {
                                            i9 = 0;
                                            o22.f17491c = null;
                                        }
                                        if (i10 != o22.f17491c.capacity()) {
                                            o22.f17491c.capacity();
                                            o22.f17491c = null;
                                        } else {
                                            i9 = 0;
                                            o22.f17491c.position(0);
                                            if (o22.f17491c.asCharBuffer().limit(4).toString().equals(O2.f17484e)) {
                                                short s7 = o22.f17491c.getShort(O2.f17486g);
                                                o22.f17489a = s7;
                                                if (s7 < 0 || s7 >= 207) {
                                                    o22.f17491c = null;
                                                } else {
                                                    o22.f17490b = o22.f17491c.get(O2.f17487h) == 1;
                                                }
                                            } else {
                                                o22.f17491c = null;
                                            }
                                            ArrayList a2 = o22.a();
                                            a2.size();
                                            file.delete();
                                            arrayList = a2;
                                        }
                                    }
                                    i9 = 0;
                                    ArrayList a22 = o22.a();
                                    a22.size();
                                    file.delete();
                                    arrayList = a22;
                                } else {
                                    i8 = i15;
                                    i9 = 0;
                                    isEmpty = true;
                                    arrayList = null;
                                }
                                file2 = new File(fileStreamPath, str4);
                                if (file2.exists()) {
                                    if (isEmpty) {
                                        file2.delete();
                                    } else {
                                        String k7 = AbstractC1715k1.k(file2);
                                        file2.delete();
                                        try {
                                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("logcat -d").getInputStream()));
                                            StringBuilder sb = new StringBuilder();
                                            int i16 = i9;
                                            while (true) {
                                                String readLine = bufferedReader.readLine();
                                                if (readLine == null || i16 >= 1000 || sb.length() + readLine.length() > 524288) {
                                                    break;
                                                }
                                                sb.append(readLine);
                                                sb.append("\n");
                                                i16++;
                                            }
                                            "Get Logcat lines: ".concat(String.valueOf(i16));
                                            str3 = sb.toString();
                                        } catch (IOException unused3) {
                                            str3 = "";
                                        }
                                        String str6 = str3;
                                        str6.getClass();
                                        int incrementAndGet = W1.f17571e.incrementAndGet();
                                        char[] cArr = O2.f17483d;
                                        x1 = new X1(incrementAndGet, SentryStackFrame.JsonKeys.NATIVE, j, "", "", "", 3, 3, null, null, arrayList, k7, str6);
                                    }
                                }
                                i14 = 4;
                                i13 = i9;
                                i15 = i8 + 1;
                            }
                        }
                        str2 = null;
                        if (TextUtils.isEmpty(str)) {
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        Long.parseLong(str);
                        long j3 = Long.parseLong(str2);
                        file = new File(fileStreamPath, str5);
                        if (file.exists()) {
                        }
                        file2 = new File(fileStreamPath, str4);
                        if (file2.exists()) {
                        }
                        i14 = 4;
                        i13 = i9;
                        i15 = i8 + 1;
                    }
                }
                str = null;
                if (!TextUtils.isEmpty(str5)) {
                }
                str2 = null;
                if (TextUtils.isEmpty(str)) {
                }
                long currentTimeMillis22 = System.currentTimeMillis();
                Long.parseLong(str);
                long j32 = Long.parseLong(str2);
                file = new File(fileStreamPath, str5);
                if (file.exists()) {
                }
                file2 = new File(fileStreamPath, str4);
                if (file2.exists()) {
                }
                i14 = 4;
                i13 = i9;
                i15 = i8 + 1;
            }
            i7 = i13;
        }
        W1 w12 = x1 != null ? new W1(x1) : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC1715k1.l());
        String str7 = File.separator;
        sb2.append(str7);
        sb2.append("currentFile");
        if (AbstractC1715k1.j(sb2.toString())) {
            if (AbstractC1715k1.j(AbstractC1715k1.l() + str7 + "crashFile")) {
                String l7 = AbstractC1715k1.l();
                L5.L l8 = new L5.L(l7, "currentFile");
                String l9 = AbstractC1715k1.l();
                L5.L l10 = new L5.L(l9, "crashFile");
                Object[] objArr = {l8, l10};
                int i17 = i7;
                while (true) {
                    if (i17 >= 2) {
                        String[] strArr = {l7, "currentFile", l9, "crashFile"};
                        int i18 = i7;
                        while (true) {
                            if (i18 >= 4) {
                                try {
                                    File file7 = new File(l7, "currentFile");
                                    fileChannel2 = new FileInputStream(new File(l9, "crashFile")).getChannel();
                                    try {
                                        try {
                                            i11 = 1;
                                            try {
                                                fileChannel4 = new FileOutputStream(file7, true).getChannel();
                                            } catch (Exception unused4) {
                                                fileChannel4 = null;
                                                AbstractC1706i0.h(fileChannel2);
                                                AbstractC1706i0.h(fileChannel4);
                                                new File(l10.f4417a, l10.f4418b).delete();
                                                m();
                                                if (C1756w1.f17911B != null) {
                                                }
                                                c1756w1 = this.f17291G;
                                                if (i12 != 0) {
                                                }
                                                if (c1756w1.k(AbstractC1715k1.l(), "currentFile")) {
                                                }
                                            }
                                        } catch (Exception unused5) {
                                            i11 = 1;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        fileChannel = fileChannel2;
                                        fileChannel3 = null;
                                        AbstractC1706i0.h(fileChannel);
                                        AbstractC1706i0.h(fileChannel3);
                                        throw th;
                                    }
                                } catch (Exception unused6) {
                                    i11 = 1;
                                    fileChannel2 = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileChannel = null;
                                }
                                try {
                                    fileChannel4.transferFrom(fileChannel2, fileChannel4.size(), fileChannel2.size());
                                    AbstractC1706i0.h(fileChannel2);
                                    AbstractC1706i0.h(fileChannel4);
                                    new File(l10.f4417a, l10.f4418b).delete();
                                    break;
                                } catch (Exception unused7) {
                                    AbstractC1706i0.h(fileChannel2);
                                    AbstractC1706i0.h(fileChannel4);
                                    new File(l10.f4417a, l10.f4418b).delete();
                                    m();
                                    if (C1756w1.f17911B != null) {
                                    }
                                    c1756w1 = this.f17291G;
                                    if (i12 != 0) {
                                    }
                                    if (c1756w1.k(AbstractC1715k1.l(), "currentFile")) {
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    fileChannel = fileChannel2;
                                    fileChannel3 = fileChannel4;
                                    AbstractC1706i0.h(fileChannel);
                                    AbstractC1706i0.h(fileChannel3);
                                    throw th;
                                }
                            } else {
                                if (TextUtils.isEmpty(strArr[i18])) {
                                    i11 = 1;
                                    break;
                                }
                                i18++;
                            }
                        }
                    } else {
                        if (objArr[i17] == null) {
                            i11 = 1;
                            break;
                        }
                        i17++;
                    }
                }
                new File(l10.f4417a, l10.f4418b).delete();
            } else {
                i11 = 1;
            }
            m();
        } else {
            i11 = 1;
        }
        i12 = C1756w1.f17911B != null ? i11 : i7;
        c1756w1 = this.f17291G;
        if (i12 != 0) {
            c1756w1.m();
        }
        if (c1756w1.k(AbstractC1715k1.l(), "currentFile")) {
            long i19 = AbstractC1707i1.i("frame.counter", 0L) + 1;
            AbstractC1707i1.f("frame.counter", i19);
            R1 r12 = new R1(new s2(i19), 22);
            C1756w1 c1756w12 = this.f17291G;
            c1756w12.i(r12, null);
            if (w12 != null) {
                Objects.toString(D2.ANALYTICS_ERROR);
                c1756w12.e(new com.flurry.android.marketing.messaging.notification.b(20, c1756w12, w12));
            }
        }
    }

    public final void m() {
        C1756w1 c1756w1 = this.f17291G;
        ((ReentrantLock) c1756w1.f17912A).lock();
        try {
            if (C1756w1.f17911B != null) {
                c1756w1.m();
            }
            String l7 = AbstractC1715k1.l();
            L5.L l8 = new L5.L(l7, "currentFile");
            File file = new File(l7, "currentFile");
            if (Q1.a(file) != 2) {
                synchronized (AbstractC1706i0.class) {
                }
                file.delete();
            } else {
                String h6 = AbstractC1715k1.h();
                Locale locale = Locale.US;
                AbstractC1706i0.g(l8, new L5.L(h6, "completed-" + System.currentTimeMillis()));
            }
            ((ReentrantLock) c1756w1.f17912A).unlock();
            n();
        } catch (Throwable th) {
            ((ReentrantLock) c1756w1.f17912A).unlock();
            throw th;
        }
    }

    public final synchronized void n() {
        try {
            if (this.f17288D != null) {
                o();
            }
            this.f17288D = new Timer("FlurryFlushTimer");
            C1746t0 c1746t0 = new C1746t0(this, 1);
            this.f17289E = c1746t0;
            this.f17288D.schedule(c1746t0, 600000L);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void o() {
        try {
            Timer timer = this.f17288D;
            if (timer != null) {
                timer.cancel();
                this.f17288D = null;
            }
            C1746t0 c1746t0 = this.f17289E;
            if (c1746t0 != null) {
                c1746t0.cancel();
                this.f17289E = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
