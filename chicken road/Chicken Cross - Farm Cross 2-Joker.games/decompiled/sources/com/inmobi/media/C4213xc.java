package com.inmobi.media;

import android.content.ContentValues;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.xc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4213xc {

    /* renamed from: a, reason: collision with root package name */
    public final S9 f7476a;
    public WeakReference b;

    public C4213xc(S9 databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.f7476a = databaseHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C4019qc c4019qc, ContinuationImpl continuationImpl) {
        C4159vc c4159vc;
        int i;
        WeakReference weakReference;
        if (continuationImpl instanceof C4159vc) {
            c4159vc = (C4159vc) continuationImpl;
            int i2 = c4159vc.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4159vc.c = i2 - Integer.MIN_VALUE;
                Object obj = c4159vc.f7435a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4159vc.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    S9 s9 = this.f7476a;
                    ContentValues a2 = AbstractC4268zc.a(c4019qc);
                    c4159vc.c = 1;
                    if (s9.a("logs_v2", a2, 4, c4159vc) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                weakReference = this.b;
                if (weakReference != null && ((C3564aa) weakReference.get()) != null) {
                    C3564aa.a();
                }
                return Unit.INSTANCE;
            }
        }
        c4159vc = new C4159vc(this, continuationImpl);
        Object obj2 = c4159vc.f7435a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4159vc.c;
        if (i != 0) {
        }
        weakReference = this.b;
        if (weakReference != null) {
            C3564aa.a();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(C4019qc c4019qc, ContinuationImpl continuationImpl) {
        C4186wc c4186wc;
        int i;
        WeakReference weakReference;
        if (continuationImpl instanceof C4186wc) {
            c4186wc = (C4186wc) continuationImpl;
            int i2 = c4186wc.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4186wc.c = i2 - Integer.MIN_VALUE;
                C4186wc c4186wc2 = c4186wc;
                Object obj = c4186wc2.f7457a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4186wc2.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    S9 s9 = this.f7476a;
                    ContentValues a2 = AbstractC4268zc.a(c4019qc);
                    String[] strArr = {c4019qc.f7325a};
                    c4186wc2.c = 1;
                    if (S9.a(s9, "logs_v2", a2, "filename=?", strArr, c4186wc2, 16) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                weakReference = this.b;
                if (weakReference != null && ((C3564aa) weakReference.get()) != null) {
                    C3564aa.a();
                }
                return Unit.INSTANCE;
            }
        }
        c4186wc = new C4186wc(this, continuationImpl);
        C4186wc c4186wc22 = c4186wc;
        Object obj2 = c4186wc22.f7457a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4186wc22.c;
        if (i != 0) {
        }
        weakReference = this.b;
        if (weakReference != null) {
            C3564aa.a();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061 A[LOOP:0: B:11:0x005b->B:13:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C4075sc c4075sc;
        int i;
        Iterator it;
        if (continuationImpl instanceof C4075sc) {
            c4075sc = (C4075sc) continuationImpl;
            int i2 = c4075sc.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4075sc.c = i2 - Integer.MIN_VALUE;
                Object obj = c4075sc.f7371a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4075sc.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    S9 s9 = this.f7476a;
                    c4075sc.c = 1;
                    s9.getClass();
                    obj = s9.a(new O9(s9, "SELECT * FROM logs_v2 WHERE hasLoggerFinished=1", null), c4075sc);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC4268zc.a((ContentValues) it.next()));
                }
                return arrayList;
            }
        }
        c4075sc = new C4075sc(this, continuationImpl);
        Object obj2 = c4075sc.f7371a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4075sc.c;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        C4132uc c4132uc;
        int i;
        if (continuationImpl instanceof C4132uc) {
            c4132uc = (C4132uc) continuationImpl;
            int i2 = c4132uc.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4132uc.c = i2 - Integer.MIN_VALUE;
                Object obj = c4132uc.f7413a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4132uc.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    S9 s9 = this.f7476a;
                    c4132uc.c = 1;
                    s9.getClass();
                    obj = s9.a(new J9(s9, "SELECT COUNT(*) FROM logs_v2 WHERE filename='" + str + "'", null), c4132uc);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(((Number) obj).intValue() != 0);
            }
        }
        c4132uc = new C4132uc(this, continuationImpl);
        Object obj2 = c4132uc.f7413a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4132uc.c;
        if (i != 0) {
        }
        return Boxing.boxBoolean(((Number) obj2).intValue() != 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061 A[LOOP:0: B:11:0x005b->B:13:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        C4103tc c4103tc;
        int i;
        Iterator it;
        if (continuationImpl instanceof C4103tc) {
            c4103tc = (C4103tc) continuationImpl;
            int i2 = c4103tc.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4103tc.c = i2 - Integer.MIN_VALUE;
                Object obj = c4103tc.f7392a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4103tc.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    S9 s9 = this.f7476a;
                    c4103tc.c = 1;
                    s9.getClass();
                    obj = s9.a(new O9(s9, "SELECT * FROM logs_v2 WHERE hasLoggerFinished=0", null), c4103tc);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC4268zc.a((ContentValues) it.next()));
                }
                return arrayList;
            }
        }
        c4103tc = new C4103tc(this, continuationImpl);
        Object obj2 = c4103tc.f7392a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4103tc.c;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[LOOP:0: B:11:0x0078->B:13:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, int i, ContinuationImpl continuationImpl) {
        C4047rc c4047rc;
        int i2;
        Iterator it;
        if (continuationImpl instanceof C4047rc) {
            c4047rc = (C4047rc) continuationImpl;
            int i3 = c4047rc.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c4047rc.c = i3 - Integer.MIN_VALUE;
                Object obj = c4047rc.f7349a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c4047rc.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    S9 s9 = this.f7476a;
                    c4047rc.c = 1;
                    s9.getClass();
                    obj = s9.a(new O9(s9, "SELECT * FROM logs_v2 WHERE id NOT IN (SELECT id FROM ( SELECT id FROM logs_v2 WHERE saveTimestamp > " + j + " ORDER BY saveTimestamp DESC LIMIT " + i + ") AS recent_logs);", null), c4047rc);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC4268zc.a((ContentValues) it.next()));
                }
                return arrayList;
            }
        }
        c4047rc = new C4047rc(this, continuationImpl);
        Object obj2 = c4047rc.f7349a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c4047rc.c;
        if (i2 != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    public final Object a(String str, ContinuationImpl continuationImpl) {
        Object a2 = S9.a(this.f7476a, "logs_v2", "filename='" + str + "'", continuationImpl, 4);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }
}
