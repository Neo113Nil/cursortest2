package com.zettle.sdk.core.requirements;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u00020\f2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/core/requirements/PermissionDeniedStorageImpl;", "Lcom/zettle/sdk/core/requirements/PermissionDeniedStorage;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Lcom/zettle/sdk/core/permission/Prerequisite$Permission;", "", "isDeniedBefore", "(Lcom/zettle/sdk/core/permission/Prerequisite$Permission;)Z", "", "", "", "saveRequestPermissionResult", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/SharedPreferences;", "getHighSpeedVideoFpsRanges", "Landroid/content/SharedPreferences;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class PermissionDeniedStorageImpl implements com.zettle.sdk.core.requirements.PermissionDeniedStorage {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.SharedPreferences getHighSpeedVideoFpsRangesFor;

    public PermissionDeniedStorageImpl(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("iZettle-SDK-Permissions", 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        this.getHighSpeedVideoFpsRangesFor = sharedPreferences;
    }

    @Override // com.zettle.sdk.core.requirements.PermissionDeniedStorage
    public final boolean isDeniedBefore(com.zettle.sdk.core.permission.Prerequisite.Permission p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        for (java.lang.String str : p0.getIdentifier()) {
            if (this.getHighSpeedVideoFpsRangesFor.getBoolean(str, false)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.zettle.sdk.core.requirements.PermissionDeniedStorage
    public final java.lang.Object saveRequestPermissionResult(java.util.Map<java.lang.String, java.lang.Boolean> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Boolean>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.getHighSpeedVideoFpsRangesFor.edit().putBoolean(it.next().getKey(), !r4.getValue().booleanValue()).apply();
        }
        return kotlin.Unit.INSTANCE;
    }
}
