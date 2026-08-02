package org.betup.ui.dialogs;

import android.util.Log;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.betup.model.remote.entity.shop.ShopItemModel;
import org.betup.services.billing.PurchaseConfirmationListener;
import org.betup.ui.dialogs.UnlockBetGroupsDialogFragment;

/* compiled from: UnlockBetGroupsDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class UnlockBetGroupsDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $userLevel;
    final /* synthetic */ UnlockBetGroupsDialogFragment this$0;

    UnlockBetGroupsDialogFragment$onCreateView$1$1(UnlockBetGroupsDialogFragment unlockBetGroupsDialogFragment, int i) {
        this.this$0 = unlockBetGroupsDialogFragment;
        this.$userLevel = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ShopItemModel shopItemModel;
        boolean z;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(120376421, i, -1, "org.betup.ui.dialogs.UnlockBetGroupsDialogFragment.onCreateView.<anonymous>.<anonymous> (UnlockBetGroupsDialogFragment.kt:91)");
        }
        shopItemModel = this.this$0.unlockShopItemModel;
        z = this.this$0.videoAvailable;
        int i2 = this.$userLevel;
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final UnlockBetGroupsDialogFragment unlockBetGroupsDialogFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.UnlockBetGroupsDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = UnlockBetGroupsDialogFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(UnlockBetGroupsDialogFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final UnlockBetGroupsDialogFragment unlockBetGroupsDialogFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.UnlockBetGroupsDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = UnlockBetGroupsDialogFragment$onCreateView$1$1.invoke$lambda$3$lambda$2(UnlockBetGroupsDialogFragment.this);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function0 function02 = (Function0) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(this.this$0);
        final UnlockBetGroupsDialogFragment unlockBetGroupsDialogFragment3 = this.this$0;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: org.betup.ui.dialogs.UnlockBetGroupsDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = UnlockBetGroupsDialogFragment$onCreateView$1$1.invoke$lambda$5$lambda$4(UnlockBetGroupsDialogFragment.this);
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        UnlockBetGroupsDialogFragmentKt.UnlockBetGroupsContent(shopItemModel, z, i2, function0, function02, (Function0) rememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(UnlockBetGroupsDialogFragment unlockBetGroupsDialogFragment) {
        PurchaseConfirmationListener purchaseConfirmationListener;
        ShopItemModel shopItemModel;
        ShopItemModel shopItemModel2;
        String storeCode;
        try {
            unlockBetGroupsDialogFragment.userDecision = UnlockBetGroupsDialogFragment.UserDecision.Purchase;
            purchaseConfirmationListener = unlockBetGroupsDialogFragment.listener;
            if (purchaseConfirmationListener != null) {
                shopItemModel = unlockBetGroupsDialogFragment.unlockShopItemModel;
                if (shopItemModel == null || (storeCode = shopItemModel.getStoreCode()) == null) {
                    shopItemModel2 = unlockBetGroupsDialogFragment.unlockShopItemModel;
                    storeCode = shopItemModel2 != null ? shopItemModel2.getStoreCode() : null;
                    if (storeCode == null) {
                        storeCode = "";
                    }
                }
                purchaseConfirmationListener.onPurchaseConfirmed(storeCode);
            }
            unlockBetGroupsDialogFragment.dismiss();
        } catch (Exception e) {
            Log.e("UnlockBetGroupsDialog", "Failed to process purchase", e);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(UnlockBetGroupsDialogFragment unlockBetGroupsDialogFragment) {
        PurchaseConfirmationListener purchaseConfirmationListener;
        try {
            unlockBetGroupsDialogFragment.userDecision = UnlockBetGroupsDialogFragment.UserDecision.Video;
            unlockBetGroupsDialogFragment.dismiss();
            purchaseConfirmationListener = unlockBetGroupsDialogFragment.listener;
            if (purchaseConfirmationListener != null) {
                purchaseConfirmationListener.onVideoConfirmed();
            }
        } catch (Exception e) {
            Log.e("UnlockBetGroupsDialog", "Failed to process video reward", e);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(UnlockBetGroupsDialogFragment unlockBetGroupsDialogFragment) {
        unlockBetGroupsDialogFragment.userDecision = UnlockBetGroupsDialogFragment.UserDecision.Cancel;
        unlockBetGroupsDialogFragment.dismiss();
        return Unit.INSTANCE;
    }
}
