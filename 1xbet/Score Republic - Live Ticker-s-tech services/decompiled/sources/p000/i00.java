package p000;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class i00 implements InterfaceC0803vh {

    /* JADX INFO: renamed from: a */
    public final File f3367a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f3368b = new AtomicBoolean(false);

    public i00(File file) {
        this.f3367a = file;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [i00] */
    /* JADX WARN: Type inference failed for: r8v0, types: [i00, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [i00] */
    /* JADX INFO: renamed from: a */
    public static Object m2357a(i00 i00Var, AbstractC0882xm abstractC0882xm) throws IOException {
        h00 h00Var;
        FileInputStream fileInputStream;
        Throwable th;
        Closeable closeable;
        zq0 zq0VarM5304r;
        FileInputStream fileInputStream2;
        Throwable th2;
        if (abstractC0882xm instanceof h00) {
            h00Var = (h00) abstractC0882xm;
            int i = h00Var.f2984q;
            if ((i & Integer.MIN_VALUE) != 0) {
                h00Var.f2984q = i - Integer.MIN_VALUE;
            } else {
                h00Var = new h00(i00Var, abstractC0882xm);
            }
        } else {
            h00Var = new h00(i00Var, abstractC0882xm);
        }
        Object obj = h00Var.f2982o;
        ?? r1 = h00Var.f2984q;
        boolean z = true;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        try {
            if (r1 != 0) {
                if (r1 == 1) {
                    fileInputStream2 = h00Var.f2981n;
                    r1 = (i00) h00Var.f2980m;
                    try {
                        wo1.m5395v(obj);
                        vk1.m5166a(fileInputStream2, null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            vk1.m5166a(fileInputStream2, th2);
                            throw th4;
                        }
                    }
                }
                if (r1 != 2) {
                    C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                closeable = (Closeable) h00Var.f2980m;
                try {
                    wo1.m5395v(obj);
                    vk1.m5166a(closeable, null);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        vk1.m5166a(closeable, th);
                        throw th6;
                    }
                }
            }
            wo1.m5395v(obj);
            if (i00Var.f3368b.get()) {
                C0270h1.m2191g("This scope has already been closed.");
                return null;
            }
            try {
                FileInputStream fileInputStream3 = new FileInputStream(i00Var.f3367a);
                try {
                    h00Var.f2980m = i00Var;
                    h00Var.f2981n = fileInputStream3;
                    h00Var.f2984q = 1;
                    zq0 zq0VarM5304r2 = wa0.m5304r(fileInputStream3);
                    if (zq0VarM5304r2 != enumC0513nn) {
                        fileInputStream2 = fileInputStream3;
                        obj = zq0VarM5304r2;
                        vk1.m5166a(fileInputStream2, null);
                        return obj;
                    }
                    return enumC0513nn;
                } catch (Throwable th7) {
                    r1 = i00Var;
                    fileInputStream2 = fileInputStream3;
                    th2 = th7;
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                if (i00Var.f3367a.exists()) {
                    return new zq0(z);
                }
                fileInputStream = new FileInputStream(i00Var.f3367a);
                try {
                    h00Var.f2980m = fileInputStream;
                    h00Var.f2981n = null;
                    h00Var.f2984q = 2;
                    zq0VarM5304r = wa0.m5304r(fileInputStream);
                    if (zq0VarM5304r != enumC0513nn) {
                        obj = zq0VarM5304r;
                        closeable = fileInputStream;
                        vk1.m5166a(closeable, null);
                        return obj;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    closeable = fileInputStream;
                    throw th;
                }
            }
        } catch (FileNotFoundException unused2) {
            i00Var = r1;
            if (i00Var.f3367a.exists()) {
                return new zq0(z);
            }
            fileInputStream = new FileInputStream(i00Var.f3367a);
            h00Var.f2980m = fileInputStream;
            h00Var.f2981n = null;
            h00Var.f2984q = 2;
            zq0VarM5304r = wa0.m5304r(fileInputStream);
            if (zq0VarM5304r != enumC0513nn) {
                obj = zq0VarM5304r;
                closeable = fileInputStream;
                vk1.m5166a(closeable, null);
                return obj;
            }
            return enumC0513nn;
        }
    }

    @Override // p000.InterfaceC0803vh
    public final void close() {
        this.f3368b.set(true);
    }
}
