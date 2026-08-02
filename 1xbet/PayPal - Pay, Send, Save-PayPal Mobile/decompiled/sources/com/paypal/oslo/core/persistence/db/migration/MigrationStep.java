package com.paypal.oslo.core.persistence.db.migration;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/persistence/db/migration/MigrationStep;", "", "Landroidx/sqlite/db/SupportSQLiteDatabase;", com.datadog.trace.api.DDSpanTypes.COUCHBASE, "", com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConstants.APPLY_PROMO_CARD_STATUS, "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "", "getFrom", "()I", "from", "getTo", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "getOrder", "order"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface MigrationStep {
    void apply(androidx.database.db.SupportSQLiteDatabase db);

    int getFrom();

    int getOrder();

    int getTo();
}
