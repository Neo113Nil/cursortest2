package com.paypal.oslo.feature.searchandintelligence.di;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/di/SseParserModule;", "", "Lcom/paypal/oslo/feature/searchandintelligence/data/parser/SseResponseParser;", "impl", "Lcom/paypal/oslo/core/network/sse/SseParser;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse;", "bindSseParser", "(Lcom/paypal/oslo/feature/searchandintelligence/data/parser/SseResponseParser;)Lcom/paypal/oslo/core/network/sse/SseParser;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes14.dex */
public interface SseParserModule {
    @dagger.Binds
    com.paypal.oslo.core.network.sse.SseParser<com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse> bindSseParser(com.paypal.oslo.feature.searchandintelligence.data.parser.SseResponseParser impl);
}
