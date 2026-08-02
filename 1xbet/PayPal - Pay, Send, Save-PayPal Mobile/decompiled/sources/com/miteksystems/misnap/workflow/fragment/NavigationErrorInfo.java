package com.miteksystems.misnap.workflow.fragment;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\f\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\u0011J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationErrorInfo;", "", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "exception", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "fragmentClass", "", "hashCode", "<init>", "(Ljava/lang/Exception;Ljava/lang/Class;I)V", "component1", "()Ljava/lang/Exception;", "component2", "()Ljava/lang/Class;", "component3", "()I", "copy", "(Ljava/lang/Exception;Ljava/lang/Class;I)Lcom/miteksystems/misnap/workflow/fragment/NavigationErrorInfo;", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Exception;", "getException", util.h.xy.cb.b.f1091, "Ljava/lang/Class;", "getFragmentClass", "c", com.visa.cbp.getEncExpo.warmup, "getHashCode"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final /* data */ class NavigationErrorInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.Exception exception;

    /* renamed from: b, reason: from kotlin metadata */
    private final java.lang.Class<androidx.fragment.app.Fragment> fragmentClass;

    /* renamed from: c, reason: from kotlin metadata */
    private final int hashCode;

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigationErrorInfo(exception=");
        sb.append(this.exception);
        sb.append(", fragmentClass=");
        sb.append(this.fragmentClass);
        sb.append(", hashCode=");
        sb.append(this.hashCode);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.exception.hashCode() * 31) + this.fragmentClass.hashCode()) * 31) + java.lang.Integer.hashCode(this.hashCode);
    }

    public final int getHashCode() {
        return this.hashCode;
    }

    public final java.lang.Class<androidx.fragment.app.Fragment> getFragmentClass() {
        return this.fragmentClass;
    }

    public final java.lang.Exception getException() {
        return this.exception;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.miteksystems.misnap.workflow.fragment.NavigationErrorInfo)) {
            return false;
        }
        com.miteksystems.misnap.workflow.fragment.NavigationErrorInfo navigationErrorInfo = (com.miteksystems.misnap.workflow.fragment.NavigationErrorInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.exception, navigationErrorInfo.exception) && kotlin.jvm.internal.Intrinsics.areEqual(this.fragmentClass, navigationErrorInfo.fragmentClass) && this.hashCode == navigationErrorInfo.hashCode;
    }

    public final com.miteksystems.misnap.workflow.fragment.NavigationErrorInfo copy(java.lang.Exception exception, java.lang.Class<androidx.fragment.app.Fragment> fragmentClass, int hashCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentClass, "");
        return new com.miteksystems.misnap.workflow.fragment.NavigationErrorInfo(exception, fragmentClass, hashCode);
    }

    /* renamed from: component3, reason: from getter */
    public final int getHashCode() {
        return this.hashCode;
    }

    public final java.lang.Class<androidx.fragment.app.Fragment> component2() {
        return this.fragmentClass;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Exception getException() {
        return this.exception;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.miteksystems.misnap.workflow.fragment.NavigationErrorInfo copy$default(com.miteksystems.misnap.workflow.fragment.NavigationErrorInfo navigationErrorInfo, java.lang.Exception exc, java.lang.Class cls, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            exc = navigationErrorInfo.exception;
        }
        if ((i2 & 2) != 0) {
            cls = navigationErrorInfo.fragmentClass;
        }
        if ((i2 & 4) != 0) {
            i = navigationErrorInfo.hashCode;
        }
        return navigationErrorInfo.copy(exc, cls, i);
    }

    public NavigationErrorInfo(java.lang.Exception exc, java.lang.Class<androidx.fragment.app.Fragment> cls, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        this.exception = exc;
        this.fragmentClass = cls;
        this.hashCode = i;
    }
}
