package com.inmobi.media;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes6.dex */
public final class Gh {

    /* renamed from: a, reason: collision with root package name */
    public final S9 f6585a;

    public Gh(S9 databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.f6585a = databaseHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Vg vg, int i, ContinuationImpl continuationImpl) {
        Ch ch;
        int i2;
        Ref.BooleanRef booleanRef;
        if (continuationImpl instanceof Ch) {
            ch = (Ch) continuationImpl;
            int i3 = ch.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ch.d = i3 - Integer.MIN_VALUE;
                Object obj = ch.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = ch.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    S9 s9 = this.f6585a;
                    Dh dh = new Dh(vg, i, booleanRef2, null);
                    ch.f6495a = booleanRef2;
                    ch.d = 1;
                    s9.getClass();
                    if (s9.a(new R9(s9, dh, null), ch) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef = booleanRef2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = ch.f6495a;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(booleanRef.element);
            }
        }
        ch = new Ch(this, continuationImpl);
        Object obj2 = ch.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = ch.d;
        if (i2 != 0) {
        }
        return Boxing.boxBoolean(booleanRef.element);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r8v5, types: [T, com.inmobi.media.Za] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Vg vg, int i, ContinuationImpl continuationImpl) {
        Eh eh;
        Object obj;
        int i2;
        Ref.ObjectRef objectRef;
        if (continuationImpl instanceof Eh) {
            eh = (Eh) continuationImpl;
            int i3 = eh.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eh.d = i3 - Integer.MIN_VALUE;
                obj = eh.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = eh.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    eh.f6538a = vg;
                    eh.d = 1;
                    obj = a(vg, i, eh);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        objectRef = (Ref.ObjectRef) eh.f6538a;
                        ResultKt.throwOnFailure(obj);
                        return objectRef.element;
                    }
                    vg = (Vg) eh.f6538a;
                    ResultKt.throwOnFailure(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return new Xa(vg);
                }
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                objectRef2.element = new Za(vg);
                S9 s9 = this.f6585a;
                Fh fh = new Fh(this, vg, objectRef2, null);
                eh.f6538a = objectRef2;
                eh.d = 2;
                s9.getClass();
                if (s9.a(new R9(s9, fh, null), eh) != coroutine_suspended) {
                    objectRef = objectRef2;
                    return objectRef.element;
                }
                return coroutine_suspended;
            }
        }
        eh = new Eh(this, continuationImpl);
        obj = eh.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = eh.d;
        if (i2 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public final Object a(String str, ContinuationImpl continuationImpl) {
        String str2 = "SELECT COUNT(*) FROM pings WHERE priority='" + str + "'";
        S9 s9 = this.f6585a;
        s9.getClass();
        return s9.a(new J9(s9, str2, null), continuationImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r5 == null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009b A[LOOP:0: B:11:0x0095->B:13:0x009b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Integer num, String str, long j, ContinuationImpl continuationImpl) {
        Ah ah;
        int i;
        String str2;
        Iterator it;
        if (continuationImpl instanceof Ah) {
            ah = (Ah) continuationImpl;
            int i2 = ah.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ah.c = i2 - Integer.MIN_VALUE;
                Object obj = ah.f6457a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ah.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (num != null) {
                        str2 = " LIMIT " + num.intValue();
                    }
                    str2 = "";
                    String str3 = "SELECT * FROM pings WHERE priority='" + str + "' AND retry_count=0 AND time_created<" + j + " AND status=\"idle\" ORDER BY time_created ASC" + str2;
                    S9 s9 = this.f6585a;
                    ah.c = 1;
                    s9.getClass();
                    obj = s9.a(new O9(s9, str3, null), ah);
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
                    arrayList.add(Hh.a((ContentValues) it.next()));
                }
                return arrayList;
            }
        }
        ah = new Ah(this, continuationImpl);
        Object obj2 = ah.f6457a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ah.c;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        Bh bh;
        int i;
        if (continuationImpl instanceof Bh) {
            bh = (Bh) continuationImpl;
            int i2 = bh.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bh.c = i2 - Integer.MIN_VALUE;
                Object obj = bh.f6476a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bh.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String str2 = "SELECT id FROM pings WHERE id=" + DatabaseUtils.sqlEscapeString(str) + " LIMIT 1";
                    S9 s9 = this.f6585a;
                    bh.c = 1;
                    s9.getClass();
                    obj = s9.a(new O9(s9, str2, null), bh);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(!((Collection) obj).isEmpty());
            }
        }
        bh = new Bh(this, continuationImpl);
        Object obj2 = bh.f6476a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bh.c;
        if (i != 0) {
        }
        return Boxing.boxBoolean(!((Collection) obj2).isEmpty());
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        if (r8 == null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009f A[LOOP:0: B:11:0x0099->B:13:0x009f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, Integer num, ContinuationImpl continuationImpl) {
        C4273zh c4273zh;
        int i;
        String str2;
        Iterator it;
        if (continuationImpl instanceof C4273zh) {
            c4273zh = (C4273zh) continuationImpl;
            int i2 = c4273zh.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4273zh.c = i2 - Integer.MIN_VALUE;
                Object obj = c4273zh.f7526a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4273zh.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (num != null) {
                        str2 = " LIMIT " + num.intValue();
                    }
                    str2 = "";
                    String str3 = "SELECT * FROM pings WHERE priority='" + str + "' AND retry_count>=1 AND retryAfter<=" + currentTimeMillis + " AND status=\"failed\" ORDER BY time_created ASC" + str2;
                    S9 s9 = this.f6585a;
                    c4273zh.c = 1;
                    s9.getClass();
                    obj = s9.a(new O9(s9, str3, null), c4273zh);
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
                    arrayList.add(Hh.a((ContentValues) it.next()));
                }
                return arrayList;
            }
        }
        c4273zh = new C4273zh(this, continuationImpl);
        Object obj2 = c4273zh.f7526a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4273zh.c;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r7 == null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009b A[LOOP:0: B:11:0x0095->B:13:0x009b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, Integer num, ContinuationImpl continuationImpl) {
        C4245yh c4245yh;
        int i;
        String str3;
        Iterator it;
        if (continuationImpl instanceof C4245yh) {
            c4245yh = (C4245yh) continuationImpl;
            int i2 = c4245yh.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4245yh.c = i2 - Integer.MIN_VALUE;
                Object obj = c4245yh.f7504a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4245yh.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (num != null) {
                        str3 = " LIMIT " + num.intValue();
                    }
                    str3 = "";
                    String str4 = "SELECT * FROM pings WHERE priority='" + str + "' AND status=\"" + str2 + "\" ORDER BY time_created ASC" + str3;
                    S9 s9 = this.f6585a;
                    c4245yh.c = 1;
                    s9.getClass();
                    obj = s9.a(new O9(s9, str4, null), c4245yh);
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
                    arrayList.add(Hh.a((ContentValues) it.next()));
                }
                return arrayList;
            }
        }
        c4245yh = new C4245yh(this, continuationImpl);
        Object obj2 = c4245yh.f7504a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4245yh.c;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        if (r8 == null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009f A[LOOP:0: B:11:0x0099->B:13:0x009f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Integer num, ContinuationImpl continuationImpl) {
        C4218xh c4218xh;
        int i;
        String str2;
        Iterator it;
        if (continuationImpl instanceof C4218xh) {
            c4218xh = (C4218xh) continuationImpl;
            int i2 = c4218xh.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4218xh.c = i2 - Integer.MIN_VALUE;
                Object obj = c4218xh.f7480a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4218xh.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (num != null) {
                        str2 = " LIMIT " + num.intValue();
                    }
                    str2 = "";
                    String str3 = "SELECT * FROM pings WHERE priority='" + str + "' AND (retryAfter IS NULL OR retryAfter<=" + currentTimeMillis + ")  AND status!=\"in_progress\" ORDER BY time_created ASC" + str2;
                    S9 s9 = this.f6585a;
                    c4218xh.c = 1;
                    s9.getClass();
                    obj = s9.a(new O9(s9, str3, null), c4218xh);
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
                    arrayList.add(Hh.a((ContentValues) it.next()));
                }
                return arrayList;
            }
        }
        c4218xh = new C4218xh(this, continuationImpl);
        Object obj2 = c4218xh.f7480a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4218xh.c;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, long j2, ContinuationImpl continuationImpl) {
        C4164vh c4164vh;
        int i;
        if (continuationImpl instanceof C4164vh) {
            c4164vh = (C4164vh) continuationImpl;
            int i2 = c4164vh.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4164vh.d = i2 - Integer.MIN_VALUE;
                Object obj = c4164vh.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4164vh.d;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ArrayList arrayList = c4164vh.f7439a;
                    ResultKt.throwOnFailure(obj);
                    return arrayList;
                }
                ResultKt.throwOnFailure(obj);
                long currentTimeMillis = System.currentTimeMillis();
                String str = "((priority='normal' AND time_created<" + (currentTimeMillis - j) + ") OR (priority='high' AND time_created<" + (currentTimeMillis - j2) + "))";
                ArrayList arrayList2 = new ArrayList();
                S9 s9 = this.f6585a;
                C4191wh c4191wh = new C4191wh(str, arrayList2, null);
                c4164vh.f7439a = arrayList2;
                c4164vh.d = 1;
                s9.getClass();
                return s9.a(new R9(s9, c4191wh, null), c4164vh) == coroutine_suspended ? coroutine_suspended : arrayList2;
            }
        }
        c4164vh = new C4164vh(this, continuationImpl);
        Object obj2 = c4164vh.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4164vh.d;
        if (i == 0) {
        }
    }
}
