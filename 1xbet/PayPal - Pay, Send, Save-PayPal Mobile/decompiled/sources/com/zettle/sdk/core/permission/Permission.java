package com.zettle.sdk.core.permission;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/core/permission/Permission;", "Lcom/zettle/sdk/core/Module;", "", "Lcom/zettle/sdk/core/permission/Prerequisite;", "requested", "checkApprovedPermissions", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zettle/sdk/core/requirements/PermissionDeniedStorage;", "permissionDeniedStorage", "()Lcom/zettle/sdk/core/requirements/PermissionDeniedStorage;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface Permission extends com.zettle.sdk.core.Module {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.permission.Permission.Companion INSTANCE = com.zettle.sdk.core.permission.Permission.Companion.Camera2StreamConfigurationMap;

    java.lang.Object checkApprovedPermissions(java.util.List<? extends com.zettle.sdk.core.permission.Prerequisite> list, kotlin.coroutines.Continuation<? super java.util.List<? extends com.zettle.sdk.core.permission.Prerequisite>> continuation);

    com.zettle.sdk.core.requirements.PermissionDeniedStorage permissionDeniedStorage();

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void start(com.zettle.sdk.core.permission.Permission permission) {
            com.zettle.sdk.core.Module.DefaultImpls.start(permission);
        }

        public static void stop(com.zettle.sdk.core.permission.Permission permission) {
            com.zettle.sdk.core.Module.DefaultImpls.stop(permission);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/core/permission/Permission$Companion;", "", "<init>", "()V", "Ljava/lang/Class;", "Lcom/zettle/sdk/core/permission/Permission;", "TYPE", "Ljava/lang/Class;", "getTYPE$core_publicRelease", "()Ljava/lang/Class;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.core.permission.Permission.Companion Camera2StreamConfigurationMap = new com.zettle.sdk.core.permission.Permission.Companion();
        private static final java.lang.Class<com.zettle.sdk.core.permission.Permission> TYPE = com.zettle.sdk.core.permission.Permission.class;

        private Companion() {
        }

        public final java.lang.Class<com.zettle.sdk.core.permission.Permission> getTYPE$core_publicRelease() {
            return TYPE;
        }
    }
}
