package p000;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class o00 implements InterfaceC0803vh {

    /* JADX INFO: renamed from: a */
    public final File f5571a;

    /* JADX INFO: renamed from: b */
    public final g81 f5572b;

    /* JADX INFO: renamed from: c */
    public final k00 f5573c;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f5574d;

    /* JADX INFO: renamed from: e */
    public final br0 f5575e;

    public o00(File file, g81 g81Var, k00 k00Var) {
        g81Var.getClass();
        this.f5571a = file;
        this.f5572b = g81Var;
        this.f5573c = k00Var;
        this.f5574d = new AtomicBoolean(false);
        this.f5575e = new br0();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:53:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [hp] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: a */
    public final Object m3610a(C0294hp c0294hp, AbstractC0882xm abstractC0882xm) throws Throwable {
        m00 m00Var;
        Throwable th;
        i00 i00Var;
        o00 o00Var;
        boolean z;
        ?? r8;
        if (abstractC0882xm instanceof m00) {
            m00Var = (m00) abstractC0882xm;
            int i = m00Var.f4944r;
            if ((i & Integer.MIN_VALUE) != 0) {
                m00Var.f4944r = i - Integer.MIN_VALUE;
            } else {
                m00Var = new m00(this, abstractC0882xm);
            }
        } else {
            m00Var = new m00(this, abstractC0882xm);
        }
        ?? r9 = m00Var.f4942p;
        int i2 = m00Var.f4944r;
        try {
            if (i2 == 0) {
                wo1.m5395v(r9);
                if (this.f5574d.get()) {
                    C0270h1.m2191g("StorageConnection has already been disposed.");
                    return null;
                }
                boolean zM746e = this.f5575e.m746e();
                i00 i00Var2 = new i00(this.f5571a);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zM746e);
                    m00Var.f4939m = this;
                    m00Var.f4940n = i00Var2;
                    m00Var.f4941o = zM746e;
                    m00Var.f4944r = 1;
                    Object objMo928e = c0294hp.mo928e(i00Var2, boolValueOf, m00Var);
                    EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
                    if (objMo928e == enumC0513nn) {
                        return enumC0513nn;
                    }
                    o00Var = this;
                    z = zM746e ? 1 : 0;
                    r8 = objMo928e;
                    i00Var = i00Var2;
                    i00Var.close();
                    th = null;
                    if (th != null) {
                        throw th;
                    }
                    if (z) {
                        o00Var.f5575e.m748g(null);
                    }
                    return r8;
                } catch (Throwable th2) {
                    th = th2;
                    i00Var = i00Var2;
                    r9 = zM746e;
                    i00Var.close();
                    throw th;
                }
            }
            if (i2 != 1) {
                C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = m00Var.f4941o;
            i00Var = m00Var.f4940n;
            o00Var = m00Var.f4939m;
            try {
                wo1.m5395v(r9);
                r8 = r9;
                try {
                    i00Var.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
                if (th != null) {
                    if (z) {
                        o00Var.f5575e.m748g(null);
                    }
                    return r8;
                }
                try {
                    throw th;
                } catch (Throwable th4) {
                    th = th4;
                    r9 = z;
                    this = o00Var;
                }
            } catch (Throwable th5) {
                r9 = z ? 1 : 0;
                this = o00Var;
                th = th5;
                try {
                    i00Var.close();
                    throw th;
                } catch (Throwable th6) {
                    vt1.m5190a(th, th6);
                    throw th;
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
        if (r9 != 0) {
            this.f5575e.m748g(null);
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ca A[Catch: all -> 0x0106, IOException -> 0x0108, TRY_ENTER, TryCatch #1 {IOException -> 0x0108, blocks: (B:43:0x00ca, B:45:0x00d0, B:48:0x00e5, B:49:0x0105, B:56:0x0111, B:63:0x011e, B:62:0x011b), top: B:75:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d0 A[Catch: all -> 0x0106, IOException -> 0x0108, TRY_LEAVE, TryCatch #1 {IOException -> 0x0108, blocks: (B:43:0x00ca, B:45:0x00d0, B:48:0x00e5, B:49:0x0105, B:56:0x0111, B:63:0x011e, B:62:0x011b), top: B:75:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0111 A[Catch: all -> 0x0106, IOException -> 0x0108, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x0108, blocks: (B:43:0x00ca, B:45:0x00d0, B:48:0x00e5, B:49:0x0105, B:56:0x0111, B:63:0x011e, B:62:0x011b), top: B:75:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [br0, int] */
    /* JADX INFO: renamed from: b */
    public final Object m3611b(C0811vp c0811vp, AbstractC0882xm abstractC0882xm) {
        n00 n00Var;
        File file;
        br0 br0Var;
        v60 v60Var;
        q00 q00Var;
        Throwable th;
        q00 q00Var2;
        o00 o00Var;
        File file2;
        if (abstractC0882xm instanceof n00) {
            n00Var = (n00) abstractC0882xm;
            int i = n00Var.f5227s;
            if ((i & Integer.MIN_VALUE) != 0) {
                n00Var.f5227s = i - Integer.MIN_VALUE;
            } else {
                n00Var = new n00(this, abstractC0882xm);
            }
        } else {
            n00Var = new n00(this, abstractC0882xm);
        }
        Object obj = n00Var.f5225q;
        ?? r2 = n00Var.f5227s;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        try {
            try {
                try {
                    try {
                        if (r2 == 0) {
                            wo1.m5395v(obj);
                            if (this.f5574d.get()) {
                                C0270h1.m2191g("StorageConnection has already been disposed.");
                                return null;
                            }
                            File file3 = this.f5571a;
                            File parentFile = file3.getCanonicalFile().getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                                if (!parentFile.isDirectory()) {
                                    C0042ay.m530g(file3, "Unable to create parent directories of ");
                                    return null;
                                }
                            }
                            n00Var.f5221m = this;
                            n00Var.f5222n = c0811vp;
                            br0 br0Var2 = this.f5575e;
                            n00Var.f5223o = br0Var2;
                            n00Var.f5227s = 1;
                            if (br0Var2.m745d(n00Var) != enumC0513nn) {
                                br0Var = br0Var2;
                                v60Var = c0811vp;
                            }
                            return enumC0513nn;
                        }
                        if (r2 != 1) {
                            if (r2 != 2) {
                                C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            q00Var2 = n00Var.f5224p;
                            File file4 = (File) n00Var.f5223o;
                            br0Var = (br0) n00Var.f5222n;
                            o00Var = n00Var.f5221m;
                            try {
                                wo1.m5395v(obj);
                                file2 = file4;
                                try {
                                    q00Var2.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists()) {
                                    try {
                                        Files.move(file2.toPath(), o00Var.f5571a.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                    } catch (IOException unused) {
                                        throw new IOException("Unable to rename " + file2 + " to " + o00Var.f5571a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                }
                                br0Var.m748g(null);
                                return kf1.f4365a;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    q00Var2.close();
                                } catch (Throwable th4) {
                                    vt1.m5190a(th, th4);
                                }
                                throw th;
                            }
                        }
                        br0 br0Var3 = (br0) n00Var.f5223o;
                        v60 v60Var2 = (v60) n00Var.f5222n;
                        o00 o00Var2 = n00Var.f5221m;
                        wo1.m5395v(obj);
                        br0Var = br0Var3;
                        this = o00Var2;
                        v60Var = v60Var2;
                        n00Var.f5221m = this;
                        n00Var.f5222n = br0Var;
                        n00Var.f5223o = file;
                        n00Var.f5224p = q00Var;
                        n00Var.f5227s = 2;
                        if (v60Var.mo1490g(q00Var, n00Var) != enumC0513nn) {
                            o00Var = this;
                            file2 = file;
                            q00Var2 = q00Var;
                            q00Var2.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (file2.exists()) {
                                Files.move(file2.toPath(), o00Var.f5571a.toPath(), StandardCopyOption.REPLACE_EXISTING);
                            }
                            br0Var.m748g(null);
                            return kf1.f4365a;
                        }
                        return enumC0513nn;
                    } catch (Throwable th5) {
                        th = th5;
                        q00Var2 = q00Var;
                        q00Var2.close();
                        throw th;
                    }
                    q00Var = new q00(file);
                } catch (IOException e) {
                    e = e;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(this.f5571a.getAbsolutePath() + ".tmp");
            } catch (IOException e2) {
                e = e2;
                file = c0811vp;
            }
        } catch (Throwable th6) {
            r2.m748g(null);
            throw th6;
        }
    }

    @Override // p000.InterfaceC0803vh
    public final void close() {
        this.f5574d.set(true);
        this.f5573c.mo1083a();
    }
}
