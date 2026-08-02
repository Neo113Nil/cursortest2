package Ve;

import R2.C3909c;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Zm implements R2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Q1 f30612a;

    public Zm(Q1 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f30612a = delegate;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(InputStream inputStream, kotlin.coroutines.jvm.internal.c cVar) {
        Uk uk;
        int i11;
        if (cVar instanceof Uk) {
            uk = (Uk) cVar;
            int i12 = uk.f30134g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                uk.f30134g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = uk.f30132e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = uk.f30134g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    uk.f30131d = inputStream;
                    uk.f30134g = 1;
                    obj = U0.f30086a.b(uk);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    inputStream = uk.f30131d;
                    Sc.s.b(obj);
                }
                InputStream b11 = ((S7.s) obj).b(inputStream, new byte[0]);
                Intrinsics.checkNotNullExpressionValue(b11, "aead().newDecryptingStre…nputStream, ByteArray(0))");
                return b11;
            }
        }
        uk = new Uk(this, cVar);
        Object obj2 = uk.f30132e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = uk.f30134g;
        if (i11 != 0) {
        }
        InputStream b112 = ((S7.s) obj2).b(inputStream, new byte[0]);
        Intrinsics.checkNotNullExpressionValue(b112, "aead().newDecryptingStre…nputStream, ByteArray(0))");
        return b112;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(OutputStream outputStream, kotlin.coroutines.jvm.internal.c cVar) {
        C4766xl c4766xl;
        int i11;
        if (cVar instanceof C4766xl) {
            c4766xl = (C4766xl) cVar;
            int i12 = c4766xl.f32494g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4766xl.f32494g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4766xl.f32492e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4766xl.f32494g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    c4766xl.f32491d = outputStream;
                    c4766xl.f32494g = 1;
                    obj = U0.f30086a.b(c4766xl);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    outputStream = c4766xl.f32491d;
                    Sc.s.b(obj);
                }
                OutputStream a11 = ((S7.s) obj).a(outputStream, new byte[0]);
                Intrinsics.checkNotNullExpressionValue(a11, "aead().newEncryptingStre…tputStream, ByteArray(0))");
                return a11;
            }
        }
        c4766xl = new C4766xl(this, cVar);
        Object obj2 = c4766xl.f32492e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4766xl.f32494g;
        if (i11 != 0) {
        }
        OutputStream a112 = ((S7.s) obj2).a(outputStream, new byte[0]);
        Intrinsics.checkNotNullExpressionValue(a112, "aead().newEncryptingStre…tputStream, ByteArray(0))");
        return a112;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(InputStream inputStream, kotlin.coroutines.jvm.internal.c cVar) {
        Wl wl2;
        Wc.a aVar;
        int i11;
        Zm zm;
        Closeable closeable;
        Throwable th2;
        Closeable closeable2;
        Object a11;
        try {
            try {
                if (cVar instanceof Wl) {
                    wl2 = (Wl) cVar;
                    int i12 = wl2.f30294g;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        wl2.f30294g = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj = wl2.f30292e;
                        aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = wl2.f30294g;
                        if (i11 != 0) {
                            Sc.s.b(obj);
                            wl2.f30291d = this;
                            wl2.f30294g = 1;
                            obj = a(inputStream, wl2);
                            if (obj == aVar) {
                                return aVar;
                            }
                            zm = this;
                        } else {
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                closeable2 = (Closeable) wl2.f30291d;
                                try {
                                    Sc.s.b(obj);
                                    Vd0.b.a(closeable2, null);
                                    return obj;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    try {
                                        throw th2;
                                    } catch (Throwable th4) {
                                        Vd0.b.a(closeable2, th2);
                                        throw th4;
                                    }
                                }
                            }
                            zm = (Zm) wl2.f30291d;
                            Sc.s.b(obj);
                        }
                        closeable = (Closeable) obj;
                        Q1 q12 = zm.f30612a;
                        wl2.f30291d = closeable;
                        wl2.f30294g = 2;
                        a11 = q12.a((InputStream) closeable, wl2);
                        if (a11 != aVar) {
                            obj = a11;
                            closeable2 = closeable;
                            Vd0.b.a(closeable2, null);
                            return obj;
                        }
                        return aVar;
                    }
                }
                Q1 q122 = zm.f30612a;
                wl2.f30291d = closeable;
                wl2.f30294g = 2;
                a11 = q122.a((InputStream) closeable, wl2);
                if (a11 != aVar) {
                }
                return aVar;
            } catch (Throwable th5) {
                th2 = th5;
                closeable2 = closeable;
                throw th2;
            }
            if (i11 != 0) {
            }
            closeable = (Closeable) obj;
        } catch (Throwable th6) {
            Lm0.a.f17149a.e("DataStore decrypt failed with " + th6, new Object[0]);
            throw new C3909c("DataStore decryption failed with " + th6, th6);
        }
        wl2 = new Wl(this, cVar);
        Object obj2 = wl2.f30292e;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = wl2.f30294g;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, OutputStream outputStream, kotlin.coroutines.jvm.internal.c cVar) {
        C4767xm c4767xm;
        Wc.a aVar;
        int i11;
        Zm zm;
        Closeable closeable;
        Closeable closeable2;
        Q1 q12;
        try {
            try {
                if (cVar instanceof C4767xm) {
                    c4767xm = (C4767xm) cVar;
                    int i12 = c4767xm.f32499h;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c4767xm.f32499h = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c4767xm.f32497f;
                        aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c4767xm.f32499h;
                        if (i11 != 0) {
                            Sc.s.b(obj2);
                            c4767xm.f32495d = this;
                            c4767xm.f32496e = obj;
                            c4767xm.f32499h = 1;
                            obj2 = b(outputStream, c4767xm);
                            if (obj2 == aVar) {
                                return aVar;
                            }
                            zm = this;
                        } else {
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                closeable2 = (Closeable) c4767xm.f32495d;
                                try {
                                    Sc.s.b(obj2);
                                    Unit unit = Unit.f71690a;
                                    Vd0.b.a(closeable2, null);
                                    return unit;
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        Vd0.b.a(closeable2, th);
                                        throw th3;
                                    }
                                }
                            }
                            obj = c4767xm.f32496e;
                            zm = (Zm) c4767xm.f32495d;
                            Sc.s.b(obj2);
                        }
                        closeable = (Closeable) obj2;
                        q12 = zm.f30612a;
                        c4767xm.f32495d = closeable;
                        c4767xm.f32496e = null;
                        c4767xm.f32499h = 2;
                        if (q12.b(obj, (OutputStream) closeable, c4767xm) != aVar) {
                            closeable2 = closeable;
                            Unit unit2 = Unit.f71690a;
                            Vd0.b.a(closeable2, null);
                            return unit2;
                        }
                        return aVar;
                    }
                }
                q12 = zm.f30612a;
                c4767xm.f32495d = closeable;
                c4767xm.f32496e = null;
                c4767xm.f32499h = 2;
                if (q12.b(obj, (OutputStream) closeable, c4767xm) != aVar) {
                }
                return aVar;
            } catch (Throwable th4) {
                th = th4;
                closeable2 = closeable;
                throw th;
            }
            if (i11 != 0) {
            }
            closeable = (Closeable) obj2;
        } catch (Throwable th5) {
            Lm0.a.f17149a.e("DataStore encrypt failed with " + th5, new Object[0]);
            throw new C3909c("DataStore encryption failed with " + th5, th5);
        }
        c4767xm = new C4767xm(this, cVar);
        Object obj22 = c4767xm.f32497f;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4767xm.f32499h;
    }
}
