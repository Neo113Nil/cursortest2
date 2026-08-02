package com.paypal.oslo.core.telemetry.analytics.context;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a/\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\"\"\u0010\n\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t"}, d2 = {"", "T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/reflect/KProperty1;", "", "key", "(Lkotlin/reflect/KProperty1;)Ljava/lang/String;", "attributeKey", "getContextKey", "(Ljava/lang/Object;)Ljava/lang/String;", "contextKey"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ContextKeysKt {
    public static final <T, R> java.lang.String key(kotlin.reflect.KProperty1<T, ? extends R> kProperty1) {
        T t;
        kotlin.reflect.KClass kotlinClass;
        T t2;
        T t3;
        T t4;
        java.lang.String name2;
        T t5;
        java.lang.String key;
        kotlin.reflect.KType type;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty1, "");
        kotlin.reflect.KParameter kParameter = (kotlin.reflect.KParameter) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) kProperty1.getParameters());
        T t6 = null;
        kotlin.reflect.KClassifier classifier = (kParameter == null || (type = kParameter.getType()) == null) ? null : type.getClassifier();
        kotlin.reflect.KClass<?> kClass = classifier instanceof kotlin.reflect.KClass ? (kotlin.reflect.KClass) classifier : null;
        if (kClass == null) {
            throw new java.lang.IllegalStateException("Could not determine declaring class for property ".concat(java.lang.String.valueOf(kProperty1.getGetHighSpeedVideoFpsRanges())).toString());
        }
        java.util.Iterator<T> it = kClass.getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((java.lang.annotation.Annotation) t) instanceof com.paypal.oslo.core.telemetry.analytics.annotations.ContextKey) {
                break;
            }
        }
        if (((com.paypal.oslo.core.telemetry.analytics.annotations.ContextKey) t) != null) {
            java.lang.String str = com.paypal.oslo.core.telemetry.analytics.context.ContextKeyCache.INSTANCE.getMetadata(kClass).getPropertyKeys().get(kProperty1.getGetHighSpeedVideoFpsRanges());
            if (str != null) {
                return str;
            }
            java.lang.String name3 = kProperty1.getGetHighSpeedVideoFpsRanges();
            java.lang.String simpleName = kClass.getSimpleName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Property ");
            sb.append(name3);
            sb.append(" not found in ");
            sb.append(simpleName);
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        java.lang.String name4 = kProperty1.getGetHighSpeedVideoFpsRanges();
        java.lang.Class<?> enclosingClass = kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass).getEnclosingClass();
        if (enclosingClass == null || (kotlinClass = kotlin.jvm.JvmClassMappingKt.getKotlinClass(enclosingClass)) == null) {
            throw new java.lang.IllegalStateException("Could not find enclosing class for ".concat(java.lang.String.valueOf(kClass.getSimpleName())).toString());
        }
        java.util.Iterator<T> it2 = kotlinClass.getAnnotations().iterator();
        while (true) {
            if (!it2.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it2.next();
            if (((java.lang.annotation.Annotation) t2) instanceof com.paypal.oslo.core.telemetry.analytics.annotations.ContextKey) {
                break;
            }
        }
        com.paypal.oslo.core.telemetry.analytics.annotations.ContextKey contextKey = (com.paypal.oslo.core.telemetry.analytics.annotations.ContextKey) t2;
        if (contextKey != null) {
            java.lang.String key2 = contextKey.key();
            java.util.Iterator<T> it3 = kotlin.reflect.full.KClasses.getMemberProperties(kotlinClass).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    t3 = null;
                    break;
                }
                t3 = it3.next();
                kotlin.reflect.KClassifier classifier2 = ((kotlin.reflect.KProperty1) t3).getReturnType().getClassifier();
                kotlin.reflect.KClass kClass2 = classifier2 instanceof kotlin.reflect.KClass ? (kotlin.reflect.KClass) classifier2 : null;
                if (kotlin.jvm.internal.Intrinsics.areEqual(kClass2, kClass)) {
                    break;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(kClass2 != null ? kotlin.jvm.JvmClassMappingKt.getJavaClass(kClass2) : null, kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass))) {
                    break;
                }
            }
            kotlin.reflect.KProperty1 kProperty12 = (kotlin.reflect.KProperty1) t3;
            if (kProperty12 == null) {
                java.lang.String simpleName2 = kClass.getSimpleName();
                java.lang.String simpleName3 = kotlinClass.getSimpleName();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Could not find property of type ");
                sb2.append(simpleName2);
                sb2.append(" in ");
                sb2.append(simpleName3);
                throw new java.lang.IllegalStateException(sb2.toString().toString());
            }
            java.util.Iterator<T> it4 = kProperty12.getAnnotations().iterator();
            while (true) {
                if (!it4.hasNext()) {
                    t4 = null;
                    break;
                }
                t4 = it4.next();
                if (((java.lang.annotation.Annotation) t4) instanceof com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey) {
                    break;
                }
            }
            com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey attributeKey = (com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey) t4;
            if (attributeKey == null || (name2 = attributeKey.key()) == null) {
                name2 = kProperty12.getGetHighSpeedVideoFpsRanges();
            }
            java.util.Iterator<T> it5 = kotlin.reflect.full.KClasses.getMemberProperties(kClass).iterator();
            while (true) {
                if (!it5.hasNext()) {
                    t5 = null;
                    break;
                }
                t5 = it5.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.KProperty1) t5).getGetHighSpeedVideoFpsRanges(), name4)) {
                    break;
                }
            }
            kotlin.reflect.KProperty1 kProperty13 = (kotlin.reflect.KProperty1) t5;
            if (kProperty13 != null) {
                java.util.Iterator<T> it6 = kProperty13.getAnnotations().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    T next = it6.next();
                    if (((java.lang.annotation.Annotation) next) instanceof com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey) {
                        t6 = next;
                        break;
                    }
                }
                com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey attributeKey2 = (com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey) t6;
                if (attributeKey2 != null && (key = attributeKey2.key()) != null) {
                    name4 = key;
                }
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(key2);
            sb3.append(".");
            sb3.append(name2);
            sb3.append(".");
            sb3.append(name4);
            return sb3.toString();
        }
        throw new java.lang.IllegalStateException("Could not find @ContextKey annotated class in hierarchy for ".concat(java.lang.String.valueOf(kClass.getSimpleName())).toString());
    }

    public static final <T, R> java.lang.String attributeKey(kotlin.reflect.KProperty1<T, ? extends R> kProperty1) {
        kotlin.reflect.KType type;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty1, "");
        kotlin.reflect.KParameter kParameter = (kotlin.reflect.KParameter) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) kProperty1.getParameters());
        T t = null;
        kotlin.reflect.KClassifier classifier = (kParameter == null || (type = kParameter.getType()) == null) ? null : type.getClassifier();
        if ((classifier instanceof kotlin.reflect.KClass ? (kotlin.reflect.KClass) classifier : null) == null) {
            throw new java.lang.IllegalStateException("Could not determine declaring class for property ".concat(java.lang.String.valueOf(kProperty1.getGetHighSpeedVideoFpsRanges())).toString());
        }
        java.util.Iterator<T> it = kProperty1.getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((java.lang.annotation.Annotation) next) instanceof com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey) {
                t = next;
                break;
            }
        }
        com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey attributeKey = (com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey) t;
        if (attributeKey != null) {
            return attributeKey.key();
        }
        return kProperty1.getGetHighSpeedVideoFpsRanges();
    }

    public static final <T> java.lang.String getContextKey(T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        return com.paypal.oslo.core.telemetry.analytics.context.ContextKeyCache.INSTANCE.getMetadata(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(t.getClass())).getContextKey();
    }
}
