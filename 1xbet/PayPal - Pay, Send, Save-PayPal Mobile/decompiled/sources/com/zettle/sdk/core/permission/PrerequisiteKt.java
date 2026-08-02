package com.zettle.sdk.core.permission;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/zettle/sdk/core/permission/Prerequisite;", "", "containsAuth", "(Ljava/util/List;)Z"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PrerequisiteKt {
    public static final boolean containsAuth(java.util.List<? extends com.zettle.sdk.core.permission.Prerequisite> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof com.zettle.sdk.core.permission.Prerequisite.Authentication) {
                arrayList.add(obj);
            }
        }
        return !arrayList.isEmpty();
    }
}
