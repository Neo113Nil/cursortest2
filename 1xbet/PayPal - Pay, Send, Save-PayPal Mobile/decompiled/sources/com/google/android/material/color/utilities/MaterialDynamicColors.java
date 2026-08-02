package com.google.android.material.color.utilities;

/* loaded from: classes8.dex */
public final class MaterialDynamicColors {
    public final com.google.android.material.color.utilities.DynamicColor highestSurface(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return dynamicScheme.isDark ? surfaceBright() : surfaceDim();
    }

    public final com.google.android.material.color.utilities.DynamicColor primaryPaletteKeyColor() {
        return com.google.android.material.color.utilities.DynamicColor.fromPalette("primary_palette_key_color", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda72
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda73
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(((com.google.android.material.color.utilities.DynamicScheme) obj).primaryPalette.getKeyColor().getTone());
                return valueOf;
            }
        });
    }

    public final com.google.android.material.color.utilities.DynamicColor secondaryPaletteKeyColor() {
        return com.google.android.material.color.utilities.DynamicColor.fromPalette("secondary_palette_key_color", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda79
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).secondaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda80
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(((com.google.android.material.color.utilities.DynamicScheme) obj).secondaryPalette.getKeyColor().getTone());
                return valueOf;
            }
        });
    }

    public final com.google.android.material.color.utilities.DynamicColor tertiaryPaletteKeyColor() {
        return com.google.android.material.color.utilities.DynamicColor.fromPalette("tertiary_palette_key_color", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda91
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).tertiaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda92
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(((com.google.android.material.color.utilities.DynamicScheme) obj).tertiaryPalette.getKeyColor().getTone());
                return valueOf;
            }
        });
    }

    public final com.google.android.material.color.utilities.DynamicColor neutralPaletteKeyColor() {
        return com.google.android.material.color.utilities.DynamicColor.fromPalette("neutral_palette_key_color", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda11
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda22
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(((com.google.android.material.color.utilities.DynamicScheme) obj).neutralPalette.getKeyColor().getTone());
                return valueOf;
            }
        });
    }

    public final com.google.android.material.color.utilities.DynamicColor neutralVariantPaletteKeyColor() {
        return com.google.android.material.color.utilities.DynamicColor.fromPalette("neutral_variant_palette_key_color", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda144
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda145
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(((com.google.android.material.color.utilities.DynamicScheme) obj).neutralVariantPalette.getKeyColor().getTone());
                return valueOf;
            }
        });
    }

    public final com.google.android.material.color.utilities.DynamicColor background() {
        return new com.google.android.material.color.utilities.DynamicColor(com.datadog.android.rum.internal.metric.SessionEndedMetric.VIEW_COUNTS_BG_KEY, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda100
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda101
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 6.0d : 98.0d);
                return valueOf;
            }
        }, true, null, null, null, null);
    }

    public final com.google.android.material.color.utilities.DynamicColor onBackground() {
        return new com.google.android.material.color.utilities.DynamicColor("on_background", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda104
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda105
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 90.0d : 10.0d);
                return valueOf;
            }
        }, false, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda106
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10226x24678954((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, null, new com.google.android.material.color.utilities.ContrastCurve(3.0d, 3.0d, 4.5d, 7.0d), null);
    }

    /* renamed from: lambda$onBackground$14$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.DynamicColor m10226x24678954(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return background();
    }

    public final com.google.android.material.color.utilities.DynamicColor surface() {
        return new com.google.android.material.color.utilities.DynamicColor("surface", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda74
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 6.0d : 98.0d);
                return valueOf;
            }
        }, true, null, null, null, null);
    }

    public final com.google.android.material.color.utilities.DynamicColor surfaceDim() {
        return new com.google.android.material.color.utilities.DynamicColor("surface_dim", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda33
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda44
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 6.0d : 87.0d);
                return valueOf;
            }
        }, true, null, null, null, null);
    }

    public final com.google.android.material.color.utilities.DynamicColor surfaceBright() {
        return new com.google.android.material.color.utilities.DynamicColor("surface_bright", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda110
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda111
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 24.0d : 98.0d);
                return valueOf;
            }
        }, true, null, null, null, null);
    }

    public final com.google.android.material.color.utilities.DynamicColor surfaceContainerLowest() {
        return new com.google.android.material.color.utilities.DynamicColor("surface_container_lowest", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda7
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda8
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 4.0d : 100.0d);
                return valueOf;
            }
        }, true, null, null, null, null);
    }

    public final com.google.android.material.color.utilities.DynamicColor surfaceContainerLow() {
        return new com.google.android.material.color.utilities.DynamicColor("surface_container_low", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda81
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda82
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 10.0d : 96.0d);
                return valueOf;
            }
        }, true, null, null, null, null);
    }

    public final com.google.android.material.color.utilities.DynamicColor surfaceContainer() {
        return new com.google.android.material.color.utilities.DynamicColor("surface_container", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda38
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda39
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 12.0d : 94.0d);
                return valueOf;
            }
        }, true, null, null, null, null);
    }

    public final com.google.android.material.color.utilities.DynamicColor surfaceContainerHigh() {
        return new com.google.android.material.color.utilities.DynamicColor("surface_container_high", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda102
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda103
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 17.0d : 92.0d);
                return valueOf;
            }
        }, true, null, null, null, null);
    }

    public final com.google.android.material.color.utilities.DynamicColor surfaceContainerHighest() {
        return new com.google.android.material.color.utilities.DynamicColor("surface_container_highest", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda150
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda152
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 22.0d : 90.0d);
                return valueOf;
            }
        }, true, null, null, null, null);
    }

    public final com.google.android.material.color.utilities.DynamicColor onSurface() {
        return new com.google.android.material.color.utilities.DynamicColor("on_surface", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda140
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda151
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 90.0d : 10.0d);
                return valueOf;
            }
        }, false, new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new com.google.android.material.color.utilities.ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public final com.google.android.material.color.utilities.DynamicColor surfaceVariant() {
        return new com.google.android.material.color.utilities.DynamicColor("surface_variant", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda142
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda143
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 30.0d : 90.0d);
                return valueOf;
            }
        }, true, null, null, null, null);
    }

    public final com.google.android.material.color.utilities.DynamicColor onSurfaceVariant() {
        return new com.google.android.material.color.utilities.DynamicColor("on_surface_variant", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda40
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda41
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 80.0d : 30.0d);
                return valueOf;
            }
        }, false, new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new com.google.android.material.color.utilities.ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    public final com.google.android.material.color.utilities.DynamicColor inverseSurface() {
        return new com.google.android.material.color.utilities.DynamicColor("inverse_surface", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda42
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda43
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 90.0d : 20.0d);
                return valueOf;
            }
        }, false, null, null, null, null);
    }

    public final com.google.android.material.color.utilities.DynamicColor inverseOnSurface() {
        return new com.google.android.material.color.utilities.DynamicColor("inverse_on_surface", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda18
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda19
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 20.0d : 95.0d);
                return valueOf;
            }
        }, false, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda20
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10224xcbcaf83d((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, null, new com.google.android.material.color.utilities.ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    /* renamed from: lambda$inverseOnSurface$41$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.DynamicColor m10224xcbcaf83d(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return inverseSurface();
    }

    public final com.google.android.material.color.utilities.DynamicColor outline() {
        return new com.google.android.material.color.utilities.DynamicColor("outline", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda9
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda10
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 60.0d : 50.0d);
                return valueOf;
            }
        }, false, new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new com.google.android.material.color.utilities.ContrastCurve(1.5d, 3.0d, 4.5d, 7.0d), null);
    }

    public final com.google.android.material.color.utilities.DynamicColor outlineVariant() {
        return new com.google.android.material.color.utilities.DynamicColor("outline_variant", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda108
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda109
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 30.0d : 80.0d);
                return valueOf;
            }
        }, false, new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new com.google.android.material.color.utilities.ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), null);
    }

    public final com.google.android.material.color.utilities.DynamicColor shadow() {
        return new com.google.android.material.color.utilities.DynamicColor("shadow", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda148
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda149
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(0.0d);
                return valueOf;
            }
        }, false, null, null, null, null);
    }

    public final com.google.android.material.color.utilities.DynamicColor scrim() {
        return new com.google.android.material.color.utilities.DynamicColor("scrim", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda60
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda61
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(0.0d);
                return valueOf;
            }
        }, false, null, null, null, null);
    }

    public final com.google.android.material.color.utilities.DynamicColor surfaceTint() {
        return new com.google.android.material.color.utilities.DynamicColor("surface_tint", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda12
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda13
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 80.0d : 40.0d);
                return valueOf;
            }
        }, true, null, null, null, null);
    }

    public final com.google.android.material.color.utilities.DynamicColor primary() {
        return new com.google.android.material.color.utilities.DynamicColor("primary", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda57
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda58
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.lambda$primary$53((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, true, new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new com.google.android.material.color.utilities.ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda59
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10250x39203b5((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        });
    }

    static /* synthetic */ java.lang.Double lambda$primary$53(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return java.lang.Double.valueOf(dynamicScheme.isDark ? 100.0d : 0.0d);
        }
        return java.lang.Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* renamed from: lambda$primary$54$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m10250x39203b5(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return new com.google.android.material.color.utilities.ToneDeltaPair(primaryContainer(), primary(), 15.0d, com.google.android.material.color.utilities.TonePolarity.NEARER, false);
    }

    public final com.google.android.material.color.utilities.DynamicColor onPrimary() {
        return new com.google.android.material.color.utilities.DynamicColor("on_primary", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda112
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda113
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.lambda$onPrimary$56((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, false, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda114
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10229x16f20f37((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, null, new com.google.android.material.color.utilities.ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    static /* synthetic */ java.lang.Double lambda$onPrimary$56(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return java.lang.Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
        }
        return java.lang.Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* renamed from: lambda$onPrimary$57$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.DynamicColor m10229x16f20f37(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return primary();
    }

    public final com.google.android.material.color.utilities.DynamicColor primaryContainer() {
        return new com.google.android.material.color.utilities.DynamicColor("primary_container", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda97
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda98
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.lambda$primaryContainer$59((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, true, new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new com.google.android.material.color.utilities.ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda99
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10251x8277b1b9((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        });
    }

    static /* synthetic */ java.lang.Double lambda$primaryContainer$59(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return java.lang.Double.valueOf(performAlbers(dynamicScheme.sourceColorHct, dynamicScheme));
        }
        if (isMonochrome(dynamicScheme)) {
            return java.lang.Double.valueOf(dynamicScheme.isDark ? 85.0d : 25.0d);
        }
        return java.lang.Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* renamed from: lambda$primaryContainer$60$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m10251x8277b1b9(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return new com.google.android.material.color.utilities.ToneDeltaPair(primaryContainer(), primary(), 15.0d, com.google.android.material.color.utilities.TonePolarity.NEARER, false);
    }

    public final com.google.android.material.color.utilities.DynamicColor onPrimaryContainer() {
        return new com.google.android.material.color.utilities.DynamicColor("on_primary_container", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda135
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda136
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10230x617ce7dc((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, false, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda137
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10231x3d3e639d((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, null, new com.google.android.material.color.utilities.ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    /* renamed from: lambda$onPrimaryContainer$62$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ java.lang.Double m10230x617ce7dc(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return java.lang.Double.valueOf(com.google.android.material.color.utilities.DynamicColor.foregroundTone(primaryContainer().tone.apply(dynamicScheme).doubleValue(), 4.5d));
        }
        if (isMonochrome(dynamicScheme)) {
            return java.lang.Double.valueOf(dynamicScheme.isDark ? 0.0d : 100.0d);
        }
        return java.lang.Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* renamed from: lambda$onPrimaryContainer$63$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.DynamicColor m10231x3d3e639d(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return primaryContainer();
    }

    public final com.google.android.material.color.utilities.DynamicColor inversePrimary() {
        return new com.google.android.material.color.utilities.DynamicColor("inverse_primary", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda115
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda116
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 40.0d : 80.0d);
                return valueOf;
            }
        }, false, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda117
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10225x6f94cccc((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, null, new com.google.android.material.color.utilities.ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    /* renamed from: lambda$inversePrimary$66$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.DynamicColor m10225x6f94cccc(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return inverseSurface();
    }

    public final com.google.android.material.color.utilities.DynamicColor secondary() {
        return new com.google.android.material.color.utilities.DynamicColor("secondary", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda4
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).secondaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda5
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 80.0d : 40.0d);
                return valueOf;
            }
        }, true, new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new com.google.android.material.color.utilities.ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda6
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10254x991d7367((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        });
    }

    /* renamed from: lambda$secondary$69$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m10254x991d7367(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return new com.google.android.material.color.utilities.ToneDeltaPair(secondaryContainer(), secondary(), 15.0d, com.google.android.material.color.utilities.TonePolarity.NEARER, false);
    }

    public final com.google.android.material.color.utilities.DynamicColor onSecondary() {
        return new com.google.android.material.color.utilities.DynamicColor("on_secondary", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).secondaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda2
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.lambda$onSecondary$71((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, false, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10236x1ad791fe((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, null, new com.google.android.material.color.utilities.ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    static /* synthetic */ java.lang.Double lambda$onSecondary$71(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return java.lang.Double.valueOf(dynamicScheme.isDark ? 10.0d : 100.0d);
        }
        return java.lang.Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* renamed from: lambda$onSecondary$72$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.DynamicColor m10236x1ad791fe(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return secondary();
    }

    public final com.google.android.material.color.utilities.DynamicColor secondaryContainer() {
        return new com.google.android.material.color.utilities.DynamicColor("secondary_container", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda83
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).secondaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda84
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.lambda$secondaryContainer$74((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, true, new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new com.google.android.material.color.utilities.ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda86
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10255x485cd00f((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        });
    }

    static /* synthetic */ java.lang.Double lambda$secondaryContainer$74(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        double d = dynamicScheme.isDark ? 30.0d : 90.0d;
        if (isMonochrome(dynamicScheme)) {
            return java.lang.Double.valueOf(dynamicScheme.isDark ? 30.0d : 85.0d);
        }
        if (!isFidelity(dynamicScheme)) {
            return java.lang.Double.valueOf(d);
        }
        return java.lang.Double.valueOf(performAlbers(dynamicScheme.secondaryPalette.getHct(findDesiredChromaByTone(dynamicScheme.secondaryPalette.getHue(), dynamicScheme.secondaryPalette.getChroma(), d, !dynamicScheme.isDark)), dynamicScheme));
    }

    /* renamed from: lambda$secondaryContainer$75$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m10255x485cd00f(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return new com.google.android.material.color.utilities.ToneDeltaPair(secondaryContainer(), secondary(), 15.0d, com.google.android.material.color.utilities.TonePolarity.NEARER, false);
    }

    public final com.google.android.material.color.utilities.DynamicColor onSecondaryContainer() {
        return new com.google.android.material.color.utilities.DynamicColor("on_secondary_container", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda25
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).secondaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda26
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10237x4fcce1f2((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, false, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda27
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10238x2b8e5db3((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, null, new com.google.android.material.color.utilities.ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    /* renamed from: lambda$onSecondaryContainer$77$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ java.lang.Double m10237x4fcce1f2(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return java.lang.Double.valueOf(com.google.android.material.color.utilities.DynamicColor.foregroundTone(secondaryContainer().tone.apply(dynamicScheme).doubleValue(), 4.5d));
        }
        return java.lang.Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* renamed from: lambda$onSecondaryContainer$78$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.DynamicColor m10238x2b8e5db3(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return secondaryContainer();
    }

    public final com.google.android.material.color.utilities.DynamicColor tertiary() {
        return new com.google.android.material.color.utilities.DynamicColor("tertiary", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda67
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).tertiaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda68
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.lambda$tertiary$80((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, true, new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new com.google.android.material.color.utilities.ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda69
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10258x1f6aa165((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        });
    }

    static /* synthetic */ java.lang.Double lambda$tertiary$80(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return java.lang.Double.valueOf(dynamicScheme.isDark ? 90.0d : 25.0d);
        }
        return java.lang.Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* renamed from: lambda$tertiary$81$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m10258x1f6aa165(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return new com.google.android.material.color.utilities.ToneDeltaPair(tertiaryContainer(), tertiary(), 15.0d, com.google.android.material.color.utilities.TonePolarity.NEARER, false);
    }

    public final com.google.android.material.color.utilities.DynamicColor onTertiary() {
        return new com.google.android.material.color.utilities.DynamicColor("on_tertiary", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda107
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).tertiaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda118
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.lambda$onTertiary$83((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, false, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda129
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10243x36068449((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, null, new com.google.android.material.color.utilities.ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    static /* synthetic */ java.lang.Double lambda$onTertiary$83(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return java.lang.Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
        }
        return java.lang.Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* renamed from: lambda$onTertiary$84$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.DynamicColor m10243x36068449(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return tertiary();
    }

    public final com.google.android.material.color.utilities.DynamicColor tertiaryContainer() {
        return new com.google.android.material.color.utilities.DynamicColor("tertiary_container", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda159
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).tertiaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda160
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.lambda$tertiaryContainer$86((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, true, new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new com.google.android.material.color.utilities.ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda161
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10259x357de1a8((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        });
    }

    static /* synthetic */ java.lang.Double lambda$tertiaryContainer$86(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return java.lang.Double.valueOf(dynamicScheme.isDark ? 60.0d : 49.0d);
        }
        if (isFidelity(dynamicScheme)) {
            return java.lang.Double.valueOf(com.google.android.material.color.utilities.DislikeAnalyzer.fixIfDisliked(dynamicScheme.tertiaryPalette.getHct(performAlbers(dynamicScheme.tertiaryPalette.getHct(dynamicScheme.sourceColorHct.getTone()), dynamicScheme))).getTone());
        }
        return java.lang.Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* renamed from: lambda$tertiaryContainer$87$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m10259x357de1a8(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return new com.google.android.material.color.utilities.ToneDeltaPair(tertiaryContainer(), tertiary(), 15.0d, com.google.android.material.color.utilities.TonePolarity.NEARER, false);
    }

    public final com.google.android.material.color.utilities.DynamicColor onTertiaryContainer() {
        return new com.google.android.material.color.utilities.DynamicColor("on_tertiary_container", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda21
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).tertiaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda23
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10244xb5c66ea9((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, false, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda24
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10245x9867113f((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, null, new com.google.android.material.color.utilities.ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    /* renamed from: lambda$onTertiaryContainer$89$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ java.lang.Double m10244xb5c66ea9(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return java.lang.Double.valueOf(dynamicScheme.isDark ? 0.0d : 100.0d);
        }
        if (isFidelity(dynamicScheme)) {
            return java.lang.Double.valueOf(com.google.android.material.color.utilities.DynamicColor.foregroundTone(tertiaryContainer().tone.apply(dynamicScheme).doubleValue(), 4.5d));
        }
        return java.lang.Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* renamed from: lambda$onTertiaryContainer$90$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.DynamicColor m10245x9867113f(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return tertiaryContainer();
    }

    public final com.google.android.material.color.utilities.DynamicColor error() {
        return new com.google.android.material.color.utilities.DynamicColor("error", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda32
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).errorPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda34
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 80.0d : 40.0d);
                return valueOf;
            }
        }, true, new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new com.google.android.material.color.utilities.ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda35
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10222x590ec46a((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        });
    }

    /* renamed from: lambda$error$93$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m10222x590ec46a(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return new com.google.android.material.color.utilities.ToneDeltaPair(errorContainer(), error(), 15.0d, com.google.android.material.color.utilities.TonePolarity.NEARER, false);
    }

    public final com.google.android.material.color.utilities.DynamicColor onError() {
        return new com.google.android.material.color.utilities.DynamicColor("on_error", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda130
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).errorPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda131
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 20.0d : 100.0d);
                return valueOf;
            }
        }, false, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda132
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10227xb6a5d3ac((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, null, new com.google.android.material.color.utilities.ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    /* renamed from: lambda$onError$96$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.DynamicColor m10227xb6a5d3ac(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return error();
    }

    public final com.google.android.material.color.utilities.DynamicColor errorContainer() {
        return new com.google.android.material.color.utilities.DynamicColor("error_container", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda50
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).errorPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda51
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 30.0d : 90.0d);
                return valueOf;
            }
        }, true, new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new com.google.android.material.color.utilities.ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda52
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10223x33346ee5((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        });
    }

    /* renamed from: lambda$errorContainer$99$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m10223x33346ee5(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return new com.google.android.material.color.utilities.ToneDeltaPair(errorContainer(), error(), 15.0d, com.google.android.material.color.utilities.TonePolarity.NEARER, false);
    }

    public final com.google.android.material.color.utilities.DynamicColor onErrorContainer() {
        return new com.google.android.material.color.utilities.DynamicColor("on_error_container", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda45
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).errorPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda46
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 90.0d : 10.0d);
                return valueOf;
            }
        }, false, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda47
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10228x2dffdbdb((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, null, new com.google.android.material.color.utilities.ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    /* renamed from: lambda$onErrorContainer$102$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.DynamicColor m10228x2dffdbdb(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return errorContainer();
    }

    public final com.google.android.material.color.utilities.DynamicColor primaryFixed() {
        return new com.google.android.material.color.utilities.DynamicColor("primary_fixed", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda153
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda154
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(com.google.android.material.color.utilities.MaterialDynamicColors.isMonochrome(r2) ? 40.0d : 90.0d);
                return valueOf;
            }
        }, true, new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new com.google.android.material.color.utilities.ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda155
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10252xcb141198((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        });
    }

    /* renamed from: lambda$primaryFixed$105$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m10252xcb141198(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return new com.google.android.material.color.utilities.ToneDeltaPair(primaryFixed(), primaryFixedDim(), 10.0d, com.google.android.material.color.utilities.TonePolarity.LIGHTER, true);
    }

    public final com.google.android.material.color.utilities.DynamicColor primaryFixedDim() {
        return new com.google.android.material.color.utilities.DynamicColor("primary_fixed_dim", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda156
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda157
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(com.google.android.material.color.utilities.MaterialDynamicColors.isMonochrome(r2) ? 30.0d : 80.0d);
                return valueOf;
            }
        }, true, new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new com.google.android.material.color.utilities.ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda158
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10253x8f195ac5((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        });
    }

    /* renamed from: lambda$primaryFixedDim$108$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m10253x8f195ac5(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return new com.google.android.material.color.utilities.ToneDeltaPair(primaryFixed(), primaryFixedDim(), 10.0d, com.google.android.material.color.utilities.TonePolarity.LIGHTER, true);
    }

    public final com.google.android.material.color.utilities.DynamicColor onPrimaryFixed() {
        return new com.google.android.material.color.utilities.DynamicColor("on_primary_fixed", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda28
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda29
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(com.google.android.material.color.utilities.MaterialDynamicColors.isMonochrome(r2) ? 100.0d : 10.0d);
                return valueOf;
            }
        }, false, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda30
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10232x702e4bf2((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda31
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10233x4befc7b3((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, new com.google.android.material.color.utilities.ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    /* renamed from: lambda$onPrimaryFixed$111$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.DynamicColor m10232x702e4bf2(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return primaryFixedDim();
    }

    /* renamed from: lambda$onPrimaryFixed$112$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.DynamicColor m10233x4befc7b3(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return primaryFixed();
    }

    public final com.google.android.material.color.utilities.DynamicColor onPrimaryFixedVariant() {
        return new com.google.android.material.color.utilities.DynamicColor("on_primary_fixed_variant", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda122
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda123
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(com.google.android.material.color.utilities.MaterialDynamicColors.isMonochrome(r2) ? 90.0d : 30.0d);
                return valueOf;
            }
        }, false, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda124
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10234x19d0bbbf((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda125
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10235xf5923780((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, new com.google.android.material.color.utilities.ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    /* renamed from: lambda$onPrimaryFixedVariant$115$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.DynamicColor m10234x19d0bbbf(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return primaryFixedDim();
    }

    /* renamed from: lambda$onPrimaryFixedVariant$116$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.DynamicColor m10235xf5923780(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return primaryFixed();
    }

    public final com.google.android.material.color.utilities.DynamicColor secondaryFixed() {
        return new com.google.android.material.color.utilities.DynamicColor("secondary_fixed", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda119
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).secondaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda120
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(com.google.android.material.color.utilities.MaterialDynamicColors.isMonochrome(r2) ? 80.0d : 90.0d);
                return valueOf;
            }
        }, true, new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new com.google.android.material.color.utilities.ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda121
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10256x75ece309((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        });
    }

    /* renamed from: lambda$secondaryFixed$119$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m10256x75ece309(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return new com.google.android.material.color.utilities.ToneDeltaPair(secondaryFixed(), secondaryFixedDim(), 10.0d, com.google.android.material.color.utilities.TonePolarity.LIGHTER, true);
    }

    public final com.google.android.material.color.utilities.DynamicColor secondaryFixedDim() {
        return new com.google.android.material.color.utilities.DynamicColor("secondary_fixed_dim", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda138
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).secondaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda139
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(com.google.android.material.color.utilities.MaterialDynamicColors.isMonochrome(r2) ? 70.0d : 80.0d);
                return valueOf;
            }
        }, true, new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new com.google.android.material.color.utilities.ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda141
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10257x801c242f((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        });
    }

    /* renamed from: lambda$secondaryFixedDim$122$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m10257x801c242f(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return new com.google.android.material.color.utilities.ToneDeltaPair(secondaryFixed(), secondaryFixedDim(), 10.0d, com.google.android.material.color.utilities.TonePolarity.LIGHTER, true);
    }

    public final com.google.android.material.color.utilities.DynamicColor onSecondaryFixed() {
        return new com.google.android.material.color.utilities.DynamicColor("on_secondary_fixed", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda14
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).secondaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda15
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(10.0d);
                return valueOf;
            }
        }, false, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda16
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10239xf72fd9a3((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda17
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10240xd2f15564((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, new com.google.android.material.color.utilities.ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    /* renamed from: lambda$onSecondaryFixed$125$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.DynamicColor m10239xf72fd9a3(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return secondaryFixedDim();
    }

    /* renamed from: lambda$onSecondaryFixed$126$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.DynamicColor m10240xd2f15564(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return secondaryFixed();
    }

    public final com.google.android.material.color.utilities.DynamicColor onSecondaryFixedVariant() {
        return new com.google.android.material.color.utilities.DynamicColor("on_secondary_fixed_variant", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda62
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).secondaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda63
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(com.google.android.material.color.utilities.MaterialDynamicColors.isMonochrome(r2) ? 25.0d : 30.0d);
                return valueOf;
            }
        }, false, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda64
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10241x26187114((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda65
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10242x8b913aa((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, new com.google.android.material.color.utilities.ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    /* renamed from: lambda$onSecondaryFixedVariant$129$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.DynamicColor m10241x26187114(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return secondaryFixedDim();
    }

    /* renamed from: lambda$onSecondaryFixedVariant$130$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.DynamicColor m10242x8b913aa(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return secondaryFixed();
    }

    public final com.google.android.material.color.utilities.DynamicColor tertiaryFixed() {
        return new com.google.android.material.color.utilities.DynamicColor("tertiary_fixed", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda53
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).tertiaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda54
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(com.google.android.material.color.utilities.MaterialDynamicColors.isMonochrome(r2) ? 40.0d : 90.0d);
                return valueOf;
            }
        }, true, new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new com.google.android.material.color.utilities.ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda56
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10260x59237289((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        });
    }

    /* renamed from: lambda$tertiaryFixed$133$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m10260x59237289(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return new com.google.android.material.color.utilities.ToneDeltaPair(tertiaryFixed(), tertiaryFixedDim(), 10.0d, com.google.android.material.color.utilities.TonePolarity.LIGHTER, true);
    }

    public final com.google.android.material.color.utilities.DynamicColor tertiaryFixedDim() {
        return new com.google.android.material.color.utilities.DynamicColor("tertiary_fixed_dim", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda126
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).tertiaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda127
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(com.google.android.material.color.utilities.MaterialDynamicColors.isMonochrome(r2) ? 30.0d : 80.0d);
                return valueOf;
            }
        }, true, new com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda162(this), null, new com.google.android.material.color.utilities.ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda128
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10261x24c02d4a((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        });
    }

    /* renamed from: lambda$tertiaryFixedDim$136$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m10261x24c02d4a(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return new com.google.android.material.color.utilities.ToneDeltaPair(tertiaryFixed(), tertiaryFixedDim(), 10.0d, com.google.android.material.color.utilities.TonePolarity.LIGHTER, true);
    }

    public final com.google.android.material.color.utilities.DynamicColor onTertiaryFixed() {
        return new com.google.android.material.color.utilities.DynamicColor("on_tertiary_fixed", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda87
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).tertiaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda88
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(com.google.android.material.color.utilities.MaterialDynamicColors.isMonochrome(r2) ? 100.0d : 10.0d);
                return valueOf;
            }
        }, false, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda89
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10246xfe3fcbf0((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda90
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10247xe0e06e86((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, new com.google.android.material.color.utilities.ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    /* renamed from: lambda$onTertiaryFixed$139$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.DynamicColor m10246xfe3fcbf0(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return tertiaryFixedDim();
    }

    /* renamed from: lambda$onTertiaryFixed$140$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.DynamicColor m10247xe0e06e86(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return tertiaryFixed();
    }

    public final com.google.android.material.color.utilities.DynamicColor onTertiaryFixedVariant() {
        return new com.google.android.material.color.utilities.DynamicColor("on_tertiary_fixed_variant", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda75
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).tertiaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda76
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(com.google.android.material.color.utilities.MaterialDynamicColors.isMonochrome(r2) ? 90.0d : 30.0d);
                return valueOf;
            }
        }, false, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda77
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10248x702fc122((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda78
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.MaterialDynamicColors.this.m10249x4bf13ce3((com.google.android.material.color.utilities.DynamicScheme) obj);
            }
        }, new com.google.android.material.color.utilities.ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    /* renamed from: lambda$onTertiaryFixedVariant$143$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.DynamicColor m10248x702fc122(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return tertiaryFixedDim();
    }

    /* renamed from: lambda$onTertiaryFixedVariant$144$com-google-android-material-color-utilities-MaterialDynamicColors, reason: not valid java name */
    final /* synthetic */ com.google.android.material.color.utilities.DynamicColor m10249x4bf13ce3(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return tertiaryFixed();
    }

    public final com.google.android.material.color.utilities.DynamicColor controlActivated() {
        return com.google.android.material.color.utilities.DynamicColor.fromPalette("control_activated", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda70
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda71
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 30.0d : 90.0d);
                return valueOf;
            }
        });
    }

    public final com.google.android.material.color.utilities.DynamicColor controlNormal() {
        return com.google.android.material.color.utilities.DynamicColor.fromPalette("control_normal", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda55
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda66
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 80.0d : 30.0d);
                return valueOf;
            }
        });
    }

    public final com.google.android.material.color.utilities.DynamicColor controlHighlight() {
        return new com.google.android.material.color.utilities.DynamicColor("control_highlight", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda93
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda94
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 100.0d : 0.0d);
                return valueOf;
            }
        }, false, null, null, null, null, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda95
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 0.2d : 0.12d);
                return valueOf;
            }
        });
    }

    public final com.google.android.material.color.utilities.DynamicColor textPrimaryInverse() {
        return com.google.android.material.color.utilities.DynamicColor.fromPalette("text_primary_inverse", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda36
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda37
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 10.0d : 90.0d);
                return valueOf;
            }
        });
    }

    public final com.google.android.material.color.utilities.DynamicColor textSecondaryAndTertiaryInverse() {
        return com.google.android.material.color.utilities.DynamicColor.fromPalette("text_secondary_and_tertiary_inverse", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda48
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda49
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 30.0d : 80.0d);
                return valueOf;
            }
        });
    }

    public final com.google.android.material.color.utilities.DynamicColor textPrimaryInverseDisableOnly() {
        return com.google.android.material.color.utilities.DynamicColor.fromPalette("text_primary_inverse_disable_only", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda133
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda134
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 10.0d : 90.0d);
                return valueOf;
            }
        });
    }

    public final com.google.android.material.color.utilities.DynamicColor textSecondaryAndTertiaryInverseDisabled() {
        return com.google.android.material.color.utilities.DynamicColor.fromPalette("text_secondary_and_tertiary_inverse_disabled", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda85
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda96
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 10.0d : 90.0d);
                return valueOf;
            }
        });
    }

    public final com.google.android.material.color.utilities.DynamicColor textHintInverse() {
        return com.google.android.material.color.utilities.DynamicColor.fromPalette("text_hint_inverse", new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda146
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.material.color.utilities.TonalPalette tonalPalette;
                tonalPalette = ((com.google.android.material.color.utilities.DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new java.util.function.Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda147
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Double valueOf;
                valueOf = java.lang.Double.valueOf(r2.isDark ? 10.0d : 90.0d);
                return valueOf;
            }
        });
    }

    private static com.google.android.material.color.utilities.ViewingConditions viewingConditionsForAlbers(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return com.google.android.material.color.utilities.ViewingConditions.defaultWithBackgroundLstar(dynamicScheme.isDark ? 30.0d : 80.0d);
    }

    private static boolean isFidelity(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return dynamicScheme.variant == com.google.android.material.color.utilities.Variant.FIDELITY || dynamicScheme.variant == com.google.android.material.color.utilities.Variant.CONTENT;
    }

    private static boolean isMonochrome(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        return dynamicScheme.variant == com.google.android.material.color.utilities.Variant.MONOCHROME;
    }

    static double findDesiredChromaByTone(double d, double d2, double d3, boolean z) {
        com.google.android.material.color.utilities.Hct from = com.google.android.material.color.utilities.Hct.from(d, d2, d3);
        if (from.getChroma() >= d2) {
            return d3;
        }
        com.google.android.material.color.utilities.Hct hct = from;
        double chroma = from.getChroma();
        double d4 = d3;
        while (hct.getChroma() < d2) {
            double d5 = d4 + (z ? -1.0d : 1.0d);
            com.google.android.material.color.utilities.Hct from2 = com.google.android.material.color.utilities.Hct.from(d, d2, d5);
            if (chroma > from2.getChroma() || java.lang.Math.abs(from2.getChroma() - d2) < 0.4d) {
                return d5;
            }
            if (java.lang.Math.abs(from2.getChroma() - d2) < java.lang.Math.abs(hct.getChroma() - d2)) {
                hct = from2;
            }
            chroma = java.lang.Math.max(chroma, from2.getChroma());
            d4 = d5;
        }
        return d4;
    }

    static double performAlbers(com.google.android.material.color.utilities.Hct hct, com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        com.google.android.material.color.utilities.Hct inViewingConditions = hct.inViewingConditions(viewingConditionsForAlbers(dynamicScheme));
        if (com.google.android.material.color.utilities.DynamicColor.tonePrefersLightForeground(hct.getTone()) && !com.google.android.material.color.utilities.DynamicColor.toneAllowsLightForeground(inViewingConditions.getTone())) {
            return com.google.android.material.color.utilities.DynamicColor.enableLightForeground(hct.getTone());
        }
        return com.google.android.material.color.utilities.DynamicColor.enableLightForeground(inViewingConditions.getTone());
    }
}
