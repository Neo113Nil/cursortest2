package com.plaid.internal.core.crashreporting.internal.models;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\n\u0010\t\u0082\u0001\u0001\f"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/SentryProject;", "", "", "projectNumber", "keyResId", "<init>", "(II)V", com.visa.cbp.getEncExpo.warmup, "getKeyResId", "()I", "getProjectNumber", "LinkSdk", "Lcom/plaid/internal/core/crashreporting/internal/models/SentryProject$LinkSdk;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class SentryProject {
    private final int keyResId;
    private final int projectNumber;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/SentryProject$LinkSdk;", "Lcom/plaid/internal/core/crashreporting/internal/models/SentryProject;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LinkSdk extends com.plaid.internal.core.crashreporting.internal.models.SentryProject {
        public static final com.plaid.internal.core.crashreporting.internal.models.SentryProject.LinkSdk INSTANCE = new com.plaid.internal.core.crashreporting.internal.models.SentryProject.LinkSdk();

        private LinkSdk() {
            super(563, com.plaid.link.R.string.plaid_sentry_android_link_sdk_api_key, null);
        }
    }

    public /* synthetic */ SentryProject(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    public final int getKeyResId() {
        return this.keyResId;
    }

    public final int getProjectNumber() {
        return this.projectNumber;
    }

    private SentryProject(int i, int i2) {
        this.projectNumber = i;
        this.keyResId = i2;
    }
}
