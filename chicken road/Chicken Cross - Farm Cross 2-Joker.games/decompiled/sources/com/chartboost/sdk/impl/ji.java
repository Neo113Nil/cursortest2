package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import bolts.MeasurementEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class ji {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f4830a;
    public final ei b;
    public final Function1 c;

    public ji(SharedPreferences sharedPreferences, ei trackingBodyBuilder, Function1 jsonFactory) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(trackingBodyBuilder, "trackingBodyBuilder");
        Intrinsics.checkNotNullParameter(jsonFactory, "jsonFactory");
        this.f4830a = sharedPreferences;
        this.b = trackingBodyBuilder;
        this.c = jsonFactory;
    }

    public static final JSONObject a(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new JSONObject(it);
    }

    public final String b(com.chartboost.sdk.tracking.f fVar) {
        return fVar.f().getValue() + fVar.i();
    }

    public final void a(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        try {
            for (JSONObject jSONObject : g8.asList(jsonArray)) {
                this.f4830a.edit().putString(a(jSONObject), jSONObject.toString()).apply();
            }
        } catch (Exception e) {
            mb.a("cacheEventToTrackingRequestBodyAndSave error " + e, (Throwable) null, 2, (Object) null);
        }
    }

    public /* synthetic */ ji(SharedPreferences sharedPreferences, ei eiVar, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, eiVar, (i & 4) != 0 ? new Function1() { // from class: com.chartboost.sdk.impl.ji$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ji.a((String) obj);
            }
        } : function1);
    }

    public final void a(com.chartboost.sdk.tracking.f event, d7 environmentData, int i) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(environmentData, "environmentData");
        if (this.f4830a.getAll().size() > i) {
            mb.a("Persistence limit reached. Drop old events!", (Throwable) null, 2, (Object) null);
            this.f4830a.edit().clear().apply();
        }
        try {
            this.f4830a.edit().putString(b(event), this.b.a(event, environmentData)).apply();
        } catch (Exception e) {
            mb.a("cacheEventToTrackingRequestBodyAndSave error " + e, (Throwable) null, 2, (Object) null);
        }
    }

    public final List a() {
        try {
            List list = CollectionsKt.toList(this.f4830a.getAll().values());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object invoke = this.c.invoke(String.valueOf(it.next()));
                this.f4830a.edit().clear().apply();
                arrayList.add((JSONObject) invoke);
            }
            return arrayList;
        } catch (Exception e) {
            mb.a("loadEventsAsJsonList error " + e, (Throwable) null, 2, (Object) null);
            return CollectionsKt.emptyList();
        }
    }

    public final String a(JSONObject jSONObject) {
        return jSONObject.getString(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY) + jSONObject.getLong("event_timestamp");
    }

    public final void a(com.chartboost.sdk.tracking.f event, d7 environmentData) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(environmentData, "environmentData");
        try {
            mb.a("forcePersistEvent: " + event.f().getValue(), (Throwable) null, 2, (Object) null);
            this.f4830a.edit().putString(event.f().getValue(), this.b.a(event, environmentData)).apply();
        } catch (Exception e) {
            mb.a("forcePersistEvent error " + e, (Throwable) null, 2, (Object) null);
        }
    }

    public final void a(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            mb.a("clearEventFromStorage: " + event.f().getValue(), (Throwable) null, 2, (Object) null);
            this.f4830a.edit().remove(event.f().getValue()).apply();
        } catch (Exception e) {
            mb.a("clearEventFromStorage error " + e, (Throwable) null, 2, (Object) null);
        }
    }

    public final List a(List events, d7 environmentData) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(environmentData, "environmentData");
        try {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(events, 10));
            Iterator it = events.iterator();
            while (it.hasNext()) {
                arrayList.add((JSONObject) this.c.invoke(this.b.a((com.chartboost.sdk.tracking.f) it.next(), environmentData)));
            }
            return arrayList;
        } catch (Exception e) {
            mb.a("cacheEventToTrackingRequestBody error " + e, (Throwable) null, 2, (Object) null);
            return CollectionsKt.emptyList();
        }
    }
}
