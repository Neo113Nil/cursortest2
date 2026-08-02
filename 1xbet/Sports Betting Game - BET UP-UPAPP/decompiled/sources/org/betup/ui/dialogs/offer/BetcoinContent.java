package org.betup.ui.dialogs.offer;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.viewbinding.ViewBinding;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
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
import org.betup.R;
import org.betup.databinding.OfferBetcoinItemBinding;
import org.betup.model.remote.entity.videoRewards.VideoRewardForPlacementState;
import org.betup.ui.dialogs.offer.OfferFragment;
import org.betup.ui.dialogs.offer.OfferItemContent;
import org.betup.utils.FormatHelper;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OfferFragment.kt */
@SerialName(VideoRewardForPlacementState.BETCOINS_REWARD_OPTION)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000223B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0017J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u001d\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\tHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J%\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0001¢\u0006\u0002\b1R\u001c\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u00020\u00188\u0002@\u0002X\u0083.¢\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\u000e¨\u00064"}, d2 = {"Lorg/betup/ui/dialogs/offer/BetcoinContent;", "Lorg/betup/ui/dialogs/offer/OfferItemContentImpl;", "id", "", "layoutParams", "Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getLayoutParams$annotations", "getLayoutParams", "()Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams;", "viewLayoutId", "getViewLayoutId", "()I", "binding", "Lorg/betup/databinding/OfferBetcoinItemBinding;", "getBinding$annotations", "viewBinding", "Landroidx/viewbinding/ViewBinding;", "context", "Landroid/content/Context;", "bind", "", "builder", "Lorg/betup/ui/dialogs/offer/OfferFragment$Builder;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "$serializer", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes2.dex */
public final /* data */ class BetcoinContent extends OfferItemContentImpl {
    private OfferBetcoinItemBinding binding;
    private final String id;
    private final OfferItemContent.LayoutParams layoutParams;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ BetcoinContent copy$default(BetcoinContent betcoinContent, String str, OfferItemContent.LayoutParams layoutParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = betcoinContent.id;
        }
        if ((i & 2) != 0) {
            layoutParams = betcoinContent.layoutParams;
        }
        return betcoinContent.copy(str, layoutParams);
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

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final OfferItemContent.LayoutParams getLayoutParams() {
        return this.layoutParams;
    }

    public final BetcoinContent copy(String id, OfferItemContent.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        return new BetcoinContent(id, layoutParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetcoinContent)) {
            return false;
        }
        BetcoinContent betcoinContent = (BetcoinContent) other;
        return Intrinsics.areEqual(this.id, betcoinContent.id) && Intrinsics.areEqual(this.layoutParams, betcoinContent.layoutParams);
    }

    @Override // org.betup.ui.dialogs.offer.OfferItemContent
    public int getViewLayoutId() {
        return R.layout.offer_betcoin_item;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.layoutParams.hashCode();
    }

    public String toString() {
        return "BetcoinContent(id=" + this.id + ", layoutParams=" + this.layoutParams + ")";
    }

    /* compiled from: OfferFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lorg/betup/ui/dialogs/offer/BetcoinContent$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/betup/ui/dialogs/offer/BetcoinContent;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BetcoinContent> serializer() {
            return BetcoinContent$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BetcoinContent(int i, String str, OfferItemContent.LayoutParams layoutParams, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, BetcoinContent$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.layoutParams = layoutParams;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_release(BetcoinContent self, CompositeEncoder output, SerialDescriptor serialDesc) {
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
    public BetcoinContent(String id, OfferItemContent.LayoutParams layoutParams) {
        super(null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        this.id = id;
        this.layoutParams = layoutParams;
    }

    @Override // org.betup.ui.dialogs.offer.OfferItemContent
    public ViewBinding viewBinding(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        OfferBetcoinItemBinding inflate = OfferBetcoinItemBinding.inflate(LayoutInflater.from(context));
        this.binding = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        return inflate;
    }

    @Override // org.betup.ui.dialogs.offer.OfferItemContent
    public void bind(OfferFragment.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        OfferBetcoinItemBinding offerBetcoinItemBinding = this.binding;
        if (offerBetcoinItemBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            offerBetcoinItemBinding = null;
        }
        offerBetcoinItemBinding.betcoinTv.setText(FormatHelper.getShopBetcoinsFormated(builder.getBetcoins()));
    }
}
