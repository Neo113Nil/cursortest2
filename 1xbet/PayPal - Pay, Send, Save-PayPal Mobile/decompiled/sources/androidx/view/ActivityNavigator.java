package androidx.view;

@androidx.navigation.Navigator.Name("activity")
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001f \u001eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\f\u001a\u00020\u00022\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038G¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/navigation/ActivityNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/ActivityNavigator$Destination;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "createDestination", "()Landroidx/navigation/ActivityNavigator$Destination;", "", "popBackStack", "()Z", "destination", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "args", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "Landroidx/navigation/NavDestination;", "navigate", "(Landroidx/navigation/ActivityNavigator$Destination;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)Landroidx/navigation/NavDestination;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/app/Activity;", "getHighSpeedVideoFpsRanges", "Landroid/app/Activity;", "getHighSpeedVideoSizes", "Companion", "Destination", "Extras"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class ActivityNavigator extends androidx.view.Navigator<androidx.navigation.ActivityNavigator.Destination> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.ActivityNavigator.Companion INSTANCE = new androidx.view.ActivityNavigator.Companion(null);
    private final android.content.Context context;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.app.Activity getHighSpeedVideoSizes;

    public final android.content.Context getContext() {
        return this.context;
    }

    public ActivityNavigator(android.content.Context context) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.context = context;
        java.util.Iterator it = kotlin.sequences.SequencesKt.generateSequence(context, (kotlin.jvm.functions.Function1<? super android.content.Context, ? extends android.content.Context>) new kotlin.jvm.functions.Function1() { // from class: androidx.navigation.ActivityNavigator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return androidx.view.ActivityNavigator.$r8$lambda$KBSz3gdfovt8pmhkbA4gds_CcSs((android.content.Context) obj2);
            }
        }).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((android.content.Context) obj) instanceof android.app.Activity) {
                    break;
                }
            }
        }
        this.getHighSpeedVideoSizes = (android.app.Activity) obj;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.view.Navigator
    public androidx.navigation.ActivityNavigator.Destination createDestination() {
        return new androidx.navigation.ActivityNavigator.Destination(this);
    }

    @Override // androidx.view.Navigator
    public boolean popBackStack() {
        android.app.Activity activity = this.getHighSpeedVideoSizes;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // androidx.view.Navigator
    public androidx.view.NavDestination navigate(androidx.navigation.ActivityNavigator.Destination destination, android.os.Bundle args, androidx.view.NavOptions navOptions, androidx.navigation.Navigator.Extras navigatorExtras) {
        android.content.Intent intent;
        int intExtra;
        java.lang.String encode;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        if (destination.getIntent() == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Destination ");
            sb.append(destination.getId());
            sb.append(" does not have an Intent set.");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        android.content.Intent intent2 = new android.content.Intent(destination.getIntent());
        if (args != null) {
            intent2.putExtras(args);
            java.lang.String dataPattern = destination.getDataPattern();
            java.lang.String str = dataPattern;
            if (str != null && str.length() != 0) {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    android.os.Bundle m9296constructorimpl = androidx.view.SavedStateReader.m9296constructorimpl(args);
                    java.lang.String group = matcher.group(1);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(group);
                    if (!androidx.view.SavedStateReader.m9297containsimpl(m9296constructorimpl, group)) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Could not find ");
                        sb2.append(group);
                        sb2.append(" in ");
                        sb2.append(args);
                        sb2.append(" to fill data pattern ");
                        sb2.append(dataPattern);
                        throw new java.lang.IllegalArgumentException(sb2.toString().toString());
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    androidx.view.NavArgument navArgument = destination.getArguments().get(group);
                    androidx.view.NavType<java.lang.Object> type = navArgument != null ? navArgument.getType() : null;
                    if (type == null || (encode = type.serializeAsValue(type.get(args, group))) == null) {
                        encode = android.net.Uri.encode(java.lang.String.valueOf(args.get(group)));
                    }
                    stringBuffer.append(encode);
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(android.net.Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z = navigatorExtras instanceof androidx.navigation.ActivityNavigator.Extras;
        if (z) {
            intent2.addFlags(((androidx.navigation.ActivityNavigator.Extras) navigatorExtras).getFlags());
        }
        if (this.getHighSpeedVideoSizes == null) {
            intent2.addFlags(268435456);
        }
        if (navOptions != null && navOptions.getGetHighResolutionOutputSizeshNQ4ISI()) {
            intent2.addFlags(536870912);
        }
        android.app.Activity activity = this.getHighSpeedVideoSizes;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", destination.getId());
        android.content.res.Resources resources = this.context.getResources();
        if (navOptions != null) {
            int popEnterAnim = navOptions.getPopEnterAnim();
            int popExitAnim = navOptions.getPopExitAnim();
            if ((popEnterAnim > 0 && kotlin.jvm.internal.Intrinsics.areEqual(resources.getResourceTypeName(popEnterAnim), "animator")) || (popExitAnim > 0 && kotlin.jvm.internal.Intrinsics.areEqual(resources.getResourceTypeName(popExitAnim), "animator"))) {
                resources.getResourceName(popEnterAnim);
                resources.getResourceName(popExitAnim);
            } else {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", popEnterAnim);
                kotlin.jvm.internal.Intrinsics.checkNotNull(intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", popExitAnim));
            }
        }
        if (z) {
            androidx.core.app.ActivityOptionsCompat activityOptions = ((androidx.navigation.ActivityNavigator.Extras) navigatorExtras).getActivityOptions();
            if (activityOptions != null) {
                androidx.core.app.ActivityCompat.startActivity(this.context, intent2, activityOptions.toBundle());
            } else {
                this.context.startActivity(intent2);
            }
        } else {
            this.context.startActivity(intent2);
        }
        if (navOptions != null && this.getHighSpeedVideoSizes != null) {
            int enterAnim = navOptions.getEnterAnim();
            int exitAnim = navOptions.getExitAnim();
            if ((enterAnim > 0 && kotlin.jvm.internal.Intrinsics.areEqual(resources.getResourceTypeName(enterAnim), "animator")) || (exitAnim > 0 && kotlin.jvm.internal.Intrinsics.areEqual(resources.getResourceTypeName(exitAnim), "animator"))) {
                resources.getResourceName(enterAnim);
                resources.getResourceName(exitAnim);
            } else if (enterAnim >= 0 || exitAnim >= 0) {
                this.getHighSpeedVideoSizes.overridePendingTransition(kotlin.ranges.RangesKt.coerceAtLeast(enterAnim, 0), kotlin.ranges.RangesKt.coerceAtLeast(exitAnim, 0));
            }
        }
        return null;
    }

    @kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0019\u0010\u0010J\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001f\u0010\u0010J\u0017\u0010\"\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\rH\u0016¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020$2\b\u0010*\u001a\u0004\u0018\u00010)H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u00100\u001a\u0004\u0018\u00010\t8\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u00103R(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u00100\u001a\u0004\u0018\u00010\r8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u0010(R(\u00106\u001a\u0004\u0018\u00010\r2\b\u00100\u001a\u0004\u0018\u00010\r8G@BX\u0087\u000e¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b7\u0010(R(\u00108\u001a\u0004\u0018\u00010\u001a2\b\u00100\u001a\u0004\u0018\u00010\u001a8G@BX\u0087\u000e¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R(\u0010\u001e\u001a\u0004\u0018\u00010\r2\b\u00100\u001a\u0004\u0018\u00010\r8G@BX\u0087\u000e¢\u0006\f\n\u0004\b\u001e\u00104\u001a\u0004\b<\u0010(R(\u0010!\u001a\u0004\u0018\u00010 2\b\u00100\u001a\u0004\u0018\u00010 8G@BX\u0087\u000e¢\u0006\f\n\u0004\b!\u0010=\u001a\u0004\b>\u0010?"}, d2 = {"Landroidx/navigation/ActivityNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/Navigator;", "activityNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "Landroidx/navigation/NavigatorProvider;", "navigatorProvider", "(Landroidx/navigation/NavigatorProvider;)V", "Landroid/content/Intent;", "intent", "setIntent", "(Landroid/content/Intent;)Landroidx/navigation/ActivityNavigator$Destination;", "", "dataPattern", "setDataPattern", "(Ljava/lang/String;)Landroidx/navigation/ActivityNavigator$Destination;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", com.visa.cbp.ConsumerInfo.setSignature, "setTargetPackage", "Landroid/content/ComponentName;", "name", "setComponentName", "(Landroid/content/ComponentName;)Landroidx/navigation/ActivityNavigator$Destination;", "action", "setAction", "Landroid/net/Uri;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setData", "(Landroid/net/Uri;)Landroidx/navigation/ActivityNavigator$Destination;", "", "supportsActions", "()Z", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "p0", "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "Ljava/lang/String;", "getDataPattern", "targetPackage", "getTargetPackage", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "Landroid/content/ComponentName;", "getComponent", "()Landroid/content/ComponentName;", "getAction", "Landroid/net/Uri;", "getData", "()Landroid/net/Uri;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class Destination extends androidx.view.NavDestination {
        private java.lang.String action;
        private android.content.ComponentName component;
        private android.net.Uri data;
        private java.lang.String dataPattern;
        private android.content.Intent intent;
        private java.lang.String targetPackage;

        @Override // androidx.view.NavDestination
        public boolean supportsActions() {
            return false;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Destination(androidx.view.Navigator<? extends androidx.navigation.ActivityNavigator.Destination> navigator) {
            super(navigator);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        }

        public final android.content.Intent getIntent() {
            return this.intent;
        }

        public final java.lang.String getDataPattern() {
            return this.dataPattern;
        }

        public final androidx.navigation.ActivityNavigator.Destination setIntent(android.content.Intent intent) {
            this.intent = intent;
            return this;
        }

        public final androidx.navigation.ActivityNavigator.Destination setDataPattern(java.lang.String dataPattern) {
            this.dataPattern = dataPattern;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Destination(androidx.view.NavigatorProvider navigatorProvider) {
            this((androidx.view.Navigator<? extends androidx.navigation.ActivityNavigator.Destination>) navigatorProvider.getNavigator(androidx.view.ActivityNavigator.class));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigatorProvider, "");
        }

        @Override // androidx.view.NavDestination
        public void onInflate(android.content.Context context, android.util.AttributeSet attrs) {
            java.lang.String str;
            java.lang.String str2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrs, "");
            super.onInflate(context, attrs);
            android.content.res.TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, androidx.view.C0281R.styleable.ActivityNavigator);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainAttributes, "");
            java.lang.String string = obtainAttributes.getString(androidx.view.C0281R.styleable.ActivityNavigator_targetPackage);
            java.lang.String str3 = null;
            if (string != null) {
                java.lang.String packageName = context.getPackageName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "");
                str = kotlin.text.StringsKt.replace$default(string, androidx.view.NavInflater.APPLICATION_ID_PLACEHOLDER, packageName, false, 4, (java.lang.Object) null);
            } else {
                str = null;
            }
            setTargetPackage(str);
            java.lang.String string2 = obtainAttributes.getString(androidx.view.C0281R.styleable.ActivityNavigator_android_name);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(context.getPackageName());
                    sb.append(string2);
                    string2 = sb.toString();
                }
                setComponentName(new android.content.ComponentName(context, string2));
            }
            setAction(obtainAttributes.getString(androidx.view.C0281R.styleable.ActivityNavigator_action));
            java.lang.String string3 = obtainAttributes.getString(androidx.view.C0281R.styleable.ActivityNavigator_data);
            if (string3 != null) {
                java.lang.String packageName2 = context.getPackageName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName2, "");
                str2 = kotlin.text.StringsKt.replace$default(string3, androidx.view.NavInflater.APPLICATION_ID_PLACEHOLDER, packageName2, false, 4, (java.lang.Object) null);
            } else {
                str2 = null;
            }
            if (str2 != null) {
                setData(android.net.Uri.parse(str2));
            }
            java.lang.String string4 = obtainAttributes.getString(androidx.view.C0281R.styleable.ActivityNavigator_dataPattern);
            if (string4 != null) {
                java.lang.String packageName3 = context.getPackageName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName3, "");
                str3 = kotlin.text.StringsKt.replace$default(string4, androidx.view.NavInflater.APPLICATION_ID_PLACEHOLDER, packageName3, false, 4, (java.lang.Object) null);
            }
            setDataPattern(str3);
            obtainAttributes.recycle();
        }

        public final java.lang.String getTargetPackage() {
            android.content.Intent intent = this.intent;
            if (intent != null) {
                return intent.getPackage();
            }
            return null;
        }

        public final androidx.navigation.ActivityNavigator.Destination setTargetPackage(java.lang.String packageName) {
            if (this.intent == null) {
                this.intent = new android.content.Intent();
            }
            android.content.Intent intent = this.intent;
            kotlin.jvm.internal.Intrinsics.checkNotNull(intent);
            intent.setPackage(packageName);
            return this;
        }

        public final android.content.ComponentName getComponent() {
            android.content.Intent intent = this.intent;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        public final androidx.navigation.ActivityNavigator.Destination setComponentName(android.content.ComponentName name2) {
            if (this.intent == null) {
                this.intent = new android.content.Intent();
            }
            android.content.Intent intent = this.intent;
            kotlin.jvm.internal.Intrinsics.checkNotNull(intent);
            intent.setComponent(name2);
            return this;
        }

        public final java.lang.String getAction() {
            android.content.Intent intent = this.intent;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        public final androidx.navigation.ActivityNavigator.Destination setAction(java.lang.String action) {
            if (this.intent == null) {
                this.intent = new android.content.Intent();
            }
            android.content.Intent intent = this.intent;
            kotlin.jvm.internal.Intrinsics.checkNotNull(intent);
            intent.setAction(action);
            return this;
        }

        public final android.net.Uri getData() {
            android.content.Intent intent = this.intent;
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        public final androidx.navigation.ActivityNavigator.Destination setData(android.net.Uri data) {
            if (this.intent == null) {
                this.intent = new android.content.Intent();
            }
            android.content.Intent intent = this.intent;
            kotlin.jvm.internal.Intrinsics.checkNotNull(intent);
            intent.setData(data);
            return this;
        }

        @Override // androidx.view.NavDestination
        public java.lang.String toString() {
            android.content.ComponentName component = getComponent();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(super.toString());
            if (component != null) {
                sb.append(" class=");
                sb.append(component.getClassName());
            } else {
                java.lang.String action = getAction();
                if (action != null) {
                    sb.append(" action=");
                    sb.append(action);
                }
            }
            java.lang.String obj = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            return obj;
        }

        @Override // androidx.view.NavDestination
        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !(other instanceof androidx.navigation.ActivityNavigator.Destination) || !super.equals(other)) {
                return false;
            }
            android.content.Intent intent = this.intent;
            if (intent != null) {
                if (!intent.filterEquals(((androidx.navigation.ActivityNavigator.Destination) other).intent)) {
                    return false;
                }
            } else if (((androidx.navigation.ActivityNavigator.Destination) other).intent != null) {
                return false;
            }
            return kotlin.jvm.internal.Intrinsics.areEqual(this.dataPattern, ((androidx.navigation.ActivityNavigator.Destination) other).dataPattern);
        }

        @Override // androidx.view.NavDestination
        public int hashCode() {
            int hashCode = super.hashCode();
            android.content.Intent intent = this.intent;
            int filterHashCode = intent != null ? intent.filterHashCode() : 0;
            java.lang.String str = this.dataPattern;
            return (((hashCode * 31) + filterHashCode) * 31) + (str != null ? str.hashCode() : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u000eB\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/navigation/ActivityNavigator$Extras;", "Landroidx/navigation/Navigator$Extras;", "", "flags", "Landroidx/core/app/ActivityOptionsCompat;", "activityOptions", "<init>", "(ILandroidx/core/app/ActivityOptionsCompat;)V", com.visa.cbp.getEncExpo.warmup, "getFlags", "()I", "Landroidx/core/app/ActivityOptionsCompat;", "getActivityOptions", "()Landroidx/core/app/ActivityOptionsCompat;", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Extras implements androidx.navigation.Navigator.Extras {
        private final androidx.core.app.ActivityOptionsCompat activityOptions;
        private final int flags;

        public Extras(int i, androidx.core.app.ActivityOptionsCompat activityOptionsCompat) {
            this.flags = i;
            this.activityOptions = activityOptionsCompat;
        }

        public final int getFlags() {
            return this.flags;
        }

        public final androidx.core.app.ActivityOptionsCompat getActivityOptions() {
            return this.activityOptions;
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/navigation/ActivityNavigator$Extras$Builder;", "", "<init>", "()V", "", "flags", "addFlags", "(I)Landroidx/navigation/ActivityNavigator$Extras$Builder;", "Landroidx/core/app/ActivityOptionsCompat;", "activityOptions", "setActivityOptions", "(Landroidx/core/app/ActivityOptionsCompat;)Landroidx/navigation/ActivityNavigator$Extras$Builder;", "Landroidx/navigation/ActivityNavigator$Extras;", "build", "()Landroidx/navigation/ActivityNavigator$Extras;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Landroidx/core/app/ActivityOptionsCompat;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Builder {

            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
            private int getHighResolutionOutputSizeshNQ4ISI;

            /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
            private androidx.core.app.ActivityOptionsCompat getHighSpeedVideoFpsRangesFor;

            public final androidx.navigation.ActivityNavigator.Extras.Builder addFlags(int flags) {
                this.getHighResolutionOutputSizeshNQ4ISI = flags | this.getHighResolutionOutputSizeshNQ4ISI;
                return this;
            }

            public final androidx.navigation.ActivityNavigator.Extras.Builder setActivityOptions(androidx.core.app.ActivityOptionsCompat activityOptions) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityOptions, "");
                this.getHighSpeedVideoFpsRangesFor = activityOptions;
                return this;
            }

            public final androidx.navigation.ActivityNavigator.Extras build() {
                return new androidx.navigation.ActivityNavigator.Extras(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/navigation/ActivityNavigator$Companion;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "applyPopAnimationsToPendingTransition", "(Landroid/app/Activity;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final void applyPopAnimationsToPendingTransition(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            android.content.Intent intent = activity.getIntent();
            if (intent != null) {
                int intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:popEnterAnim", -1);
                int intExtra2 = intent.getIntExtra("android-support-navigation:ActivityNavigator:popExitAnim", -1);
                if (intExtra == -1 && intExtra2 == -1) {
                    return;
                }
                if (intExtra == -1) {
                    intExtra = 0;
                }
                if (intExtra2 == -1) {
                    intExtra2 = 0;
                }
                activity.overridePendingTransition(intExtra, intExtra2);
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ android.content.Context $r8$lambda$KBSz3gdfovt8pmhkbA4gds_CcSs(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (context instanceof android.content.ContextWrapper) {
            return ((android.content.ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    @kotlin.jvm.JvmStatic
    public static final void applyPopAnimationsToPendingTransition(android.app.Activity activity) {
        INSTANCE.applyPopAnimationsToPendingTransition(activity);
    }
}
