package Gc;

import hg.InterfaceC6949b;
import hg.InterfaceC6950c;
import io.reactivex.w;
import java.io.Serializable;
import nc.InterfaceC8487b;
import sc.C9656b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ k[] $VALUES;
    public static final k COMPLETE;

    /* loaded from: classes9.dex */
    static final class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC8487b f9908a;

        a(InterfaceC8487b interfaceC8487b) {
            this.f9908a = interfaceC8487b;
        }

        public final String toString() {
            return "NotificationLite.Disposable[" + this.f9908a + "]";
        }
    }

    static final class b implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Throwable f9909a;

        b(Throwable th2) {
            this.f9909a = th2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return C9656b.a(this.f9909a, ((b) obj).f9909a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f9909a.hashCode();
        }

        public final String toString() {
            return "NotificationLite.Error[" + this.f9909a + "]";
        }
    }

    /* loaded from: classes9.dex */
    static final class c implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC6950c f9910a;

        c(InterfaceC6950c interfaceC6950c) {
            this.f9910a = interfaceC6950c;
        }

        public final String toString() {
            return "NotificationLite.Subscription[" + this.f9910a + "]";
        }
    }

    static {
        k kVar = new k("COMPLETE", 0);
        COMPLETE = kVar;
        $VALUES = new k[]{kVar};
    }

    private k() {
        throw null;
    }

    public static boolean a(w wVar, Object obj) {
        if (obj == COMPLETE) {
            wVar.onComplete();
            return true;
        }
        if (obj instanceof b) {
            wVar.onError(((b) obj).f9909a);
            return true;
        }
        wVar.onNext(obj);
        return false;
    }

    public static <T> boolean b(Object obj, InterfaceC6949b<? super T> interfaceC6949b) {
        if (obj == COMPLETE) {
            interfaceC6949b.onComplete();
            return true;
        }
        if (obj instanceof b) {
            interfaceC6949b.onError(((b) obj).f9909a);
            return true;
        }
        interfaceC6949b.onNext(obj);
        return false;
    }

    public static boolean d(w wVar, Object obj) {
        if (obj == COMPLETE) {
            wVar.onComplete();
            return true;
        }
        if (obj instanceof b) {
            wVar.onError(((b) obj).f9909a);
            return true;
        }
        if (obj instanceof a) {
            wVar.onSubscribe(((a) obj).f9908a);
            return false;
        }
        wVar.onNext(obj);
        return false;
    }

    public static Object e(InterfaceC8487b interfaceC8487b) {
        return new a(interfaceC8487b);
    }

    public static Object f(Throwable th2) {
        return new b(th2);
    }

    public static Throwable g(Object obj) {
        return ((b) obj).f9909a;
    }

    public static boolean h(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean i(Object obj) {
        return obj instanceof b;
    }

    public static Object j(InterfaceC6950c interfaceC6950c) {
        return new c(interfaceC6950c);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
