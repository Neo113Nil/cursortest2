package x;

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
import u1.AbstractC1477a;
import w.C1501c;
import w.C1502d;

/* renamed from: x.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1534i extends AbstractC1477a {
    public static Font E(FontFamily fontFamily, int i2) {
        FontStyle fontStyle = new FontStyle((i2 & 1) != 0 ? 700 : 400, (i2 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int F2 = F(fontStyle, font.getStyle());
        for (int i3 = 1; i3 < fontFamily.getSize(); i3++) {
            Font font2 = fontFamily.getFont(i3);
            int F5 = F(fontStyle, font2.getStyle());
            if (F5 < F2) {
                font = font2;
                F2 = F5;
            }
        }
        return font;
    }

    public static int F(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // u1.AbstractC1477a
    public final Typeface f(Context context, C1501c c1501c, Resources resources, int i2) {
        try {
            FontFamily.Builder builder = null;
            for (C1502d c1502d : c1501c.f12097a) {
                try {
                    Font build = new Font.Builder(resources, c1502d.f12103f).setWeight(c1502d.f12099b).setSlant(c1502d.f12100c ? 1 : 0).setTtcIndex(c1502d.f12102e).setFontVariationSettings(c1502d.f12101d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(E(build2, i2).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // u1.AbstractC1477a
    public final Typeface g(Context context, B.i[] iVarArr, int i2) {
        int i3;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = iVarArr.length;
            FontFamily.Builder builder = null;
            while (i3 < length) {
                B.i iVar = iVarArr[i3];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(iVar.f124a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    i3 = openFileDescriptor == null ? i3 + 1 : 0;
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(iVar.f126c).setSlant(iVar.f127d ? 1 : 0).setTtcIndex(iVar.f125b).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(E(build2, i2).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // u1.AbstractC1477a
    public final Typeface h(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // u1.AbstractC1477a
    public final Typeface i(Context context, Resources resources, int i2, String str, int i3) {
        try {
            Font build = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // u1.AbstractC1477a
    public final B.i o(B.i[] iVarArr, int i2) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
