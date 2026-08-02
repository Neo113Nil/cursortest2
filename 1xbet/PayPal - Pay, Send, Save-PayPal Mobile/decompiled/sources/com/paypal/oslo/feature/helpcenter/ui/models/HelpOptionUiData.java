package com.paypal.oslo.feature.helpcenter.ui.models;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\u0015\u0016\u0017\u0018\u0019\u001aB/\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0001\u0006\u001b\u001c\u001d\u001e\u001f "}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/models/HelpOptionUiData;", "", "", "p0", "p1", "Lkotlin/Function1;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "title", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "iconUrl", "getIconUrl", "onClick", "Lkotlin/jvm/functions/Function1;", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "BrowseAllTopics", "ResolutionCenter", "ContactUs", "CallUs", "ChatUs", "HelpCenter", "Lcom/paypal/oslo/feature/helpcenter/ui/models/HelpOptionUiData$BrowseAllTopics;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/HelpOptionUiData$CallUs;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/HelpOptionUiData$ChatUs;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/HelpOptionUiData$ContactUs;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/HelpOptionUiData$HelpCenter;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/HelpOptionUiData$ResolutionCenter;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class HelpOptionUiData {
    public static final int $stable = 0;
    private final java.lang.String iconUrl;
    private final kotlin.jvm.functions.Function1<com.paypal.oslo.core.navigation.AppNavigator, kotlin.Unit> onClick;
    private final java.lang.String title;

    /* JADX WARN: Multi-variable type inference failed */
    private HelpOptionUiData(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.navigation.AppNavigator, kotlin.Unit> function1) {
        this.title = str;
        this.iconUrl = str2;
        this.onClick = function1;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getIconUrl() {
        return this.iconUrl;
    }

    public /* synthetic */ HelpOptionUiData(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.$r8$lambda$zDHFhFhiqvNsbyp6Fbu8i9HMT3M((com.paypal.oslo.core.navigation.AppNavigator) obj);
            }
        } : function1, null);
    }

    public final kotlin.jvm.functions.Function1<com.paypal.oslo.core.navigation.AppNavigator, kotlin.Unit> getOnClick() {
        return this.onClick;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/models/HelpOptionUiData$BrowseAllTopics;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/HelpOptionUiData;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BrowseAllTopics extends com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.BrowseAllTopics INSTANCE = new com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.BrowseAllTopics();

        public final int hashCode() {
            return 435059218;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private BrowseAllTopics() {
            super(r3, "https://www.paypalobjects.com/helpcenter/images/241211.jpg", new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData$BrowseAllTopics$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.BrowseAllTopics.$r8$lambda$b9o7RxmflEVJmuRf7CSXX2LDEM8((com.paypal.oslo.core.navigation.AppNavigator) obj);
                }
            }, null);
            java.lang.String str = "Browse All Topics";
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$b9o7RxmflEVJmuRf7CSXX2LDEM8(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData$BrowseAllTopics$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.BrowseAllTopics.$r8$lambda$wV5kWQjUdinWMUMnLsNxwbWy_VU((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$wV5kWQjUdinWMUMnLsNxwbWy_VU(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterTopicsDestination.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }

        public final java.lang.String toString() {
            return "BrowseAllTopics";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.BrowseAllTopics)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/models/HelpOptionUiData$ResolutionCenter;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/HelpOptionUiData;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ResolutionCenter extends com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.ResolutionCenter INSTANCE = new com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.ResolutionCenter();

        public final int hashCode() {
            return 299165610;
        }

        private ResolutionCenter() {
            super("Resolution Center", "https://www.paypalobjects.com/helpcenter/images/Res_29.jpg", null, 4, null);
        }

        public final java.lang.String toString() {
            return "ResolutionCenter";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.ResolutionCenter)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/models/HelpOptionUiData$ContactUs;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/HelpOptionUiData;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContactUs extends com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.ContactUs INSTANCE = new com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.ContactUs();

        public final int hashCode() {
            return 990394229;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private ContactUs() {
            super(r3, "https://www.paypalobjects.com/helpcenter/images/1369.jpg", new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData$ContactUs$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.ContactUs.m14809$r8$lambda$0SPfxEoMBnHxDnlXcJ7ouCqmpc((com.paypal.oslo.core.navigation.AppNavigator) obj);
                }
            }, null);
            java.lang.String str = "Contact PayPal Support";
        }

        /* renamed from: $r8$lambda$0SPfxEoMBnHxDnlXcJ7ouCqmp-c, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m14809$r8$lambda$0SPfxEoMBnHxDnlXcJ7ouCqmpc(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData$ContactUs$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.ContactUs.$r8$lambda$GlgXdJEGchP8tvd7QnAfivNzy_Q((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$GlgXdJEGchP8tvd7QnAfivNzy_Q(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterContactUsDestination.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }

        public final java.lang.String toString() {
            return "ContactUs";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.ContactUs)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/models/HelpOptionUiData$CallUs;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/HelpOptionUiData;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CallUs extends com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.CallUs INSTANCE = new com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.CallUs();

        public final int hashCode() {
            return -79137691;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private CallUs() {
            super(r3, "https://www.paypalobjects.com/helpcenter/images/1064.jpg", new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData$CallUs$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.CallUs.$r8$lambda$uP8Ja7LfRv23eGMKn3QZxU3hdds((com.paypal.oslo.core.navigation.AppNavigator) obj);
                }
            }, null);
            java.lang.String str = "Call us";
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$Jrq9exTIkxjaWv3PICiZhLdpK5g(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterCallUsDestination.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$uP8Ja7LfRv23eGMKn3QZxU3hdds(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData$CallUs$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.CallUs.$r8$lambda$Jrq9exTIkxjaWv3PICiZhLdpK5g((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        public final java.lang.String toString() {
            return "CallUs";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.CallUs)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/models/HelpOptionUiData$ChatUs;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/HelpOptionUiData;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChatUs extends com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.ChatUs INSTANCE = new com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.ChatUs();

        public final int hashCode() {
            return -72993057;
        }

        private ChatUs() {
            super("Chat with us", "https://www.paypalobjects.com/helpcenter/images/2115.jpg", null, 4, null);
        }

        public final java.lang.String toString() {
            return "ChatUs";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.ChatUs)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/models/HelpOptionUiData$HelpCenter;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/HelpOptionUiData;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HelpCenter extends com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.HelpCenter INSTANCE = new com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.HelpCenter();

        public final int hashCode() {
            return 1246680383;
        }

        private HelpCenter() {
            super("Help Center", "https://www.paypalobjects.com/helpcenter/images/0976.jpg", null, 4, null);
        }

        public final java.lang.String toString() {
            return "HelpCenter";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.HelpCenter)) {
                return false;
            }
            return true;
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zDHFhFhiqvNsbyp6Fbu8i9HMT3M(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        return kotlin.Unit.INSTANCE;
    }

    public /* synthetic */ HelpOptionUiData(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, function1);
    }
}
