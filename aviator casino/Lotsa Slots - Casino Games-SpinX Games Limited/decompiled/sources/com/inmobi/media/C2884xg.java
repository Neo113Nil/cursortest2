package com.inmobi.media;

/* renamed from: com.inmobi.media.xg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2884xg {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2613n9 f5552a;

    public C2884xg(com.inmobi.media.C2613n9 databaseHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.f5552a = databaseHelper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r5 == null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0095 A[LOOP:0: B:11:0x008f->B:13:0x0095, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.Integer num, java.lang.String str, long j, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2858wg c2858wg;
        int i;
        java.lang.String str2;
        java.util.Iterator it;
        if (continuationImpl instanceof com.inmobi.media.C2858wg) {
            c2858wg = (com.inmobi.media.C2858wg) continuationImpl;
            int i2 = c2858wg.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2858wg.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = c2858wg.f5530a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2858wg.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (num != null) {
                        str2 = " LIMIT " + num.intValue();
                    }
                    str2 = "";
                    java.lang.String str3 = "SELECT * FROM pings WHERE priority='" + str + "' AND retry_count=0 AND time_created<" + j + " ORDER BY time_created ASC" + str2;
                    com.inmobi.media.C2613n9 c2613n9 = this.f5552a;
                    c2858wg.c = 1;
                    c2613n9.getClass();
                    obj = c2613n9.a(new com.inmobi.media.C2506j9(c2613n9, str3, null), c2858wg);
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
                    arrayList.add(com.inmobi.media.AbstractC2909yg.a((android.content.ContentValues) it.next()));
                }
                return arrayList;
            }
        }
        c2858wg = new com.inmobi.media.C2858wg(this, continuationImpl);
        java.lang.Object obj2 = c2858wg.f5530a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2858wg.c;
        if (i != 0) {
        }
        java.lang.Iterable iterable2 = (java.lang.Iterable) obj2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    public final java.lang.Object b(java.lang.String str, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        java.lang.String str2 = "SELECT COUNT(*) FROM pings WHERE priority='" + str + "'";
        com.inmobi.media.C2613n9 c2613n9 = this.f5552a;
        c2613n9.getClass();
        return c2613n9.a(new com.inmobi.media.C2375e9(c2613n9, str2, null), continuationImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r8 == null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0099 A[LOOP:0: B:11:0x0093->B:13:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(java.lang.String str, java.lang.Integer num, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2832vg c2832vg;
        int i;
        java.lang.String str2;
        java.util.Iterator it;
        if (continuationImpl instanceof com.inmobi.media.C2832vg) {
            c2832vg = (com.inmobi.media.C2832vg) continuationImpl;
            int i2 = c2832vg.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2832vg.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = c2832vg.f5511a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2832vg.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    if (num != null) {
                        str2 = " LIMIT " + num.intValue();
                    }
                    str2 = "";
                    java.lang.String str3 = "SELECT * FROM pings WHERE priority='" + str + "' AND retry_count>=1 AND retryAfter<=" + currentTimeMillis + " ORDER BY time_created ASC" + str2;
                    com.inmobi.media.C2613n9 c2613n9 = this.f5552a;
                    c2832vg.c = 1;
                    c2613n9.getClass();
                    obj = c2613n9.a(new com.inmobi.media.C2506j9(c2613n9, str3, null), c2832vg);
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
                    arrayList.add(com.inmobi.media.AbstractC2909yg.a((android.content.ContentValues) it.next()));
                }
                return arrayList;
            }
        }
        c2832vg = new com.inmobi.media.C2832vg(this, continuationImpl);
        java.lang.Object obj2 = c2832vg.f5511a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2832vg.c;
        if (i != 0) {
        }
        java.lang.Iterable iterable2 = (java.lang.Iterable) obj2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r8 == null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0099 A[LOOP:0: B:11:0x0093->B:13:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, java.lang.Integer num, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2806ug c2806ug;
        int i;
        java.lang.String str2;
        java.util.Iterator it;
        if (continuationImpl instanceof com.inmobi.media.C2806ug) {
            c2806ug = (com.inmobi.media.C2806ug) continuationImpl;
            int i2 = c2806ug.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2806ug.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = c2806ug.f5488a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2806ug.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    if (num != null) {
                        str2 = " LIMIT " + num.intValue();
                    }
                    str2 = "";
                    java.lang.String str3 = "SELECT * FROM pings WHERE priority='" + str + "' AND retryAfter<=" + currentTimeMillis + " ORDER BY time_created ASC" + str2;
                    com.inmobi.media.C2613n9 c2613n9 = this.f5552a;
                    c2806ug.c = 1;
                    c2613n9.getClass();
                    obj = c2613n9.a(new com.inmobi.media.C2506j9(c2613n9, str3, null), c2806ug);
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
                    arrayList.add(com.inmobi.media.AbstractC2909yg.a((android.content.ContentValues) it.next()));
                }
                return arrayList;
            }
        }
        c2806ug = new com.inmobi.media.C2806ug(this, continuationImpl);
        java.lang.Object obj2 = c2806ug.f5488a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2806ug.c;
        if (i != 0) {
        }
        java.lang.Iterable iterable2 = (java.lang.Iterable) obj2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b A[LOOP:0: B:17:0x0075->B:19:0x007b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2779tg c2779tg;
        int i;
        java.util.Iterator it;
        com.inmobi.media.Zf zf;
        if (continuationImpl instanceof com.inmobi.media.C2779tg) {
            c2779tg = (com.inmobi.media.C2779tg) continuationImpl;
            int i2 = c2779tg.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2779tg.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = c2779tg.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2779tg.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2613n9 c2613n9 = this.f5552a;
                    c2779tg.d = 1;
                    c2613n9.getClass();
                    obj = c2613n9.a(new com.inmobi.media.C2506j9(c2613n9, "SELECT * FROM pings WHERE priority='" + str + "' ORDER BY time_created ASC LIMIT 1", null), c2779tg);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.inmobi.media.Zf zf2 = c2779tg.f5467a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return zf2;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.Iterable iterable = (java.lang.Iterable) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.inmobi.media.AbstractC2909yg.a((android.content.ContentValues) it.next()));
                }
                zf = (com.inmobi.media.Zf) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList);
                if (zf != null) {
                    com.inmobi.media.C2613n9 c2613n92 = this.f5552a;
                    java.lang.String[] strArr = {zf.b};
                    c2779tg.f5467a = zf;
                    c2779tg.d = 2;
                    if (c2613n92.a("pings", "id=?", strArr, c2779tg) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return zf;
            }
        }
        c2779tg = new com.inmobi.media.C2779tg(this, continuationImpl);
        java.lang.Object obj2 = c2779tg.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2779tg.d;
        if (i != 0) {
        }
        java.lang.Iterable iterable2 = (java.lang.Iterable) obj2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        zf = (com.inmobi.media.Zf) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList2);
        if (zf != null) {
        }
        return zf;
    }

    public final java.lang.Object a(long j, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis() - j);
        java.lang.Object a2 = com.inmobi.media.C2613n9.a(this.f5552a, "pings", "time_created<" + valueOf, continuationImpl, 4);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }
}
