package com.startapp.motiondetector;

/* loaded from: classes.dex */
public class Utils {
    public static double gaussian(double d3, double d4, double d5, double d6) {
        return Math.exp((-Math.pow(d3 - d5, 2.0d)) / d6) * d4;
    }

    public static double logisticalFunction(double d3, double d4, double d5) {
        return 1.0d / (Math.exp((d4 - d3) * d5) + 1.0d);
    }

    public static double logisticalFunction0(double d3, double d4, double d5, double d6) {
        return (logisticalFunction(d3, d4, d5) - d6) / (1.0d - d6);
    }

    public static double logisticalFunction1(double d3, double d4, double d5, double d6) {
        return logisticalFunction(d3, d4, d5) / d6;
    }

    public static double smsq(double d3, double d4, double d5) {
        return (d5 * d5) + (d4 * d4) + (d3 * d3);
    }
}
