package com.datadog.android.core.internal.persistence.file.advanced;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/advanced/DataMigrator;", "", "S", "previousState", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "previousFileOrchestrator", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_STATE_KEY, "newFileOrchestrator", "", "migrateData", "(Ljava/lang/Object;Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;Ljava/lang/Object;Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DataMigrator<S> {
    void migrateData(S previousState, com.datadog.android.core.internal.persistence.file.FileOrchestrator previousFileOrchestrator, S newState, com.datadog.android.core.internal.persistence.file.FileOrchestrator newFileOrchestrator);
}
