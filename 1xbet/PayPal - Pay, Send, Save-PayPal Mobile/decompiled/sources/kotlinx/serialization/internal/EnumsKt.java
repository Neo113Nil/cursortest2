package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0002\b\u0007\u001a;\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aa\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00040\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001aq\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00040\u00042\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"", "T", "", "serialName", "", "values", "Lkotlinx/serialization/KSerializer;", "createSimpleEnumSerializer", "(Ljava/lang/String;[Ljava/lang/Enum;)Lkotlinx/serialization/KSerializer;", "names", "", "annotations", "createMarkedEnumSerializer", "(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)Lkotlinx/serialization/KSerializer;", "entryAnnotations", "classAnnotations", "createAnnotatedEnumSerializer", "(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lkotlinx/serialization/KSerializer;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EnumsKt {
    public static final <T extends java.lang.Enum<T>> kotlinx.serialization.KSerializer<T> createSimpleEnumSerializer(java.lang.String str, T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return new kotlinx.serialization.internal.EnumSerializer(str, tArr);
    }

    public static final <T extends java.lang.Enum<T>> kotlinx.serialization.KSerializer<T> createMarkedEnumSerializer(java.lang.String str, T[] tArr, java.lang.String[] strArr, java.lang.annotation.Annotation[][] annotationArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationArr, "");
        kotlinx.serialization.internal.EnumDescriptor enumDescriptor = new kotlinx.serialization.internal.EnumDescriptor(str, tArr.length);
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            T t = tArr[i];
            java.lang.String str2 = (java.lang.String) kotlin.collections.ArraysKt.getOrNull(strArr, i2);
            if (str2 == null) {
                str2 = t.name();
            }
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor.addElement$default(enumDescriptor, str2, false, 2, null);
            java.lang.annotation.Annotation[] annotationArr2 = (java.lang.annotation.Annotation[]) kotlin.collections.ArraysKt.getOrNull(annotationArr, i2);
            if (annotationArr2 != null) {
                for (java.lang.annotation.Annotation annotation : annotationArr2) {
                    enumDescriptor.pushAnnotation(annotation);
                }
            }
            i++;
            i2++;
        }
        return new kotlinx.serialization.internal.EnumSerializer(str, tArr, enumDescriptor);
    }

    public static final <T extends java.lang.Enum<T>> kotlinx.serialization.KSerializer<T> createAnnotatedEnumSerializer(java.lang.String str, T[] tArr, java.lang.String[] strArr, java.lang.annotation.Annotation[][] annotationArr, java.lang.annotation.Annotation[] annotationArr2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationArr, "");
        kotlinx.serialization.internal.EnumDescriptor enumDescriptor = new kotlinx.serialization.internal.EnumDescriptor(str, tArr.length);
        if (annotationArr2 != null) {
            for (java.lang.annotation.Annotation annotation : annotationArr2) {
                enumDescriptor.pushClassAnnotation(annotation);
            }
        }
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            T t = tArr[i];
            java.lang.String str2 = (java.lang.String) kotlin.collections.ArraysKt.getOrNull(strArr, i2);
            if (str2 == null) {
                str2 = t.name();
            }
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor.addElement$default(enumDescriptor, str2, false, 2, null);
            java.lang.annotation.Annotation[] annotationArr3 = (java.lang.annotation.Annotation[]) kotlin.collections.ArraysKt.getOrNull(annotationArr, i2);
            if (annotationArr3 != null) {
                for (java.lang.annotation.Annotation annotation2 : annotationArr3) {
                    enumDescriptor.pushAnnotation(annotation2);
                }
            }
            i++;
            i2++;
        }
        return new kotlinx.serialization.internal.EnumSerializer(str, tArr, enumDescriptor);
    }
}
