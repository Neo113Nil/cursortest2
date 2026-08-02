package org.betup.ui.dialogs.interstitial.bridge;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.interstitial.InterstitialCampaignDto;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: InterstitialBridgeContext.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialBridgeContext;", "", "campaign", "Lorg/betup/model/remote/entity/interstitial/InterstitialCampaignDto;", "handler", "Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialWebViewBridgeHandler;", "dismissPolicy", "Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialDismissPolicy;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/interstitial/InterstitialCampaignDto;Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialWebViewBridgeHandler;Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialDismissPolicy;)V", "getCampaign", "()Lorg/betup/model/remote/entity/interstitial/InterstitialCampaignDto;", "getHandler", "()Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialWebViewBridgeHandler;", "getDismissPolicy", "()Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialDismissPolicy;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class InterstitialBridgeContext {
    public static final int $stable = 8;
    private final InterstitialCampaignDto campaign;
    private final InterstitialDismissPolicy dismissPolicy;
    private final InterstitialWebViewBridgeHandler handler;

    public static /* synthetic */ InterstitialBridgeContext copy$default(InterstitialBridgeContext interstitialBridgeContext, InterstitialCampaignDto interstitialCampaignDto, InterstitialWebViewBridgeHandler interstitialWebViewBridgeHandler, InterstitialDismissPolicy interstitialDismissPolicy, int i, Object obj) {
        if ((i & 1) != 0) {
            interstitialCampaignDto = interstitialBridgeContext.campaign;
        }
        if ((i & 2) != 0) {
            interstitialWebViewBridgeHandler = interstitialBridgeContext.handler;
        }
        if ((i & 4) != 0) {
            interstitialDismissPolicy = interstitialBridgeContext.dismissPolicy;
        }
        return interstitialBridgeContext.copy(interstitialCampaignDto, interstitialWebViewBridgeHandler, interstitialDismissPolicy);
    }

    /* renamed from: component1, reason: from getter */
    public final InterstitialCampaignDto getCampaign() {
        return this.campaign;
    }

    /* renamed from: component2, reason: from getter */
    public final InterstitialWebViewBridgeHandler getHandler() {
        return this.handler;
    }

    /* renamed from: component3, reason: from getter */
    public final InterstitialDismissPolicy getDismissPolicy() {
        return this.dismissPolicy;
    }

    public final InterstitialBridgeContext copy(InterstitialCampaignDto campaign, InterstitialWebViewBridgeHandler handler, InterstitialDismissPolicy dismissPolicy) {
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(dismissPolicy, "dismissPolicy");
        return new InterstitialBridgeContext(campaign, handler, dismissPolicy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InterstitialBridgeContext)) {
            return false;
        }
        InterstitialBridgeContext interstitialBridgeContext = (InterstitialBridgeContext) other;
        return Intrinsics.areEqual(this.campaign, interstitialBridgeContext.campaign) && Intrinsics.areEqual(this.handler, interstitialBridgeContext.handler) && Intrinsics.areEqual(this.dismissPolicy, interstitialBridgeContext.dismissPolicy);
    }

    public int hashCode() {
        return (((this.campaign.hashCode() * 31) + this.handler.hashCode()) * 31) + this.dismissPolicy.hashCode();
    }

    public String toString() {
        return "InterstitialBridgeContext(campaign=" + this.campaign + ", handler=" + this.handler + ", dismissPolicy=" + this.dismissPolicy + ")";
    }

    public InterstitialBridgeContext(InterstitialCampaignDto campaign, InterstitialWebViewBridgeHandler handler, InterstitialDismissPolicy dismissPolicy) {
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(dismissPolicy, "dismissPolicy");
        this.campaign = campaign;
        this.handler = handler;
        this.dismissPolicy = dismissPolicy;
    }

    public final InterstitialCampaignDto getCampaign() {
        return this.campaign;
    }

    public final InterstitialWebViewBridgeHandler getHandler() {
        return this.handler;
    }

    public final InterstitialDismissPolicy getDismissPolicy() {
        return this.dismissPolicy;
    }
}
