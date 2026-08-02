package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class KB implements Cloneable {

    /* renamed from: k, reason: collision with root package name */
    public final MB f10140k;

    /* renamed from: l, reason: collision with root package name */
    public MB f10141l;

    public KB(MB mb) {
        this.f10140k = mb;
        if (mb.r()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f10141l = mb.n();
    }

    public static void g(int i, List list) {
        String l5 = L1.a.l(list.size() - i, "Element at index ", " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new NullPointerException(l5);
            }
            list.remove(size);
        }
    }

    public final void a(byte[] bArr, GB gb) {
        int length = bArr.length;
        e();
        try {
            C1285mC.f14484c.a(this.f10141l.getClass()).f(this.f10141l, bArr, 0, length, new C1598tB(gb));
        } catch (XB e3) {
            throw e3;
        } catch (IOException e5) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e5);
        } catch (IndexOutOfBoundsException unused) {
            throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final MB b() {
        MB c5 = c();
        c5.getClass();
        if (MB.v(c5, true)) {
            return c5;
        }
        throw new C1734wC();
    }

    public final MB c() {
        if (!this.f10141l.r()) {
            return this.f10141l;
        }
        MB mb = this.f10141l;
        mb.getClass();
        C1285mC.f14484c.a(mb.getClass()).a(mb);
        mb.j();
        return this.f10141l;
    }

    public final Object clone() {
        KB kb = (KB) this.f10140k.s(5, null);
        kb.f10141l = c();
        return kb;
    }

    public final void e() {
        if (this.f10141l.r()) {
            return;
        }
        MB n5 = this.f10140k.n();
        C1285mC.f14484c.a(n5.getClass()).d(n5, this.f10141l);
        this.f10141l = n5;
    }
}
