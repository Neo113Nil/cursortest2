package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Fb {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2613n9 f4703a;
    public java.lang.ref.WeakReference b;

    public Fb(com.inmobi.media.C2613n9 databaseHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.f4703a = databaseHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.inmobi.media.C2904yb c2904yb, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Db db;
        int i;
        java.lang.ref.WeakReference weakReference;
        if (continuationImpl instanceof com.inmobi.media.Db) {
            db = (com.inmobi.media.Db) continuationImpl;
            int i2 = db.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                db.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = db.f4659a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = db.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2613n9 c2613n9 = this.f4703a;
                    android.content.ContentValues a2 = com.inmobi.media.Hb.a(c2904yb);
                    db.c = 1;
                    if (c2613n9.a("logs_v2", a2, 4, db) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                weakReference = this.b;
                if (weakReference != null && ((com.inmobi.media.C2825v9) weakReference.get()) != null) {
                    com.inmobi.media.C2825v9.a();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        db = new com.inmobi.media.Db(this, continuationImpl);
        java.lang.Object obj2 = db.f4659a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = db.c;
        if (i != 0) {
        }
        weakReference = this.b;
        if (weakReference != null) {
            com.inmobi.media.C2825v9.a();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(com.inmobi.media.C2904yb c2904yb, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Eb eb;
        int i;
        java.lang.ref.WeakReference weakReference;
        if (continuationImpl instanceof com.inmobi.media.Eb) {
            eb = (com.inmobi.media.Eb) continuationImpl;
            int i2 = eb.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eb.c = i2 - Integer.MIN_VALUE;
                com.inmobi.media.Eb eb2 = eb;
                java.lang.Object obj = eb2.f4681a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = eb2.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2613n9 c2613n9 = this.f4703a;
                    android.content.ContentValues a2 = com.inmobi.media.Hb.a(c2904yb);
                    java.lang.String[] strArr = {c2904yb.f5568a};
                    eb2.c = 1;
                    if (com.inmobi.media.C2613n9.a(c2613n9, "logs_v2", a2, "filename=?", strArr, eb2, 16) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                weakReference = this.b;
                if (weakReference != null && ((com.inmobi.media.C2825v9) weakReference.get()) != null) {
                    com.inmobi.media.C2825v9.a();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        eb = new com.inmobi.media.Eb(this, continuationImpl);
        com.inmobi.media.Eb eb22 = eb;
        java.lang.Object obj2 = eb22.f4681a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = eb22.c;
        if (i != 0) {
        }
        weakReference = this.b;
        if (weakReference != null) {
            com.inmobi.media.C2825v9.a();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061 A[LOOP:0: B:11:0x005b->B:13:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Ab ab;
        int i;
        java.util.Iterator it;
        if (continuationImpl instanceof com.inmobi.media.Ab) {
            ab = (com.inmobi.media.Ab) continuationImpl;
            int i2 = ab.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ab.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = ab.f4599a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ab.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2613n9 c2613n9 = this.f4703a;
                    ab.c = 1;
                    c2613n9.getClass();
                    obj = c2613n9.a(new com.inmobi.media.C2506j9(c2613n9, "SELECT * FROM logs_v2 WHERE hasLoggerFinished=1", null), ab);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.Iterable iterable = (java.lang.Iterable) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.inmobi.media.Hb.a((android.content.ContentValues) it.next()));
                }
                return arrayList;
            }
        }
        ab = new com.inmobi.media.Ab(this, continuationImpl);
        java.lang.Object obj2 = ab.f4599a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ab.c;
        if (i != 0) {
        }
        java.lang.Iterable iterable2 = (java.lang.Iterable) obj2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(java.lang.String str, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Cb cb;
        int i;
        if (continuationImpl instanceof com.inmobi.media.Cb) {
            cb = (com.inmobi.media.Cb) continuationImpl;
            int i2 = cb.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cb.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = cb.f4639a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cb.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2613n9 c2613n9 = this.f4703a;
                    cb.c = 1;
                    c2613n9.getClass();
                    obj = c2613n9.a(new com.inmobi.media.C2375e9(c2613n9, "SELECT COUNT(*) FROM logs_v2 WHERE filename='" + str + "'", null), cb);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((java.lang.Number) obj).intValue() != 0);
            }
        }
        cb = new com.inmobi.media.Cb(this, continuationImpl);
        java.lang.Object obj2 = cb.f4639a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cb.c;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((java.lang.Number) obj2).intValue() != 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061 A[LOOP:0: B:11:0x005b->B:13:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Bb bb;
        int i;
        java.util.Iterator it;
        if (continuationImpl instanceof com.inmobi.media.Bb) {
            bb = (com.inmobi.media.Bb) continuationImpl;
            int i2 = bb.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bb.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = bb.f4620a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bb.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2613n9 c2613n9 = this.f4703a;
                    bb.c = 1;
                    c2613n9.getClass();
                    obj = c2613n9.a(new com.inmobi.media.C2506j9(c2613n9, "SELECT * FROM logs_v2 WHERE hasLoggerFinished=0", null), bb);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.Iterable iterable = (java.lang.Iterable) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.inmobi.media.Hb.a((android.content.ContentValues) it.next()));
                }
                return arrayList;
            }
        }
        bb = new com.inmobi.media.Bb(this, continuationImpl);
        java.lang.Object obj2 = bb.f4620a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bb.c;
        if (i != 0) {
        }
        java.lang.Iterable iterable2 = (java.lang.Iterable) obj2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007a A[LOOP:0: B:11:0x0074->B:13:0x007a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(long j, int i, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2929zb c2929zb;
        int i2;
        java.util.Iterator it;
        if (continuationImpl instanceof com.inmobi.media.C2929zb) {
            c2929zb = (com.inmobi.media.C2929zb) continuationImpl;
            int i3 = c2929zb.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2929zb.c = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c2929zb.f5588a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c2929zb.c;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2613n9 c2613n9 = this.f4703a;
                    c2929zb.c = 1;
                    c2613n9.getClass();
                    obj = c2613n9.a(new com.inmobi.media.C2506j9(c2613n9, "SELECT * FROM logs_v2 WHERE id NOT IN (SELECT id FROM ( SELECT id FROM logs_v2 WHERE saveTimestamp > " + j + " ORDER BY saveTimestamp DESC LIMIT " + i + ") AS recent_logs);", null), c2929zb);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.Iterable iterable = (java.lang.Iterable) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.inmobi.media.Hb.a((android.content.ContentValues) it.next()));
                }
                return arrayList;
            }
        }
        c2929zb = new com.inmobi.media.C2929zb(this, continuationImpl);
        java.lang.Object obj2 = c2929zb.f5588a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c2929zb.c;
        if (i2 != 0) {
        }
        java.lang.Iterable iterable2 = (java.lang.Iterable) obj2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    public final java.lang.Object a(java.lang.String str, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        java.lang.Object a2 = com.inmobi.media.C2613n9.a(this.f4703a, "logs_v2", "filename='" + str + "'", continuationImpl, 4);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }
}
