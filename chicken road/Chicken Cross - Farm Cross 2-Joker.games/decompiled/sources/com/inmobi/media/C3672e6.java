package com.inmobi.media;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: com.inmobi.media.e6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3672e6 {

    /* renamed from: a, reason: collision with root package name */
    public final C3701f6 f7081a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ C3786i6 d;

    public C3672e6(C3786i6 c3786i6, C3701f6 c3701f6) {
        this.d = c3786i6;
        this.f7081a = c3701f6;
        this.b = c3701f6.c ? null : new boolean[c3786i6.h];
    }

    public final OutputStream a(int i) {
        FileOutputStream fileOutputStream;
        C3645d6 c3645d6;
        synchronized (this.d) {
            C3701f6 c3701f6 = this.f7081a;
            if (c3701f6.d != this) {
                throw new IllegalStateException();
            }
            if (!c3701f6.c) {
                this.b[i] = true;
            }
            File b = c3701f6.b(i);
            try {
                fileOutputStream = new FileOutputStream(b);
            } catch (FileNotFoundException unused) {
                this.d.b.mkdirs();
                try {
                    fileOutputStream = new FileOutputStream(b);
                } catch (FileNotFoundException unused2) {
                    return C3786i6.q;
                }
            }
            c3645d6 = new C3645d6(this, fileOutputStream);
        }
        return c3645d6;
    }
}
