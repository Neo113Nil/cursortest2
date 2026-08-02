package androidx.view;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 '2\u00020\u0001:\u0001'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\u0010\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u001cJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010 J7\u0010\"\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010$R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Landroidx/navigation/NavInflater;", "", "Landroid/content/Context;", "context", "Landroidx/navigation/NavigatorProvider;", "navigatorProvider", "<init>", "(Landroid/content/Context;Landroidx/navigation/NavigatorProvider;)V", "", "graphResId", "Landroidx/navigation/NavGraph;", "inflate", "(I)Landroidx/navigation/NavGraph;", "Landroid/content/res/Resources;", "p0", "Landroid/content/res/XmlResourceParser;", "p1", "Landroid/util/AttributeSet;", "p2", "p3", "Landroidx/navigation/NavDestination;", "getHighSpeedVideoFpsRanges", "(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;I)Landroidx/navigation/NavDestination;", "", "Camera2StreamConfigurationMap", "(Landroid/content/res/Resources;Landroidx/navigation/NavDestination;Landroid/util/AttributeSet;I)V", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "(Landroid/content/res/Resources;Landroid/os/Bundle;Landroid/util/AttributeSet;I)V", "Landroid/content/res/TypedArray;", "Landroidx/navigation/NavArgument;", "getHighSpeedVideoSizes", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources;I)Landroidx/navigation/NavArgument;", "p4", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/content/res/Resources;Landroidx/navigation/NavDestination;Landroid/util/AttributeSet;Landroid/content/res/XmlResourceParser;I)V", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor", "Landroidx/navigation/NavigatorProvider;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavInflater {
    public static final java.lang.String APPLICATION_ID_PLACEHOLDER = "${applicationId}";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.view.NavigatorProvider getHighSpeedVideoFpsRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.NavInflater.Companion INSTANCE = new androidx.view.NavInflater.Companion(null);
    private static final java.lang.ThreadLocal<android.util.TypedValue> Camera2StreamConfigurationMap = new java.lang.ThreadLocal<>();

    public NavInflater(android.content.Context context, androidx.view.NavigatorProvider navigatorProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigatorProvider, "");
        this.getHighSpeedVideoSizes = context;
        this.getHighSpeedVideoFpsRanges = navigatorProvider;
    }

    public final androidx.view.NavGraph inflate(int graphResId) {
        int next;
        android.content.res.Resources resources = this.getHighSpeedVideoSizes.getResources();
        android.content.res.XmlResourceParser xml = resources.getXml(graphResId);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(xml, "");
        android.util.AttributeSet asAttributeSet = android.util.Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (java.lang.Exception e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("Exception inflating ");
                    sb.append(resources.getResourceName(graphResId));
                    sb.append(" line ");
                    sb.append(xml.getLineNumber());
                    throw new java.lang.RuntimeException(sb.toString(), e);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
        }
        java.lang.String name2 = xml.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNull(resources);
        kotlin.jvm.internal.Intrinsics.checkNotNull(asAttributeSet);
        androidx.view.NavDestination highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(resources, xml, asAttributeSet, graphResId);
        if (!(highSpeedVideoFpsRanges instanceof androidx.view.NavGraph)) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append("Root element <");
            sb2.append(name2);
            sb2.append("> did not inflate into a NavGraph");
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }
        return (androidx.view.NavGraph) highSpeedVideoFpsRanges;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x010a, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final androidx.view.NavDestination getHighSpeedVideoFpsRanges(android.content.res.Resources p0, android.content.res.XmlResourceParser p1, android.util.AttributeSet p2, int p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int depth;
        java.lang.String str;
        java.lang.String str2;
        androidx.view.NavigatorProvider navigatorProvider = this.getHighSpeedVideoFpsRanges;
        java.lang.String name2 = p1.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        androidx.view.NavDestination createDestination = navigatorProvider.getNavigator(name2).createDestination();
        createDestination.onInflate(this.getHighSpeedVideoSizes, p2);
        int depth2 = p1.getDepth() + 1;
        while (true) {
            int next = p1.next();
            if (next == 1 || ((depth = p1.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                java.lang.String name3 = p1.getName();
                if (kotlin.jvm.internal.Intrinsics.areEqual("argument", name3)) {
                    Camera2StreamConfigurationMap(p0, createDestination, p2, p3);
                } else if (!kotlin.jvm.internal.Intrinsics.areEqual("deepLink", name3)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual("action", name3)) {
                        getHighResolutionOutputSizeshNQ4ISI(p0, createDestination, p2, p1, p3);
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual("include", name3) && (createDestination instanceof androidx.view.NavGraph)) {
                        android.content.res.TypedArray obtainAttributes = p0.obtainAttributes(p2, androidx.view.C0281R.styleable.NavInclude);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainAttributes, "");
                        ((androidx.view.NavGraph) createDestination).addDestination(inflate(obtainAttributes.getResourceId(androidx.view.C0281R.styleable.NavInclude_graph, 0)));
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        obtainAttributes.recycle();
                    } else if (createDestination instanceof androidx.view.NavGraph) {
                        ((androidx.view.NavGraph) createDestination).addDestination(getHighSpeedVideoFpsRanges(p0, p1, p2, p3));
                    }
                } else {
                    android.content.res.TypedArray obtainAttributes2 = p0.obtainAttributes(p2, androidx.view.common.R.styleable.NavDeepLink);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainAttributes2, "");
                    java.lang.String string = obtainAttributes2.getString(androidx.view.common.R.styleable.NavDeepLink_uri);
                    java.lang.String string2 = obtainAttributes2.getString(androidx.view.common.R.styleable.NavDeepLink_action);
                    java.lang.String string3 = obtainAttributes2.getString(androidx.view.common.R.styleable.NavDeepLink_mimeType);
                    java.lang.String str3 = string;
                    if ((str3 == null || str3.length() == 0) && (((str = string2) == null || str.length() == 0) && ((str2 = string3) == null || str2.length() == 0))) {
                        break;
                    }
                    androidx.navigation.NavDeepLink.Builder builder = new androidx.navigation.NavDeepLink.Builder();
                    if (string != null) {
                        java.lang.String packageName = this.getHighSpeedVideoSizes.getPackageName();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "");
                        builder.setUriPattern(kotlin.text.StringsKt.replace$default(string, APPLICATION_ID_PLACEHOLDER, packageName, false, 4, (java.lang.Object) null));
                    }
                    java.lang.String str4 = string2;
                    if (str4 != null && str4.length() != 0) {
                        java.lang.String packageName2 = this.getHighSpeedVideoSizes.getPackageName();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName2, "");
                        builder.setAction(kotlin.text.StringsKt.replace$default(string2, APPLICATION_ID_PLACEHOLDER, packageName2, false, 4, (java.lang.Object) null));
                    }
                    if (string3 != null) {
                        java.lang.String packageName3 = this.getHighSpeedVideoSizes.getPackageName();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName3, "");
                        builder.setMimeType(kotlin.text.StringsKt.replace$default(string3, APPLICATION_ID_PLACEHOLDER, packageName3, false, 4, (java.lang.Object) null));
                    }
                    createDestination.addDeepLink(builder.build());
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    obtainAttributes2.recycle();
                }
            }
        }
        return createDestination;
    }

    private static void Camera2StreamConfigurationMap(android.content.res.Resources p0, androidx.view.NavDestination p1, android.util.AttributeSet p2, int p3) throws org.xmlpull.v1.XmlPullParserException {
        android.content.res.TypedArray obtainAttributes = p0.obtainAttributes(p2, androidx.view.common.R.styleable.NavArgument);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainAttributes, "");
        java.lang.String string = obtainAttributes.getString(androidx.view.common.R.styleable.NavArgument_android_name);
        if (string == null) {
            throw new org.xmlpull.v1.XmlPullParserException("Arguments must have a name");
        }
        p1.addArgument(string, getHighSpeedVideoSizes(obtainAttributes, p0, p3));
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        obtainAttributes.recycle();
    }

    private static void Camera2StreamConfigurationMap(android.content.res.Resources p0, android.os.Bundle p1, android.util.AttributeSet p2, int p3) throws org.xmlpull.v1.XmlPullParserException {
        android.content.res.TypedArray obtainAttributes = p0.obtainAttributes(p2, androidx.view.common.R.styleable.NavArgument);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainAttributes, "");
        java.lang.String string = obtainAttributes.getString(androidx.view.common.R.styleable.NavArgument_android_name);
        if (string == null) {
            throw new org.xmlpull.v1.XmlPullParserException("Arguments must have a name");
        }
        androidx.view.NavArgument highSpeedVideoSizes = getHighSpeedVideoSizes(obtainAttributes, p0, p3);
        if (highSpeedVideoSizes.getIsDefaultValuePresent()) {
            highSpeedVideoSizes.putDefaultValue(string, p1);
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        obtainAttributes.recycle();
    }

    private static androidx.view.NavArgument getHighSpeedVideoSizes(android.content.res.TypedArray p0, android.content.res.Resources p1, int p2) throws org.xmlpull.v1.XmlPullParserException {
        int i;
        androidx.navigation.NavArgument.Builder builder = new androidx.navigation.NavArgument.Builder();
        builder.setIsNullable(p0.getBoolean(androidx.view.common.R.styleable.NavArgument_nullable, false));
        java.lang.ThreadLocal<android.util.TypedValue> threadLocal = Camera2StreamConfigurationMap;
        android.util.TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new android.util.TypedValue();
            threadLocal.set(typedValue);
        }
        java.lang.String string = p0.getString(androidx.view.common.R.styleable.NavArgument_argType);
        java.lang.Object obj = null;
        androidx.view.NavType<?> fromArgType = string != null ? androidx.view.NavType.INSTANCE.fromArgType(string, p1.getResourcePackageName(p2)) : null;
        if (p0.getValue(androidx.view.common.R.styleable.NavArgument_android_defaultValue, typedValue)) {
            if (fromArgType == androidx.view.NavType.ReferenceType) {
                if (typedValue.resourceId != 0) {
                    i = java.lang.Integer.valueOf(typedValue.resourceId);
                } else if (typedValue.type == 16 && typedValue.data == 0) {
                    i = 0;
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("unsupported value '");
                    sb.append((java.lang.Object) typedValue.string);
                    sb.append("' for ");
                    sb.append(fromArgType.getName());
                    sb.append(". Must be a reference to a resource.");
                    throw new org.xmlpull.v1.XmlPullParserException(sb.toString());
                }
                obj = i;
            } else if (typedValue.resourceId != 0) {
                if (fromArgType == null) {
                    fromArgType = androidx.view.NavType.ReferenceType;
                    obj = java.lang.Integer.valueOf(typedValue.resourceId);
                } else {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unsupported value '");
                    sb2.append((java.lang.Object) typedValue.string);
                    sb2.append("' for ");
                    sb2.append(fromArgType.getName());
                    sb2.append(". You must use a \"");
                    sb2.append(androidx.view.NavType.ReferenceType.getName());
                    sb2.append("\" type to reference other resources.");
                    throw new org.xmlpull.v1.XmlPullParserException(sb2.toString());
                }
            } else if (fromArgType == androidx.view.NavType.StringType) {
                obj = p0.getString(androidx.view.common.R.styleable.NavArgument_android_defaultValue);
            } else {
                int i2 = typedValue.type;
                if (i2 == 3) {
                    java.lang.String obj2 = typedValue.string.toString();
                    if (fromArgType == null) {
                        fromArgType = androidx.view.NavType.INSTANCE.inferFromValue(obj2);
                    }
                    obj = fromArgType.parseValue(obj2);
                } else if (i2 == 4) {
                    fromArgType = INSTANCE.checkNavType$navigation_runtime_release(typedValue, fromArgType, androidx.view.NavType.FloatType, string, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT);
                    obj = java.lang.Float.valueOf(typedValue.getFloat());
                } else if (i2 == 5) {
                    fromArgType = INSTANCE.checkNavType$navigation_runtime_release(typedValue, fromArgType, androidx.view.NavType.IntType, string, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_DIMENSION);
                    obj = java.lang.Integer.valueOf((int) typedValue.getDimension(p1.getDisplayMetrics()));
                } else if (i2 == 18) {
                    fromArgType = INSTANCE.checkNavType$navigation_runtime_release(typedValue, fromArgType, androidx.view.NavType.BoolType, string, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_BOOLEAN);
                    obj = java.lang.Boolean.valueOf(typedValue.data != 0);
                } else if (typedValue.type >= 16 && typedValue.type <= 31) {
                    if (fromArgType == androidx.view.NavType.FloatType) {
                        fromArgType = INSTANCE.checkNavType$navigation_runtime_release(typedValue, fromArgType, androidx.view.NavType.FloatType, string, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT);
                        obj = java.lang.Float.valueOf(typedValue.data);
                    } else {
                        fromArgType = INSTANCE.checkNavType$navigation_runtime_release(typedValue, fromArgType, androidx.view.NavType.IntType, string, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_INT);
                        obj = java.lang.Integer.valueOf(typedValue.data);
                    }
                } else {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("unsupported argument type ");
                    sb3.append(typedValue.type);
                    throw new org.xmlpull.v1.XmlPullParserException(sb3.toString());
                }
            }
        }
        if (obj != null) {
            builder.setDefaultValue(obj);
        }
        if (fromArgType != null) {
            builder.setType(fromArgType);
        }
        return builder.build();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(android.content.res.Resources p0, androidx.view.NavDestination p1, android.util.AttributeSet p2, android.content.res.XmlResourceParser p3, int p4) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        kotlin.Pair[] pairArr;
        int depth;
        android.content.Context context = this.getHighSpeedVideoSizes;
        int[] iArr = androidx.view.common.R.styleable.NavAction;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iArr, "");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(p2, iArr, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(androidx.view.common.R.styleable.NavAction_android_id, 0);
        androidx.view.NavAction navAction = new androidx.view.NavAction(obtainStyledAttributes.getResourceId(androidx.view.common.R.styleable.NavAction_destination, 0), null, null, 6, null);
        androidx.navigation.NavOptions.Builder builder = new androidx.navigation.NavOptions.Builder();
        builder.setLaunchSingleTop(obtainStyledAttributes.getBoolean(androidx.view.common.R.styleable.NavAction_launchSingleTop, false));
        builder.setRestoreState(obtainStyledAttributes.getBoolean(androidx.view.common.R.styleable.NavAction_restoreState, false));
        builder.setPopUpTo(obtainStyledAttributes.getResourceId(androidx.view.common.R.styleable.NavAction_popUpTo, -1), obtainStyledAttributes.getBoolean(androidx.view.common.R.styleable.NavAction_popUpToInclusive, false), obtainStyledAttributes.getBoolean(androidx.view.common.R.styleable.NavAction_popUpToSaveState, false));
        builder.setEnterAnim(obtainStyledAttributes.getResourceId(androidx.view.common.R.styleable.NavAction_enterAnim, -1));
        builder.setExitAnim(obtainStyledAttributes.getResourceId(androidx.view.common.R.styleable.NavAction_exitAnim, -1));
        builder.setPopEnterAnim(obtainStyledAttributes.getResourceId(androidx.view.common.R.styleable.NavAction_popEnterAnim, -1));
        builder.setPopExitAnim(obtainStyledAttributes.getResourceId(androidx.view.common.R.styleable.NavAction_popExitAnim, -1));
        navAction.setNavOptions(builder.build());
        java.util.Map emptyMap = kotlin.collections.MapsKt.emptyMap();
        if (emptyMap.isEmpty()) {
            pairArr = new kotlin.Pair[0];
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(emptyMap.size());
            for (java.util.Map.Entry entry : emptyMap.entrySet()) {
                arrayList.add(kotlin.TuplesKt.to((java.lang.String) entry.getKey(), entry.getValue()));
            }
            pairArr = (kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]);
        }
        android.os.Bundle bundleOf = androidx.core.os.BundleKt.bundleOf((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
        androidx.view.SavedStateWriter.m9382constructorimpl(bundleOf);
        int depth2 = p3.getDepth() + 1;
        while (true) {
            int next = p3.next();
            if (next == 1 || ((depth = p3.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && kotlin.jvm.internal.Intrinsics.areEqual("argument", p3.getName())) {
                Camera2StreamConfigurationMap(p0, bundleOf, p2, p4);
            }
        }
        if (!androidx.view.SavedStateReader.m9374isEmptyimpl(androidx.view.SavedStateReader.m9296constructorimpl(bundleOf))) {
            navAction.setDefaultArguments(bundleOf);
        }
        p1.putAction(resourceId, navAction);
        obtainStyledAttributes.recycle();
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/navigation/NavInflater$Companion;", "", "<init>", "()V", "Landroid/util/TypedValue;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/navigation/NavType;", "navType", "expectedNavType", "", "argType", "foundType", "checkNavType$navigation_runtime_release", "(Landroid/util/TypedValue;Landroidx/navigation/NavType;Landroidx/navigation/NavType;Ljava/lang/String;Ljava/lang/String;)Landroidx/navigation/NavType;", "APPLICATION_ID_PLACEHOLDER", "Ljava/lang/String;", "Ljava/lang/ThreadLocal;", "Camera2StreamConfigurationMap", "Ljava/lang/ThreadLocal;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.view.NavType<?> checkNavType$navigation_runtime_release(android.util.TypedValue value, androidx.view.NavType<?> navType, androidx.view.NavType<?> expectedNavType, java.lang.String argType, java.lang.String foundType) throws org.xmlpull.v1.XmlPullParserException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expectedNavType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(foundType, "");
            if (navType == null || navType == expectedNavType) {
                return navType == null ? expectedNavType : navType;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Type is ");
            sb.append(argType);
            sb.append(" but found ");
            sb.append(foundType);
            sb.append(": ");
            sb.append(value.data);
            throw new org.xmlpull.v1.XmlPullParserException(sb.toString());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
