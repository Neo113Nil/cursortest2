package Fl0;

import android.net.Uri;
import j3.u;

/* loaded from: classes8.dex */
public final class b {
    public static final long a(float f7, float f11) {
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }

    public static int b(String str) {
        int i11;
        char c11;
        if (str == null) {
            return -1;
        }
        String m11 = u.m(str);
        m11.getClass();
        switch (m11.hashCode()) {
            case -2123537834:
                i11 = 20;
                if (m11.equals("audio/eac3-joc")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -1662384011:
                i11 = 20;
                if (m11.equals("video/mp2p")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -1662384007:
                i11 = 20;
                if (m11.equals("video/mp2t")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -1662095187:
                i11 = 20;
                if (m11.equals("video/webm")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -1606874997:
                i11 = 20;
                if (m11.equals("audio/amr-wb")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -1487656890:
                i11 = 20;
                if (m11.equals("image/avif")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case -1487464693:
                i11 = 20;
                if (m11.equals("image/heic")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case -1487464690:
                i11 = 20;
                if (m11.equals("image/heif")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case -1487394660:
                i11 = 20;
                if (m11.equals("image/jpeg")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case -1487018032:
                i11 = 20;
                if (m11.equals("image/webp")) {
                    c11 = '\t';
                    break;
                }
                c11 = 65535;
                break;
            case -1248337486:
                i11 = 20;
                if (m11.equals("application/mp4")) {
                    c11 = '\n';
                    break;
                }
                c11 = 65535;
                break;
            case -1079884372:
                i11 = 20;
                if (m11.equals("video/x-msvideo")) {
                    c11 = 11;
                    break;
                }
                c11 = 65535;
                break;
            case -1004728940:
                i11 = 20;
                if (m11.equals("text/vtt")) {
                    c11 = '\f';
                    break;
                }
                c11 = 65535;
                break;
            case -879272239:
                i11 = 20;
                if (m11.equals("image/bmp")) {
                    c11 = '\r';
                    break;
                }
                c11 = 65535;
                break;
            case -879258763:
                i11 = 20;
                if (m11.equals("image/png")) {
                    c11 = 14;
                    break;
                }
                c11 = 65535;
                break;
            case -387023398:
                i11 = 20;
                if (m11.equals("audio/x-matroska")) {
                    c11 = 15;
                    break;
                }
                c11 = 65535;
                break;
            case -43467528:
                i11 = 20;
                if (m11.equals("application/webm")) {
                    c11 = 16;
                    break;
                }
                c11 = 65535;
                break;
            case 13915911:
                i11 = 20;
                if (m11.equals("video/x-flv")) {
                    c11 = 17;
                    break;
                }
                c11 = 65535;
                break;
            case 187078296:
                i11 = 20;
                if (m11.equals("audio/ac3")) {
                    c11 = 18;
                    break;
                }
                c11 = 65535;
                break;
            case 187078297:
                i11 = 20;
                if (m11.equals("audio/ac4")) {
                    c11 = 19;
                    break;
                }
                c11 = 65535;
                break;
            case 187078669:
                i11 = 20;
                if (m11.equals("audio/amr")) {
                    c11 = 20;
                    break;
                }
                c11 = 65535;
                break;
            case 187090232:
                i11 = 20;
                if (m11.equals("audio/mp4")) {
                    c11 = 21;
                    break;
                }
                c11 = 65535;
                break;
            case 187091926:
                i11 = 20;
                if (m11.equals("audio/ogg")) {
                    c11 = 22;
                    break;
                }
                c11 = 65535;
                break;
            case 187099443:
                i11 = 20;
                if (m11.equals("audio/wav")) {
                    c11 = 23;
                    break;
                }
                c11 = 65535;
                break;
            case 1331848029:
                i11 = 20;
                if (m11.equals("video/mp4")) {
                    c11 = 24;
                    break;
                }
                c11 = 65535;
                break;
            case 1503095341:
                i11 = 20;
                if (m11.equals("audio/3gpp")) {
                    c11 = 25;
                    break;
                }
                c11 = 65535;
                break;
            case 1504578661:
                i11 = 20;
                if (m11.equals("audio/eac3")) {
                    c11 = 26;
                    break;
                }
                c11 = 65535;
                break;
            case 1504619009:
                i11 = 20;
                if (m11.equals("audio/flac")) {
                    c11 = 27;
                    break;
                }
                c11 = 65535;
                break;
            case 1504824762:
                i11 = 20;
                if (m11.equals("audio/midi")) {
                    c11 = 28;
                    break;
                }
                c11 = 65535;
                break;
            case 1504831518:
                i11 = 20;
                if (m11.equals("audio/mpeg")) {
                    c11 = 29;
                    break;
                }
                c11 = 65535;
                break;
            case 1505118770:
                i11 = 20;
                if (m11.equals("audio/webm")) {
                    c11 = 30;
                    break;
                }
                c11 = 65535;
                break;
            case 2039520277:
                i11 = 20;
                if (m11.equals("video/x-matroska")) {
                    c11 = 31;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                i11 = 20;
                break;
        }
        switch (c11) {
        }
        return -1;
    }

    public static int c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static final void d() {
        throw new IllegalStateException("Size is unspecified");
    }

    public static Class e(Class cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }
}
