package androidx.collection;

import com.facebook.internal.C0715k;
import com.facebook.internal.E;
import com.facebook.internal.n;
import com.facebook.internal.p;
import com.facebook.w;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements C0715k.a, ChunkExtractor.Factory {
    public static String a(char c, String str, StringBuilder sb) {
        sb.append(c);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, str);
        return sb2;
    }

    public static String c(Locale locale, String str, String str2, Locale locale2, String str3) {
        Intrinsics.checkNotNullExpressionValue(locale, str);
        String lowerCase = str2.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase, str3);
        return lowerCase;
    }

    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        HashSet<String> e;
        if (z) {
            com.facebook.appevents.integrity.b bVar = com.facebook.appevents.integrity.b.a;
            if (com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.integrity.b.class)) {
                return;
            }
            try {
                com.facebook.appevents.integrity.b bVar2 = com.facebook.appevents.integrity.b.a;
                bVar2.getClass();
                if (!com.facebook.internal.instrument.crashshield.a.b(bVar2)) {
                    try {
                        n k = p.k(w.b(), false);
                        if (k != null && (e = E.e(k.p)) != null) {
                            com.facebook.appevents.integrity.b.c = e;
                        }
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, bVar2);
                    }
                }
                HashSet hashSet = com.facebook.appevents.integrity.b.c;
                if (hashSet != null && !hashSet.isEmpty()) {
                    com.facebook.appevents.integrity.b.b = true;
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.a.a(th2, com.facebook.appevents.integrity.b.class);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor.Factory
    public ChunkExtractor createProgressiveMediaExtractor(int i, Format format, boolean z, List list, TrackOutput trackOutput, PlayerId playerId) {
        ChunkExtractor lambda$static$0;
        lambda$static$0 = MediaParserChunkExtractor.lambda$static$0(i, format, z, list, trackOutput, playerId);
        return lambda$static$0;
    }
}
