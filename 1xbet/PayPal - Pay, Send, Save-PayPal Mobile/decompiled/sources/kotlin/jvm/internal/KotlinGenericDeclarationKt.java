package kotlin.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\u000b\u001a\u00020\n*\u00060\u0006j\u0002`\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0002¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lkotlin/reflect/KDeclarationContainer;", "", "signature", "Ljava/lang/reflect/GenericDeclaration;", "findMethodBySignature", "(Lkotlin/reflect/KDeclarationContainer;Ljava/lang/String;)Ljava/lang/reflect/GenericDeclaration;", "Ljava/lang/Appendable;", "Lkotlin/text/getHighSpeedVideoFpsRangesFor;", "Ljava/lang/Class;", "p0", "", "getHighSpeedVideoFpsRanges", "(Ljava/lang/Appendable;Ljava/lang/Class;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class KotlinGenericDeclarationKt {
    public static final java.lang.reflect.GenericDeclaration findMethodBySignature(kotlin.reflect.KDeclarationContainer kDeclarationContainer, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.reflect.Method method = null;
        if (!(kDeclarationContainer instanceof kotlin.jvm.internal.ClassBasedDeclarationContainer)) {
            return null;
        }
        java.lang.String substringBefore$default = kotlin.text.StringsKt.substringBefore$default(str, '(', (java.lang.String) null, 2, (java.lang.Object) null);
        if (kotlin.jvm.internal.Intrinsics.areEqual(substringBefore$default, "<init>")) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Generic Java constructors are not supported: ");
            sb.append(kDeclarationContainer);
            sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
            sb.append(str);
            throw new java.lang.UnsupportedOperationException(sb.toString());
        }
        java.lang.reflect.Method[] declaredMethods = ((kotlin.jvm.internal.ClassBasedDeclarationContainer) kDeclarationContainer).getJClass().getDeclaredMethods();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredMethods, "");
        java.lang.reflect.Method[] methodArr = declaredMethods;
        int length = methodArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            java.lang.reflect.Method method2 = methodArr[i];
            java.lang.reflect.Method method3 = method2;
            if (kotlin.jvm.internal.Intrinsics.areEqual(method3.getName(), substringBefore$default)) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(method3);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(method3.getName());
                sb2.append("(");
                java.lang.Class<?>[] parameterTypes = method3.getParameterTypes();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameterTypes, "");
                for (java.lang.Class<?> cls : parameterTypes) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(cls);
                    getHighSpeedVideoFpsRanges(sb2, cls);
                }
                sb2.append(")");
                java.lang.Class<?> returnType = method3.getReturnType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(returnType, "");
                getHighSpeedVideoFpsRanges(sb2, returnType);
                if (kotlin.jvm.internal.Intrinsics.areEqual(sb2.toString(), str)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        return method;
    }

    private static final void getHighSpeedVideoFpsRanges(java.lang.Appendable appendable, java.lang.Class<?> cls) {
        while (cls.isArray()) {
            appendable.append("[");
            cls = cls.getComponentType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cls, "");
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Void.TYPE)) {
            appendable.append("V");
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Integer.TYPE)) {
            appendable.append(com.visa.cbp.getEncExpo.warmup);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Long.TYPE)) {
            appendable.append("J");
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Short.TYPE)) {
            appendable.append("S");
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Byte.TYPE)) {
            appendable.append("B");
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Boolean.TYPE)) {
            appendable.append("Z");
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Character.TYPE)) {
            appendable.append(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Float.TYPE)) {
            appendable.append(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Double.TYPE)) {
            appendable.append("D");
            return;
        }
        appendable.append("L");
        java.lang.String name2 = cls.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        appendable.append(kotlin.text.StringsKt.replace$default(name2, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, kotlinx.io.files.FileSystemKt.UnixPathSeparator, false, 4, (java.lang.Object) null));
        appendable.append(";");
    }
}
