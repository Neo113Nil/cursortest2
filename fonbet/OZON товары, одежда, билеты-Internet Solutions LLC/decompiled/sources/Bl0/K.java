package Bl0;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class K extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public final C2644e f3928a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(Context context, C2644e migrationVer1to2) {
        super(context, "MetricsEvent.db", (SQLiteDatabase.CursorFactory) null, 2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(migrationVer1to2, "migrationVer1to2");
        this.f3928a = migrationVer1to2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.execSQL("CREATE TABLE IF NOT EXISTS metrics_event_table (\n    _id INTEGER PRIMARY KEY AUTOINCREMENT,\n    uuid VARCHAR(36),\n    metrics_event BLOB);\n\nCREATE INDEX IF NOT EXISTS uuid_index\n    ON metrics_event_table(uuid)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase db2, int i11, int i12) {
        int i13 = 1;
        if (i11 == 1 && i12 == 2 && db2 != null) {
            this.f3928a.getClass();
            Intrinsics.checkNotNullParameter(db2, "db");
            ArrayList arrayList = new ArrayList();
            Cursor rawQuery = db2.rawQuery("\n                SELECT * FROM metrics_event_table\n                ", new String[0]);
            try {
                int columnIndexOrThrow = rawQuery.getColumnIndexOrThrow("uuid");
                int columnIndexOrThrow2 = rawQuery.getColumnIndexOrThrow("metrics_event");
                while (rawQuery.moveToNext()) {
                    String value = rawQuery.getString(columnIndexOrThrow);
                    Intrinsics.checkNotNullExpressionValue(value, "cursor.getString(uuidColumnIndex)");
                    Intrinsics.checkNotNullParameter(value, "value");
                    byte[] blob = rawQuery.getBlob(columnIndexOrThrow2);
                    Intrinsics.checkNotNullExpressionValue(blob, "cursor.getBlob(serializedMetricsEventColumnIndex)");
                    arrayList.add(c0.a(value, kotlin.text.h.x(blob)));
                }
                Unit unit = Unit.f71690a;
                rawQuery.close();
                if (arrayList.isEmpty()) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder("\n                UPDATE metrics_event_table\n                SET metrics_event = CASE\n             ");
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    int i15 = i14 + i13;
                    a0 dto = (a0) obj;
                    Intrinsics.checkNotNullParameter(dto, "dto");
                    i0 dto2 = new i0(System.currentTimeMillis(), dto.f3957a, dto.f3958b, dto.f3959c);
                    Intrinsics.checkNotNullParameter(dto, "dto");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, dto.f3958b);
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, String> entry : dto.f3959c.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    }
                    jSONObject.put("data", jSONObject2);
                    String jSONObject3 = jSONObject.toString(0);
                    Intrinsics.checkNotNullExpressionValue(jSONObject3, "jsonObject.toString(0)");
                    byte[] bytes = jSONObject3.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    Intrinsics.checkNotNullParameter(bytes, "<this>");
                    ArrayList arrayList3 = arrayList;
                    int i16 = size;
                    String O11 = C7705l.O(bytes, "", C2642c.f3967b, 30);
                    Intrinsics.checkNotNullParameter(dto2, "dto");
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(AppMeasurementSdk.ConditionalUserProperty.NAME, dto2.f3979b);
                    JSONObject jSONObject5 = new JSONObject();
                    for (Map.Entry<String, String> entry2 : dto2.f3980c.entrySet()) {
                        jSONObject5.put(entry2.getKey(), entry2.getValue());
                        i15 = i15;
                    }
                    jSONObject4.put("data", jSONObject5);
                    jSONObject4.put("time", dto2.f3981d);
                    String jSONObject6 = jSONObject4.toString(0);
                    Intrinsics.checkNotNullExpressionValue(jSONObject6, "jsonObject.toString(0)");
                    byte[] bytes2 = jSONObject6.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                    Intrinsics.checkNotNullParameter(bytes2, "<this>");
                    String a11 = V.e.a("\n                WHEN metrics_event = x'", O11, "' THEN x'", C7705l.O(bytes2, "", C2642c.f3967b, 30), "'\n            ");
                    arrayList2.add(dto.f3957a);
                    sb2.append(a11);
                    arrayList = arrayList3;
                    size = i16;
                    i14 = i15;
                    i13 = 1;
                }
                sb2.append("\n                END\n                WHERE uuid IN (" + C7714v.V(arrayList2, null, null, null, C2643d.f3968b, 31) + ")\n            ");
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "updateQuery.toString()");
                db2.execSQL(kotlin.text.h.E0(sb3));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    Vd0.b.a(rawQuery, th2);
                    throw th3;
                }
            }
        }
    }
}
