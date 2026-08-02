package org.betup.model.remote.entity.videoRewards;

/* loaded from: classes2.dex */
public class VideoRedeemResult {
    private long amount;
    private long newBalance;
    private boolean success;

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public long getAmount() {
        return this.amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getNewBalance() {
        return this.newBalance;
    }

    public void setNewBalance(long newBalance) {
        this.newBalance = newBalance;
    }
}
