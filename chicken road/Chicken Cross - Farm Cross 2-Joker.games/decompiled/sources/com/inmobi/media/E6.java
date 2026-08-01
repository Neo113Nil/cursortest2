package com.inmobi.media;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class E6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6529a;
    public final S9 b;

    public E6(String tableName, S9 databaseHelper) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.f6529a = tableName;
        this.b = databaseHelper;
    }

    public final Object a(ContinuationImpl continuationImpl) {
        String str = "SELECT COUNT(*) FROM " + this.f6529a;
        S9 s9 = this.b;
        s9.getClass();
        return s9.a(new J9(s9, str, null), continuationImpl);
    }

    public abstract Object b(int i, ContinuationImpl continuationImpl);

    public final Object a(ArrayList arrayList, SuspendLambda suspendLambda) {
        if (arrayList.isEmpty()) {
            return Unit.INSTANCE;
        }
        Object a2 = S9.a(this.b, this.f6529a, "id IN (" + CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new Function1() { // from class: com.inmobi.media.E6$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return E6.a(((Integer) obj).intValue());
            }
        }, 30, null) + ")", suspendLambda, 4);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }

    public static final CharSequence a(int i) {
        return String.valueOf(i);
    }

    public final Object a(long j, ContinuationImpl continuationImpl) {
        Object a2 = S9.a(this.b, this.f6529a, "ts < " + j, continuationImpl, 4);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }

    public final Object a(int i, ContinuationImpl continuationImpl) {
        String str = this.f6529a;
        Object a2 = this.b.a("DELETE FROM " + str + " WHERE id IN (SELECT id FROM " + str + " ORDER BY ts ASC LIMIT " + i + ")", continuationImpl);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }
}
