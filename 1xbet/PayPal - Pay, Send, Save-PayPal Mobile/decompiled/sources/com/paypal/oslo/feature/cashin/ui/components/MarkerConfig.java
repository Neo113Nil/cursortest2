package com.paypal.oslo.feature.cashin.ui.components;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/components/MarkerConfig;", "", "", "title", "snippet", "tag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/cashin/ui/components/MarkerConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getSnippet", "Ljava/lang/Object;", "getTag"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MarkerConfig {
    public static final int $stable = 8;
    private final java.lang.String snippet;
    private final java.lang.Object tag;
    private final java.lang.String title;

    public MarkerConfig(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.title = str;
        this.snippet = str2;
        this.tag = obj;
    }

    public /* synthetic */ MarkerConfig(java.lang.String str, java.lang.String str2, java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : obj);
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getSnippet() {
        return this.snippet;
    }

    public final java.lang.Object getTag() {
        return this.tag;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        java.lang.String str2 = this.snippet;
        java.lang.Object obj = this.tag;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MarkerConfig(title=");
        sb.append(str);
        sb.append(", snippet=");
        sb.append(str2);
        sb.append(", tag=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode();
        int hashCode2 = this.snippet.hashCode();
        java.lang.Object obj = this.tag;
        return (((hashCode * 31) + hashCode2) * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cashin.ui.components.MarkerConfig)) {
            return false;
        }
        com.paypal.oslo.feature.cashin.ui.components.MarkerConfig markerConfig = (com.paypal.oslo.feature.cashin.ui.components.MarkerConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, markerConfig.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.snippet, markerConfig.snippet) && kotlin.jvm.internal.Intrinsics.areEqual(this.tag, markerConfig.tag);
    }

    public final com.paypal.oslo.feature.cashin.ui.components.MarkerConfig copy(java.lang.String title, java.lang.String snippet, java.lang.Object tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(snippet, "");
        return new com.paypal.oslo.feature.cashin.ui.components.MarkerConfig(title, snippet, tag);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Object getTag() {
        return this.tag;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSnippet() {
        return this.snippet;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cashin.ui.components.MarkerConfig copy$default(com.paypal.oslo.feature.cashin.ui.components.MarkerConfig markerConfig, java.lang.String str, java.lang.String str2, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = markerConfig.title;
        }
        if ((i & 2) != 0) {
            str2 = markerConfig.snippet;
        }
        if ((i & 4) != 0) {
            obj = markerConfig.tag;
        }
        return markerConfig.copy(str, str2, obj);
    }
}
