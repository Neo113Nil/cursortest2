package com.facebook.appevents.aam;

/* compiled from: MetadataMatcher.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J$\u0010\f\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/facebook/appevents/aam/MetadataMatcher;", "", "()V", "MAX_INDICATOR_LENGTH", "", "getAroundViewIndicators", "", "", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "getCurrentViewIndicators", "getTextIndicators", "matchIndicator", "", "indicator", com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, "indicators", "matchValue", "text", "rule", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class MetadataMatcher {
    public static final com.facebook.appevents.aam.MetadataMatcher INSTANCE = new com.facebook.appevents.aam.MetadataMatcher();
    private static final int MAX_INDICATOR_LENGTH = 100;

    private MetadataMatcher() {
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<java.lang.String> getCurrentViewIndicators(android.view.View view) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.aam.MetadataMatcher.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
            com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
            arrayList.add(com.facebook.appevents.codeless.internal.ViewHierarchy.getHintOfView(view));
            java.lang.Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            java.lang.CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    java.lang.String resourceName = view.getResources().getResourceName(view.getId());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resourceName, "resourceName");
                    java.lang.Object[] array = new kotlin.text.Regex(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING).split(resourceName, 0).toArray(new java.lang.String[0]);
                    if (array != null) {
                        java.lang.String[] strArr = (java.lang.String[]) array;
                        if (strArr.length == 2) {
                            arrayList.add(strArr[1]);
                        }
                    } else {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
            } catch (android.content.res.Resources.NotFoundException unused) {
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.String str : arrayList) {
                if (str.length() > 0 && str.length() <= 100) {
                    if (str == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    java.lang.String lowerCase = str.toLowerCase();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.aam.MetadataMatcher.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<java.lang.String> getAroundViewIndicators(android.view.View view) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.aam.MetadataMatcher.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
            android.view.ViewGroup parentOfView = com.facebook.appevents.codeless.internal.ViewHierarchy.getParentOfView(view);
            if (parentOfView != null) {
                com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy2 = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
                for (android.view.View view2 : com.facebook.appevents.codeless.internal.ViewHierarchy.getChildrenOfView(parentOfView)) {
                    if (view != view2) {
                        arrayList.addAll(INSTANCE.getTextIndicators(view2));
                    }
                }
            }
            return arrayList;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.aam.MetadataMatcher.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean matchIndicator(java.util.List<java.lang.String> indicators, java.util.List<java.lang.String> keys) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.aam.MetadataMatcher.class)) {
            return false;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(indicators, "indicators");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "keys");
            java.util.Iterator<java.lang.String> it = indicators.iterator();
            while (it.hasNext()) {
                if (INSTANCE.matchIndicator(it.next(), keys)) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.aam.MetadataMatcher.class);
            return false;
        }
    }

    private final boolean matchIndicator(java.lang.String indicator, java.util.List<java.lang.String> keys) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            java.util.Iterator<java.lang.String> it = keys.iterator();
            while (it.hasNext()) {
                if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) indicator, (java.lang.CharSequence) it.next(), false, 2, (java.lang.Object) null)) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean matchValue(java.lang.String text, java.lang.String rule) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.aam.MetadataMatcher.class)) {
            return false;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rule, "rule");
            return new kotlin.text.Regex(rule).matches(text);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.aam.MetadataMatcher.class);
            return false;
        }
    }

    private final java.util.List<java.lang.String> getTextIndicators(android.view.View view) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (view instanceof android.widget.EditText) {
                return arrayList;
            }
            if (view instanceof android.widget.TextView) {
                java.lang.String obj = ((android.widget.TextView) view).getText().toString();
                if (obj.length() > 0 && obj.length() < 100) {
                    if (obj == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    java.lang.String lowerCase = obj.toLowerCase();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList.add(lowerCase);
                }
                return arrayList;
            }
            com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
            java.util.Iterator<android.view.View> it = com.facebook.appevents.codeless.internal.ViewHierarchy.getChildrenOfView(view).iterator();
            while (it.hasNext()) {
                arrayList.addAll(getTextIndicators(it.next()));
            }
            return arrayList;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
