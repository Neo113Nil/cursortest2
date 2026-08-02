package kotlin.reflect.jvm.internal.impl.renderer;

/* loaded from: classes5.dex */
public final class RenderingUtilsKt {
    public static /* synthetic */ java.lang.String render$default(kotlin.reflect.jvm.internal.impl.name.Name name2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return render(name2, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (java.lang.Character.isJavaIdentifierStart(r0.codePointAt(0)) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String render(kotlin.reflect.jvm.internal.impl.name.Name name2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.lang.String asStringStripSpecialMarkers = z ? name2.asStringStripSpecialMarkers() : name2.asString();
        kotlin.jvm.internal.Intrinsics.checkNotNull(asStringStripSpecialMarkers);
        if (!z || !name2.isSpecial()) {
            if (!kotlin.reflect.jvm.internal.impl.renderer.KeywordStringsGenerated.KEYWORDS.contains(asStringStripSpecialMarkers)) {
                java.lang.String str = asStringStripSpecialMarkers;
                int i = 0;
                while (true) {
                    if (i < str.length()) {
                        char charAt = str.charAt(i);
                        if (!java.lang.Character.isLetterOrDigit(charAt) && charAt != '_') {
                            break;
                        }
                        i++;
                    } else if (str.length() != 0) {
                    }
                }
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("`".concat(java.lang.String.valueOf(asStringStripSpecialMarkers)));
            sb.append('`');
            return sb.toString();
        }
        return asStringStripSpecialMarkers;
    }

    public static final java.lang.String render(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqNameUnsafe, "");
        return renderFqName(fqNameUnsafe.pathSegments());
    }

    public static final java.lang.String renderFqName(java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (kotlin.reflect.jvm.internal.impl.name.Name name2 : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(render$default(name2, false, 1, null));
        }
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String renderFlexibleMutabilityOrArrayElementVarianceType$default(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt$$Lambda$0
                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj2) {
                    return kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt.getHighResolutionOutputSizeshNQ4ISI((java.lang.String) obj2);
                }
            };
        }
        return renderFlexibleMutabilityOrArrayElementVarianceType(str, str2, function0, function02, function1);
    }

    public static final java.lang.String renderFlexibleMutabilityOrArrayElementVarianceType(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0<java.lang.String> function0, kotlin.jvm.functions.Function0<java.lang.String> function02, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.lang.String invoke = function0.invoke();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(invoke);
        sb.append("Mutable");
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(invoke);
        sb2.append("(Mutable)");
        java.lang.String replacePrefixesInTypeRepresentations = replacePrefixesInTypeRepresentations(str, obj, str2, invoke, sb2.toString());
        if (replacePrefixesInTypeRepresentations != null) {
            return replacePrefixesInTypeRepresentations;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(invoke);
        sb3.append("MutableMap.MutableEntry");
        java.lang.String obj2 = sb3.toString();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(invoke);
        sb4.append("Map.Entry");
        java.lang.String obj3 = sb4.toString();
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
        sb5.append(invoke);
        sb5.append("(Mutable)Map.(Mutable)Entry");
        java.lang.String replacePrefixesInTypeRepresentations2 = replacePrefixesInTypeRepresentations(str, obj2, str2, obj3, sb5.toString());
        if (replacePrefixesInTypeRepresentations2 != null) {
            return replacePrefixesInTypeRepresentations2;
        }
        java.lang.String invoke2 = function02.invoke();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(invoke2);
        sb6.append(function1.invoke("Array<"));
        java.lang.String obj4 = sb6.toString();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(invoke2);
        sb7.append(function1.invoke("Array<out "));
        java.lang.String obj5 = sb7.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(invoke2);
        sb8.append(function1.invoke("Array<(out) "));
        java.lang.String replacePrefixesInTypeRepresentations3 = replacePrefixesInTypeRepresentations(str, obj4, str2, obj5, sb8.toString());
        if (replacePrefixesInTypeRepresentations3 != null) {
            return replacePrefixesInTypeRepresentations3;
        }
        return null;
    }

    public static final java.lang.String replacePrefixesInTypeRepresentations(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        if (kotlin.text.StringsKt.startsWith$default(str, str2, false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.startsWith$default(str3, str4, false, 2, (java.lang.Object) null)) {
            java.lang.String substring = str.substring(str2.length());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            java.lang.String substring2 = str3.substring(str4.length());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str5);
            sb.append(substring);
            java.lang.String obj = sb.toString();
            if (kotlin.jvm.internal.Intrinsics.areEqual(substring, substring2)) {
                return obj;
            }
            if (typeStringsDifferOnlyInNullability(substring, substring2)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(obj);
                sb2.append('!');
                return sb2.toString();
            }
        }
        return null;
    }

    public static final boolean typeStringsDifferOnlyInNullability(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, kotlin.text.StringsKt.replace$default(str2, com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION, "", false, 4, (java.lang.Object) null))) {
            return true;
        }
        if (kotlin.text.StringsKt.endsWith$default(str2, com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION, false, 2, (java.lang.Object) null)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append('?');
            if (kotlin.jvm.internal.Intrinsics.areEqual(sb.toString(), str2)) {
                return true;
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("(");
        sb2.append(str);
        sb2.append(")?");
        return kotlin.jvm.internal.Intrinsics.areEqual(sb2.toString(), str2);
    }

    static /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return str;
    }
}
