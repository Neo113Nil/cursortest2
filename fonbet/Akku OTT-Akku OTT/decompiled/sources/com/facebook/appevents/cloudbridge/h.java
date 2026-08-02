package com.facebook.appevents.cloudbridge;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAppEventsConversionsAPITransformerWebRequests.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppEventsConversionsAPITransformerWebRequests.kt\ncom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n1855#2,2:270\n1#3:272\n*S KotlinDebug\n*F\n+ 1 AppEventsConversionsAPITransformerWebRequests.kt\ncom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests\n*L\n217#1:270,2\n*E\n"})
/* loaded from: classes3.dex */
public final class h {
    public static final HashSet<Integer> a = SetsKt.hashSetOf(200, Integer.valueOf(ComposerKt.compositionLocalMapKey));
    public static final HashSet<Integer> b = SetsKt.hashSetOf(503, 504, 429);
    public static a c;
    public static List<Map<String, Object>> d;
    public static int e;

    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String datasetID, String cloudBridgeURL, String accessKey) {
            Intrinsics.checkNotNullParameter(datasetID, "datasetID");
            Intrinsics.checkNotNullParameter(cloudBridgeURL, "cloudBridgeURL");
            Intrinsics.checkNotNullParameter(accessKey, "accessKey");
            this.a = datasetID;
            this.b = cloudBridgeURL;
            this.c = accessKey;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + androidx.compose.runtime.collection.a.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CloudBridgeCredentials(datasetID=");
            sb.append(this.a);
            sb.append(", cloudBridgeURL=");
            sb.append(this.b);
            sb.append(", accessKey=");
            return t.b(')', this.c, sb);
        }
    }

    @JvmStatic
    public static final void a(String datasetID, String url, String accessKey) {
        Intrinsics.checkNotNullParameter(datasetID, "datasetID");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(accessKey, "accessKey");
        a aVar = new a(datasetID, url, accessKey);
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        c = aVar;
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        d = arrayList;
    }

    public static List b() {
        List<Map<String, Object>> list = d;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transformedEvents");
        return null;
    }
}
