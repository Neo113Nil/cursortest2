package androidx.compose.material3.internal.colorUtil;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007J%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015"}, d2 = {"Landroidx/compose/material3/internal/colorUtil/HctSolver;", "", "<init>", "()V", "", "p0", "getHighSpeedVideoSizes", "(D)D", "", "getHighSpeedVideoFpsRangesFor", "([D)D", "hueDegrees", "chroma", "lstar", "", "solveToInt", "(DDD)I", "", "[[D", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "[D", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HctSolver {
    public static final androidx.compose.material3.internal.colorUtil.HctSolver INSTANCE = new androidx.compose.material3.internal.colorUtil.HctSolver();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final double[][] Camera2StreamConfigurationMap = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final double[][] getHighSpeedVideoFpsRanges = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final double[] getHighSpeedVideoSizes = {0.2126d, 0.7152d, 0.0722d};

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final double[] getHighResolutionOutputSizeshNQ4ISI = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};
    public static final int $stable = 8;

    private HctSolver() {
    }

    private static double getHighSpeedVideoSizes(double p0) {
        double d = p0 / 100.0d;
        return (d <= 0.0031308d ? d * 12.92d : (java.lang.Math.pow(d, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    private static double getHighSpeedVideoFpsRangesFor(double[] p0) {
        double[][] dArr = Camera2StreamConfigurationMap;
        double d = p0[0];
        double[] dArr2 = dArr[0];
        double d2 = dArr2[0];
        double d3 = p0[1];
        double d4 = dArr2[1];
        double d5 = p0[2];
        double d6 = dArr2[2];
        double[] dArr3 = dArr[1];
        double d7 = dArr3[0];
        double d8 = dArr3[1];
        double d9 = dArr3[2];
        double[] dArr4 = dArr[2];
        double d10 = dArr4[0];
        double d11 = dArr4[1];
        double d12 = dArr4[2];
        double pow = java.lang.Math.pow(java.lang.Math.abs((d2 * d) + (d4 * d3) + (d6 * d5)), 0.42d);
        double signum = ((androidx.compose.material3.internal.colorUtil.CamUtils.INSTANCE.signum(r5) * 400.0d) * pow) / (pow + 27.13d);
        double pow2 = java.lang.Math.pow(java.lang.Math.abs((d7 * d) + (d8 * d3) + (d9 * d5)), 0.42d);
        double signum2 = ((androidx.compose.material3.internal.colorUtil.CamUtils.INSTANCE.signum(r0) * 400.0d) * pow2) / (pow2 + 27.13d);
        double pow3 = java.lang.Math.pow(java.lang.Math.abs((d * d10) + (d3 * d11) + (d5 * d12)), 0.42d);
        double signum3 = ((androidx.compose.material3.internal.colorUtil.CamUtils.INSTANCE.signum(r2) * 400.0d) * pow3) / (pow3 + 27.13d);
        return java.lang.Math.atan2(((signum + signum2) - (signum3 * 2.0d)) / 9.0d, (((signum * 11.0d) + ((-12.0d) * signum2)) + signum3) / 11.0d);
    }

    private static double getHighSpeedVideoFpsRangesFor(double p0) {
        double abs = java.lang.Math.abs(p0);
        return androidx.compose.material3.internal.colorUtil.CamUtils.INSTANCE.signum(p0) * java.lang.Math.pow(java.lang.Math.max(0.0d, (27.13d * abs) / (400.0d - abs)), 2.380952380952381d);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int solveToInt(double hueDegrees, double chroma, double lstar) {
        double d;
        double d2;
        int i;
        int ceil;
        double floor;
        int i2;
        double d3;
        double[] dArr;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        if (chroma < 1.0E-4d || lstar < 1.0E-4d || lstar > 99.9999d) {
            return androidx.compose.material3.internal.colorUtil.CamUtils.INSTANCE.argbFromLstar(lstar);
        }
        double d10 = hueDegrees % 360.0d;
        if (d10 < 0.0d) {
            d10 += 360.0d;
        }
        double radians = java.lang.Math.toRadians(d10);
        double yFromLstar = androidx.compose.material3.internal.colorUtil.CamUtils.INSTANCE.yFromLstar(lstar);
        double sqrt = java.lang.Math.sqrt(yFromLstar) * 11.0d;
        androidx.compose.material3.internal.colorUtil.Frame frame = androidx.compose.material3.internal.colorUtil.Frame.INSTANCE.getDefault();
        double pow = 1.0d / java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, frame.getN()), 0.73d);
        double cos = java.lang.Math.cos(radians + 2.0d);
        double nc = frame.getNc();
        double ncb = frame.getNcb();
        double sin = java.lang.Math.sin(radians);
        double cos2 = java.lang.Math.cos(radians);
        int i3 = 0;
        while (true) {
            if (i3 >= 5) {
                d = yFromLstar;
                d2 = radians;
                break;
            }
            d2 = radians;
            double d11 = sqrt / 100.0d;
            if (chroma == 0.0d || sqrt == 0.0d) {
                d5 = sqrt;
                d6 = 0.0d;
            } else {
                d6 = chroma / java.lang.Math.sqrt(d11);
                d5 = sqrt;
            }
            double d12 = d6 * pow;
            double d13 = pow;
            double pow2 = java.lang.Math.pow(d12, 1.1111111111111112d);
            d = yFromLstar;
            double aw = (frame.getAw() * java.lang.Math.pow(d11, (1.0d / frame.getC()) / frame.getZ())) / frame.getNbb();
            double d14 = (((0.305d + aw) * 23.0d) * pow2) / ((((((((cos + 3.8d) * 0.25d) * 3846.153846153846d) * nc) * ncb) * 23.0d) + ((pow2 * 11.0d) * cos2)) + ((pow2 * 108.0d) * sin));
            double d15 = d14 * cos2;
            double d16 = d14 * sin;
            double d17 = aw * 460.0d;
            double d18 = (((451.0d * d15) + d17) + (288.0d * d16)) / 1403.0d;
            double d19 = ((d17 - (891.0d * d15)) - (261.0d * d16)) / 1403.0d;
            double d20 = ((d17 - (d15 * 220.0d)) - (d16 * 6300.0d)) / 1403.0d;
            double highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(d18);
            double highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(d19);
            double highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(d20);
            double[][] dArr2 = getHighSpeedVideoFpsRanges;
            double[] dArr3 = dArr2[0];
            d7 = (dArr3[0] * highSpeedVideoFpsRangesFor) + (dArr3[1] * highSpeedVideoFpsRangesFor2) + (dArr3[2] * highSpeedVideoFpsRangesFor3);
            double[] dArr4 = dArr2[1];
            d8 = (dArr4[0] * highSpeedVideoFpsRangesFor) + (dArr4[1] * highSpeedVideoFpsRangesFor2) + (dArr4[2] * highSpeedVideoFpsRangesFor3);
            double[] dArr5 = dArr2[2];
            d9 = (highSpeedVideoFpsRangesFor * dArr5[0]) + (highSpeedVideoFpsRangesFor2 * dArr5[1]) + (highSpeedVideoFpsRangesFor3 * dArr5[2]);
            if (d7 < 0.0d || d8 < 0.0d || d9 < 0.0d) {
                break;
            }
            double[] dArr6 = getHighSpeedVideoSizes;
            double d21 = (dArr6[0] * d7) + (dArr6[1] * d8) + (dArr6[2] * d9);
            if (d21 <= 0.0d) {
                break;
            }
            if (i3 == 4) {
                break;
            }
            double d22 = d21 - d;
            if (java.lang.Math.abs(d22) < 0.002d) {
                break;
            }
            sqrt = d5 - ((d22 * d5) / (d21 * 2.0d));
            i3++;
            radians = d2;
            pow = d13;
            yFromLstar = d;
        }
        if (d7 <= 100.01d && d8 <= 100.01d && d9 <= 100.01d) {
            i = androidx.compose.material3.internal.colorUtil.CamUtils.INSTANCE.argbFromLinrgbComponents(d7, d8, d9);
            if (i == 0) {
                return i;
            }
            double[] dArr7 = {-1.0d, -1.0d, -1.0d};
            double[] dArr8 = dArr7;
            boolean z = false;
            double d23 = 0.0d;
            double d24 = 0.0d;
            boolean z2 = true;
            for (int i4 = 0; i4 < 12; i4++) {
                double[] dArr9 = getHighSpeedVideoSizes;
                double d25 = dArr9[0];
                double d26 = dArr9[1];
                double d27 = dArr9[2];
                double d28 = i4 % 4 <= 1 ? 0.0d : 100.0d;
                if (i4 % 2 != 0) {
                    d3 = 100.0d;
                    i2 = 4;
                } else {
                    i2 = 4;
                    d3 = 0.0d;
                }
                if (i4 < i2) {
                    double d29 = ((d - (d26 * d28)) - (d27 * d3)) / d25;
                    if (0.0d <= d29 && d29 <= 100.0d) {
                        dArr = new double[]{d29, d28, d3};
                    } else {
                        dArr = new double[]{-1.0d, -1.0d, -1.0d};
                    }
                } else if (i4 < 8) {
                    double d30 = ((d - (d25 * d3)) - (d27 * d28)) / d26;
                    if (0.0d <= d30 && d30 <= 100.0d) {
                        dArr = new double[]{d3, d30, d28};
                    } else {
                        dArr = new double[]{-1.0d, -1.0d, -1.0d};
                    }
                } else {
                    double d31 = ((d - (d25 * d28)) - (d26 * d3)) / d27;
                    if (0.0d <= d31 && d31 <= 100.0d) {
                        dArr = new double[]{d28, d3, d31};
                    } else {
                        dArr = new double[]{-1.0d, -1.0d, -1.0d};
                    }
                }
                if (dArr[0] >= 0.0d) {
                    double highSpeedVideoFpsRangesFor4 = getHighSpeedVideoFpsRangesFor(dArr);
                    if (z) {
                        if (z2) {
                            d4 = 6.283185307179586d;
                        } else {
                            d4 = 6.283185307179586d;
                            if (((highSpeedVideoFpsRangesFor4 - d23) + 25.132741228718345d) % 6.283185307179586d >= ((d24 - d23) + 25.132741228718345d) % 6.283185307179586d) {
                            }
                        }
                        if (((d2 - d23) + 25.132741228718345d) % d4 < ((highSpeedVideoFpsRangesFor4 - d23) + 25.132741228718345d) % d4) {
                            dArr8 = dArr;
                            d24 = highSpeedVideoFpsRangesFor4;
                        } else {
                            dArr7 = dArr;
                            d23 = highSpeedVideoFpsRangesFor4;
                        }
                        z2 = false;
                    } else {
                        dArr7 = dArr;
                        dArr8 = dArr7;
                        d23 = highSpeedVideoFpsRangesFor4;
                        d24 = d23;
                        z = true;
                    }
                }
            }
            double[][] dArr10 = {dArr7, dArr8};
            double[] dArr11 = dArr10[0];
            double highSpeedVideoFpsRangesFor5 = getHighSpeedVideoFpsRangesFor(dArr11);
            double[] dArr12 = dArr10[1];
            for (int i5 = 0; i5 < 3; i5++) {
                double d32 = dArr11[i5];
                double d33 = dArr12[i5];
                if (d32 != d33) {
                    if (d32 < d33) {
                        ceil = (int) java.lang.Math.floor(getHighSpeedVideoSizes(d32) - 0.5d);
                        floor = java.lang.Math.ceil(getHighSpeedVideoSizes(dArr12[i5]) - 0.5d);
                    } else {
                        ceil = (int) java.lang.Math.ceil(getHighSpeedVideoSizes(d32) - 0.5d);
                        floor = java.lang.Math.floor(getHighSpeedVideoSizes(dArr12[i5]) - 0.5d);
                    }
                    int i6 = (int) floor;
                    for (int i7 = 0; i7 < 8; i7++) {
                        if (java.lang.Math.abs(i6 - ceil) > 1.0d) {
                            int floor2 = (int) java.lang.Math.floor((ceil + i6) / 2.0d);
                            double d34 = getHighResolutionOutputSizeshNQ4ISI[floor2];
                            double d35 = dArr11[i5];
                            double d36 = dArr12[i5];
                            if (d36 != d35) {
                                d36 = (d34 - d35) / (d36 - d35);
                            }
                            double d37 = dArr11[0];
                            double d38 = dArr12[0];
                            double d39 = dArr11[1];
                            double d40 = dArr12[1];
                            double d41 = dArr11[2];
                            double[] dArr13 = {d37 + ((d38 - d37) * d36), d39 + ((d40 - d39) * d36), d41 + ((dArr12[2] - d41) * d36)};
                            double highSpeedVideoFpsRangesFor6 = getHighSpeedVideoFpsRangesFor(dArr13);
                            if (((d2 - highSpeedVideoFpsRangesFor5) + 25.132741228718345d) % 6.283185307179586d < ((highSpeedVideoFpsRangesFor6 - highSpeedVideoFpsRangesFor5) + 25.132741228718345d) % 6.283185307179586d) {
                                i6 = floor2;
                                dArr12 = dArr13;
                            } else {
                                ceil = floor2;
                                dArr11 = dArr13;
                                highSpeedVideoFpsRangesFor5 = highSpeedVideoFpsRangesFor6;
                            }
                        }
                    }
                }
            }
            return androidx.compose.material3.internal.colorUtil.CamUtils.INSTANCE.argbFromLinrgbComponents((dArr11[0] + dArr12[0]) / 2.0d, (dArr11[1] + dArr12[1]) / 2.0d, (dArr11[2] + dArr12[2]) / 2.0d);
        }
        i = 0;
        if (i == 0) {
        }
    }
}
