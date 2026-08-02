package org.apache.commons.imaging.color;

/* loaded from: classes17.dex */
public final class ColorConversions {
    private static final double REF_X = 95.047d;
    private static final double REF_Y = 100.0d;
    private static final double REF_Z = 108.883d;

    private static double convertHuetoRGB(double d, double d2, double d3) {
        double d4;
        if (d3 < 0.0d) {
            d3 += 1.0d;
        }
        if (d3 > 1.0d) {
            d3 -= 1.0d;
        }
        if (d3 * 6.0d < 1.0d) {
            d4 = (d2 - d) * 6.0d * d3;
        } else {
            if (d3 * 2.0d < 1.0d) {
                return d2;
            }
            if (3.0d * d3 >= 2.0d) {
                return d;
            }
            d4 = (d2 - d) * (0.6666666666666666d - d3) * 6.0d;
        }
        return d + d4;
    }

    private static double cube(double d) {
        return d * d * d;
    }

    public static double degree_2_radian(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    public static double radian_2_degree(double d) {
        return (d * 180.0d) / 3.141592653589793d;
    }

    private static double square(double d) {
        return d * d;
    }

    private ColorConversions() {
    }

    public static org.apache.commons.imaging.color.ColorCieLab convertXYZtoCIELab(org.apache.commons.imaging.color.ColorXyz colorXyz) {
        return convertXYZtoCIELab(colorXyz.X, colorXyz.Y, colorXyz.Z);
    }

    public static org.apache.commons.imaging.color.ColorCieLab convertXYZtoCIELab(double d, double d2, double d3) {
        double d4 = d / REF_X;
        double d5 = d2 / 100.0d;
        double d6 = d3 / REF_Z;
        double pow = d4 > 0.008856d ? java.lang.Math.pow(d4, 0.3333333333333333d) : (d4 * 7.787d) + 0.13793103448275862d;
        double pow2 = d5 > 0.008856d ? java.lang.Math.pow(d5, 0.3333333333333333d) : (d5 * 7.787d) + 0.13793103448275862d;
        return new org.apache.commons.imaging.color.ColorCieLab((116.0d * pow2) - 16.0d, 500.0d * (pow - pow2), (pow2 - (d6 > 0.008856d ? java.lang.Math.pow(d6, 0.3333333333333333d) : (d6 * 7.787d) + 0.13793103448275862d)) * 200.0d);
    }

    public static org.apache.commons.imaging.color.ColorXyz convertCIELabtoXYZ(org.apache.commons.imaging.color.ColorCieLab colorCieLab) {
        return convertCIELabtoXYZ(colorCieLab.L, colorCieLab.f7034a, colorCieLab.b);
    }

    public static org.apache.commons.imaging.color.ColorXyz convertCIELabtoXYZ(double d, double d2, double d3) {
        double d4 = (d + 16.0d) / 116.0d;
        double d5 = (d2 / 500.0d) + d4;
        double d6 = d4 - (d3 / 200.0d);
        return new org.apache.commons.imaging.color.ColorXyz((java.lang.Math.pow(d5, 3.0d) > 0.008856d ? java.lang.Math.pow(d5, 3.0d) : (d5 - 0.13793103448275862d) / 7.787d) * REF_X, (java.lang.Math.pow(d4, 3.0d) > 0.008856d ? java.lang.Math.pow(d4, 3.0d) : (d4 - 0.13793103448275862d) / 7.787d) * 100.0d, (java.lang.Math.pow(d6, 3.0d) > 0.008856d ? java.lang.Math.pow(d6, 3.0d) : (d6 - 0.13793103448275862d) / 7.787d) * REF_Z);
    }

    public static org.apache.commons.imaging.color.ColorHunterLab convertXYZtoHunterLab(org.apache.commons.imaging.color.ColorXyz colorXyz) {
        return convertXYZtoHunterLab(colorXyz.X, colorXyz.Y, colorXyz.Z);
    }

    public static org.apache.commons.imaging.color.ColorHunterLab convertXYZtoHunterLab(double d, double d2, double d3) {
        return new org.apache.commons.imaging.color.ColorHunterLab(java.lang.Math.sqrt(d2) * 10.0d, (((d * 1.02d) - d2) / java.lang.Math.sqrt(d2)) * 17.5d, ((d2 - (d3 * 0.847d)) / java.lang.Math.sqrt(d2)) * 7.0d);
    }

    public static org.apache.commons.imaging.color.ColorXyz convertHunterLabtoXYZ(org.apache.commons.imaging.color.ColorHunterLab colorHunterLab) {
        return convertHunterLabtoXYZ(colorHunterLab.L, colorHunterLab.f7035a, colorHunterLab.b);
    }

    public static org.apache.commons.imaging.color.ColorXyz convertHunterLabtoXYZ(double d, double d2, double d3) {
        double pow = java.lang.Math.pow(d / 10.0d, 2.0d);
        return new org.apache.commons.imaging.color.ColorXyz(((((d2 / 17.5d) * d) / 10.0d) + pow) / 1.02d, pow, (-((((d3 / 7.0d) * d) / 10.0d) - pow)) / 0.847d);
    }

    public static int convertXYZtoRGB(org.apache.commons.imaging.color.ColorXyz colorXyz) {
        return convertXYZtoRGB(colorXyz.X, colorXyz.Y, colorXyz.Z);
    }

    public static int convertXYZtoRGB(double d, double d2, double d3) {
        double d4 = d / 100.0d;
        double d5 = d2 / 100.0d;
        double d6 = d3 / 100.0d;
        double d7 = (3.2406d * d4) + ((-1.5372d) * d5) + ((-0.4986d) * d6);
        double d8 = ((-0.9689d) * d4) + (1.8758d * d5) + (0.0415d * d6);
        double d9 = (d4 * 0.0557d) + (d5 * (-0.204d)) + (d6 * 1.057d);
        return convertRGBtoRGB((d7 > 0.0031308d ? (java.lang.Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d : d7 * 12.92d) * 255.0d, (d8 > 0.0031308d ? (java.lang.Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d : d8 * 12.92d) * 255.0d, (d9 > 0.0031308d ? (java.lang.Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d : d9 * 12.92d) * 255.0d);
    }

    public static org.apache.commons.imaging.color.ColorXyz convertRGBtoXYZ(int i) {
        double d = ((i >> 16) & 255) / 255.0d;
        double d2 = ((i >> 8) & 255) / 255.0d;
        double d3 = (i & 255) / 255.0d;
        double pow = (d > 0.04045d ? java.lang.Math.pow((d + 0.055d) / 1.055d, 2.4d) : d / 12.92d) * 100.0d;
        double pow2 = (d2 > 0.04045d ? java.lang.Math.pow((d2 + 0.055d) / 1.055d, 2.4d) : d2 / 12.92d) * 100.0d;
        double pow3 = (d3 > 0.04045d ? java.lang.Math.pow((d3 + 0.055d) / 1.055d, 2.4d) : d3 / 12.92d) * 100.0d;
        return new org.apache.commons.imaging.color.ColorXyz((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3), (0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3), (pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d));
    }

    public static org.apache.commons.imaging.color.ColorCmy convertRGBtoCMY(int i) {
        return new org.apache.commons.imaging.color.ColorCmy(1.0d - (((i >> 16) & 255) / 255.0d), 1.0d - (((i >> 8) & 255) / 255.0d), 1.0d - ((i & 255) / 255.0d));
    }

    public static int convertCMYtoRGB(org.apache.commons.imaging.color.ColorCmy colorCmy) {
        return convertRGBtoRGB((1.0d - colorCmy.C) * 255.0d, (1.0d - colorCmy.M) * 255.0d, (1.0d - colorCmy.Y) * 255.0d);
    }

    public static org.apache.commons.imaging.color.ColorCmyk convertCMYtoCMYK(org.apache.commons.imaging.color.ColorCmy colorCmy) {
        double d;
        double d2;
        double d3;
        double d4 = colorCmy.C;
        double d5 = colorCmy.M;
        double d6 = colorCmy.Y;
        double d7 = d4 < 1.0d ? d4 : 1.0d;
        if (d5 < d7) {
            d7 = d5;
        }
        double d8 = d6 < d7 ? d6 : d7;
        if (d8 == 1.0d) {
            d = 0.0d;
            d2 = 0.0d;
            d3 = 0.0d;
        } else {
            double d9 = 1.0d - d8;
            d = (d4 - d8) / d9;
            d2 = (d5 - d8) / d9;
            d3 = (d6 - d8) / d9;
        }
        return new org.apache.commons.imaging.color.ColorCmyk(d, d2, d3, d8);
    }

    public static org.apache.commons.imaging.color.ColorCmy convertCMYKtoCMY(org.apache.commons.imaging.color.ColorCmyk colorCmyk) {
        return convertCMYKtoCMY(colorCmyk.C, colorCmyk.M, colorCmyk.Y, colorCmyk.K);
    }

    public static org.apache.commons.imaging.color.ColorCmy convertCMYKtoCMY(double d, double d2, double d3, double d4) {
        double d5 = 1.0d - d4;
        return new org.apache.commons.imaging.color.ColorCmy((d * d5) + d4, (d2 * d5) + d4, (d5 * d3) + d4);
    }

    public static int convertCMYKtoRGB(int i, int i2, int i3, int i4) {
        return convertCMYtoRGB(convertCMYKtoCMY(i / 255.0d, i2 / 255.0d, i3 / 255.0d, i4 / 255.0d));
    }

    public static org.apache.commons.imaging.color.ColorHsl convertRGBtoHSL(int i) {
        double d;
        double d2;
        double d3;
        double d4 = ((i >> 16) & 255) / 255.0d;
        double d5 = ((i >> 8) & 255) / 255.0d;
        double d6 = (i & 255) / 255.0d;
        double min = java.lang.Math.min(d4, java.lang.Math.min(d5, d6));
        boolean z = true;
        boolean z2 = false;
        if (d4 >= d5 && d4 >= d6) {
            d = d4;
        } else if (d5 > d6) {
            d = d5;
            z2 = true;
            z = false;
        } else {
            d = d6;
            z = false;
        }
        double d7 = d - min;
        double d8 = d + min;
        double d9 = d8 / 2.0d;
        if (d7 == 0.0d) {
            d2 = 0.0d;
            d3 = 0.0d;
        } else {
            if (d9 >= 0.5d) {
                d8 = (2.0d - d) - min;
            }
            double d10 = d7 / d8;
            double d11 = d7 / 2.0d;
            double d12 = (((d - d4) / 6.0d) + d11) / d7;
            double d13 = (((d - d5) / 6.0d) + d11) / d7;
            double d14 = (((d - d6) / 6.0d) + d11) / d7;
            double d15 = z ? d14 - d13 : z2 ? (d12 + 0.3333333333333333d) - d14 : (d13 + 0.6666666666666666d) - d12;
            if (d15 < 0.0d) {
                d15 += 1.0d;
            }
            if (d15 > 1.0d) {
                d15 -= 1.0d;
            }
            d2 = d10;
            d3 = d15;
        }
        return new org.apache.commons.imaging.color.ColorHsl(d3, d2, d9);
    }

    public static int convertHSLtoRGB(org.apache.commons.imaging.color.ColorHsl colorHsl) {
        return convertHSLtoRGB(colorHsl.H, colorHsl.S, colorHsl.L);
    }

    public static int convertHSLtoRGB(double d, double d2, double d3) {
        double d4;
        double convertHuetoRGB;
        double d5;
        if (d2 == 0.0d) {
            d4 = d3 * 255.0d;
            d5 = d4;
            convertHuetoRGB = d5;
        } else {
            double d6 = d3 < 0.5d ? (d2 + 1.0d) * d3 : (d3 + d2) - (d2 * d3);
            double d7 = (2.0d * d3) - d6;
            double convertHuetoRGB2 = convertHuetoRGB(d7, d6, d + 0.3333333333333333d);
            double convertHuetoRGB3 = convertHuetoRGB(d7, d6, d) * 255.0d;
            d4 = convertHuetoRGB2 * 255.0d;
            convertHuetoRGB = convertHuetoRGB(d7, d6, d - 0.3333333333333333d) * 255.0d;
            d5 = convertHuetoRGB3;
        }
        return convertRGBtoRGB(d4, d5, convertHuetoRGB);
    }

    public static org.apache.commons.imaging.color.ColorHsv convertRGBtoHSV(int i) {
        double d;
        double d2;
        double d3;
        double d4 = ((i >> 16) & 255) / 255.0d;
        double d5 = ((i >> 8) & 255) / 255.0d;
        double d6 = (i & 255) / 255.0d;
        double min = java.lang.Math.min(d4, java.lang.Math.min(d5, d6));
        boolean z = true;
        boolean z2 = false;
        if (d4 >= d5 && d4 >= d6) {
            d = d4;
        } else if (d5 > d6) {
            d = d5;
            z2 = true;
            z = false;
        } else {
            d = d6;
            z = false;
        }
        double d7 = d - min;
        if (d7 == 0.0d) {
            d2 = 0.0d;
            d3 = 0.0d;
        } else {
            double d8 = d7 / d;
            double d9 = d7 / 2.0d;
            double d10 = (((d - d4) / 6.0d) + d9) / d7;
            double d11 = (((d - d5) / 6.0d) + d9) / d7;
            double d12 = (((d - d6) / 6.0d) + d9) / d7;
            double d13 = z ? d12 - d11 : z2 ? (d10 + 0.3333333333333333d) - d12 : (d11 + 0.6666666666666666d) - d10;
            if (d13 < 0.0d) {
                d13 += 1.0d;
            }
            if (d13 > 1.0d) {
                d13 -= 1.0d;
            }
            d2 = d8;
            d3 = d13;
        }
        return new org.apache.commons.imaging.color.ColorHsv(d3, d2, d);
    }

    public static int convertHSVtoRGB(org.apache.commons.imaging.color.ColorHsv colorHsv) {
        return convertHSVtoRGB(colorHsv.H, colorHsv.S, colorHsv.V);
    }

    public static int convertHSVtoRGB(double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        if (d2 == 0.0d) {
            d4 = d3 * 255.0d;
            d6 = d4;
            d5 = d6;
        } else {
            double d7 = d * 6.0d;
            if (d7 == 6.0d) {
                d7 = 0.0d;
            }
            double floor = java.lang.Math.floor(d7);
            double d8 = (1.0d - d2) * d3;
            double d9 = d7 - floor;
            double d10 = (1.0d - (d2 * d9)) * d3;
            double d11 = (1.0d - ((1.0d - d9) * d2)) * d3;
            if (floor != 0.0d) {
                if (floor != 1.0d) {
                    if (floor == 2.0d) {
                        d10 = d8;
                        d8 = d11;
                    } else {
                        if (floor != 3.0d) {
                            if (floor == 4.0d) {
                                d10 = d8;
                                d8 = d11;
                            } else {
                                d11 = d8;
                            }
                        }
                        d11 = d10;
                        d10 = d3;
                        d4 = d8 * 255.0d;
                        d5 = d10 * 255.0d;
                        d6 = d11 * 255.0d;
                    }
                }
                d11 = d3;
                double d12 = d8;
                d8 = d10;
                d10 = d12;
                d4 = d8 * 255.0d;
                d5 = d10 * 255.0d;
                d6 = d11 * 255.0d;
            } else {
                d10 = d8;
            }
            d8 = d3;
            d4 = d8 * 255.0d;
            d5 = d10 * 255.0d;
            d6 = d11 * 255.0d;
        }
        return convertRGBtoRGB(d4, d6, d5);
    }

    public static int convertCMYKtoRGB_Adobe(int i, int i2, int i3, int i4) {
        return convertRGBtoRGB(255 - (i + i4), 255 - (i2 + i4), 255 - (i3 + i4));
    }

    public static int convertCIELabtoARGBTest(int i, int i2, int i3) {
        double d = (((i * 100.0d) / 255.0d) + 16.0d) / 116.0d;
        double d2 = (i2 / 500.0d) + d;
        double d3 = d - (i3 / 200.0d);
        double cube = cube(d2);
        double cube2 = cube(d);
        double cube3 = cube(d3);
        if (cube2 <= 0.008856d) {
            cube2 = (d - 0.13793103448275862d) / 7.787d;
        }
        if (cube <= 0.008856d) {
            cube = (d2 - 0.13793103448275862d) / 7.787d;
        }
        if (cube3 <= 0.008856d) {
            cube3 = (d3 - 0.13793103448275862d) / 7.787d;
        }
        double d4 = (cube * REF_X) / 100.0d;
        double d5 = (cube2 * 100.0d) / 100.0d;
        double d6 = (cube3 * REF_Z) / 100.0d;
        double d7 = (3.2406d * d4) + ((-1.5372d) * d5) + ((-0.4986d) * d6);
        double d8 = ((-0.9689d) * d4) + (1.8758d * d5) + (0.0415d * d6);
        double d9 = (d4 * 0.0557d) + (d5 * (-0.204d)) + (d6 * 1.057d);
        return convertRGBtoRGB((d7 > 0.0031308d ? (java.lang.Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d : d7 * 12.92d) * 255.0d, (d8 > 0.0031308d ? (java.lang.Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d : d8 * 12.92d) * 255.0d, (d9 > 0.0031308d ? (java.lang.Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d : d9 * 12.92d) * 255.0d);
    }

    private static int convertRGBtoRGB(double d, double d2, double d3) {
        int round = (int) java.lang.Math.round(d);
        int round2 = (int) java.lang.Math.round(d2);
        int round3 = (int) java.lang.Math.round(d3);
        return (java.lang.Math.min(255, java.lang.Math.max(0, round)) << 16) | (-16777216) | (java.lang.Math.min(255, java.lang.Math.max(0, round2)) << 8) | java.lang.Math.min(255, java.lang.Math.max(0, round3));
    }

    private static int convertRGBtoRGB(int i, int i2, int i3) {
        return (java.lang.Math.min(255, java.lang.Math.max(0, i)) << 16) | (-16777216) | (java.lang.Math.min(255, java.lang.Math.max(0, i2)) << 8) | java.lang.Math.min(255, java.lang.Math.max(0, i3));
    }

    public static org.apache.commons.imaging.color.ColorCieLch convertCIELabtoCIELCH(org.apache.commons.imaging.color.ColorCieLab colorCieLab) {
        return convertCIELabtoCIELCH(colorCieLab.L, colorCieLab.f7034a, colorCieLab.b);
    }

    public static org.apache.commons.imaging.color.ColorCieLch convertCIELabtoCIELCH(double d, double d2, double d3) {
        double atan2 = java.lang.Math.atan2(d3, d2);
        return new org.apache.commons.imaging.color.ColorCieLch(d, java.lang.Math.sqrt(square(d2) + square(d3)), atan2 > 0.0d ? (atan2 / 3.141592653589793d) * 180.0d : 360.0d - radian_2_degree(java.lang.Math.abs(atan2)));
    }

    public static org.apache.commons.imaging.color.ColorCieLab convertCIELCHtoCIELab(org.apache.commons.imaging.color.ColorCieLch colorCieLch) {
        return convertCIELCHtoCIELab(colorCieLch.L, colorCieLch.C, colorCieLch.H);
    }

    public static org.apache.commons.imaging.color.ColorCieLab convertCIELCHtoCIELab(double d, double d2, double d3) {
        return new org.apache.commons.imaging.color.ColorCieLab(d, java.lang.Math.cos(degree_2_radian(d3)) * d2, java.lang.Math.sin(degree_2_radian(d3)) * d2);
    }

    public static org.apache.commons.imaging.color.ColorCieLuv convertXYZtoCIELuv(org.apache.commons.imaging.color.ColorXyz colorXyz) {
        return convertXYZtoCIELuv(colorXyz.X, colorXyz.Y, colorXyz.Z);
    }

    public static org.apache.commons.imaging.color.ColorCieLuv convertXYZtoCIELuv(double d, double d2, double d3) {
        double d4 = (15.0d * d2) + d + (d3 * 3.0d);
        double d5 = (d * 4.0d) / d4;
        double d6 = (9.0d * d2) / d4;
        double d7 = d2 / 100.0d;
        double pow = ((d7 > 0.008856d ? java.lang.Math.pow(d7, 0.3333333333333333d) : (d7 * 7.787d) + 0.13793103448275862d) * 116.0d) - 16.0d;
        double d8 = 13.0d * pow;
        return new org.apache.commons.imaging.color.ColorCieLuv(pow, d8 * (d5 - 0.19783982482140777d), d8 * (d6 - 0.46833630293240974d));
    }

    public static org.apache.commons.imaging.color.ColorXyz convertCIELuvtoXYZ(org.apache.commons.imaging.color.ColorCieLuv colorCieLuv) {
        return convertCIELuvtoXYZ(colorCieLuv.L, colorCieLuv.u, colorCieLuv.v);
    }

    public static org.apache.commons.imaging.color.ColorXyz convertCIELuvtoXYZ(double d, double d2, double d3) {
        double d4 = (d + 16.0d) / 116.0d;
        double d5 = 13.0d * d;
        double d6 = (d2 / d5) + 0.19783982482140777d;
        double d7 = (d3 / d5) + 0.46833630293240974d;
        double pow = (java.lang.Math.pow(d4, 3.0d) > 0.008856d ? java.lang.Math.pow(d4, 3.0d) : (d4 - 0.0d) / 7.787d) * 100.0d;
        double d8 = 9.0d * pow;
        double d9 = (-(d8 * d6)) / (((d6 - 4.0d) * d7) - (d6 * d7));
        return new org.apache.commons.imaging.color.ColorXyz(d9, pow, ((d8 - ((15.0d * d7) * pow)) - (d7 * d9)) / (d7 * 3.0d));
    }
}
