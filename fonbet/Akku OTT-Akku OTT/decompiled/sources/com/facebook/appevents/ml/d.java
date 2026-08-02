package com.facebook.appevents.ml;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import com.facebook.appevents.RunnableC0695g;
import com.facebook.appevents.internal.l;
import com.facebook.internal.C0715k;
import com.facebook.internal.E;
import com.facebook.w;
import com.facebook.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension({"SMAP\nModelManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelManager.kt\ncom/facebook/appevents/ml/ModelManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,369:1\n1549#2:370\n1620#2,2:371\n1622#2:376\n1549#2:379\n1620#2,2:380\n1622#2:385\n13694#3,3:373\n13694#3,3:382\n37#4,2:377\n37#4,2:386\n*S KotlinDebug\n*F\n+ 1 ModelManager.kt\ncom/facebook/appevents/ml/ModelManager\n*L\n252#1:370\n252#1:371,2\n252#1:376\n275#1:379\n275#1:380,2\n275#1:385\n254#1:373,3\n277#1:382,3\n261#1:377,2\n284#1:386,2\n*E\n"})
/* loaded from: classes3.dex */
public final class d {
    public static final d a = new d();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final List<String> c = CollectionsKt.listOf((Object[]) new String[]{"other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout"});
    public static final List<String> d = CollectionsKt.listOf((Object[]) new String[]{"none", "address", "health"});

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        /* renamed from: com.facebook.appevents.ml.d$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0083a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        static {
            a aVar = new a("MTML_INTEGRITY_DETECT", 0);
            a = aVar;
            a aVar2 = new a("MTML_APP_EVENT_PREDICTION", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }

        public final String a() {
            int i = C0083a.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return "integrity_detect";
            }
            if (i == 2) {
                return "app_event_pred";
            }
            throw new NoWhenBranchMatchedException();
        }

        public final String b() {
            int i = C0083a.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final class b {
        public static final a Companion = new a();
        public final String a;
        public final String b;
        public final String c;
        public final int d;
        public final float[] e;
        public File f;
        public com.facebook.appevents.ml.b g;
        public Runnable h;

        public static final class a {
            public static b a(JSONObject jSONObject) {
                float[] fArr;
                float[] fArr2;
                if (jSONObject == null) {
                    return null;
                }
                try {
                    String useCase = jSONObject.getString("use_case");
                    String assetUri = jSONObject.getString("asset_uri");
                    String optString = jSONObject.optString("rules_uri", null);
                    int i = jSONObject.getInt("version_id");
                    d dVar = d.a;
                    JSONArray jSONArray = jSONObject.getJSONArray("thresholds");
                    if (!com.facebook.internal.instrument.crashshield.a.b(d.class)) {
                        try {
                            dVar.getClass();
                        } catch (Throwable th) {
                            com.facebook.internal.instrument.crashshield.a.a(th, d.class);
                        }
                        if (!com.facebook.internal.instrument.crashshield.a.b(dVar) && jSONArray != null) {
                            try {
                                fArr = new float[jSONArray.length()];
                                int length = jSONArray.length();
                                for (int i2 = 0; i2 < length; i2++) {
                                    try {
                                        String string = jSONArray.getString(i2);
                                        Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                                        fArr[i2] = Float.parseFloat(string);
                                    } catch (JSONException unused) {
                                    }
                                }
                            } catch (Throwable th2) {
                                com.facebook.internal.instrument.crashshield.a.a(th2, dVar);
                            }
                            fArr2 = fArr;
                            Intrinsics.checkNotNullExpressionValue(useCase, "useCase");
                            Intrinsics.checkNotNullExpressionValue(assetUri, "assetUri");
                            return new b(useCase, assetUri, optString, i, fArr2);
                        }
                        fArr = null;
                        fArr2 = fArr;
                        Intrinsics.checkNotNullExpressionValue(useCase, "useCase");
                        Intrinsics.checkNotNullExpressionValue(assetUri, "assetUri");
                        return new b(useCase, assetUri, optString, i, fArr2);
                    }
                    fArr2 = null;
                    Intrinsics.checkNotNullExpressionValue(useCase, "useCase");
                    Intrinsics.checkNotNullExpressionValue(assetUri, "assetUri");
                    return new b(useCase, assetUri, optString, i, fArr2);
                } catch (Exception unused2) {
                    return null;
                }
            }

            public static void b(String str, String str2, l.a aVar) {
                File file = new File(h.a(), str2);
                if (str == null || file.exists()) {
                    aVar.a(file);
                } else {
                    new l(str, file, aVar).execute(new String[0]);
                }
            }

            public static void c(b master, ArrayList slaves) {
                File[] listFiles;
                boolean startsWith$default;
                boolean startsWith$default2;
                Intrinsics.checkNotNullParameter(master, "master");
                Intrinsics.checkNotNullParameter(slaves, "slaves");
                String str = master.a;
                int i = master.d;
                File a = h.a();
                if (a != null && (listFiles = a.listFiles()) != null && listFiles.length != 0) {
                    String str2 = str + '_' + i;
                    for (File file : listFiles) {
                        String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "name");
                        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(name, str, false, 2, null);
                        if (startsWith$default) {
                            startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(name, str2, false, 2, null);
                            if (!startsWith$default2) {
                                file.delete();
                            }
                        }
                    }
                }
                b(master.b, master.a + '_' + i, new e(slaves, 0));
            }
        }

        public b(String useCase, String assetUri, String str, int i, float[] fArr) {
            Intrinsics.checkNotNullParameter(useCase, "useCase");
            Intrinsics.checkNotNullParameter(assetUri, "assetUri");
            this.a = useCase;
            this.b = assetUri;
            this.c = str;
            this.d = i;
            this.e = fArr;
        }
    }

    @JvmStatic
    public static final File d() {
        a task = a.b;
        if (!com.facebook.internal.instrument.crashshield.a.b(d.class)) {
            try {
                Intrinsics.checkNotNullParameter(task, "task");
                b bVar = (b) b.get(task.b());
                if (bVar != null) {
                    return bVar.f;
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, d.class);
                return null;
            }
        }
        return null;
    }

    @JvmStatic
    public static final String[] f(a task, float[][] denses, String[] texts) {
        com.facebook.appevents.ml.b bVar;
        if (!com.facebook.internal.instrument.crashshield.a.b(d.class)) {
            try {
                Intrinsics.checkNotNullParameter(task, "task");
                Intrinsics.checkNotNullParameter(denses, "denses");
                Intrinsics.checkNotNullParameter(texts, "texts");
                b bVar2 = (b) b.get(task.b());
                if (bVar2 != null && (bVar = bVar2.g) != null) {
                    float[] fArr = bVar2.e;
                    int length = texts.length;
                    int length2 = denses[0].length;
                    com.facebook.appevents.ml.a aVar = new com.facebook.appevents.ml.a(new int[]{length, length2});
                    for (int i = 0; i < length; i++) {
                        System.arraycopy(denses[i], 0, aVar.c, i * length2, length2);
                    }
                    com.facebook.appevents.ml.a a2 = bVar.a(aVar, texts, task.a());
                    if (a2 != null && fArr != null && a2.c.length != 0 && fArr.length != 0) {
                        int ordinal = task.ordinal();
                        d dVar = a;
                        if (ordinal == 0) {
                            return dVar.g(a2, fArr);
                        }
                        if (ordinal == 1) {
                            return dVar.h(a2, fArr);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, d.class);
                return null;
            }
        }
        return null;
    }

    public final void a(JSONObject jSONObject) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    b.a aVar = b.Companion;
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    aVar.getClass();
                    b a2 = b.a.a(jSONObject2);
                    if (a2 != null) {
                        b.put(a2.a, a2);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        if (r0 != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        Locale locale;
        boolean contains$default;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            String str = null;
            for (Map.Entry entry : b.entrySet()) {
                String str2 = (String) entry.getKey();
                b bVar = (b) entry.getValue();
                if (Intrinsics.areEqual(str2, a.b.b())) {
                    str = bVar.b;
                    int max = Math.max(i, bVar.d);
                    if (C0715k.b(C0715k.b.SuggestedEvents) && !com.facebook.internal.instrument.crashshield.a.b(this)) {
                        try {
                            E e = E.a;
                            try {
                                locale = w.a().getResources().getConfiguration().locale;
                            } catch (Exception unused) {
                                locale = null;
                            }
                            if (locale != null) {
                                String language = locale.getLanguage();
                                Intrinsics.checkNotNullExpressionValue(language, "locale.language");
                                contains$default = StringsKt__StringsKt.contains$default(language, "en", false, 2, (Object) null);
                            }
                            bVar.h = new c();
                            arrayList.add(bVar);
                        } catch (Throwable th) {
                            com.facebook.internal.instrument.crashshield.a.a(th, this);
                        }
                    }
                    i = max;
                }
                if (Intrinsics.areEqual(str2, a.a.b())) {
                    str = bVar.b;
                    i = Math.max(i, bVar.d);
                    if (C0715k.b(C0715k.b.IntelligentIntegrity)) {
                        bVar.h = new RunnableC0695g(1);
                        arrayList.add(bVar);
                    }
                }
            }
            if (str == null || i <= 0 || arrayList.isEmpty()) {
                return;
            }
            b bVar2 = new b("MTML", str, null, i, null);
            b.Companion.getClass();
            b.a.c(bVar2, arrayList);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
        }
    }

    public final JSONObject c() {
        if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
                z.Companion.getClass();
                z g = z.c.g(null, "app/model_asset", null);
                Intrinsics.checkNotNullParameter(bundle, "<set-?>");
                g.d = bundle;
                JSONObject jSONObject = g.c().b;
                if (jSONObject != null) {
                    return e(jSONObject);
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
                return null;
            }
        }
        return null;
    }

    public final JSONObject e(JSONObject jSONObject) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return null;
        }
    }

    public final String[] g(com.facebook.appevents.ml.a aVar, float[] fArr) {
        int collectionSizeOrDefault;
        if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
            try {
                int[] iArr = aVar.a;
                int i = iArr[0];
                int i2 = iArr[1];
                float[] fArr2 = aVar.c;
                if (i2 == fArr.length) {
                    IntRange until = RangesKt.until(0, i);
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    Iterator<Integer> it = until.iterator();
                    while (it.hasNext()) {
                        int nextInt = ((IntIterator) it).nextInt();
                        String str = "none";
                        int length = fArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            int i5 = i4 + 1;
                            if (fArr2[(nextInt * i2) + i4] >= fArr[i3]) {
                                str = d.get(i4);
                            }
                            i3++;
                            i4 = i5;
                        }
                        arrayList.add(str);
                    }
                    return (String[]) arrayList.toArray(new String[0]);
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
                return null;
            }
        }
        return null;
    }

    public final String[] h(com.facebook.appevents.ml.a aVar, float[] fArr) {
        int collectionSizeOrDefault;
        if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
            try {
                int[] iArr = aVar.a;
                int i = iArr[0];
                int i2 = iArr[1];
                float[] fArr2 = aVar.c;
                if (i2 == fArr.length) {
                    IntRange until = RangesKt.until(0, i);
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    Iterator<Integer> it = until.iterator();
                    while (it.hasNext()) {
                        int nextInt = ((IntIterator) it).nextInt();
                        String str = "other";
                        int length = fArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            int i5 = i4 + 1;
                            if (fArr2[(nextInt * i2) + i4] >= fArr[i3]) {
                                str = c.get(i4);
                            }
                            i3++;
                            i4 = i5;
                        }
                        arrayList.add(str);
                    }
                    return (String[]) arrayList.toArray(new String[0]);
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
                return null;
            }
        }
        return null;
    }
}
