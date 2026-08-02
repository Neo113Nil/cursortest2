package org.betup.utils;

import org.betup.model.remote.entity.messaging.CorrespondentModel;

/* loaded from: classes4.dex */
public final class SupportStatusCalculator {
    private static final long HALF_OF_HOUR = 1800000;
    private static final long HOUR_AND_HALF = 5400000;
    private static final String WAS_MINUTES_AGO = " min's ago";

    public enum SupportStatus {
        ONLINE,
        WAS_HERE,
        OFFLINE
    }

    private SupportStatusCalculator() {
    }

    public static SupportStatus getSupportStatus(CorrespondentModel correspondentModel) {
        if (correspondentModel == null) {
            throw new IllegalArgumentException("Correspondent model can't be null!");
        }
        long calculateTimeDiff = calculateTimeDiff(correspondentModel);
        if (calculateTimeDiff <= HALF_OF_HOUR) {
            return SupportStatus.ONLINE;
        }
        if (calculateTimeDiff < HOUR_AND_HALF) {
            return SupportStatus.WAS_HERE;
        }
        return SupportStatus.OFFLINE;
    }

    public static String resultTimeString(CorrespondentModel correspondentModel) {
        return calcAndMakeWasTimeString(calculateTimeDiff(correspondentModel));
    }

    private static long calculateTimeDiff(CorrespondentModel correspondentModel) {
        return System.currentTimeMillis() - correspondentModel.getLastVisitedAt().getTime();
    }

    private static String calcAndMakeWasTimeString(long time) {
        return time > 3600000 ? " 1 hour and ".concat(String.valueOf(DateHelper.millsToMins(time - 3600000)).concat(WAS_MINUTES_AGO)) : String.valueOf(DateHelper.millsToMins(time)).concat(WAS_MINUTES_AGO);
    }
}
