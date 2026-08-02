package com.miteksystems.misnap.workflow.fragment;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0016\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0014"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationError;", "", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction;", "action", "Lcom/miteksystems/misnap/workflow/fragment/NavigationErrorInfo;", "navigationErrorInfo", "<init>", "(Lcom/miteksystems/misnap/workflow/fragment/NavigationAction;Lcom/miteksystems/misnap/workflow/fragment/NavigationErrorInfo;)V", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "exception", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "fragmentClass", "", "hashCode", "(Ljava/lang/Exception;Ljava/lang/Class;ILcom/miteksystems/misnap/workflow/fragment/NavigationAction;)V", "component1", "()Lcom/miteksystems/misnap/workflow/fragment/NavigationAction;", "component2", "()Lcom/miteksystems/misnap/workflow/fragment/NavigationErrorInfo;", "copy", "(Lcom/miteksystems/misnap/workflow/fragment/NavigationAction;Lcom/miteksystems/misnap/workflow/fragment/NavigationErrorInfo;)Lcom/miteksystems/misnap/workflow/fragment/NavigationError;", "", "toString", "()Ljava/lang/String;", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction;", "getAction", util.h.xy.cb.b.f1091, "Lcom/miteksystems/misnap/workflow/fragment/NavigationErrorInfo;", "getNavigationErrorInfo"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final /* data */ class NavigationError {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.miteksystems.misnap.workflow.fragment.NavigationAction action;

    /* renamed from: b, reason: from kotlin metadata */
    private final com.miteksystems.misnap.workflow.fragment.NavigationErrorInfo navigationErrorInfo;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavigationError(com.miteksystems.misnap.workflow.fragment.NavigationAction navigationAction) {
        this(navigationAction, (com.miteksystems.misnap.workflow.fragment.NavigationErrorInfo) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationAction, "");
    }

    public NavigationError(com.miteksystems.misnap.workflow.fragment.NavigationAction navigationAction, com.miteksystems.misnap.workflow.fragment.NavigationErrorInfo navigationErrorInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationAction, "");
        this.action = navigationAction;
        this.navigationErrorInfo = navigationErrorInfo;
    }

    public /* synthetic */ NavigationError(com.miteksystems.misnap.workflow.fragment.NavigationAction navigationAction, com.miteksystems.misnap.workflow.fragment.NavigationErrorInfo navigationErrorInfo, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(navigationAction, (i & 2) != 0 ? null : navigationErrorInfo);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationError(java.lang.Exception exc, java.lang.Class<androidx.fragment.app.Fragment> cls, int i, com.miteksystems.misnap.workflow.fragment.NavigationAction navigationAction) {
        this(navigationAction, new com.miteksystems.misnap.workflow.fragment.NavigationErrorInfo(exc, cls, i));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationAction, "");
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigationError(action=");
        sb.append(this.action);
        sb.append(", navigationErrorInfo=");
        sb.append(this.navigationErrorInfo);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.action.hashCode();
        com.miteksystems.misnap.workflow.fragment.NavigationErrorInfo navigationErrorInfo = this.navigationErrorInfo;
        return (hashCode * 31) + (navigationErrorInfo == null ? 0 : navigationErrorInfo.hashCode());
    }

    public final com.miteksystems.misnap.workflow.fragment.NavigationErrorInfo getNavigationErrorInfo() {
        return this.navigationErrorInfo;
    }

    public final com.miteksystems.misnap.workflow.fragment.NavigationAction getAction() {
        return this.action;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.miteksystems.misnap.workflow.fragment.NavigationError)) {
            return false;
        }
        com.miteksystems.misnap.workflow.fragment.NavigationError navigationError = (com.miteksystems.misnap.workflow.fragment.NavigationError) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.action, navigationError.action) && kotlin.jvm.internal.Intrinsics.areEqual(this.navigationErrorInfo, navigationError.navigationErrorInfo);
    }

    public final com.miteksystems.misnap.workflow.fragment.NavigationError copy(com.miteksystems.misnap.workflow.fragment.NavigationAction action, com.miteksystems.misnap.workflow.fragment.NavigationErrorInfo navigationErrorInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        return new com.miteksystems.misnap.workflow.fragment.NavigationError(action, navigationErrorInfo);
    }

    /* renamed from: component2, reason: from getter */
    public final com.miteksystems.misnap.workflow.fragment.NavigationErrorInfo getNavigationErrorInfo() {
        return this.navigationErrorInfo;
    }

    /* renamed from: component1, reason: from getter */
    public final com.miteksystems.misnap.workflow.fragment.NavigationAction getAction() {
        return this.action;
    }

    public static /* synthetic */ com.miteksystems.misnap.workflow.fragment.NavigationError copy$default(com.miteksystems.misnap.workflow.fragment.NavigationError navigationError, com.miteksystems.misnap.workflow.fragment.NavigationAction navigationAction, com.miteksystems.misnap.workflow.fragment.NavigationErrorInfo navigationErrorInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            navigationAction = navigationError.action;
        }
        if ((i & 2) != 0) {
            navigationErrorInfo = navigationError.navigationErrorInfo;
        }
        return navigationError.copy(navigationAction, navigationErrorInfo);
    }
}
