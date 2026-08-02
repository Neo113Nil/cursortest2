package androidx.dynamicanimation.animation;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.Z;
import java.util.ArrayList;

/* loaded from: classes8.dex */
final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadLocal<a> f42632f = new ThreadLocal<>();

    /* renamed from: d, reason: collision with root package name */
    private d f42636d;

    /* renamed from: a, reason: collision with root package name */
    private final Z<b, Long> f42633a = new Z<>();

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<b> f42634b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final C0781a f42635c = new C0781a();

    /* renamed from: e, reason: collision with root package name */
    private boolean f42637e = false;

    /* renamed from: androidx.dynamicanimation.animation.a$a, reason: collision with other inner class name */
    class C0781a {
        C0781a() {
        }
    }

    interface b {
        boolean a(long j11);
    }

    static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final C0781a f42639a;

        c(C0781a c0781a) {
            this.f42639a = c0781a;
        }

        abstract void a();
    }

    private static class d extends c {

        /* renamed from: b, reason: collision with root package name */
        private final Choreographer f42640b;

        /* renamed from: c, reason: collision with root package name */
        private final Choreographer.FrameCallback f42641c;

        /* renamed from: androidx.dynamicanimation.animation.a$d$a, reason: collision with other inner class name */
        final class ChoreographerFrameCallbackC0782a implements Choreographer.FrameCallback {
            ChoreographerFrameCallbackC0782a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j11) {
                C0781a c0781a = d.this.f42639a;
                c0781a.getClass();
                long uptimeMillis = SystemClock.uptimeMillis();
                a aVar = a.this;
                aVar.a(uptimeMillis);
                if (aVar.f42634b.size() > 0) {
                    aVar.b().a();
                }
            }
        }

        d(C0781a c0781a) {
            super(c0781a);
            this.f42640b = Choreographer.getInstance();
            this.f42641c = new ChoreographerFrameCallbackC0782a();
        }

        @Override // androidx.dynamicanimation.animation.a.c
        final void a() {
            this.f42640b.postFrameCallback(this.f42641c);
        }
    }

    a() {
    }

    final void a(long j11) {
        ArrayList<b> arrayList;
        long uptimeMillis = SystemClock.uptimeMillis();
        int i11 = 0;
        while (true) {
            arrayList = this.f42634b;
            if (i11 >= arrayList.size()) {
                break;
            }
            b bVar = arrayList.get(i11);
            if (bVar != null) {
                Z<b, Long> z11 = this.f42633a;
                Long l11 = z11.get(bVar);
                if (l11 != null) {
                    if (l11.longValue() < uptimeMillis) {
                        z11.remove(bVar);
                    }
                }
                bVar.a(j11);
            }
            i11++;
        }
        if (this.f42637e) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            }
            this.f42637e = false;
        }
    }

    final c b() {
        if (this.f42636d == null) {
            this.f42636d = new d(this.f42635c);
        }
        return this.f42636d;
    }

    public final void c(androidx.dynamicanimation.animation.b bVar) {
        this.f42633a.remove(bVar);
        ArrayList<b> arrayList = this.f42634b;
        int indexOf = arrayList.indexOf(bVar);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
            this.f42637e = true;
        }
    }
}
