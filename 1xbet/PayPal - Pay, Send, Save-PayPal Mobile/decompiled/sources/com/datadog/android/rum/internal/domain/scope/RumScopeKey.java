package com.datadog.android.rum.internal.domain.scope;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;", "", "", "id", "url", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "getUrl", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RumScopeKey {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.domain.scope.RumScopeKey.Companion INSTANCE = new com.datadog.android.rum.internal.domain.scope.RumScopeKey.Companion(null);
    private final java.lang.String id;
    private final java.lang.String name;
    private final java.lang.String url;

    public RumScopeKey(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.id = str;
        this.url = str2;
        this.name = str3;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey$Companion;", "", "<init>", "()V", "key", "", "name", "Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;", "from", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumScopeKey from$default(com.datadog.android.rum.internal.domain.scope.RumScopeKey.Companion companion, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.from(obj, str);
        }

        public final com.datadog.android.rum.internal.domain.scope.RumScopeKey from(java.lang.Object key, java.lang.String name2) {
            android.content.ComponentName component;
            java.lang.String obj;
            java.lang.String obj2;
            java.lang.String canonicalName;
            java.lang.String name3;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            if (key instanceof android.app.Activity) {
                component = ((android.app.Activity) key).getComponentName();
            } else {
                component = key instanceof androidx.navigation.ActivityNavigator.Destination ? ((androidx.navigation.ActivityNavigator.Destination) key).getComponent() : null;
            }
            if (component != null) {
                java.lang.String className = component.getClassName();
                int identityHashCode = java.lang.System.identityHashCode(key);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(className);
                sb.append("@");
                sb.append(identityHashCode);
                java.lang.String obj3 = sb.toString();
                java.lang.String packageName = component.getPackageName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "");
                if (packageName.length() == 0) {
                    obj = component.getClassName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                } else {
                    java.lang.String className2 = component.getClassName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className2, "");
                    java.lang.String packageName2 = component.getPackageName();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(packageName2);
                    sb2.append(".");
                    if (kotlin.text.StringsKt.startsWith$default(className2, sb2.toString(), false, 2, (java.lang.Object) null)) {
                        obj = component.getClassName();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                    } else {
                        java.lang.String className3 = component.getClassName();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className3, "");
                        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) className3, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, false, 2, (java.lang.Object) null)) {
                            obj = component.getClassName();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                        } else {
                            java.lang.String packageName3 = component.getPackageName();
                            java.lang.String className4 = component.getClassName();
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                            sb3.append(packageName3);
                            sb3.append(".");
                            sb3.append(className4);
                            obj = sb3.toString();
                        }
                    }
                }
                if (name2 == null) {
                    name2 = component.getClassName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                }
                return new com.datadog.android.rum.internal.domain.scope.RumScopeKey(obj3, obj, name2);
            }
            boolean z = key instanceof java.lang.String;
            if (z) {
                obj2 = (java.lang.String) key;
            } else {
                if (!(key instanceof java.lang.Number)) {
                    if (key instanceof java.lang.Enum) {
                        java.lang.String name4 = key.getClass().getName();
                        java.lang.String name5 = ((java.lang.Enum) key).name();
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                        sb4.append(name4);
                        sb4.append("@");
                        sb4.append(name5);
                        obj2 = sb4.toString();
                    } else if (key instanceof androidx.navigation.fragment.DialogFragmentNavigator.Destination) {
                        androidx.navigation.fragment.DialogFragmentNavigator.Destination destination = (androidx.navigation.fragment.DialogFragmentNavigator.Destination) key;
                        java.lang.String className5 = destination.getClassName();
                        int id = destination.getId();
                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                        sb5.append(className5);
                        sb5.append("#");
                        sb5.append(id);
                        obj2 = sb5.toString();
                    } else if (key instanceof androidx.navigation.fragment.FragmentNavigator.Destination) {
                        androidx.navigation.fragment.FragmentNavigator.Destination destination2 = (androidx.navigation.fragment.FragmentNavigator.Destination) key;
                        java.lang.String className6 = destination2.getClassName();
                        int id2 = destination2.getId();
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(className6);
                        sb6.append("#");
                        sb6.append(id2);
                        obj2 = sb6.toString();
                    }
                }
                obj2 = key.toString();
            }
            if (z) {
                canonicalName = (java.lang.String) key;
            } else if (key instanceof java.lang.Number) {
                canonicalName = key.toString();
            } else if (key instanceof java.lang.Enum) {
                java.lang.String name6 = key.getClass().getName();
                java.lang.String name7 = ((java.lang.Enum) key).name();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(name6);
                sb7.append(".");
                sb7.append(name7);
                canonicalName = sb7.toString();
            } else if (key instanceof androidx.navigation.fragment.DialogFragmentNavigator.Destination) {
                canonicalName = ((androidx.navigation.fragment.DialogFragmentNavigator.Destination) key).getClassName();
            } else if (key instanceof androidx.navigation.fragment.FragmentNavigator.Destination) {
                canonicalName = ((androidx.navigation.fragment.FragmentNavigator.Destination) key).getClassName();
            } else {
                canonicalName = key.getClass().getCanonicalName();
                if (canonicalName == null) {
                    canonicalName = key.getClass().getSimpleName();
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(canonicalName, "");
            }
            if (name2 == null) {
                if (z) {
                    name3 = (java.lang.String) key;
                } else if (key instanceof java.lang.Number) {
                    name3 = key.toString();
                } else if (key instanceof java.lang.Enum) {
                    name3 = ((java.lang.Enum) key).name();
                } else if (key instanceof androidx.navigation.fragment.DialogFragmentNavigator.Destination) {
                    name3 = ((androidx.navigation.fragment.DialogFragmentNavigator.Destination) key).getClassName();
                } else if (key instanceof androidx.navigation.fragment.FragmentNavigator.Destination) {
                    name3 = ((androidx.navigation.fragment.FragmentNavigator.Destination) key).getClassName();
                } else {
                    name3 = key.getClass().getName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name3, "");
                }
                name2 = name3;
            }
            return new com.datadog.android.rum.internal.domain.scope.RumScopeKey(obj2, canonicalName, name2);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.url;
        java.lang.String str3 = this.name;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RumScopeKey(id=");
        sb.append(str);
        sb.append(", url=");
        sb.append(str2);
        sb.append(", name=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.id.hashCode() * 31) + this.url.hashCode()) * 31) + this.name.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumScopeKey)) {
            return false;
        }
        com.datadog.android.rum.internal.domain.scope.RumScopeKey rumScopeKey = (com.datadog.android.rum.internal.domain.scope.RumScopeKey) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, rumScopeKey.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, rumScopeKey.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, rumScopeKey.name);
    }

    public final com.datadog.android.rum.internal.domain.scope.RumScopeKey copy(java.lang.String id, java.lang.String url, java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.datadog.android.rum.internal.domain.scope.RumScopeKey(id, url, name2);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumScopeKey copy$default(com.datadog.android.rum.internal.domain.scope.RumScopeKey rumScopeKey, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = rumScopeKey.id;
        }
        if ((i & 2) != 0) {
            str2 = rumScopeKey.url;
        }
        if ((i & 4) != 0) {
            str3 = rumScopeKey.name;
        }
        return rumScopeKey.copy(str, str2, str3);
    }
}
