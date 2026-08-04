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

/* JADX INFO: loaded from: classes.dex */
public final class k extends p113p3.f {
    public static Font m0(FontFamily fontFamily, int i7) {
        FontStyle fontStyle = new FontStyle((i7 & 1) != 0 ? 700 : 400, (i7 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iN0 = n0(fontStyle, font.getStyle());
        for (int i8 = 1; i8 < fontFamily.getSize(); i8++) {
            Font font2 = fontFamily.getFont(i8);
            int iN1 = n0(fontStyle, font2.getStyle());
            if (iN1 < iN0) {
                font = font2;
                iN0 = iN1;
            }
        }
        return font;
    }

    public static int n0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p113p3.f
    public final M.f G(M.f[] fVarArr, int i7) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p113p3.f
    public final Typeface v(Context context, H.f fVar, Resources resources, int i7) {
        try {
            FontFamily.Builder builder = null;
            for (H.g gVar : fVar.f3158a) {
                try {
                    Font fontBuild = new Font.Builder(resources, gVar.f3164f).setWeight(gVar.f3160b).setSlant(gVar.f3161c ? 1 : 0).setTtcIndex(gVar.f3163e).setFontVariationSettings(gVar.f3162d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m0(fontFamilyBuild, i7).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p113p3.f
    public final Typeface w(Context context, M.f[] fVarArr, int i7) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (M.f fVar : fVarArr) {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(fVar.f4532a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                        }
                    } else {
                        try {
                            Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(fVar.f4534c).setSlant(fVar.f4535d ? 1 : 0).setTtcIndex(fVar.f4533b).build();
                            if (builder == null) {
                                builder = new FontFamily.Builder(fontBuild);
                            } else {
                                builder.addFont(fontBuild);
                            }
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m0(fontFamilyBuild, i7).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p113p3.f
    public final Typeface x(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p113p3.f
    public final Typeface y(Context context, Resources resources, int i7, String str, int i8) {
        try {
            Font fontBuild = new Font.Builder(resources, i7).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }
}
