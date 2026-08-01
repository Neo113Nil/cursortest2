package com.fyber.inneractive.sdk.player.cache;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final e f5522a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ g d;

    public d(g gVar, e eVar) {
        this.d = gVar;
        this.f5522a = eVar;
        this.b = eVar.c ? null : new boolean[gVar.g];
    }

    public final void a(byte[] bArr) {
        OutputStream outputStream;
        FileOutputStream fileOutputStream;
        g gVar = this.d;
        if (gVar.g <= 0) {
            throw new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + this.d.g);
        }
        synchronized (gVar) {
            e eVar = this.f5522a;
            if (eVar.d != this) {
                throw new IllegalStateException();
            }
            if (!eVar.c) {
                this.b[0] = true;
            }
            File b = eVar.b(0);
            try {
                fileOutputStream = new FileOutputStream(b);
            } catch (FileNotFoundException unused) {
                this.d.f5524a.mkdirs();
                try {
                    fileOutputStream = new FileOutputStream(b);
                } catch (FileNotFoundException unused2) {
                    outputStream = g.q;
                }
            }
            outputStream = new c(this, fileOutputStream);
        }
        try {
            outputStream.write(bArr);
            Charset charset = l.f5528a;
            try {
                outputStream.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused3) {
            }
        } catch (Throwable th) {
            Charset charset2 = l.f5528a;
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception unused4) {
                }
            }
            throw th;
        }
    }

    public final void a() {
        if (this.c) {
            g.a(this.d, this, false);
            this.d.c(this.f5522a.f5523a);
        } else {
            g.a(this.d, this, true);
        }
    }
}
