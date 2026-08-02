package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.C0728q;
import com.facebook.appevents.C0692d;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

@SourceDebugExtension({"SMAP\nOperationalData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperationalData.kt\ncom/facebook/appevents/OperationalData\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,252:1\n457#2:253\n403#2:254\n1238#3,4:255\n*S KotlinDebug\n*F\n+ 1 OperationalData.kt\ncom/facebook/appevents/OperationalData\n*L\n74#1:253\n74#1:254\n74#1:255,4\n*E\n"})
/* loaded from: classes3.dex */
public final class A {
    public static final a Companion = new a();
    public static final Set<String> b;
    public static final Set<String> c;
    public static final Map<B, Pair<Set<String>, Set<String>>> d;
    public final LinkedHashMap a = new LinkedHashMap();

    public static final class a {
        public static void a(String key, String value, Bundle customEventsParams, A operationalData) {
            B typeOfParameter = B.a;
            Intrinsics.checkNotNullParameter(typeOfParameter, "typeOfParameter");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(customEventsParams, "customEventsParams");
            Intrinsics.checkNotNullParameter(operationalData, "operationalData");
            int ordinal = d(key).ordinal();
            if (ordinal == 0) {
                customEventsParams.putCharSequence(key, value);
                return;
            }
            if (ordinal == 1) {
                operationalData.a(typeOfParameter, key, value);
            } else {
                if (ordinal != 2) {
                    return;
                }
                operationalData.a(typeOfParameter, key, value);
                customEventsParams.putCharSequence(key, value);
            }
        }

        public static Pair b(String key, String value, Bundle bundle, A a) {
            B typeOfParameter = B.a;
            Intrinsics.checkNotNullParameter(typeOfParameter, "typeOfParameter");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            int ordinal = d(key).ordinal();
            if (ordinal == 0) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putCharSequence(key, value);
            } else if (ordinal == 1) {
                if (a == null) {
                    a = new A();
                }
                a.a(typeOfParameter, key, value);
            } else if (ordinal == 2) {
                if (a == null) {
                    a = new A();
                }
                if (bundle == null) {
                    bundle = new Bundle();
                }
                a.a(typeOfParameter, key, value);
                bundle.putCharSequence(key, value);
            }
            return new Pair(bundle, a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0038 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object c(String key, Bundle bundle, A a) {
            Object obj;
            Map map;
            B type = B.a;
            Intrinsics.checkNotNullParameter(type, "typeOfParameter");
            Intrinsics.checkNotNullParameter(key, "key");
            if (a != null) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(key, "key");
                LinkedHashMap linkedHashMap = a.a;
                if (linkedHashMap.containsKey(type) && (map = (Map) linkedHashMap.get(type)) != null) {
                    obj = map.get(key);
                    return obj != null ? bundle != null ? bundle.getCharSequence(key) : null : obj;
                }
            }
            obj = null;
            if (obj != null) {
            }
        }

        public static C d(String parameter) {
            B typeOfParameter = B.a;
            Intrinsics.checkNotNullParameter(typeOfParameter, "typeOfParameter");
            Intrinsics.checkNotNullParameter(parameter, "parameter");
            Map<B, Pair<Set<String>, Set<String>>> map = A.d;
            Pair<Set<String>, Set<String>> pair = map.get(typeOfParameter);
            Set<String> first = pair != null ? pair.getFirst() : null;
            Pair<Set<String>, Set<String>> pair2 = map.get(typeOfParameter);
            Set<String> second = pair2 != null ? pair2.getSecond() : null;
            return (first == null || !first.contains(parameter)) ? (second == null || !second.contains(parameter)) ? C.a : C.c : C.b;
        }
    }

    static {
        Set<String> of = SetsKt.setOf((Object[]) new String[]{"fb_iap_package_name", "fb_iap_subs_auto_renewing", "fb_free_trial_period", "fb_intro_price_amount_micros", "fb_intro_price_cycles", "fb_iap_base_plan", "is_implicit_purchase_logging_enabled", "fb_iap_sdk_supported_library_versions", "is_autolog_app_events_enabled", "fb_iap_client_library_version", "fb_iap_subs_period", "fb_iap_purchase_token", "fb_iap_non_deduped_event_time", "fb_iap_actual_dedup_result", "fb_iap_actual_dedup_key_used", "fb_iap_test_dedup_result", "fb_iap_test_dedup_key_used"});
        b = of;
        Set<String> of2 = SetsKt.setOf((Object[]) new String[]{"fb_iap_product_id", "fb_iap_product_type", "fb_iap_purchase_time"});
        c = of2;
        d = MapsKt.mapOf(TuplesKt.to(B.a, new Pair(of, of2)));
    }

    public final void a(B type, String key, Object value) {
        LinkedHashMap linkedHashMap = this.a;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            C0692d.Companion.getClass();
            C0692d.a.a(key);
            if (!(value instanceof String) && !(value instanceof Number)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{value, key}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                throw new C0728q(format);
            }
            if (!linkedHashMap.containsKey(type)) {
                linkedHashMap.put(type, new LinkedHashMap());
            }
            Map map = (Map) linkedHashMap.get(type);
            if (map != null) {
                map.put(key, value);
            }
        } catch (Exception unused) {
        }
    }
}
