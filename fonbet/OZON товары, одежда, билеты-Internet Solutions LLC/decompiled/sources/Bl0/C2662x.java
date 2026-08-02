package Bl0;

import Bl0.b0;
import Sc.InterfaceC4008j;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Bl0.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2662x {

    /* renamed from: a, reason: collision with root package name */
    public final K f3997a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4008j f3998b;

    public C2662x(K metricsEventDataBaseHelper, b0.b logger) {
        Intrinsics.checkNotNullParameter(metricsEventDataBaseHelper, "metricsEventDataBaseHelper");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f3997a = metricsEventDataBaseHelper;
        this.f3998b = Sc.k.b(new C2653n(this));
    }

    public final void a(ArrayList persistentMetricsEventsDto) {
        InterfaceC4008j interfaceC4008j = this.f3998b;
        Intrinsics.checkNotNullParameter(persistentMetricsEventsDto, "persistentMetricsEventsDto");
        String V11 = C7714v.V(persistentMetricsEventsDto, null, null, null, r.f3990b, 31);
        String E02 = kotlin.text.h.E0("\n            DELETE FROM metrics_event_table\n            WHERE _id IN (\n                SELECT _id FROM metrics_event_table\n                WHERE uuid IN (" + V11 + ")\n            )\n        ");
        try {
            ((SQLiteDatabase) interfaceC4008j.getValue()).beginTransactionNonExclusive();
            ((SQLiteDatabase) interfaceC4008j.getValue()).execSQL(E02);
            ((SQLiteDatabase) interfaceC4008j.getValue()).setTransactionSuccessful();
            ((SQLiteDatabase) interfaceC4008j.getValue()).endTransaction();
            C2655p messageBuilder = new C2655p(V11);
            Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        } finally {
        }
    }
}
