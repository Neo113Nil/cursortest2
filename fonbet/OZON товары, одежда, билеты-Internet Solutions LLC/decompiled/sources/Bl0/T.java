package Bl0;

import Al0.c;
import Bl0.Z;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final H f3946a;

    /* renamed from: b, reason: collision with root package name */
    public final P f3947b;

    public T(H persistentMetricsEventRepository, P remoteMetricsEventRepository) {
        Intrinsics.checkNotNullParameter(persistentMetricsEventRepository, "persistentMetricsEventRepository");
        Intrinsics.checkNotNullParameter(remoteMetricsEventRepository, "remoteMetricsEventRepository");
        this.f3946a = persistentMetricsEventRepository;
        this.f3947b = remoteMetricsEventRepository;
    }

    public final Z a() {
        String str;
        String a11;
        C2662x c2662x = this.f3946a.f3920a;
        String E02 = kotlin.text.h.E0("\n            SELECT * FROM metrics_event_table\n            LIMIT 10\n        ");
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        Cursor rawQuery = ((SQLiteDatabase) c2662x.f3998b.getValue()).rawQuery(E02, new String[0]);
        try {
            int columnIndexOrThrow = rawQuery.getColumnIndexOrThrow("uuid");
            int columnIndexOrThrow2 = rawQuery.getColumnIndexOrThrow("metrics_event");
            while (rawQuery.moveToNext()) {
                String value = rawQuery.getString(columnIndexOrThrow);
                Intrinsics.checkNotNullExpressionValue(value, "cursor.getString(uuidColumnIndex)");
                Intrinsics.checkNotNullParameter(value, "value");
                byte[] blob = rawQuery.getBlob(columnIndexOrThrow2);
                Intrinsics.checkNotNullExpressionValue(blob, "cursor.getBlob(serializedMetricsEventColumnIndex)");
                arrayList.add(new C2664z(value, blob));
            }
            Unit unit = Unit.f71690a;
            rawQuery.close();
            List<C2664z> U02 = C7714v.U0(arrayList);
            C2658t messageBuilder = new C2658t(U02);
            Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
            ArrayList values = new ArrayList(C7714v.z(U02, 10));
            for (C2664z dto : U02) {
                Intrinsics.checkNotNullParameter(dto, "dto");
                String str2 = dto.f4000a;
                String jsonString = kotlin.text.h.x(dto.f4001b);
                Intrinsics.checkNotNullParameter(jsonString, "jsonString");
                JSONObject jSONObject = new JSONObject(jsonString);
                String string = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(NAME_KEY)");
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonObject.getJSONObject(DATA_KEY)");
                Intrinsics.checkNotNullParameter(jSONObject2, "<this>");
                ArrayList arrayList2 = new ArrayList();
                Iterator<String> keys = jSONObject2.keys();
                Intrinsics.checkNotNullExpressionValue(keys, "keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList2.add(new Pair(next, jSONObject2.get(next).toString()));
                }
                values.add(new C2650k(str2, new Al0.b(string, kotlin.collections.U.s(arrayList2), jSONObject.getLong("time"))));
            }
            if (values.isEmpty()) {
                return Z.a.f3955a;
            }
            P p11 = this.f3947b;
            Intrinsics.checkNotNullParameter(values, "values");
            String value2 = p11.f3941b.f3973a.getPackageName();
            Intrinsics.checkNotNullExpressionValue(value2, "context.packageName");
            Intrinsics.checkNotNullParameter(value2, "value");
            C2641b c2641b = p11.f3940a;
            SharedPreferences sharedPreferences = c2641b.f3961a.f3969a;
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "sharedPreferences");
            HttpsURLConnection httpsURLConnection = null;
            String value3 = sharedPreferences.getString("USER_ID_KEY", null);
            if (value3 != null) {
                Intrinsics.checkNotNullParameter(value3, "value");
            } else {
                value3 = null;
            }
            if (value3 == null) {
                synchronized (C2641b.f3960c) {
                    try {
                        SharedPreferences sharedPreferences2 = c2641b.f3961a.f3969a;
                        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "sharedPreferences");
                        String value4 = sharedPreferences2.getString("USER_ID_KEY", null);
                        if (value4 != null) {
                            Intrinsics.checkNotNullParameter(value4, "value");
                        } else {
                            value4 = null;
                        }
                        a11 = value4 == null ? c2641b.a() : value4;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                str = a11;
            } else {
                str = value3;
            }
            C2648i c2648i = (C2648i) p11.f3943d.f3986b.getValue();
            String str3 = c2648i != null ? c2648i.f3977a : null;
            ArrayList values2 = new ArrayList(C7714v.z(values, 10));
            int size = values.size();
            while (i11 < size) {
                Object obj = values.get(i11);
                i11++;
                C2650k c2650k = (C2650k) obj;
                values2.add(new L(value2, c2650k.f3983a, str, str3, c2650k.f3984b));
            }
            J j11 = p11.f3942c;
            Intrinsics.checkNotNullParameter(values2, "values");
            U u11 = j11.f3927a;
            Intrinsics.checkNotNullParameter(values2, "values");
            try {
                String a12 = U.a(values2);
                HttpsURLConnection b11 = u11.b();
                OutputStream outputStream = b11.getOutputStream();
                try {
                    byte[] bytes = a12.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    outputStream.flush();
                    Unit unit2 = Unit.f71690a;
                    outputStream.close();
                    try {
                        O messageBuilder2 = new O(b11.getURL(), b11.getResponseCode(), a12, b11.getRequestProperty("X-Metrics-Request-Time"));
                        Intrinsics.checkNotNullParameter(messageBuilder2, "messageBuilder");
                        b11.disconnect();
                        return new Z.b(values);
                    } catch (Throwable th3) {
                        th = th3;
                        httpsURLConnection = b11;
                        try {
                            Q messageBuilder3 = new Q(th);
                            Intrinsics.checkNotNullParameter(messageBuilder3, "messageBuilder");
                            throw new c.b(th);
                        } catch (Throwable th4) {
                            if (httpsURLConnection != null) {
                                httpsURLConnection.disconnect();
                            }
                            throw th4;
                        }
                    }
                } finally {
                }
            } catch (Throwable th5) {
                th = th5;
                Q messageBuilder32 = new Q(th);
                Intrinsics.checkNotNullParameter(messageBuilder32, "messageBuilder");
                throw new c.b(th);
            }
        } finally {
        }
    }
}
