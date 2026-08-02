package androidx.view.provider.utils;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Landroidx/credentials/provider/utils/PrivilegedApp;", "", "", com.visa.cbp.ConsumerInfo.setSignature, "", "fingerprints", "<init>", "(Ljava/lang/String;Ljava/util/Set;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Set;", "copy", "(Ljava/lang/String;Ljava/util/Set;)Landroidx/credentials/provider/utils/PrivilegedApp;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPackageName", "Ljava/util/Set;", "getFingerprints", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PrivilegedApp {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.utils.PrivilegedApp.Companion INSTANCE = new androidx.view.provider.utils.PrivilegedApp.Companion(null);
    private final java.util.Set<java.lang.String> fingerprints;
    private final java.lang.String packageName;

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/credentials/provider/utils/PrivilegedApp$Companion;", "", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "", "Landroidx/credentials/provider/utils/PrivilegedApp;", "extractPrivilegedApps$credentials_release", "(Lorg/json/JSONObject;)Ljava/util/List;", "appInfoJsonObject", "", "filterUserDebug", "createFromJSONObject", "(Lorg/json/JSONObject;Z)Landroidx/credentials/provider/utils/PrivilegedApp;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final java.util.List<androidx.view.provider.utils.PrivilegedApp> extractPrivilegedApps$credentials_release(org.json.JSONObject jsonObject) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONArray jSONArray = jsonObject.getJSONArray("apps");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (kotlin.jvm.internal.Intrinsics.areEqual(jSONObject.getString("type"), com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME)) {
                    org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("info");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
                    arrayList.add(createFromJSONObject(jSONObject2, true));
                }
            }
            return arrayList;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.utils.PrivilegedApp createFromJSONObject(org.json.JSONObject appInfoJsonObject, boolean filterUserDebug) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfoJsonObject, "");
            org.json.JSONArray jSONArray = appInfoJsonObject.getJSONArray("signatures");
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                if (!filterUserDebug || !kotlin.jvm.internal.Intrinsics.areEqual("userdebug", jSONArray.getJSONObject(i).optString("build")) || kotlin.jvm.internal.Intrinsics.areEqual("userdebug", android.os.Build.TYPE)) {
                    java.lang.String string = jSONArray.getJSONObject(i).getString("cert_fingerprint_sha256");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                    linkedHashSet.add(string);
                }
            }
            java.lang.String string2 = appInfoJsonObject.getString("package_name");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
            return new androidx.view.provider.utils.PrivilegedApp(string2, linkedHashSet);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PrivilegedApp(java.lang.String str, java.util.Set<java.lang.String> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.packageName = str;
        this.fingerprints = set;
    }

    public final java.util.Set<java.lang.String> getFingerprints() {
        return this.fingerprints;
    }

    public final java.lang.String getPackageName() {
        return this.packageName;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PrivilegedApp(packageName=");
        sb.append(this.packageName);
        sb.append(", fingerprints=");
        sb.append(this.fingerprints);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (this.packageName.hashCode() * 31) + this.fingerprints.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.view.provider.utils.PrivilegedApp)) {
            return false;
        }
        androidx.view.provider.utils.PrivilegedApp privilegedApp = (androidx.view.provider.utils.PrivilegedApp) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.packageName, privilegedApp.packageName) && kotlin.jvm.internal.Intrinsics.areEqual(this.fingerprints, privilegedApp.fingerprints);
    }

    public final androidx.view.provider.utils.PrivilegedApp copy(java.lang.String packageName, java.util.Set<java.lang.String> fingerprints) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fingerprints, "");
        return new androidx.view.provider.utils.PrivilegedApp(packageName, fingerprints);
    }

    public final java.util.Set<java.lang.String> component2() {
        return this.fingerprints;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPackageName() {
        return this.packageName;
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.provider.utils.PrivilegedApp createFromJSONObject(org.json.JSONObject jSONObject, boolean z) {
        return INSTANCE.createFromJSONObject(jSONObject, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.view.provider.utils.PrivilegedApp copy$default(androidx.view.provider.utils.PrivilegedApp privilegedApp, java.lang.String str, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = privilegedApp.packageName;
        }
        if ((i & 2) != 0) {
            set = privilegedApp.fingerprints;
        }
        return privilegedApp.copy(str, set);
    }
}
