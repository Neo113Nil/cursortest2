package com.facebook.appevents.gps.ara;

import android.adservices.measurement.MeasurementManager;
import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import androidx.credentials.C0291f;
import androidx.credentials.C0292g;
import androidx.media3.exoplayer.analytics.X0;
import com.facebook.appevents.C0692d;
import com.facebook.w;
import java.net.URLEncoder;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import org.json.JSONObject;

@SourceDebugExtension({"SMAP\nGpsAraTriggersManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GpsAraTriggersManager.kt\ncom/facebook/appevents/gps/ara/GpsAraTriggersManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n1#2:180\n*E\n"})
/* loaded from: classes3.dex */
public final class a {
    public static final a a = new a();
    public static boolean b;
    public static com.facebook.appevents.gps.a c;
    public static String d;

    /* renamed from: com.facebook.appevents.gps.ara.a$a, reason: collision with other inner class name */
    public static final class C0079a extends Lambda implements Function1<String, String> {
        public final /* synthetic */ JSONObject a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0079a(JSONObject jSONObject) {
            super(1);
            this.a = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String str) {
            String str2 = str;
            Object opt = this.a.opt(str2);
            if (opt == null) {
                return null;
            }
            try {
                return URLEncoder.encode(str2, "UTF-8") + '=' + URLEncoder.encode(opt.toString(), "UTF-8");
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static final class b implements OutcomeReceiver {
        /* JADX WARN: Removed duplicated region for block: B:5:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onError(Throwable th) {
            com.facebook.appevents.gps.a aVar;
            Exception error = (Exception) th;
            Intrinsics.checkNotNullParameter(error, "error");
            com.facebook.internal.instrument.crashshield.a.b(a.class);
            com.facebook.appevents.gps.a aVar2 = null;
            if (!com.facebook.internal.instrument.crashshield.a.b(a.class)) {
                try {
                    aVar = a.c;
                } catch (Throwable th2) {
                    com.facebook.internal.instrument.crashshield.a.a(th2, a.class);
                }
                if (aVar != null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    aVar2 = aVar;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_ara_failed_reason", error.toString());
                Unit unit = Unit.INSTANCE;
                aVar2.a(bundle, "gps_ara_failed");
            }
            aVar = null;
            if (aVar != null) {
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("gps_ara_failed_reason", error.toString());
            Unit unit2 = Unit.INSTANCE;
            aVar2.a(bundle2, "gps_ara_failed");
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onResult(Object result) {
            com.facebook.appevents.gps.a aVar;
            Intrinsics.checkNotNullParameter(result, "result");
            com.facebook.internal.instrument.crashshield.a.b(a.class);
            if (!com.facebook.internal.instrument.crashshield.a.b(a.class)) {
                try {
                    aVar = a.c;
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, a.class);
                }
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                    aVar = null;
                }
                aVar.a(null, "gps_ara_succeed");
            }
            aVar = null;
            if (aVar == null) {
            }
            aVar.a(null, "gps_ara_succeed");
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue(a.class.toString(), "GpsAraTriggersManager::class.java.toString()");
    }

    public final boolean a() {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return false;
        }
        try {
            if (!b || Build.VERSION.SDK_INT < 33) {
                return false;
            }
            com.facebook.appevents.gps.a aVar = null;
            try {
                Class.forName("android.adservices.measurement.MeasurementManager");
                Class.forName("android.os.OutcomeReceiver");
                return true;
            } catch (Error e) {
                com.facebook.appevents.gps.a aVar2 = c;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    aVar = aVar2;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_ara_failed_reason", e.toString());
                Unit unit = Unit.INSTANCE;
                aVar.a(bundle, "gps_ara_failed");
                return false;
            } catch (Exception e2) {
                com.facebook.appevents.gps.a aVar3 = c;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    aVar = aVar3;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_ara_failed_reason", e2.toString());
                Unit unit2 = Unit.INSTANCE;
                aVar.a(bundle2, "gps_ara_failed");
                return false;
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return false;
        }
    }

    public final String b(C0692d c0692d) {
        String joinToString$default;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = c0692d.a;
            if (jSONObject != null && jSONObject.length() != 0) {
                Iterator<String> keys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(keys, "params.keys()");
                joinToString$default = SequencesKt___SequencesKt.joinToString$default(SequencesKt.mapNotNull(SequencesKt.asSequence(keys), new C0079a(jSONObject)), "&", null, null, 0, null, null, 62, null);
                return joinToString$default;
            }
            return "";
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return null;
        }
    }

    @TargetApi(34)
    public final void c(String applicationId, C0692d event) {
        boolean contains$default;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(event, "event");
            if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                return;
            }
            try {
                String eventName = event.a.getString("_eventName");
                if (Intrinsics.areEqual(eventName, "_removed_")) {
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(eventName, "eventName");
                contains$default = StringsKt__StringsKt.contains$default(eventName, "gps", false, 2, (Object) null);
                if (!contains$default && a()) {
                    Context a2 = w.a();
                    com.facebook.appevents.gps.a aVar = null;
                    try {
                        try {
                            MeasurementManager c2 = C0292g.c(a2.getSystemService(C0291f.g()));
                            if (c2 == null) {
                                c2 = MeasurementManager.get(a2.getApplicationContext());
                            }
                            if (c2 == null) {
                                com.facebook.appevents.gps.a aVar2 = c;
                                if (aVar2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                                    aVar2 = null;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("gps_ara_failed_reason", "Failed to get measurement manager");
                                Unit unit = Unit.INSTANCE;
                                aVar2.a(bundle, "gps_ara_failed");
                                return;
                            }
                            String b2 = b(event);
                            StringBuilder sb = new StringBuilder();
                            String str = d;
                            if (str == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("serverUri");
                                str = null;
                            }
                            sb.append(str);
                            sb.append("?app_id=");
                            sb.append(applicationId);
                            sb.append(Typography.amp);
                            sb.append(b2);
                            Uri parse = Uri.parse(sb.toString());
                            Intrinsics.checkNotNullExpressionValue(parse, "parse(\"$serverUri?$appId…=$applicationId&$params\")");
                            c2.registerTrigger(parse, w.c(), new b());
                        } catch (Exception e) {
                            com.facebook.appevents.gps.a aVar3 = c;
                            if (aVar3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                            } else {
                                aVar = aVar3;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("gps_ara_failed_reason", e.toString());
                            Unit unit2 = Unit.INSTANCE;
                            aVar.a(bundle2, "gps_ara_failed");
                        }
                    } catch (Error e2) {
                        com.facebook.appevents.gps.a aVar4 = c;
                        if (aVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                        } else {
                            aVar = aVar4;
                        }
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("gps_ara_failed_reason", e2.toString());
                        Unit unit3 = Unit.INSTANCE;
                        aVar.a(bundle3, "gps_ara_failed");
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
        }
    }

    public final void d(String applicationId, C0692d event) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(event, "event");
            w.c().execute(new X0(1, applicationId, event));
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }
}
