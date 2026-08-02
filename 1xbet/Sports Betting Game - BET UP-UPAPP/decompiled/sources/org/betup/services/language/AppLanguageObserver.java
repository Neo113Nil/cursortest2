package org.betup.services.language;

import kotlin.Metadata;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: AppLanguageObserver.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lorg/betup/services/language/AppLanguageObserver;", "", "onLanguageChanged", "", "newLanguageCode", "", "wasLanguageRecentlyChanged", "", "markLanguageChangeHandled", "languageChangeEvents", "Lkotlinx/coroutines/flow/SharedFlow;", "getLanguageChangeEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AppLanguageObserver {
    SharedFlow<String> getLanguageChangeEvents();

    void markLanguageChangeHandled();

    void onLanguageChanged(String newLanguageCode);

    boolean wasLanguageRecentlyChanged();
}
