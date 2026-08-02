package com.google.android.material.color.utilities;

/* loaded from: classes8.dex */
public final class DynamicColor {
    public final java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> background;
    public final com.google.android.material.color.utilities.ContrastCurve contrastCurve;
    private final java.util.HashMap<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.Hct> hctCache;
    public final boolean isBackground;

    /* renamed from: name, reason: collision with root package name */
    public final java.lang.String f3783name;
    public final java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> opacity;
    public final java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.TonalPalette> palette;
    public final java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> secondBackground;
    public final java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> tone;
    public final java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.ToneDeltaPair> toneDeltaPair;

    static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$fromArgb$0(com.google.android.material.color.utilities.TonalPalette tonalPalette, com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return tonalPalette;
    }

    public DynamicColor(java.lang.String str, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.TonalPalette> function, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> function2, boolean z, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> function3, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> function4, com.google.android.material.color.utilities.ContrastCurve contrastCurve, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.ToneDeltaPair> function5) {
        this.hctCache = new java.util.HashMap<>();
        this.f3783name = str;
        this.palette = function;
        this.tone = function2;
        this.isBackground = z;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = null;
    }

    public DynamicColor(java.lang.String str, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.TonalPalette> function, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> function2, boolean z, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> function3, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> function4, com.google.android.material.color.utilities.ContrastCurve contrastCurve, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.ToneDeltaPair> function5, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> function6) {
        this.hctCache = new java.util.HashMap<>();
        this.f3783name = str;
        this.palette = function;
        this.tone = function2;
        this.isBackground = z;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = function6;
    }

    public static com.google.android.material.color.utilities.DynamicColor fromPalette(java.lang.String str, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.TonalPalette> function, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> function2) {
        return new com.google.android.material.color.utilities.DynamicColor(str, function, function2, false, null, null, null, null);
    }

    public static com.google.android.material.color.utilities.DynamicColor fromPalette(java.lang.String str, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.TonalPalette> function, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> function2, boolean z) {
        return new com.google.android.material.color.utilities.DynamicColor(str, function, function2, z, null, null, null, null);
    }

    public static com.google.android.material.color.utilities.DynamicColor fromArgb(java.lang.String str, int i) {
        final com.google.android.material.color.utilities.Hct fromInt = com.google.android.material.color.utilities.Hct.fromInt(i);
        final com.google.android.material.color.utilities.TonalPalette fromInt2 = com.google.android.material.color.utilities.TonalPalette.fromInt(i);
        return fromPalette(str, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.DynamicColor.lambda$fromArgb$0(com.google.android.material.color.utilities.TonalPalette.this, (com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(com.google.android.material.color.utilities.Hct.this.getTone());
                return valueOf;
            }
        });
    }

    public final int getArgb(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        int i = getHct(dynamicScheme).toInt();
        java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> function = this.opacity;
        return function == null ? i : (com.google.android.material.color.utilities.MathUtils.clampInt(0, 255, (int) java.lang.Math.round(function.apply(dynamicScheme).doubleValue() * 255.0d)) << 24) | (i & 16777215);
    }

    public final com.google.android.material.color.utilities.Hct getHct(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        com.google.android.material.color.utilities.Hct hct = this.hctCache.get(dynamicScheme);
        if (hct != null) {
            return hct;
        }
        com.google.android.material.color.utilities.Hct hct2 = this.palette.apply(dynamicScheme).getHct(getTone(dynamicScheme));
        if (this.hctCache.size() > 4) {
            this.hctCache.clear();
        }
        this.hctCache.put(dynamicScheme, hct2);
        return hct2;
    }

    public final double getTone(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        double d;
        boolean z = dynamicScheme.contrastLevel < 0.0d;
        java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.ToneDeltaPair> function = this.toneDeltaPair;
        if (function != null) {
            com.google.android.material.color.utilities.ToneDeltaPair apply = function.apply(dynamicScheme);
            com.google.android.material.color.utilities.DynamicColor roleA = apply.getRoleA();
            com.google.android.material.color.utilities.DynamicColor roleB = apply.getRoleB();
            double delta = apply.getDelta();
            com.google.android.material.color.utilities.TonePolarity polarity = apply.getPolarity();
            boolean stayTogether = apply.getStayTogether();
            double tone = this.background.apply(dynamicScheme).getTone(dynamicScheme);
            boolean z2 = polarity == com.google.android.material.color.utilities.TonePolarity.NEARER || (polarity == com.google.android.material.color.utilities.TonePolarity.LIGHTER && !dynamicScheme.isDark) || (polarity == com.google.android.material.color.utilities.TonePolarity.DARKER && dynamicScheme.isDark);
            com.google.android.material.color.utilities.DynamicColor dynamicColor = z2 ? roleA : roleB;
            com.google.android.material.color.utilities.DynamicColor dynamicColor2 = z2 ? roleB : roleA;
            boolean equals = this.f3783name.equals(dynamicColor.f3783name);
            double d2 = dynamicScheme.isDark ? 1.0d : -1.0d;
            double contrast = dynamicColor.contrastCurve.getContrast(dynamicScheme.contrastLevel);
            double contrast2 = dynamicColor2.contrastCurve.getContrast(dynamicScheme.contrastLevel);
            double doubleValue = dynamicColor.tone.apply(dynamicScheme).doubleValue();
            if (com.google.android.material.color.utilities.Contrast.ratioOfTones(tone, doubleValue) < contrast) {
                doubleValue = foregroundTone(tone, contrast);
            }
            double d3 = doubleValue;
            double doubleValue2 = dynamicColor2.tone.apply(dynamicScheme).doubleValue();
            if (com.google.android.material.color.utilities.Contrast.ratioOfTones(tone, doubleValue2) < contrast2) {
                doubleValue2 = foregroundTone(tone, contrast2);
            }
            if (z) {
                d3 = foregroundTone(tone, contrast);
                doubleValue2 = foregroundTone(tone, contrast2);
            }
            if ((doubleValue2 - d3) * d2 < delta) {
                double d4 = delta * d2;
                doubleValue2 = com.google.android.material.color.utilities.MathUtils.clampDouble(0.0d, 100.0d, d3 + d4);
                if ((doubleValue2 - d3) * d2 < delta) {
                    d3 = com.google.android.material.color.utilities.MathUtils.clampDouble(0.0d, 100.0d, doubleValue2 - d4);
                }
            }
            if (50.0d > d3 || d3 >= 60.0d) {
                if (50.0d > doubleValue2 || doubleValue2 >= 60.0d) {
                    d = doubleValue2;
                } else if (!stayTogether) {
                    d = d2 > 0.0d ? 60.0d : 49.0d;
                } else if (d2 > 0.0d) {
                    d = java.lang.Math.max(doubleValue2, (delta * d2) + 60.0d);
                    d3 = 60.0d;
                } else {
                    d = java.lang.Math.min(doubleValue2, (delta * d2) + 49.0d);
                    d3 = 49.0d;
                }
            } else if (d2 > 0.0d) {
                d3 = 60.0d;
                d = java.lang.Math.max(doubleValue2, (delta * d2) + 60.0d);
            } else {
                d = java.lang.Math.min(doubleValue2, (delta * d2) + 49.0d);
                d3 = 49.0d;
            }
            return equals ? d3 : d;
        }
        double doubleValue3 = this.tone.apply(dynamicScheme).doubleValue();
        java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> function2 = this.background;
        if (function2 == null) {
            return doubleValue3;
        }
        double tone2 = function2.apply(dynamicScheme).getTone(dynamicScheme);
        double contrast3 = this.contrastCurve.getContrast(dynamicScheme.contrastLevel);
        if (com.google.android.material.color.utilities.Contrast.ratioOfTones(tone2, doubleValue3) < contrast3) {
            doubleValue3 = foregroundTone(tone2, contrast3);
        }
        if (z) {
            doubleValue3 = foregroundTone(tone2, contrast3);
        }
        double d5 = (!this.isBackground || 50.0d > doubleValue3 || doubleValue3 >= 60.0d) ? doubleValue3 : com.google.android.material.color.utilities.Contrast.ratioOfTones(49.0d, tone2) >= contrast3 ? 49.0d : 60.0d;
        if (this.secondBackground != null) {
            double tone3 = this.background.apply(dynamicScheme).getTone(dynamicScheme);
            double tone4 = this.secondBackground.apply(dynamicScheme).getTone(dynamicScheme);
            double max = java.lang.Math.max(tone3, tone4);
            double min = java.lang.Math.min(tone3, tone4);
            if (com.google.android.material.color.utilities.Contrast.ratioOfTones(max, d5) < contrast3 || com.google.android.material.color.utilities.Contrast.ratioOfTones(min, d5) < contrast3) {
                double lighter = com.google.android.material.color.utilities.Contrast.lighter(max, contrast3);
                double darker = com.google.android.material.color.utilities.Contrast.darker(min, contrast3);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (lighter != -1.0d) {
                    arrayList.add(java.lang.Double.valueOf(lighter));
                }
                if (darker != -1.0d) {
                    arrayList.add(java.lang.Double.valueOf(darker));
                }
                if (tonePrefersLightForeground(tone3) || tonePrefersLightForeground(tone4)) {
                    if (lighter == -1.0d) {
                        return 100.0d;
                    }
                    return lighter;
                }
                if (arrayList.size() == 1) {
                    return ((java.lang.Double) arrayList.get(0)).doubleValue();
                }
                if (darker == -1.0d) {
                    return 0.0d;
                }
                return darker;
            }
        }
        return d5;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static double foregroundTone(double d, double d2) {
        double lighterUnsafe = com.google.android.material.color.utilities.Contrast.lighterUnsafe(d, d2);
        double darkerUnsafe = com.google.android.material.color.utilities.Contrast.darkerUnsafe(d, d2);
        double ratioOfTones = com.google.android.material.color.utilities.Contrast.ratioOfTones(lighterUnsafe, d);
        double ratioOfTones2 = com.google.android.material.color.utilities.Contrast.ratioOfTones(darkerUnsafe, d);
        if (tonePrefersLightForeground(d)) {
            return (ratioOfTones >= d2 || ratioOfTones >= ratioOfTones2 || ((java.lang.Math.abs(ratioOfTones - ratioOfTones2) > 0.1d ? 1 : (java.lang.Math.abs(ratioOfTones - ratioOfTones2) == 0.1d ? 0 : -1)) < 0 && (ratioOfTones > d2 ? 1 : (ratioOfTones == d2 ? 0 : -1)) < 0 && (ratioOfTones2 > d2 ? 1 : (ratioOfTones2 == d2 ? 0 : -1)) < 0)) ? lighterUnsafe : darkerUnsafe;
        }
        if (ratioOfTones2 >= d2 || ratioOfTones2 >= ratioOfTones) {
        }
    }

    public static double enableLightForeground(double d) {
        if (!tonePrefersLightForeground(d) || toneAllowsLightForeground(d)) {
            return d;
        }
        return 49.0d;
    }

    public static boolean tonePrefersLightForeground(double d) {
        return java.lang.Math.round(d) < 60;
    }

    public static boolean toneAllowsLightForeground(double d) {
        return java.lang.Math.round(d) <= 49;
    }
}
