package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.G;

@Deprecated
/* loaded from: classes4.dex */
final class RtspTrackTiming {
    public final long rtpTimestamp;
    public final int sequenceNumber;
    public final Uri uri;

    private RtspTrackTiming(long j, int i, Uri uri) {
        this.rtpTimestamp = j;
        this.sequenceNumber = i;
        this.uri = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d A[Catch: Exception -> 0x005c, TRY_LEAVE, TryCatch #0 {Exception -> 0x005c, blocks: (B:7:0x002e, B:19:0x007b, B:24:0x0082, B:25:0x0087, B:28:0x0088, B:29:0x008d, B:31:0x0052, B:34:0x005e, B:37:0x0069), top: B:6:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static G<RtspTrackTiming> parseTrackTiming(String str, Uri uri) throws ParserException {
        char c;
        G.a aVar = new G.a();
        String[] split = Util.split(str, ",");
        int length = split.length;
        int i = 0;
        while (i < length) {
            String str2 = split[i];
            String[] split2 = Util.split(str2, ";");
            int length2 = split2.length;
            int i2 = i;
            long j = -9223372036854775807L;
            int i3 = 0;
            Uri uri2 = null;
            int i4 = -1;
            while (i3 < length2) {
                String str3 = split2[i3];
                try {
                    String[] splitAtFirst = Util.splitAtFirst(str3, "=");
                    String str4 = splitAtFirst[0];
                    String str5 = splitAtFirst[1];
                    int hashCode = str4.hashCode();
                    String[] strArr = split;
                    int i5 = length;
                    if (hashCode == 113759) {
                        if (str4.equals("seq")) {
                            c = 1;
                            if (c != 0) {
                            }
                            i3++;
                            split = strArr;
                            length = i5;
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        i3++;
                        split = strArr;
                        length = i5;
                    } else if (hashCode != 116079) {
                        if (hashCode == 1524180539 && str4.equals("rtptime")) {
                            c = 2;
                            if (c != 0) {
                                uri2 = resolveUri(str5, uri);
                            } else if (c == 1) {
                                i4 = Integer.parseInt(str5);
                            } else {
                                if (c != 2) {
                                    throw ParserException.createForMalformedManifest(str4, null);
                                }
                                j = Long.parseLong(str5);
                            }
                            i3++;
                            split = strArr;
                            length = i5;
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        i3++;
                        split = strArr;
                        length = i5;
                    } else {
                        if (str4.equals("url")) {
                            c = 0;
                            if (c != 0) {
                            }
                            i3++;
                            split = strArr;
                            length = i5;
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        i3++;
                        split = strArr;
                        length = i5;
                    }
                } catch (Exception e) {
                    throw ParserException.createForMalformedManifest(str3, e);
                }
                throw ParserException.createForMalformedManifest(str3, e);
            }
            String[] strArr2 = split;
            int i6 = length;
            if (uri2 == null || uri2.getScheme() == null || (i4 == -1 && j == -9223372036854775807L)) {
                throw ParserException.createForMalformedManifest(str2, null);
            }
            aVar.c(new RtspTrackTiming(j, i4, uri2));
            i = i2 + 1;
            split = strArr2;
            length = i6;
        }
        return aVar.g();
    }

    @VisibleForTesting
    public static Uri resolveUri(String str, Uri uri) {
        Assertions.checkArgument(((String) Assertions.checkNotNull(uri.getScheme())).equals("rtsp"));
        Uri parse = Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        Uri parse2 = Uri.parse("rtsp://" + str);
        String uri2 = uri.toString();
        return ((String) Assertions.checkNotNull(parse2.getHost())).equals(uri.getHost()) ? parse2 : uri2.endsWith(DomExceptionUtils.SEPARATOR) ? UriUtil.resolveToUri(uri2, str) : UriUtil.resolveToUri(uri2.concat(DomExceptionUtils.SEPARATOR), str);
    }
}
