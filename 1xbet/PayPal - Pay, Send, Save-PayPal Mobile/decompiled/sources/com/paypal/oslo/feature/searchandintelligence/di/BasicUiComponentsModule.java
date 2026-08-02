package com.paypal.oslo.feature.searchandintelligence.di;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\rH'¢\u0006\u0004\b\u000e\u0010\u000fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/di/BasicUiComponentsModule;", "", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/deserializer/TextChatDeserializer;", "deserializer", "Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/UiComponentDeserializer;", "bindCloudTextChatResponseDeserializer", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/deserializer/TextChatDeserializer;)Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/UiComponentDeserializer;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/renderer/PlainTextRenderer;", "renderer", "Lcom/paypal/oslo/feature/searchandintelligence/api/renderer/UiComponentRenderer;", "Lcom/paypal/oslo/feature/searchandintelligence/api/component/UiComponent;", "bindPlainTextRenderer", "(Lcom/paypal/oslo/feature/searchandintelligence/ui/renderer/PlainTextRenderer;)Lcom/paypal/oslo/feature/searchandintelligence/api/renderer/UiComponentRenderer;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/renderer/ParseErrorRenderer;", "bindParseErrorRenderer", "(Lcom/paypal/oslo/feature/searchandintelligence/ui/renderer/ParseErrorRenderer;)Lcom/paypal/oslo/feature/searchandintelligence/api/renderer/UiComponentRenderer;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes14.dex */
public interface BasicUiComponentsModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.searchandintelligence.di.BasicUiComponentsModule.Companion INSTANCE = com.paypal.oslo.feature.searchandintelligence.di.BasicUiComponentsModule.Companion.getHighSpeedVideoFpsRangesFor;

    @dagger.Binds
    @dagger.multibindings.IntoMap
    @dagger.multibindings.StringKey(com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer.TextChatDeserializer.COMPONENT_NAME)
    com.paypal.oslo.feature.searchandintelligence.api.deserializer.UiComponentDeserializer bindCloudTextChatResponseDeserializer(com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer.TextChatDeserializer deserializer);

    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> bindParseErrorRenderer(com.paypal.oslo.feature.searchandintelligence.ui.renderer.ParseErrorRenderer renderer);

    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> bindPlainTextRenderer(com.paypal.oslo.feature.searchandintelligence.ui.renderer.PlainTextRenderer renderer);

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/di/BasicUiComponentsModule$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.di.BasicUiComponentsModule.Companion getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.searchandintelligence.di.BasicUiComponentsModule.Companion();

        private Companion() {
        }
    }
}
