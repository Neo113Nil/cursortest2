package org.betup.ui.dialogs.offer;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.databinding.FragmentOfferBinding;
import org.betup.model.remote.api.rest.analytics.GetSignatureForOfferInteractor;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.ui.dialogs.OffersDialogFragment;
import org.betup.ui.dialogs.offer.OfferFragment;

/* compiled from: OfferFragment.kt */
@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"org/betup/ui/dialogs/offer/OfferFragment$initLayout$1$onSuccess$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OfferFragment$initLayout$1$onSuccess$1 implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ OfferFragment this$0;

    OfferFragment$initLayout$1$onSuccess$1(OfferFragment offerFragment) {
        this.this$0 = offerFragment;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        FragmentOfferBinding binding;
        FragmentOfferBinding binding2;
        FragmentOfferBinding binding3;
        FragmentOfferBinding binding4;
        FragmentOfferBinding binding5;
        FragmentOfferBinding binding6;
        FragmentOfferBinding binding7;
        FragmentOfferBinding binding8;
        FragmentOfferBinding binding9;
        FragmentOfferBinding binding10;
        FragmentOfferBinding binding11;
        FragmentOfferBinding binding12;
        FragmentOfferBinding binding13;
        FragmentOfferBinding binding14;
        OfferFragment.Builder builder;
        OfferFragment.Builder builder2;
        OfferFragment.Builder builder3;
        OfferFragment.Builder builder4;
        FragmentOfferBinding binding15;
        FragmentOfferBinding binding16;
        FragmentOfferBinding binding17;
        FragmentOfferBinding binding18;
        binding = this.this$0.getBinding();
        binding.offerBgIv.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        float f = 500 * Resources.getSystem().getDisplayMetrics().density;
        binding2 = this.this$0.getBinding();
        float width = binding2.getRoot().getWidth();
        binding3 = this.this$0.getBinding();
        ImageView offerBgIv = binding3.offerBgIv;
        Intrinsics.checkNotNullExpressionValue(offerBgIv, "offerBgIv");
        ViewGroup.LayoutParams layoutParams = offerBgIv.getLayoutParams();
        int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0;
        binding4 = this.this$0.getBinding();
        ImageView offerBgIv2 = binding4.offerBgIv;
        Intrinsics.checkNotNullExpressionValue(offerBgIv2, "offerBgIv");
        float marginEnd = width - (marginStart + (offerBgIv2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) r4).getMarginEnd() : 0));
        binding5 = this.this$0.getBinding();
        float height = binding5.getRoot().getHeight();
        binding6 = this.this$0.getBinding();
        ImageView offerBgIv3 = binding6.offerBgIv;
        Intrinsics.checkNotNullExpressionValue(offerBgIv3, "offerBgIv");
        ViewGroup.LayoutParams layoutParams2 = offerBgIv3.getLayoutParams();
        OfferFragment.Builder builder5 = null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        binding7 = this.this$0.getBinding();
        ImageView offerBgIv4 = binding7.offerBgIv;
        Intrinsics.checkNotNullExpressionValue(offerBgIv4, "offerBgIv");
        ViewGroup.LayoutParams layoutParams3 = offerBgIv4.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i2 = marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0;
        binding8 = this.this$0.getBinding();
        float height2 = height - ((i + i2) + binding8.closeBtnIv.getHeight());
        float f2 = marginEnd / height2;
        binding9 = this.this$0.getBinding();
        float intrinsicWidth = binding9.offerBgIv.getDrawable().getIntrinsicWidth();
        binding10 = this.this$0.getBinding();
        float intrinsicHeight = intrinsicWidth / binding10.offerBgIv.getDrawable().getIntrinsicHeight();
        binding11 = this.this$0.getBinding();
        binding11.offerBgIv.getWidth();
        binding12 = this.this$0.getBinding();
        binding12.offerBgIv.getHeight();
        binding13 = this.this$0.getBinding();
        ViewGroup.LayoutParams layoutParams4 = binding13.offerBgIv.getLayoutParams();
        if (intrinsicHeight > f2) {
            layoutParams4.width = RangesKt.coerceAtMost((int) f, (int) marginEnd);
            layoutParams4.height = (int) (layoutParams4.width / intrinsicHeight);
        } else {
            layoutParams4.height = RangesKt.coerceAtMost((int) f, (int) height2);
            layoutParams4.width = (int) (layoutParams4.height * intrinsicHeight);
        }
        binding14 = this.this$0.getBinding();
        binding14.offerBgIv.setLayoutParams(layoutParams4);
        builder = this.this$0.builder;
        if (builder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("builder");
            builder = null;
        }
        List reversed = CollectionsKt.reversed(builder.getElements());
        ArrayList<OfferItemContent> arrayList = new ArrayList();
        for (Object obj : reversed) {
            if (!(((OfferItemContent) obj) instanceof BetcoinContent)) {
                arrayList.add(obj);
            }
        }
        final OfferFragment offerFragment = this.this$0;
        for (OfferItemContent offerItemContent : arrayList) {
            builder3 = offerFragment.builder;
            if (builder3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("builder");
                builder4 = null;
            } else {
                builder4 = builder3;
            }
            Context requireContext = offerFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            binding15 = offerFragment.getBinding();
            ViewBinding init = offerItemContent.init(builder4, requireContext, binding15.offerBgIv.getId(), 1.0f, 1.0f, new Function0() { // from class: org.betup.ui.dialogs.offer.OfferFragment$initLayout$1$onSuccess$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit onGlobalLayout$lambda$2$lambda$1;
                    onGlobalLayout$lambda$2$lambda$1 = OfferFragment$initLayout$1$onSuccess$1.onGlobalLayout$lambda$2$lambda$1(OfferFragment.this);
                    return onGlobalLayout$lambda$2$lambda$1;
                }
            });
            binding16 = offerFragment.getBinding();
            binding16.getRoot().addView(init.getRoot());
            binding17 = offerFragment.getBinding();
            binding17.getRoot().requestLayout();
            binding18 = offerFragment.getBinding();
            binding18.progress.setVisibility(8);
        }
        builder2 = this.this$0.builder;
        if (builder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("builder");
        } else {
            builder5 = builder2;
        }
        List<OfferItemContent> elements = builder5.getElements();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : elements) {
            if (obj2 instanceof ButtonContent) {
                arrayList2.add(obj2);
            }
        }
        final OfferFragment offerFragment2 = this.this$0;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((ButtonContent) it.next()).initClickListener(new View.OnClickListener() { // from class: org.betup.ui.dialogs.offer.OfferFragment$initLayout$1$onSuccess$1$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OfferFragment$initLayout$1$onSuccess$1.onGlobalLayout$lambda$4$lambda$3(OfferFragment.this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onGlobalLayout$lambda$2$lambda$1(OfferFragment offerFragment) {
        Fragment parentFragment = offerFragment.getParentFragment();
        Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type org.betup.ui.dialogs.OffersDialogFragment");
        ((OffersDialogFragment) parentFragment).dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGlobalLayout$lambda$4$lambda$3(OfferFragment offerFragment, View view) {
        FragmentOfferBinding binding;
        BaseCachedSharedInteractor.OnFetchedListener onFetchedListener;
        OfferFragment.Builder builder;
        binding = offerFragment.getBinding();
        binding.progress.setVisibility(0);
        GetSignatureForOfferInteractor getSignatureForOfferInteractor = offerFragment.getGetSignatureForOfferInteractor();
        onFetchedListener = offerFragment.getSignatureForOfferListener;
        builder = offerFragment.builder;
        if (builder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("builder");
            builder = null;
        }
        getSignatureForOfferInteractor.load(onFetchedListener, builder.getId(), null);
    }
}
