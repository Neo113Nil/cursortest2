package org.slf4j.helpers;

/* loaded from: classes18.dex */
public class Reporter {
    private static final org.slf4j.helpers.Reporter.Level Camera2StreamConfigurationMap;
    public static final java.lang.String SLF4J_INTERNAL_REPORT_STREAM_KEY = "slf4j.internal.report.stream";
    public static final java.lang.String SLF4J_INTERNAL_VERBOSITY_KEY = "slf4j.internal.verbosity";
    private static final java.lang.String[] getHighResolutionOutputSizeshNQ4ISI;
    private static final org.slf4j.helpers.Reporter.TargetChoice getHighSpeedVideoFpsRangesFor;

    enum TargetChoice {
        Stderr,
        Stdout
    }

    enum Level {
        DEBUG(0),
        INFO(1),
        WARN(2),
        ERROR(3);

        int getHighSpeedVideoSizes;

        Level(int i) {
            this.getHighSpeedVideoSizes = i;
        }
    }

    static {
        org.slf4j.helpers.Reporter.TargetChoice targetChoice;
        org.slf4j.helpers.Reporter.Level level;
        java.lang.String[] strArr = {"System.out", "stdout", "sysout"};
        getHighResolutionOutputSizeshNQ4ISI = strArr;
        java.lang.String property = java.lang.System.getProperty(SLF4J_INTERNAL_REPORT_STREAM_KEY);
        if (property == null || property.isEmpty()) {
            targetChoice = org.slf4j.helpers.Reporter.TargetChoice.Stderr;
        } else {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (strArr[i].equalsIgnoreCase(property)) {
                        targetChoice = org.slf4j.helpers.Reporter.TargetChoice.Stdout;
                        break;
                    }
                    i++;
                } else {
                    targetChoice = org.slf4j.helpers.Reporter.TargetChoice.Stderr;
                    break;
                }
            }
        }
        getHighSpeedVideoFpsRangesFor = targetChoice;
        java.lang.String property2 = java.lang.System.getProperty(SLF4J_INTERNAL_VERBOSITY_KEY);
        if (property2 == null || property2.isEmpty()) {
            level = org.slf4j.helpers.Reporter.Level.INFO;
        } else if (property2.equalsIgnoreCase("DEBUG")) {
            level = org.slf4j.helpers.Reporter.Level.DEBUG;
        } else if (property2.equalsIgnoreCase("ERROR")) {
            level = org.slf4j.helpers.Reporter.Level.ERROR;
        } else if (property2.equalsIgnoreCase("WARN")) {
            level = org.slf4j.helpers.Reporter.Level.WARN;
        } else {
            level = org.slf4j.helpers.Reporter.Level.INFO;
        }
        Camera2StreamConfigurationMap = level;
    }

    public static void debug(java.lang.String str) {
        java.io.PrintStream printStream;
        if (org.slf4j.helpers.Reporter.Level.DEBUG.getHighSpeedVideoSizes >= Camera2StreamConfigurationMap.getHighSpeedVideoSizes) {
            if (getHighSpeedVideoFpsRangesFor.ordinal() == 1) {
                printStream = java.lang.System.out;
            } else {
                printStream = java.lang.System.err;
            }
            printStream.println("SLF4J(D): ".concat(java.lang.String.valueOf(str)));
        }
    }

    public static void info(java.lang.String str) {
        java.io.PrintStream printStream;
        if (org.slf4j.helpers.Reporter.Level.INFO.getHighSpeedVideoSizes >= Camera2StreamConfigurationMap.getHighSpeedVideoSizes) {
            if (getHighSpeedVideoFpsRangesFor.ordinal() == 1) {
                printStream = java.lang.System.out;
            } else {
                printStream = java.lang.System.err;
            }
            printStream.println("SLF4J(I): ".concat(java.lang.String.valueOf(str)));
        }
    }

    public static final void warn(java.lang.String str) {
        java.io.PrintStream printStream;
        if (org.slf4j.helpers.Reporter.Level.WARN.getHighSpeedVideoSizes >= Camera2StreamConfigurationMap.getHighSpeedVideoSizes) {
            if (getHighSpeedVideoFpsRangesFor.ordinal() == 1) {
                printStream = java.lang.System.out;
            } else {
                printStream = java.lang.System.err;
            }
            printStream.println("SLF4J(W): ".concat(java.lang.String.valueOf(str)));
        }
    }

    public static final void error(java.lang.String str) {
        (getHighSpeedVideoFpsRangesFor.ordinal() != 1 ? java.lang.System.err : java.lang.System.out).println("SLF4J(E): ".concat(java.lang.String.valueOf(str)));
    }

    public static final void error(java.lang.String str, java.lang.Throwable th) {
        org.slf4j.helpers.Reporter.TargetChoice targetChoice = getHighSpeedVideoFpsRangesFor;
        (targetChoice.ordinal() != 1 ? java.lang.System.err : java.lang.System.out).println("SLF4J(E): ".concat(java.lang.String.valueOf(str)));
        (targetChoice.ordinal() != 1 ? java.lang.System.err : java.lang.System.out).println("SLF4J(E): Reported exception:");
        th.printStackTrace(targetChoice.ordinal() != 1 ? java.lang.System.err : java.lang.System.out);
    }
}
