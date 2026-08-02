package We;

import af.C5015e;
import gd.InterfaceC6712a;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: We.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4863e implements Iterator<String>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    private final af.i f33714a;

    /* renamed from: b, reason: collision with root package name */
    private String f33715b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f33716c;

    C4863e(C4862d c4862d) {
        this.f33714a = c4862d.d().Z();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f33715b != null) {
            return true;
        }
        this.f33716c = false;
        while (true) {
            af.i iVar = this.f33714a;
            if (!iVar.hasNext()) {
                return false;
            }
            try {
                Closeable closeable = (Closeable) iVar.next();
                try {
                    continue;
                    this.f33715b = sf.z.d(((C5015e.c) closeable).d(0)).s(Long.MAX_VALUE);
                    closeable.close();
                    return true;
                } finally {
                    try {
                        continue;
                    } catch (Throwable th2) {
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // java.util.Iterator
    public final String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f33715b;
        Intrinsics.f(str);
        this.f33715b = null;
        this.f33716c = true;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f33716c) {
            throw new IllegalStateException("remove() before next()");
        }
        this.f33714a.remove();
    }
}
