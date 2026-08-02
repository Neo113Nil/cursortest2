package org.betup.utils.balance;

import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OptimisticBalanceTiming.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lorg/betup/utils/balance/OptimisticBalanceTiming;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "WIN_CREDIT_DELAY_MS", "", "SERVER_SYNC_AFTER_LAST_STEP_MS", "FLASH_BET_START_SERVER_RECONCILE_DELAY_MS", "FLASH_BET_RESULTS_LOSS_SYNC_DELAY_MS", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OptimisticBalanceTiming {
    public static final int $stable = 0;
    public static final long FLASH_BET_RESULTS_LOSS_SYNC_DELAY_MS = 800;
    public static final long FLASH_BET_START_SERVER_RECONCILE_DELAY_MS = 4000;
    public static final OptimisticBalanceTiming INSTANCE = new OptimisticBalanceTiming();
    public static final long SERVER_SYNC_AFTER_LAST_STEP_MS = 3700;
    public static final long WIN_CREDIT_DELAY_MS = 2700;

    private OptimisticBalanceTiming() {
    }
}
