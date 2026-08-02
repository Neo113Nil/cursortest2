package com.caverock.androidsvg;

/* loaded from: classes7.dex */
public class SimpleAssetResolver extends com.caverock.androidsvg.SVGExternalFileResolver {
    private static final java.util.Set<java.lang.String> Camera2StreamConfigurationMap;
    private android.content.res.AssetManager getHighSpeedVideoFpsRangesFor;

    public SimpleAssetResolver(android.content.res.AssetManager assetManager) {
        this.getHighSpeedVideoFpsRangesFor = assetManager;
    }

    static {
        java.util.HashSet hashSet = new java.util.HashSet(8);
        Camera2StreamConfigurationMap = hashSet;
        hashSet.add(coil3.svg.internal.UtilsKt.MIME_TYPE_SVG);
        hashSet.add("image/jpeg");
        hashSet.add(androidx.media3.common.MimeTypes.IMAGE_PNG);
        hashSet.add("image/pjpeg");
        hashSet.add("image/gif");
        hashSet.add("image/bmp");
        hashSet.add("image/x-windows-bmp");
        hashSet.add("image/webp");
    }

    @Override // com.caverock.androidsvg.SVGExternalFileResolver
    public android.graphics.Typeface resolveFont(java.lang.String str, int i, java.lang.String str2) {
        try {
            try {
                android.content.res.AssetManager assetManager = this.getHighSpeedVideoFpsRangesFor;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(".ttf");
                return android.graphics.Typeface.createFromAsset(assetManager, sb.toString());
            } catch (java.lang.RuntimeException unused) {
                android.content.res.AssetManager assetManager2 = this.getHighSpeedVideoFpsRangesFor;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(".otf");
                return android.graphics.Typeface.createFromAsset(assetManager2, sb2.toString());
            }
        } catch (java.lang.RuntimeException unused2) {
            return null;
        }
    }

    @Override // com.caverock.androidsvg.SVGExternalFileResolver
    public android.graphics.Bitmap resolveImage(java.lang.String str) {
        try {
            return android.graphics.BitmapFactory.decodeStream(this.getHighSpeedVideoFpsRangesFor.open(str));
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // com.caverock.androidsvg.SVGExternalFileResolver
    public boolean isFormatSupported(java.lang.String str) {
        return Camera2StreamConfigurationMap.contains(str);
    }

    @Override // com.caverock.androidsvg.SVGExternalFileResolver
    public java.lang.String resolveCSSStyleSheet(java.lang.String str) {
        return Camera2StreamConfigurationMap(str);
    }

    private java.lang.String Camera2StreamConfigurationMap(java.lang.String str) {
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2 = null;
        try {
            inputStream = this.getHighSpeedVideoFpsRangesFor.open(str);
            try {
                java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(inputStream, java.nio.charset.Charset.forName("UTF-8"));
                char[] cArr = new char[4096];
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                for (int read = inputStreamReader.read(cArr); read > 0; read = inputStreamReader.read(cArr)) {
                    sb.append(cArr, 0, read);
                }
                java.lang.String obj = sb.toString();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused) {
                    }
                }
                return obj;
            } catch (java.io.IOException unused2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused3) {
                    }
                }
                return null;
            } catch (java.lang.Throwable th) {
                inputStream2 = inputStream;
                th = th;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (java.io.IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (java.io.IOException unused5) {
            inputStream = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }
}
