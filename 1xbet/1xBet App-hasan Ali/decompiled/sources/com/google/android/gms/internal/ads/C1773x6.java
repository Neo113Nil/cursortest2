package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.x6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1773x6 {

    /* renamed from: a, reason: collision with root package name */
    public final D3.l f16226a;

    /* renamed from: b, reason: collision with root package name */
    public final C1594t7 f16227b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16228c;

    public C1773x6() {
        this.f16227b = C1639u7.H();
        this.f16228c = false;
        this.f16226a = new D3.l(5);
    }

    public final synchronized void a(InterfaceC1728w6 interfaceC1728w6) {
        if (this.f16228c) {
            try {
                interfaceC1728w6.c(this.f16227b);
            } catch (NullPointerException e3) {
                P2.o.f4767B.f4774g.i("AdMobClearcutLogger.modify", e3);
            }
        }
    }

    public final synchronized void b(int i) {
        if (this.f16228c) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8720L4)).booleanValue()) {
                d(i);
            } else {
                e(i);
            }
        }
    }

    public final synchronized String c(int i) {
        StringBuilder sb;
        String E5 = ((C1639u7) this.f16227b.f10141l).E();
        P2.o.f4767B.f4776j.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String encodeToString = Base64.encodeToString(((C1639u7) this.f16227b.b()).d(), 3);
        sb = new StringBuilder("id=");
        sb.append(E5);
        sb.append(",timestamp=");
        sb.append(elapsedRealtime);
        sb.append(",event=");
        sb.append(i - 1);
        sb.append(",data=");
        sb.append(encodeToString);
        sb.append("\n");
        return sb.toString();
    }

    public final synchronized void d(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(new File(externalStorageDirectory, "clearcut_events.txt").getPath()), true);
            try {
                try {
                    fileOutputStream.write(c(i).getBytes());
                } catch (IOException unused) {
                    T2.G.m("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        T2.G.m("Could not close Clearcut output stream.");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    T2.G.m("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            T2.G.m("Could not find file for Clearcut");
        }
    }

    public final synchronized void e(int i) {
        C1594t7 c1594t7 = this.f16227b;
        c1594t7.e();
        C1639u7.x((C1639u7) c1594t7.f10141l);
        ArrayList y5 = T2.L.y();
        c1594t7.e();
        C1639u7.w((C1639u7) c1594t7.f10141l, y5);
        G3 g32 = new G3(this.f16226a, ((C1639u7) this.f16227b.b()).d());
        int i5 = i - 1;
        g32.f9165l = i5;
        g32.o();
        T2.G.m("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i5, 10))));
    }

    public C1773x6(D3.l lVar) {
        this.f16227b = C1639u7.H();
        this.f16226a = lVar;
        this.f16228c = ((Boolean) Q2.r.f5053d.f5056c.a(F7.f8714K4)).booleanValue();
    }
}
