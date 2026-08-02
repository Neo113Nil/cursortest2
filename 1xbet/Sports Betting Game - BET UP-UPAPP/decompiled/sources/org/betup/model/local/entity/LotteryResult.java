package org.betup.model.local.entity;

import java.util.List;

/* loaded from: classes2.dex */
public class LotteryResult {
    private int ballCount;
    private int ballSum;
    private List<LotteryBall> balls;

    public int getBallCount() {
        return this.ballCount;
    }

    public void setBallCount(int ballCount) {
        this.ballCount = ballCount;
    }

    public int getBallSum() {
        return this.ballSum;
    }

    public void setBallSum(int ballSum) {
        this.ballSum = ballSum;
    }

    public List<LotteryBall> getBalls() {
        return this.balls;
    }

    public void setBalls(List<LotteryBall> balls) {
        this.balls = balls;
    }
}
