package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.of, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0728of implements Zi {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7996a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7997b = "content://" + a() + "/preload_info";

    /* renamed from: c, reason: collision with root package name */
    public final String f7998c = "tracking_id";

    /* renamed from: d, reason: collision with root package name */
    public final String f7999d = "additional_parameters";

    public C0728of(Context context) {
        this.f7996a = context;
    }

    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.Zi, o2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0909vf invoke() {
        Cursor cursor;
        JSONObject jSONObject;
        if (!PackageManagerUtils.hasContentProvider(this.f7996a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC0628kj.a("Satellite content provider with preload info was not found.", new Object[0]);
            return null;
        }
        try {
            cursor = this.f7996a.getContentResolver().query(Uri.parse(this.f7997b), null, null, null, null);
            try {
                if (cursor == null) {
                    AbstractC0628kj.a("No Satellite content provider found", new Object[0]);
                } else {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f7998c));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f7999d));
                        if (string2 != null) {
                            try {
                            } catch (Throwable unused) {
                                jSONObject = new JSONObject();
                            }
                            if (string2.length() != 0) {
                                jSONObject = new JSONObject(string2);
                                JSONObject jSONObject2 = jSONObject;
                                if (!TextUtils.isEmpty(string) && ParseUtils.parseLong(string) == null) {
                                    AbstractC0628kj.a("Tracking id from Satellite is not a number.", new Object[0]);
                                }
                                AbstractC0628kj.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject2);
                                C0909vf c0909vf = new C0909vf(string, jSONObject2, !TextUtils.isEmpty(string), false, Y7.f6855d);
                                AbstractC0711no.a(cursor);
                                return c0909vf;
                            }
                        }
                        jSONObject = new JSONObject();
                        JSONObject jSONObject22 = jSONObject;
                        if (!TextUtils.isEmpty(string)) {
                            AbstractC0628kj.a("Tracking id from Satellite is not a number.", new Object[0]);
                        }
                        AbstractC0628kj.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject22);
                        C0909vf c0909vf2 = new C0909vf(string, jSONObject22, !TextUtils.isEmpty(string), false, Y7.f6855d);
                        AbstractC0711no.a(cursor);
                        return c0909vf2;
                    }
                    AbstractC0628kj.a("No Preload Info data in Satellite content provider", new Object[0]);
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            cursor = null;
        }
        AbstractC0711no.a(cursor);
        return null;
    }
}
