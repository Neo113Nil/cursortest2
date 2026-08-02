package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzxm {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.common.collect.ImmutableSet zzb = com.google.common.collect.ImmutableSet.of("http", "https", "mailto", "ftp");
    private static final com.google.common.collect.ImmutableSet zzc = com.google.common.collect.ImmutableSet.of("audio/3gpp2", androidx.media3.common.MimeTypes.AUDIO_AMR_NB, "audio/aac", androidx.media3.common.MimeTypes.AUDIO_MIDI, "audio/mp3", androidx.media3.common.MimeTypes.AUDIO_MP4, androidx.media3.common.MimeTypes.AUDIO_MPEG, "audio/oga", androidx.media3.common.MimeTypes.AUDIO_OGG, androidx.media3.common.MimeTypes.AUDIO_OPUS, "audio/x-m4a", androidx.media3.common.MimeTypes.AUDIO_MATROSKA, "audio/x-wav", androidx.media3.common.MimeTypes.AUDIO_WAV, androidx.media3.common.MimeTypes.AUDIO_WEBM, "image/bmp", "image/gif", "image/jpeg", "image/jpg", androidx.media3.common.MimeTypes.IMAGE_PNG, coil3.svg.internal.UtilsKt.MIME_TYPE_SVG, "image/tiff", "image/webp", "image/x-icon", androidx.media3.common.MimeTypes.VIDEO_MPEG, androidx.media3.common.MimeTypes.VIDEO_MP4, androidx.media3.common.MimeTypes.VIDEO_OGG, androidx.media3.common.MimeTypes.VIDEO_WEBM, androidx.media3.common.MimeTypes.VIDEO_MATROSKA, "font/ttf");
    private static final com.google.common.collect.ImmutableSet zzd = com.google.common.collect.ImmutableSet.of();

    public static com.google.android.libraries.places.internal.zzxl zza(java.lang.String str, com.google.android.libraries.places.internal.zzxl zzxlVar) {
        char charAt;
        int i;
        char charAt2;
        char charAt3;
        com.google.common.collect.ImmutableSet immutableSet = zzd;
        java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(str);
        java.util.Iterator it = zzb.iterator();
        while (true) {
            if (!it.hasNext()) {
                if (lowerCase.startsWith("data:")) {
                    java.lang.String lowerCase2 = com.google.common.base.Ascii.toLowerCase(str);
                    if (lowerCase2.startsWith("data:") && lowerCase2.length() > 5) {
                        int i2 = 5;
                        while (i2 < lowerCase2.length() && (charAt3 = lowerCase2.charAt(i2)) != ';' && charAt3 != ',') {
                            i2++;
                        }
                        if (zzc.contains(lowerCase2.substring(5, i2)) && lowerCase2.startsWith(";base64,", i2) && (i = i2 + 8) < lowerCase2.length()) {
                            while (i < lowerCase2.length() && (charAt2 = lowerCase2.charAt(i)) != '=') {
                                if ((charAt2 < 'a' || charAt2 > 'z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '/')) {
                                    break;
                                }
                                i++;
                            }
                            while (i < lowerCase2.length()) {
                                if (lowerCase2.charAt(i) == '=') {
                                    i++;
                                }
                            }
                        }
                    }
                    return zzxlVar;
                }
                java.util.Iterator<E> it2 = immutableSet.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (lowerCase.startsWith(java.lang.String.valueOf(com.google.common.base.Ascii.toLowerCase(((com.google.android.libraries.places.internal.zzxh) it2.next()).name()).replace('_', '-')).concat(io.ktor.sse.ServerSentEventKt.COLON))) {
                            break;
                        }
                    } else {
                        for (int i3 = 0; i3 < str.length() && (charAt = str.charAt(i3)) != '#' && charAt != '/'; i3++) {
                            if (charAt != ':') {
                                if (charAt == '?') {
                                    break;
                                }
                            }
                        }
                    }
                }
            } else {
                if (lowerCase.startsWith(java.lang.String.valueOf((java.lang.String) it.next()).concat(io.ktor.sse.ServerSentEventKt.COLON))) {
                    break;
                }
            }
        }
        return new com.google.android.libraries.places.internal.zzxl(str);
    }
}
