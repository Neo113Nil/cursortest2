package io.ktor.util.collections;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a*\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a2\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\n\u001a6\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\r\u001a>\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\u000e\u001a\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f*\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"", "Lio/ktor/util/collections/StringMap;", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/String;Lio/ktor/util/collections/StringMap;Lkotlin/reflect/KProperty;)Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "setValue", "(Ljava/lang/String;Lio/ktor/util/collections/StringMap;Lkotlin/reflect/KProperty;Ljava/lang/String;)V", "T", "Lio/ktor/util/collections/SerializedMapValue;", "(Lio/ktor/util/collections/SerializedMapValue;Lio/ktor/util/collections/StringMap;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "(Lio/ktor/util/collections/SerializedMapValue;Lio/ktor/util/collections/StringMap;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "", "asBoolean", "(Ljava/lang/String;)Lio/ktor/util/collections/SerializedMapValue;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MapDelegatesKt {
    public static final java.lang.String getValue(java.lang.String str, io.ktor.util.collections.StringMap stringMap, kotlin.reflect.KProperty<?> kProperty) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "");
        return stringMap.get(str);
    }

    public static final void setValue(java.lang.String str, io.ktor.util.collections.StringMap stringMap, kotlin.reflect.KProperty<?> kProperty, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "");
        if (str2 == null) {
            stringMap.remove(str);
        } else {
            stringMap.set(str, str2);
        }
    }

    public static final <T> T getValue(io.ktor.util.collections.SerializedMapValue<T> serializedMapValue, io.ktor.util.collections.StringMap stringMap, kotlin.reflect.KProperty<?> kProperty) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializedMapValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "");
        java.lang.String str = stringMap.get(serializedMapValue.getKey());
        if (str != null) {
            return serializedMapValue.getDeserialize$ktor_utils().invoke(str);
        }
        return null;
    }

    public static final <T> void setValue(io.ktor.util.collections.SerializedMapValue<T> serializedMapValue, io.ktor.util.collections.StringMap stringMap, kotlin.reflect.KProperty<?> kProperty, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializedMapValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "");
        if (t == null) {
            stringMap.remove(serializedMapValue.getKey());
        } else {
            stringMap.set(serializedMapValue.getKey(), serializedMapValue.getSerialize$ktor_utils().invoke(t));
        }
    }

    public static final io.ktor.util.collections.SerializedMapValue<java.lang.Boolean> asBoolean(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new io.ktor.util.collections.SerializedMapValue<>(str, io.ktor.util.collections.MapDelegatesKt$asBoolean$1.getHighSpeedVideoFpsRanges, io.ktor.util.collections.MapDelegatesKt$asBoolean$2.getHighSpeedVideoFpsRanges);
    }
}
