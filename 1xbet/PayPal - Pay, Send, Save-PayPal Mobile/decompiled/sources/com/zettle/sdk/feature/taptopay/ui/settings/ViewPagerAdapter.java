package com.zettle.sdk.feature.taptopay.ui.settings;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/settings/ViewPagerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/zettle/sdk/feature/taptopay/ui/settings/ViewPagerAdapter$ViewHolder;", "<init>", "()V", "", "getItemCount", "()I", "Lcom/zettle/sdk/feature/taptopay/ui/settings/SettingsPagerContent;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/feature/taptopay/ui/settings/SettingsPagerContent;", "getHighSpeedVideoFpsRangesFor", "ViewHolder"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ViewPagerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.zettle.sdk.feature.taptopay.ui.settings.ViewPagerAdapter.ViewHolder> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    com.zettle.sdk.feature.taptopay.ui.settings.SettingsPagerContent getHighSpeedVideoFpsRangesFor;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(com.zettle.sdk.feature.taptopay.ui.settings.ViewPagerAdapter.ViewHolder viewHolder, int i) {
        com.zettle.sdk.feature.taptopay.ui.settings.ViewPagerAdapter.ViewHolder viewHolder2 = viewHolder;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewHolder2, "");
        com.zettle.sdk.feature.taptopay.ui.settings.SettingsPagerContent settingsPagerContent = this.getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNull(settingsPagerContent);
        java.lang.String string = viewHolder2.itemView.getContext().getString(settingsPagerContent.getItems().get(i).getText());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        com.zettle.sdk.feature.taptopay.ui.settings.SettingsPagerContent settingsPagerContent2 = this.getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNull(settingsPagerContent2);
        java.lang.Integer image = settingsPagerContent2.getItems().get(i).getImage();
        com.zettle.sdk.feature.taptopay.ui.settings.SettingsPagerContent settingsPagerContent3 = this.getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNull(settingsPagerContent3);
        com.zettle.sdk.common.ui.components.illustration.OttoIllustrationImages illustration = settingsPagerContent3.getItems().get(i).getIllustration();
        if (image != null) {
            viewHolder2.getImage().setImageResource(image.intValue());
        } else if (illustration != null) {
            viewHolder2.getImage().setImageAndStyle(illustration, com.zettle.sdk.common.ui.components.illustration.OttoIllustrationStyles.LILAC);
        }
        viewHolder2.getText().setText(string);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ com.zettle.sdk.feature.taptopay.ui.settings.ViewPagerAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.zettle.sdk.feature.taptopay.ui.R.layout.tap_to_pay_settings_page_content, viewGroup, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "");
        return new com.zettle.sdk.feature.taptopay.ui.settings.ViewPagerAdapter.ViewHolder(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        java.util.List<com.zettle.sdk.feature.taptopay.ui.settings.SettingsPagerItem> items;
        com.zettle.sdk.feature.taptopay.ui.settings.SettingsPagerContent settingsPagerContent = this.getHighSpeedVideoFpsRangesFor;
        if (settingsPagerContent == null || (items = settingsPagerContent.getItems()) == null) {
            return 0;
        }
        return items.size();
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/settings/ViewPagerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustration;", "image", "Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustration;", "getImage", "()Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustration;", "Landroid/widget/TextView;", "text", "Landroid/widget/TextView;", "getText", "()Landroid/widget/TextView;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public static final int $stable = 8;
        private final com.zettle.sdk.common.ui.components.illustration.OttoIllustration image;
        private final android.widget.TextView text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(android.view.View view) {
            super(view);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
            android.view.View findViewById = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.tap_to_pay_settings_fragment_page_content_text);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
            this.text = (android.widget.TextView) findViewById;
            android.view.View findViewById2 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.tap_to_pay_settings_fragment_page_content_image);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
            this.image = (com.zettle.sdk.common.ui.components.illustration.OttoIllustration) findViewById2;
        }

        public final android.widget.TextView getText() {
            return this.text;
        }

        public final com.zettle.sdk.common.ui.components.illustration.OttoIllustration getImage() {
            return this.image;
        }
    }
}
