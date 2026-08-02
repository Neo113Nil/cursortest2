package I;

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

/* loaded from: classes.dex */
public final class k extends p3.f {
    public static Font m0(FontFamily fontFamily, int i7) {
        FontStyle fontStyle = new FontStyle((i7 & 1) != 0 ? 700 : 400, (i7 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int n02 = n0(fontStyle, font.getStyle());
        for (int i8 = 1; i8 < fontFamily.getSize(); i8++) {
            Font font2 = fontFamily.getFont(i8);
            int n03 = n0(fontStyle, font2.getStyle());
            if (n03 < n02) {
                font = font2;
                n02 = n03;
            }
        }
        return font;
    }

    public static int n0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p3.f
    public final M.f G(M.f[] fVarArr, int i7) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p3.f
    public final Typeface v(Context context, H.f fVar, Resources resources, int i7) {
        try {
            FontFamily.Builder builder = null;
            for (H.g gVar : fVar.f3158a) {
                try {
                    Font build = new Font.Builder(resources, gVar.f3164f).setWeight(gVar.f3160b).setSlant(gVar.f3161c ? 1 : 0).setTtcIndex(gVar.f3163e).setFontVariationSettings(gVar.f3162d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m0(build2, i7).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p3.f
    public final Typeface w(Context context, M.f[] fVarArr, int i7) {
        int i8;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = fVarArr.length;
            FontFamily.Builder builder = null;
            while (i8 < length) {
                M.f fVar = fVarArr[i8];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(fVar.f4532a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    i8 = openFileDescriptor == null ? i8 + 1 : 0;
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(fVar.f4534c).setSlant(fVar.f4535d ? 1 : 0).setTtcIndex(fVar.f4533b).build();
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
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m0(build2, i7).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p3.f
    public final Typeface x(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p3.f
    public final Typeface y(Context context, Resources resources, int i7, String str, int i8) {
        try {
            Font build = new Font.Builder(resources, i7).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }
}
