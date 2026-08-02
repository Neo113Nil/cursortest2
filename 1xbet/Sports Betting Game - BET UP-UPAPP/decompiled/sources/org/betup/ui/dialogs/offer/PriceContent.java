package org.betup.ui.dialogs.offer;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import com.android.billingclient.api.ProductDetails;
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
import org.betup.databinding.OfferPriceItemBinding;
import org.betup.services.billing.BillingService;
import org.betup.services.billing.ProductDetailsPrice;
import org.betup.ui.dialogs.offer.OfferFragment;
import org.betup.ui.dialogs.offer.OfferItemContent;
import org.betup.utils.BillingServiceUtilsKt;
import org.betup.utils.PriceFormatUtils;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OfferFragment.kt */
@SerialName("Price")
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0002DEB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0017J\u001e\u00100\u001a\u00020-2\u0014\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000203\u0018\u000102H\u0017J\t\u00104\u001a\u00020\u0004HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\u001d\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u00020\nHÖ\u0001J\t\u0010<\u001a\u00020\u0004HÖ\u0001J%\u0010=\u001a\u00020-2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0001¢\u0006\u0002\bCR\u001c\u0010\u0003\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u00020 8\u0002@\u0002X\u0083.¢\u0006\b\n\u0000\u0012\u0004\b!\u0010\u000fR\u0018\u0010\"\u001a\u00020#8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b$\u0010\u000fR\u0018\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0083.¢\u0006\b\n\u0000\u0012\u0004\b&\u0010\u000fR\u0018\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0083.¢\u0006\b\n\u0000\u0012\u0004\b(\u0010\u000f¨\u0006F"}, d2 = {"Lorg/betup/ui/dialogs/offer/PriceContent;", "Lorg/betup/ui/dialogs/offer/OfferItemContentImpl;", "Lorg/betup/services/billing/BillingService$DetailsGotListener;", "id", "", "layoutParams", "Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getLayoutParams$annotations", "getLayoutParams", "()Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams;", "viewLayoutId", "getViewLayoutId", "()I", "billingService", "Lorg/betup/services/billing/BillingService;", "getBillingService$annotations", "getBillingService", "()Lorg/betup/services/billing/BillingService;", "setBillingService", "(Lorg/betup/services/billing/BillingService;)V", "binding", "Lorg/betup/databinding/OfferPriceItemBinding;", "getBinding$annotations", "expiresAt", "", "getExpiresAt$annotations", "oldStoreCode", "getOldStoreCode$annotations", "newStoreCode", "getNewStoreCode$annotations", "viewBinding", "context", "Landroid/content/Context;", "bind", "", "builder", "Lorg/betup/ui/dialogs/offer/OfferFragment$Builder;", "detailsGot", "details", "", "Lcom/android/billingclient/api/ProductDetails;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "$serializer", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes2.dex */
public final /* data */ class PriceContent extends OfferItemContentImpl implements BillingService.DetailsGotListener {

    @Inject
    public BillingService billingService;
    private OfferPriceItemBinding binding;
    private long expiresAt;
    private final String id;
    private final OfferItemContent.LayoutParams layoutParams;
    private String newStoreCode;
    private String oldStoreCode;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ PriceContent copy$default(PriceContent priceContent, String str, OfferItemContent.LayoutParams layoutParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = priceContent.id;
        }
        if ((i & 2) != 0) {
            layoutParams = priceContent.layoutParams;
        }
        return priceContent.copy(str, layoutParams);
    }

    @Transient
    public static /* synthetic */ void getBillingService$annotations() {
    }

    @Transient
    private static /* synthetic */ void getBinding$annotations() {
    }

    @Transient
    private static /* synthetic */ void getExpiresAt$annotations() {
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

    @Transient
    private static /* synthetic */ void getOldStoreCode$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final OfferItemContent.LayoutParams getLayoutParams() {
        return this.layoutParams;
    }

    public final PriceContent copy(String id, OfferItemContent.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        return new PriceContent(id, layoutParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceContent)) {
            return false;
        }
        PriceContent priceContent = (PriceContent) other;
        return Intrinsics.areEqual(this.id, priceContent.id) && Intrinsics.areEqual(this.layoutParams, priceContent.layoutParams);
    }

    @Override // org.betup.ui.dialogs.offer.OfferItemContent
    public int getViewLayoutId() {
        return R.layout.offer_price_item;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.layoutParams.hashCode();
    }

    public String toString() {
        return "PriceContent(id=" + this.id + ", layoutParams=" + this.layoutParams + ")";
    }

    /* compiled from: OfferFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lorg/betup/ui/dialogs/offer/PriceContent$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/betup/ui/dialogs/offer/PriceContent;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PriceContent> serializer() {
            return PriceContent$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PriceContent(int i, String str, OfferItemContent.LayoutParams layoutParams, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, PriceContent$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.layoutParams = layoutParams;
        this.expiresAt = 0L;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_release(PriceContent self, CompositeEncoder output, SerialDescriptor serialDesc) {
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
    public PriceContent(String id, OfferItemContent.LayoutParams layoutParams) {
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
    public OfferPriceItemBinding viewBinding(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        OfferPriceItemBinding inflate = OfferPriceItemBinding.inflate(LayoutInflater.from(context));
        this.binding = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        Context applicationContext = inflate.getRoot().getContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        OfferPriceItemBinding offerPriceItemBinding = this.binding;
        if (offerPriceItemBinding != null) {
            return offerPriceItemBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    @Override // org.betup.ui.dialogs.offer.OfferItemContent
    public void bind(OfferFragment.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.oldStoreCode = builder.getOldStoreCode();
        this.newStoreCode = builder.getNewStoreCode();
        this.expiresAt = builder.getExpiresAt();
        getBillingService().getProductDetails(CollectionsKt.listOf((Object[]) new String[]{builder.getOldStoreCode(), builder.getNewStoreCode()}), this);
    }

    @Override // org.betup.services.billing.BillingService.DetailsGotListener
    public void detailsGot(Map<String, ProductDetails> details) {
        try {
            Log.d("OFFERS", "PriceContent.detailsGot called with details: " + details);
            String str = this.newStoreCode;
            OfferPriceItemBinding offerPriceItemBinding = null;
            String str2 = null;
            String str3 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newStoreCode");
                str = null;
            }
            String str4 = this.oldStoreCode;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oldStoreCode");
                str4 = null;
            }
            Log.d("OFFERS", "newStoreCode: " + str + ", oldStoreCode: " + str4);
            if (BillingServiceUtilsKt.isOfferExpired(Long.valueOf(this.expiresAt)) || details == null || details.isEmpty()) {
                Log.d("OFFER", "Offer expired or details empty, dismissing dialog");
                getOnDismissDialog().invoke();
                return;
            }
            String str5 = this.newStoreCode;
            if (str5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newStoreCode");
                str5 = null;
            }
            ProductDetails productDetails = details.get(str5);
            if (productDetails == null) {
                String str6 = this.newStoreCode;
                if (str6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("newStoreCode");
                } else {
                    str2 = str6;
                }
                Log.w("OFFERS", "ProductDetails not found for newStoreCode: " + str2);
                Log.d("OFFERS", "Available keys in details: " + details.keySet());
                return;
            }
            String str7 = this.oldStoreCode;
            if (str7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oldStoreCode");
                str7 = null;
            }
            ProductDetails productDetails2 = details.get(str7);
            if (productDetails2 == null) {
                String str8 = this.oldStoreCode;
                if (str8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("oldStoreCode");
                } else {
                    str3 = str8;
                }
                Log.w("OFFERS", "ProductDetails not found for oldStoreCode: " + str3);
                Log.d("OFFERS", "Available keys in details: " + details.keySet());
                return;
            }
            long priceAmountMicros = ProductDetailsPrice.priceAmountMicros(productDetails2);
            long priceAmountMicros2 = ProductDetailsPrice.priceAmountMicros(productDetails);
            OfferPriceItemBinding offerPriceItemBinding2 = this.binding;
            if (offerPriceItemBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                offerPriceItemBinding = offerPriceItemBinding2;
            }
            offerPriceItemBinding.priceTv.setText(PriceFormatUtils.INSTANCE.formatPriceWithCurrencySymbol(priceAmountMicros, ProductDetailsPrice.priceCurrencyCode(productDetails2)));
            int i = (int) ((1.0d - (priceAmountMicros2 / priceAmountMicros)) * 100);
            offerPriceItemBinding.discountTv.setText("-" + i + "%");
            Log.d("OFFERS", "Successfully updated price display - old price: " + ProductDetailsPrice.formattedPrice(productDetails2) + ", discount: -" + i + "%");
        } catch (Exception e) {
            Log.e("OFFERS", "Failed to get product details", e);
        }
    }
}
