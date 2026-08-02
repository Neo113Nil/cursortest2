package com.plaid.internal.core.crashreporting.internal.models;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/SentryProject;", "Landroid/content/res/Resources;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "", "release", "Lcom/plaid/internal/core/crashreporting/internal/models/CrashApiOptions;", "toCrashOptions", "(Lcom/plaid/internal/core/crashreporting/internal/models/SentryProject;Landroid/content/res/Resources;Ljava/lang/String;)Lcom/plaid/internal/core/crashreporting/internal/models/CrashApiOptions;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CrashApiOptionsKt {
    public static final com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions toCrashOptions(com.plaid.internal.core.crashreporting.internal.models.SentryProject sentryProject, android.content.res.Resources resources, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sentryProject, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        int projectNumber = sentryProject.getProjectNumber();
        java.lang.String string = resources.getString(sentryProject.getKeyResId());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return new com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions(projectNumber, string, str);
    }
}
