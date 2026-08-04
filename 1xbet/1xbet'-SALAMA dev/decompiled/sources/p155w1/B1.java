package p155w1;

import L5.L;
import android.text.TextUtils;
import com.flurry.android.marketing.messaging.notification.b;
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

/* JADX INFO: loaded from: classes.dex */
public final class B1 extends H1 {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f17293H = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Timer f17294D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C1037t0 f17295E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f17296F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public C1047w1 f17297G;

    @Override // p155w1.H1, p155w1.C1
    public final int a(W1 w7) {
        C1047w1 c1047w1 = new C1047w1();
        if (!c1047w1.k(AbstractC1006k1.l(), "crashFile")) {
            return 1;
        }
        Objects.toString(D2.ANALYTICS_ERROR);
        c1047w1.e(new b(20, c1047w1, w7));
        c1047w1.m();
        return 1;
    }

    @Override // p155w1.H1
    public final void i(C2 c3) {
        if (this.f17398A != 3) {
            d(new b(16, this, c3));
        } else {
            this.f17399B.add(c3);
            Objects.toString(c3.a());
        }
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0391  */
    /* JADX WARN: Code duplicated, block: B:153:0x0393  */
    /* JADX WARN: Code duplicated, block: B:156:0x0398  */
    /* JADX WARN: Code duplicated, block: B:159:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:161:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:44:0x0111  */
    @Override // p155w1.H1
    public final void j() throws Throwable {
        String[] list;
        X1 x1;
        int i7;
        String[] list2;
        String str;
        String str2;
        long j;
        int i8;
        ArrayList arrayList;
        String string;
        int i9;
        int i10;
        int i11;
        C1047w1 c1047w1;
        C1047w1 c1047w2;
        FileChannel fileChannel;
        FileChannel channel;
        FileChannel fileChannel2;
        FileChannel channel2;
        int i12 = 0;
        File file = new File(AbstractC1006k1.m());
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(AbstractC1006k1.l());
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file3 = new File(AbstractC1006k1.m());
        if (!file3.exists()) {
            file3.mkdirs();
        }
        File file4 = new File(AbstractC1006k1.h());
        if (!file4.exists()) {
            file4.mkdirs();
        }
        File fileStreamPath = AbstractC0998i1.f17749c.getFileStreamPath(".yflurrynativecrash");
        Pattern patternCompile = Pattern.compile(SentryOptions.DEFAULT_PROPAGATION_TARGETS + Pattern.quote(".dmp") + "$");
        if (fileStreamPath.exists()) {
            list = fileStreamPath.list(new C0970b1(1, patternCompile));
            if (list == null) {
                list = new String[0];
            }
        } else {
            list = new String[0];
        }
        int i13 = 4;
        if (list.length == 0) {
            i7 = 0;
            x1 = null;
        } else {
            x1 = null;
            for (String str3 : list) {
                AbstractC0997i0.o(i13, "Native crash occurred in previous session! Found minidump file - ".concat(String.valueOf(str3)));
                Pattern patternCompile2 = Pattern.compile(SentryOptions.DEFAULT_PROPAGATION_TARGETS + Pattern.quote(str3 + ".fcb") + SentryOptions.DEFAULT_PROPAGATION_TARGETS);
                if (fileStreamPath.exists()) {
                    list2 = fileStreamPath.list(new C0970b1(i12, patternCompile2));
                    if (list2 == null) {
                        list2 = new String[i12];
                    }
                } else {
                    list2 = new String[i12];
                }
                String str4 = list2.length > 0 ? list2[i12] : null;
                boolean zIsEmpty = TextUtils.isEmpty(str4);
                "Breadcrumbs file associated with minidump file - ".concat(String.valueOf(str4));
                if (TextUtils.isEmpty(str4)) {
                    str = null;
                } else {
                    String[] strArrSplit = str4.split("\\.");
                    if (strArrSplit.length != 5) {
                        str = null;
                    } else {
                        str = strArrSplit[3];
                    }
                }
                if (TextUtils.isEmpty(str4)) {
                    str2 = null;
                } else {
                    String[] strArrSplit2 = str4.split("\\.");
                    if (strArrSplit2.length != 5) {
                        str2 = null;
                    } else {
                        str2 = strArrSplit2[i13];
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    "There is no session id specified with crash breadcrumbs file: ".concat(String.valueOf(str4));
                    zIsEmpty = true;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    Long.parseLong(str);
                    j = Long.parseLong(str2);
                } catch (NumberFormatException unused) {
                    "Issue parsing session id into start time: ".concat(String.valueOf(str));
                    j = jCurrentTimeMillis;
                    zIsEmpty = true;
                }
                File file5 = new File(fileStreamPath, str4);
                if (file5.exists()) {
                    O2 o7 = new O2();
                    file5.getAbsolutePath();
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(O2.f17491f);
                    o7.f17497c = byteBufferAllocate;
                    if (file5.length() != byteBufferAllocate.capacity()) {
                        file5.length();
                        byteBufferAllocate.capacity();
                        o7.f17497c = null;
                    } else {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(file5);
                            FileChannel channel3 = fileInputStream.getChannel();
                            try {
                                i9 = channel3.read(byteBufferAllocate);
                            } catch (IOException unused2) {
                                i9 = 0;
                            }
                            AbstractC0997i0.h(channel3);
                            AbstractC0997i0.h(fileInputStream);
                            if (i9 != o7.f17497c.capacity()) {
                                o7.f17497c.capacity();
                                o7.f17497c = null;
                            } else {
                                i8 = 0;
                                o7.f17497c.position(0);
                                if (o7.f17497c.asCharBuffer().limit(4).toString().equals(O2.f17490e)) {
                                    short s7 = o7.f17497c.getShort(O2.f17492g);
                                    o7.f17495a = s7;
                                    if (s7 < 0 || s7 >= 207) {
                                        o7.f17497c = null;
                                    } else {
                                        o7.f17496b = o7.f17497c.get(O2.f17493h) == 1;
                                    }
                                } else {
                                    o7.f17497c = null;
                                }
                            }
                        } catch (FileNotFoundException unused3) {
                            i8 = 0;
                            o7.f17497c = null;
                        }
                        ArrayList arrayListA = o7.a();
                        arrayListA.size();
                        file5.delete();
                        arrayList = arrayListA;
                    }
                    i8 = 0;
                    ArrayList arrayListA2 = o7.a();
                    arrayListA2.size();
                    file5.delete();
                    arrayList = arrayListA2;
                } else {
                    i8 = 0;
                    zIsEmpty = true;
                    arrayList = null;
                }
                File file6 = new File(fileStreamPath, str3);
                if (file6.exists()) {
                    if (zIsEmpty) {
                        file6.delete();
                    } else {
                        String strK = AbstractC1006k1.k(file6);
                        file6.delete();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("logcat -d").getInputStream()));
                            StringBuilder sb = new StringBuilder();
                            int i14 = i8;
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line == null || i14 >= 1000 || sb.length() + line.length() > 524288) {
                                    break;
                                }
                                sb.append(line);
                                sb.append("\n");
                                i14++;
                            }
                            "Get Logcat lines: ".concat(String.valueOf(i14));
                            string = sb.toString();
                        } catch (IOException unused4) {
                            string = "";
                        }
                        String str5 = string;
                        str5.getClass();
                        int iIncrementAndGet = W1.f17577e.incrementAndGet();
                        char[] cArr = O2.f17489d;
                        x1 = new X1(iIncrementAndGet, SentryStackFrame.JsonKeys.NATIVE, j, "", "", "", 3, 3, null, null, arrayList, strK, str5);
                    }
                }
                i13 = 4;
                i12 = i8;
            }
            i7 = i12;
        }
        W1 w7 = x1 != null ? new W1(x1) : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC1006k1.l());
        String str6 = File.separator;
        sb2.append(str6);
        sb2.append("currentFile");
        if (AbstractC1006k1.j(sb2.toString())) {
            if (AbstractC1006k1.j(AbstractC1006k1.l() + str6 + "crashFile")) {
                String strL = AbstractC1006k1.l();
                L l7 = new L(strL, "currentFile");
                String strL2 = AbstractC1006k1.l();
                L l8 = new L(strL2, "crashFile");
                Object[] objArr = {l7, l8};
                int i15 = i7;
                while (true) {
                    if (i15 >= 2) {
                        String[] strArr = {strL, "currentFile", strL2, "crashFile"};
                        int i16 = i7;
                        while (true) {
                            if (i16 >= 4) {
                                try {
                                    File file7 = new File(strL, "currentFile");
                                    channel = new FileInputStream(new File(strL2, "crashFile")).getChannel();
                                    try {
                                        try {
                                            i10 = 1;
                                            try {
                                                channel2 = new FileOutputStream(file7, true).getChannel();
                                                try {
                                                    channel2.transferFrom(channel, channel2.size(), channel.size());
                                                    AbstractC0997i0.h(channel);
                                                    AbstractC0997i0.h(channel2);
                                                    new File(l8.f4417a, l8.f4418b).delete();
                                                    break;
                                                } catch (Exception unused5) {
                                                    AbstractC0997i0.h(channel);
                                                    AbstractC0997i0.h(channel2);
                                                    break;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    fileChannel = channel;
                                                    fileChannel2 = channel2;
                                                    AbstractC0997i0.h(fileChannel);
                                                    AbstractC0997i0.h(fileChannel2);
                                                    throw th;
                                                }
                                            } catch (Exception unused6) {
                                                channel2 = null;
                                                AbstractC0997i0.h(channel);
                                                AbstractC0997i0.h(channel2);
                                                new File(l8.f4417a, l8.f4418b).delete();
                                                m();
                                                if (C1047w1.f17917B != null) {
                                                    i11 = i10;
                                                } else {
                                                    i11 = i7;
                                                }
                                                c1047w1 = this.f17297G;
                                                if (i11 != 0) {
                                                    c1047w1.m();
                                                }
                                                if (c1047w1.k(AbstractC1006k1.l(), "currentFile")) {
                                                    long jI = AbstractC0998i1.i("frame.counter", 0L) + 1;
                                                    AbstractC0998i1.f("frame.counter", jI);
                                                    R1 r7 = new R1(new s2(jI), 22);
                                                    c1047w2 = this.f17297G;
                                                    c1047w2.i(r7, null);
                                                    if (w7 != null) {
                                                        Objects.toString(D2.ANALYTICS_ERROR);
                                                        c1047w2.e(new b(20, c1047w2, w7));
                                                    }
                                                }
                                            }
                                        } catch (Exception unused7) {
                                            i10 = 1;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileChannel = channel;
                                        fileChannel2 = null;
                                        AbstractC0997i0.h(fileChannel);
                                        AbstractC0997i0.h(fileChannel2);
                                        throw th;
                                    }
                                } catch (Exception unused8) {
                                    i10 = 1;
                                    channel = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    fileChannel = null;
                                }
                            } else {
                                if (TextUtils.isEmpty(strArr[i16])) {
                                    i10 = 1;
                                    break;
                                }
                                i16++;
                            }
                        }
                    } else {
                        if (objArr[i15] == null) {
                            i10 = 1;
                            break;
                        }
                        i15++;
                    }
                }
                new File(l8.f4417a, l8.f4418b).delete();
            } else {
                i10 = 1;
            }
            m();
        } else {
            i10 = 1;
        }
        if (C1047w1.f17917B != null) {
            i11 = i10;
        } else {
            i11 = i7;
        }
        c1047w1 = this.f17297G;
        if (i11 != 0) {
            c1047w1.m();
        }
        if (c1047w1.k(AbstractC1006k1.l(), "currentFile")) {
            long jI2 = AbstractC0998i1.i("frame.counter", 0L) + 1;
            AbstractC0998i1.f("frame.counter", jI2);
            R1 r8 = new R1(new s2(jI2), 22);
            c1047w2 = this.f17297G;
            c1047w2.i(r8, null);
            if (w7 != null) {
                Objects.toString(D2.ANALYTICS_ERROR);
                c1047w2.e(new b(20, c1047w2, w7));
            }
        }
    }

    public final void m() {
        C1047w1 c1047w1 = this.f17297G;
        ((ReentrantLock) c1047w1.f17918A).lock();
        try {
            if (C1047w1.f17917B != null) {
                c1047w1.m();
            }
            String strL = AbstractC1006k1.l();
            L l7 = new L(strL, "currentFile");
            File file = new File(strL, "currentFile");
            if (Q1.a(file) != 2) {
                synchronized (AbstractC0997i0.class) {
                }
                file.delete();
            } else {
                String strH = AbstractC1006k1.h();
                Locale locale = Locale.US;
                AbstractC0997i0.g(l7, new L(strH, "completed-" + System.currentTimeMillis()));
            }
            ((ReentrantLock) c1047w1.f17918A).unlock();
            n();
        } catch (Throwable th) {
            ((ReentrantLock) c1047w1.f17918A).unlock();
            throw th;
        }
    }

    public final synchronized void n() {
        try {
            if (this.f17294D != null) {
                o();
            }
            this.f17294D = new Timer("FlurryFlushTimer");
            C1037t0 c1037t0 = new C1037t0(this, 1);
            this.f17295E = c1037t0;
            this.f17294D.schedule(c1037t0, 600000L);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void o() {
        try {
            Timer timer = this.f17294D;
            if (timer != null) {
                timer.cancel();
                this.f17294D = null;
            }
            C1037t0 c1037t0 = this.f17295E;
            if (c1037t0 != null) {
                c1037t0.cancel();
                this.f17295E = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
