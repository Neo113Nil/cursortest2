package com.zettle.sdk.core.requirements;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final /* synthetic */ class RequirementsFragment$onViewCreated$2 extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function1<java.util.List<? extends com.zettle.sdk.core.permission.Prerequisite>, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.util.List<? extends com.zettle.sdk.core.permission.Prerequisite> list) {
        java.util.List<? extends com.zettle.sdk.core.permission.Prerequisite> list2 = list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        ((com.zettle.sdk.core.requirements.RequirementsFragment) this.receiver).getHighSpeedVideoFpsRanges((java.util.List<? extends com.zettle.sdk.core.permission.Prerequisite>) list2, false);
        return kotlin.Unit.INSTANCE;
    }

    RequirementsFragment$onViewCreated$2(java.lang.Object obj) {
        super(1, obj, com.zettle.sdk.core.requirements.RequirementsFragment.class, "buildPrerequisitesUI", "buildPrerequisitesUI(Ljava/util/List;Z)V", 0);
    }
}
