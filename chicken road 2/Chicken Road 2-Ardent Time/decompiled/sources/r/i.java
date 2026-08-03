package r;

/* loaded from: classes.dex */
public final class i extends a.AbstractC0059a {
    public static android.graphics.fonts.Font J(android.graphics.fonts.FontFamily fontFamily, int i2) {
        android.graphics.fonts.FontStyle fontStyle = new android.graphics.fonts.FontStyle((i2 & 1) != 0 ? 700 : 400, (i2 & 2) != 0 ? 1 : 0);
        android.graphics.fonts.Font font = fontFamily.getFont(0);
        int K2 = K(fontStyle, font.getStyle());
        for (int i3 = 1; i3 < fontFamily.getSize(); i3++) {
            android.graphics.fonts.Font font2 = fontFamily.getFont(i3);
            int K3 = K(fontStyle, font2.getStyle());
            if (K3 < K2) {
                font = font2;
                K2 = K3;
            }
        }
        return font;
    }

    public static int K(android.graphics.fonts.FontStyle fontStyle, android.graphics.fonts.FontStyle fontStyle2) {
        return (java.lang.Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // a.AbstractC0059a
    public final android.graphics.Typeface j(android.content.Context context, q.C0978c c0978c, android.content.res.Resources resources, int i2) {
        try {
            android.graphics.fonts.FontFamily.Builder builder = null;
            for (q.C0979d c0979d : c0978c.f8312a) {
                try {
                    android.graphics.fonts.Font build = new android.graphics.fonts.Font.Builder(resources, c0979d.f8318f).setWeight(c0979d.f8314b).setSlant(c0979d.f8315c ? 1 : 0).setTtcIndex(c0979d.f8317e).setFontVariationSettings(c0979d.f8316d).build();
                    if (builder == null) {
                        builder = new android.graphics.fonts.FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (java.io.IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            android.graphics.fonts.FontFamily build2 = builder.build();
            return new android.graphics.Typeface.CustomFallbackBuilder(build2).setStyle(J(build2, i2).getStyle()).build();
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    @Override // a.AbstractC0059a
    public final android.graphics.Typeface k(android.content.Context context, v.g[] gVarArr, int i2) {
        int i3;
        android.os.ParcelFileDescriptor openFileDescriptor;
        android.content.ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = gVarArr.length;
            android.graphics.fonts.FontFamily.Builder builder = null;
            while (i3 < length) {
                v.g gVar = gVarArr[i3];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(gVar.f8375a, "r", null);
                } catch (java.io.IOException unused) {
                }
                if (openFileDescriptor == null) {
                    i3 = openFileDescriptor == null ? i3 + 1 : 0;
                } else {
                    try {
                        android.graphics.fonts.Font build = new android.graphics.fonts.Font.Builder(openFileDescriptor).setWeight(gVar.f8377c).setSlant(gVar.f8378d ? 1 : 0).setTtcIndex(gVar.f8376b).build();
                        if (builder == null) {
                            builder = new android.graphics.fonts.FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (java.lang.Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            android.graphics.fonts.FontFamily build2 = builder.build();
            return new android.graphics.Typeface.CustomFallbackBuilder(build2).setStyle(J(build2, i2).getStyle()).build();
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    @Override // a.AbstractC0059a
    public final android.graphics.Typeface l(android.content.Context context, java.io.InputStream inputStream) {
        throw new java.lang.RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // a.AbstractC0059a
    public final android.graphics.Typeface m(android.content.Context context, android.content.res.Resources resources, int i2, java.lang.String str, int i3) {
        try {
            android.graphics.fonts.Font build = new android.graphics.fonts.Font.Builder(resources, i2).build();
            return new android.graphics.Typeface.CustomFallbackBuilder(new android.graphics.fonts.FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // a.AbstractC0059a
    public final v.g o(v.g[] gVarArr, int i2) {
        throw new java.lang.RuntimeException("Do not use this function in API 29 or later.");
    }
}
