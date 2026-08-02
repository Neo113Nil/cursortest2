package org.betup.ui.dialogs.presentation;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.presentation.PresentationCampaignDto;
import org.betup.ui.dialogs.presentation.bridge.PresentationWebViewBridgeHandler;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PresentationBridgeCallbackRegistry.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lorg/betup/ui/dialogs/presentation/PresentationBridgeCallbackRegistry;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "handlers", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lorg/betup/ui/dialogs/presentation/bridge/PresentationWebViewBridgeHandler;", "campaigns", "Lorg/betup/model/remote/entity/presentation/PresentationCampaignDto;", "put", "campaign", "handler", "peekCampaign", "key", "peekHandler", "remove", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PresentationBridgeCallbackRegistry {
    public static final PresentationBridgeCallbackRegistry INSTANCE = new PresentationBridgeCallbackRegistry();
    private static final ConcurrentHashMap<String, PresentationWebViewBridgeHandler> handlers = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, PresentationCampaignDto> campaigns = new ConcurrentHashMap<>();
    public static final int $stable = 8;

    private PresentationBridgeCallbackRegistry() {
    }

    public final String put(PresentationCampaignDto campaign, PresentationWebViewBridgeHandler handler) {
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        Intrinsics.checkNotNullParameter(handler, "handler");
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        handlers.put(uuid, handler);
        campaigns.put(uuid, campaign);
        return uuid;
    }

    public final PresentationCampaignDto peekCampaign(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return campaigns.get(key);
    }

    public final PresentationWebViewBridgeHandler peekHandler(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return handlers.get(key);
    }

    public final void remove(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        handlers.remove(key);
        campaigns.remove(key);
    }
}
