package g1;

import G4.l;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* renamed from: g1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1975i extends l {
    public static Font S(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int V4 = V(fontStyle, font.getStyle());
        for (int i5 = 1; i5 < fontFamily.getSize(); i5++) {
            Font font2 = fontFamily.getFont(i5);
            int V5 = V(fontStyle, font2.getStyle());
            if (V5 < V4) {
                font = font2;
                V4 = V5;
            }
        }
        return font;
    }

    public static int V(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final FontFamily T(k1.i[] iVarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (k1.i iVar : iVarArr) {
            if (Objects.equals(iVar.f17572a.getScheme(), "systemfont")) {
                font = U(iVar);
            } else {
                try {
                    Uri uri = iVar.f17572a;
                    str = iVar.f17576e;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e3) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(iVar.f17574c).setSlant(iVar.f17575d ? 1 : 0).setTtcIndex(iVar.f17573b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        font = ttcIndex.build();
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            if (font != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(font);
                } else {
                    builder.addFont(font);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font U(k1.i iVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // G4.l
    public final Typeface q(Context context, f1.e eVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (f1.f fVar : eVar.f16946a) {
                try {
                    Font build = new Font.Builder(resources, fVar.f).setWeight(fVar.f16948b).setSlant(fVar.f16949c ? 1 : 0).setTtcIndex(fVar.f16951e).setFontVariationSettings(fVar.f16950d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(S(build2, i).getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }

    @Override // G4.l
    public final Typeface r(Context context, k1.i[] iVarArr, int i) {
        try {
            FontFamily T4 = T(iVarArr, context.getContentResolver());
            if (T4 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(T4).setStyle(S(T4, i).getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }

    @Override // G4.l
    public final Typeface s(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily T4 = T((k1.i[]) list.get(0), contentResolver);
            if (T4 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(T4);
            for (int i5 = 1; i5 < list.size(); i5++) {
                FontFamily T5 = T((k1.i[]) list.get(i5), contentResolver);
                if (T5 != null) {
                    customFallbackBuilder.addCustomFallback(T5);
                }
            }
            return customFallbackBuilder.setStyle(S(T4, i).getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }

    @Override // G4.l
    public final Typeface t(Context context, Resources resources, int i, String str, int i5) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }
}
