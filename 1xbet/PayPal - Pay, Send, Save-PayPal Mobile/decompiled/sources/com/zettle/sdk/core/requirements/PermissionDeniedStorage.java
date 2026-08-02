package com.zettle.sdk.core.requirements;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/core/requirements/PermissionDeniedStorage;", "", "Lcom/zettle/sdk/core/permission/Prerequisite$Permission;", com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, "", "isDeniedBefore", "(Lcom/zettle/sdk/core/permission/Prerequisite$Permission;)Z", "", "", "result", "", "saveRequestPermissionResult", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface PermissionDeniedStorage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.requirements.PermissionDeniedStorage.Companion INSTANCE = com.zettle.sdk.core.requirements.PermissionDeniedStorage.Companion.getHighResolutionOutputSizeshNQ4ISI;

    boolean isDeniedBefore(com.zettle.sdk.core.permission.Prerequisite.Permission permission);

    java.lang.Object saveRequestPermissionResult(java.util.Map<java.lang.String, java.lang.Boolean> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/core/requirements/PermissionDeniedStorage$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/zettle/sdk/core/requirements/PermissionDeniedStorage;", "create", "(Landroid/content/Context;)Lcom/zettle/sdk/core/requirements/PermissionDeniedStorage;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.core.requirements.PermissionDeniedStorage.Companion getHighResolutionOutputSizeshNQ4ISI = new com.zettle.sdk.core.requirements.PermissionDeniedStorage.Companion();

        private Companion() {
        }

        public final com.zettle.sdk.core.requirements.PermissionDeniedStorage create(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return new com.zettle.sdk.core.requirements.PermissionDeniedStorageImpl(context);
        }
    }
}
