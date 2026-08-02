package com.facebook.appevents.cloudbridge;

import com.facebook.G;
import com.facebook.internal.E;
import com.facebook.internal.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SourceDebugExtension({"SMAP\nAppEventsConversionsAPITransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppEventsConversionsAPITransformer.kt\ncom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,719:1\n1855#2,2:720\n1855#2,2:722\n1855#2:724\n1855#2,2:725\n1856#2:727\n1855#2,2:728\n215#3,2:730\n*S KotlinDebug\n*F\n+ 1 AppEventsConversionsAPITransformer.kt\ncom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer\n*L\n386#1:720,2\n433#1:722,2\n454#1:724\n459#1:725,2\n454#1:727\n610#1:728,2\n666#1:730,2\n*E\n"})
/* loaded from: classes3.dex */
public final class g {
    public static final Map<com.facebook.appevents.cloudbridge.b, b> a;

    @JvmField
    public static final Map<n, a> b;

    @JvmField
    public static final Map<String, l> c;

    public static final class a {
        public final m a;
        public final k b;

        public a(m mVar, k field) {
            Intrinsics.checkNotNullParameter(field, "field");
            this.a = mVar;
            this.b = field;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            m mVar = this.a;
            return this.b.hashCode() + ((mVar == null ? 0 : mVar.hashCode()) * 31);
        }

        public final String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.a + ", field=" + this.b + ')';
        }
    }

    public static final class b {
        public final m a;
        public final int b;

        public b(m section, int i) {
            Intrinsics.checkNotNullParameter(section, "section");
            this.a = section;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            int i = this.b;
            return hashCode + (i == 0 ? 0 : com.bumptech.glide.request.e.a(i));
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("SectionFieldMapping(section=");
            sb.append(this.a);
            sb.append(", field=");
            switch (this.b) {
                case 1:
                    str = "ANON_ID";
                    break;
                case 2:
                    str = "FB_LOGIN_ID";
                    break;
                case 3:
                    str = "MAD_ID";
                    break;
                case 4:
                    str = "PAGE_ID";
                    break;
                case 5:
                    str = "PAGE_SCOPED_USER_ID";
                    break;
                case 6:
                    str = "USER_DATA";
                    break;
                case 7:
                    str = "ADV_TE";
                    break;
                case 8:
                    str = "APP_TE";
                    break;
                case 9:
                    str = "CONSIDER_VIEWS";
                    break;
                case 10:
                    str = "DEVICE_TOKEN";
                    break;
                case 11:
                    str = "EXT_INFO";
                    break;
                case 12:
                    str = "INCLUDE_DWELL_DATA";
                    break;
                case 13:
                    str = "INCLUDE_VIDEO_DATA";
                    break;
                case 14:
                    str = "INSTALL_REFERRER";
                    break;
                case 15:
                    str = "INSTALLER_PACKAGE";
                    break;
                case 16:
                    str = "RECEIPT_DATA";
                    break;
                case 17:
                    str = "URL_SCHEMES";
                    break;
                case 18:
                    str = "ADD_TO_MESSAGING_CUSTOMER_BASE_FOR_WHATSAPP";
                    break;
                default:
                    str = "null";
                    break;
            }
            sb.append(str);
            sb.append(')');
            return sb.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final a Companion;
        public static final c a;
        public static final c b;
        public static final c c;
        public static final /* synthetic */ c[] d;

        public static final class a {
        }

        static {
            c cVar = new c("ARRAY", 0);
            a = cVar;
            c cVar2 = new c("BOOL", 1);
            b = cVar2;
            c cVar3 = new c("INT", 2);
            c = cVar3;
            d = new c[]{cVar, cVar2, cVar3};
            Companion = new a();
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) d.clone();
        }
    }

    static {
        m mVar = m.a;
        Pair pair = TuplesKt.to(com.facebook.appevents.cloudbridge.b.ANON_ID, new b(mVar, 1));
        Pair pair2 = TuplesKt.to(com.facebook.appevents.cloudbridge.b.APP_USER_ID, new b(mVar, 2));
        Pair pair3 = TuplesKt.to(com.facebook.appevents.cloudbridge.b.ADVERTISER_ID, new b(mVar, 3));
        Pair pair4 = TuplesKt.to(com.facebook.appevents.cloudbridge.b.PAGE_ID, new b(mVar, 4));
        Pair pair5 = TuplesKt.to(com.facebook.appevents.cloudbridge.b.PAGE_SCOPED_USER_ID, new b(mVar, 5));
        m mVar2 = m.b;
        a = MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, TuplesKt.to(com.facebook.appevents.cloudbridge.b.ADV_TE, new b(mVar2, 7)), TuplesKt.to(com.facebook.appevents.cloudbridge.b.APP_TE, new b(mVar2, 8)), TuplesKt.to(com.facebook.appevents.cloudbridge.b.CONSIDER_VIEWS, new b(mVar2, 9)), TuplesKt.to(com.facebook.appevents.cloudbridge.b.DEVICE_TOKEN, new b(mVar2, 10)), TuplesKt.to(com.facebook.appevents.cloudbridge.b.EXT_INFO, new b(mVar2, 11)), TuplesKt.to(com.facebook.appevents.cloudbridge.b.INCLUDE_DWELL_DATA, new b(mVar2, 12)), TuplesKt.to(com.facebook.appevents.cloudbridge.b.INCLUDE_VIDEO_DATA, new b(mVar2, 13)), TuplesKt.to(com.facebook.appevents.cloudbridge.b.INSTALL_REFERRER, new b(mVar2, 14)), TuplesKt.to(com.facebook.appevents.cloudbridge.b.INSTALLER_PACKAGE, new b(mVar2, 15)), TuplesKt.to(com.facebook.appevents.cloudbridge.b.RECEIPT_DATA, new b(mVar2, 16)), TuplesKt.to(com.facebook.appevents.cloudbridge.b.URL_SCHEMES, new b(mVar2, 17)), TuplesKt.to(com.facebook.appevents.cloudbridge.b.ADD_TO_MESSAGING_CUSTOMER_BASE_FOR_WHATSAPP, new b(mVar2, 18)), TuplesKt.to(com.facebook.appevents.cloudbridge.b.USER_DATA, new b(mVar, 0)));
        Pair pair6 = TuplesKt.to(n.EVENT_TIME, new a(null, k.EVENT_TIME));
        Pair pair7 = TuplesKt.to(n.EVENT_NAME, new a(null, k.EVENT_NAME));
        k kVar = k.VALUE_TO_SUM;
        m mVar3 = m.c;
        b = MapsKt.mapOf(pair6, pair7, TuplesKt.to(n.VALUE_TO_SUM, new a(mVar3, kVar)), TuplesKt.to(n.CONTENT_IDS, new a(mVar3, k.CONTENT_IDS)), TuplesKt.to(n.CONTENTS, new a(mVar3, k.CONTENTS)), TuplesKt.to(n.CONTENT_TYPE, new a(mVar3, k.CONTENT_TYPE)), TuplesKt.to(n.CURRENCY, new a(mVar3, k.CURRENCY)), TuplesKt.to(n.DESCRIPTION, new a(mVar3, k.DESCRIPTION)), TuplesKt.to(n.LEVEL, new a(mVar3, k.LEVEL)), TuplesKt.to(n.MAX_RATING_VALUE, new a(mVar3, k.MAX_RATING_VALUE)), TuplesKt.to(n.NUM_ITEMS, new a(mVar3, k.NUM_ITEMS)), TuplesKt.to(n.PAYMENT_INFO_AVAILABLE, new a(mVar3, k.PAYMENT_INFO_AVAILABLE)), TuplesKt.to(n.REGISTRATION_METHOD, new a(mVar3, k.REGISTRATION_METHOD)), TuplesKt.to(n.SEARCH_STRING, new a(mVar3, k.SEARCH_STRING)), TuplesKt.to(n.SUCCESS, new a(mVar3, k.SUCCESS)), TuplesKt.to(n.ORDER_ID, new a(mVar3, k.ORDER_ID)), TuplesKt.to(n.AD_TYPE, new a(mVar3, k.AD_TYPE)));
        c = MapsKt.mapOf(TuplesKt.to("fb_mobile_achievement_unlocked", l.UNLOCKED_ACHIEVEMENT), TuplesKt.to("fb_mobile_activate_app", l.ACTIVATED_APP), TuplesKt.to("fb_mobile_add_payment_info", l.ADDED_PAYMENT_INFO), TuplesKt.to("fb_mobile_add_to_cart", l.ADDED_TO_CART), TuplesKt.to("fb_mobile_add_to_wishlist", l.ADDED_TO_WISHLIST), TuplesKt.to("fb_mobile_complete_registration", l.COMPLETED_REGISTRATION), TuplesKt.to("fb_mobile_content_view", l.VIEWED_CONTENT), TuplesKt.to("fb_mobile_initiated_checkout", l.INITIATED_CHECKOUT), TuplesKt.to("fb_mobile_level_achieved", l.ACHIEVED_LEVEL), TuplesKt.to("fb_mobile_purchase", l.PURCHASED), TuplesKt.to("fb_mobile_rate", l.RATED), TuplesKt.to("fb_mobile_search", l.SEARCHED), TuplesKt.to("fb_mobile_spent_credits", l.SPENT_CREDITS), TuplesKt.to("fb_mobile_tutorial_completion", l.COMPLETED_TUTORIAL));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.HashMap] */
    @JvmStatic
    public static final Object a(Object value, String rawValue) {
        Intrinsics.checkNotNullParameter(rawValue, "field");
        Intrinsics.checkNotNullParameter(value, "value");
        c.Companion.getClass();
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        c cVar = Intrinsics.areEqual(rawValue, "extInfo") ? c.a : Intrinsics.areEqual(rawValue, "url_schemes") ? c.a : Intrinsics.areEqual(rawValue, "fb_content_id") ? c.a : Intrinsics.areEqual(rawValue, "fb_content") ? c.a : Intrinsics.areEqual(rawValue, "data_processing_options") ? c.a : Intrinsics.areEqual(rawValue, "advertiser_tracking_enabled") ? c.b : Intrinsics.areEqual(rawValue, "application_tracking_enabled") ? c.b : Intrinsics.areEqual(rawValue, "_logTime") ? c.c : null;
        String str = value instanceof String ? (String) value : null;
        if (cVar == null || str == null) {
            return value;
        }
        int ordinal = cVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return StringsKt.toIntOrNull(value.toString());
                }
                throw new NoWhenBranchMatchedException();
            }
            Integer intOrNull = StringsKt.toIntOrNull(str.toString());
            if (intOrNull != null) {
                return Boolean.valueOf(intOrNull.intValue() != 0);
            }
            return null;
        }
        try {
            ArrayList f = E.f(new JSONArray(str));
            ArrayList arrayList = new ArrayList();
            Iterator it = f.iterator();
            while (it.hasNext()) {
                ?? r1 = (String) it.next();
                try {
                    try {
                        r1 = E.g(new JSONObject((String) r1));
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                    r1 = E.f(new JSONArray((String) r1));
                }
                arrayList.add(r1);
            }
            return arrayList;
        } catch (JSONException e) {
            u.Companion.getClass();
            u.a.b(G.d, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", value, e);
            return Unit.INSTANCE;
        }
    }
}
