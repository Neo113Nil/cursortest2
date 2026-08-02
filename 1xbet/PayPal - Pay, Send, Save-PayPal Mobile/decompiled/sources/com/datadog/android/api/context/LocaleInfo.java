package com.datadog.android.api.context;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/datadog/android/api/context/LocaleInfo;", "", "", "", "locales", "currentLocale", "timeZone", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/api/context/LocaleInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCurrentLocale", "Ljava/util/List;", "getLocales", "getTimeZone"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LocaleInfo {
    private final java.lang.String currentLocale;
    private final java.util.List<java.lang.String> locales;
    private final java.lang.String timeZone;

    public LocaleInfo(java.util.List<java.lang.String> list, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.locales = list;
        this.currentLocale = str;
        this.timeZone = str2;
    }

    public final java.util.List<java.lang.String> getLocales() {
        return this.locales;
    }

    public final java.lang.String getCurrentLocale() {
        return this.currentLocale;
    }

    public final java.lang.String getTimeZone() {
        return this.timeZone;
    }

    public final java.lang.String toString() {
        java.util.List<java.lang.String> list = this.locales;
        java.lang.String str = this.currentLocale;
        java.lang.String str2 = this.timeZone;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LocaleInfo(locales=");
        sb.append(list);
        sb.append(", currentLocale=");
        sb.append(str);
        sb.append(", timeZone=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.locales.hashCode() * 31) + this.currentLocale.hashCode()) * 31) + this.timeZone.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.api.context.LocaleInfo)) {
            return false;
        }
        com.datadog.android.api.context.LocaleInfo localeInfo = (com.datadog.android.api.context.LocaleInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.locales, localeInfo.locales) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentLocale, localeInfo.currentLocale) && kotlin.jvm.internal.Intrinsics.areEqual(this.timeZone, localeInfo.timeZone);
    }

    public final com.datadog.android.api.context.LocaleInfo copy(java.util.List<java.lang.String> locales, java.lang.String currentLocale, java.lang.String timeZone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locales, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentLocale, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        return new com.datadog.android.api.context.LocaleInfo(locales, currentLocale, timeZone);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTimeZone() {
        return this.timeZone;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCurrentLocale() {
        return this.currentLocale;
    }

    public final java.util.List<java.lang.String> component1() {
        return this.locales;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.datadog.android.api.context.LocaleInfo copy$default(com.datadog.android.api.context.LocaleInfo localeInfo, java.util.List list, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = localeInfo.locales;
        }
        if ((i & 2) != 0) {
            str = localeInfo.currentLocale;
        }
        if ((i & 4) != 0) {
            str2 = localeInfo.timeZone;
        }
        return localeInfo.copy(list, str, str2);
    }
}
