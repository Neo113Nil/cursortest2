package com.zettle.sdk.core.devmode;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0004¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H&¢\u0006\u0004\b\u0017\u0010\u0003R\u0016\u0010\u001a\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/zettle/sdk/core/devmode/DevModeSelectionFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lcom/zettle/sdk/core/devmode/DevModeCase;", "case", "Lkotlin/Function0;", "", "onClicked", "addCaseView", "(Lcom/zettle/sdk/core/devmode/DevModeCase;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "showCases", "getHighSpeedVideoFpsRangesFor", "Landroid/view/ViewGroup;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class DevModeSelectionFragment extends androidx.fragment.app.Fragment {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private android.view.ViewGroup getHighSpeedVideoFpsRanges;

    public abstract void showCases();

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        return inflater.inflate(com.zettle.sdk.R.layout.dev_mode_selection_fragment, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        android.view.View findViewById = view.findViewById(com.zettle.sdk.R.id.dev_mode_selection_container);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.getHighSpeedVideoFpsRanges = (android.view.ViewGroup) findViewById;
        showCases();
    }

    protected final void addCaseView(com.zettle.sdk.core.devmode.DevModeCase r12, final kotlin.jvm.functions.Function0<kotlin.Unit> onClicked) {
        android.view.ViewGroup viewGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClicked, "");
        android.content.Context context = getContext();
        if (context != null) {
            android.view.ViewGroup viewGroup2 = this.getHighSpeedVideoFpsRanges;
            android.view.ViewGroup viewGroup3 = null;
            if (viewGroup2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                viewGroup = null;
            } else {
                viewGroup = viewGroup2;
            }
            com.zettle.sdk.common.ui.components.listitem.OttoListItemComponent ottoListItemComponent = new com.zettle.sdk.common.ui.components.listitem.OttoListItemComponent(context, null, 0, 6, null);
            ottoListItemComponent.setTrailingIconDrawable(com.zettle.sdk.R.drawable.otto_icon_simpleandarrows_simple_arrow_right_m);
            ottoListItemComponent.setTrailingPrimaryTexAppearance(java.lang.Integer.valueOf(com.zettle.sdk.R.style.TextAppearance_Otto_RegularSecondary));
            ottoListItemComponent.setListItemType(com.zettle.sdk.common.ui.components.listitem.ListItemTypes.INTERACTIVE);
            ottoListItemComponent.setLeadingPrimaryText(context.getString(r12.getNameResId()));
            ottoListItemComponent.setContentDescription(context.getString(r12.getNameResId()));
            ottoListItemComponent.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.core.devmode.DevModeSelectionFragment$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.zettle.sdk.core.devmode.DevModeSelectionFragment.$r8$lambda$nlv4KEmkU7HnvPfNkZ58o4zGaHk(kotlin.jvm.functions.Function0.this, view);
                }
            });
            viewGroup.addView(ottoListItemComponent);
            android.view.ViewGroup viewGroup4 = this.getHighSpeedVideoFpsRanges;
            if (viewGroup4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                viewGroup3 = viewGroup4;
            }
            android.view.View view = new android.view.View(context);
            view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, view.getResources().getDimensionPixelSize(com.zettle.sdk.R.dimen.default_divider_height)));
            view.setBackgroundResource(com.zettle.sdk.R.drawable.list_item_divider_inset_left_long);
            viewGroup3.addView(view);
        }
    }

    public static /* synthetic */ void $r8$lambda$nlv4KEmkU7HnvPfNkZ58o4zGaHk(kotlin.jvm.functions.Function0 function0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        function0.invoke();
    }
}
