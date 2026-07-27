package com.onesignal.inAppMessages;

import b2.AbstractC0279e;
import com.onesignal.common.modules.IModule;
import com.onesignal.common.services.ServiceBuilder;
import com.onesignal.core.internal.startup.IBootstrapService;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.inAppMessages.internal.InAppMessagesManager;
import com.onesignal.inAppMessages.internal.backend.IInAppBackendService;
import com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService;
import com.onesignal.inAppMessages.internal.display.IInAppDisplayer;
import com.onesignal.inAppMessages.internal.display.impl.InAppDisplayer;
import com.onesignal.inAppMessages.internal.hydrators.InAppHydrator;
import com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleService;
import com.onesignal.inAppMessages.internal.lifecycle.impl.IAMLifecycleService;
import com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController;
import com.onesignal.inAppMessages.internal.preferences.impl.InAppPreferencesController;
import com.onesignal.inAppMessages.internal.preview.InAppMessagePreviewHandler;
import com.onesignal.inAppMessages.internal.prompt.IInAppMessagePromptFactory;
import com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePromptFactory;
import com.onesignal.inAppMessages.internal.repositories.IInAppRepository;
import com.onesignal.inAppMessages.internal.repositories.impl.InAppRepository;
import com.onesignal.inAppMessages.internal.state.InAppStateService;
import com.onesignal.inAppMessages.internal.triggers.ITriggerController;
import com.onesignal.inAppMessages.internal.triggers.TriggerModelStore;
import com.onesignal.inAppMessages.internal.triggers.impl.DynamicTriggerController;
import com.onesignal.inAppMessages.internal.triggers.impl.TriggerController;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class InAppMessagesModule implements IModule {
    @Override // com.onesignal.common.modules.IModule
    public void register(ServiceBuilder builder) {
        i.e(builder, "builder");
        builder.register(InAppStateService.class).provides(InAppStateService.class);
        builder.register(InAppHydrator.class).provides(InAppHydrator.class);
        builder.register(InAppPreferencesController.class).provides(IInAppPreferencesController.class);
        AbstractC0279e.n(builder, InAppRepository.class, IInAppRepository.class, InAppBackendService.class, IInAppBackendService.class);
        AbstractC0279e.n(builder, IAMLifecycleService.class, IInAppLifecycleService.class, TriggerModelStore.class, TriggerModelStore.class);
        AbstractC0279e.n(builder, TriggerController.class, ITriggerController.class, DynamicTriggerController.class, DynamicTriggerController.class);
        AbstractC0279e.n(builder, InAppDisplayer.class, IInAppDisplayer.class, InAppMessagePreviewHandler.class, IBootstrapService.class);
        builder.register(InAppMessagePromptFactory.class).provides(IInAppMessagePromptFactory.class);
        builder.register(InAppMessagesManager.class).provides(IInAppMessagesManager.class).provides(IStartableService.class);
    }
}
