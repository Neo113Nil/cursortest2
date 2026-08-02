package com.datadog.android.core.constraints;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J]\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH&¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH&¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0003H&¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/datadog/android/core/constraints/DataConstraints;", "", "T", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "keyPrefix", "attributesGroupName", "", "reservedKeys", "", "validateAttributes", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Ljava/util/Map;", "", "tags", "validateTags", "(Ljava/util/List;)Ljava/util/List;", "", "timings", "validateTimings", "(Ljava/util/Map;)Ljava/util/Map;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DataConstraints {
    <T> java.util.Map<java.lang.String, T> validateAttributes(java.util.Map<java.lang.String, ? extends T> attributes, java.lang.String keyPrefix, java.lang.String attributesGroupName, java.util.Set<java.lang.String> reservedKeys);

    java.util.List<java.lang.String> validateTags(java.util.List<java.lang.String> tags);

    java.util.Map<java.lang.String, java.lang.Long> validateTimings(java.util.Map<java.lang.String, java.lang.Long> timings);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.util.Map validateAttributes$default(com.datadog.android.core.constraints.DataConstraints dataConstraints, java.util.Map map, java.lang.String str, java.lang.String str2, java.util.Set set, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: validateAttributes");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                set = kotlin.collections.SetsKt.emptySet();
            }
            return dataConstraints.validateAttributes(map, str, str2, set);
        }
    }
}
