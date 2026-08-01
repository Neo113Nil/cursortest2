package com.inmobi.media;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes6.dex */
public final class Dh extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6515a;
    public final /* synthetic */ Vg b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Ref.BooleanRef d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dh(Vg vg, int i, Ref.BooleanRef booleanRef, Continuation continuation) {
        super(2, continuation);
        this.b = vg;
        this.c = i;
        this.d = booleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Dh dh = new Dh(this.b, this.c, this.d, continuation);
        dh.f6515a = obj;
        return dh;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Dh) create((S9) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SQLiteStatement compileStatement;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        SQLiteDatabase sQLiteDatabase = ((S9) this.f6515a).c;
        if (sQLiteDatabase == null || (compileStatement = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO pings (id, url, headers, allow_redirects, priority, ack_required, time_created, owner, retry_count, retryAfter, telemetry_metadata, status) SELECT ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? WHERE (SELECT COUNT(*) FROM pings) < ?")) == null) {
            return Unit.INSTANCE;
        }
        Vg vg = this.b;
        int i = this.c;
        Ref.BooleanRef booleanRef = this.d;
        try {
            ContentValues a2 = Hh.a(vg);
            boolean z = true;
            compileStatement.bindString(1, a2.getAsString("id"));
            compileStatement.bindString(2, a2.getAsString("url"));
            compileStatement.bindString(3, a2.getAsString("headers"));
            compileStatement.bindString(4, a2.getAsString("allow_redirects"));
            compileStatement.bindString(5, a2.getAsString(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY));
            compileStatement.bindString(6, a2.getAsString("ack_required"));
            Long asLong = a2.getAsLong("time_created");
            Intrinsics.checkNotNullExpressionValue(asLong, "getAsLong(...)");
            compileStatement.bindLong(7, asLong.longValue());
            compileStatement.bindString(8, a2.getAsString("owner"));
            Long asLong2 = a2.getAsLong("retry_count");
            Intrinsics.checkNotNullExpressionValue(asLong2, "getAsLong(...)");
            compileStatement.bindLong(9, asLong2.longValue());
            Long asLong3 = a2.getAsLong("retryAfter");
            Intrinsics.checkNotNullExpressionValue(asLong3, "getAsLong(...)");
            compileStatement.bindLong(10, asLong3.longValue());
            String asString = a2.getAsString("telemetry_metadata");
            if (asString != null) {
                compileStatement.bindString(11, asString);
            } else {
                compileStatement.bindNull(11);
            }
            compileStatement.bindString(12, a2.getAsString("status"));
            compileStatement.bindLong(13, i);
            if (compileStatement.executeInsert() == -1) {
                z = false;
            }
            booleanRef.element = z;
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(compileStatement, null);
            return unit;
        } finally {
        }
    }
}
