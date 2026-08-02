package Bl0;

import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Bl0.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2653n extends AbstractC7737t implements Function0<SQLiteDatabase> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2662x f3988b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2653n(C2662x c2662x) {
        super(0);
        this.f3988b = c2662x;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SQLiteDatabase invoke() {
        SQLiteDatabase writableDatabase = this.f3988b.f3997a.getWritableDatabase();
        writableDatabase.enableWriteAheadLogging();
        return writableDatabase;
    }
}
