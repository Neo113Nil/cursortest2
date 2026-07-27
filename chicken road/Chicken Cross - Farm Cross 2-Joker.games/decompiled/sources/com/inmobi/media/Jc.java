package com.inmobi.media;

import android.content.Context;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class Jc {

    /* renamed from: a, reason: collision with root package name */
    public final String f6649a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    public final WeakReference f;
    public final AtomicBoolean g;

    public Jc(Context context, String url, long j, long j2, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f6649a = url;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = i2;
        WeakReference weakReference = new WeakReference(context);
        this.f = weakReference;
        this.g = new AtomicBoolean(false);
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            CoroutineScope coroutineScope = Sc.f6848a;
            Rc.a(new Ic(this, context2, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, ContinuationImpl continuationImpl) {
        Fc fc;
        int i;
        Context context2;
        Iterator it;
        if (continuationImpl instanceof Fc) {
            fc = (Fc) continuationImpl;
            int i2 = fc.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fc.e = i2 - Integer.MIN_VALUE;
                Object obj = fc.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fc.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.g.get()) {
                        return Unit.INSTANCE;
                    }
                    C4213xc c4213xc = (C4213xc) AbstractC4240yc.f7500a.getValue();
                    fc.f6555a = context;
                    fc.e = 1;
                    obj = c4213xc.a(fc);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = fc.b;
                        context2 = fc.f6555a;
                        ResultKt.throwOnFailure(obj);
                        while (it.hasNext()) {
                            C4019qc c4019qc = (C4019qc) it.next();
                            String str = this.f6649a;
                            fc.f6555a = context2;
                            fc.b = it;
                            fc.e = 2;
                            if (b(str, c4019qc, fc) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    context = fc.f6555a;
                    ResultKt.throwOnFailure(obj);
                }
                context2 = context;
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                }
                return Unit.INSTANCE;
            }
        }
        fc = new Fc(this, continuationImpl);
        Object obj2 = fc.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fc.e;
        if (i != 0) {
        }
        context2 = context;
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0137, code lost:
    
        if (a(r2, r4) == r5) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0107, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r11, r4) != r5) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b2, code lost:
    
        if (r6 == r5) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x011b -> B:20:0x0122). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, C4019qc c4019qc, ContinuationImpl continuationImpl) {
        Hc hc;
        Object coroutine_suspended;
        int i;
        Object a2;
        Of of;
        String str2;
        C4019qc c4019qc2;
        Hc hc2;
        Object obj;
        int i2;
        C4019qc c4019qc3;
        C4213xc c4213xc;
        String str3 = str;
        C4019qc c4019qc4 = c4019qc;
        if (continuationImpl instanceof Hc) {
            hc = (Hc) continuationImpl;
            int i3 = hc.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hc.f = i3 - Integer.MIN_VALUE;
                Object obj2 = hc.d;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = hc.f;
                int i4 = 1;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    if (this.g.get()) {
                        return Unit.INSTANCE;
                    }
                    if (c4019qc4.d != 0 && System.currentTimeMillis() - c4019qc4.d < this.b) {
                        return Unit.INSTANCE;
                    }
                    hc.f6601a = str3;
                    hc.b = c4019qc4;
                    hc.f = 1;
                    a2 = a(str3, c4019qc4, hc);
                } else if (i == 1) {
                    C4019qc c4019qc5 = hc.b;
                    String str4 = hc.f6601a;
                    ResultKt.throwOnFailure(obj2);
                    a2 = obj2;
                    c4019qc4 = c4019qc5;
                    str3 = str4;
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            c4019qc2 = hc.c;
                            c4019qc4 = hc.b;
                            str2 = hc.f6601a;
                            ResultKt.throwOnFailure(obj2);
                            C4019qc c4019qc6 = c4019qc4;
                            C4019qc c4019qc7 = c4019qc2;
                            hc.f6601a = str2;
                            hc.b = c4019qc6;
                            hc.c = null;
                            hc.f = 4;
                            Object a3 = a(str2, c4019qc7, hc);
                            if (a3 != coroutine_suspended) {
                                c4019qc4 = c4019qc6;
                                str3 = str2;
                                hc2 = hc;
                                obj = a3;
                                i4 = 1;
                                Hc hc3 = hc2;
                                of = (Of) obj;
                                hc = hc3;
                                if (of == null) {
                                }
                                c4019qc3 = new C4019qc(c4019qc4.f7325a, c4019qc4.b, i2, System.currentTimeMillis(), false, 0, 48);
                                c4213xc = (C4213xc) AbstractC4240yc.f7500a.getValue();
                                hc.f6601a = str3;
                                hc.b = c4019qc4;
                                hc.c = c4019qc3;
                                hc.f = 2;
                                if (c4213xc.b(c4019qc3, hc) != coroutine_suspended) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        if (i != 4) {
                            if (i != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        C4019qc c4019qc8 = hc.b;
                        String str5 = hc.f6601a;
                        ResultKt.throwOnFailure(obj2);
                        hc2 = hc;
                        obj = obj2;
                        c4019qc4 = c4019qc8;
                        str3 = str5;
                        i4 = 1;
                        Hc hc32 = hc2;
                        of = (Of) obj;
                        hc = hc32;
                        if (!(of == null && AbstractC4086sn.a(of) == i4) && (i2 = c4019qc4.c + i4) < this.d) {
                            c4019qc3 = new C4019qc(c4019qc4.f7325a, c4019qc4.b, i2, System.currentTimeMillis(), false, 0, 48);
                            c4213xc = (C4213xc) AbstractC4240yc.f7500a.getValue();
                            hc.f6601a = str3;
                            hc.b = c4019qc4;
                            hc.c = c4019qc3;
                            hc.f = 2;
                            if (c4213xc.b(c4019qc3, hc) != coroutine_suspended) {
                                str2 = str3;
                                c4019qc2 = c4019qc3;
                                long j = this.b;
                                hc.f6601a = str2;
                                hc.b = c4019qc4;
                                hc.c = c4019qc2;
                                hc.f = 3;
                            }
                        } else {
                            hc.f6601a = null;
                            hc.b = null;
                            hc.f = 5;
                        }
                        return coroutine_suspended;
                    }
                    c4019qc2 = hc.c;
                    c4019qc4 = hc.b;
                    str2 = hc.f6601a;
                    ResultKt.throwOnFailure(obj2);
                    long j2 = this.b;
                    hc.f6601a = str2;
                    hc.b = c4019qc4;
                    hc.c = c4019qc2;
                    hc.f = 3;
                }
                of = (Of) a2;
                if (of == null) {
                }
                c4019qc3 = new C4019qc(c4019qc4.f7325a, c4019qc4.b, i2, System.currentTimeMillis(), false, 0, 48);
                c4213xc = (C4213xc) AbstractC4240yc.f7500a.getValue();
                hc.f6601a = str3;
                hc.b = c4019qc4;
                hc.c = c4019qc3;
                hc.f = 2;
                if (c4213xc.b(c4019qc3, hc) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        }
        hc = new Hc(this, continuationImpl);
        Object obj22 = hc.d;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = hc.f;
        int i42 = 1;
        if (i != 0) {
        }
        of = (Of) a2;
        if (of == null) {
        }
        c4019qc3 = new C4019qc(c4019qc4.f7325a, c4019qc4.b, i2, System.currentTimeMillis(), false, 0, 48);
        c4213xc = (C4213xc) AbstractC4240yc.f7500a.getValue();
        hc.f6601a = str3;
        hc.b = c4019qc4;
        hc.c = c4019qc3;
        hc.f = 2;
        if (c4213xc.b(c4019qc3, hc) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String url, C4019qc data, ContinuationImpl continuationImpl) {
        Gc gc;
        int i;
        try {
            if (continuationImpl instanceof Gc) {
                gc = (Gc) continuationImpl;
                int i2 = gc.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gc.c = i2 - Integer.MIN_VALUE;
                    Object obj = gc.f6581a;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = gc.c;
                    if (i == 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    C3733ga c3733ga = (C3733ga) If.h.getValue();
                    Intrinsics.checkNotNullParameter(url, "loggingUrl");
                    Intrinsics.checkNotNullParameter(data, "data");
                    Intrinsics.checkNotNullParameter(url, "url");
                    Mf mf = new Mf(url, null, null, new C4098t7(data.f7325a), null, 54);
                    gc.c = 1;
                    Object a2 = c3733ga.f7119a.a(mf, gc);
                    return a2 == coroutine_suspended ? coroutine_suspended : a2;
                }
            }
            if (i == 0) {
            }
        } catch (IllegalStateException unused) {
            return null;
        }
        gc = new Gc(this, continuationImpl);
        Object obj2 = gc.f6581a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gc.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b7, code lost:
    
        if (r7 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b9, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0055, code lost:
    
        if (r7.a(r6, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00b7 -> B:11:0x00ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C4019qc c4019qc, ContinuationImpl continuationImpl) {
        Ec ec;
        int i;
        Context context;
        List emptyList;
        Iterator it;
        if (continuationImpl instanceof Ec) {
            ec = (Ec) continuationImpl;
            int i2 = ec.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ec.e = i2 - Integer.MIN_VALUE;
                Object obj = ec.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ec.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Tc.a(c4019qc.f7325a);
                    C4213xc c4213xc = (C4213xc) AbstractC4240yc.f7500a.getValue();
                    String str = c4019qc.f7325a;
                    ec.e = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str2 = ec.b;
                        it = ec.f6534a;
                        ResultKt.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            Tc.a(str2);
                        }
                        if (it.hasNext()) {
                            str2 = (String) it.next();
                            C4213xc c4213xc2 = (C4213xc) AbstractC4240yc.f7500a.getValue();
                            ec.f6534a = it;
                            ec.b = str2;
                            ec.e = 2;
                            obj = c4213xc2.b(str2, ec);
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                context = (Context) this.f.get();
                if (context != null) {
                    CoroutineScope coroutineScope = Sc.f6848a;
                    String directoryPath = Rc.a(context);
                    Intrinsics.checkNotNullParameter(directoryPath, "directoryPath");
                    File file = new File(directoryPath);
                    if (file.exists() && file.isDirectory()) {
                        String[] list = file.list();
                        if (list == null || (emptyList = ArraysKt.toList(list)) == null) {
                            emptyList = CollectionsKt.emptyList();
                        }
                    } else {
                        emptyList = CollectionsKt.emptyList();
                    }
                    it = emptyList.iterator();
                    if (it.hasNext()) {
                    }
                }
                return Unit.INSTANCE;
            }
        }
        ec = new Ec(this, continuationImpl);
        Object obj2 = ec.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ec.e;
        if (i != 0) {
        }
        context = (Context) this.f.get();
        if (context != null) {
        }
        return Unit.INSTANCE;
    }
}
