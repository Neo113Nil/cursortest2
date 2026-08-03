package com.inmobi.media;

/* renamed from: com.inmobi.media.h6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2452h6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5234a;
    public final com.inmobi.media.C2613n9 b;

    public AbstractC2452h6(java.lang.String tableName, com.inmobi.media.C2613n9 databaseHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableName, "tableName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.f5234a = tableName;
        this.b = databaseHelper;
    }

    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        java.lang.String str = "SELECT COUNT(*) FROM " + this.f5234a;
        com.inmobi.media.C2613n9 c2613n9 = this.b;
        c2613n9.getClass();
        return c2613n9.a(new com.inmobi.media.C2375e9(c2613n9, str, null), continuationImpl);
    }

    public abstract java.lang.Object b(int i, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl);

    public final java.lang.Object a(java.util.ArrayList arrayList, kotlin.coroutines.jvm.internal.SuspendLambda suspendLambda) {
        if (arrayList.isEmpty()) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.h6$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.AbstractC2452h6.a(((java.lang.Integer) obj).intValue());
            }
        }, 30, null);
        java.lang.Object a2 = com.inmobi.media.C2613n9.a(this.b, this.f5234a, "id IN (" + joinToString$default + ")", suspendLambda, 4);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.CharSequence a(int i) {
        return java.lang.String.valueOf(i);
    }

    public final java.lang.Object a(long j, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        java.lang.Object a2 = com.inmobi.media.C2613n9.a(this.b, this.f5234a, "ts < " + j, continuationImpl, 4);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object a(int i, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        java.lang.String str = this.f5234a;
        java.lang.Object a2 = this.b.a("DELETE FROM " + str + " WHERE id IN (SELECT id FROM " + str + " ORDER BY ts ASC LIMIT " + i + ")", continuationImpl);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }
}
