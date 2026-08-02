package com.adobe.marketing.mobile.services.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\rJ%\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u000b\u0010\nJ\u001b\u0010\f\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\f\u0010\n"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/PresentationListener;", "", "Lcom/adobe/marketing/mobile/services/ui/Presentable;", "presentable", "Lcom/adobe/marketing/mobile/services/ui/PresentationListener$PresentationContent;", "presentationContent", "", "onContentLoaded", "(Lcom/adobe/marketing/mobile/services/ui/Presentable;Lcom/adobe/marketing/mobile/services/ui/PresentationListener$PresentationContent;)V", "onDismiss", "(Lcom/adobe/marketing/mobile/services/ui/Presentable;)V", "onHide", "onShow", "PresentationContent"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public interface PresentationListener {
    void onContentLoaded(com.adobe.marketing.mobile.services.ui.Presentable<?> presentable, com.adobe.marketing.mobile.services.ui.PresentationListener.PresentationContent presentationContent);

    void onDismiss(com.adobe.marketing.mobile.services.ui.Presentable<?> presentable);

    void onHide(com.adobe.marketing.mobile.services.ui.Presentable<?> presentable);

    void onShow(com.adobe.marketing.mobile.services.ui.Presentable<?> presentable);

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/PresentationListener$PresentationContent;", "", "<init>", "()V", "UrlContent", "Lcom/adobe/marketing/mobile/services/ui/PresentationListener$PresentationContent$UrlContent;"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class PresentationContent {
        public static final int $stable = 0;

        private PresentationContent() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/PresentationListener$PresentationContent$UrlContent;", "Lcom/adobe/marketing/mobile/services/ui/PresentationListener$PresentationContent;", "", "url", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class UrlContent extends com.adobe.marketing.mobile.services.ui.PresentationListener.PresentationContent {
            public static final int $stable = 0;
            private final java.lang.String url;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UrlContent(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.url = str;
            }

            public final java.lang.String getUrl() {
                return this.url;
            }
        }

        public /* synthetic */ PresentationContent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
