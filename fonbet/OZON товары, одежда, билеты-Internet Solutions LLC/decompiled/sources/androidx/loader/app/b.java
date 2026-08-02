package androidx.loader.app;

import U7.d;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.collection.a0;
import androidx.collection.b0;
import androidx.lifecycle.A0;
import androidx.lifecycle.J;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.loader.app.a;
import androidx.loader.content.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends androidx.loader.app.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final Object f43420a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final c f43421b;

    /* loaded from: classes8.dex */
    public static class a<D> extends V<D> implements b.InterfaceC0804b<D> {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final androidx.loader.content.b<D> f43422a;

        /* renamed from: b, reason: collision with root package name */
        private Object f43423b;

        /* renamed from: c, reason: collision with root package name */
        private C0802b<D> f43424c;

        a(@NonNull androidx.loader.content.b bVar) {
            this.f43422a = bVar;
            bVar.registerListener(0, this);
        }

        final void a() {
            androidx.loader.content.b<D> bVar = this.f43422a;
            bVar.cancelLoad();
            bVar.abandon();
            C0802b<D> c0802b = this.f43424c;
            if (c0802b != null) {
                removeObserver(c0802b);
                c0802b.c();
            }
            bVar.unregisterListener(this);
            if (c0802b != null) {
                c0802b.b();
            }
            bVar.reset();
        }

        public final void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str);
            printWriter.print("mLoader=");
            androidx.loader.content.b<D> bVar = this.f43422a;
            printWriter.println(bVar);
            bVar.dump(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f43424c != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f43424c);
                this.f43424c.a(d.e(str, "  "), printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(bVar.dataToString(getValue()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.J, java.lang.Object] */
        final void c() {
            ?? r02 = this.f43423b;
            C0802b<D> c0802b = this.f43424c;
            if (r02 == 0 || c0802b == null) {
                return;
            }
            super.removeObserver(c0802b);
            observe(r02, c0802b);
        }

        @NonNull
        final androidx.loader.content.b<D> d(@NonNull J j11, @NonNull a.InterfaceC0801a<D> interfaceC0801a) {
            androidx.loader.content.b<D> bVar = this.f43422a;
            C0802b<D> c0802b = new C0802b<>(bVar, interfaceC0801a);
            observe(j11, c0802b);
            C0802b<D> c0802b2 = this.f43424c;
            if (c0802b2 != null) {
                removeObserver(c0802b2);
            }
            this.f43423b = j11;
            this.f43424c = c0802b;
            return bVar;
        }

        @Override // androidx.lifecycle.P
        protected final void onActive() {
            this.f43422a.startLoading();
        }

        @Override // androidx.lifecycle.P
        protected final void onInactive() {
            this.f43422a.stopLoading();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.P
        public final void removeObserver(@NonNull W<? super D> w11) {
            super.removeObserver(w11);
            this.f43423b = null;
            this.f43424c = null;
        }

        @NonNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #0 : ");
            Class<?> cls = this.f43422a.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    static class C0802b<D> implements W<D> {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final androidx.loader.content.b<D> f43425a;

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        private final a.InterfaceC0801a<D> f43426b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f43427c = false;

        C0802b(@NonNull androidx.loader.content.b<D> bVar, @NonNull a.InterfaceC0801a<D> interfaceC0801a) {
            this.f43425a = bVar;
            this.f43426b = interfaceC0801a;
        }

        public final void a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f43427c);
        }

        final boolean b() {
            return this.f43427c;
        }

        final void c() {
            if (this.f43427c) {
                this.f43426b.onLoaderReset(this.f43425a);
            }
        }

        @Override // androidx.lifecycle.W
        public final void onChanged(D d11) {
            this.f43427c = true;
            this.f43426b.onLoadFinished(this.f43425a, d11);
        }

        @NonNull
        public final String toString() {
            return this.f43426b.toString();
        }
    }

    static class c extends w0 {

        /* renamed from: c, reason: collision with root package name */
        private static final z0.b f43428c = new a();

        /* renamed from: a, reason: collision with root package name */
        private a0<a> f43429a = new a0<>();

        /* renamed from: b, reason: collision with root package name */
        private boolean f43430b = false;

        static class a implements z0.b {
            @Override // androidx.lifecycle.z0.b
            @NonNull
            public final <T extends w0> T create(@NonNull Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        @NonNull
        static c f0(A0 a02) {
            return (c) new z0(a02, f43428c).a(c.class);
        }

        public final void d0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            a0<a> a0Var = this.f43429a;
            if (a0Var.e() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i11 = 0; i11 < a0Var.e(); i11++) {
                    a f7 = a0Var.f(i11);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(a0Var.c(i11));
                    printWriter.print(": ");
                    printWriter.println(f7.toString());
                    f7.b(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        final void e0() {
            this.f43430b = false;
        }

        final a g0() {
            a0<a> a0Var = this.f43429a;
            a0Var.getClass();
            return (a) b0.c(a0Var, 0);
        }

        final boolean h0() {
            return this.f43430b;
        }

        final void i0() {
            a0<a> a0Var = this.f43429a;
            int e11 = a0Var.e();
            for (int i11 = 0; i11 < e11; i11++) {
                a0Var.f(i11).c();
            }
        }

        final void j0(@NonNull a aVar) {
            this.f43429a.d(0, aVar);
        }

        final void k0() {
            this.f43430b = true;
        }

        @Override // androidx.lifecycle.w0
        protected final void onCleared() {
            super.onCleared();
            a0<a> a0Var = this.f43429a;
            int e11 = a0Var.e();
            for (int i11 = 0; i11 < e11; i11++) {
                a0Var.f(i11).a();
            }
            int i12 = a0Var.f38687d;
            Object[] objArr = a0Var.f38686c;
            for (int i13 = 0; i13 < i12; i13++) {
                objArr[i13] = null;
            }
            a0Var.f38687d = 0;
            a0Var.f38684a = false;
        }
    }

    b(@NonNull J j11, @NonNull A0 a02) {
        this.f43420a = j11;
        this.f43421b = c.f0(a02);
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f43421b.d0(str, fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.J, java.lang.Object] */
    @Override // androidx.loader.app.a
    @NonNull
    public final androidx.loader.content.b c(@NonNull a.InterfaceC0801a interfaceC0801a) {
        c cVar = this.f43421b;
        if (cVar.h0()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a g02 = cVar.g0();
        ?? r22 = this.f43420a;
        if (g02 != 0) {
            return g02.d(r22, interfaceC0801a);
        }
        try {
            cVar.k0();
            androidx.loader.content.b onCreateLoader = interfaceC0801a.onCreateLoader(0, null);
            if (onCreateLoader == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (onCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + onCreateLoader);
            }
            a aVar = new a(onCreateLoader);
            cVar.j0(aVar);
            cVar.e0();
            return aVar.d(r22, interfaceC0801a);
        } catch (Throwable th2) {
            cVar.e0();
            throw th2;
        }
    }

    @Override // androidx.loader.app.a
    public final void d() {
        this.f43421b.i0();
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Class<?> cls = this.f43420a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
