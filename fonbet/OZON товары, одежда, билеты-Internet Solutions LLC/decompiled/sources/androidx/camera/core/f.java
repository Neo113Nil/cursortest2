package androidx.camera.core;

import C.L;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.camera.core.p;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes8.dex */
public abstract class f implements p {

    /* renamed from: b, reason: collision with root package name */
    protected final p f38083b;

    /* renamed from: a, reason: collision with root package name */
    private final Object f38082a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final HashSet f38084c = new HashSet();

    public interface a {
        void h(@NonNull f fVar);
    }

    protected f(@NonNull p pVar) {
        this.f38083b = pVar;
    }

    public final void c(@NonNull a aVar) {
        synchronized (this.f38082a) {
            this.f38084c.add(aVar);
        }
    }

    @Override // androidx.camera.core.p
    @NonNull
    public final p.a[] c0() {
        return this.f38083b.c0();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        HashSet hashSet;
        this.f38083b.close();
        synchronized (this.f38082a) {
            hashSet = new HashSet(this.f38084c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).h(this);
        }
    }

    @Override // androidx.camera.core.p
    public final int g() {
        return this.f38083b.g();
    }

    @Override // androidx.camera.core.p
    public int getHeight() {
        return this.f38083b.getHeight();
    }

    @Override // androidx.camera.core.p
    public final Image getImage() {
        return this.f38083b.getImage();
    }

    @Override // androidx.camera.core.p
    public int getWidth() {
        return this.f38083b.getWidth();
    }

    @Override // androidx.camera.core.p
    @NonNull
    public L x0() {
        return this.f38083b.x0();
    }
}
