package org.betup.services.language;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DefaultAppLanguageObserver.kt */
@Singleton
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lorg/betup/services/language/DefaultAppLanguageObserver;", "Lorg/betup/services/language/AppLanguageObserver;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "languageChangedFlag", "Ljava/util/concurrent/atomic/AtomicBoolean;", "_languageChangeEvents", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "languageChangeEvents", "Lkotlinx/coroutines/flow/SharedFlow;", "getLanguageChangeEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "onLanguageChanged", "", "newLanguageCode", "wasLanguageRecentlyChanged", "", "markLanguageChangeHandled", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultAppLanguageObserver implements AppLanguageObserver {
    public static final int $stable = 8;
    private final MutableSharedFlow<String> _languageChangeEvents;
    private final SharedFlow<String> languageChangeEvents;
    private final AtomicBoolean languageChangedFlag = new AtomicBoolean(false);

    @Inject
    public DefaultAppLanguageObserver() {
        MutableSharedFlow<String> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 4, null);
        this._languageChangeEvents = MutableSharedFlow$default;
        this.languageChangeEvents = MutableSharedFlow$default;
    }

    @Override // org.betup.services.language.AppLanguageObserver
    public SharedFlow<String> getLanguageChangeEvents() {
        return this.languageChangeEvents;
    }

    @Override // org.betup.services.language.AppLanguageObserver
    public void onLanguageChanged(String newLanguageCode) {
        Intrinsics.checkNotNullParameter(newLanguageCode, "newLanguageCode");
        this.languageChangedFlag.set(true);
        this._languageChangeEvents.tryEmit(newLanguageCode);
    }

    @Override // org.betup.services.language.AppLanguageObserver
    public boolean wasLanguageRecentlyChanged() {
        return this.languageChangedFlag.get();
    }

    @Override // org.betup.services.language.AppLanguageObserver
    public void markLanguageChangeHandled() {
        this.languageChangedFlag.set(false);
    }
}
