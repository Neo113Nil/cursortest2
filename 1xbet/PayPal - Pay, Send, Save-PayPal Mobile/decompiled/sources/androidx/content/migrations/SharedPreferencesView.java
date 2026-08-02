package androidx.content.migrations;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\n\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u00052\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010$R\u001c\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'"}, d2 = {"Landroidx/datastore/migrations/SharedPreferencesView;", "", "Landroid/content/SharedPreferences;", "prefs", "", "", "keySet", "<init>", "(Landroid/content/SharedPreferences;Ljava/util/Set;)V", "key", "", "contains", "(Ljava/lang/String;)Z", "defValue", "getBoolean", "(Ljava/lang/String;Z)Z", "", "getFloat", "(Ljava/lang/String;F)F", "", "getInt", "(Ljava/lang/String;I)I", "", "getLong", "(Ljava/lang/String;J)J", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "defValues", "getStringSet", "(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;", "", "getAll", "()Ljava/util/Map;", "p0", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/SharedPreferences;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Set;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SharedPreferencesView {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Set<java.lang.String> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.SharedPreferences getHighSpeedVideoFpsRangesFor;

    public SharedPreferencesView(android.content.SharedPreferences sharedPreferences, java.util.Set<java.lang.String> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferences, "");
        this.getHighSpeedVideoFpsRangesFor = sharedPreferences;
        this.getHighSpeedVideoSizes = set;
    }

    public final boolean contains(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.getHighSpeedVideoFpsRangesFor.contains(getHighSpeedVideoFpsRanges(key));
    }

    public final boolean getBoolean(java.lang.String key, boolean defValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.getHighSpeedVideoFpsRangesFor.getBoolean(getHighSpeedVideoFpsRanges(key), defValue);
    }

    public final float getFloat(java.lang.String key, float defValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.getHighSpeedVideoFpsRangesFor.getFloat(getHighSpeedVideoFpsRanges(key), defValue);
    }

    public final int getInt(java.lang.String key, int defValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.getHighSpeedVideoFpsRangesFor.getInt(getHighSpeedVideoFpsRanges(key), defValue);
    }

    public final long getLong(java.lang.String key, long defValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.getHighSpeedVideoFpsRangesFor.getLong(getHighSpeedVideoFpsRanges(key), defValue);
    }

    public static /* synthetic */ java.lang.String getString$default(androidx.content.migrations.SharedPreferencesView sharedPreferencesView, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return sharedPreferencesView.getString(str, str2);
    }

    public final java.lang.String getString(java.lang.String key, java.lang.String defValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.getHighSpeedVideoFpsRangesFor.getString(getHighSpeedVideoFpsRanges(key), defValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.util.Set getStringSet$default(androidx.content.migrations.SharedPreferencesView sharedPreferencesView, java.lang.String str, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            set = null;
        }
        return sharedPreferencesView.getStringSet(str, set);
    }

    public final java.util.Set<java.lang.String> getStringSet(java.lang.String key, java.util.Set<java.lang.String> defValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.util.Set<java.lang.String> stringSet = this.getHighSpeedVideoFpsRangesFor.getStringSet(getHighSpeedVideoFpsRanges(key), defValues);
        if (stringSet != null) {
            return kotlin.collections.CollectionsKt.toMutableSet(stringSet);
        }
        return null;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getAll() {
        java.util.Map<java.lang.String, ?> all = this.getHighSpeedVideoFpsRangesFor.getAll();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(all, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, ?> entry : all.entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.Set<java.lang.String> set = this.getHighSpeedVideoSizes;
            if (set == null || set.contains(key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(linkedHashMap.size()));
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            java.lang.Object key2 = entry2.getKey();
            java.lang.Object value = entry2.getValue();
            if (value instanceof java.util.Set) {
                value = kotlin.collections.CollectionsKt.toSet((java.lang.Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    private final java.lang.String getHighSpeedVideoFpsRanges(java.lang.String p0) {
        java.util.Set<java.lang.String> set = this.getHighSpeedVideoSizes;
        if (set == null || set.contains(p0)) {
            return p0;
        }
        throw new java.lang.IllegalStateException("Can't access key outside migration: ".concat(java.lang.String.valueOf(p0)).toString());
    }
}
