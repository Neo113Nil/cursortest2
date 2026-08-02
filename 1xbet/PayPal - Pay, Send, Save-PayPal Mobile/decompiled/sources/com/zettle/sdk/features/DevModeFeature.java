package com.zettle.sdk.features;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/zettle/sdk/features/DevModeFeature;", "", "Lcom/zettle/sdk/features/Action;", "action", "", "Lcom/zettle/sdk/core/permission/Prerequisite;", "devModeRequirements", "(Lcom/zettle/sdk/features/Action;)Ljava/util/List;", "Landroidx/fragment/app/Fragment;", "devModeScreen", "(Lcom/zettle/sdk/features/Action;)Landroidx/fragment/app/Fragment;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface DevModeFeature {
    java.util.List<com.zettle.sdk.core.permission.Prerequisite> devModeRequirements(com.zettle.sdk.features.Action action);

    androidx.fragment.app.Fragment devModeScreen(com.zettle.sdk.features.Action action);
}
