package w;

import A.j;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import v.C1213c;
import v.C1214d;

/* loaded from: classes.dex */
public final class i extends F2.b {
    public static Font T(FontFamily fontFamily, int i3) {
        FontStyle fontStyle = new FontStyle((i3 & 1) != 0 ? 700 : 400, (i3 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int U2 = U(fontStyle, font.getStyle());
        for (int i4 = 1; i4 < fontFamily.getSize(); i4++) {
            Font font2 = fontFamily.getFont(i4);
            int U3 = U(fontStyle, font2.getStyle());
            if (U3 < U2) {
                font = font2;
                U2 = U3;
            }
        }
        return font;
    }

    public static int U(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // F2.b
    public final Typeface l(Context context, C1213c c1213c, Resources resources, int i3) {
        try {
            FontFamily.Builder builder = null;
            for (C1214d c1214d : c1213c.f10395a) {
                try {
                    Font build = new Font.Builder(resources, c1214d.f).setWeight(c1214d.f10397b).setSlant(c1214d.f10398c ? 1 : 0).setTtcIndex(c1214d.f10400e).setFontVariationSettings(c1214d.f10399d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(T(build2, i3).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // F2.b
    public final Typeface m(Context context, j[] jVarArr, int i3) {
        int i4;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = jVarArr.length;
            FontFamily.Builder builder = null;
            while (i4 < length) {
                j jVar = jVarArr[i4];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(jVar.f24a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    i4 = openFileDescriptor == null ? i4 + 1 : 0;
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(jVar.f26c).setSlant(jVar.f27d ? 1 : 0).setTtcIndex(jVar.f25b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder != null) {
                FontFamily build2 = builder.build();
                return new Typeface.CustomFallbackBuilder(build2).setStyle(T(build2, i3).getStyle()).build();
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    @Override // F2.b
    public final Typeface n(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // F2.b
    public final Typeface o(Context context, Resources resources, int i3, String str, int i4) {
        try {
            Font build = new Font.Builder(resources, i3).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // F2.b
    public final j r(j[] jVarArr, int i3) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
