package org.betup.ui.dialogs.offer;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.android.billingclient.api.ProductDetails;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.databinding.OfferButtonItemBinding;
import org.betup.services.billing.BillingService;
import org.betup.services.billing.ProductDetailsPrice;
import org.betup.ui.dialogs.offer.OfferFragment;
import org.betup.ui.dialogs.offer.OfferItemContent;
import org.betup.utils.PriceFormatUtils;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OfferFragment.kt */
@SerialName("Button")
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0002CDB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\u000e\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020.J\u001e\u0010/\u001a\u00020)2\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000202\u0018\u000101H\u0017J\t\u00103\u001a\u00020\u0004HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\u001d\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\nHÖ\u0001J\t\u0010;\u001a\u00020\u0004HÖ\u0001J%\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0001¢\u0006\u0002\bBR\u001c\u0010\u0003\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u00020\u00198\u0002@\u0002X\u0083.¢\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u000fR$\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0018\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0083.¢\u0006\b\n\u0000\u0012\u0004\b#\u0010\u000f¨\u0006E"}, d2 = {"Lorg/betup/ui/dialogs/offer/ButtonContent;", "Lorg/betup/ui/dialogs/offer/OfferItemContentImpl;", "Lorg/betup/services/billing/BillingService$DetailsGotListener;", "id", "", "layoutParams", "Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getLayoutParams$annotations", "getLayoutParams", "()Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams;", "viewLayoutId", "getViewLayoutId", "()I", "binding", "Lorg/betup/databinding/OfferButtonItemBinding;", "getBinding$annotations", "billingService", "Lorg/betup/services/billing/BillingService;", "getBillingService$annotations", "getBillingService", "()Lorg/betup/services/billing/BillingService;", "setBillingService", "(Lorg/betup/services/billing/BillingService;)V", "newStoreCode", "getNewStoreCode$annotations", "viewBinding", "Landroidx/viewbinding/ViewBinding;", "context", "Landroid/content/Context;", "bind", "", "builder", "Lorg/betup/ui/dialogs/offer/OfferFragment$Builder;", "initClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "detailsGot", "details", "", "Lcom/android/billingclient/api/ProductDetails;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "$serializer", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes2.dex */
public final /* data */ class ButtonContent extends OfferItemContentImpl implements BillingService.DetailsGotListener {

    @Inject
    public BillingService billingService;
    private OfferButtonItemBinding binding;
    private final String id;
    private final OfferItemContent.LayoutParams layoutParams;
    private String newStoreCode;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ ButtonContent copy$default(ButtonContent buttonContent, String str, OfferItemContent.LayoutParams layoutParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buttonContent.id;
        }
        if ((i & 2) != 0) {
            layoutParams = buttonContent.layoutParams;
        }
        return buttonContent.copy(str, layoutParams);
    }

    @Transient
    public static /* synthetic */ void getBillingService$annotations() {
    }

    @Transient
    private static /* synthetic */ void getBinding$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("layoutParams")
    public static /* synthetic */ void getLayoutParams$annotations() {
    }

    @Transient
    private static /* synthetic */ void getNewStoreCode$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final OfferItemContent.LayoutParams getLayoutParams() {
        return this.layoutParams;
    }

    public final ButtonContent copy(String id, OfferItemContent.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        return new ButtonContent(id, layoutParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonContent)) {
            return false;
        }
        ButtonContent buttonContent = (ButtonContent) other;
        return Intrinsics.areEqual(this.id, buttonContent.id) && Intrinsics.areEqual(this.layoutParams, buttonContent.layoutParams);
    }

    @Override // org.betup.ui.dialogs.offer.OfferItemContent
    public int getViewLayoutId() {
        return R.layout.offer_button_item;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.layoutParams.hashCode();
    }

    public String toString() {
        return "ButtonContent(id=" + this.id + ", layoutParams=" + this.layoutParams + ")";
    }

    /* compiled from: OfferFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lorg/betup/ui/dialogs/offer/ButtonContent$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/betup/ui/dialogs/offer/ButtonContent;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ButtonContent> serializer() {
            return ButtonContent$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ButtonContent(int i, String str, OfferItemContent.LayoutParams layoutParams, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ButtonContent$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.layoutParams = layoutParams;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_release(ButtonContent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.getId());
        output.encodeSerializableElement(serialDesc, 1, OfferItemContent$LayoutParams$$serializer.INSTANCE, self.getLayoutParams());
    }

    @Override // org.betup.ui.dialogs.offer.OfferItemContent
    public String getId() {
        return this.id;
    }

    @Override // org.betup.ui.dialogs.offer.OfferItemContent
    public OfferItemContent.LayoutParams getLayoutParams() {
        return this.layoutParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonContent(String id, OfferItemContent.LayoutParams layoutParams) {
        super(null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        this.id = id;
        this.layoutParams = layoutParams;
    }

    public final BillingService getBillingService() {
        BillingService billingService = this.billingService;
        if (billingService != null) {
            return billingService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("billingService");
        return null;
    }

    public final void setBillingService(BillingService billingService) {
        Intrinsics.checkNotNullParameter(billingService, "<set-?>");
        this.billingService = billingService;
    }

    @Override // org.betup.ui.dialogs.offer.OfferItemContent
    public ViewBinding viewBinding(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        OfferButtonItemBinding inflate = OfferButtonItemBinding.inflate(LayoutInflater.from(context));
        this.binding = inflate;
        OfferButtonItemBinding offerButtonItemBinding = null;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        Context applicationContext = inflate.getRoot().getContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        OfferButtonItemBinding offerButtonItemBinding2 = this.binding;
        if (offerButtonItemBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            offerButtonItemBinding = offerButtonItemBinding2;
        }
        return offerButtonItemBinding;
    }

    @Override // org.betup.ui.dialogs.offer.OfferItemContent
    public void bind(OfferFragment.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.newStoreCode = builder.getNewStoreCode();
        getBillingService().getProductDetails(CollectionsKt.listOf((Object[]) new String[]{builder.getOldStoreCode(), builder.getNewStoreCode()}), this);
    }

    public final void initClickListener(View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        OfferButtonItemBinding offerButtonItemBinding = this.binding;
        if (offerButtonItemBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            offerButtonItemBinding = null;
        }
        offerButtonItemBinding.getRoot().setOnClickListener(listener);
    }

    @Override // org.betup.services.billing.BillingService.DetailsGotListener
    public void detailsGot(Map<String, ProductDetails> details) {
        try {
            Log.d("OFFERS", "ButtonContent.detailsGot called with details: " + details);
            String str = this.newStoreCode;
            OfferButtonItemBinding offerButtonItemBinding = null;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newStoreCode");
                str = null;
            }
            Log.d("OFFERS", "newStoreCode: " + str);
            if (details == null) {
                Log.w("OFFERS", "Details map is null, cannot update button price");
                return;
            }
            String str3 = this.newStoreCode;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newStoreCode");
                str3 = null;
            }
            ProductDetails productDetails = details.get(str3);
            if (productDetails == null) {
                String str4 = this.newStoreCode;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("newStoreCode");
                } else {
                    str2 = str4;
                }
                Log.w("OFFERS", "ProductDetails not found for newStoreCode: " + str2);
                Log.d("OFFERS", "Available keys in details: " + details.keySet());
                return;
            }
            OfferButtonItemBinding offerButtonItemBinding2 = this.binding;
            if (offerButtonItemBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                offerButtonItemBinding = offerButtonItemBinding2;
            }
            offerButtonItemBinding.btnTv.setText(PriceFormatUtils.INSTANCE.formatPriceWithCurrencySymbol(ProductDetailsPrice.priceAmountMicros(productDetails), ProductDetailsPrice.priceCurrencyCode(productDetails)));
            Log.d("OFFERS", "Successfully updated button price to: " + ProductDetailsPrice.formattedPrice(productDetails));
        } catch (Exception e) {
            Log.e("OFFERS", "Failed to get product details", e);
        }
    }
}
