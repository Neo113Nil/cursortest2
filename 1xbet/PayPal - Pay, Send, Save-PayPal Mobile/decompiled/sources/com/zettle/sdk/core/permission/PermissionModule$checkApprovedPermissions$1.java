package com.zettle.sdk.core.permission;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.permission.PermissionModule", f = "PermissionModule.kt", i = {0, 0}, l = {58}, m = "checkApprovedPermissions", n = {"this", "destination$iv$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes17.dex */
final class PermissionModule$checkApprovedPermissions$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.zettle.sdk.core.permission.PermissionModule getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getInputFormats.checkApprovedPermissions(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PermissionModule$checkApprovedPermissions$1(com.zettle.sdk.core.permission.PermissionModule permissionModule, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.permission.PermissionModule$checkApprovedPermissions$1> continuation) {
        super(continuation);
        this.getInputFormats = permissionModule;
    }
}
