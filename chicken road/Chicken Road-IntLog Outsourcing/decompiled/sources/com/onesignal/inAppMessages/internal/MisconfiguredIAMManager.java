package com.onesignal.inAppMessages.internal;

import com.onesignal.core.internal.minification.KeepStub;
import com.onesignal.inAppMessages.IInAppMessageClickListener;
import com.onesignal.inAppMessages.IInAppMessageLifecycleListener;
import com.onesignal.inAppMessages.IInAppMessagesManager;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

@KeepStub
/* loaded from: classes.dex */
public final class MisconfiguredIAMManager implements IInAppMessagesManager {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:InAppMessages in order to use this functionality!");
        }

        private Companion() {
        }
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addTriggers, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo13addTriggers(Map map) {
        addTriggers((Map<String, String>) map);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    public boolean getPaused() {
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeTriggers, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo18removeTriggers(Collection collection) {
        removeTriggers((Collection<String>) collection);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    public void setPaused(boolean z) {
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo10addClickListener(IInAppMessageClickListener listener) {
        i.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo11addLifecycleListener(IInAppMessageLifecycleListener listener) {
        i.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addTrigger, reason: merged with bridge method [inline-methods] */
    public Void mo12addTrigger(String key, String value) {
        i.e(key, "key");
        i.e(value, "value");
        throw Companion.getEXCEPTION();
    }

    public Void addTriggers(Map<String, String> triggers) {
        i.e(triggers, "triggers");
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: clearTriggers, reason: merged with bridge method [inline-methods] */
    public Void mo14clearTriggers() {
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo15removeClickListener(IInAppMessageClickListener listener) {
        i.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo16removeLifecycleListener(IInAppMessageLifecycleListener listener) {
        i.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeTrigger, reason: merged with bridge method [inline-methods] */
    public Void mo17removeTrigger(String key) {
        i.e(key, "key");
        throw Companion.getEXCEPTION();
    }

    public Void removeTriggers(Collection<String> keys) {
        i.e(keys, "keys");
        throw Companion.getEXCEPTION();
    }
}
