package androidx.view.serialization;

@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aE\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0010\u001a\u00020\u0006\"\b\b\u0000\u0010\u0000*\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00040\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a5\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0004*\u00020\u00122\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0017\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a/\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u0012H\u0000¢\u0006\u0004\b\u001f\u0010 "}, d2 = {"T", "Lkotlinx/serialization/KSerializer;", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "typeMap", "", "path", "generateRoutePattern", "(Lkotlinx/serialization/KSerializer;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "", "Landroidx/navigation/NamedNavArgument;", "generateNavArguments", "(Lkotlinx/serialization/KSerializer;Ljava/util/Map;)Ljava/util/List;", "", "route", "generateRouteWithArgs", "(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/String;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Ljava/util/Map;)Landroidx/navigation/NavType;", "", "generateHashCode", "(Lkotlinx/serialization/KSerializer;)I", "p1", "p2", "p3", "Camera2StreamConfigurationMap", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "isValueClass", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RouteSerializerKt {
    public static /* synthetic */ java.lang.String generateRoutePattern$default(kotlinx.serialization.KSerializer kSerializer, java.util.Map map, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return generateRoutePattern(kSerializer, map, str);
    }

    public static final <T> java.lang.String generateRoutePattern(final kotlinx.serialization.KSerializer<T> kSerializer, java.util.Map<kotlin.reflect.KType, ? extends androidx.view.NavType<?>> map, java.lang.String str) {
        final androidx.view.serialization.RouteBuilder routeBuilder;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: androidx.navigation.serialization.RouteSerializerKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.view.serialization.RouteSerializerKt.m9219$r8$lambda$sLRmpORhc3grW6V33iLpV257d8(kotlinx.serialization.KSerializer.this);
            }
        };
        if (kSerializer instanceof kotlinx.serialization.PolymorphicSerializer) {
            function0.invoke();
        }
        if (str != null) {
            routeBuilder = new androidx.view.serialization.RouteBuilder(str, kSerializer);
        } else {
            routeBuilder = new androidx.view.serialization.RouteBuilder(kSerializer);
        }
        kotlin.jvm.functions.Function3 function3 = new kotlin.jvm.functions.Function3() { // from class: androidx.navigation.serialization.RouteSerializerKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return androidx.view.serialization.RouteSerializerKt.$r8$lambda$f6vagwdHVmC2gUipzBmOa5lQUxU(androidx.view.serialization.RouteBuilder.this, ((java.lang.Integer) obj).intValue(), (java.lang.String) obj2, (androidx.view.NavType) obj3);
            }
        };
        int elementsCount = kSerializer.getDescriptor().getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            java.lang.String elementName = kSerializer.getDescriptor().getElementName(i);
            androidx.view.NavType<java.lang.Object> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(kSerializer.getDescriptor().getElementDescriptor(i), map);
            if (highResolutionOutputSizeshNQ4ISI == null) {
                throw new java.lang.IllegalArgumentException(Camera2StreamConfigurationMap(elementName, kSerializer.getDescriptor().getElementDescriptor(i).getGetHighSpeedVideoSizes(), kSerializer.getDescriptor().getGetHighSpeedVideoSizes(), map.toString()));
            }
            function3.invoke(java.lang.Integer.valueOf(i), elementName, highResolutionOutputSizeshNQ4ISI);
        }
        return routeBuilder.build();
    }

    public static /* synthetic */ java.util.List generateNavArguments$default(kotlinx.serialization.KSerializer kSerializer, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        return generateNavArguments(kSerializer, map);
    }

    public static final <T> java.util.List<androidx.view.NamedNavArgument> generateNavArguments(final kotlinx.serialization.KSerializer<T> kSerializer, final java.util.Map<kotlin.reflect.KType, ? extends androidx.view.NavType<?>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: androidx.navigation.serialization.RouteSerializerKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.view.serialization.RouteSerializerKt.$r8$lambda$ZNmgo4hWCIVwniXyRrJWfijZB2k(kotlinx.serialization.KSerializer.this);
            }
        };
        if (kSerializer instanceof kotlinx.serialization.PolymorphicSerializer) {
            function0.invoke();
        }
        int elementsCount = kSerializer.getDescriptor().getElementsCount();
        java.util.ArrayList arrayList = new java.util.ArrayList(elementsCount);
        for (final int i = 0; i < elementsCount; i++) {
            final java.lang.String elementName = kSerializer.getDescriptor().getElementName(i);
            arrayList.add(androidx.view.NamedNavArgumentKt.navArgument(elementName, new kotlin.jvm.functions.Function1() { // from class: androidx.navigation.serialization.RouteSerializerKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.view.serialization.RouteSerializerKt.$r8$lambda$_1JjzJy68bgsLR47QDUyI29mwPw(kotlinx.serialization.KSerializer.this, i, map, elementName, (androidx.view.NavArgumentBuilder) obj);
                }
            }));
        }
        return arrayList;
    }

    public static final <T> java.lang.String generateRouteWithArgs(T t, java.util.Map<java.lang.String, ? extends androidx.view.NavType<java.lang.Object>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlinx.serialization.KSerializer serializer = kotlinx.serialization.SerializersKt.serializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(t.getClass()));
        final java.util.Map<java.lang.String, java.util.List<java.lang.String>> encodeToArgMap = new androidx.view.serialization.RouteEncoder(serializer, map).encodeToArgMap(t);
        final androidx.view.serialization.RouteBuilder routeBuilder = new androidx.view.serialization.RouteBuilder(serializer);
        kotlin.jvm.functions.Function3 function3 = new kotlin.jvm.functions.Function3() { // from class: androidx.navigation.serialization.RouteSerializerKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return androidx.view.serialization.RouteSerializerKt.$r8$lambda$YC8lSbf0V22BFORPNRGe4klYXOQ(encodeToArgMap, routeBuilder, ((java.lang.Integer) obj).intValue(), (java.lang.String) obj2, (androidx.view.NavType) obj3);
            }
        };
        int elementsCount = serializer.getDescriptor().getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            java.lang.String elementName = serializer.getDescriptor().getElementName(i);
            androidx.view.NavType<java.lang.Object> navType = map.get(elementName);
            if (navType == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot locate NavType for argument [");
                sb.append(elementName);
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            function3.invoke(java.lang.Integer.valueOf(i), elementName, navType);
        }
        return routeBuilder.build();
    }

    private static final androidx.view.NavType<java.lang.Object> getHighResolutionOutputSizeshNQ4ISI(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, java.util.Map<kotlin.reflect.KType, ? extends androidx.view.NavType<?>> map) {
        java.lang.Object obj;
        java.util.Iterator<T> it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (androidx.view.serialization.NavTypeConverterKt.matchKType(serialDescriptor, (kotlin.reflect.KType) obj)) {
                break;
            }
        }
        kotlin.reflect.KType kType = (kotlin.reflect.KType) obj;
        androidx.view.NavType<?> navType = kType != null ? map.get(kType) : null;
        if (!(navType instanceof androidx.view.NavType)) {
            navType = null;
        }
        if (navType == null) {
            navType = androidx.view.serialization.NavTypeConverterKt.getNavType(serialDescriptor);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(navType, androidx.view.serialization.UNKNOWN.INSTANCE)) {
            return null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(navType, "");
        return navType;
    }

    public static final <T> int generateHashCode(kotlinx.serialization.KSerializer<T> kSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        int hashCode = kSerializer.getDescriptor().getGetHighSpeedVideoSizes().hashCode();
        int elementsCount = kSerializer.getDescriptor().getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            hashCode = (hashCode * 31) + kSerializer.getDescriptor().getElementName(i).hashCode();
        }
        return hashCode;
    }

    private static final java.lang.String Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Route ");
        sb.append(str3);
        sb.append(" could not find any NavType for argument ");
        sb.append(str);
        sb.append(" of type ");
        sb.append(str2);
        sb.append(" - typeMap received was ");
        sb.append(str4);
        return sb.toString();
    }

    public static final boolean isValueClass(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(serialDescriptor.getKind(), kotlinx.serialization.descriptors.StructureKind.CLASS.INSTANCE) && serialDescriptor.getIsInline() && serialDescriptor.getElementsCount() == 1;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YC8lSbf0V22BFORPNRGe4klYXOQ(java.util.Map map, androidx.view.serialization.RouteBuilder routeBuilder, int i, java.lang.String str, androidx.view.NavType navType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navType, "");
        java.lang.Object obj = map.get(str);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
        routeBuilder.appendArg(i, str, navType, (java.util.List) obj);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZNmgo4hWCIVwniXyRrJWfijZB2k(kotlinx.serialization.KSerializer kSerializer) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot generate NavArguments for polymorphic serializer ");
        sb.append(kSerializer);
        sb.append(". Arguments can only be generated from concrete classes or objects.");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_1JjzJy68bgsLR47QDUyI29mwPw(kotlinx.serialization.KSerializer kSerializer, int i, java.util.Map map, java.lang.String str, androidx.view.NavArgumentBuilder navArgumentBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navArgumentBuilder, "");
        kotlinx.serialization.descriptors.SerialDescriptor elementDescriptor = kSerializer.getDescriptor().getElementDescriptor(i);
        boolean isNullable = elementDescriptor.isNullable();
        androidx.view.NavType<?> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(elementDescriptor, map);
        if (highResolutionOutputSizeshNQ4ISI == null) {
            throw new java.lang.IllegalArgumentException(Camera2StreamConfigurationMap(str, elementDescriptor.getGetHighSpeedVideoSizes(), kSerializer.getDescriptor().getGetHighSpeedVideoSizes(), map.toString()));
        }
        navArgumentBuilder.setType(highResolutionOutputSizeshNQ4ISI);
        navArgumentBuilder.setNullable(isNullable);
        if (kSerializer.getDescriptor().isElementOptional(i)) {
            navArgumentBuilder.setUnknownDefaultValuePresent$navigation_common_release(true);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$f6vagwdHVmC2gUipzBmOa5lQUxU(androidx.view.serialization.RouteBuilder routeBuilder, int i, java.lang.String str, androidx.view.NavType navType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navType, "");
        routeBuilder.appendPattern(i, str, navType);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$sLRmpORhc3grW6V3-3iLpV257d8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9219$r8$lambda$sLRmpORhc3grW6V33iLpV257d8(kotlinx.serialization.KSerializer kSerializer) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot generate route pattern from polymorphic class ");
        kotlin.reflect.KClass<?> capturedKClass = kotlinx.serialization.descriptors.ContextAwareKt.getCapturedKClass(kSerializer.getDescriptor());
        sb.append(capturedKClass != null ? capturedKClass.getSimpleName() : null);
        sb.append(". Routes can only be generated from concrete classes or objects.");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
