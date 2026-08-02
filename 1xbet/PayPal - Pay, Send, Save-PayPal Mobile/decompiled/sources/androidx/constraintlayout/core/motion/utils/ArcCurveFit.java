package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes6.dex */
public class ArcCurveFit extends androidx.constraintlayout.core.motion.utils.CurveFit {
    public static final int ARC_ABOVE = 5;
    public static final int ARC_BELOW = 4;
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;
    private final double[] getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor = true;
    androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[] getHighSpeedVideoSizes;

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d, double[] dArr) {
        if (!this.getHighSpeedVideoFpsRangesFor) {
            if (d < this.getHighSpeedVideoSizes[0].getHighSpeedVideoSizesFor) {
                d = this.getHighSpeedVideoSizes[0].getHighSpeedVideoSizesFor;
            }
            androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[] arcArr = this.getHighSpeedVideoSizes;
            if (d > arcArr[arcArr.length - 1].getOutputSizeshNQ4ISI) {
                androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[] arcArr2 = this.getHighSpeedVideoSizes;
                d = arcArr2[arcArr2.length - 1].getOutputSizeshNQ4ISI;
            }
        } else {
            if (d < this.getHighSpeedVideoSizes[0].getHighSpeedVideoSizesFor) {
                double d2 = this.getHighSpeedVideoSizes[0].getHighSpeedVideoSizesFor;
                double d3 = d - this.getHighSpeedVideoSizes[0].getHighSpeedVideoSizesFor;
                if (this.getHighSpeedVideoSizes[0].getOutputFormats) {
                    dArr[0] = this.getHighSpeedVideoSizes[0].Camera2StreamConfigurationMap(d2) + (this.getHighSpeedVideoSizes[0].getHighSpeedVideoFpsRangesFor * d3);
                    dArr[1] = this.getHighSpeedVideoSizes[0].getHighResolutionOutputSizeshNQ4ISI(d2) + (d3 * this.getHighSpeedVideoSizes[0].getInputFormats);
                    return;
                }
                this.getHighSpeedVideoSizes[0].getHighSpeedVideoFpsRangesFor(d2);
                androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc arc = this.getHighSpeedVideoSizes[0];
                dArr[0] = arc.getHighSpeedVideoFpsRangesFor + (arc.getHighResolutionOutputSizeshNQ4ISI * arc.getOutputStallDurationlomOqCM) + (this.getHighSpeedVideoSizes[0].getHighSpeedVideoFpsRangesFor() * d3);
                androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc arc2 = this.getHighSpeedVideoSizes[0];
                dArr[1] = arc2.getInputFormats + (arc2.getHighSpeedVideoFpsRanges * arc2.getOutputSizes) + (d3 * this.getHighSpeedVideoSizes[0].getHighResolutionOutputSizeshNQ4ISI());
                return;
            }
            androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[] arcArr3 = this.getHighSpeedVideoSizes;
            if (d > arcArr3[arcArr3.length - 1].getOutputSizeshNQ4ISI) {
                androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[] arcArr4 = this.getHighSpeedVideoSizes;
                double d4 = arcArr4[arcArr4.length - 1].getOutputSizeshNQ4ISI;
                double d5 = d - d4;
                androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[] arcArr5 = this.getHighSpeedVideoSizes;
                int length = arcArr5.length - 1;
                if (arcArr5[length].getOutputFormats) {
                    dArr[0] = this.getHighSpeedVideoSizes[length].Camera2StreamConfigurationMap(d4) + (this.getHighSpeedVideoSizes[length].getHighSpeedVideoFpsRangesFor * d5);
                    dArr[1] = this.getHighSpeedVideoSizes[length].getHighResolutionOutputSizeshNQ4ISI(d4) + (d5 * this.getHighSpeedVideoSizes[length].getInputFormats);
                    return;
                }
                this.getHighSpeedVideoSizes[length].getHighSpeedVideoFpsRangesFor(d);
                androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc arc3 = this.getHighSpeedVideoSizes[length];
                dArr[0] = arc3.getHighSpeedVideoFpsRangesFor + (arc3.getHighResolutionOutputSizeshNQ4ISI * arc3.getOutputStallDurationlomOqCM) + (this.getHighSpeedVideoSizes[length].getHighSpeedVideoFpsRangesFor() * d5);
                androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc arc4 = this.getHighSpeedVideoSizes[length];
                dArr[1] = arc4.getInputFormats + (arc4.getHighSpeedVideoFpsRanges * arc4.getOutputSizes) + (d5 * this.getHighSpeedVideoSizes[length].getHighResolutionOutputSizeshNQ4ISI());
                return;
            }
        }
        int i = 0;
        while (true) {
            androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[] arcArr6 = this.getHighSpeedVideoSizes;
            if (i >= arcArr6.length) {
                return;
            }
            if (d <= arcArr6[i].getOutputSizeshNQ4ISI) {
                if (this.getHighSpeedVideoSizes[i].getOutputFormats) {
                    dArr[0] = this.getHighSpeedVideoSizes[i].Camera2StreamConfigurationMap(d);
                    dArr[1] = this.getHighSpeedVideoSizes[i].getHighResolutionOutputSizeshNQ4ISI(d);
                    return;
                }
                this.getHighSpeedVideoSizes[i].getHighSpeedVideoFpsRangesFor(d);
                androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc arc5 = this.getHighSpeedVideoSizes[i];
                dArr[0] = arc5.getHighSpeedVideoFpsRangesFor + (arc5.getHighResolutionOutputSizeshNQ4ISI * arc5.getOutputStallDurationlomOqCM);
                androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc arc6 = this.getHighSpeedVideoSizes[i];
                dArr[1] = arc6.getInputFormats + (arc6.getHighSpeedVideoFpsRanges * arc6.getOutputSizes);
                return;
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d, float[] fArr) {
        if (this.getHighSpeedVideoFpsRangesFor) {
            if (d < this.getHighSpeedVideoSizes[0].getHighSpeedVideoSizesFor) {
                double d2 = this.getHighSpeedVideoSizes[0].getHighSpeedVideoSizesFor;
                double d3 = d - this.getHighSpeedVideoSizes[0].getHighSpeedVideoSizesFor;
                if (this.getHighSpeedVideoSizes[0].getOutputFormats) {
                    fArr[0] = (float) (this.getHighSpeedVideoSizes[0].Camera2StreamConfigurationMap(d2) + (this.getHighSpeedVideoSizes[0].getHighSpeedVideoFpsRangesFor * d3));
                    fArr[1] = (float) (this.getHighSpeedVideoSizes[0].getHighResolutionOutputSizeshNQ4ISI(d2) + (d3 * this.getHighSpeedVideoSizes[0].getInputFormats));
                    return;
                }
                this.getHighSpeedVideoSizes[0].getHighSpeedVideoFpsRangesFor(d2);
                androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc arc = this.getHighSpeedVideoSizes[0];
                fArr[0] = (float) (arc.getHighSpeedVideoFpsRangesFor + (arc.getHighResolutionOutputSizeshNQ4ISI * arc.getOutputStallDurationlomOqCM) + (this.getHighSpeedVideoSizes[0].getHighSpeedVideoFpsRangesFor() * d3));
                androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc arc2 = this.getHighSpeedVideoSizes[0];
                fArr[1] = (float) (arc2.getInputFormats + (arc2.getHighSpeedVideoFpsRanges * arc2.getOutputSizes) + (d3 * this.getHighSpeedVideoSizes[0].getHighResolutionOutputSizeshNQ4ISI()));
                return;
            }
            androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[] arcArr = this.getHighSpeedVideoSizes;
            if (d > arcArr[arcArr.length - 1].getOutputSizeshNQ4ISI) {
                androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[] arcArr2 = this.getHighSpeedVideoSizes;
                double d4 = arcArr2[arcArr2.length - 1].getOutputSizeshNQ4ISI;
                double d5 = d - d4;
                androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[] arcArr3 = this.getHighSpeedVideoSizes;
                int length = arcArr3.length - 1;
                if (arcArr3[length].getOutputFormats) {
                    fArr[0] = (float) (this.getHighSpeedVideoSizes[length].Camera2StreamConfigurationMap(d4) + (this.getHighSpeedVideoSizes[length].getHighSpeedVideoFpsRangesFor * d5));
                    fArr[1] = (float) (this.getHighSpeedVideoSizes[length].getHighResolutionOutputSizeshNQ4ISI(d4) + (d5 * this.getHighSpeedVideoSizes[length].getInputFormats));
                    return;
                }
                this.getHighSpeedVideoSizes[length].getHighSpeedVideoFpsRangesFor(d);
                androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc arc3 = this.getHighSpeedVideoSizes[length];
                fArr[0] = (float) (arc3.getHighSpeedVideoFpsRangesFor + (arc3.getHighResolutionOutputSizeshNQ4ISI * arc3.getOutputStallDurationlomOqCM));
                androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc arc4 = this.getHighSpeedVideoSizes[length];
                fArr[1] = (float) (arc4.getInputFormats + (arc4.getHighSpeedVideoFpsRanges * arc4.getOutputSizes));
                return;
            }
        } else if (d < this.getHighSpeedVideoSizes[0].getHighSpeedVideoSizesFor) {
            d = this.getHighSpeedVideoSizes[0].getHighSpeedVideoSizesFor;
        } else {
            androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[] arcArr4 = this.getHighSpeedVideoSizes;
            if (d > arcArr4[arcArr4.length - 1].getOutputSizeshNQ4ISI) {
                androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[] arcArr5 = this.getHighSpeedVideoSizes;
                d = arcArr5[arcArr5.length - 1].getOutputSizeshNQ4ISI;
            }
        }
        int i = 0;
        while (true) {
            androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[] arcArr6 = this.getHighSpeedVideoSizes;
            if (i >= arcArr6.length) {
                return;
            }
            if (d <= arcArr6[i].getOutputSizeshNQ4ISI) {
                if (this.getHighSpeedVideoSizes[i].getOutputFormats) {
                    fArr[0] = (float) this.getHighSpeedVideoSizes[i].Camera2StreamConfigurationMap(d);
                    fArr[1] = (float) this.getHighSpeedVideoSizes[i].getHighResolutionOutputSizeshNQ4ISI(d);
                    return;
                }
                this.getHighSpeedVideoSizes[i].getHighSpeedVideoFpsRangesFor(d);
                androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc arc5 = this.getHighSpeedVideoSizes[i];
                fArr[0] = (float) (arc5.getHighSpeedVideoFpsRangesFor + (arc5.getHighResolutionOutputSizeshNQ4ISI * arc5.getOutputStallDurationlomOqCM));
                androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc arc6 = this.getHighSpeedVideoSizes[i];
                fArr[1] = (float) (arc6.getInputFormats + (arc6.getHighSpeedVideoFpsRanges * arc6.getOutputSizes));
                return;
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d, double[] dArr) {
        if (d < this.getHighSpeedVideoSizes[0].getHighSpeedVideoSizesFor) {
            d = this.getHighSpeedVideoSizes[0].getHighSpeedVideoSizesFor;
        } else {
            androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[] arcArr = this.getHighSpeedVideoSizes;
            if (d > arcArr[arcArr.length - 1].getOutputSizeshNQ4ISI) {
                androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[] arcArr2 = this.getHighSpeedVideoSizes;
                d = arcArr2[arcArr2.length - 1].getOutputSizeshNQ4ISI;
            }
        }
        int i = 0;
        while (true) {
            androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[] arcArr3 = this.getHighSpeedVideoSizes;
            if (i >= arcArr3.length) {
                return;
            }
            if (d <= arcArr3[i].getOutputSizeshNQ4ISI) {
                if (this.getHighSpeedVideoSizes[i].getOutputFormats) {
                    dArr[0] = this.getHighSpeedVideoSizes[i].getHighSpeedVideoFpsRangesFor;
                    dArr[1] = this.getHighSpeedVideoSizes[i].getInputFormats;
                    return;
                } else {
                    this.getHighSpeedVideoSizes[i].getHighSpeedVideoFpsRangesFor(d);
                    dArr[0] = this.getHighSpeedVideoSizes[i].getHighSpeedVideoFpsRangesFor();
                    dArr[1] = this.getHighSpeedVideoSizes[i].getHighResolutionOutputSizeshNQ4ISI();
                    return;
                }
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d, int i) {
        double d2;
        double d3;
        double d4;
        double d5;
        double highResolutionOutputSizeshNQ4ISI;
        double d6;
        double d7;
        double d8;
        int i2 = 0;
        if (this.getHighSpeedVideoFpsRangesFor) {
            if (d < this.getHighSpeedVideoSizes[0].getHighSpeedVideoSizesFor) {
                double d9 = this.getHighSpeedVideoSizes[0].getHighSpeedVideoSizesFor;
                d5 = d - this.getHighSpeedVideoSizes[0].getHighSpeedVideoSizesFor;
                if (!this.getHighSpeedVideoSizes[0].getOutputFormats) {
                    this.getHighSpeedVideoSizes[0].getHighSpeedVideoFpsRangesFor(d9);
                    if (i == 0) {
                        androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc arc = this.getHighSpeedVideoSizes[0];
                        d8 = arc.getHighSpeedVideoFpsRangesFor + (arc.getHighResolutionOutputSizeshNQ4ISI * arc.getOutputStallDurationlomOqCM);
                        d7 = this.getHighSpeedVideoSizes[0].getHighSpeedVideoFpsRangesFor();
                    } else {
                        androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc arc2 = this.getHighSpeedVideoSizes[0];
                        d8 = arc2.getInputFormats + (arc2.getHighSpeedVideoFpsRanges * arc2.getOutputSizes);
                        d7 = this.getHighSpeedVideoSizes[0].getHighResolutionOutputSizeshNQ4ISI();
                    }
                } else if (i == 0) {
                    d8 = this.getHighSpeedVideoSizes[0].Camera2StreamConfigurationMap(d9);
                    d7 = this.getHighSpeedVideoSizes[0].getHighSpeedVideoFpsRangesFor;
                } else {
                    d8 = this.getHighSpeedVideoSizes[0].getHighResolutionOutputSizeshNQ4ISI(d9);
                    d7 = this.getHighSpeedVideoSizes[0].getInputFormats;
                }
            } else {
                if (d > this.getHighSpeedVideoSizes[r0.length - 1].getOutputSizeshNQ4ISI) {
                    double d10 = this.getHighSpeedVideoSizes[r0.length - 1].getOutputSizeshNQ4ISI;
                    d5 = d - d10;
                    androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[] arcArr = this.getHighSpeedVideoSizes;
                    int length = arcArr.length - 1;
                    if (i == 0) {
                        highResolutionOutputSizeshNQ4ISI = arcArr[length].Camera2StreamConfigurationMap(d10);
                        d6 = this.getHighSpeedVideoSizes[length].getHighSpeedVideoFpsRangesFor;
                    } else {
                        highResolutionOutputSizeshNQ4ISI = arcArr[length].getHighResolutionOutputSizeshNQ4ISI(d10);
                        d6 = this.getHighSpeedVideoSizes[length].getInputFormats;
                    }
                    double d11 = highResolutionOutputSizeshNQ4ISI;
                    d7 = d6;
                    d8 = d11;
                }
            }
            return d8 + (d5 * d7);
        }
        if (d < this.getHighSpeedVideoSizes[0].getHighSpeedVideoSizesFor) {
            d = this.getHighSpeedVideoSizes[0].getHighSpeedVideoSizesFor;
        } else {
            if (d > this.getHighSpeedVideoSizes[r0.length - 1].getOutputSizeshNQ4ISI) {
                d = this.getHighSpeedVideoSizes[r11.length - 1].getOutputSizeshNQ4ISI;
            }
        }
        while (true) {
            androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[] arcArr2 = this.getHighSpeedVideoSizes;
            if (i2 >= arcArr2.length) {
                return Double.NaN;
            }
            if (d <= arcArr2[i2].getOutputSizeshNQ4ISI) {
                if (this.getHighSpeedVideoSizes[i2].getOutputFormats) {
                    if (i == 0) {
                        return this.getHighSpeedVideoSizes[i2].Camera2StreamConfigurationMap(d);
                    }
                    return this.getHighSpeedVideoSizes[i2].getHighResolutionOutputSizeshNQ4ISI(d);
                }
                this.getHighSpeedVideoSizes[i2].getHighSpeedVideoFpsRangesFor(d);
                if (i == 0) {
                    androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc arc3 = this.getHighSpeedVideoSizes[i2];
                    d2 = arc3.getHighSpeedVideoFpsRangesFor;
                    d3 = arc3.getHighResolutionOutputSizeshNQ4ISI;
                    d4 = arc3.getOutputStallDurationlomOqCM;
                } else {
                    androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc arc4 = this.getHighSpeedVideoSizes[i2];
                    d2 = arc4.getInputFormats;
                    d3 = arc4.getHighSpeedVideoFpsRanges;
                    d4 = arc4.getOutputSizes;
                }
                return d2 + (d3 * d4);
            }
            i2++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d, int i) {
        int i2 = 0;
        if (d < this.getHighSpeedVideoSizes[0].getHighSpeedVideoSizesFor) {
            d = this.getHighSpeedVideoSizes[0].getHighSpeedVideoSizesFor;
        }
        if (d > this.getHighSpeedVideoSizes[r0.length - 1].getOutputSizeshNQ4ISI) {
            d = this.getHighSpeedVideoSizes[r5.length - 1].getOutputSizeshNQ4ISI;
        }
        while (true) {
            androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[] arcArr = this.getHighSpeedVideoSizes;
            if (i2 >= arcArr.length) {
                return Double.NaN;
            }
            if (d <= arcArr[i2].getOutputSizeshNQ4ISI) {
                if (this.getHighSpeedVideoSizes[i2].getOutputFormats) {
                    if (i == 0) {
                        return this.getHighSpeedVideoSizes[i2].getHighSpeedVideoFpsRangesFor;
                    }
                    return this.getHighSpeedVideoSizes[i2].getInputFormats;
                }
                this.getHighSpeedVideoSizes[i2].getHighSpeedVideoFpsRangesFor(d);
                if (i == 0) {
                    return this.getHighSpeedVideoSizes[i2].getHighSpeedVideoFpsRangesFor();
                }
                return this.getHighSpeedVideoSizes[i2].getHighResolutionOutputSizeshNQ4ISI();
            }
            i2++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r5 == 1) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArcCurveFit(int[] iArr, double[] dArr, double[][] dArr2) {
        this.getHighSpeedVideoFpsRanges = dArr;
        this.getHighSpeedVideoSizes = new androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[dArr.length - 1];
        int i = 1;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[] arcArr = this.getHighSpeedVideoSizes;
            if (i3 >= arcArr.length) {
                return;
            }
            int i4 = iArr[i3];
            int i5 = 3;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            i5 = 4;
                            if (i4 != 4) {
                                i5 = 5;
                                if (i4 != 5) {
                                    double d = dArr[i3];
                                    int i6 = i3 + 1;
                                    double d2 = dArr[i6];
                                    double[] dArr3 = dArr2[i3];
                                    double d3 = dArr3[0];
                                    double d4 = dArr3[1];
                                    double[] dArr4 = dArr2[i6];
                                    arcArr[i3] = new androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc(i2, d, d2, d3, d4, dArr4[0], dArr4[1]);
                                    i3 = i6;
                                }
                            }
                        }
                    }
                    i = 2;
                    i2 = i;
                    double d5 = dArr[i3];
                    int i62 = i3 + 1;
                    double d22 = dArr[i62];
                    double[] dArr32 = dArr2[i3];
                    double d32 = dArr32[0];
                    double d42 = dArr32[1];
                    double[] dArr42 = dArr2[i62];
                    arcArr[i3] = new androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc(i2, d5, d22, d32, d42, dArr42[0], dArr42[1]);
                    i3 = i62;
                }
                i = 1;
                i2 = i;
                double d52 = dArr[i3];
                int i622 = i3 + 1;
                double d222 = dArr[i622];
                double[] dArr322 = dArr2[i3];
                double d322 = dArr322[0];
                double d422 = dArr322[1];
                double[] dArr422 = dArr2[i622];
                arcArr[i3] = new androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc(i2, d52, d222, d322, d422, dArr422[0], dArr422[1]);
                i3 = i622;
            }
            i2 = i5;
            double d522 = dArr[i3];
            int i6222 = i3 + 1;
            double d2222 = dArr[i6222];
            double[] dArr3222 = dArr2[i3];
            double d3222 = dArr3222[0];
            double d4222 = dArr3222[1];
            double[] dArr4222 = dArr2[i6222];
            arcArr[i3] = new androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc(i2, d522, d2222, d3222, d4222, dArr4222[0], dArr4222[1]);
            i3 = i6222;
        }
    }

    static class Arc {
        private static double[] unwrapAs = new double[91];
        double Camera2StreamConfigurationMap;
        double getHighResolutionOutputSizeshNQ4ISI;
        double getHighSpeedVideoFpsRanges;
        double getHighSpeedVideoFpsRangesFor;
        double getHighSpeedVideoSizes;
        double getHighSpeedVideoSizesFor;
        double getInputFormats;
        double[] getInputSizeshNQ4ISI;
        boolean getOutputFormats;
        double getOutputMinFrameDuration;
        double getOutputMinFrameDurationlomOqCM;
        double getOutputSizes;
        double getOutputSizeshNQ4ISI;
        boolean getOutputStallDuration;
        double getOutputStallDurationlomOqCM;
        double isOutputSupportedFor;
        double isOutputSupportedForhNQ4ISI;
        double toString;

        Arc(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            double d7;
            this.getOutputFormats = false;
            double d8 = d5 - d3;
            double d9 = d6 - d4;
            int i2 = 1;
            if (i == 1) {
                this.getOutputStallDuration = true;
            } else if (i == 4) {
                this.getOutputStallDuration = d9 > 0.0d;
            } else if (i == 5) {
                this.getOutputStallDuration = d9 < 0.0d;
            } else {
                this.getOutputStallDuration = false;
            }
            this.getHighSpeedVideoSizesFor = d;
            this.getOutputSizeshNQ4ISI = d2;
            this.getOutputMinFrameDuration = 1.0d / (d2 - d);
            if (3 == i) {
                this.getOutputFormats = true;
            }
            if (this.getOutputFormats || java.lang.Math.abs(d8) < 0.001d || java.lang.Math.abs(d9) < 0.001d) {
                this.getOutputFormats = true;
                this.getOutputMinFrameDurationlomOqCM = d3;
                this.toString = d5;
                this.isOutputSupportedForhNQ4ISI = d4;
                this.isOutputSupportedFor = d6;
                double hypot = java.lang.Math.hypot(d9, d8);
                this.Camera2StreamConfigurationMap = hypot;
                this.getHighSpeedVideoSizes = hypot * this.getOutputMinFrameDuration;
                double d10 = this.getOutputSizeshNQ4ISI - this.getHighSpeedVideoSizesFor;
                this.getHighSpeedVideoFpsRangesFor = d8 / d10;
                this.getInputFormats = d9 / d10;
                return;
            }
            this.getInputSizeshNQ4ISI = new double[101];
            boolean z = this.getOutputStallDuration;
            this.getHighResolutionOutputSizeshNQ4ISI = (z ? -1 : 1) * d8;
            this.getHighSpeedVideoFpsRanges = d9 * (z ? 1 : -1);
            this.getHighSpeedVideoFpsRangesFor = z ? d5 : d3;
            this.getInputFormats = z ? d4 : d6;
            double d11 = 0.0d;
            double d12 = 0.0d;
            double d13 = 0.0d;
            int i3 = 0;
            while (true) {
                if (i3 >= unwrapAs.length) {
                    break;
                }
                double d14 = d11;
                double radians = java.lang.Math.toRadians((i3 * 90.0d) / (r5.length - i2));
                double sin = java.lang.Math.sin(radians) * d8;
                double cos = java.lang.Math.cos(radians) * (d4 - d6);
                if (i3 > 0) {
                    d7 = java.lang.Math.hypot(sin - d12, cos - d13) + d14;
                    unwrapAs[i3] = d7;
                } else {
                    d7 = d14;
                }
                i3++;
                d13 = cos;
                d12 = sin;
                d11 = d7;
                i2 = 1;
            }
            double d15 = d11;
            this.Camera2StreamConfigurationMap = d15;
            int i4 = 0;
            while (true) {
                double[] dArr = unwrapAs;
                if (i4 >= dArr.length) {
                    break;
                }
                dArr[i4] = dArr[i4] / d15;
                i4++;
            }
            int i5 = 0;
            while (true) {
                if (i5 >= this.getInputSizeshNQ4ISI.length) {
                    this.getHighSpeedVideoSizes = this.Camera2StreamConfigurationMap * this.getOutputMinFrameDuration;
                    return;
                }
                double length = i5 / (r1.length - 1);
                int binarySearch = java.util.Arrays.binarySearch(unwrapAs, length);
                if (binarySearch >= 0) {
                    this.getInputSizeshNQ4ISI[i5] = binarySearch / (unwrapAs.length - 1);
                } else if (binarySearch == -1) {
                    this.getInputSizeshNQ4ISI[i5] = 0.0d;
                } else {
                    int i6 = -binarySearch;
                    int i7 = i6 - 2;
                    double[] dArr2 = unwrapAs;
                    double d16 = dArr2[i7];
                    this.getInputSizeshNQ4ISI[i5] = (i7 + ((length - d16) / (dArr2[i6 - 1] - d16))) / (dArr2.length - 1);
                }
                i5++;
            }
        }

        final void getHighSpeedVideoFpsRangesFor(double d) {
            double highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges((this.getOutputStallDuration ? this.getOutputSizeshNQ4ISI - d : d - this.getHighSpeedVideoSizesFor) * this.getOutputMinFrameDuration) * 1.5707963267948966d;
            this.getOutputStallDurationlomOqCM = java.lang.Math.sin(highSpeedVideoFpsRanges);
            this.getOutputSizes = java.lang.Math.cos(highSpeedVideoFpsRanges);
        }

        final double getHighSpeedVideoFpsRangesFor() {
            double d = this.getHighResolutionOutputSizeshNQ4ISI * this.getOutputSizes;
            double hypot = this.getHighSpeedVideoSizes / java.lang.Math.hypot(d, (-this.getHighSpeedVideoFpsRanges) * this.getOutputStallDurationlomOqCM);
            return this.getOutputStallDuration ? (-d) * hypot : d * hypot;
        }

        final double getHighResolutionOutputSizeshNQ4ISI() {
            double d = this.getHighResolutionOutputSizeshNQ4ISI;
            double d2 = this.getOutputSizes;
            double d3 = (-this.getHighSpeedVideoFpsRanges) * this.getOutputStallDurationlomOqCM;
            double hypot = this.getHighSpeedVideoSizes / java.lang.Math.hypot(d * d2, d3);
            return this.getOutputStallDuration ? (-d3) * hypot : d3 * hypot;
        }

        public final double Camera2StreamConfigurationMap(double d) {
            double d2 = this.getHighSpeedVideoSizesFor;
            double d3 = this.getOutputMinFrameDuration;
            double d4 = this.getOutputMinFrameDurationlomOqCM;
            return d4 + ((d - d2) * d3 * (this.toString - d4));
        }

        public final double getHighResolutionOutputSizeshNQ4ISI(double d) {
            double d2 = this.getHighSpeedVideoSizesFor;
            double d3 = this.getOutputMinFrameDuration;
            double d4 = this.isOutputSupportedForhNQ4ISI;
            return d4 + ((d - d2) * d3 * (this.isOutputSupportedFor - d4));
        }

        private double getHighSpeedVideoFpsRanges(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.getInputSizeshNQ4ISI;
            double length = d * (dArr.length - 1);
            int i = (int) length;
            double d2 = dArr[i];
            return d2 + ((length - i) * (dArr[i + 1] - d2));
        }
    }
}
