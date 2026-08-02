package com.paypal.oslo.feature.p2p.ui.interstitial.events;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/events/InterstitialEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initialize", "PrimaryButtonClicked", "SecondaryButtonClicked", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/events/InterstitialEvent$Initialize;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/events/InterstitialEvent$PrimaryButtonClicked;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/events/InterstitialEvent$SecondaryButtonClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class InterstitialEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private InterstitialEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJZ\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0013R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b.\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/events/InterstitialEvent$Initialize;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/events/InterstitialEvent;", "", "title", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialBodyContent;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialBulletPointModel;", "bulletPoints", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialButtonModel;", "primaryButton", "secondaryButton", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialImageSource;", "image", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialBodyContent;Ljava/util/List;Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialButtonModel;Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialButtonModel;Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialImageSource;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialBodyContent;", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialButtonModel;", "component5", "component6", "()Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialImageSource;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialBodyContent;Ljava/util/List;Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialButtonModel;Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialButtonModel;Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialImageSource;)Lcom/paypal/oslo/feature/p2p/ui/interstitial/events/InterstitialEvent$Initialize;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialBodyContent;", "getBody", "Ljava/util/List;", "getBulletPoints", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialButtonModel;", "getPrimaryButton", "getSecondaryButton", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialImageSource;", "getImage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent body;
        private final java.util.List<com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel> bulletPoints;
        private final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource image;
        private final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel primaryButton;
        private final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel secondaryButton;
        private final java.lang.String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initialize(java.lang.String str, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent interstitialBodyContent, java.util.List<com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel> list, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel interstitialButtonModel, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel interstitialButtonModel2, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource interstitialImageSource) {
            super("Initialize", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.title = str;
            this.body = interstitialBodyContent;
            this.bulletPoints = list;
            this.primaryButton = interstitialButtonModel;
            this.secondaryButton = interstitialButtonModel2;
            this.image = interstitialImageSource;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent getBody() {
            return this.body;
        }

        public /* synthetic */ Initialize(java.lang.String str, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent interstitialBodyContent, java.util.List list, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel interstitialButtonModel, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel interstitialButtonModel2, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource interstitialImageSource, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : interstitialBodyContent, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : interstitialButtonModel, (i & 16) != 0 ? null : interstitialButtonModel2, (i & 32) == 0 ? interstitialImageSource : null);
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel> getBulletPoints() {
            return this.bulletPoints;
        }

        public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel getPrimaryButton() {
            return this.primaryButton;
        }

        public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel getSecondaryButton() {
            return this.secondaryButton;
        }

        public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource getImage() {
            return this.image;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.title;
            com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent interstitialBodyContent = this.body;
            java.util.List<com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel> list = this.bulletPoints;
            com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel interstitialButtonModel = this.primaryButton;
            com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel interstitialButtonModel2 = this.secondaryButton;
            com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource interstitialImageSource = this.image;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialize(title=");
            sb.append(str);
            sb.append(", body=");
            sb.append(interstitialBodyContent);
            sb.append(", bulletPoints=");
            sb.append(list);
            sb.append(", primaryButton=");
            sb.append(interstitialButtonModel);
            sb.append(", secondaryButton=");
            sb.append(interstitialButtonModel2);
            sb.append(", image=");
            sb.append(interstitialImageSource);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode();
            com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent interstitialBodyContent = this.body;
            int hashCode2 = interstitialBodyContent == null ? 0 : interstitialBodyContent.hashCode();
            int hashCode3 = this.bulletPoints.hashCode();
            com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel interstitialButtonModel = this.primaryButton;
            int hashCode4 = interstitialButtonModel == null ? 0 : interstitialButtonModel.hashCode();
            com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel interstitialButtonModel2 = this.secondaryButton;
            int hashCode5 = interstitialButtonModel2 == null ? 0 : interstitialButtonModel2.hashCode();
            com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource interstitialImageSource = this.image;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (interstitialImageSource != null ? interstitialImageSource.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.Initialize)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.Initialize initialize = (com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.Initialize) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.title, initialize.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.body, initialize.body) && kotlin.jvm.internal.Intrinsics.areEqual(this.bulletPoints, initialize.bulletPoints) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryButton, initialize.primaryButton) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryButton, initialize.secondaryButton) && kotlin.jvm.internal.Intrinsics.areEqual(this.image, initialize.image);
        }

        public final com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.Initialize copy(java.lang.String title, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent body, java.util.List<com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel> bulletPoints, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel primaryButton, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel secondaryButton, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource image) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulletPoints, "");
            return new com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.Initialize(title, body, bulletPoints, primaryButton, secondaryButton, image);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource getImage() {
            return this.image;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel getSecondaryButton() {
            return this.secondaryButton;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel getPrimaryButton() {
            return this.primaryButton;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel> component3() {
            return this.bulletPoints;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent getBody() {
            return this.body;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.Initialize copy$default(com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.Initialize initialize, java.lang.String str, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent interstitialBodyContent, java.util.List list, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel interstitialButtonModel, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel interstitialButtonModel2, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource interstitialImageSource, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = initialize.title;
            }
            if ((i & 2) != 0) {
                interstitialBodyContent = initialize.body;
            }
            com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent interstitialBodyContent2 = interstitialBodyContent;
            if ((i & 4) != 0) {
                list = initialize.bulletPoints;
            }
            java.util.List list2 = list;
            if ((i & 8) != 0) {
                interstitialButtonModel = initialize.primaryButton;
            }
            com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel interstitialButtonModel3 = interstitialButtonModel;
            if ((i & 16) != 0) {
                interstitialButtonModel2 = initialize.secondaryButton;
            }
            com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel interstitialButtonModel4 = interstitialButtonModel2;
            if ((i & 32) != 0) {
                interstitialImageSource = initialize.image;
            }
            return initialize.copy(str, interstitialBodyContent2, list2, interstitialButtonModel3, interstitialButtonModel4, interstitialImageSource);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/events/InterstitialEvent$PrimaryButtonClicked;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/events/InterstitialEvent;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;", "action", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;", "copy", "(Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;)Lcom/paypal/oslo/feature/p2p/ui/interstitial/events/InterstitialEvent$PrimaryButtonClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;", "getAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrimaryButtonClicked extends com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrimaryButtonClicked(com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction interstitialAction) {
            super("PrimaryButtonClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interstitialAction, "");
            this.action = interstitialAction;
        }

        public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction getAction() {
            return this.action;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction interstitialAction = this.action;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PrimaryButtonClicked(action=");
            sb.append(interstitialAction);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.action.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.PrimaryButtonClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, ((com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.PrimaryButtonClicked) other).action);
        }

        public final com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.PrimaryButtonClicked copy(com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction action) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            return new com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.PrimaryButtonClicked(action);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction getAction() {
            return this.action;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.PrimaryButtonClicked copy$default(com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.PrimaryButtonClicked primaryButtonClicked, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction interstitialAction, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                interstitialAction = primaryButtonClicked.action;
            }
            return primaryButtonClicked.copy(interstitialAction);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/events/InterstitialEvent$SecondaryButtonClicked;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/events/InterstitialEvent;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;", "action", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;", "copy", "(Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;)Lcom/paypal/oslo/feature/p2p/ui/interstitial/events/InterstitialEvent$SecondaryButtonClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;", "getAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SecondaryButtonClicked extends com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SecondaryButtonClicked(com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction interstitialAction) {
            super("SecondaryButtonClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interstitialAction, "");
            this.action = interstitialAction;
        }

        public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction getAction() {
            return this.action;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction interstitialAction = this.action;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SecondaryButtonClicked(action=");
            sb.append(interstitialAction);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.action.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.SecondaryButtonClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, ((com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.SecondaryButtonClicked) other).action);
        }

        public final com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.SecondaryButtonClicked copy(com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction action) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            return new com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.SecondaryButtonClicked(action);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction getAction() {
            return this.action;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.SecondaryButtonClicked copy$default(com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.SecondaryButtonClicked secondaryButtonClicked, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction interstitialAction, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                interstitialAction = secondaryButtonClicked.action;
            }
            return secondaryButtonClicked.copy(interstitialAction);
        }
    }

    public /* synthetic */ InterstitialEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
