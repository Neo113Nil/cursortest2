package io.appmetrica.analytics.impl;

import android.content.Context;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* renamed from: io.appmetrica.analytics.impl.u6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0874u6 {

    /* renamed from: a, reason: collision with root package name */
    public final C0542ha f8388a;

    /* renamed from: b, reason: collision with root package name */
    public final C0667m6 f8389b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f8390c;

    /* renamed from: d, reason: collision with root package name */
    public final C0516ga f8391d;

    public C0874u6(Context context) {
        this(context, new C0542ha(), new C0667m6(), C0516ga.a(context));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:3|(5:(10:5|(2:7|(1:9)(1:13))|14|15|16|18|19|20|98|25)(1:34)|18|19|20|98)|(1:11)|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Ah ah) {
        boolean mkdir;
        String str;
        E9 b3;
        PrintWriter printWriter;
        C0516ga c0516ga;
        File crashesDirectory = FileUtils.getCrashesDirectory(this.f8390c);
        this.f8389b.getClass();
        if (crashesDirectory == null) {
            return;
        }
        try {
            if (crashesDirectory.exists()) {
                if (!crashesDirectory.isDirectory()) {
                    if (!crashesDirectory.delete()) {
                        return;
                    } else {
                        mkdir = crashesDirectory.mkdir();
                    }
                }
                Gf gf = ah.f5703e.f6382a;
                str = gf.f5992a.getAsInteger("PROCESS_CFG_PROCESS_ID") + TokenBuilder.TOKEN_DELIMITER + gf.f5992a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
                b3 = this.f8391d.b(str);
                b3.f5904a.lock();
                b3.f5905b.a();
                this.f8388a.getClass();
                printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
                printWriter.write(new C0776qb(ah.f5699a, ah.f5703e, ah.f5702d).k());
                AbstractC0711no.a((Closeable) printWriter);
                b3.c();
                c0516ga = this.f8391d;
                synchronized (c0516ga) {
                    c0516ga.f7366b.remove(str);
                }
                return;
            }
            mkdir = crashesDirectory.mkdir();
            printWriter.write(new C0776qb(ah.f5699a, ah.f5703e, ah.f5702d).k());
            AbstractC0711no.a((Closeable) printWriter);
            b3.c();
            c0516ga = this.f8391d;
            synchronized (c0516ga) {
            }
        } catch (Throwable unused) {
            AbstractC0711no.a((Closeable) printWriter);
            b3.c();
            this.f8391d.a(str);
            return;
        }
        if (!mkdir) {
            return;
        }
        Gf gf2 = ah.f5703e.f6382a;
        str = gf2.f5992a.getAsInteger("PROCESS_CFG_PROCESS_ID") + TokenBuilder.TOKEN_DELIMITER + gf2.f5992a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
        b3 = this.f8391d.b(str);
        b3.f5904a.lock();
        b3.f5905b.a();
        this.f8388a.getClass();
        printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
    }

    public C0874u6(Context context, C0542ha c0542ha, C0667m6 c0667m6, C0516ga c0516ga) {
        this.f8390c = context;
        this.f8388a = c0542ha;
        this.f8389b = c0667m6;
        this.f8391d = c0516ga;
    }
}
