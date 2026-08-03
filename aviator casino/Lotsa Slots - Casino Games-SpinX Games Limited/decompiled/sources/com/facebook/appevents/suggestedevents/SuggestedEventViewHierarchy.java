package com.facebook.appevents.suggestedevents;

/* compiled from: SuggestedEventViewHierarchy.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\nH\u0007R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/facebook/appevents/suggestedevents/SuggestedEventViewHierarchy;", "", "()V", "blacklistedViews", "", "Ljava/lang/Class;", "Landroid/view/View;", "getAllClickableViews", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "getDictionaryOfView", "Lorg/json/JSONObject;", "clickedView", "getTextOfChildren", "", "getTextOfViewRecursively", "hostView", "updateBasicInfo", "", "json", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SuggestedEventViewHierarchy {
    public static final com.facebook.appevents.suggestedevents.SuggestedEventViewHierarchy INSTANCE = new com.facebook.appevents.suggestedevents.SuggestedEventViewHierarchy();
    private static final java.util.List<java.lang.Class<? extends android.view.View>> blacklistedViews = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Class[]{android.widget.Switch.class, android.widget.Spinner.class, android.widget.DatePicker.class, android.widget.TimePicker.class, android.widget.RadioGroup.class, android.widget.RatingBar.class, android.widget.EditText.class, android.widget.AdapterView.class});

    private SuggestedEventViewHierarchy() {
    }

    @kotlin.jvm.JvmStatic
    public static final org.json.JSONObject getDictionaryOfView(android.view.View view, android.view.View clickedView) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.SuggestedEventViewHierarchy.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickedView, "clickedView");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (view == clickedView) {
                try {
                    jSONObject.put(com.facebook.appevents.internal.ViewHierarchyConstants.IS_INTERACTED_KEY, true);
                } catch (org.json.JSONException unused) {
                }
            }
            updateBasicInfo(view, jSONObject);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
            java.util.Iterator<android.view.View> it = com.facebook.appevents.codeless.internal.ViewHierarchy.getChildrenOfView(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(getDictionaryOfView(it.next(), clickedView));
            }
            jSONObject.put(com.facebook.appevents.internal.ViewHierarchyConstants.CHILDREN_VIEW_KEY, jSONArray);
            return jSONObject;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.SuggestedEventViewHierarchy.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void updateBasicInfo(android.view.View view, org.json.JSONObject json) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.SuggestedEventViewHierarchy.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
            try {
                com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
                java.lang.String textOfView = com.facebook.appevents.codeless.internal.ViewHierarchy.getTextOfView(view);
                com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy2 = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
                java.lang.String hintOfView = com.facebook.appevents.codeless.internal.ViewHierarchy.getHintOfView(view);
                json.put(com.facebook.appevents.internal.ViewHierarchyConstants.CLASS_NAME_KEY, view.getClass().getSimpleName());
                com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy3 = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
                json.put(com.facebook.appevents.internal.ViewHierarchyConstants.CLASS_TYPE_BITMASK_KEY, com.facebook.appevents.codeless.internal.ViewHierarchy.getClassTypeBitmask(view));
                if (textOfView.length() > 0) {
                    json.put("text", textOfView);
                }
                if (hintOfView.length() > 0) {
                    json.put(com.facebook.appevents.internal.ViewHierarchyConstants.HINT_KEY, hintOfView);
                }
                if (view instanceof android.widget.EditText) {
                    json.put(com.facebook.appevents.internal.ViewHierarchyConstants.INPUT_TYPE_KEY, ((android.widget.EditText) view).getInputType());
                }
            } catch (org.json.JSONException unused) {
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.SuggestedEventViewHierarchy.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<android.view.View> getAllClickableViews(android.view.View view) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.SuggestedEventViewHierarchy.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<java.lang.Class<? extends android.view.View>> it = blacklistedViews.iterator();
            while (it.hasNext()) {
                if (it.next().isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
            java.util.Iterator<android.view.View> it2 = com.facebook.appevents.codeless.internal.ViewHierarchy.getChildrenOfView(view).iterator();
            while (it2.hasNext()) {
                arrayList.addAll(getAllClickableViews(it2.next()));
            }
            return arrayList;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.SuggestedEventViewHierarchy.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getTextOfViewRecursively(android.view.View hostView) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.SuggestedEventViewHierarchy.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostView, "hostView");
            com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
            java.lang.String textOfView = com.facebook.appevents.codeless.internal.ViewHierarchy.getTextOfView(hostView);
            if (textOfView.length() > 0) {
                return textOfView;
            }
            java.lang.String join = android.text.TextUtils.join(io.ktor.sse.ServerSentEventKt.SPACE, INSTANCE.getTextOfChildren(hostView));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(join, "join(\" \", childrenText)");
            return join;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.SuggestedEventViewHierarchy.class);
            return null;
        }
    }

    private final java.util.List<java.lang.String> getTextOfChildren(android.view.View view) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
            for (android.view.View view2 : com.facebook.appevents.codeless.internal.ViewHierarchy.getChildrenOfView(view)) {
                com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy2 = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
                java.lang.String textOfView = com.facebook.appevents.codeless.internal.ViewHierarchy.getTextOfView(view2);
                if (textOfView.length() > 0) {
                    arrayList.add(textOfView);
                }
                arrayList.addAll(getTextOfChildren(view2));
            }
            return arrayList;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
